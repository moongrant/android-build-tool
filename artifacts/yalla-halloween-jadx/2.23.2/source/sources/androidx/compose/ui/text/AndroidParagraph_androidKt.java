package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\t\u001a\u001d\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001d\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001bH\u0002\u001a\u0014\u0010\u001c\u001a\u00020\u0006*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-u6PBz3U", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency-0_XeFpE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-4a2g8L8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-gvcdTPQ", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (!z || TextUnit.m3953equalsimpl0(textStyle.m3346getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m3953equalsimpl0(textStyle.m3346getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE()) || textStyle.m3349getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign textAlignM3349getTextAlignbuA522U = textStyle.m3349getTextAlignbuA522U();
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlignM3349getTextAlignbuA522U == null ? false : TextAlign.m3677equalsimpl0(textAlignM3349getTextAlignbuA522U.getValue(), companion.m3686getStarte0LSkKk())) {
            return false;
        }
        TextAlign textAlignM3349getTextAlignbuA522U2 = textStyle.m3349getTextAlignbuA522U();
        return !(textAlignM3349getTextAlignbuA522U2 == null ? false : TextAlign.m3677equalsimpl0(textAlignM3349getTextAlignbuA522U2.getValue(), companion.m3683getJustifye0LSkKk()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-AMY3VfE, reason: not valid java name */
    public static final int m3193toLayoutAlignAMY3VfE(TextAlign textAlign) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (textAlign == null ? false : TextAlign.m3677equalsimpl0(textAlign.getValue(), companion.m3684getLefte0LSkKk())) {
            return 3;
        }
        if (textAlign == null ? false : TextAlign.m3677equalsimpl0(textAlign.getValue(), companion.m3685getRighte0LSkKk())) {
            return 4;
        }
        if (textAlign == null ? false : TextAlign.m3677equalsimpl0(textAlign.getValue(), companion.m3681getCentere0LSkKk())) {
            return 2;
        }
        if (textAlign == null ? false : TextAlign.m3677equalsimpl0(textAlign.getValue(), companion.m3686getStarte0LSkKk())) {
            return 0;
        }
        return textAlign == null ? false : TextAlign.m3677equalsimpl0(textAlign.getValue(), companion.m3682getEnde0LSkKk()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutBreakStrategy-u6PBz3U, reason: not valid java name */
    public static final int m3194toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (strategy == null ? false : LineBreak.Strategy.m3621equalsimpl0(strategy.getValue(), companion.m3627getSimplefcGXIks())) {
            return 0;
        }
        if (strategy == null ? false : LineBreak.Strategy.m3621equalsimpl0(strategy.getValue(), companion.m3626getHighQualityfcGXIks())) {
            return 1;
        }
        return strategy == null ? false : LineBreak.Strategy.m3621equalsimpl0(strategy.getValue(), companion.m3625getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutHyphenationFrequency-0_XeFpE, reason: not valid java name */
    public static final int m3195toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (hyphens == null ? false : Hyphens.m3596equalsimpl0(hyphens.getValue(), companion.m3600getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        int iM3601getNonevmbZdU8 = companion.m3601getNonevmbZdU8();
        if (hyphens == null) {
            return 0;
        }
        Hyphens.m3596equalsimpl0(hyphens.getValue(), iM3601getNonevmbZdU8);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakStyle-4a2g8L8, reason: not valid java name */
    public static final int m3196toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (strictness == null ? false : LineBreak.Strictness.m3631equalsimpl0(strictness.getValue(), companion.m3635getDefaultusljTpc())) {
            return 0;
        }
        if (strictness == null ? false : LineBreak.Strictness.m3631equalsimpl0(strictness.getValue(), companion.m3636getLooseusljTpc())) {
            return 1;
        }
        if (strictness == null ? false : LineBreak.Strictness.m3631equalsimpl0(strictness.getValue(), companion.m3637getNormalusljTpc())) {
            return 2;
        }
        return strictness == null ? false : LineBreak.Strictness.m3631equalsimpl0(strictness.getValue(), companion.m3638getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-gvcdTPQ, reason: not valid java name */
    public static final int m3197toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        if (wordBreak == null ? false : LineBreak.WordBreak.m3642equalsimpl0(wordBreak.getValue(), companion.m3646getDefaultjp8hJ3c())) {
            return 0;
        }
        return wordBreak == null ? false : LineBreak.WordBreak.m3642equalsimpl0(wordBreak.getValue(), companion.m3647getPhrasejp8hJ3c()) ? 1 : 0;
    }
}
