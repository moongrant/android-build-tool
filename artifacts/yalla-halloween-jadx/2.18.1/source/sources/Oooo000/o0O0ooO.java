package Oooo000;

import androidx.compose.animation.ExperimentalAnimationApi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalAnimationApi
public final class o0O0ooO implements o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f983OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function2<o0000O0O.o000oOoO, o0000O0O.o000oOoO, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> f984OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0ooO(boolean z, @NotNull Function2<? super o0000O0O.o000oOoO, ? super o0000O0O.o000oOoO, ? extends p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        this.f983OooO00o = z;
        this.f984OooO0O0 = sizeAnimationSpec;
    }

    @Override // Oooo000.o00O0000
    public final boolean OooO00o() {
        return this.f983OooO00o;
    }

    @Override // Oooo000.o00O0000
    @NotNull
    public final p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> OooO0O0(long j, long j2) {
        return this.f984OooO0O0.invoke(new o0000O0O.o000oOoO(j), new o0000O0O.o000oOoO(j2));
    }
}
