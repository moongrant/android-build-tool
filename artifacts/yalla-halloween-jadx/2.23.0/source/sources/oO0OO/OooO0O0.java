package oO0OO;

import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import androidx.viewpager.widget.ViewPager;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.ui.view.FixedTabLayout;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.util.ArrayList;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public class OooO0O0 extends oO0OO.OooO00o {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public FixedTabLayout f60365OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RtlViewPager f60366OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int[] f60367OooOOo = {oO00OOo0.title_room_Contribution_24hours, oO00OOo0.title_room_Contribution_7days};

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<Fragment> f60368OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public DialogInterface.OnDismissListener f60369OooOOoo;

    public class OooO00o extends o00000OO {
        public OooO00o(FragmentManager fragmentManager) {
            super(fragmentManager, 0);
        }

        @Override // p082o000OoOo.OooOO0O
        public final int OooO0OO() {
            return OooO0O0.this.f60368OooOOo0.size();
        }

        @Override // p082o000OoOo.OooOO0O
        public final CharSequence OooO0o0(int i) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            return i < oooO0O0.f60367OooOOo.length ? oooO0O0.getResources().getString(oooO0O0.f60367OooOOo[i]) : "";
        }

        @Override // androidx.fragment.app.o00000OO
        public final Fragment OooOOo0(int i) {
            return OooO0O0.this.f60368OooOOo0.get(i);
        }
    }

    /* JADX INFO: renamed from: oO0OO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C0519OooO0O0 implements ViewPager.OooOOO0 {
        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            o0OO000.OooO00o("102281");
        }
    }

    @Override // oO0OO.OooO00o
    public final int OooO0Oo() {
        return oO00OO0O.dialog_contril_bution_sheet;
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o(int i, @NonNull View view) {
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o0() {
        this.f60365OooOOOO = (FixedTabLayout) this.f60357OooO0oo.findViewById(oO00O0oO.tabLayout);
        this.f60366OooOOOo = (RtlViewPager) this.f60357OooO0oo.findViewById(oO00O0oO.viewPager);
        ArrayList<Fragment> arrayList = new ArrayList<>();
        this.f60368OooOOo0 = arrayList;
        arrayList.add(ContributionFragment.newInstantce(TopDataVM.TYPE_DAY));
        this.f60368OooOOo0.add(ContributionFragment.newInstantce(TopDataVM.TYPE_WEEKLY));
        this.f60366OooOOOo.setAdapter(new OooO00o(getChildFragmentManager()));
        this.f60366OooOOOo.OooO0O0(new C0519OooO0O0());
        this.f60365OooOOOO.setupWithViewPager(this.f60366OooOOOo);
        this.f60366OooOOOo.setCurrentItem(0);
    }

    @Override // oO0OO.OooO00o
    public final void initData() {
    }

    @Override // androidx.fragment.app.OooOo, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f60369OooOOoo;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.yalla.yalla.service.room.OooO00o.f24972OooO.f47480OooO0OO.setValue(Boolean.valueOf(this.f60366OooOOOo.getCurrentItem() == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24972OooO.f47480OooO0OO.getValue()).booleanValue()) {
            this.f60366OooOOOo.setCurrentItem(1);
        } else {
            this.f60366OooOOOo.setCurrentItem(0);
        }
    }
}
