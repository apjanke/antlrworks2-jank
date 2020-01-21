package org.antlr.works.editor.grammar.debugger;
/** Localizable strings for {@link org.antlr.works.editor.grammar.debugger}. */
class Bundle {
    /**
     * @return <i>Interpret Lexer...</i>
     * @see InterpretCurrentLexerAction
     */
    static String CTL_InterpretCurrentLexerAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_InterpretCurrentLexerAction");
    }
    /**
     * @return <i>Interpret Parser...</i>
     * @see InterpretCurrentParserAction
     */
    static String CTL_InterpretCurrentParserAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_InterpretCurrentParserAction");
    }
    /**
     * @return <i>Lexer Debugger Controller</i>
     * @see LexerDebuggerControllerTopComponent
     */
    static String CTL_LexerDebuggerControllerAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_LexerDebuggerControllerAction");
    }
    /**
     * @return <i>Lexer</i>
     * @see LexerDebuggerControllerTopComponent
     */
    static String CTL_LexerDebuggerControllerTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_LexerDebuggerControllerTopComponent");
    }
    /**
     * @return <i>Parser Debugger Controller</i>
     * @see ParserDebuggerControllerTopComponent
     */
    static String CTL_ParserDebuggerControllerAction() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_ParserDebuggerControllerAction");
    }
    /**
     * @return <i>Parser</i>
     * @see ParserDebuggerControllerTopComponent
     */
    static String CTL_ParserDebuggerControllerTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_ParserDebuggerControllerTopComponent");
    }
    /**
     * @return <i>&amp;Source</i>
     * @see LexerDebuggerDataObject
     */
    static String CTL_SourceTabCaption() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SourceTabCaption");
    }
    /**
     * @return <i>&amp;Source</i>
     * @see ParserDebuggerDataObject
     */
    static String CTL_SourceTabCaption2() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SourceTabCaption2");
    }
    /**
     * @return <i>This is a lexer debugger controller window</i>
     * @see LexerDebuggerControllerTopComponent
     */
    static String HINT_LexerDebuggerControllerTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_LexerDebuggerControllerTopComponent");
    }
    /**
     * @return <i>This is a parser debugger controller window</i>
     * @see ParserDebuggerControllerTopComponent
     */
    static String HINT_ParserDebuggerControllerTopComponent() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_ParserDebuggerControllerTopComponent");
    }
    /**
     * @return <i>Parse Tree</i>
     * @see ParserDebuggerParseTreeNavigatorPanel
     */
    static String LBL_ParseTreeDefinition() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ParseTreeDefinition");
    }
    /**
     * @return <i>Lexer Debugger Source Object</i>
     * @see LexerDebuggerDataLoader
     */
    static String LexerDebuggerLoader_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LexerDebuggerLoader_Name");
    }
    /**
     * @return <i>Lexer Debugger Files</i>
     * @see LexerDebuggerDataObject
     */
    static String LexerDebuggerResolver() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LexerDebuggerResolver");
    }
    /**
     * @return <i>Parser Debugger Source Object</i>
     * @see ParserDebuggerDataLoader
     */
    static String ParserDebuggerLoader_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ParserDebuggerLoader_Name");
    }
    /**
     * @return <i>Parser Debugger Files</i>
     * @see ParserDebuggerDataObject
     */
    static String ParserDebuggerResolver() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ParserDebuggerResolver");
    }
    /**
     * @return <i>Go to Match Transition</i>
     * @see ParserDebuggerParseTreeNode
     */
    static String goto_match_transition() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "goto-match-transition");
    }
    /**
     * @return <i>Go to Rule Reference</i>
     * @see ParserDebuggerParseTreeNode
     */
    static String goto_rule_reference() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "goto-rule-reference");
    }
    private Bundle() {}
}
