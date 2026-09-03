package p446o0OoOoo0;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.module.event.vm.EventDisplayViewModel;
import java.util.List;
import p081o000OoOO.OooO;
import p508o0o0O.OooOO0O;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<OooOO0O<? extends OooO>> f46373OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventDisplayViewModel f46374OooO0o0;

    public o0O(List<OooOO0O<? extends OooO>> list, EventDisplayViewModel eventDisplayViewModel) {
        this.f46373OooO0Oo = list;
        this.f46374OooO0o0 = eventDisplayViewModel;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        if (i >= 0 && i < this.f46373OooO0Oo.size()) {
            this.f46374OooO0o0.setSquareState(i == 0);
        }
        if (i == 1) {
            o0OO000.OooO00o("301004");
        }
    }
}
