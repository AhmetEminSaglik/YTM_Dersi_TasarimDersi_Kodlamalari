package com.company.patterns.behavioral.visitor.textformat.visitor;

import com.company.patterns.behavioral.visitor.textformat.documentpart.BoldText;
import com.company.patterns.behavioral.visitor.textformat.documentpart.HyperLink;
import com.company.patterns.behavioral.visitor.textformat.documentpart.PlainText;

public abstract class IVisitor {
    private String output = "";

    public String getOutput() {
        return output;
    }

    protected void setOutput(String output) {
        this.output = output;
    }

    public abstract void visit(PlainText docPart);

    public abstract void visit(BoldText docPart);

    public abstract void visit(HyperLink docPart);
    //    void visit(DocumentPart documentPart);

}
