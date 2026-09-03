package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p630o0ooO0OO.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public class MagicIndicator extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O0000 f33629OooO0Oo;

    public MagicIndicator(Context context) {
        super(context);
    }

    public o00O0000 getNavigator() {
        return this.f33629OooO0Oo;
    }

    public void setNavigator(o00O0000 o00o0001) {
        o00O0000 o00o0002 = this.f33629OooO0Oo;
        if (o00o0002 == o00o0001) {
            return;
        }
        if (o00o0002 != null) {
            o00o0002.OooO0O0();
        }
        this.f33629OooO0Oo = o00o0001;
        removeAllViews();
        if (this.f33629OooO0Oo instanceof View) {
            addView((View) this.f33629OooO0Oo, new FrameLayout.LayoutParams(-1, -1));
            this.f33629OooO0Oo.OooO00o();
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
