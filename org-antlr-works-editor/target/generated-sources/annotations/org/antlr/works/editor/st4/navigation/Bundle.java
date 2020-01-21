package org.antlr.works.editor.st4.navigation;
/** Localizable strings for {@link org.antlr.works.editor.st4.navigation}. */
class Bundle {
    /**
     * @return <i>Templates</i>
     * @see TemplatesPanel
     */
    static String HINT_templates() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_templates");
    }
    /**
     * @return <i>Parse Tree (Development)</i>
     * @see TemplateParseTreeNavigatorPanel
     */
    static String LBL_ParseTreeDefinition() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ParseTreeDefinition");
    }
    /**
     * @return <i>Templates</i>
     * @see TemplatesPanel
     */
    static String LBL_templates() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_templates");
    }
    private Bundle() {}
}
