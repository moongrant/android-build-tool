package p543o0o0Ooo0;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.vm.user.EntranceEffectProfileCardVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p381o0OOoOo0.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OO0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EntranceEffectProfileCardVM f55534OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OO0(EntranceEffectProfileCardVM entranceEffectProfileCardVM) {
        super(1);
        this.f55534OooO0Oo = entranceEffectProfileCardVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        int code = error.getCode();
        EntranceEffectProfileCardVM entranceEffectProfileCardVM = this.f55534OooO0Oo;
        if (code == 2088) {
            entranceEffectProfileCardVM.getShowVipHiddenDialog().setValue(Boolean.TRUE);
        } else if (code != 2092) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        } else {
            entranceEffectProfileCardVM.getShowWealthHiddenDialog().setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
