package p519o0o0O0OO;

import android.app.Activity;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendState;
import com.yalla.yalla.util.sendPostTask.MomentSendService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f52110OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(Activity activity, MomentDetailModel momentDetailModel) {
        super(0);
        this.f52109OooO0Oo = momentDetailModel;
        this.f52110OooO0o0 = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentSendModel sendPostModel = this.f52109OooO0Oo.getSendPostModel();
        Intrinsics.checkNotNull(sendPostModel);
        MomentSendState sendPostState = sendPostModel.getSendPostState();
        MomentSendState momentSendState = MomentSendState.Sending;
        if (sendPostState != momentSendState) {
            sendPostModel.setSendPostState(momentSendState);
            int i = MomentSendService.f32346OooO0oo;
            MomentSendService.OooO00o.OooO00o(this.f52110OooO0o0, sendPostModel, false);
        }
        return Unit.INSTANCE;
    }
}
