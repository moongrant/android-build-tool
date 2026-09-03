package p133o00OO00o;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import p105o000oo0o.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends o00Ooo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public List<View> f31188OooO0OO;

    public OooO0o(List list) {
        this.f31188OooO0OO = list;
    }

    @Override // p105o000oo0o.o00Ooo
    public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
        ((ViewPager) viewGroup).removeView((View) obj);
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        return this.f31188OooO0OO.size();
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0Oo(Object obj) {
        return -1;
    }

    @Override // p105o000oo0o.o00Ooo
    public final float OooO0o(int i) {
        return 1.0f;
    }

    @Override // p105o000oo0o.o00Ooo
    public final CharSequence OooO0o0(int i) {
        return null;
    }

    @Override // p105o000oo0o.o00Ooo
    public final Object OooO0oO(ViewGroup viewGroup, int i) {
        ((ViewPager) viewGroup).addView(this.f31188OooO0OO.get(i));
        return this.f31188OooO0OO.get(i);
    }

    @Override // p105o000oo0o.o00Ooo
    public final boolean OooO0oo(View view, Object obj) {
        return view == obj;
    }
}
