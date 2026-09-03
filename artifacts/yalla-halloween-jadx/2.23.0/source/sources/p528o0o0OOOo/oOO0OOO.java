package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OOO extends Lambda implements Function1<o0000<PraisePostResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54253OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54254OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OOO(MomentDetailModel momentDetailModel, MutableState<Boolean> mutableState) {
        super(1);
        this.f54253OooO0Oo = momentDetailModel;
        this.f54254OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<PraisePostResultModel> o0000Var) {
        o0000<PraisePostResultModel> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new oOO0OO0O(this.f54253OooO0Oo);
        launchCollectApi.f44047OooO0O0 = new oOO0OO(this.f54254OooO0o0);
        return Unit.INSTANCE;
    }
}
