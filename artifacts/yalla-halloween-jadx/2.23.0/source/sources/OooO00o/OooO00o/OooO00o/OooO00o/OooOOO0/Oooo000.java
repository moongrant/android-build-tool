package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p605o0oo0OO0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo000 f54OooO0Oo = new Oooo000();

    public Oooo000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String msg = str;
        Intrinsics.checkNotNullParameter(msg, "$this$setErrorHandler");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (o000O.f56902OooO0O0) {
            Log.e(o000O.f56901OooO00o, msg);
        }
        return Unit.INSTANCE;
    }
}
