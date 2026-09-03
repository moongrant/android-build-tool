package com.yalla.yalla.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.booking.rtlviewpager.RtlViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.constant.LucklyPacket$Action;
import com.yalla.yalla.common.constant.LucklyPacket$Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.ag;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/fragment/PacketHistoryFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ag;", "", "initView", "", "position", "switchTitle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onLazyInit", "onNoDoubleClick", "Lcom/yalla/yalla/common/constant/LucklyPacket$Type;", "type", "Lcom/yalla/yalla/common/constant/LucklyPacket$Type;", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PacketHistoryFragment extends p503o0o00o00.OooO<ag> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String PacketType = "type";

    @NotNull
    private LucklyPacket$Type type = LucklyPacket$Type.Gift;

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.PacketHistoryFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final PacketHistoryFragment OooO00o(@NotNull LucklyPacket$Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            PacketHistoryFragment packetHistoryFragment = new PacketHistoryFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type.getValue());
            packetHistoryFragment.setArguments(bundle);
            return packetHistoryFragment;
        }
    }

    public static final class OooO0O0 implements ViewPager.OooOOO0 {
        public OooO0O0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            PacketHistoryFragment.this.switchTitle(i);
        }
    }

    private final void initView() {
        PacketHistoryListFragment.Companion companion = PacketHistoryListFragment.INSTANCE;
        List listMutableListOf = CollectionsKt.mutableListOf(companion.OooO00o(this.type, LucklyPacket$Action.Receive), companion.OooO00o(this.type, LucklyPacket$Action.Send));
        RtlViewPager rtlViewPager = getBinding().f48958OooO0Oo;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        rtlViewPager.setAdapter(new p462o0Ooo0o.o0000O00(childFragmentManager, listMutableListOf));
        getBinding().f48958OooO0Oo.OooO0O0(new OooO0O0());
        getBinding().f48956OooO0O0.setOnClickListener(this);
        getBinding().f48957OooO0OO.setOnClickListener(this);
        switchTitle(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchTitle(int position) {
        if (position == 0) {
            getBinding().f48956OooO0O0.setSelected(true);
            getBinding().f48956OooO0O0.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_333333));
            TextView textView = getBinding().f48956OooO0O0;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvReceived");
            com.yalla.support.common.util.o00O0O.OooO0oo(textView, com.yalla.support.common.util.OooOo00.OooO00o(40));
            getBinding().f48957OooO0OO.setSelected(false);
            getBinding().f48957OooO0OO.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.white));
            TextView textView2 = getBinding().f48957OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvSend");
            com.yalla.support.common.util.o00O0O.OooO0oo(textView2, com.yalla.support.common.util.OooOo00.OooO00o(30));
        } else {
            getBinding().f48956OooO0O0.setSelected(false);
            getBinding().f48956OooO0O0.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.white));
            TextView textView3 = getBinding().f48956OooO0O0;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvReceived");
            com.yalla.support.common.util.o00O0O.OooO0oo(textView3, com.yalla.support.common.util.OooOo00.OooO00o(30));
            getBinding().f48957OooO0OO.setSelected(true);
            getBinding().f48957OooO0OO.setTextColor(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_333333));
            TextView textView4 = getBinding().f48957OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvSend");
            com.yalla.support.common.util.o00O0O.OooO0oo(textView4, com.yalla.support.common.util.OooOo00.OooO00o(40));
        }
        getBinding().f48958OooO0Oo.OooOoO(position, true);
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LucklyPacket$Type.Companion companion = LucklyPacket$Type.INSTANCE;
        Bundle arguments = getArguments();
        this.type = companion.OooO00o(arguments != null ? arguments.getInt("type") : LucklyPacket$Type.Gift.getValue());
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
    }

    @Override // p503o0o00o00.OooO
    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onNoDoubleClick(view);
        if (Intrinsics.areEqual(view, getBinding().f48956OooO0O0)) {
            switchTitle(0);
        } else if (Intrinsics.areEqual(view, getBinding().f48957OooO0OO)) {
            switchTitle(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        switchTitle(0);
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public ag getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ag agVarInflate = ag.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(agVarInflate, "inflate(inflater, container, false)");
        return agVarInflate;
    }
}
