package p493o0o00O0o;

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
import com.yalla.yalla.ui.activity.moment.MomentPowerSelectActivity;
import com.yalla.yalla.ui.activity.room.VoteGameCreateActivity;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.compat.BiConsumer;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.proto.metrics.v1.NumberDataPoint;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p474o0OoooOO.oo0oO0;
import p502o0o00o0.o0OO;
import p502o0o00o0.o0OOOO00;
import p569o0oOo0Oo.o0O0OO0;
import p593o0oOoooO.h0;
import p675oO0Oo.l0;
import p675oO0Oo.oOO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO00o000 implements BaseQuickAdapter.OooO0o, o0O0OO0, BiConsumer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49247OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49248OooO0o0;

    public /* synthetic */ oO00o000(Object obj, int i) {
        this.f49247OooO0Oo = i;
        this.f49248OooO0o0 = obj;
    }

    @Override // p569o0oOo0Oo.o0O0OO0
    public final void OooO0Oo() {
        ArrearsDetailActivity this$0 = (ArrearsDetailActivity) this.f49248OooO0o0;
        int i = ArrearsDetailActivity.f26504OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOoO(true);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f49247OooO0Oo;
        Object obj = this.f49248OooO0o0;
        switch (i2) {
            case 0:
                MomentPowerSelectActivity this$0 = (MomentPowerSelectActivity) obj;
                int i3 = MomentPowerSelectActivity.f25695OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intent intent = new Intent();
                intent.putExtra("Data", (Serializable) this$0.f25696OooOOoo.get(i));
                this$0.setResult(-1, intent);
                this$0.finish();
                break;
            default:
                RoomGameBoxDialog this$1 = (RoomGameBoxDialog) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Object obj2 = baseQuickAdapter.f13200OooOOoo.get(i);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yalla.yalla.ui.dialog.RoomGameBoxDialog.GameType");
                int i4 = RoomGameBoxDialog.OooO00o.$EnumSwitchMapping$0[((RoomGameBoxDialog.GameType) obj2).ordinal()];
                OooO0O0.OooO00o oooO00o = OooO0O0.f24541OoooOOO;
                boolean z = false;
                switch (i4) {
                    case 1:
                        h0.OooO0O0("102026");
                        new l0(this$1.f27467OooO0oO, true).OooO();
                        this$1.OooO0OO();
                        break;
                    case 2:
                        long timeInMillis = Calendar.getInstance().getTimeInMillis();
                        if (timeInMillis - this$1.f27474OooOOOO > 1000) {
                            this$1.f27474OooOOOO = timeInMillis;
                            if (MixedRoomDataSource.OooO0o0().f22996OooO0o != null) {
                                h0.OooO0O0("102027");
                                new oOO0OO(this$1.f27467OooO0oO).OooO();
                            }
                        }
                        this$1.OooO0OO();
                        break;
                    case 3:
                        h0.OooO0O0("102028");
                        LiveEventBus.get("OPEN_TURNTABKE_GAME").post(Boolean.TRUE);
                        this$1.OooO0OO();
                        break;
                    case 4:
                        h0.OooO0O0("102029");
                        RoomGameConfig.Vote value = oooO00o.OooO00o().f24583Oooo0oO.getValue();
                        if (value != null && value.getStatus() == RoomVoteDialog.VoteStatus.Running.getValue()) {
                            z = true;
                        }
                        if (z) {
                            LiveEventBus.get("PARTICIPATE_IN_THE_GAME").post(null);
                        } else {
                            int i5 = VoteGameCreateActivity.f26303OooOo;
                            MixedRoomActivity context = this$1.f27467OooO0oO;
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) VoteGameCreateActivity.class));
                        }
                        this$1.OooO0OO();
                        break;
                    case 5:
                        MutableLiveData<Long> mutableLiveData = oooO00o.OooO00o().f24547OooO0Oo;
                        Long value2 = oooO00o.OooO00o().OooO0oO().getValue();
                        h0.OooO0OO("102030", MapsKt.hashMapOf(new Pair("lucknum", Integer.valueOf((value2 != null && value2.longValue() == -1) ? 0 : 1)), new Pair("source", mutableLiveData)));
                        if (this$1.f27468OooO0oo != null) {
                            p270o00oooo0.o0O0OO0.OooO0OO(113, null);
                        }
                        this$1.OooO0OO();
                        break;
                    case 6:
                        h0.OooO0O0("102032");
                        o0OO o0oo = this$1.f27467OooO0oO.f22988OoooO0.f49642OooO0Oo;
                        if (o0oo != null) {
                            o0OOOO00 onLogin = new o0OOOO00(o0oo);
                            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                            if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                                onLogin.invoke();
                            } else {
                                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                                if (activityOooO0O0 != null) {
                                    int i6 = LoginActivity.f24734OooOo0O;
                                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                                }
                            }
                        }
                        this$1.OooO0OO();
                        break;
                }
                break;
        }
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MetricAdapter.OooO0O0((NumberDataPoint.Builder) this.f49248OooO0o0, (AttributeKey) obj, obj2);
    }
}
