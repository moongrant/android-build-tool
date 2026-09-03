package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 extends Lambda implements Function1<ApiResult<PraiseCommentResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54029OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(MutableState<Boolean> mutableState) {
        super(1);
        this.f54029OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<PraiseCommentResultModel> apiResult) {
        ApiResult<PraiseCommentResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f54029OooO0Oo.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
