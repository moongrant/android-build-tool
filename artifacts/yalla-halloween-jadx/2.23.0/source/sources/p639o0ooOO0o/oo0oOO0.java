package p639o0ooOO0o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class oo0oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f57451OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f57452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o00OO00O f57453OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f57454OooO0Oo;

    public oo0oOO0(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f57451OooO00o = name;
        this.f57452OooO0O0 = z;
        this.f57454OooO0Oo = -1L;
    }

    public abstract long OooO00o();

    @NotNull
    public final String toString() {
        return this.f57451OooO00o;
    }
}
