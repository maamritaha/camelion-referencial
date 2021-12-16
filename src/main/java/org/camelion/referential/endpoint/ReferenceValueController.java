package org.camelion.referential.endpoint;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.camelion.referential.dto.ReferenceValueDto;
import org.camelion.referential.exception.ReferenceNotFoundException;
import org.camelion.referential.service.ReferenceValueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ReferenceValueController
 */
@RestController
@RequestMapping(ReferenceValueController.PATH)
@RequiredArgsConstructor
public class ReferenceValueController {

    static final String PATH = "/api/v1/entities/references-values";
    private final ReferenceValueService referenceValueService;

    @GetMapping
    public List<ReferenceValueDto> getReferencesValues() {
        return referenceValueService.getAllReferencesValues();
    }

    @GetMapping("/{referenceCode}")
    public ReferenceValueDto getReferenceValue(@PathVariable("referenceCode") String referenceCode) throws ReferenceNotFoundException {
        return referenceValueService.getReferenceValue(referenceCode);
    }
}
