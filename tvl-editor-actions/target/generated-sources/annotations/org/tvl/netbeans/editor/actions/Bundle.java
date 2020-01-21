package org.tvl.netbeans.editor.actions;
/** Localizable strings for {@link org.tvl.netbeans.editor.actions}. */
class Bundle {
    /**
     * @return <i>Insert Line Above</i>
     * @see InsertLineAboveAction
     */
    static String insert_line_above() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "insert-line-above");
    }
    /**
     * @return <i>Insert Line Below</i>
     * @see InsertLineBelowAction
     */
    static String insert_line_below() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "insert-line-below");
    }
    /**
     * @return <i>Scroll Page Down</i>
     * @see ScrollPageDownAction
     */
    static String scroll_page_down() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "scroll-page-down");
    }
    /**
     * @return <i>Scroll Page Up</i>
     * @see ScrollPageUpAction
     */
    static String scroll_page_up() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "scroll-page-up");
    }
    private Bundle() {}
}
