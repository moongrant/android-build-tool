package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import org.jctools.util.Pow2;
import p017OooOoo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3375OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f3376OooO0o0;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3375OooO0Oo = getResources().getDimensionPixelOffset(OooOO0.browser_actions_context_menu_min_padding);
        this.f3376OooO0o0 = getResources().getDimensionPixelOffset(OooOO0.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f3375OooO0Oo * 2), this.f3376OooO0o0), Pow2.MAX_POW2), i2);
    }
}
