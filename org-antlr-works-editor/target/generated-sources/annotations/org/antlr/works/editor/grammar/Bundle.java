package org.antlr.works.editor.grammar;
/** Localizable strings for {@link org.antlr.works.editor.grammar}. */
class Bundle {
    /**
     * @return <i>&amp;Source</i>
     * @see GrammarDataObject
     */
    static String CTL_SourceTabCaption() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SourceTabCaption");
    }
    /**
     * @return <i>Grammar Source Object</i>
     * @see GrammarDataLoader
     */
    static String GrammarLoader_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GrammarLoader_Name");
    }
    /**
     * @return <i>Grammar Files</i>
     * @see GrammarDataObject
     */
    static String GrammarResolver() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "GrammarResolver");
    }
    /**
     * @return <i>ANTLR 4 Combined Grammar</i>
     * @see package-info
     */
    static String LBL_CombinedGrammarFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_CombinedGrammarFile");
    }
    /**
     * @return <i>ANTLR 4 Lexer Grammar</i>
     * @see package-info
     */
    static String LBL_LexerGrammarFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_LexerGrammarFile");
    }
    /**
     * @return <i>ANTLR 4 Parser Grammar</i>
     * @see package-info
     */
    static String LBL_ParserGrammarFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ParserGrammarFile");
    }
    /**
     * @return <i>Go To</i>
     * @see GrammarEditorKit
     */
    static String generate_goto_popup() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "generate-goto-popup");
    }
    /**
     * @return <i>Go to Source</i>
     * @see GrammarEditorKit
     */
    static String goto_source() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "goto-source");
    }
    /**
     * @return <i>Go to Source</i>
     * @see GrammarEditorKit
     */
    static String goto_source_open_source_not_formatted() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "goto_source_open_source_not_formatted");
    }
    /**
     * @return <i>Toggle Legacy Mode</i>
     * @see GrammarEditorKit
     */
    static String toggle_legacy_mode() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "toggle-legacy-mode");
    }
    private Bundle() {}
}
