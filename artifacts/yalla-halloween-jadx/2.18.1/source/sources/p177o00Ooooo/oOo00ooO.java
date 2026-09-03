package p177o00Ooooo;

import android.content.DialogInterface;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import com.app.base.fragment.ContributionFragment;
import com.app.base.view.FixedTabLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.util.ArrayList;
import p489o0o00O.Oooo000;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes.dex */
public class oOo00ooO extends oOo00o0o {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public RtlViewPager f32938OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ArrayList<Fragment> f32939OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int[] f32940OoooOo0 = {R.string.title_room_Contribution_24hours, R.string.title_room_Contribution_7days};

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Oooo000 f32941OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public DialogInterface.OnDismissListener f32942OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public FixedTabLayout f32943o000oOoO;

    public class OooO00o extends o00000 {
        public OooO00o(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // p105o000oo0o.o00Ooo
        public final int OooO0OO() {
            return oOo00ooO.this.f32939OoooOOo.size();
        }

        @Override // p105o000oo0o.o00Ooo
        public final CharSequence OooO0o0(int i) {
            oOo00ooO ooo00ooo = oOo00ooO.this;
            return i < ooo00ooo.f32940OoooOo0.length ? ooo00ooo.getResources().getString(oOo00ooO.this.f32940OoooOo0[i]) : "";
        }

        @Override // androidx.fragment.app.o00000
        public final Fragment OooOOOo(int i) {
            return oOo00ooO.this.f32939OoooOOo.get(i);
        }
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final int OooO0O0() {
        return R.layout.dialog_contril_bution_sheet;
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void OooO0OO() {
        this.f32943o000oOoO = (FixedTabLayout) this.f32930Oooo0oo.findViewById(R.id.tabLayout);
        this.f32938OoooOOO = (RtlViewPager) this.f32930Oooo0oo.findViewById(R.id.viewPager);
        ArrayList<Fragment> arrayList = new ArrayList<>();
        this.f32939OoooOOo = arrayList;
        arrayList.add(ContributionFragment.newInstantce(TopDataVM.TYPE_DAY));
        this.f32939OoooOOo.add(ContributionFragment.newInstantce(TopDataVM.TYPE_WEEKLY));
        this.f32938OoooOOO.setAdapter(new OooO00o(getChildFragmentManager()));
        this.f32943o000oOoO.setupWithViewPager(this.f32938OoooOOO);
        Oooo000 oooo000 = new Oooo000();
        this.f32941OoooOoO = oooo000;
        oooo000.OooO00o(this.f32938OoooOOO, "Room_Contribution_24", "Room_Contribution_7");
        this.f32941OoooOoO.OooO0OO();
        this.f32938OoooOOO.setCurrentItem(0);
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void OooO0Oo(@NonNull View view, int i) {
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void initData() {
    }

    @Override // androidx.fragment.app.OooOo00, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.f32942OoooOoo;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f32941OoooOoO.OooO0O0();
        o00O.OooO00o oooO00o = o00O.OooO00o.f43196OooO00o;
        o00O.OooO00o.f43199OooO0Oo.setValue(Boolean.valueOf(this.f32938OoooOOO.getCurrentItem() == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Oooo000 oooo000 = this.f32941OoooOoO;
        if (oooo000 != null) {
            oooo000.OooO0O0();
        }
        o00O.OooO00o oooO00o = o00O.OooO00o.f43196OooO00o;
        if (((Boolean) o00O.OooO00o.f43199OooO0Oo.getValue()).booleanValue()) {
            this.f32938OoooOOO.setCurrentItem(1);
        } else {
            this.f32938OoooOOO.setCurrentItem(0);
        }
    }
}
