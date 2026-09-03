package oO0OO;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52737Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(OpenAuthManager openAuthManager) {
        super(2);
        this.f52737Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String token = str;
        String secret = str2;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Function3<? super String, ? super OpenAuthManager.AuthType, ? super String, Unit> function3 = this.f52737Oooo0o.f21648OooO0O0;
        if (function3 != null) {
            function3.invoke(token, OpenAuthManager.AuthType.Twitter, secret);
        }
        return Unit.INSTANCE;
    }
}
