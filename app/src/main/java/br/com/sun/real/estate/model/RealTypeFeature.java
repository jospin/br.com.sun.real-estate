package br.com.sun.real.estate.model;

import br.com.sun.real.estate.model.enumerator.FieldType;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by lucienj on 15/03/2019.
 */
@Entity
public class RealTypeFeature {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Boolean active;
    private String label;
    @Enumerated(EnumType.STRING)
    private FieldType fieldType;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn
    private Set<FeatureValues> values;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public Set<FeatureValues> getValues() {
        return values;
    }

    public void setValues(Set<FeatureValues> values) {
        this.values = values;
    }
}
