package org.camelion.referential.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * ReferenceValueEntity.
 */
@Entity
@Table(name = "references_values")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = { "createdDate", "createdBy", "lastModifiedDate", "lastModifiedBy" })
@ToString
public class ReferenceValueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer referenceId;

    @Column(name = "reference_code", nullable = false)
    private String referenceCode;

    @Column(name = "description")
    private String description;

    @CreatedDate
    private Instant createdDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private Instant lastModifiedDate;
    @LastModifiedBy
    private String lastModifiedBy;
}
