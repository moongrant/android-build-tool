package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;

/* JADX INFO: loaded from: classes.dex */
public final class o000 {
    public static void OooO00o(Cue.OooO00o oooO00o) {
        oooO00o.f6254OooOO0O = -3.4028235E38f;
        oooO00o.f6253OooOO0 = Integer.MIN_VALUE;
        CharSequence charSequence = oooO00o.f6245OooO00o;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                oooO00o.f6245OooO00o = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = oooO00o.f6245OooO00o;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float OooO0O0(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
