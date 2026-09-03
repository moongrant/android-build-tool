package oO0OO;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
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
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public class OooO0o extends oO0OO.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f60372OooOo = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public YlTableLayout f60373OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ViewPager2 f60374OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList<String> f60375OooOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<Fragment> f60376OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f60377OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public RoomInfoMemberListFragment f60378OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RoomInfoProfileFragment f60379OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public RoomEventInfoFragment f60380OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public RoomInfoMomentFragment f60381OooOo0o;

    public class OooO00o extends FragmentStateAdapter {
        public OooO00o(FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public final Fragment createFragment(int i) {
            OooO0o oooO0o = OooO0o.this;
            if (i == 0) {
                return oooO0o.f60379OooOo00;
            }
            if (i == 1) {
                return oooO0o.f60378OooOo0;
            }
            return i == 2 ? oooO0o.f60380OooOo0O : oooO0o.f60381OooOo0o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return OooO0o.this.f60376OooOOo0.size();
        }
    }

    public class OooO0O0 extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ int[] f60383OooO00o;

        public OooO0O0(int[] iArr) {
            this.f60383OooO00o = iArr;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            super.onPageSelected(i);
            int[] iArr = this.f60383OooO00o;
            if (iArr[0] != i && i == 2) {
                o0OO000.OooO00o("102007");
            }
            iArr[0] = i;
            LiveEventBus.get("RoomInfoMemberFragment_HideSearch").post(Boolean.TRUE);
        }
    }

    @Override // oO0OO.OooO00o
    public final int OooO0Oo() {
        return oO00OO0O.dialog_room_info_sheet;
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o(int i, @NonNull View view) {
    }

    @Override // oO0OO.OooO00o
    public final void OooO0o0() {
        this.f60373OooOOOO = (YlTableLayout) this.f60357OooO0oo.findViewById(oO00O0oO.tabLayout);
        this.f60374OooOOOo = (ViewPager2) this.f60357OooO0oo.findViewById(oO00O0oO.viewPager2);
        this.f60354OooO.setVisibility(8);
        this.f60376OooOOo0 = new ArrayList<>();
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f24999OooO0O0.observe(getViewLifecycleOwner(), new Observer() { // from class: oO0OO.OooO0OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                String str = (String) obj;
                int i = OooO0o.f60372OooOo;
                OooO0o oooO0o = this.f60371OooO0Oo;
                oooO0o.f60356OooO0oO = str;
                TextView textView = oooO0o.f60361OooOOO;
                if (textView != null) {
                    textView.setText(str);
                }
            }
        });
        RoomInfoProfileFragment.INSTANCE.getClass();
        RoomInfoProfileFragment roomInfoProfileFragment = new RoomInfoProfileFragment();
        this.f60379OooOo00 = roomInfoProfileFragment;
        this.f60376OooOOo0.add(roomInfoProfileFragment);
        RoomInfoMemberListFragment roomInfoMemberListFragment = RoomInfoMemberListFragment.getInstance();
        this.f60378OooOo0 = roomInfoMemberListFragment;
        this.f60376OooOOo0.add(roomInfoMemberListFragment);
        RoomEventInfoFragment roomEventInfoFragment = new RoomEventInfoFragment();
        this.f60380OooOo0O = roomEventInfoFragment;
        this.f60376OooOOo0.add(roomEventInfoFragment);
        RoomInfoMomentFragment roomInfoMomentFragment = RoomInfoMomentFragment.getInstance();
        this.f60381OooOo0o = roomInfoMomentFragment;
        this.f60376OooOOo0.add(roomInfoMomentFragment);
        this.f60374OooOOOo.setOffscreenPageLimit(2);
        this.f60374OooOOOo.setAdapter(new OooO00o(getChildFragmentManager(), getLifecycle()));
        Context context = this.f60373OooOOOO.getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(context);
        oooO00o.f56019OooO0OO = 16.0f;
        oooO00o.f56020OooO0Oo = 16.0f;
        oooO00o.OooO0O0(this.f60375OooOOo);
        oooO00o.f56022OooO0o0 = o0000.OooO00o(oO00O0o.color_FF5F5F5F);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_FFB7B7B7);
        oooO00o.OooO0OO(this.f60374OooOOOo);
        oooO00o.f56016OooO = 5.0f;
        oooO00o.f56025OooOO0 = o0000.OooO00o(oO00O0o.color_00d8c9);
        oooO00o.f56026OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56027OooOO0o = o0000O0.OooO00o(3);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(this.f60373OooOOOO);
        this.f60374OooOOOo.registerOnPageChangeCallback(new OooO0O0(new int[]{-1}));
        this.f60374OooOOOo.requestFocus();
        this.f60374OooOOOo.setCurrentItem(this.f60377OooOOoo);
    }

    @Override // oO0OO.OooO00o
    public final void initData() {
        this.f60377OooOOoo = ((Integer) getArguments().getSerializable("INDEX")).intValue();
        ArrayList<String> arrayList = this.f60375OooOOo;
        arrayList.add(o0000.OooO0OO(oO00OOo0.room_room_info_profile));
        arrayList.add(o0000.OooO0OO(oO00OOo0.Member));
        arrayList.add(o0000.OooO0OO(oO00OOo0.Events));
        arrayList.add(o0000.OooO0OO(oO00OOo0.moments));
    }

    @Override // oO0OO.OooO00o, androidx.fragment.app.OooOo, androidx.fragment.app.Fragment
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
        o0OO000.OooO00o("202037");
    }
}
