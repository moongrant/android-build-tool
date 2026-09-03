package p538o0o0Oo0;

import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 extends Lambda implements Function1<MomentSendModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43926Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(MomentSendActivity momentSendActivity) {
        super(1);
        this.f43926Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendModel momentSendModel) {
        MomentSendModel momentSendModel2 = momentSendModel;
        if (momentSendModel2 != null) {
            MomentSendActivity momentSendActivity = this.f43926Oooo0o;
            ToastUtil.f12567OooO00o.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.send_successfully));
            LiveEventBus.get("Post_send_success").post(momentSendModel2);
            MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
            momentSendActivity.OooOooO().f48988OooO0o.OooO0O0();
            momentSendActivity.finish();
        }
        return Unit.INSTANCE;
    }
}
