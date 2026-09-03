package p487o0o00O;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends Lambda implements Function1<ApiResult<UserEditResult>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f48751OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(ChangeRegionActivity changeRegionActivity) {
        super(1);
        this.f48751OooO0Oo = changeRegionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<UserEditResult> apiResult) {
        ApiResult<UserEditResult> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = ChangeRegionActivity.f24923OooOoO0;
        Object value = this.f48751OooO0Oo.f24931OooOo0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((a) value).OooO00o();
        return Unit.INSTANCE;
    }
}
