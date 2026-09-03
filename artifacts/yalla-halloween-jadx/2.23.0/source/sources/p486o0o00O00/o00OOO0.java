package p486o0o00O00;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function1<ApiResult<Long>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48318OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(TaskActivity taskActivity) {
        super(1);
        this.f48318OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Long> apiResult) {
        ApiResult<Long> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48318OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
