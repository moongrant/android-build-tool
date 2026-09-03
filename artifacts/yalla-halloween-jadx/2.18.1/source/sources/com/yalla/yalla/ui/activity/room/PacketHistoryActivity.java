package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.constant.LucklyPacket$Type;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.PacketHistoryFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p462o0Ooo0o.o0000O00;
import p478o0OooooO.oO0OoOO0;
import p649o0ooOOoo.re;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/PacketHistoryActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PacketHistoryActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22936Ooooo00 = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22937OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(re.class), this, null);

    public static final class OooO00o {
    }

    public final re OooOoo() {
        return (re) this.f22937OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50452OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        FrameLayout frameLayout = OooOoo().f50453OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flHeader");
        oO0OoOO0.OooO0O0(frameLayout, true, 2);
        PacketHistoryFragment.Companion companion = PacketHistoryFragment.INSTANCE;
        LucklyPacket$Type lucklyPacket$Type = LucklyPacket$Type.Gift;
        PacketHistoryFragment packetHistoryFragmentOooO00o = companion.OooO00o(lucklyPacket$Type);
        LucklyPacket$Type lucklyPacket$Type2 = LucklyPacket$Type.Coin;
        List listMutableListOf = CollectionsKt.mutableListOf(packetHistoryFragmentOooO00o, companion.OooO00o(lucklyPacket$Type2));
        RtlViewPager rtlViewPager = OooOoo().f50455OooO0Oo;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        rtlViewPager.setAdapter(new o0000O00(supportFragmentManager, listMutableListOf));
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.OooO0O0(CollectionsKt.mutableListOf(o000O0O0.OooO0OO(R.string.Lucky_Bag_tag_Gifts), o000O0O0.OooO0OO(R.string.Lucky_Bag_tag_Golds)));
        oooO00o.f32981OooO0o = o000O0O0.OooO00o(R.color.white);
        oooO00o.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_white_70);
        RtlViewPager rtlViewPager2 = OooOoo().f50455OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager2, "binding.vpPacketHistory");
        oooO00o.OooO0OO(rtlViewPager2);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32976OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
        oooO00o.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(25.0f);
        oooO00o.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        YlTableLayout ylTableLayout = OooOoo().f50454OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tabLayout");
        oooO00o.OooO00o(ylTableLayout);
        if (LucklyPacket$Type.INSTANCE.OooO00o(getIntent().getIntExtra("packet_type", lucklyPacket$Type.getValue())) == lucklyPacket$Type2) {
            OooOoo().f50455OooO0Oo.OooOoO(1, false);
        } else {
            OooOoo().f50455OooO0Oo.OooOoO(0, false);
        }
    }
}
