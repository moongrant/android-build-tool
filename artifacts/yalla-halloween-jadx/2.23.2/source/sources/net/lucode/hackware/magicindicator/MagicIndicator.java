package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p635o0ooO0o0.o0000;

/* JADX INFO: loaded from: classes5.dex */
public class MagicIndicator extends FrameLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000 f33096OooO0Oo;

    public MagicIndicator(Context context) {
        super(context);
    }

    public o0000 getNavigator() {
        return this.f33096OooO0Oo;
    }

    public void setNavigator(o0000 o0000Var) {
        o0000 o0000Var2 = this.f33096OooO0Oo;
        if (o0000Var2 == o0000Var) {
            return;
        }
        if (o0000Var2 != null) {
            o0000Var2.OooO0O0();
        }
        this.f33096OooO0Oo = o0000Var;
        removeAllViews();
        if (this.f33096OooO0Oo instanceof View) {
            addView((View) this.f33096OooO0Oo, new FrameLayout.LayoutParams(-1, -1));
            this.f33096OooO0Oo.OooO00o();
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
