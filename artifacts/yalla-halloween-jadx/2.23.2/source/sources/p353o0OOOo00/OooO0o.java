package p353o0OOOo00;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0o extends ClickableSpan implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f42880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f42882OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f42884OooO0oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f42881OooO0o = true;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f42883OooO0oO = false;

    public OooO0o(int i, int i2) {
        this.f42882OooO0o0 = i;
        this.f42880OooO0Oo = i2;
    }

    @Override // p353o0OOOo00.OooO
    public final void OooO00o(boolean z) {
        this.f42884OooO0oo = z;
    }

    @Override // p353o0OOOo00.OooO
    public final boolean isSelected() {
        return this.f42884OooO0oo;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f42881OooO0o) {
            textPaint.setColor(this.f42880OooO0Oo);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
        if (this.f42884OooO0oo) {
            textPaint.bgColor = this.f42882OooO0o0;
        } else {
            textPaint.bgColor = 0;
        }
        if (this.f42883OooO0oO) {
            textPaint.setUnderlineText(true);
        }
    }
}
