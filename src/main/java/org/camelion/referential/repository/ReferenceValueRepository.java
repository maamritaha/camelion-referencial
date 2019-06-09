package org.camelion.referential.repository;

import java.util.Optional;

import org.camelion.referential.model.ReferenceValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository of {@link ReferenceValueEntity}.
 */
public interface ReferenceValueRepository extends JpaRepository<ReferenceValueEntity, Integer> {
    Optional<ReferenceValueEntity> findByReferenceCode(String referenceCode);
}
