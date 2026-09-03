package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.c7;
import p641o0ooOOOO.e7;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLuckyPacketDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyPacketDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,194:1\n22#2,2:195\n*S KotlinDebug\n*F\n+ 1 LuckyPacketDetailActivity.kt\ncom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity\n*L\n41#1:195,2\n*E\n"})
public final class LuckyPacketDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26556OooOo = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f26557OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(c7.class), this, null);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f26558OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public e7 f26559OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f26560OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0000O0 f26561OooOo0o;

    public static final class OooO00o {
        public static void OooO00o(@NotNull FragmentActivity context, long j, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LuckyPacketDetailActivity.class);
            intent.putExtra("bonusId", j);
            intent.putExtra("BonusType", i);
            context.startActivity(intent);
        }
    }

    public final c7 OooOo() {
        return (c7) this.f26557OooOOoo.getValue();
    }

    public final void OooOoO0() {
        long j = this.f26558OooOo0;
        int i = this.f26560OooOo0O;
        Room.BonusDetailRequest.Builder builderNewBuilder = Room.BonusDetailRequest.newBuilder();
        builderNewBuilder.setBonustype(i);
        builderNewBuilder.setBonusid(j);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(10078, builderNewBuilder.build().toByteArray());
        }
        StringsKt__StringsKt.lastIndexOf$default("23rsaff.asdfasddf", ".", 0, false, 6, (Object) null);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f57663OooO00o);
        this.f26558OooOo0 = getIntent().getLongExtra("bonusId", 0L);
        this.f26560OooOo0O = getIntent().getIntExtra("BonusType", 0);
        if (this.f26558OooOo0 == 0) {
            finish();
        } else {
            OooOoO0();
        }
        if (this.f26560OooOo0O == 2) {
            OooOOoo(oO00OOo0.Lucky_Bag_tag_Gifts);
        } else {
            OooOOoo(oO00OOo0.Lucky_Bag_tag_Golds);
        }
        e7 e7VarInflate = e7.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(e7VarInflate, "inflate(layoutInflater)");
        this.f26559OooOo00 = e7VarInflate;
        OooOo().f57666OooO0Oo.setOnRefreshListener(new p203o00o0o0o.oo00o(this));
        o0000O0 o0000o1 = new o0000O0(this, oO00OO0O.room_activity_lucky_packet_detail_item_layout);
        this.f26561OooOo0o = o0000o1;
        e7 e7Var = this.f26559OooOo00;
        o0000O0 o0000o2 = null;
        if (e7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            e7Var = null;
        }
        o0000o1.OooO0o0(e7Var.f57829OooO0O0, -1);
        OooOo().f57665OooO0OO.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = OooOo().f57665OooO0OO;
        o0000O0 o0000o3 = this.f26561OooOo0o;
        if (o0000o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000o3 = null;
        }
        recyclerView.setAdapter(o0000o3);
        o0000O0 o0000o4 = this.f26561OooOo0o;
        if (o0000o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000o4 = null;
        }
        o0000o4.Oooo0OO(new o0000O0O(this));
        o0000O0 o0000o5 = this.f26561OooOo0o;
        if (o0000o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o0000o5 = null;
        }
        o0000o5.Oooo000(oO00OOo0.lucky_packet_detail_no_data);
        o0000O0 o0000o6 = this.f26561OooOo0o;
        if (o0000o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            o0000o2 = o0000o6;
        }
        o0000o2.OooOooo(oOo00OO0.ic_empty_moment);
        LiveEventBus.get("LuckyPacket_Detail").observe(this, new o000OO(this));
    }
}
