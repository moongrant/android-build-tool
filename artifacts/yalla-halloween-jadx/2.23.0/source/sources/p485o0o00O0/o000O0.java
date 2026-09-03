package p485o0o00O0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47813OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(MomentDetailActivity momentDetailActivity) {
        super(1);
        this.f47813OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        ((oO0O0O00) this.f47813OooO0Oo.f26059OooOo.getValue()).OooO00o(momentDetailModel);
        return Unit.INSTANCE;
    }
}
