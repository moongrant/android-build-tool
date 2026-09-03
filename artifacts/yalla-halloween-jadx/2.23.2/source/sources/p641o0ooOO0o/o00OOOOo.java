package p641o0ooOO0o;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p652o0ooo000.o0000O00;
import p653o0ooo00O.o000O000;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O000 f57761OooO00o;

    public o00OOOOo(long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        o000O000 delegate = new o000O000(o0000O00.f59287OooO0oo, j, timeUnit);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f57761OooO00o = delegate;
    }
}
