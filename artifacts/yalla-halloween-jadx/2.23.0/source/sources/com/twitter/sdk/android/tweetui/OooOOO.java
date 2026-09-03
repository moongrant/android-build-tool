package com.twitter.sdk.android.tweetui;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22308OooO0Oo = -1;

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
        int i3 = this.f22308OooO0Oo;
        if (i3 == -1 && i == 0 && f == 0.0d) {
            this.f22308OooO0Oo = i3 + 1;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        this.f22308OooO0Oo++;
    }
}
