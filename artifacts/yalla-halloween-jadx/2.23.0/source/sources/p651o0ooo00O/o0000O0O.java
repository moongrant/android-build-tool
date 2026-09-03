package p651o0ooo00O;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o000000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00O00;
import p659o0oooO00.o00O000;
import p659o0oooO00.o00O00O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f59893OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f59894OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000OOo f59895OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f59896OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f59897OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f59898OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f59899OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<oo0O> f59900OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f59901OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO00o f59902OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59903OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59904OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public IOException f59905OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public ErrorCode f59906OooOOO0;

    public final class OooO00o implements o00O000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f59907OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f59908OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o00000O f59909OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O0O f59910OooO0oO;

        public OooO00o(o0000O0O this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59910OooO0oO = this$0;
            this.f59907OooO0Oo = z;
            this.f59909OooO0o0 = new o00000O();
        }

        public final void OooO00o(boolean z) throws IOException {
            long jMin;
            boolean z2;
            o0000O0O o0000o0o2 = this.f59910OooO0oO;
            synchronized (o0000o0o2) {
                o0000o0o2.f59904OooOO0o.OooO();
                while (o0000o0o2.f59899OooO0o0 >= o0000o0o2.f59898OooO0o && !this.f59907OooO0Oo && !this.f59908OooO0o && o0000o0o2.OooO0o() == null) {
                    try {
                        o0000o0o2.OooOO0o();
                    } catch (Throwable th) {
                        o0000o0o2.f59904OooOO0o.OooOOO0();
                        throw th;
                    }
                }
                o0000o0o2.f59904OooOO0o.OooOOO0();
                o0000o0o2.OooO0O0();
                jMin = Math.min(o0000o0o2.f59898OooO0o - o0000o0o2.f59899OooO0o0, this.f59909OooO0o0.f60177OooO0o0);
                o0000o0o2.f59899OooO0o0 += jMin;
                z2 = z && jMin == this.f59909OooO0o0.f60177OooO0o0;
                Unit unit = Unit.INSTANCE;
            }
            this.f59910OooO0oO.f59904OooOO0o.OooO();
            try {
                o0000O0O o0000o0o3 = this.f59910OooO0oO;
                o0000o0o3.f59895OooO0O0.OooOo(o0000o0o3.f59894OooO00o, z2, this.f59909OooO0o0, jMin);
            } finally {
                this.f59910OooO0oO.f59904OooOO0o.OooOOO0();
            }
        }

        @Override // p659o0oooO00.o00O000, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            o0000O0O o0000o0o2 = this.f59910OooO0oO;
            byte[] bArr = o0O000o0.f57386OooO00o;
            synchronized (o0000o0o2) {
                if (this.f59908OooO0o) {
                    return;
                }
                boolean z = o0000o0o2.OooO0o() == null;
                Unit unit = Unit.INSTANCE;
                o0000O0O o0000o0o3 = this.f59910OooO0oO;
                if (!o0000o0o3.f59902OooOO0.f59907OooO0Oo) {
                    if (this.f59909OooO0o0.f60177OooO0o0 > 0) {
                        while (this.f59909OooO0o0.f60177OooO0o0 > 0) {
                            OooO00o(true);
                        }
                    } else if (z) {
                        o0000o0o3.f59895OooO0O0.OooOo(o0000o0o3.f59894OooO00o, true, null, 0L);
                    }
                }
                synchronized (this.f59910OooO0oO) {
                    this.f59908OooO0o = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                this.f59910OooO0oO.f59895OooO0O0.f59963OooOoo0.flush();
                this.f59910OooO0oO.OooO00o();
            }
        }

        @Override // p659o0oooO00.o00O000, java.io.Flushable
        public final void flush() throws IOException {
            o0000O0O o0000o0o2 = this.f59910OooO0oO;
            byte[] bArr = o0O000o0.f57386OooO00o;
            synchronized (o0000o0o2) {
                o0000o0o2.OooO0O0();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f59909OooO0o0.f60177OooO0o0 > 0) {
                OooO00o(false);
                this.f59910OooO0oO.f59895OooO0O0.f59963OooOoo0.flush();
            }
        }

        @Override // p659o0oooO00.o00O000
        @NotNull
        public final o00O00O timeout() {
            return this.f59910OooO0oO.f59904OooOO0o;
        }

        @Override // p659o0oooO00.o00O000
        public final void write(@NotNull o00000O source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = o0O000o0.f57386OooO00o;
            o00000O o00000o = this.f59909OooO0o0;
            o00000o.write(source, j);
            while (o00000o.f60177OooO0o0 >= 16384) {
                OooO00o(false);
            }
        }
    }

    public final class OooO0O0 implements o00O00 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o0000O0O f59911OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f59912OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final o00000O f59913OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59914OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final o00000O f59915OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f59916OooO0oo;

        public OooO0O0(o0000O0O this$0, long j, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59911OooO = this$0;
            this.f59912OooO0Oo = j;
            this.f59914OooO0o0 = z;
            this.f59913OooO0o = new o00000O();
            this.f59915OooO0oO = new o00000O();
        }

        public final void OooO00o(long j) {
            byte[] bArr = o0O000o0.f57386OooO00o;
            this.f59911OooO.f59895OooO0O0.OooOo0(j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            o0000O0O o0000o0o2 = this.f59911OooO;
            synchronized (o0000o0o2) {
                this.f59916OooO0oo = true;
                o00000O o00000o = this.f59915OooO0oO;
                j = o00000o.f60177OooO0o0;
                o00000o.OooO0oO();
                o0000o0o2.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j > 0) {
                OooO00o(j);
            }
            this.f59911OooO.OooO00o();
        }

        @Override // p659o0oooO00.o00O00
        public final long o0000OO0(@NotNull o00000O sink, long j) throws Throwable {
            Throwable streamResetException;
            boolean z;
            long jO0000OO0;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j2 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            while (true) {
                o0000O0O o0000o0o2 = this.f59911OooO;
                synchronized (o0000o0o2) {
                    o0000o0o2.f59903OooOO0O.OooO();
                    try {
                        if (o0000o0o2.OooO0o() != null) {
                            streamResetException = o0000o0o2.f59905OooOOO;
                            if (streamResetException == null) {
                                ErrorCode errorCodeOooO0o = o0000o0o2.OooO0o();
                                Intrinsics.checkNotNull(errorCodeOooO0o);
                                streamResetException = new StreamResetException(errorCodeOooO0o);
                            }
                        } else {
                            streamResetException = null;
                        }
                        if (this.f59916OooO0oo) {
                            throw new IOException("stream closed");
                        }
                        o00000O o00000o = this.f59915OooO0oO;
                        long j3 = o00000o.f60177OooO0o0;
                        if (j3 > j2) {
                            jO0000OO0 = o00000o.o0000OO0(sink, Math.min(j, j3));
                            long j4 = o0000o0o2.f59896OooO0OO + jO0000OO0;
                            o0000o0o2.f59896OooO0OO = j4;
                            long j5 = j4 - o0000o0o2.f59897OooO0Oo;
                            if (streamResetException == null && j5 >= o0000o0o2.f59895OooO0O0.f59955OooOo0.OooO00o() / 2) {
                                o0000o0o2.f59895OooO0O0.Oooo00o(o0000o0o2.f59894OooO00o, j5);
                                o0000o0o2.f59897OooO0Oo = o0000o0o2.f59896OooO0OO;
                            }
                            z = false;
                        } else {
                            if (this.f59914OooO0o0 || streamResetException != null) {
                                z = false;
                            } else {
                                o0000o0o2.OooOO0o();
                                z = true;
                            }
                            jO0000OO0 = -1;
                        }
                        o0000o0o2.f59903OooOO0O.OooOOO0();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        o0000o0o2.f59903OooOO0O.OooOOO0();
                        throw th;
                    }
                    throw th;
                }
                if (!z) {
                    if (jO0000OO0 != -1) {
                        OooO00o(jO0000OO0);
                        return jO0000OO0;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j2 = 0;
            }
        }

        @Override // p659o0oooO00.o00O00
        @NotNull
        public final o00O00O timeout() {
            return this.f59911OooO.f59903OooOO0O;
        }
    }

    public final class OooO0OO extends o000000 {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ o0000O0O f59917OooOO0O;

        public OooO0OO(o0000O0O this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59917OooOO0O = this$0;
        }

        @Override // p659o0oooO00.o000000
        @NotNull
        public final IOException OooOO0O(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p659o0oooO00.o000000
        public final void OooOO0o() {
            this.f59917OooOO0O.OooO0o0(ErrorCode.CANCEL);
            o000OOo o000ooo2 = this.f59917OooOO0O.f59895OooO0O0;
            synchronized (o000ooo2) {
                long j = o000ooo2.f59953OooOOoo;
                long j2 = o000ooo2.f59951OooOOo;
                if (j < j2) {
                    return;
                }
                o000ooo2.f59951OooOOo = j2 + 1;
                o000ooo2.f59956OooOo00 = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.INSTANCE;
                o000ooo2.f59946OooOO0o.OooO0OO(new o0000O00(Intrinsics.stringPlus(o000ooo2.f59942OooO0oO, " ping"), o000ooo2), 0L);
            }
        }

        public final void OooOOO0() throws IOException {
            if (OooOO0()) {
                throw OooOO0O(null);
            }
        }
    }

    public o0000O0O(int i, @NotNull o000OOo connection, boolean z, boolean z2, @Nullable oo0O oo0o) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f59894OooO00o = i;
        this.f59895OooO0O0 = connection;
        this.f59898OooO0o = connection.f59957OooOo0O.OooO00o();
        ArrayDeque<oo0O> arrayDeque = new ArrayDeque<>();
        this.f59900OooO0oO = arrayDeque;
        this.f59893OooO = new OooO0O0(this, connection.f59955OooOo0.OooO00o(), z2);
        this.f59902OooOO0 = new OooO00o(this, z);
        this.f59903OooOO0O = new OooO0OO(this);
        this.f59904OooOO0o = new OooO0OO(this);
        if (oo0o == null) {
            if (!OooO0oo()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!OooO0oo())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(oo0o);
        }
    }

    public final synchronized boolean OooO() {
        if (this.f59906OooOOO0 != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f59893OooO;
        if (oooO0O0.f59914OooO0o0 || oooO0O0.f59916OooO0oo) {
            OooO00o oooO00o = this.f59902OooOO0;
            if ((oooO00o.f59907OooO0Oo || oooO00o.f59908OooO0o) && this.f59901OooO0oo) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void OooO00o() throws IOException {
        boolean z;
        boolean zOooO;
        byte[] bArr = o0O000o0.f57386OooO00o;
        synchronized (this) {
            OooO0O0 oooO0O0 = this.f59893OooO;
            if (oooO0O0.f59914OooO0o0 || !oooO0O0.f59916OooO0oo) {
                z = false;
            } else {
                OooO00o oooO00o = this.f59902OooOO0;
                if (oooO00o.f59907OooO0Oo || oooO00o.f59908OooO0o) {
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
            this.f59895OooO0O0.OooOOo(this.f59894OooO00o);
        }
    }

    public final void OooO0O0() throws IOException {
        OooO00o oooO00o = this.f59902OooOO0;
        if (oooO00o.f59908OooO0o) {
            throw new IOException("stream closed");
        }
        if (oooO00o.f59907OooO0Oo) {
            throw new IOException("stream finished");
        }
        if (this.f59906OooOOO0 != null) {
            IOException iOException = this.f59905OooOOO;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f59906OooOOO0;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void OooO0OO(@NotNull ErrorCode statusCode, @Nullable IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (OooO0Oo(statusCode, iOException)) {
            o000OOo o000ooo2 = this.f59895OooO0O0;
            o000ooo2.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            o000ooo2.f59963OooOoo0.OooOOo(this.f59894OooO00o, statusCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = o0O000o0.f57386OooO00o;
        synchronized (this) {
            if (OooO0o() != null) {
                return false;
            }
            if (this.f59893OooO.f59914OooO0o0 && this.f59902OooOO0.f59907OooO0Oo) {
                return false;
            }
            this.f59906OooOOO0 = errorCode;
            this.f59905OooOOO = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.f59895OooO0O0.OooOOo(this.f59894OooO00o);
            return true;
        }
    }

    @Nullable
    public final synchronized ErrorCode OooO0o() {
        return this.f59906OooOOO0;
    }

    public final void OooO0o0(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (OooO0Oo(errorCode, null)) {
            this.f59895OooO0O0.OooOooO(this.f59894OooO00o, errorCode);
        }
    }

    @NotNull
    public final OooO00o OooO0oO() {
        synchronized (this) {
            if (!(this.f59901OooO0oo || OooO0oo())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.f59902OooOO0;
    }

    public final boolean OooO0oo() {
        return this.f59895OooO0O0.f59939OooO0Oo == ((this.f59894OooO00o & 1) == 1);
    }

    public final void OooOO0(@NotNull oo0O headers, boolean z) {
        boolean zOooO;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = o0O000o0.f57386OooO00o;
        synchronized (this) {
            if (this.f59901OooO0oo && z) {
                this.f59893OooO.getClass();
            } else {
                this.f59901OooO0oo = true;
                this.f59900OooO0oO.add(headers);
            }
            if (z) {
                this.f59893OooO.f59914OooO0o0 = true;
            }
            zOooO = OooO();
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (zOooO) {
            return;
        }
        this.f59895OooO0O0.OooOOo(this.f59894OooO00o);
    }

    public final synchronized void OooOO0O(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f59906OooOOO0 == null) {
            this.f59906OooOOO0 = errorCode;
            notifyAll();
        }
    }

    public final void OooOO0o() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
