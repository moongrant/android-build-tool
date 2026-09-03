package p491o0o00O0o;

import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function1<ApiResult<AccountBindInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f49047OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f49047OooO0Oo = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<AccountBindInfo> apiResult) {
        ApiResult<AccountBindInfo> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49047OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
