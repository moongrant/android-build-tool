package p628o0ooO0O;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p630o0ooO0OO.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o0Oo0oo implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MagicIndicator f57124OooO0Oo;

    public o0Oo0oo(YlTableLayout ylTableLayout) {
        this.f57124OooO0Oo = ylTableLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        o00O0000 o00o0001 = this.f57124OooO0Oo.f33629OooO0Oo;
        if (o00o0001 != null) {
            o00o0001.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        o00O0000 o00o0001 = this.f57124OooO0Oo.f33629OooO0Oo;
        if (o00o0001 != null) {
            o00o0001.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        o00O0000 o00o0001 = this.f57124OooO0Oo.f33629OooO0Oo;
        if (o00o0001 != null) {
            o00o0001.onPageSelected(i);
        }
    }
}
