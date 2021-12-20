package com.company.patterns.behavioral.visitor.textformat.documentpart;

import com.company.patterns.behavioral.visitor.textformat.documentpart.DocumentPart;
import com.company.patterns.behavioral.visitor.textformat.visitor.IVisitor;

public class PlainText extends DocumentPart {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
