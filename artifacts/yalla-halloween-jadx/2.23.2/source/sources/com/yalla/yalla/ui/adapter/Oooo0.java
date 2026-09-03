package com.yalla.yalla.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends p114o00O00o.OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<View> f26966OooO0OO;

    public Oooo0(List list) {
        this.f26966OooO0OO = list;
    }

    @Override // p114o00O00o.OooO0OO
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        return this.f26966OooO0OO.size();
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0Oo(Object obj) {
        return -1;
    }

    @Override // p114o00O00o.OooO0OO
    public final float OooO0o(int i) {
        return 1.0f;
    }

    @Override // p114o00O00o.OooO0OO
    public final CharSequence OooO0o0(int i) {
        return null;
    }

    @Override // p114o00O00o.OooO0OO
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        List<View> list = this.f26966OooO0OO;
        ((ViewPager) viewGroup).addView(list.get(i));
        return list.get(i);
    }

    @Override // p114o00O00o.OooO0OO
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }
}
