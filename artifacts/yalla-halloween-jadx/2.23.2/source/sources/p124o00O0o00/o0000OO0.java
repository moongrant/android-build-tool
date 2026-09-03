package p124o00O0o00;

import java.io.File;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OO0o00;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends o000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final File f36566OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f36567OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o000OO.OooO00o f36568OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0O0o0 f36569OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o0OOOO00 f36570OooO0oo;

    public o0000OO0(@NotNull o0O0o0 o0o0o0, @NotNull File file, @Nullable o000OO.OooO00o oooO00o) {
        this.f36566OooO0Oo = file;
        this.f36568OooO0o0 = oooO00o;
        this.f36569OooO0oO = o0o0o0;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
        }
    }

    @Override // p124o00O0o00.o000OO
    @NotNull
    public final synchronized o0OOOO00 OooO00o() {
        Long lValueOf;
        OooOo00();
        o0OOOO00 o0oooo01 = this.f36570OooO0oo;
        if (o0oooo01 != null) {
            return o0oooo01;
        }
        String str = o0OOOO00.f59787OooO0o0;
        o0OOOO00 o0oooo00OooO0O0 = o0OOOO00.OooO00o.OooO0O0(File.createTempFile("tmp", null, this.f36566OooO0Oo));
        o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(o0OO000.f59771OooO00o.OooOO0O(o0oooo00OooO0O0));
        try {
            o0O0o0 o0o0o0 = this.f36569OooO0oO;
            Intrinsics.checkNotNull(o0o0o0);
            lValueOf = Long.valueOf(o0ooo000OooO00o.o00Oo0(o0o0o0));
            th = null;
        } catch (Throwable th) {
            th = th;
            lValueOf = null;
        }
        try {
            o0ooo000OooO00o.close();
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
        this.f36569OooO0oO = null;
        this.f36570OooO0oo = o0oooo00OooO0O0;
        return o0oooo00OooO0O0;
    }

    @Override // p124o00O0o00.o000OO
    @Nullable
    public final synchronized o0OOOO00 OooO0OO() {
        OooOo00();
        return this.f36570OooO0oo;
    }

    @Override // p124o00O0o00.o000OO
    @Nullable
    public final o000OO.OooO00o OooO0oO() {
        return this.f36568OooO0o0;
    }

    @Override // p124o00O0o00.o000OO
    @NotNull
    public final synchronized o0O0o0 OooOOo() {
        OooOo00();
        o0O0o0 o0o0o0 = this.f36569OooO0oO;
        if (o0o0o0 != null) {
            return o0o0o0;
        }
        o0OO0o00 o0oo0o01 = o0OO000.f59771OooO00o;
        o0OOOO00 o0oooo01 = this.f36570OooO0oo;
        Intrinsics.checkNotNull(o0oooo01);
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0oo0o01.OooOO0o(o0oooo01));
        this.f36569OooO0oO = o0o0000VarOooO0O0;
        return o0o0000VarOooO0O0;
    }

    public final void OooOo00() {
        if (!(!this.f36567OooO0o)) {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f36567OooO0o = true;
        o0O0o0 o0o0o0 = this.f36569OooO0oO;
        if (o0o0o0 != null) {
            OooOo00.OooO00o(o0o0o0);
        }
        o0OOOO00 path = this.f36570OooO0oo;
        if (path != null) {
            o0OO0o00 o0oo0o01 = o0OO000.f59771OooO00o;
            o0oo0o01.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            o0oo0o01.OooO0Oo(path);
        }
    }
}
