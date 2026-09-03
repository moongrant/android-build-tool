package oO0OO;

import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f52730Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OpenAuthManager openAuthManager) {
        super(1);
        this.f52730Oooo0o = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        Function3<? super String, ? super OpenAuthManager.AuthType, ? super String, Unit> function3 = this.f52730Oooo0o.f21648OooO0O0;
        if (function3 != null) {
            function3.invoke(it, OpenAuthManager.AuthType.Facebook, null);
        }
        return Unit.INSTANCE;
    }
}
