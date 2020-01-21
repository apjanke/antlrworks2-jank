package org.antlr.netbeans.parsing.spi.impl;
/** Localizable strings for {@link org.antlr.netbeans.parsing.spi.impl}. */
class Bundle {
    /**
     * @return <i>Task execution failed with error.</i>
     * @see ParserTaskManagerImpl
     */
    static String taskFailedError() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "taskFailedError");
    }
    /**
     * @return <i>Task execution failed with exception.</i>
     * @see ParserTaskManagerImpl
     */
    static String taskFailedException() {
        return org.openide.util.NbBundle.getMessage(Bundle.class, "taskFailedException");
    }
    private Bundle() {}
}
