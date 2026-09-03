package p591o0oOooOo;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.vm.event.EventDisplayViewModel;
import java.util.List;
import p104o000oo0O.o00O0O;
import p503o0o00o00.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class l4 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<OooO<? extends o00O0O>> f47276Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventDisplayViewModel f47277Oooo0oO;

    public l4(List<OooO<? extends o00O0O>> list, EventDisplayViewModel eventDisplayViewModel) {
        this.f47276Oooo0o = list;
        this.f47277Oooo0oO = eventDisplayViewModel;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        if (i >= 0 && i < this.f47276Oooo0o.size()) {
            this.f47277Oooo0oO.setSquareState(i == 0);
        }
    }
}
