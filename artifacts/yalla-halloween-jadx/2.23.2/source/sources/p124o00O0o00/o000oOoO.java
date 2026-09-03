package p124o00O0o00;

import java.io.Closeable;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends o000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f36574OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f36575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f36576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OO000 f36577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Closeable f36578OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o000OO.OooO00o f36579OooO0oo = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o0o0000 f36580OooOO0;

    public o000oOoO(@NotNull o0OOOO00 o0oooo01, @NotNull o0OO000 o0oo000, @Nullable String str, @Nullable Closeable closeable) {
        this.f36575OooO0Oo = o0oooo01;
        this.f36577OooO0o0 = o0oo000;
        this.f36576OooO0o = str;
        this.f36578OooO0oO = closeable;
    }

    @Override // p124o00O0o00.o000OO
    @NotNull
    public final synchronized o0OOOO00 OooO00o() {
        if (!(!this.f36574OooO)) {
            throw new IllegalStateException("closed".toString());
        }
        return this.f36575OooO0Oo;
    }

    @Override // p124o00O0o00.o000OO
    @NotNull
    public final o0OOOO00 OooO0OO() {
        return OooO00o();
    }

    @Override // p124o00O0o00.o000OO
    @Nullable
    public final o000OO.OooO00o OooO0oO() {
        return this.f36579OooO0oo;
    }

    @Override // p124o00O0o00.o000OO
    @NotNull
    public final synchronized o0O0o0 OooOOo() {
        if (!(!this.f36574OooO)) {
            throw new IllegalStateException("closed".toString());
        }
        o0o0000 o0o0000Var = this.f36580OooOO0;
        if (o0o0000Var != null) {
            return o0o0000Var;
        }
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(this.f36577OooO0o0.OooOO0o(this.f36575OooO0Oo));
        this.f36580OooOO0 = o0o0000VarOooO0O0;
        return o0o0000VarOooO0O0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f36574OooO = true;
        o0o0000 o0o0000Var = this.f36580OooOO0;
        if (o0o0000Var != null) {
            OooOo00.OooO00o(o0o0000Var);
        }
        Closeable closeable = this.f36578OooO0oO;
        if (closeable != null) {
            OooOo00.OooO00o(closeable);
        }
    }
}
