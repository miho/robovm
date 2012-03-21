/*
 * Copyright (C) 2011 The NullVM Open Source Project
 *
 * TODO: Insert proper license header.
 */
package org.nullvm.compiler.llvm;

/**
 *
 * @version $Id$
 */
public class Inttoptr extends ConversionInstruction {
    public Inttoptr(Variable result, Value op, Type type) {
        super("inttoptr", result, op, type);
    }
}