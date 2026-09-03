package p224o00oOOo;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0oO0;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends oo0oO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function1<IOException, Unit> f39668OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f39669OooO0o0;

    public o0O0O00(@NotNull ooo0Oo0 ooo0oo0, @NotNull oo0o0Oo oo0o0oo) {
        super(ooo0oo0);
        this.f39668OooO0Oo = oo0o0oo;
    }

    @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f39669OooO0o0 = true;
            this.f39668OooO0Oo.invoke(e);
        }
    }

    @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f39669OooO0o0 = true;
            this.f39668OooO0Oo.invoke(e);
        }
    }

    @Override // p662o0oooO0O.oo0oO0, p662o0oooO0O.ooo0Oo0
    public final void write(@NotNull oo0OOoo oo0oooo, long j) throws EOFException {
        if (this.f39669OooO0o0) {
            oo0oooo.skip(j);
            return;
        }
        try {
            super.write(oo0oooo, j);
        } catch (IOException e) {
            this.f39669OooO0o0 = true;
            this.f39668OooO0Oo.invoke(e);
        }
    }
}
