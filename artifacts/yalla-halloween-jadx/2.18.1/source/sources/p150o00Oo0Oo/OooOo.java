package p150o00Oo0Oo;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends MetricAffectingSpan {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f32171Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f32172Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f32173Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f32174Oooo0oo = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f32175OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f32176OoooO00;

    public OooOo(String str, long j) {
        this.f32172Oooo0o = str;
        this.f32173Oooo0oO = j;
    }

    public final int OooO00o(int i) {
        int i2 = this.f32171Oooo;
        int i3 = this.f32176OoooO00;
        return (i - i2) - (i3 - i) >= 0 ? i3 : i2;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("EditTextSpanItem{text='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.f32172Oooo0o, '\'', ", id=");
        sbOooO0o0.append(this.f32173Oooo0oO);
        sbOooO0o0.append(", mFrom=");
        sbOooO0o0.append(this.f32171Oooo);
        sbOooO0o0.append(", mTo=");
        sbOooO0o0.append(this.f32176OoooO00);
        sbOooO0o0.append(", maskKey=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.f32175OoooO0, '}');
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
    }
}
