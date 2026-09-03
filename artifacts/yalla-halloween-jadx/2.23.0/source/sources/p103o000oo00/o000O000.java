package p103o000oo00;

import java.io.File;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o0O0ooO.o000O0O0;
import p659o0oooO00.o00;
import p659o0oooO00.o0000;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o000O00O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 extends o0000OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final File f35692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f35693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o0000OO0.OooO00o f35694OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0000 f35695OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o000OO00 f35696OooO0oo;

    public o000O000(@NotNull o0000 o0000Var, @NotNull File file, @Nullable o0000OO0.OooO00o oooO00o) {
        this.f35692OooO0Oo = file;
        this.f35694OooO0o0 = oooO00o;
        this.f35695OooO0oO = o0000Var;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    @Override // p103o000oo00.o0000OO0
    @NotNull
    public final synchronized o000OO00 OooO00o() {
        Long lValueOf;
        OooOOo();
        o000OO00 o000oo01 = this.f35696OooO0oo;
        if (o000oo01 != null) {
            return o000oo01;
        }
        String str = o000OO00.f60221OooO0o0;
        o000OO00 o000oo00OooO0O0 = o000OO00.OooO00o.OooO0O0(File.createTempFile("tmp", null, this.f35692OooO0Oo));
        o00 o00VarOooO00o = o000O0Oo.OooO00o(o0000O0O.f60198OooO00o.OooOO0O(o000oo00OooO0O0));
        try {
            o0000 o0000Var = this.f35695OooO0oO;
            Intrinsics.checkNotNull(o0000Var);
            lValueOf = Long.valueOf(o00VarOooO00o.Oooo000(o0000Var));
            th = null;
        } catch (Throwable th) {
            th = th;
            lValueOf = null;
        }
        try {
            o00VarOooO00o.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            } else {
                ExceptionsKt.addSuppressed(th, th2);
            }
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(lValueOf);
        this.f35695OooO0oO = null;
        this.f35696OooO0oo = o000oo00OooO0O0;
        return o000oo00OooO0O0;
    }

    @Override // p103o000oo00.o0000OO0
    @Nullable
    public final synchronized o000OO00 OooO0OO() {
        OooOOo();
        return this.f35696OooO0oo;
    }

    @Override // p103o000oo00.o0000OO0
    @Nullable
    public final o0000OO0.OooO00o OooO0oO() {
        return this.f35694OooO0o0;
    }

    public final void OooOOo() {
        if (!(!this.f35693OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // p103o000oo00.o0000OO0
    @NotNull
    public final synchronized o0000 OooOOo0() {
        OooOOo();
        o0000 o0000Var = this.f35695OooO0oO;
        if (o0000Var != null) {
            return o0000Var;
        }
        o000O00O o000o00o2 = o0000O0O.f60198OooO00o;
        o000OO00 o000oo01 = this.f35696OooO0oo;
        Intrinsics.checkNotNull(o000oo01);
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000o00o2.OooOO0o(o000oo01));
        this.f35695OooO0oO = o00o0000OooO0O0;
        return o00o0000OooO0O0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f35693OooO0o = true;
        o0000 o0000Var = this.f35695OooO0oO;
        if (o0000Var != null) {
            o000O0O0.OooO00o(o0000Var);
        }
        o000OO00 path = this.f35696OooO0oo;
        if (path != null) {
            o000O00O o000o00o2 = o0000O0O.f60198OooO00o;
            o000o00o2.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            o000o00o2.OooO0Oo(path);
        }
    }
}
