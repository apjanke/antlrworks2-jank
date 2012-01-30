/*
 * [The "BSD license"]
 *  Copyright (c) 2011 Terence Parr
 *  Copyright (c) 2011 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *  1. Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.antlr.works.editor.grammar.syndiag;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet;
import org.antlr.works.editor.grammar.GrammarEditorKit;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.api.editor.settings.FontColorSettings;
import org.openide.util.Lookup;
import org.openide.util.Parameters;

/**
 *
 * @author Sam Harwell
 */
public class Diagram extends JPanel {
    private final Rule rule;
    private static Reference<FontColorSettings> weakSettings = new WeakReference<FontColorSettings>(null);

    public Diagram(Rule rule) {
        Parameters.notNull("rule", rule);
        this.rule = rule;
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setOpaque(true);
        setBackground(Color.white);
        add(rule);
    }

    public Rule getRule() {
        return rule;
    }

    public static void drawArrow(int x, int y, double theta, Graphics2D graphics) {
        Parameters.notNull("graphics", graphics);

        // push a transform so we can just draw it at position (0,0) facing right
        AffineTransform transform = graphics.getTransform();
        try {
            graphics.translate(x, y);
            graphics.rotate(theta);
            Path2D.Double path = new Path2D.Double();
            path.moveTo(-10, -3);
            path.lineTo(0, 0);
            path.lineTo(-10, 3);
            graphics.fill(path);
        } finally {
            graphics.setTransform(transform);
        }
    }

    protected static AttributeSet lookupAttributes(String category) {
        Parameters.notNull("category", category);
        FontColorSettings settings = weakSettings.get();
        if (settings == null) {
            Lookup lookup = MimeLookup.getLookup(MimePath.parse(GrammarEditorKit.GRAMMAR_MIME_TYPE));
            settings = lookup.lookup(FontColorSettings.class);
            weakSettings = new WeakReference<FontColorSettings>(settings);
        }

        return settings.getTokenFontColors(category);
    }
}
