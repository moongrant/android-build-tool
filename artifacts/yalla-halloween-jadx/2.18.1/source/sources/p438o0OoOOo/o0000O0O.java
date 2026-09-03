package p438o0OoOOo;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000O0O extends ClickableSpan implements o000OO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f40103Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f40104Oooo0oO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f40106OoooO00;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f40105Oooo0oo = true;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f40102Oooo = false;

    public o0000O0O(int i, int i2) {
        this.f40104Oooo0oO = i;
        this.f40103Oooo0o = i2;
    }

    @Override // p438o0OoOOo.o000OO
    public final void OooO00o(boolean z) {
        this.f40106OoooO00 = z;
    }

    @Override // p438o0OoOOo.o000OO
    public final boolean isSelected() {
        return this.f40106OoooO00;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f40105Oooo0oo) {
            textPaint.setColor(this.f40103Oooo0o);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
        if (this.f40106OoooO00) {
            textPaint.bgColor = this.f40104Oooo0oO;
        } else {
            textPaint.bgColor = 0;
        }
        if (this.f40102Oooo) {
            textPaint.setUnderlineText(true);
        }
    }
}
