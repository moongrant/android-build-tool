package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p656o0ooo000.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public class MagicIndicator extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Oooo0 f26417Oooo0o;

    public MagicIndicator(Context context) {
        super(context);
    }

    public Oooo0 getNavigator() {
        return this.f26417Oooo0o;
    }

    public void setNavigator(Oooo0 oooo0) {
        Oooo0 oooo1 = this.f26417Oooo0o;
        if (oooo1 == oooo0) {
            return;
        }
        if (oooo1 != null) {
            oooo1.OooO0O0();
        }
        this.f26417Oooo0o = oooo0;
        removeAllViews();
        if (this.f26417Oooo0o instanceof View) {
            addView((View) this.f26417Oooo0o, new FrameLayout.LayoutParams(-1, -1));
            this.f26417Oooo0o.OooO00o();
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
