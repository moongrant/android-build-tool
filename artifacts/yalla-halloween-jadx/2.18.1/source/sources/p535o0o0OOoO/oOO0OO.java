package p535o0o0OOoO;

import com.app.base.model.RandomActivityModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0OO extends Lambda implements Function1<ApiResult<RandomActivityModel.DataBean>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f43701Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OO(TaskActivity taskActivity) {
        super(1);
        this.f43701Oooo0o = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RandomActivityModel.DataBean> apiResult) {
        ApiResult<RandomActivityModel.DataBean> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43701Oooo0o.finish();
        return Unit.INSTANCE;
    }
}
