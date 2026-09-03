package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.data.constant.LucklyPacket$Type;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.PacketHistoryFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oo000000;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/PacketHistoryActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPacketHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PacketHistoryActivity.kt\ncom/yalla/yalla/ui/activity/room/PacketHistoryActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,70:1\n22#2,2:71\n*S KotlinDebug\n*F\n+ 1 PacketHistoryActivity.kt\ncom/yalla/yalla/ui/activity/room/PacketHistoryActivity\n*L\n21#1:71,2\n*E\n"})
public final class PacketHistoryActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final /* synthetic */ int f26159OooOo00 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26160OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oo000000.class), this, null);

    public final oo000000 OooOo() {
        return (oo000000) this.f26160OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45251OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        p379o0OOoOOO.oOO00O.OooO0OO(window, 0);
        FrameLayout flHeader = OooOo().f45252OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flHeader, "flHeader");
        p379o0OOoOOO.oOO00O.OooO00o(flHeader, true, 2);
        PacketHistoryFragment.Companion companion = PacketHistoryFragment.INSTANCE;
        LucklyPacket$Type type = LucklyPacket$Type.Gift;
        companion.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        PacketHistoryFragment packetHistoryFragment = new PacketHistoryFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("type", type.getValue());
        packetHistoryFragment.setArguments(bundle2);
        LucklyPacket$Type type2 = LucklyPacket$Type.Coin;
        Intrinsics.checkNotNullParameter(type2, "type");
        PacketHistoryFragment packetHistoryFragment2 = new PacketHistoryFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("type", type2.getValue());
        packetHistoryFragment2.setArguments(bundle3);
        List listMutableListOf = CollectionsKt.mutableListOf(packetHistoryFragment, packetHistoryFragment2);
        RtlViewPager rtlViewPager = OooOo().f45254OooO0Oo;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        rtlViewPager.setAdapter(new oO0o0000(supportFragmentManager, listMutableListOf));
        Intrinsics.checkNotNullParameter(this, "context");
        o0oOo00O.o0O0O00.OooO00o oooO00o = new o0oOo00O.o0O0O00.OooO00o(this);
        oooO00o.OooO0O0(CollectionsKt.mutableListOf(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lucky_Bag_tag_Gifts), com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lucky_Bag_tag_Golds)));
        oooO00o.f56262OooO0o0 = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.white);
        oooO00o.f56264OooO0oo = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white_70);
        RtlViewPager vpPacketHistory = OooOo().f45254OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(vpPacketHistory, "vpPacketHistory");
        oooO00o.OooO0Oo(vpPacketHistory);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56265OooOO0 = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9);
        oooO00o.f56266OooOO0O = com.code.android.util.o0000O0.OooO00o(25);
        oooO00o.f56267OooOO0o = com.code.android.util.o0000O0.OooO00o(3);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        YlTableLayout tabLayout = OooOo().f45253OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        oooO00o.OooO00o(tabLayout);
        int intExtra = getIntent().getIntExtra("packet_type", type.getValue());
        LucklyPacket$Type.INSTANCE.getClass();
        if (LucklyPacket$Type.Companion.OooO00o(intExtra) == type2) {
            OooOo().f45254OooO0Oo.OooOo(1, false);
        } else {
            OooOo().f45254OooO0Oo.OooOo(0, false);
        }
    }
}
