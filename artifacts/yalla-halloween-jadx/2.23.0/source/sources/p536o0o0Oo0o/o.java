package p536o0o0Oo0o;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f54963OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
        super(1);
        this.f54963OooO0Oo = entranceEffectProfileCardVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        int code = error.getCode();
        EntranceEffectProfileCardVM entranceEffectProfileCardVM = this.f54963OooO0Oo;
        if (code == 2088) {
            entranceEffectProfileCardVM.getShowVipHiddenDialog().setValue(Boolean.TRUE);
        } else if (code != 2092) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        } else {
            entranceEffectProfileCardVM.getShowWealthHiddenDialog().setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
