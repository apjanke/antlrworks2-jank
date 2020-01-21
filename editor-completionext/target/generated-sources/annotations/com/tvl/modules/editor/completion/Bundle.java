package com.tvl.modules.editor.completion;
/** Localizable strings for {@link com.tvl.modules.editor.completion}. */
class Bundle {
    /**
     * @return <i>Code Completion Window</i>
     * @see CompletionJList
     */
    static String ACSD_CompletionView() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ACSD_CompletionView");
    }
    /**
     * @return <i>Code Completion</i>
     * @see CompletionJList
     */
    static String ACSN_CompletionView() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ACSN_CompletionView");
    }
    /**
     * @return <i>No selection</i>
     * @see CompletionJList
     */
    static String ACSN_CompletionView_NoSelectedItem() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ACSN_CompletionView_NoSelectedItem");
    }
    /**
     * @param selected_completion_item selected completion item
     * @return <i>Selected code completion item </i>{@code selected_completion_item}
     * @see CompletionJList
     */
    static String ACSN_CompletionView_SelectedItem(Object selected_completion_item) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "ACSN_CompletionView_SelectedItem", selected_completion_item);
    }
    /**
     * @return <i>Go to previous page</i>
     * @see DocumentationScrollPane
     */
    static String HINT_doc_browser_back_button() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_doc_browser_back_button");
    }
    /**
     * @return <i>Go to next page</i>
     * @see DocumentationScrollPane
     */
    static String HINT_doc_browser_forward_button() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_doc_browser_forward_button");
    }
    /**
     * @return <i>Open source in editor</i>
     * @see DocumentationScrollPane
     */
    static String HINT_doc_browser_goto_source_button() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_doc_browser_goto_source_button");
    }
    /**
     * @return <i>Show documentation in external web browser</i>
     * @see DocumentationScrollPane
     */
    static String HINT_doc_browser_show_web_button() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "HINT_doc_browser_show_web_button");
    }
    /**
     * @param Additional_items_text Additional items text
     * @param Shortcut_hint Shortcut hint
     * @return {@code Additional_items_text}<i>Press </i>{@code Shortcut_hint}<i> Again for All Items</i>
     * @see CompletionLayout
     */
    static String TXT_completion_shortcut_tips(Object Additional_items_text, Object Shortcut_hint) {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "TXT_completion_shortcut_tips", Additional_items_text, Shortcut_hint);
    }
    /**
     * @return <i>No suggestions</i>
     * @see CompletionImpl
     */
    static String completion_no_suggestions() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "completion-no-suggestions");
    }
    /**
     * @return <i>Please wait...</i>
     * @see CompletionJList
     */
    static String completion_please_wait() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "completion-please-wait");
    }
    /**
     * @return <i>Complete &amp;Code...</i>
     * @see CompletionActionsMainMenu
     */
    static String completion_show_main_menu_item() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "completion-show-main_menu_item");
    }
    /**
     * @return <i>Show &amp;Documentation</i>
     * @see CompletionActionsMainMenu
     */
    static String documentation_show_main_menu_item() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "documentation-show-main_menu_item");
    }
    /**
     * @return <i>&amp;Show Method Parameters</i>
     * @see CompletionActionsMainMenu
     */
    static String tooltip_show_main_menu_item() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "tooltip-show-main_menu_item");
    }
    private Bundle() {}
}
