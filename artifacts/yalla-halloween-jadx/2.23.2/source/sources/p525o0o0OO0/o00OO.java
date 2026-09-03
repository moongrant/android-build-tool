package p525o0o0OO0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.fragment.room.RoomEventInfoFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment;
import com.yalla.yalla.ui.fragment.room.RoomInfoProfileFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;
import p563o0oOo00O.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public class o00OO extends o00OO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f53219OooOo = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public YlTableLayout f53220OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ViewPager2 f53221OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList<String> f53222OooOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<Fragment> f53223OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f53224OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public RoomInfoMemberListFragment f53225OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RoomInfoProfileFragment f53226OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public RoomEventInfoFragment f53227OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public RoomInfoMomentFragment f53228OooOo0o;

    public class OooO00o extends FragmentStateAdapter {
        public OooO00o(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public final Fragment createFragment(int i) {
            o00OO o00oo2 = o00OO.this;
            if (i == 0) {
                return o00oo2.f53226OooOo00;
            }
            if (i == 1) {
                return o00oo2.f53225OooOo0;
            }
            return i == 2 ? o00oo2.f53227OooOo0O : o00oo2.f53228OooOo0o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return o00OO.this.f53223OooOOo0.size();
        }
    }

    public class OooO0O0 extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int[] f53230OooO00o;

        public OooO0O0(int[] iArr) {
            this.f53230OooO00o = iArr;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            super.onPageSelected(i);
            int[] iArr = this.f53230OooO00o;
            if (iArr[0] != i && i == 2) {
                o0oo0000.OooO00o.OooO0O0("102007");
            }
            iArr[0] = i;
            LiveEventBus.get("RoomInfoMemberFragment_HideSearch").post(Boolean.TRUE);
        }
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final int OooO0Oo() {
        return oo0o0Oo.dialog_room_info_sheet;
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void OooO0o(int i, @NonNull View view) {
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void OooO0o0() {
        this.f53220OooOOOO = (YlTableLayout) this.f53234OooO0oo.findViewById(o0OO00O.tabLayout);
        this.f53221OooOOOo = (ViewPager2) this.f53234OooO0oo.findViewById(o0OO00O.viewPager2);
        this.f53231OooO.setVisibility(8);
        this.f53223OooOOo0 = new ArrayList<>();
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24537OooO0O0.observe(getViewLifecycleOwner(), new oo0O(this, 0));
        RoomInfoProfileFragment.INSTANCE.getClass();
        RoomInfoProfileFragment roomInfoProfileFragment = new RoomInfoProfileFragment();
        this.f53226OooOo00 = roomInfoProfileFragment;
        this.f53223OooOOo0.add(roomInfoProfileFragment);
        RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.getInstance();
        this.f53225OooOo0 = roomInfoMemberListFragment;
        this.f53223OooOOo0.add(roomInfoMemberListFragment);
        RoomEventInfoFragment roomEventInfoFragment = new RoomEventInfoFragment();
        this.f53227OooOo0O = roomEventInfoFragment;
        this.f53223OooOOo0.add(roomEventInfoFragment);
        RoomInfoMomentFragment roomInfoMomentFragment = RoomInfoMomentFragment.getInstance();
        this.f53228OooOo0o = roomInfoMomentFragment;
        this.f53223OooOOo0.add(roomInfoMomentFragment);
        this.f53221OooOOOo.setOffscreenPageLimit(2);
        this.f53221OooOOOo.setAdapter(new OooO00o(getChildFragmentManager(), getLifecycle()));
        Context context = this.f53220OooOOOO.getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(context);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        oooO00o.OooO0O0(this.f53222OooOOo);
        oooO00o.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.color_FF5F5F5F);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_FFB7B7B7);
        oooO00o.OooO0OO(this.f53221OooOOOo);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56265OooOO0 = o0000.OooO00o(o0OOO0o.color_00d8c9);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(3);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(this.f53220OooOOOO);
        this.f53221OooOOOo.registerOnPageChangeCallback(new OooO0O0(new int[]{-1}));
        this.f53221OooOOOo.requestFocus();
        this.f53221OooOOOo.setCurrentItem(this.f53224OooOOoo);
    }

    @Override // p525o0o0OO0.o00OO0O0
    public final void initData() {
        this.f53224OooOOoo = ((Integer) getArguments().getSerializable("INDEX")).intValue();
        ArrayList<String> arrayList = this.f53222OooOOo;
        arrayList.add(o0000.OooO0OO(o000000.room_room_info_profile));
        arrayList.add(o0000.OooO0OO(o000000.Member));
        arrayList.add(o0000.OooO0OO(o000000.Events));
        arrayList.add(o0000.OooO0OO(o000000.moments));
    }

    @Override // p525o0o0OO0.o00OO0O0, androidx.fragment.app.Oooo0, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LiveEventBus.get("HideKeyboard").postDelay(Boolean.TRUE, 100L);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o0oo0000.OooO00o.OooO0O0("202037");
    }
}
