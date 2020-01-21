package org.antlr.netbeans.editor.navigation;
/** Localizable strings for {@link org.antlr.netbeans.editor.navigation}. */
class Bundle {
    /**
     * @param shortcut shortcut
     * @return <i>Press </i>{@code shortcut}<i> to enlarge</i>
     * @see ToolTipManagerEx
     */
    static String HINT_EnlargeJavaDocToolip(Object shortcut) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_EnlargeJavaDocToolip", shortcut);
    }
    /**
     * @return <i>Please wait...</i>
     * @see ToolTipManagerEx
     */
    static String LBL_PleaseWait() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_PleaseWait");
    }
    /**
     * @return <i>Show Inherited</i>
     * @see Filters
     */
    static String LBL_ShowInherited() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ShowInherited");
    }
    /**
     * @return <i>Show Inherited</i>
     * @see Filters
     */
    static String LBL_ShowInheritedTip() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_ShowInheritedTip");
    }
    /**
     * @return <i>Please wait...</i>
     * @see NavigatorNode
     */
    static String LBL_WaitNode() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_WaitNode");
    }
    /**
     * @param shortcut shortcut
     * @return <i>Click or press </i>{@code shortcut}<i> to hide/show when the Navigator is active</i>
     * @see NavigatorPanelUI
     */
    static String TIP_CollapsiblePanel(Object shortcut) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TIP_CollapsiblePanel", shortcut);
    }
    private Bundle() {}
}
