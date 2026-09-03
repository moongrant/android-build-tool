package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47888OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(MomentSendActivity momentSendActivity) {
        super(0);
        this.f47888OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentSendActivity momentSendActivity = this.f47888OooO0Oo;
        momentSendActivity.f26177OooOo = null;
        momentSendActivity.OooOo().f58562OooOO0.setData(momentSendActivity.f26177OooOo);
        momentSendActivity.OooOo().f58560OooO0oO.setTopicInfoModel(momentSendActivity.f26177OooOo);
        return Unit.INSTANCE;
    }
}
