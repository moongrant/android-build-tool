package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO0O extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f54028OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO0O(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(1);
        this.f54027OooO0Oo = mutableState;
        this.f54028OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
        ApiResult<RewardCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f54027OooO0Oo.setValue(Boolean.FALSE);
        Function0<Unit> function0 = this.f54028OooO0o0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
