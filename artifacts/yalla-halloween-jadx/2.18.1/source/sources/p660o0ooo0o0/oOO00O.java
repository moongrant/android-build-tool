package p660o0ooo0o0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p663o0oooO0.o00OO0OO;
import p664o0oooO00.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f51480OooO00o;

    public oOO00O(long j) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        o00OO0OO delegate = new o00OO0OO(o000000O.f51825OooO0oo, j);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f51480OooO00o = delegate;
    }
}
