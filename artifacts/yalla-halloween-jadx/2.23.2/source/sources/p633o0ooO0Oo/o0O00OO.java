package p633o0ooO0Oo;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p635o0ooO0o0.o0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00OO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MagicIndicator f57689OooO0Oo;

    public o0O00OO(YlTableLayout ylTableLayout) {
        this.f57689OooO0Oo = ylTableLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        o0000 o0000Var = this.f57689OooO0Oo.f33096OooO0Oo;
        if (o0000Var != null) {
            o0000Var.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        o0000 o0000Var = this.f57689OooO0Oo.f33096OooO0Oo;
        if (o0000Var != null) {
            o0000Var.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        o0000 o0000Var = this.f57689OooO0Oo.f33096OooO0Oo;
        if (o0000Var != null) {
            o0000Var.onPageSelected(i);
        }
    }
}
