package p439o0OoOOo0;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f40147Oooo0o = -1;

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        int i3 = this.f40147Oooo0o;
        if (i3 == -1 && i == 0 && f == 0.0d) {
            this.f40147Oooo0o = i3 + 1;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        this.f40147Oooo0o++;
    }
}
