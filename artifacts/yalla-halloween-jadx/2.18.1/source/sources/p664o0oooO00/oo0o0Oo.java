package p664o0oooO00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public o000000 f51837OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f51838OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f51839OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f51840OooO0Oo;

    public oo0o0Oo(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f51839OooO0OO = name;
        this.f51840OooO0Oo = z;
        this.f51838OooO0O0 = -1L;
    }

    public abstract long OooO00o();

    @NotNull
    public final String toString() {
        return this.f51839OooO0OO;
    }
}
