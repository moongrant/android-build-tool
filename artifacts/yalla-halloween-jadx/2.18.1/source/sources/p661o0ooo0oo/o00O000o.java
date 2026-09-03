package p661o0ooo0oo;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends o0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f51499Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Function1<IOException, Unit> f51500Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O000o(@NotNull o0O00o00 delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f51500Oooo0oO = onException;
    }

    @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f51499Oooo0o) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.f51499Oooo0o = true;
            this.f51500Oooo0oO.invoke(e);
        }
    }

    @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00, java.io.Flushable
    public final void flush() {
        if (this.f51499Oooo0o) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.f51499Oooo0o = true;
            this.f51500Oooo0oO.invoke(e);
        }
    }

    @Override // p674o0oooo0.o0, p674o0oooo0.o0O00o00
    public final void write(@NotNull o0oOO source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f51499Oooo0o) {
            source.skip(j);
            return;
        }
        try {
            super.write(source, j);
        } catch (IOException e) {
            this.f51499Oooo0o = true;
            this.f51500Oooo0oO.invoke(e);
        }
    }
}
