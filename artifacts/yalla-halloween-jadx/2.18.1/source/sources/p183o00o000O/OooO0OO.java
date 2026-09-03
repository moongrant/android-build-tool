package p183o00o000O;

import androidx.viewpager2.widget.ViewPager2;
import net.lucode.hackware.magicindicator.MagicIndicator;
import p656o0ooo000.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MagicIndicator f32997OooO00o;

    public OooO0OO(MagicIndicator magicIndicator) {
        this.f32997OooO00o = magicIndicator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i) {
        Oooo0 oooo0 = this.f32997OooO00o.f26417Oooo0o;
        if (oooo0 != null) {
            oooo0.onPageScrollStateChanged(i);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i2) {
        super.onPageScrolled(i, f, i2);
        Oooo0 oooo0 = this.f32997OooO00o.f26417Oooo0o;
        if (oooo0 != null) {
            oooo0.onPageScrolled(i, f, i2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        Oooo0 oooo0 = this.f32997OooO00o.f26417Oooo0o;
        if (oooo0 != null) {
            oooo0.onPageSelected(i);
        }
    }
}
