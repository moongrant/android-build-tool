package p535o0o0Oo0;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f53931OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f53932OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(1);
        this.f53931OooO0Oo = mutableState;
        this.f53932OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
        ApiResult<RewardCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f53931OooO0Oo.setValue(Boolean.FALSE);
        Function0<Unit> function0 = this.f53932OooO0o0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
