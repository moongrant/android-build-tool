package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.account.TurnOnLoginProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p381o0OOoOo0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TurnOnLoginProtectionActivity f49045OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(TurnOnLoginProtectionActivity turnOnLoginProtectionActivity) {
        super(1);
        this.f49045OooO0Oo = turnOnLoginProtectionActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        Intrinsics.checkNotNullParameter(error, "error");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        int i = TurnOnLoginProtectionActivity.f24879OooOo0O;
        this.f49045OooO0Oo.OooOo().f44283OooO0O0.setClickable(false);
        return Unit.INSTANCE;
    }
}
