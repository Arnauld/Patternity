package com.patternity.ast;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class ClassModel extends Model<ClassModel> {
    private final String qualifiedName;
    private Set<String> dependencies;
    private String outerClassName;
    private String superQualifiedName;
    private Set<String> implementQualifiedNames;

    public ClassModel(String qualifiedName) {
        super();
        this.qualifiedName = qualifiedName;
        this.implementQualifiedNames = new HashSet<String>();
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    @Override
    public ModelType getModelType() {
        return ModelType.CLASS;
    }

    public void setDependencies(Set<String> dependencies) {
        this.dependencies =  dependencies;
    }

    public Set<String> getDependencies() {
        return dependencies;
    }

    public Set<String> getImplementQualifiedNames() {
        return implementQualifiedNames;
    }

    public void declareImplements(String... implementQualifedNames) {
        for(String implementQualifedName : implementQualifedNames)
            implementQualifiedNames.add(implementQualifedName);
    }

    public String getSuperQualifiedName() {
        return superQualifiedName;
    }

    public void setSuperQualifiedName(String superQualifiedName) {
        this.superQualifiedName = superQualifiedName;
    }

    /**
     *
     * @param outerClassName
     * @see #getOuterClassName()
     */
    public void innerClassOf(String outerClassName) {
        this.outerClassName = outerClassName;
    }

    /**
     *
     * @return
     * @see #innerClassOf(String)
     */
    public String getOuterClassName() {
        return outerClassName;
    }

    @Override
    public String toString() {
        return "ClassModel{" + //
                "qualifiedName='" + qualifiedName + "'" + //
                ((outerClassName==null)?"":(", innerClassOf: " + outerClassName)) + //
                ((superQualifiedName==null)?"":(", super: " + superQualifiedName)) + //
                ((implementQualifiedNames.isEmpty())?"":(", implements: " + implementQualifiedNames)) + //
                '}';
    }
}
