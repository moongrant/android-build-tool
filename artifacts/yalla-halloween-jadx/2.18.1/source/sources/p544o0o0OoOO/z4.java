package p544o0o0OoOO;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.room.MemberListRemoveActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class z4 extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f44354Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(MemberListRemoveActivity memberListRemoveActivity) {
        super(1);
        this.f44354Oooo0o = memberListRemoveActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        ApiResult<Object> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f44354Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
