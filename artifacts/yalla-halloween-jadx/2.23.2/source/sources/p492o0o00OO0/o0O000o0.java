package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49209OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(MomentSendActivity momentSendActivity) {
        super(0);
        this.f49209OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentSendActivity momentSendActivity = this.f49209OooO0Oo;
        momentSendActivity.f25728OooOo = null;
        momentSendActivity.OooOo().f44324OooOO0.setData(momentSendActivity.f25728OooOo);
        momentSendActivity.OooOo().f44322OooO0oO.setTopicInfoModel(momentSendActivity.f25728OooOo);
        return Unit.INSTANCE;
    }
}
