package o000000;

import kotlin.jvm.internal.Intrinsics;
import o000000.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public class o00Oo0<T extends o00Oo0<T, M>, M extends o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f26651Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo000o f26652Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final M f26653Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public T f26654Oooo0oo;

    public o00Oo0(@NotNull oo000o layoutNodeWrapper, @NotNull M modifier) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        this.f26652Oooo0o = layoutNodeWrapper;
        this.f26653Oooo0oO = modifier;
    }

    public void OooO00o() {
        this.f26651Oooo = true;
    }

    public void OooO0O0() {
        this.f26651Oooo = false;
    }
}
