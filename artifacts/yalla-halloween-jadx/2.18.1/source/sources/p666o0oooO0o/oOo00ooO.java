package p666o0oooO0o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00ooO extends o00OOOOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final long f51887Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final String f51888Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o0oOOo f51889OoooO00;

    public oOo00ooO(@Nullable String str, long j, @NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f51888Oooo0oo = str;
        this.f51887Oooo = j;
        this.f51889OoooO00 = source;
    }

    @Override // p660o0ooo0o0.o00OOOOo
    public final long OooO0Oo() {
        return this.f51887Oooo;
    }

    @Override // p660o0ooo0o0.o00OOOOo
    @Nullable
    public final o00OO0O0 OooO0o() {
        String str = this.f51888Oooo0oo;
        if (str != null) {
            return o00OO0O0.f51401OooO0oO.OooO0O0(str);
        }
        return null;
    }

    @Override // p660o0ooo0o0.o00OOOOo
    @NotNull
    public final o0oOOo OooO0oo() {
        return this.f51889OoooO00;
    }
}
