package com.company.patterns.behavioral.visitor.textformat;

import com.company.patterns.behavioral.visitor.textformat.documentpart.BoldText;
import com.company.patterns.behavioral.visitor.textformat.documentpart.HyperLink;
import com.company.patterns.behavioral.visitor.textformat.documentpart.PlainText;
import com.company.patterns.behavioral.visitor.textformat.visitor.HtmlVisitor;
import com.company.patterns.behavioral.visitor.textformat.visitor.IVisitor;

public class Main {
    public static void main(String[] args) {
        PlainText plainText = new PlainText();
        HyperLink hyperText = new HyperLink();
        BoldText boldText = new BoldText();

        plainText.text = "Tasarim Kaliplari, bir tecrubenin urunu olarak ortaya cikmis tekniklerdir";
        hyperText.text = "Kitap linki";
        boldText.text = "C# ile tasarim kaliplari";

        IVisitor htmlVisitor = new HtmlVisitor();
        plainText.accept(htmlVisitor);
        hyperText.accept(htmlVisitor);
        boldText.accept(htmlVisitor);
        System.out.println("Ciktiniz : \n"+htmlVisitor.getOutput());
    }
}
