package p553o0oOOoo;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p630o0ooO0OO.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O0oo0o extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MagicIndicator f56013OooO00o;

    public o0O0oo0o(YlTableLayout ylTableLayout) {
        this.f56013OooO00o = ylTableLayout;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        o00O0000 o00o0001 = this.f56013OooO00o.f33629OooO0Oo;
        if (o00o0001 != null) {
            o00o0001.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        o00O0000 o00o0001 = this.f56013OooO00o.f33629OooO0Oo;
        if (o00o0001 != null) {
            o00o0001.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        o00O0000 o00o0001 = this.f56013OooO00o.f33629OooO0Oo;
        if (o00o0001 != null) {
            o00o0001.onPageSelected(i);
        }
    }
}
