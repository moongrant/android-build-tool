package p347o0OOOOoo;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Oooo0 extends ClickableSpan implements o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f43670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f43672OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f43674OooO0oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f43671OooO0o = true;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f43673OooO0oO = false;

    public Oooo0(int i, int i2) {
        this.f43672OooO0o0 = i;
        this.f43670OooO0Oo = i2;
    }

    @Override // p347o0OOOOoo.o000oOoO
    public final void OooO00o(boolean z) {
        this.f43674OooO0oo = z;
    }

    @Override // p347o0OOOOoo.o000oOoO
    public final boolean isSelected() {
        return this.f43674OooO0oo;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f43671OooO0o) {
            textPaint.setColor(this.f43670OooO0Oo);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
        if (this.f43674OooO0oo) {
            textPaint.bgColor = this.f43672OooO0o0;
        } else {
            textPaint.bgColor = 0;
        }
        if (this.f43673OooO0oO) {
            textPaint.setUnderlineText(true);
        }
    }
}
