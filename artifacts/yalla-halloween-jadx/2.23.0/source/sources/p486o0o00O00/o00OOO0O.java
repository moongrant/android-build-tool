package p486o0o00O00;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p045Oooooo.o00000;
import p375o0OOoOO.o00000O0;
import p519o0o0O0oO.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<ApiResult<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48324OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(TaskActivity taskActivity) {
        super(1);
        this.f48324OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<String> apiResult) {
        ApiResult<String> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        TaskActivity taskActivity = this.f48324OooO0Oo;
        if (zIsSuccess) {
            int i = TaskActivity.f25537OooOooO;
            taskActivity.OooOo().f58640OooO0Oo.postDelayed(new o00000(taskActivity, 2), 1000L);
        } else {
            ((oO00O0oO) taskActivity.f25544OooOoO.getValue()).dismiss();
            ApiError error = apiResult2.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
