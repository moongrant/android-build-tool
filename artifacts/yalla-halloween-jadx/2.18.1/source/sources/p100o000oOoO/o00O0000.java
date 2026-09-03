package p100o000oOoO;

import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f29359OooO00o = LazyKt.lazy(OooO00o.f29360Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o0O000o0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f29360Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O000o0 invoke() {
            return Looper.getMainLooper() != null ? o00OO.f29488Oooo0o : o0OO00OO.f29596Oooo0o;
        }
    }
}
