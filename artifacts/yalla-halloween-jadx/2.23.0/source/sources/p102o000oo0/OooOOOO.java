package p102o000oo0;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000O;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends o0000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function1<IOException, Unit> f35644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f35645OooO0o0;

    public OooOOOO(@NotNull o00O000 o00o001, @NotNull OooOOO oooOOO) {
        super(o00o001);
        this.f35644OooO0Oo = oooOOO;
    }

    @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.f35645OooO0o0 = true;
            this.f35644OooO0Oo.invoke(e);
        }
    }

    @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            this.f35645OooO0o0 = true;
            this.f35644OooO0Oo.invoke(e);
        }
    }

    @Override // p659o0oooO00.o0000O, p659o0oooO00.o00O000
    public final void write(@NotNull o00000O o00000o, long j) throws EOFException {
        if (this.f35645OooO0o0) {
            o00000o.skip(j);
            return;
        }
        try {
            super.write(o00000o, j);
        } catch (IOException e) {
            this.f35645OooO0o0 = true;
            this.f35644OooO0Oo.invoke(e);
        }
    }
}
