package org.antlr.works.editor.st4;
/** Localizable strings for {@link org.antlr.works.editor.st4}. */
class Bundle {
    /**
     * @return <i>&amp;Source</i>
     * @see StringTemplateFileTypeDataObject
     */
    static String CTL_SourceTabCaption() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "CTL_SourceTabCaption");
    }
    /**
     * @return <i>StringTemplate Group File</i>
     * @see package-info
     */
    static String LBL_GroupFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_GroupFile");
    }
    /**
     * @return <i>StringTemplate Template File</i>
     * @see package-info
     */
    static String LBL_TemplateFile() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "LBL_TemplateFile");
    }
    /**
     * @return <i>StringTemplate Source Object</i>
     * @see StringTemplateFileTypeDataLoader
     */
    static String StringTemplateLoader_Name() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "StringTemplateLoader_Name");
    }
    /**
     * @return <i>StringTemplate Files</i>
     * @see StringTemplateFileTypeDataObject
     */
    static String StringTemplateResolver() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "StringTemplateResolver");
    }
    private Bundle() {}
}
