package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO implements EmojiCompat.OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f5620OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextPaint f5621OooO00o;

    public OooO() {
        TextPaint textPaint = new TextPaint();
        this.f5621OooO00o = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
