package p487o0o00O;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function1<ApiResult<Long>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48908OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(TaskActivity taskActivity) {
        super(1);
        this.f48908OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Long> apiResult) {
        ApiResult<Long> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48908OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
