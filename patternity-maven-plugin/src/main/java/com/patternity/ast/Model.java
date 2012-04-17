package com.patternity.ast;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class Model<T extends Model<T>> {
    private final List<AnnotationModel> annotationModels;
    private final Modifiers modifiers = new Modifiers();

    protected Model() {
        annotationModels = new ArrayList<AnnotationModel>();
    }

    public abstract ModelType getModelType();

    public T addAnnotation(AnnotationModel annotationModel) {
        annotationModels.add(annotationModel);
        return (T) this;
    }

    public List<AnnotationModel> getAnnotationModels() {
        return annotationModels;
    }

    public Modifiers getModifiers() {
        return modifiers;
    }

}
