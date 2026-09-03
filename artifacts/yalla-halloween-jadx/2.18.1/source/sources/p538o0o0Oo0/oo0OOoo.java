package p538o0o0Oo0;

import androidx.viewpager.widget.ViewPager;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0OOoo implements ViewPager.OooOOO0 {
    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        if (i == 0) {
            o0O00000.OooO0OO("Moments_topics_popular");
        } else {
            if (i != 1) {
                return;
            }
            o0O00000.OooO0OO("Moments_topics_latest");
        }
    }
}
