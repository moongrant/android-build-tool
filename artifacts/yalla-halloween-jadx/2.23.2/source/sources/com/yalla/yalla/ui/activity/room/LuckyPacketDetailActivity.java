package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oOOOoo00;
import p405o0Oo0OOO.oOOo0000;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLuckyPacketDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyPacketDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,194:1\n22#2,2:195\n*S KotlinDebug\n*F\n+ 1 LuckyPacketDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity\n*L\n41#1:195,2\n*E\n"})
public final class LuckyPacketDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26104OooOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26105OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oOOOoo00.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f26106OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public oOOo0000 f26107OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f26108OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0000O0 f26109OooOo0o;

    public static final class OooO00o {
        public static void OooO00o(@NotNull FragmentActivity context, long j, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LuckyPacketDetailActivity.class);
            intent.putExtra("bonusId", j);
            intent.putExtra("BonusType", i);
            context.startActivity(intent);
        }
    }

    public final oOOOoo00 OooOo() {
        return (oOOOoo00) this.f26105OooOOoo.getValue();
    }

    public final void OooOoO0() {
        long j = this.f26106OooOo0;
        int i = this.f26108OooOo0O;
        Room.BonusDetailRequest.Builder builderNewBuilder = Room.BonusDetailRequest.newBuilder();
        builderNewBuilder.setBonustype(i);
        builderNewBuilder.setBonusid(j);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10078, builderNewBuilder.build().toByteArray());
        }
        StringsKt__StringsKt.lastIndexOf$default("23rsaff.asdfasddf", ".", 0, false, 6, (Object) null);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45181OooO00o);
        this.f26106OooOo0 = getIntent().getLongExtra("bonusId", 0L);
        this.f26108OooOo0O = getIntent().getIntExtra("BonusType", 0);
        if (this.f26106OooOo0 == 0) {
            finish();
        } else {
            OooOoO0();
        }
        if (this.f26108OooOo0O == 2) {
            OooOOoo(p562o0oOo000.o000000.Lucky_Bag_tag_Gifts);
        } else {
            OooOOoo(p562o0oOo000.o000000.Lucky_Bag_tag_Golds);
        }
        oOOo0000 oooo0000Inflate = oOOo0000.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(oooo0000Inflate, "inflate(...)");
        this.f26107OooOo00 = oooo0000Inflate;
        OooOo().f45184OooO0Oo.setOnRefreshListener(new androidx.compose.ui.graphics.colorspace.OooO0O0(this));
        o0000O0 o0000o1 = new o0000O0(this, p562o0oOo000.oo0o0Oo.room_activity_lucky_packet_detail_item_layout);
        this.f26109OooOo0o = o0000o1;
        oOOo0000 oooo0000 = this.f26107OooOo00;
        o0000O0 o0000o2 = null;
        if (oooo0000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            oooo0000 = null;
        }
        o0000o1.OooO0o0(oooo0000.f45186OooO0O0, -1);
        OooOo().f45183OooO0OO.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f45183OooO0OO;
        o0000O0 o0000o3 = this.f26109OooOo0o;
        if (o0000o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000o3 = null;
        }
        recyclerView.setAdapter(o0000o3);
        o0000O0 o0000o4 = this.f26109OooOo0o;
        if (o0000o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000o4 = null;
        }
        o0000o4.Oooo0OO(new o0000O0O(this));
        o0000O0 o0000o5 = this.f26109OooOo0o;
        if (o0000o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000o5 = null;
        }
        o0000o5.Oooo000(p562o0oOo000.o000000.lucky_packet_detail_no_data);
        o0000O0 o0000o6 = this.f26109OooOo0o;
        if (o0000o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o0000o2 = o0000o6;
        }
        o0000o2.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_moment);
        LiveEventBus.get("LuckyPacket_Detail").observe(this, new Observer() { // from class: com.yalla.yalla.ui.activity.room.o0000oo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i = LuckyPacketDetailActivity.f26104OooOo;
                LuckyPacketDetailActivity this$0 = this.f26387OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.BonusDetailReply");
                Room.BonusDetailReply bonusDetailReply = (Room.BonusDetailReply) obj;
                this$0.getClass();
                if (bonusDetailReply != null) {
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this$0);
                    oooO00o.OooO00o(d1.OooO00o());
                    oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(bonusDetailReply.getFromuseravatar());
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0Oo(this$0.OooOo().f45182OooO0O0.f45177OooO0O0);
                    if (bonusDetailReply.getBonustype() == 2) {
                        this$0.OooOo().f45182OooO0O0.f45178OooO0OO.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lucky_Bag_Gifts_from_XXX), bonusDetailReply.getFromusername()));
                        o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(this$0);
                        oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(bonusDetailReply.getGiftimg());
                        oooO00o2.f43124OooO00o = 0;
                        oooO00o2.f43138OooOOOo = p562o0oOo000.o0Oo0oo.room_dialog_lucky_golds_send_gift_item_default;
                        oooO00o2.OooO0Oo(this$0.OooOo().f45182OooO0O0.f45180OooO0o0);
                        this$0.OooOo().f45182OooO0O0.f45179OooO0Oo.setText(com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
                    } else {
                        this$0.OooOo().f45182OooO0O0.f45178OooO0OO.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lucky_Bag_Golds_from_XXX), bonusDetailReply.getFromusername()));
                        this$0.OooOo().f45182OooO0O0.f45180OooO0o0.setImageResource(p562o0oOo000.o0Oo0oo.coin3);
                        this$0.OooOo().f45182OooO0O0.f45179OooO0Oo.setText(com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getGotbonusnum()), ""));
                    }
                    o0000O0 o0000o7 = null;
                    oOOo0000 oooo0001 = null;
                    if (bonusDetailReply.getCode() != 0) {
                        this$0.OooOo().f45184OooO0Oo.OooOooO(true, false);
                        o0000O0 o0000o8 = this$0.f26109OooOo0o;
                        if (o0000o8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            o0000o8 = null;
                        }
                        Boolean bool = Boolean.TRUE;
                        Boolean bool2 = Boolean.FALSE;
                        o0000o8.Oooo0(bool, bool2, bool2);
                        oOOo0000 oooo0002 = this$0.f26107OooOo00;
                        if (oooo0002 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                        } else {
                            oooo0001 = oooo0002;
                        }
                        oooo0001.f45187OooO0OO.setVisibility(8);
                        return;
                    }
                    this$0.OooOo().f45184OooO0Oo.OooOooO(true, true);
                    o0000O0 o0000o9 = this$0.f26109OooOo0o;
                    if (o0000o9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o0000o9 = null;
                    }
                    Boolean bool3 = Boolean.TRUE;
                    o0000o9.Oooo0(bool3, bool3, Boolean.FALSE);
                    if (bonusDetailReply.getBonusgrabnum() > 0) {
                        oOOo0000 oooo0003 = this$0.f26107OooOo00;
                        if (oooo0003 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                            oooo0003 = null;
                        }
                        oooo0003.f45187OooO0OO.setVisibility(0);
                    } else {
                        oOOo0000 oooo0004 = this$0.f26107OooOo00;
                        if (oooo0004 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("header");
                            oooo0004 = null;
                        }
                        oooo0004.f45187OooO0OO.setVisibility(8);
                    }
                    oOOo0000 oooo0005 = this$0.f26107OooOo00;
                    if (oooo0005 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("header");
                        oooo0005 = null;
                    }
                    oooo0005.f45187OooO0OO.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getBonusgrabnum()), "") + "/" + com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(bonusDetailReply.getBonustotalnum()), ""));
                    o0000O0 o0000o10 = this$0.f26109OooOo0o;
                    if (o0000o10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o0000o7 = o0000o10;
                    }
                    o0000o7.OooOoO0(bonusDetailReply.getBonusdetailsList());
                    if (bonusDetailReply.getGotbonus()) {
                        this$0.OooOo().f45182OooO0O0.f45180OooO0o0.setVisibility(0);
                        this$0.OooOo().f45182OooO0O0.f45179OooO0Oo.setVisibility(0);
                    } else {
                        this$0.OooOo().f45182OooO0O0.f45180OooO0o0.setVisibility(8);
                        this$0.OooOo().f45182OooO0O0.f45179OooO0Oo.setVisibility(8);
                    }
                }
            }
        });
    }
}
