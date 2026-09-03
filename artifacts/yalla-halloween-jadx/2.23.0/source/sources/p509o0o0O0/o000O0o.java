package p509o0o0O0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p596o0oo00o.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50647OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(MomentDetailModel momentDetailModel) {
        super(0);
        this.f50647OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentSendModel sendPostModel = this.f50647OooO0Oo.getSendPostModel();
        Intrinsics.checkNotNull(sendPostModel);
        OooOOOO.OooO0O0(sendPostModel);
        LiveEventBus.get("Post_send_delete").post(sendPostModel);
        return Unit.INSTANCE;
    }
}
