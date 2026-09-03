package p525o0o0OO0;

import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000Ooo;
import androidx.viewpager.widget.ViewPager;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.ui.view.FixedTabLayout;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.util.ArrayList;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class o00OO0OO extends o00OO0O0 {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public FixedTabLayout f53242OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public RtlViewPager f53243OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int[] f53244OooOOo = {o000000.title_room_Contribution_24hours, o000000.title_room_Contribution_7days};

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<Fragment> f53245OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public DialogInterface.OnDismissListener f53246OooOOoo;

    public class OooO00o extends o0000Ooo {
        public OooO00o(FragmentManager fragmentManager) {
            super(fragmentManager, 0);
        }

        @Override // p114o00O00o.OooO0OO
        public final int OooO0OO() {
            return o00OO0OO.this.f53245OooOOo0.size();
        }

        @Override // p114o00O00o.OooO0OO
        public final CharSequence OooO0o0(int i) {
            o00OO0OO o00oo0oo = o00OO0OO.this;
            return i < o00oo0oo.f53244OooOOo.length ? o00oo0oo.getResources().getString(o00oo0oo.f53244OooOOo[i]) : "";
        }

        @Override // androidx.fragment.app.o0000Ooo
        public final Fragment OooOOo0(int i) {
            return o00OO0OO.this.f53245OooOOo0.get(i);
        }
    }

    public class OooO0O0 implements ViewPager.OooOOO0 {
        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            o0oo0000.OooO00o.OooO0O0("102281");
        }
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final int OooO0Oo() {
        return oo0o0Oo.dialog_contril_bution_sheet;
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void OooO0o(int i, @NonNull View view) {
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void OooO0o0() {
        this.f53242OooOOOO = (FixedTabLayout) this.f53234OooO0oo.findViewById(o0OO00O.tabLayout);
        this.f53243OooOOOo = (RtlViewPager) this.f53234OooO0oo.findViewById(o0OO00O.viewPager);
        ArrayList<Fragment> arrayList = new ArrayList<>();
        this.f53245OooOOo0 = arrayList;
        arrayList.add(ContributionFragment.newInstantce(TopDataVM.TYPE_DAY));
        this.f53245OooOOo0.add(ContributionFragment.newInstantce(TopDataVM.TYPE_WEEKLY));
        this.f53243OooOOOo.setAdapter(new OooO00o(getChildFragmentManager()));
        this.f53243OooOOOo.OooO0O0(new OooO0O0());
        this.f53242OooOOOO.setupWithViewPager(this.f53243OooOOOo);
        this.f53243OooOOOo.setCurrentItem(0);
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void initData() {
    }

    @Override // androidx.fragment.app.Oooo0, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f53246OooOOoo;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.yalla.yalla.service.room.OooO00o.f24510OooO.f48639OooO0OO.setValue(Boolean.valueOf(this.f53243OooOOOo.getCurrentItem() == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24510OooO.f48639OooO0OO.getValue()).booleanValue()) {
            this.f53243OooOOOo.setCurrentItem(1);
        } else {
            this.f53243OooOOOo.setCurrentItem(0);
        }
    }
}
