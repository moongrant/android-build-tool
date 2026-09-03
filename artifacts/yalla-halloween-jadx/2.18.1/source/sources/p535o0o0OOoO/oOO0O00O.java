package p535o0o0OOoO;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0O00O extends Lambda implements Function1<ApiResult<Long>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f43697Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O00O(TaskActivity taskActivity) {
        super(1);
        this.f43697Oooo0o = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Long> apiResult) {
        ApiResult<Long> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43697Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
