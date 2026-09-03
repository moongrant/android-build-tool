package androidx.compose.ui.platform;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O implements o000000.o00000O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Float f6450Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f6451Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final List<o00O> f6452Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Float f6453Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00000O0.OooOOO0 f6454OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o00000O0.OooOOO0 f6455OoooO00;

    public o00O(int i, @NotNull List allScopes) {
        Intrinsics.checkNotNullParameter(allScopes, "allScopes");
        this.f6451Oooo0o = i;
        this.f6452Oooo0oO = allScopes;
        this.f6453Oooo0oo = null;
        this.f6450Oooo = null;
        this.f6455OoooO00 = null;
        this.f6454OoooO0 = null;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return this.f6452Oooo0oO.contains(this);
    }
}
