package p509o0o0O0;

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
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50626OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f50627OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(Activity activity, MomentDetailModel momentDetailModel) {
        super(0);
        this.f50626OooO0Oo = momentDetailModel;
        this.f50627OooO0o0 = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentSendModel sendPostModel = this.f50626OooO0Oo.getSendPostModel();
        Intrinsics.checkNotNull(sendPostModel);
        MomentSendState sendPostState = sendPostModel.getSendPostState();
        MomentSendState momentSendState = MomentSendState.Sending;
        if (sendPostState != momentSendState) {
            sendPostModel.setSendPostState(momentSendState);
            int i = MomentSendService.f32890OooO0oo;
            MomentSendService.OooO00o.OooO00o(this.f50627OooO0o0, sendPostModel, false);
        }
        return Unit.INSTANCE;
    }
}
