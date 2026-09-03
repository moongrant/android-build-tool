package p655o0ooo0O;

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
import p641o0ooOO0o.o0O000;
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0O0O0o0;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oO00000o;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO000O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f59532OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f59533OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OOo000 f59534OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f59535OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f59536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f59537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f59538OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o0O000> f59539OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f59540OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO00o f59541OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59542OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59543OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public IOException f59544OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public ErrorCode f59545OooOOO0;

    public final class OooO00o implements ooo0Oo0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f59546OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f59547OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final oo0OOoo f59548OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ oO000O0 f59549OooO0oO;

        public OooO00o(oO000O0 this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59549OooO0oO = this$0;
            this.f59546OooO0Oo = z;
            this.f59548OooO0o0 = new oo0OOoo();
        }

        public final void OooO00o(boolean z) throws IOException {
            long jMin;
            boolean z2;
            oO000O0 oo000o0 = this.f59549OooO0oO;
            synchronized (oo000o0) {
                oo000o0.f59543OooOO0o.OooO();
                while (oo000o0.f59538OooO0o0 >= oo000o0.f59537OooO0o && !this.f59546OooO0Oo && !this.f59547OooO0o && oo000o0.OooO0o() == null) {
                    try {
                        oo000o0.OooOO0o();
                    } catch (Throwable th) {
                        oo000o0.f59543OooOO0o.OooOOO0();
                        throw th;
                    }
                }
                oo000o0.f59543OooOO0o.OooOOO0();
                oo000o0.OooO0O0();
                jMin = Math.min(oo000o0.f59537OooO0o - oo000o0.f59538OooO0o0, this.f59548OooO0o0.f59828OooO0o0);
                oo000o0.f59538OooO0o0 += jMin;
                z2 = z && jMin == this.f59548OooO0o0.f59828OooO0o0;
                Unit unit = Unit.INSTANCE;
            }
            this.f59549OooO0oO.f59543OooOO0o.OooO();
            try {
                oO000O0 oo000o1 = this.f59549OooO0oO;
                oo000o1.f59534OooO0O0.OooOooo(oo000o1.f59533OooO00o, z2, this.f59548OooO0o0, jMin);
            } finally {
                this.f59549OooO0oO.f59543OooOO0o.OooOOO0();
            }
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            oO000O0 oo000o0 = this.f59549OooO0oO;
            byte[] bArr = oO000o00.f58124OooO00o;
            synchronized (oo000o0) {
                if (this.f59547OooO0o) {
                    return;
                }
                boolean z = oo000o0.OooO0o() == null;
                Unit unit = Unit.INSTANCE;
                oO000O0 oo000o1 = this.f59549OooO0oO;
                if (!oo000o1.f59541OooOO0.f59546OooO0Oo) {
                    if (this.f59548OooO0o0.f59828OooO0o0 > 0) {
                        while (this.f59548OooO0o0.f59828OooO0o0 > 0) {
                            OooO00o(true);
                        }
                    } else if (z) {
                        oo000o1.f59534OooO0O0.OooOooo(oo000o1.f59533OooO00o, true, null, 0L);
                    }
                }
                synchronized (this.f59549OooO0oO) {
                    this.f59547OooO0o = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                this.f59549OooO0oO.f59534OooO0O0.f59476OooOoo0.flush();
                this.f59549OooO0oO.OooO00o();
            }
        }

        @Override // p662o0oooO0O.ooo0Oo0, java.io.Flushable
        public final void flush() throws IOException {
            oO000O0 oo000o0 = this.f59549OooO0oO;
            byte[] bArr = oO000o00.f58124OooO00o;
            synchronized (oo000o0) {
                oo000o0.OooO0O0();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f59548OooO0o0.f59828OooO0o0 > 0) {
                OooO00o(false);
                this.f59549OooO0oO.f59534OooO0O0.f59476OooOoo0.flush();
            }
        }

        @Override // p662o0oooO0O.ooo0Oo0
        @NotNull
        public final oO00000o timeout() {
            return this.f59549OooO0oO.f59543OooOO0o;
        }

        @Override // p662o0oooO0O.ooo0Oo0
        public final void write(@NotNull oo0OOoo source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = oO000o00.f58124OooO00o;
            oo0OOoo oo0oooo = this.f59548OooO0o0;
            oo0oooo.write(source, j);
            while (oo0oooo.f59828OooO0o0 >= 16384) {
                OooO00o(false);
            }
        }
    }

    public final class OooO0O0 implements oO00000 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ oO000O0 f59550OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f59551OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final oo0OOoo f59552OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f59553OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final oo0OOoo f59554OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f59555OooO0oo;

        public OooO0O0(oO000O0 this$0, long j, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59550OooO = this$0;
            this.f59551OooO0Oo = j;
            this.f59553OooO0o0 = z;
            this.f59552OooO0o = new oo0OOoo();
            this.f59554OooO0oO = new oo0OOoo();
        }

        public final void OooO00o(long j) {
            byte[] bArr = oO000o00.f58124OooO00o;
            this.f59550OooO.f59534OooO0O0.OooOo(j);
        }

        @Override // p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo sink, long j) throws Throwable {
            Throwable streamResetException;
            boolean z;
            long jOooOO0O;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j2 = 0;
            if (!(j >= 0)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            while (true) {
                oO000O0 oo000o0 = this.f59550OooO;
                synchronized (oo000o0) {
                    oo000o0.f59542OooOO0O.OooO();
                    try {
                        if (oo000o0.OooO0o() != null) {
                            streamResetException = oo000o0.f59544OooOOO;
                            if (streamResetException == null) {
                                ErrorCode errorCodeOooO0o = oo000o0.OooO0o();
                                Intrinsics.checkNotNull(errorCodeOooO0o);
                                streamResetException = new StreamResetException(errorCodeOooO0o);
                            }
                        } else {
                            streamResetException = null;
                        }
                        if (this.f59555OooO0oo) {
                            throw new IOException("stream closed");
                        }
                        oo0OOoo oo0oooo = this.f59554OooO0oO;
                        long j3 = oo0oooo.f59828OooO0o0;
                        if (j3 > j2) {
                            jOooOO0O = oo0oooo.OooOO0O(sink, Math.min(j, j3));
                            long j4 = oo000o0.f59535OooO0OO + jOooOO0O;
                            oo000o0.f59535OooO0OO = j4;
                            long j5 = j4 - oo000o0.f59536OooO0Oo;
                            if (streamResetException == null && j5 >= oo000o0.f59534OooO0O0.f59468OooOo0.OooO00o() / 2) {
                                oo000o0.f59534OooO0O0.Oooo0(oo000o0.f59533OooO00o, j5);
                                oo000o0.f59536OooO0Oo = oo000o0.f59535OooO0OO;
                            }
                            z = false;
                        } else {
                            if (this.f59553OooO0o0 || streamResetException != null) {
                                z = false;
                            } else {
                                oo000o0.OooOO0o();
                                z = true;
                            }
                            jOooOO0O = -1;
                        }
                        oo000o0.f59542OooOO0O.OooOOO0();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        oo000o0.f59542OooOO0O.OooOOO0();
                        throw th;
                    }
                    throw th;
                }
                if (!z) {
                    if (jOooOO0O != -1) {
                        OooO00o(jOooOO0O);
                        return jOooOO0O;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j2 = 0;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            oO000O0 oo000o0 = this.f59550OooO;
            synchronized (oo000o0) {
                this.f59555OooO0oo = true;
                oo0OOoo oo0oooo = this.f59554OooO0oO;
                j = oo0oooo.f59828OooO0o0;
                oo0oooo.OooO0oO();
                oo000o0.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j > 0) {
                OooO00o(j);
            }
            this.f59550OooO.OooO00o();
        }

        @Override // p662o0oooO0O.oO00000
        @NotNull
        public final oO00000o timeout() {
            return this.f59550OooO.f59542OooOO0O;
        }
    }

    public final class OooO0OO extends o0O0O0o0 {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ oO000O0 f59556OooOO0O;

        public OooO0OO(oO000O0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59556OooOO0O = this$0;
        }

        @Override // p662o0oooO0O.o0O0O0o0
        @NotNull
        public final IOException OooOO0O(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // p662o0oooO0O.o0O0O0o0
        public final void OooOO0o() {
            this.f59556OooOO0O.OooO0o0(ErrorCode.CANCEL);
            o0OOo000 o0ooo001 = this.f59556OooOO0O.f59534OooO0O0;
            synchronized (o0ooo001) {
                long j = o0ooo001.f59466OooOOoo;
                long j2 = o0ooo001.f59464OooOOo;
                if (j < j2) {
                    return;
                }
                o0ooo001.f59464OooOOo = j2 + 1;
                o0ooo001.f59469OooOo00 = System.nanoTime() + ((long) 1000000000);
                Unit unit = Unit.INSTANCE;
                o0ooo001.f59459OooOO0o.OooO0OO(new oO0000Oo(Intrinsics.stringPlus(o0ooo001.f59455OooO0oO, " ping"), o0ooo001), 0L);
            }
        }

        public final void OooOOO0() throws IOException {
            if (OooOO0()) {
                throw OooOO0O(null);
            }
        }
    }

    public oO000O0(int i, @NotNull o0OOo000 connection, boolean z, boolean z2, @Nullable o0O000 o0o001) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f59533OooO00o = i;
        this.f59534OooO0O0 = connection;
        this.f59537OooO0o = connection.f59470OooOo0O.OooO00o();
        ArrayDeque<o0O000> arrayDeque = new ArrayDeque<>();
        this.f59539OooO0oO = arrayDeque;
        this.f59532OooO = new OooO0O0(this, connection.f59468OooOo0.OooO00o(), z2);
        this.f59541OooOO0 = new OooO00o(this, z);
        this.f59542OooOO0O = new OooO0OO(this);
        this.f59543OooOO0o = new OooO0OO(this);
        if (o0o001 == null) {
            if (!OooO0oo()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!OooO0oo())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(o0o001);
        }
    }

    public final synchronized boolean OooO() {
        if (this.f59545OooOOO0 != null) {
            return false;
        }
        OooO0O0 oooO0O0 = this.f59532OooO;
        if (oooO0O0.f59553OooO0o0 || oooO0O0.f59555OooO0oo) {
            OooO00o oooO00o = this.f59541OooOO0;
            if ((oooO00o.f59546OooO0Oo || oooO00o.f59547OooO0o) && this.f59540OooO0oo) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0019  */
    public final void OooO00o() throws IOException {
        boolean z;
        boolean zOooO;
        byte[] bArr = oO000o00.f58124OooO00o;
        synchronized (this) {
            OooO0O0 oooO0O0 = this.f59532OooO;
            if (oooO0O0.f59553OooO0o0 || !oooO0O0.f59555OooO0oo) {
                z = false;
            } else {
                OooO00o oooO00o = this.f59541OooOO0;
                if (oooO00o.f59546OooO0Oo || oooO00o.f59547OooO0o) {
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
            this.f59534OooO0O0.OooOo00(this.f59533OooO00o);
        }
    }

    public final void OooO0O0() throws IOException {
        OooO00o oooO00o = this.f59541OooOO0;
        if (oooO00o.f59547OooO0o) {
            throw new IOException("stream closed");
        }
        if (oooO00o.f59546OooO0Oo) {
            throw new IOException("stream finished");
        }
        if (this.f59545OooOOO0 != null) {
            IOException iOException = this.f59544OooOOO;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f59545OooOOO0;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void OooO0OO(@NotNull ErrorCode statusCode, @Nullable IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (OooO0Oo(statusCode, iOException)) {
            o0OOo000 o0ooo001 = this.f59534OooO0O0;
            o0ooo001.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            o0ooo001.f59476OooOoo0.OooOo00(this.f59533OooO00o, statusCode);
        }
    }

    public final boolean OooO0Oo(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = oO000o00.f58124OooO00o;
        synchronized (this) {
            if (OooO0o() != null) {
                return false;
            }
            if (this.f59532OooO.f59553OooO0o0 && this.f59541OooOO0.f59546OooO0Oo) {
                return false;
            }
            this.f59545OooOOO0 = errorCode;
            this.f59544OooOOO = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.f59534OooO0O0.OooOo00(this.f59533OooO00o);
            return true;
        }
    }

    @Nullable
    public final synchronized ErrorCode OooO0o() {
        return this.f59545OooOOO0;
    }

    public final void OooO0o0(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (OooO0Oo(errorCode, null)) {
            this.f59534OooO0O0.Oooo00o(this.f59533OooO00o, errorCode);
        }
    }

    @NotNull
    public final OooO00o OooO0oO() {
        synchronized (this) {
            if (!(this.f59540OooO0oo || OooO0oo())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        return this.f59541OooOO0;
    }

    public final boolean OooO0oo() {
        return this.f59534OooO0O0.f59452OooO0Oo == ((this.f59533OooO00o & 1) == 1);
    }

    public final void OooOO0(@NotNull o0O000 headers, boolean z) {
        boolean zOooO;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = oO000o00.f58124OooO00o;
        synchronized (this) {
            if (this.f59540OooO0oo && z) {
                this.f59532OooO.getClass();
            } else {
                this.f59540OooO0oo = true;
                this.f59539OooO0oO.add(headers);
            }
            if (z) {
                this.f59532OooO.f59553OooO0o0 = true;
            }
            zOooO = OooO();
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
        if (zOooO) {
            return;
        }
        this.f59534OooO0O0.OooOo00(this.f59533OooO00o);
    }

    public final synchronized void OooOO0O(@NotNull ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f59545OooOOO0 == null) {
            this.f59545OooOOO0 = errorCode;
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
