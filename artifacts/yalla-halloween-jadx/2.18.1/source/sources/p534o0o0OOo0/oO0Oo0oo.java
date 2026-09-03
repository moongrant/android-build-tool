package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0Oo0oo extends Lambda implements Function1<ApiResult<AccountBindInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f43616Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f43616Oooo0o = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<AccountBindInfo> apiResult) {
        ApiResult<AccountBindInfo> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43616Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
