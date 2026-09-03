package p652o0ooo000;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f59282OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f59283OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o0000 f59284OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f59285OooO0Oo;

    public o00000O(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f59282OooO00o = name;
        this.f59283OooO0O0 = z;
        this.f59285OooO0Oo = -1L;
    }

    public abstract long OooO00o();

    @NotNull
    public final String toString() {
        return this.f59282OooO00o;
    }
}
