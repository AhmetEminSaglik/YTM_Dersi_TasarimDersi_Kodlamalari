package com.company.patterns.behavioral.visitor.textformat.visitor;

import com.company.patterns.behavioral.visitor.textformat.documentpart.BoldText;
import com.company.patterns.behavioral.visitor.textformat.documentpart.HyperLink;
import com.company.patterns.behavioral.visitor.textformat.documentpart.PlainText;

public class HtmlVisitor extends IVisitor {
    @Override
    public void visit(PlainText docPart) {
        setOutput(getOutput() + "<p>" + docPart.text + "</p>\n");
    }

    @Override
    public void visit(BoldText docPart) {
        setOutput(getOutput() + "<b>" + docPart.text + "</b>\n");

    }

    @Override
    public void visit(HyperLink docPart) {
        setOutput(getOutput() + "<a href=\"" + docPart.url + "\">" + docPart.text + "</p>\n");
    }
}
