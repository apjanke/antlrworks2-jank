package org.antlr.works.editor.grammar.syndiag;
/** Localizable strings for {@link org.antlr.works.editor.grammar.syndiag}. */
class Bundle {
    /**
     * @return <i>Syntax Diagram</i>
     * @see SyntaxDiagramTopComponent
     */
    static String CTL_SyntaxDiagramAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SyntaxDiagramAction");
    }
    /**
     * @return <i>Syntax</i>
     * @see SyntaxDiagramTopComponent
     */
    static String CTL_SyntaxDiagramTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SyntaxDiagramTopComponent");
    }
    /**
     * @return <i>Grammar Rule Syntax Diagram</i>
     * @see SyntaxDiagramTopComponent
     */
    static String HINT_SyntaxDiagramTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_SyntaxDiagramTopComponent");
    }
    private Bundle() {}
}
