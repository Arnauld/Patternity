package com.patternity.ast;

/**
 *
 */
public interface ClassHandler {
    void enterClass(ClassModel model);
    void dependencyOn(String name);
    void exitClass(ClassModel model);
}
