package p487o0o00O;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p045Oooooo.o000000O;
import p381o0OOoOo0.Oooo000;
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function1<ApiResult<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48816OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(TaskActivity taskActivity) {
        super(1);
        this.f48816OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<String> apiResult) {
        ApiResult<String> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        TaskActivity taskActivity = this.f48816OooO0Oo;
        if (zIsSuccess) {
            int i = TaskActivity.f25083OooOooO;
            taskActivity.OooOo().f44334OooO0Oo.postDelayed(new o000000O(taskActivity, 3), 1000L);
        } else {
            ((o0OOO00) taskActivity.f25090OooOoO.getValue()).dismiss();
            ApiError error = apiResult2.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
