package p416o0Oo0oO0;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p412o0Oo0o00.o000;
import p412o0Oo0o00.o0000;
import p412o0Oo0o00.o0000O00;
import p412o0Oo0o00.o000O0o;
import p412o0Oo0o00.o000OO;
import p413o0Oo0o0O.o000000;
import p674o0oooo0.o0O0000O;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00O;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oO0O0o;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O00 f39620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f39621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Socket f39622OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O00OO f39623OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00O f39625OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39624OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f39626OooO0oO = 0;

    public class OooO extends OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f39627Oooo;

        public OooO(long j) throws IOException {
            super();
            this.f39627Oooo = j;
            if (j == 0) {
                OooO00o(true);
            }
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f39630Oooo0oO) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f39627Oooo;
            if (j2 == 0) {
                return -1L;
            }
            long jOooo0O0 = o0ooOOo.this.f39623OooO0Oo.Oooo0O0(o0ooo2, Math.min(j2, j));
            if (jOooo0O0 == -1) {
                OooO0O0();
                throw new ProtocolException("unexpected end of stream");
            }
            long j3 = this.f39627Oooo - jOooo0O0;
            this.f39627Oooo = j3;
            if (j3 == 0) {
                OooO00o(true);
            }
            return jOooo0O0;
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f39630Oooo0oO) {
                return;
            }
            if (this.f39627Oooo != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!o000000.OooO0o0(this)) {
                    OooO0O0();
                }
            }
            this.f39630Oooo0oO = true;
        }
    }

    public abstract class OooO00o implements o0O0O0O {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0O0000O f39629Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f39630Oooo0oO;

        public OooO00o() {
            this.f39629Oooo0o = new o0O0000O(o0ooOOo.this.f39623OooO0Oo.timeout());
        }

        public final void OooO00o(boolean z) throws IOException {
            o0ooOOo o0ooooo2 = o0ooOOo.this;
            if (o0ooooo2.f39624OooO0o != 5) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
                sbOooO0o0.append(o0ooOOo.this.f39624OooO0o);
                throw new IllegalStateException(sbOooO0o0.toString());
            }
            o0ooOOo.OooO00o(o0ooooo2, this.f39629Oooo0o);
            o0ooOOo o0ooooo3 = o0ooOOo.this;
            o0ooooo3.f39624OooO0o = 0;
            if (z && o0ooooo3.f39626OooO0oO == 1) {
                o0ooooo3.f39626OooO0oO = 0;
                p413o0Oo0o0O.o0ooOOo.f39374OooO0O0.OooO00o(o0ooooo3.f39620OooO00o, o0ooooo3.f39621OooO0O0);
            } else if (o0ooooo3.f39626OooO0oO == 2) {
                o0ooooo3.f39624OooO0o = 6;
                o0ooooo3.f39621OooO0O0.f39204OooO0OO.close();
            }
        }

        public final void OooO0O0() {
            o000000.OooO0Oo(o0ooOOo.this.f39621OooO0O0.f39204OooO0OO);
            o0ooOOo.this.f39624OooO0o = 6;
        }

        @Override // p674o0oooo0.o0O0O0O
        public final o0oO0O0o timeout() {
            return this.f39629Oooo0o;
        }
    }

    public final class OooO0O0 implements o0O00o00 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0O0000O f39632Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f39633Oooo0oO;

        public OooO0O0() {
            this.f39632Oooo0o = new o0O0000O(o0ooOOo.this.f39625OooO0o0.timeout());
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() throws IOException {
            if (this.f39633Oooo0oO) {
                return;
            }
            this.f39633Oooo0oO = true;
            o0ooOOo.this.f39625OooO0o0.OoooOoo("0\r\n\r\n");
            o0ooOOo.OooO00o(o0ooOOo.this, this.f39632Oooo0o);
            o0ooOOo.this.f39624OooO0o = 3;
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final synchronized void flush() throws IOException {
            if (this.f39633Oooo0oO) {
                return;
            }
            o0ooOOo.this.f39625OooO0o0.flush();
        }

        @Override // p674o0oooo0.o0O00o00
        public final o0oO0O0o timeout() {
            return this.f39632Oooo0o;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(o0oOO o0ooo2, long j) throws IOException {
            if (this.f39633Oooo0oO) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            o0ooOOo.this.f39625OooO0o0.Ooooooo(j);
            o0ooOOo.this.f39625OooO0o0.OoooOoo("\r\n");
            o0ooOOo.this.f39625OooO0o0.write(o0ooo2, j);
            o0ooOOo.this.f39625OooO0o0.OoooOoo("\r\n");
        }
    }

    public class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f39635Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final o0Oo0oo f39636OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f39637OoooO00;

        public OooO0OO(o0Oo0oo o0oo0oo2) throws IOException {
            super();
            this.f39635Oooo = -1L;
            this.f39637OoooO00 = true;
            this.f39636OoooO0 = o0oo0oo2;
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f39630Oooo0oO) {
                throw new IllegalStateException("closed");
            }
            if (!this.f39637OoooO00) {
                return -1L;
            }
            long j2 = this.f39635Oooo;
            if (j2 == 0 || j2 == -1) {
                if (j2 != -1) {
                    o0ooOOo.this.f39623OooO0Oo.o0ooOO0();
                }
                try {
                    this.f39635Oooo = o0ooOOo.this.f39623OooO0Oo.o000OO();
                    String strTrim = o0ooOOo.this.f39623OooO0Oo.o0ooOO0().trim();
                    if (this.f39635Oooo < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f39635Oooo + strTrim + "\"");
                    }
                    if (this.f39635Oooo == 0) {
                        this.f39637OoooO00 = false;
                        o000OO.OooO00o oooO00o = new o000OO.OooO00o();
                        o0ooOOo.this.OooO0OO(oooO00o);
                        this.f39636OoooO0.OooO0oo(new o000OO(oooO00o));
                        OooO00o(true);
                    }
                    if (!this.f39637OoooO00) {
                        return -1L;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long jOooo0O0 = o0ooOOo.this.f39623OooO0Oo.Oooo0O0(o0ooo2, Math.min(j, this.f39635Oooo));
            if (jOooo0O0 != -1) {
                this.f39635Oooo -= jOooo0O0;
                return jOooo0O0;
            }
            OooO0O0();
            throw new ProtocolException("unexpected end of stream");
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f39630Oooo0oO) {
                return;
            }
            if (this.f39637OoooO00) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!o000000.OooO0o0(this)) {
                    OooO0O0();
                }
            }
            this.f39630Oooo0oO = true;
        }
    }

    public final class OooO0o implements o0O00o00 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0O0000O f39640Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f39641Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public long f39642Oooo0oo;

        public OooO0o(long j) {
            this.f39640Oooo0o = new o0O0000O(o0ooOOo.this.f39625OooO0o0.timeout());
            this.f39642Oooo0oo = j;
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f39641Oooo0oO) {
                return;
            }
            this.f39641Oooo0oO = true;
            if (this.f39642Oooo0oo > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            o0ooOOo.OooO00o(o0ooOOo.this, this.f39640Oooo0o);
            o0ooOOo.this.f39624OooO0o = 3;
        }

        @Override // p674o0oooo0.o0O00o00, java.io.Flushable
        public final void flush() throws IOException {
            if (this.f39641Oooo0oO) {
                return;
            }
            o0ooOOo.this.f39625OooO0o0.flush();
        }

        @Override // p674o0oooo0.o0O00o00
        public final o0oO0O0o timeout() {
            return this.f39640Oooo0o;
        }

        @Override // p674o0oooo0.o0O00o00
        public final void write(o0oOO o0ooo2, long j) throws IOException {
            if (this.f39641Oooo0oO) {
                throw new IllegalStateException("closed");
            }
            o000000.OooO00o(o0ooo2.f52099Oooo0oO, j);
            if (j <= this.f39642Oooo0oo) {
                o0ooOOo.this.f39625OooO0o0.write(o0ooo2, j);
                this.f39642Oooo0oo -= j;
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("expected ");
                sbOooO0o0.append(this.f39642Oooo0oo);
                sbOooO0o0.append(" bytes but received ");
                sbOooO0o0.append(j);
                throw new ProtocolException(sbOooO0o0.toString());
            }
        }
    }

    public class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f39643Oooo;

        public OooOO0() {
            super();
        }

        @Override // p674o0oooo0.o0O0O0O
        public final long Oooo0O0(o0oOO o0ooo2, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException(androidx.viewpager2.adapter.OooO00o.OooO00o("byteCount < 0: ", j));
            }
            if (this.f39630Oooo0oO) {
                throw new IllegalStateException("closed");
            }
            if (this.f39643Oooo) {
                return -1L;
            }
            long jOooo0O0 = o0ooOOo.this.f39623OooO0Oo.Oooo0O0(o0ooo2, j);
            if (jOooo0O0 != -1) {
                return jOooo0O0;
            }
            this.f39643Oooo = true;
            OooO00o(false);
            return -1L;
        }

        @Override // p674o0oooo0.o0O0O0O, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f39630Oooo0oO) {
                return;
            }
            if (!this.f39643Oooo) {
                OooO0O0();
            }
            this.f39630Oooo0oO = true;
        }
    }

    public o0ooOOo(o0000O00 o0000o00, o0000 o0000Var, Socket socket) throws IOException {
        this.f39620OooO00o = o0000o00;
        this.f39621OooO0O0 = o0000Var;
        this.f39622OooO0OO = socket;
        this.f39623OooO0Oo = (o0O00OO) o0O000Oo.OooO0OO(o0O000Oo.OooOO0(socket));
        this.f39625OooO0o0 = (o0O00O) o0O000Oo.OooO0O0(o0O000Oo.OooO0o(socket));
    }

    public static void OooO00o(o0ooOOo o0ooooo2, o0O0000O o0o0000o2) {
        Objects.requireNonNull(o0ooooo2);
        o0oO0O0o o0oo0o0o2 = o0o0000o2.f52048OooO0o0;
        o0oO0O0o.OooO00o delegate = o0oO0O0o.f52090OooO0Oo;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        o0o0000o2.f52048OooO0o0 = delegate;
        o0oo0o0o2.OooO00o();
        o0oo0o0o2.OooO0O0();
    }

    public final o0O0O0O OooO0O0(long j) throws IOException {
        if (this.f39624OooO0o == 4) {
            this.f39624OooO0o = 5;
            return new OooO(j);
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
        sbOooO0o0.append(this.f39624OooO0o);
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    public final void OooO0OO(o000OO.OooO00o oooO00o) throws IOException {
        while (true) {
            String strO0ooOO0 = this.f39623OooO0Oo.o0ooOO0();
            if (strO0ooOO0.length() == 0) {
                return;
            }
            Objects.requireNonNull(p413o0Oo0o0O.o0ooOOo.f39374OooO0O0);
            oooO00o.OooO0O0(strO0ooOO0);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final o000O0o.OooO00o OooO0Oo() throws IOException {
        o00000O0 o00000o0OooO00o;
        o000O0o.OooO00o oooO00o;
        int i = this.f39624OooO0o;
        if (i != 1 && i != 3) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(this.f39624OooO0o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        do {
            try {
                o00000o0OooO00o = o00000O0.OooO00o(this.f39623OooO0Oo.o0ooOO0());
                oooO00o = new o000O0o.OooO00o();
                oooO00o.f39325OooO0O0 = o00000o0OooO00o.f39575OooO00o;
                oooO00o.f39326OooO0OO = o00000o0OooO00o.f39576OooO0O0;
                oooO00o.f39327OooO0Oo = o00000o0OooO00o.f39577OooO0OO;
                o000OO.OooO00o oooO00o2 = new o000OO.OooO00o();
                OooO0OO(oooO00o2);
                oooO00o2.OooO00o(o0O0O00.f39588OooO0Oo, o00000o0OooO00o.f39575OooO00o.toString());
                ?? r2 = oooO00o2.f39334OooO00o;
                String[] strArr = (String[]) r2.toArray(new String[r2.size()]);
                o000OO.OooO00o oooO00o3 = new o000OO.OooO00o();
                Collections.addAll(oooO00o3.f39334OooO00o, strArr);
                oooO00o.f39328OooO0o = oooO00o3;
            } catch (EOFException e) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("unexpected end of stream on ");
                sbOooO0o1.append(this.f39621OooO0O0);
                sbOooO0o1.append(" (recycle count=");
                o000.OooO00o oooO00o4 = p413o0Oo0o0O.o0ooOOo.f39374OooO0O0;
                o0000 o0000Var = this.f39621OooO0O0;
                Objects.requireNonNull(oooO00o4);
                IOException iOException = new IOException(o0O0O00.o0ooOOo.OooO00o(sbOooO0o1, o0000Var.f39210OooOO0, ")"));
                iOException.initCause(e);
                throw iOException;
            }
        } while (o00000o0OooO00o.f39576OooO0O0 == 100);
        this.f39624OooO0o = 4;
        return oooO00o;
    }

    public final void OooO0o(o000OO o000oo2, String str) throws IOException {
        if (this.f39624OooO0o != 0) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("state: ");
            sbOooO0o0.append(this.f39624OooO0o);
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        o0O00O o0o00o2 = this.f39625OooO0o0;
        o0o00o2.OoooOoo(str);
        o0o00o2.OoooOoo("\r\n");
        int length = o000oo2.f39333OooO00o.length / 2;
        for (int i = 0; i < length; i++) {
            o0O00O o0o00o3 = this.f39625OooO0o0;
            o0o00o3.OoooOoo(o000oo2.OooO0O0(i));
            o0o00o3.OoooOoo(": ");
            o0o00o3.OoooOoo(o000oo2.OooO0Oo(i));
            o0o00o3.OoooOoo("\r\n");
        }
        this.f39625OooO0o0.OoooOoo("\r\n");
        this.f39624OooO0o = 1;
    }

    public final void OooO0o0(int i, int i2) {
        if (i != 0) {
            this.f39623OooO0Oo.timeout().OooO0oO(i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f39625OooO0o0.timeout().OooO0oO(i2, TimeUnit.MILLISECONDS);
        }
    }
}
