package it.etianus.quest.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

import it.etianus.quest.domain.enumeration.TypeEnum;

/**
 * A SchemaField.
 */
@Entity
@Table(name = "schema_field")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class SchemaField implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "code", nullable = false)
    private String code;

    @NotNull
    @Column(name = "description", nullable = false)
    private String description;

    @NotNull
    @Column(name = "field_order", nullable = false)
    private Integer fieldOrder;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "field_type", nullable = false)
    private TypeEnum fieldType;

    @Column(name = "value_list_code")
    private String valueListCode;

    @ManyToOne
    private Schema1 schema1;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public SchemaField code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public SchemaField description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFieldOrder() {
        return fieldOrder;
    }

    public SchemaField fieldOrder(Integer fieldOrder) {
        this.fieldOrder = fieldOrder;
        return this;
    }

    public void setFieldOrder(Integer fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

    public TypeEnum getFieldType() {
        return fieldType;
    }

    public SchemaField fieldType(TypeEnum fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    public void setFieldType(TypeEnum fieldType) {
        this.fieldType = fieldType;
    }

    public String getValueListCode() {
        return valueListCode;
    }

    public SchemaField valueListCode(String valueListCode) {
        this.valueListCode = valueListCode;
        return this;
    }

    public void setValueListCode(String valueListCode) {
        this.valueListCode = valueListCode;
    }

    public Schema1 getSchema1() {
        return schema1;
    }

    public SchemaField schema1(Schema1 schema1) {
        this.schema1 = schema1;
        return this;
    }

    public void setSchema1(Schema1 schema1) {
        this.schema1 = schema1;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchemaField schemaField = (SchemaField) o;
        if (schemaField.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), schemaField.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SchemaField{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", description='" + getDescription() + "'" +
            ", fieldOrder=" + getFieldOrder() +
            ", fieldType='" + getFieldType() + "'" +
            ", valueListCode='" + getValueListCode() + "'" +
            "}";
    }
}
