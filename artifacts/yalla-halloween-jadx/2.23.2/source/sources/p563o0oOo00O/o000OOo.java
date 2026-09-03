package p563o0oOo00O;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p635o0ooO0o0.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MagicIndicator f56253OooO00o;

    public o000OOo(YlTableLayout ylTableLayout) {
        this.f56253OooO00o = ylTableLayout;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        o0000 o0000Var = this.f56253OooO00o.f33096OooO0Oo;
        if (o0000Var != null) {
            o0000Var.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        o0000 o0000Var = this.f56253OooO00o.f33096OooO0Oo;
        if (o0000Var != null) {
            o0000Var.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        o0000 o0000Var = this.f56253OooO00o.f33096OooO0Oo;
        if (o0000Var != null) {
            o0000Var.onPageSelected(i);
        }
    }
}
