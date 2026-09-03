package androidx.emoji2.text;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0o implements EmojiCompat.OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f8111OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextPaint f8112OooO00o;

    public OooO0o() {
        TextPaint textPaint = new TextPaint();
        this.f8112OooO00o = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public final boolean OooO00o(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        ThreadLocal<StringBuilder> threadLocal = f8111OooO0O0;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        TextPaint textPaint = this.f8112OooO00o;
        String string = sb.toString();
        ThreadLocal<o000OO0O.OooO0o<Rect, Rect>> threadLocal2 = p071o000O0o.OooOO0.f28167OooO00o;
        if (Build.VERSION.SDK_INT >= 23) {
            return o000O0o.OooOO0.OooO00o.OooO00o(textPaint, string);
        }
        int length = string.length();
        if (length != 1 || !Character.isWhitespace(string.charAt(0))) {
            float fMeasureText = textPaint.measureText("\udfffd");
            float fMeasureText2 = textPaint.measureText("m");
            float fMeasureText3 = textPaint.measureText(string);
            float fMeasureText4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (fMeasureText3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return false;
            }
            if (string.codePointCount(0, string.length()) > 1) {
                if (fMeasureText3 > fMeasureText2 * 2.0f) {
                    return false;
                }
                int i5 = 0;
                while (i5 < length) {
                    int iCharCount = Character.charCount(string.codePointAt(i5)) + i5;
                    fMeasureText4 += textPaint.measureText(string, i5, iCharCount);
                    i5 = iCharCount;
                }
                if (fMeasureText3 >= fMeasureText4) {
                    return false;
                }
            }
            if (fMeasureText3 == fMeasureText) {
                ThreadLocal<o000OO0O.OooO0o<Rect, Rect>> threadLocal3 = p071o000O0o.OooOO0.f28167OooO00o;
                o000OO0O.OooO0o<Rect, Rect> oooO0o = threadLocal3.get();
                if (oooO0o == null) {
                    oooO0o = new o000OO0O.OooO0o<>(new Rect(), new Rect());
                    threadLocal3.set(oooO0o);
                } else {
                    oooO0o.f28234OooO00o.setEmpty();
                    oooO0o.f28235OooO0O0.setEmpty();
                }
                textPaint.getTextBounds("\udfffd", 0, 2, oooO0o.f28234OooO00o);
                textPaint.getTextBounds(string, 0, length, oooO0o.f28235OooO0O0);
                return !oooO0o.f28234OooO00o.equals(oooO0o.f28235OooO0O0);
            }
        }
        return true;
    }
}
