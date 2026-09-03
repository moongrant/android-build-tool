package p177o00Ooooo;

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
import com.app.base.fragment.room.RoomInfoMemberListFragment;
import com.app.base.fragment.room.RoomInfoMomentFragment;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.fragment.RoomEventInfoFragment;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p159o00OoOO.o000O;
import p489o0o00O.Oooo000;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes.dex */
public class oO0OO00o extends oOo00o0o {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public static final /* synthetic */ int f32907OoooooO = 0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public RtlViewPager f32908OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ViewPager2 f32909OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ArrayList<Fragment> f32910OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ArrayList<String> f32911OoooOoO = new ArrayList<>();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public RoomLoginInformation f32912OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public RoomConfiguration f32913Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f32914Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public RoomInfoProfileFragment f32915OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public RoomInfoMemberListFragment f32916OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public RoomEventInfoFragment f32917OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public Oooo000 f32918Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public RoomInfoMomentFragment f32919Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public YlTableLayout f32920o000oOoO;

    public class OooO00o extends FragmentStateAdapter {
        public OooO00o(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public final Fragment createFragment(int i) {
            if (i == 0) {
                return oO0OO00o.this.f32915OooooO0;
            }
            if (i == 1) {
                return oO0OO00o.this.f32916OooooOO;
            }
            return i == 2 ? oO0OO00o.this.f32917OooooOo : oO0OO00o.this.f32919Oooooo0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return oO0OO00o.this.f32910OoooOo0.size();
        }
    }

    public class OooO0O0 extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int[] f32922OooO00o;

        public OooO0O0(int[] iArr) {
            this.f32922OooO00o = iArr;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            super.onPageSelected(i);
            if (this.f32922OooO00o[0] != i && i == 2) {
                OooOo.OooO0O0("102007");
            }
            this.f32922OooO00o[0] = i;
            LiveEventBus.get("RoomInfoMemberFragment_HideSearch").post(Boolean.TRUE);
        }
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final int OooO0O0() {
        return R.layout.dialog_room_info_sheet;
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void OooO0OO() {
        this.f32920o000oOoO = (YlTableLayout) this.f32930Oooo0oo.findViewById(R.id.tabLayout);
        this.f32908OoooOOO = (RtlViewPager) this.f32930Oooo0oo.findViewById(R.id.viewPager);
        this.f32909OoooOOo = (ViewPager2) this.f32930Oooo0oo.findViewById(R.id.viewPager2);
        this.f32927Oooo.setVisibility(8);
        this.f32910OoooOo0 = new ArrayList<>();
        o00OO00O.f43313OooooOo.OooO00o().f43317OooO0O0.observe(getViewLifecycleOwner(), new o000O(this, 1));
        Objects.requireNonNull(RoomInfoProfileFragment.INSTANCE);
        RoomInfoProfileFragment roomInfoProfileFragment = new RoomInfoProfileFragment();
        this.f32915OooooO0 = roomInfoProfileFragment;
        this.f32910OoooOo0.add(roomInfoProfileFragment);
        RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.getInstance(this.f32912OoooOoo, this.f32913Ooooo00);
        this.f32916OooooOO = roomInfoMemberListFragment;
        this.f32910OoooOo0.add(roomInfoMemberListFragment);
        RoomEventInfoFragment roomEventInfoFragment = new RoomEventInfoFragment();
        this.f32917OooooOo = roomEventInfoFragment;
        this.f32910OoooOo0.add(roomEventInfoFragment);
        RoomInfoMomentFragment roomInfoMomentFragment = RoomInfoMomentFragment.getInstance(this.f32912OoooOoo, this.f32913Ooooo00);
        this.f32919Oooooo0 = roomInfoMomentFragment;
        this.f32910OoooOo0.add(roomInfoMomentFragment);
        this.f32909OoooOOo.setOffscreenPageLimit(2);
        this.f32909OoooOOo.setAdapter(new OooO00o(getChildFragmentManager(), getLifecycle()));
        Context context = this.f32920o000oOoO.getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(context);
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        oooO00o.OooO0O0(this.f32911OoooOoO);
        oooO00o.f32981OooO0o = OooOOO.OooO00o(R.color.color_FF5F5F5F);
        oooO00o.f32983OooO0oO = OooOOO.OooO00o(R.color.color_FFB7B7B7);
        oooO00o.OooO0Oo(this.f32909OoooOOo);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32976OooO = OooOOO.OooO00o(R.color.color_00d8c9);
        oooO00o.f32985OooOO0 = OooOo00.OooO00o(40.0f);
        oooO00o.f32986OooOO0O = OooOo00.OooO00o(3.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        oooO00o.OooO00o(this.f32920o000oOoO);
        this.f32909OoooOOo.registerOnPageChangeCallback(new OooO0O0(new int[]{-1}));
        Oooo000 oooo000 = new Oooo000();
        this.f32918Oooooo = oooo000;
        oooo000.OooO00o(this.f32908OoooOOO, "Room_Profile", "Room_Member", "Room_Events", "Room_Moments");
        this.f32918Oooooo.OooO0OO();
        this.f32909OoooOOo.requestFocus();
        this.f32909OoooOOo.setCurrentItem(this.f32914Ooooo0o);
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void OooO0Oo(@NonNull View view, int i) {
    }

    @Override // p177o00Ooooo.oOo00o0o
    public final void initData() {
        this.f32912OoooOoo = (RoomLoginInformation) getArguments().getSerializable("Room_Information_Key");
        this.f32913Ooooo00 = (RoomConfiguration) getArguments().getSerializable("Room_Configuration_Key");
        this.f32914Ooooo0o = ((Integer) getArguments().getSerializable("INDEX")).intValue();
        this.f32911OoooOoO.add(OooOOO.OooO0OO(R.string.room_room_info_profile));
        this.f32911OoooOoO.add(OooOOO.OooO0OO(R.string.Member));
        this.f32911OoooOoO.add(OooOOO.OooO0OO(R.string.Events));
        this.f32911OoooOoO.add(OooOOO.OooO0OO(R.string.moments));
    }

    @Override // p177o00Ooooo.oOo00o0o, androidx.fragment.app.OooOo00, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        LiveEventBus.get("HideKeyboard").postDelay(Boolean.TRUE, 100L);
        this.f32918Oooooo.OooO0O0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Oooo000 oooo000 = this.f32918Oooooo;
        if (oooo000 != null) {
            oooo000.OooO0OO();
        }
    }
}
