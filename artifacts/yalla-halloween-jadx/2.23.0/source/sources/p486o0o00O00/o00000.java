package p486o0o00O00;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends Lambda implements Function1<ApiResult<UserEditResult>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f48246OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(ChangeRegionActivity changeRegionActivity) {
        super(1);
        this.f48246OooO0Oo = changeRegionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<UserEditResult> apiResult) {
        ApiResult<UserEditResult> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = ChangeRegionActivity.f25377OooOoO0;
        Object value = this.f48246OooO0Oo.f25385OooOo0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-changeRegionLoadingDialog>(...)");
        ((O0000000) value).OooO00o();
        return Unit.INSTANCE;
    }
}
