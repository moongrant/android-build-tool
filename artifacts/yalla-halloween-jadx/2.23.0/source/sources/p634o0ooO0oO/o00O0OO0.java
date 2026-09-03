package p634o0ooO0oO;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p639o0ooOO0o.o00OO0O0;
import p646o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO000o00 f57199OooO00o;

    public o00O0OO0(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        oO000o00 delegate = new oO000o00(o00OO0O0.f57441OooO0oo, j, timeUnit);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f57199OooO00o = delegate;
    }
}
