package p576o0oOoOOo;

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
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 extends Lambda implements Function1<AuthResponse, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f56490OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(FragmentActivity fragmentActivity) {
        super(1);
        this.f56490OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AuthResponse authResponse) {
        AuthResponse auth = authResponse;
        Intrinsics.checkNotNullParameter(auth, "auth");
        if (o00O00OO.OooO0o(auth.getAuthCode())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new oOO00000(this.f56490OooO0Oo, auth, null), 2, null);
        } else {
            LiveEventBus.get("H5RefreshAssociationYallaChat").post("");
        }
        return Unit.INSTANCE;
    }
}
