package p557o0oOOooO;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.foundation.layout.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO extends MetricAffectingSpan {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f56179OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f56180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f56181OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f56182OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f56183OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f56184OooO0oo;

    public oOo00ooO(String str, long j) {
        this.f56180OooO0Oo = str;
        this.f56182OooO0o0 = j;
    }

    public final int OooO00o(int i) {
        int i2 = this.f56183OooO0oO;
        int i3 = this.f56184OooO0oo;
        return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditTextSpanItem{text='");
        sb.append(this.f56180OooO0Oo);
        sb.append("', id=");
        sb.append(this.f56182OooO0o0);
        sb.append(", mFrom=");
        sb.append(this.f56183OooO0oO);
        sb.append(", mTo=");
        sb.append(this.f56184OooO0oo);
        sb.append(", maskKey=");
        return oo000o.OooO0O0(sb, this.f56179OooO, '}');
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }
}
