package p572o0oOoOO0;

import androidx.fragment.app.FragmentActivity;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p417o0OoO0.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Oo0oo extends Lambda implements Function1<AuthResponse, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f56291OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(FragmentActivity fragmentActivity) {
        super(1);
        this.f56291OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AuthResponse authResponse) {
        AuthResponse auth = authResponse;
        Intrinsics.checkNotNullParameter(auth, "auth");
        if (o0000O0O.OooO0o(auth.getAuthCode())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new oO0OoOO0(this.f56291OooO0Oo, auth, null), 2, null);
        } else {
            LiveEventBus.get("H5RefreshAssociationYallaChat").post("");
        }
        return Unit.INSTANCE;
    }
}
