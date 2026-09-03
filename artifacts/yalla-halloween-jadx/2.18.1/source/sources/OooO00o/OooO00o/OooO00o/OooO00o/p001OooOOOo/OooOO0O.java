package OooO00o.OooO00o.OooO00o.OooO00o.p001OooOOOo;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p625o0oo0oo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooOO0O f52Oooo0o = new OooOO0O();

    public OooOO0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String msg = str;
        Intrinsics.checkNotNullParameter(msg, "$this$setErrorHandler");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (o000OO0O.f48670OooO0O0) {
            Log.e(o000OO0O.f48669OooO00o, msg);
        }
        return Unit.INSTANCE;
    }
}
