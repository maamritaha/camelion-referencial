package org.camelion.referential.service;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.camelion.referential.dto.ReferenceValueDto;
import org.camelion.referential.exception.ReferenceNotFoundException;
import org.camelion.referential.mapper.ReferenceValueMapper;
import org.camelion.referential.model.ReferenceValueEntity;
import org.camelion.referential.repository.ReferenceValueRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ReferenceValueService
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ReferenceValueService {
    private final ReferenceValueRepository referenceValueRepository;

    /**
     * Get all references values.
     *
     * @return List of data.
     */
    @Transactional(readOnly = true)
    public List<ReferenceValueDto> getAllReferencesValues() {
        return referenceValueRepository.findAll().stream()
                .map(ReferenceValueMapper.INSTANCE::referenceValueEntityToReferenceValueDto)
                .collect(Collectors.toList());
    }

    /**
     * Get a single reference value.
     *
     * @param referenceCode the reference code of the requested reference value.
     *
     * @return the requested {@link ReferenceValueDto}.
     */
    @Transactional(readOnly = true)
    public ReferenceValueDto getReferenceValue(String referenceCode) throws ReferenceNotFoundException {
        ReferenceValueEntity referenceValueEntity = referenceValueRepository.findByReferenceCode(referenceCode)
                .orElseThrow(() -> new ReferenceNotFoundException());

        return ReferenceValueMapper.INSTANCE.referenceValueEntityToReferenceValueDto(referenceValueEntity);
    }
}
