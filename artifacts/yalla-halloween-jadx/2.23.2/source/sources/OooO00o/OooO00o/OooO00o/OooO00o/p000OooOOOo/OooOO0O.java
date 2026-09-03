package OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p609o0oo0OOO.h5;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOO0O f74OooO0Oo = new OooOO0O();

    public OooOO0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String msg = str;
        Intrinsics.checkNotNullParameter(msg, "$this$setErrorHandler");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (h5.f57416OooO0O0) {
            Log.e(h5.f57415OooO00o, msg);
        }
        return Unit.INSTANCE;
    }
}
