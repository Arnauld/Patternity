package com.patternity.ast;

/**
 *
 */
public class AnnotationModel extends Model<AnnotationModel> {

    private final String qualifiedName;
    private final boolean visibleAtRuntime;

    public AnnotationModel(String qualifiedName, boolean visibleAtRuntime) {
        this.qualifiedName = qualifiedName;
        this.visibleAtRuntime = visibleAtRuntime;
    }

    @Override
    public ModelType getModelType() {
        return ModelType.ANNOTATION;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }
}
