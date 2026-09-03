package p474o0o00;

import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function1<ApiResult<AccountBindInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f47291OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f47291OooO0Oo = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<AccountBindInfo> apiResult) {
        ApiResult<AccountBindInfo> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47291OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
