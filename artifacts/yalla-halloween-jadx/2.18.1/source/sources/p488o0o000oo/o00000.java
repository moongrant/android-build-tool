package p488o0o000oo;

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
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 extends Lambda implements Function1<AuthResponse, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f40963Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(FragmentActivity fragmentActivity) {
        super(1);
        this.f40963Oooo0o = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AuthResponse authResponse) {
        AuthResponse auth = authResponse;
        Intrinsics.checkNotNullParameter(auth, "auth");
        if (o00O0.OooO0o0(auth.getAuthCode())) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o000000O(this.f40963Oooo0o, auth, null), 2, null);
        } else {
            LiveEventBus.get("H5RefreshAssociationYallaChat").post("");
        }
        return Unit.INSTANCE;
    }
}
