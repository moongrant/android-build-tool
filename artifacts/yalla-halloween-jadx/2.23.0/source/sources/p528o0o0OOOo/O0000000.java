package p528o0o0OOOo;

import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class O0000000 extends Lambda implements Function1<o0000<PraisePostResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f53695OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53696OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
        super(1);
        this.f53695OooO0Oo = momentDetailModel;
        this.f53696OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<PraisePostResultModel> o0000Var) {
        o0000<PraisePostResultModel> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new oo00(this.f53695OooO0Oo, this.f53696OooO0o0);
        return Unit.INSTANCE;
    }
}
