package org.camelion.referential.mapper;

import org.camelion.referential.dto.ReferenceValueDto;
import org.camelion.referential.model.ReferenceValueEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 * ReferenceValueMapper
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReferenceValueMapper {
    ReferenceValueMapper INSTANCE = Mappers.getMapper(ReferenceValueMapper.class);

    ReferenceValueDto referenceValueEntityToReferenceValueDto(ReferenceValueEntity referenceValueEntity);

    ReferenceValueEntity referenceValueDtoToReferenceValueEntity(ReferenceValueDto referenceValueDto);
}
