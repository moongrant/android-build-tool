package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o000000O;
import p159o00OoOO.o00O000;
import p254o00ooO0O.o00O000o;
import p544o0o0OoOO.m4;
import p544o0o0OoOO.n4;
import p544o0o0OoOO.o4;
import p649o0ooOOoo.le;
import p649o0ooOOoo.ne;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/LuckyPacketDetailActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LuckyPacketDetailActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22854OooooOo = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22855OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(le.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ne f22856Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f22857Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f22858OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<Room.BonusDetail> f22859OooooOO;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LuckyPacketDetailActivity.class);
            intent.putExtra("bonusId", i);
            intent.putExtra("BonusType", i2);
            context.startActivity(intent);
        }
    }

    public final le OooOoo() {
        return (le) this.f22855OoooOoo.getValue();
    }

    public final void OooOooO() {
        o00O000.OooO().OooOO0(this.f22857Ooooo0o, this.f22858OooooO0);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49966OooO00o);
        this.f22857Ooooo0o = getIntent().getIntExtra("bonusId", 0);
        this.f22858OooooO0 = getIntent().getIntExtra("BonusType", 0);
        if (this.f22857Ooooo0o == 0) {
            finish();
        } else {
            OooOooO();
        }
        if (this.f22858OooooO0 == 2) {
            OooOo(R.string.Lucky_Bag_tag_Gifts);
        } else {
            OooOo(R.string.Lucky_Bag_tag_Golds);
        }
        ne neVarInflate = ne.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(neVarInflate, "inflate(layoutInflater)");
        this.f22856Ooooo00 = neVarInflate;
        OooOoo().f49969OooO0Oo.setOnRefreshListener(new m4(this));
        n4 n4Var = new n4(this);
        this.f22859OooooOO = n4Var;
        ne neVar = this.f22856Ooooo00;
        p188o00o00o0.OooO0OO<Room.BonusDetail> oooO0OO = null;
        if (neVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            neVar = null;
        }
        n4Var.addHeaderView(neVar.f50110OooO0O0);
        OooOoo().f49968OooO0OO.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView = OooOoo().f49968OooO0OO;
        p188o00o00o0.OooO0OO<Room.BonusDetail> oooO0OO2 = this.f22859OooooOO;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO2 = null;
        }
        recyclerView.setAdapter(oooO0OO2);
        p188o00o00o0.OooO0OO<Room.BonusDetail> oooO0OO3 = this.f22859OooooOO;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setLoadErrorClickListener(new o4(this));
        p188o00o00o0.OooO0OO<Room.BonusDetail> oooO0OO4 = this.f22859OooooOO;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setEmptyText(R.string.lucky_packet_detail_no_data);
        p188o00o00o0.OooO0OO<Room.BonusDetail> oooO0OO5 = this.f22859OooooOO;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        } else {
            oooO0OO = oooO0OO5;
        }
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_moment);
        LiveEventBus.get("LuckyPacket_Detail").observe(this, new o000000O(this, 4));
    }
}
