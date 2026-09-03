package p535o0o0Oo0;

import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p381o0OOoOo0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0 extends Lambda implements Function1<o00O0O<PraisePostResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54198OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
        super(1);
        this.f54197OooO0Oo = momentDetailModel;
        this.f54198OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0O<PraisePostResultModel> o00o0o2) {
        o00O0O<PraisePostResultModel> launchCollectApi = o00o0o2;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f43270OooO00o = new ooooO000(this.f54197OooO0Oo, this.f54198OooO0o0);
        return Unit.INSTANCE;
    }
}
