package p535o0o0Oo0;

import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0oooO extends Lambda implements Function1<PraisePostResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54252OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0oooO(MomentDetailModel momentDetailModel) {
        super(1);
        this.f54252OooO0Oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraisePostResultModel praisePostResultModel) {
        PraisePostResultModel it = praisePostResultModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f54252OooO0Oo.setPraise(true);
        return Unit.INSTANCE;
    }
}
