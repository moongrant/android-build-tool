package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OoOO0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f43617Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f43617Oooo0o = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
        TurnOnLoginProtectionActivity turnOnLoginProtectionActivity = this.f43617Oooo0o;
        int i = TurnOnLoginProtectionActivity.f21879OooooO0;
        turnOnLoginProtectionActivity.OooOoo().f50630OooO0O0.setClickable(false);
        return Unit.INSTANCE;
    }
}
