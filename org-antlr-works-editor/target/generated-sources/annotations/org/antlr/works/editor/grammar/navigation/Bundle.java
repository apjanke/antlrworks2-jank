package org.antlr.works.editor.grammar.navigation;
/** Localizable strings for {@link org.antlr.works.editor.grammar.navigation}. */
class Bundle {
    /**
     * @return <i>Rules</i>
     * @see GrammarRulesPanel
     */
    static String HINT_rules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_rules");
    }
    /**
     * @return <i>Lexer Rules</i>
     * @see RuleScanner
     */
    static String LBL_LexerRules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_LexerRules");
    }
    /**
     * @return <i>Parse Tree (Development)</i>
     * @see GrammarParseTreeNavigatorPanel
     */
    static String LBL_ParseTreeDefinition() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ParseTreeDefinition");
    }
    /**
     * @return <i>Parser Rules</i>
     * @see RuleScanner
     */
    static String LBL_ParserRules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ParserRules");
    }
    /**
     * @return <i>Rules</i>
     * @see GrammarRulesPanel
     */
    static String LBL_rules() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_rules");
    }
    private Bundle() {}
}
