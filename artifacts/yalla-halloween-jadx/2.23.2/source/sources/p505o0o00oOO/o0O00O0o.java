package p505o0o00oOO;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.NumberDataPoint;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import o0oo0000.OooO00o;
import p475o0Ooooo0.o0O00oO0;
import p499o0o00o.o0oOo0O0;
import p499o0o00o.oo0OOoo;
import p545o0oO0O00.OooOo00;
import p559o0oOo.o00O0O;
import p650o0ooo.oO00OOOo;
import p650o0ooo.oOOO0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O00O0o implements o00O0O, BaseQuickAdapter.OooO0o, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f50329OooO0Oo;

    public /* synthetic */ o0O00O0o(Object obj) {
        this.f50329OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f50329OooO0Oo;
        int i = ArrearsDetailActivity.f26503OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        RoomGameBoxDialog this$0 = (RoomGameBoxDialog) this.f50329OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.ui.dialog.RoomGameBoxDialog.GameType");
        int i2 = RoomGameBoxDialog.OooO00o.$EnumSwitchMapping$0[((RoomGameBoxDialog.GameType) obj).ordinal()];
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        boolean z = false;
        switch (i2) {
            case 1:
                OooO00o.OooO0O0("102026");
                new oOOO0OO0(this$0.f27458OooO0oO, true).OooO();
                this$0.OooO0OO();
                break;
            case 2:
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (timeInMillis - this$0.f27465OooOOOO > 1000) {
                    this$0.f27465OooOOOO = timeInMillis;
                    if (MixedRoomDataSource.OooO0o0().f22991OooO0o != null) {
                        OooO00o.OooO0O0("102027");
                        new oO00OOOo(this$0.f27458OooO0oO).OooO();
                    }
                }
                this$0.OooO0OO();
                break;
            case 3:
                OooO00o.OooO0O0("102028");
                LiveEventBus.get("OPEN_TURNTABKE_GAME").post(Boolean.TRUE);
                this$0.OooO0OO();
                break;
            case 4:
                OooO00o.OooO0O0("102029");
                RoomGameConfig.Vote value = oooO00o.OooO00o().f24575Oooo0oO.getValue();
                if (value != null && value.getStatus() == RoomVoteDialog.VoteStatus.Running.getValue()) {
                    z = true;
                }
                if (z) {
                    LiveEventBus.get("PARTICIPATE_IN_THE_GAME").post(null);
                } else {
                    int i3 = VoteGameCreateActivity.f26301OooOo;
                    MixedRoomActivity context = this$0.f27458OooO0oO;
                    Intrinsics.checkNotNullParameter(context, "context");
                    context.startActivity(new Intent(context, (Class<?>) VoteGameCreateActivity.class));
                }
                this$0.OooO0OO();
                break;
            case 5:
                MutableLiveData<Long> mutableLiveData = oooO00o.OooO00o().f24539OooO0Oo;
                Long value2 = oooO00o.OooO00o().OooO0oO().getValue();
                OooO00o.OooO0OO("102030", MapsKt.hashMapOf(new Pair("lucknum", Integer.valueOf((value2 != null && value2.longValue() == -1) ? 0 : 1)), new Pair("source", mutableLiveData)));
                if (this$0.f27459OooO0oo != null) {
                    OooOo00.OooO0O0(113, null);
                }
                this$0.OooO0OO();
                break;
            case 6:
                OooO00o.OooO0O0("102032");
                oo0OOoo oo0oooo = this$0.f27458OooO0oO.f22983OoooO0.f49618OooO0Oo;
                if (oo0oooo != null) {
                    o0oOo0O0 onLogin = new o0oOo0O0(oo0oooo);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            int i4 = LoginActivity.f24727OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                        }
                    }
                }
                this$0.OooO0OO();
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0O0((NumberDataPoint.Builder) this.f50329OooO0Oo, (AttributeKey) obj, obj2);
    }
}
