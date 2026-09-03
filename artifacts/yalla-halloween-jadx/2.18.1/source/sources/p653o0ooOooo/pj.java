package p653o0ooOooo;

import androidx.viewpager.widget.ViewPager;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p656o0ooo000.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class pj implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MagicIndicator f51168Oooo0o;

    public pj(MagicIndicator magicIndicator) {
        this.f51168Oooo0o = magicIndicator;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        Oooo0 oooo0 = this.f51168Oooo0o.f26417Oooo0o;
        if (oooo0 != null) {
            oooo0.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        Oooo0 oooo0 = this.f51168Oooo0o.f26417Oooo0o;
        if (oooo0 != null) {
            oooo0.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        Oooo0 oooo0 = this.f51168Oooo0o.f26417Oooo0o;
        if (oooo0 != null) {
            oooo0.onPageSelected(i);
        }
    }
}
