package p450o0OoOooO;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.module.event.vm.EventDisplayViewModel;
import java.util.List;
import o00O00o0.OooO00o;
import p527o0o0OO0o.o000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<o000O<? extends OooO00o>> f47547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventDisplayViewModel f47548OooO0o0;

    public o0O0OOO0(List<o000O<? extends OooO00o>> list, EventDisplayViewModel eventDisplayViewModel) {
        this.f47547OooO0Oo = list;
        this.f47548OooO0o0 = eventDisplayViewModel;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        if (i >= 0 && i < this.f47547OooO0Oo.size()) {
            this.f47548OooO0o0.setSquareState(i == 0);
        }
        if (i == 1) {
            o0oo0000.OooO00o.OooO0O0("301004");
        }
    }
}
