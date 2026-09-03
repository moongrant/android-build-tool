package p103o000oo00;

import java.io.Closeable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o0O0ooO.o000O0O0;
import p659o0oooO00.o0000;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends o0000OO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f35720OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000OO00 f35721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f35722OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000O0O f35723OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Closeable f35724OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o0000OO0.OooO00o f35725OooO0oo = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00O0000 f35726OooOO0;

    public oo000o(@NotNull o000OO00 o000oo01, @NotNull o0000O0O o0000o0o2, @Nullable String str, @Nullable Closeable closeable) {
        this.f35721OooO0Oo = o000oo01;
        this.f35723OooO0o0 = o0000o0o2;
        this.f35722OooO0o = str;
        this.f35724OooO0oO = closeable;
    }

    @Override // p103o000oo00.o0000OO0
    @NotNull
    public final synchronized o000OO00 OooO00o() {
        if (!(!this.f35720OooO)) {
            throw new IllegalStateException("closed".toString());
        }
        return this.f35721OooO0Oo;
    }

    @Override // p103o000oo00.o0000OO0
    @NotNull
    public final o000OO00 OooO0OO() {
        return OooO00o();
    }

    @Override // p103o000oo00.o0000OO0
    @Nullable
    public final o0000OO0.OooO00o OooO0oO() {
        return this.f35725OooO0oo;
    }

    @Override // p103o000oo00.o0000OO0
    @NotNull
    public final synchronized o0000 OooOOo0() {
        if (!(!this.f35720OooO)) {
            throw new IllegalStateException("closed".toString());
        }
        o00O0000 o00o0001 = this.f35726OooOO0;
        if (o00o0001 != null) {
            return o00o0001;
        }
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(this.f35723OooO0o0.OooOO0o(this.f35721OooO0Oo));
        this.f35726OooOO0 = o00o0000OooO0O0;
        return o00o0000OooO0O0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f35720OooO = true;
        o00O0000 o00o0001 = this.f35726OooOO0;
        if (o00o0001 != null) {
            o000O0O0.OooO00o(o00o0001);
        }
        Closeable closeable = this.f35724OooO0oO;
        if (closeable != null) {
            o000O0O0.OooO00o(closeable);
        }
    }
}
