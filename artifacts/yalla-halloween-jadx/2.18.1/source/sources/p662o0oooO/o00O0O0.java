package p662o0oooO;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00O;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0o0Oo;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f51605OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f51606OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f51607OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f51608OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f51609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f51610OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayDeque<o00O> f51611OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f51612OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f51613OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f51614OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ErrorCode f51615OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public IOException f51616OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o00oOoo f51617OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f51618OooOOO0;

    public final class OooO00o implements o0O00o00 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0oOO f51620Oooo0o = new o0oOO();

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f51621Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f51622Oooo0oo;

        public OooO00o(boolean z) {
            this.f51622Oooo0oo = z;
        }

        public final void OooO00o(boolean z) throws IOException {
            long jMin;
            o00O0O0 o00o0o0;
            boolean z2;
            synchronized (o00O0O0.this) {
                o00O0O0.this.f51614OooOO0.OooO();
                while (true) {
                    try {
                        o00O0O0 o00o0o1 = o00O0O0.this;
                        if (o00o0o1.f51608OooO0OO < o00o0o1.f51609OooO0Oo || this.f51622Oooo0oo || this.f51621Oooo0oO || o00o0o1.OooO0o() != null) {
                            break;
                        } else {
                            o00O0O0.this.OooOO0O();
                        }
                    } catch (Throwable th) {
                        o00O0O0.this.f51614OooOO0.OooOOO0();
                        throw th;
                    }
                }
                o00O0O0.this.f51614OooOO0.OooOOO0();
                o00O0O0.this.OooO0O0();
                o00O0O0 o00o0o2 = o00O0O0.this;
                jMin = Math.min(o00o0o2.f51609OooO0Oo - o00o0o2.f51608OooO0OO, this.f51620Oooo0o.f52099Oooo0oO);
                o00o0o0 = o00O0O0.this;
                o00o0o0.f51608OooO0OO += jMin;
                z2 = z && jMin == this.f51620Oooo0o.f52099Oooo0oO;
                Unit unit = Unit.INSTANCE;
            }
            o00o0o0.f51614OooOO0.OooO();
            try {
                o00O0O0 o00o0o3 = o00O0O0.this;
                o00o0o3.f51617OooOOO.OooOOoo(o00o0o3.f51618OooOOO0, z2, this.f51620Oooo0o, jMin);
            } finally {
                o00O0O0.this.f51614OooOO0.OooOOO0();
            }
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o00O0O0 o00o0o0 = o00O0O0.this;
            byte[] bArr = o00OOO00.f51183OooO00o;
            synchronized (o00o0o0) {
                if (this.f51621Oooo0oO) {
                    return;
                }
                boolean z = o00O0O0.this.OooO0o() == null;
                Unit unit = Unit.INSTANCE;
                o00O0O0 o00o0o1 = o00O0O0.this;
                if (!o00o0o1.f51613OooO0oo.f51622Oooo0oo) {
                    if (this.f51620Oooo0o.f52099Oooo0oO > 0) {
                        while (this.f51620Oooo0o.f52099Oooo0oO > 0) {
                            OooO00o(true);
                        }
                    } else if (z) {
                        o00o0o1.f51617OooOOO.OooOOoo(o00o0o1.f51618OooOOO0, true, null, 0L);
                    }
                }
                synchronized (o00O0O0.this) {
                    this.f51621Oooo0oO = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                o00O0O0.this.f51617OooOOO.flush();
                o00O0O0.this.OooO00o();
            }
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final void flush() throws IOException {
            o00O0O0 o00o0o0 = o00O0O0.this;
            byte[] bArr = o00OOO00.f51183OooO00o;
            synchronized (o00o0o0) {
                o00O0O0.this.OooO0O0();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f51620Oooo0o.f52099Oooo0oO > 0) {
                OooO00o(false);
                o00O0O0.this.f51617OooOOO.flush();
            }
        }

        @Override // p674o0oooo0.o0O00o00
        @NotNull
        public final o0oO0O0o timeout() {
            return o00O0O0.this.f51614OooOO0;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(@NotNull o0oOO source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = o00OOO00.f51183OooO00o;
            this.f51620Oooo0o.write(source, j);
            while (this.f51620Oooo0o.f52099Oooo0oO >= 16384) {
                OooO00o(false);
            }
        }
    }

    public final class OooO0O0 implements o0O0O0O {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final long f51623Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o0oOO f51624Oooo0o = new o0oOO();

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final o0oOO f51625Oooo0oO = new o0oOO();

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f51626Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f51628OoooO00;

        public OooO0O0(long j, boolean z) {
            this.f51623Oooo = j;
            this.f51628OoooO00 = z;
        }

        public final void OooO00o(long j) {
            o00O0O0 o00o0o0 = o00O0O0.this;
            byte[] bArr = o00OOO00.f51183OooO00o;
            o00o0o0.f51617OooOOO.OooOOo(j);
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws Throwable {
            long jOooo0O0;
            boolean z;
            long j2;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j3 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j).toString());
            }
            while (true) {
                Throwable streamResetException = null;
                synchronized (o00O0O0.this) {
                    o00O0O0.this.f51605OooO.OooO();
                    try {
                        if (o00O0O0.this.OooO0o() != null && (streamResetException = o00O0O0.this.f51616OooOO0o) == null) {
                            ErrorCode errorCodeOooO0o = o00O0O0.this.OooO0o();
                            Intrinsics.checkNotNull(errorCodeOooO0o);
                            streamResetException = new StreamResetException(errorCodeOooO0o);
                        }
                        if (this.f51626Oooo0oo) {
                            throw new IOException("stream closed");
                        }
                        o0oOO o0ooo2 = this.f51625Oooo0oO;
                        long j4 = o0ooo2.f52099Oooo0oO;
                        if (j4 > j3) {
                            jOooo0O0 = o0ooo2.Oooo0O0(sink, Math.min(j, j4));
                            o00O0O0 o00o0o0 = o00O0O0.this;
                            long j5 = o00o0o0.f51606OooO00o + jOooo0O0;
                            o00o0o0.f51606OooO00o = j5;
                            long j6 = j5 - o00o0o0.f51607OooO0O0;
                            if (streamResetException == null && j6 >= o00o0o0.f51617OooOOO.f51677OooooO0.OooO00o() / 2) {
                                o00O0O0 o00o0o1 = o00O0O0.this;
                                o00o0o1.f51617OooOOO.OooOoOO(o00o0o1.f51618OooOOO0, j6);
                                o00O0O0 o00o0o2 = o00O0O0.this;
                                o00o0o2.f51607OooO0O0 = o00o0o2.f51606OooO00o;
                            }
                        } else {
                            if (this.f51628OoooO00 || streamResetException != null) {
                                jOooo0O0 = -1;
                            } else {
                                o00O0O0.this.OooOO0O();
                                z = true;
                                j2 = -1;
                            }
                            o00O0O0.this.f51605OooO.OooOOO0();
                            Unit unit = Unit.INSTANCE;
                        }
                        j2 = jOooo0O0;
                        z = false;
                        o00O0O0.this.f51605OooO.OooOOO0();
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        o00O0O0.this.f51605OooO.OooOOO0();
                        throw th;
                    }
                    throw th;
                }
                if (!z) {
                    if (j2 != -1) {
                        OooO00o(j2);
                        return j2;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    Intrinsics.checkNotNull(streamResetException);
                    throw streamResetException;
                }
                j3 = 0;
            }
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            synchronized (o00O0O0.this) {
                this.f51626Oooo0oo = true;
                o0oOO o0ooo2 = this.f51625Oooo0oO;
                j = o0ooo2.f52099Oooo0oO;
                o0ooo2.OooO0Oo();
                o00O0O0 o00o0o0 = o00O0O0.this;
                if (o00o0o0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                o00o0o0.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j > 0) {
                OooO00o(j);
            }
            o00O0O0.this.OooO00o();
        }

        @Override // p674o0oooo0.o0O0O0O
        @NotNull
        public final o0oO0O0o timeout() {
            return o00O0O0.this.f51605OooO;
        }
    }

    public final class OooO0OO extends o0o0Oo {
        public OooO0OO() {
        }

        @Override // p674o0oooo0.o0o0Oo
        @NotNull
        public final IOException OooOO0O(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p674o0oooo0.o0o0Oo
        public final void OooOO0o() {
            o00O0O0.this.OooO0o0(ErrorCode.CANCEL);
            o00oOoo o00oooo2 = o00O0O0.this.f51617OooOOO;
            synchronized (o00oooo2) {
                long j = o00oooo2.f51675Ooooo00;
                long j2 = o00oooo2.f51674OoooOoo;
                if (j < j2) {
                    return;
                }
                o00oooo2.f51674OoooOoo = j2 + 1;
                o00oooo2.f51676Ooooo0o = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.INSTANCE;
                o00oooo2.f51669OoooOO0.OooO0OO(new oo00o(OooO.OooO00o(new StringBuilder(), o00oooo2.f51661Oooo, " ping"), o00oooo2), 0L);
            }
        }

        public final void OooOOO0() throws IOException {
            if (OooOO0()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public o00O0O0(int i, @NotNull o00oOoo connection, boolean z, boolean z2, @Nullable o00O o00o2) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f51618OooOOO0 = i;
        this.f51617OooOOO = connection;
        this.f51609OooO0Oo = connection.f51678OooooOO.OooO00o();
        ArrayDeque<o00O> arrayDeque = new ArrayDeque<>();
        this.f51611OooO0o0 = arrayDeque;
        this.f51612OooO0oO = new OooO0O0(connection.f51677OooooO0.OooO00o(), z2);
        this.f51613OooO0oo = new OooO00o(z);
        this.f51605OooO = new OooO0OO();
        this.f51614OooOO0 = new OooO0OO();
        if (o00o2 == null) {
            if (!OooO0oo()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!OooO0oo())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(o00o2);
        }
    }

    public final synchronized boolean OooO() {
        if (this.f51615OooOO0O != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f51612OooO0oO;
        if (oooO0O0.f51628OoooO00 || oooO0O0.f51626Oooo0oo) {
            OooO00o oooO00o = this.f51613OooO0oo;
            if ((oooO00o.f51622Oooo0oo || oooO00o.f51621Oooo0oO) && this.f51610OooO0o) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void OooO00o() throws IOException {
        boolean z;
        boolean zOooO;
        byte[] bArr = o00OOO00.f51183OooO00o;
        synchronized (this) {
            OooO0O0 oooO0O0 = this.f51612OooO0oO;
            if (oooO0O0.f51628OoooO00 || !oooO0O0.f51626Oooo0oo) {
                z = false;
            } else {
                OooO00o oooO00o = this.f51613OooO0oo;
                if (oooO00o.f51622Oooo0oo || oooO00o.f51621Oooo0oO) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zOooO = OooO();
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            OooO0OO(ErrorCode.CANCEL, null);
        } else {
            if (zOooO) {
                return;
            }
            this.f51617OooOOO.OooO0oo(this.f51618OooOOO0);
        }
    }

    public final void OooO0O0() throws IOException {
        OooO00o oooO00o = this.f51613OooO0oo;
        if (oooO00o.f51621Oooo0oO) {
            throw new IOException("stream closed");
        }
        if (oooO00o.f51622Oooo0oo) {
            throw new IOException("stream finished");
        }
        if (this.f51615OooOO0O != null) {
            IOException iOException = this.f51616OooOO0o;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f51615OooOO0O;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void OooO0OO(@NotNull ErrorCode statusCode, @Nullable IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (OooO0Oo(statusCode, iOException)) {
            o00oOoo o00oooo2 = this.f51617OooOOO;
            int i = this.f51618OooOOO0;
            Objects.requireNonNull(o00oooo2);
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            o00oooo2.f51686o0OoOo0.OooO0oo(i, statusCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = o00OOO00.f51183OooO00o;
        synchronized (this) {
            if (this.f51615OooOO0O != null) {
                return false;
            }
            if (this.f51612OooO0oO.f51628OoooO00 && this.f51613OooO0oo.f51622Oooo0oo) {
                return false;
            }
            this.f51615OooOO0O = errorCode;
            this.f51616OooOO0o = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.f51617OooOOO.OooO0oo(this.f51618OooOOO0);
            return true;
        }
    }

    @Nullable
    public final synchronized ErrorCode OooO0o() {
        return this.f51615OooOO0O;
    }

    public final void OooO0o0(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (OooO0Oo(errorCode, null)) {
            this.f51617OooOOO.OooOoO(this.f51618OooOOO0, errorCode);
        }
    }

    @NotNull
    public final o0O00o00 OooO0oO() {
        synchronized (this) {
            if (!(this.f51610OooO0o || OooO0oo())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.f51613OooO0oo;
    }

    public final boolean OooO0oo() {
        return this.f51617OooOOO.f51662Oooo0o == ((this.f51618OooOOO0 & 1) == 1);
    }

    public final void OooOO0(@NotNull o00O headers, boolean z) {
        boolean zOooO;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = o00OOO00.f51183OooO00o;
        synchronized (this) {
            if (this.f51610OooO0o && z) {
                Objects.requireNonNull(this.f51612OooO0oO);
            } else {
                this.f51610OooO0o = true;
                this.f51611OooO0o0.add(headers);
            }
            if (z) {
                this.f51612OooO0oO.f51628OoooO00 = true;
            }
            zOooO = OooO();
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (zOooO) {
            return;
        }
        this.f51617OooOOO.OooO0oo(this.f51618OooOOO0);
    }

    public final void OooOO0O() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
