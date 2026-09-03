package p538o0o0Oo0;

import com.app.base.task.sendPostTask.SendPostService;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentEditState;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p137o00OO0oo.OooOOO0;
import p515o0o0O00.o00O00;
import p617o0oo0o.o000O00;
import p617o0oo0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O extends Lambda implements Function1<MomentSendModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43921Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(MomentSendActivity momentSendActivity) {
        super(1);
        this.f43921Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentSendModel momentSendModel) {
        MomentSendModel sendModel = momentSendModel;
        MomentSendActivity momentSendActivity = this.f43921Oooo0o;
        momentSendActivity.f22379o00Oo0 = false;
        int type = momentSendActivity.OooOooo().getType();
        MomentType momentType = MomentType.Text;
        if (type == momentType.getValue()) {
            OooOOO0 oooOOO0 = OooOOO0.f31661OooO00o;
            OooOOO0.OooO00o();
        }
        if (this.f43921Oooo0o.Oooo00O().isInEdit()) {
            o00O00.OooOO0O("编辑动态 save \nsendModel = " + sendModel);
            o000O00 o000o01 = (o000O00) this.f43921Oooo0o.f22381o00o0O.getValue();
            Intrinsics.checkNotNullExpressionValue(sendModel, "sendModel");
            Objects.requireNonNull(o000o01);
            Intrinsics.checkNotNullParameter(sendModel, "sendPostModel");
            sendModel.setEditState(MomentEditState.Sending);
            LiveEventBus.get("MOMENT_EDIT_SEND_SHOWING").post(sendModel);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new o000O0Oo(o000o01, sendModel, null), 2, null);
        } else if (sendModel.getType() == momentType.getValue() || sendModel.getType() == MomentType.Image.getValue() || sendModel.getType() == MomentType.Poll.getValue()) {
            SendPostService.OooO00o oooO00o = SendPostService.f11901OoooO0;
            MomentSendActivity momentSendActivity2 = this.f43921Oooo0o;
            Intrinsics.checkNotNullExpressionValue(sendModel, "sendModel");
            oooO00o.OooO00o(momentSendActivity2, sendModel, true);
            this.f43921Oooo0o.finish();
        } else {
            MomentSendActivity momentSendActivity3 = this.f43921Oooo0o;
            Intrinsics.checkNotNullExpressionValue(sendModel, "sendModel");
            o000O0O0 o000o0o1 = new o000O0O0(this.f43921Oooo0o);
            Objects.requireNonNull(momentSendActivity3);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new o000OO0O(momentSendActivity3, sendModel, o000o0o1, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
