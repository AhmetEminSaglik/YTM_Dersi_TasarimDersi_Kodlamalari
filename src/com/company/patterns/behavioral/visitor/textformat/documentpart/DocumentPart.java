package com.company.patterns.behavioral.visitor.textformat.documentpart;

import com.company.patterns.behavioral.visitor.textformat.visitor.IVisitor;

public abstract class DocumentPart {
    public String text;

    public abstract void accept(IVisitor visitor);
}
