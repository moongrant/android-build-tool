package p414o0Oo0o0o;

import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.ByteString;
import p413o0Oo0o0O.o000000;
import p413o0Oo0o0O.o000OOo;
import p413o0Oo0o0O.o0Oo0oo;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements Closeable {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final ThreadPoolExecutor f39433Oooooo0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Protocol f39435Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f39436Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o000O000 f39437Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f39438OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f39439OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final String f39440OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f39441OoooO0O;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final o000O00 f39443OoooOOO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public long f39445OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final o000O00O f39446OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final o000O00O f39447OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f39448Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final o000O0Oo f39449Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final Socket f39450OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final o00000 f39451OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final Set<Integer> f39452OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final ThreadPoolExecutor f39453o000oOoO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Map<Integer, o0000O0O> f39434Oooo = new HashMap();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public long f39442OoooOO0 = System.nanoTime();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f39444OoooOOo = 0;

    public class OooO00o extends o0Oo0oo {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f39455Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f39456Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Object[] objArr, int i, ErrorCode errorCode) {
            super("OkHttp %s stream %d", objArr);
            this.f39455Oooo0oO = i;
            this.f39456Oooo0oo = errorCode;
        }

        @Override // p413o0Oo0o0O.o0Oo0oo
        public final void OooO00o() {
            try {
                o00000O0 o00000o1 = o00000O0.this;
                o00000o1.f39451OooooOO.o00Ooo(this.f39455Oooo0oO, this.f39456Oooo0oo);
            } catch (IOException unused) {
            }
        }
    }

    public class OooO0O0 extends o0Oo0oo {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f39458Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f39459Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object[] objArr, int i, long j) {
            super("OkHttp Window Update %s stream %d", objArr);
            this.f39458Oooo0oO = i;
            this.f39459Oooo0oo = j;
        }

        @Override // p413o0Oo0o0O.o0Oo0oo
        public final void OooO00o() {
            try {
                o00000O0.this.f39451OooooOO.OooO0oO(this.f39458Oooo0oO, this.f39459Oooo0oo);
            } catch (IOException unused) {
            }
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f39460OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Socket f39461OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Protocol f39462OooO0OO = Protocol.SPDY_3;

        public OooO0OO(String str, Socket socket) throws IOException {
            this.f39460OooO00o = str;
            this.f39461OooO0O0 = socket;
        }
    }

    public class OooO0o extends o0Oo0oo implements o000000O.OooO00o {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o000000O f39463Oooo0oO;

        public OooO0o() {
            super("OkHttp %s", o00000O0.this.f39440OoooO00);
        }

        @Override // p413o0Oo0o0O.o0Oo0oo
        public final void OooO00o() throws Throwable {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    o00000O0 o00000o1 = o00000O0.this;
                    o000000O o000000oOooO00o = o00000o1.f39449Ooooo0o.OooO00o(o0O000Oo.OooO0OO(o0O000Oo.OooOO0(o00000o1.f39450OooooO0)), o00000O0.this.f39436Oooo0oO);
                    this.f39463Oooo0oO = o000000oOooO00o;
                    if (!o00000O0.this.f39436Oooo0oO) {
                        o000000oOooO00o.o00ooo();
                    }
                    while (this.f39463Oooo0oO.o0Oo0oo(this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                    try {
                        try {
                            o00000O0.this.OooO0O0(errorCode2, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                            o00000O0.this.OooO0O0(errorCode4, errorCode4);
                        }
                    } catch (Throwable th) {
                        errorCode = errorCode2;
                        th = th;
                        try {
                            o00000O0.this.OooO0O0(errorCode, errorCode3);
                        } catch (IOException unused2) {
                        }
                        o000000.OooO0OO(this.f39463Oooo0oO);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                errorCode2 = errorCode3;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode3;
                o00000O0.this.OooO0O0(errorCode, errorCode3);
                o000000.OooO0OO(this.f39463Oooo0oO);
                throw th;
            }
            o000000.OooO0OO(this.f39463Oooo0oO);
        }

        public final void OooO0O0(boolean z, int i, o0oOOo o0oooo2, int i2) throws IOException {
            boolean z2;
            boolean z3;
            if (o00000O0.OooO00o(o00000O0.this, i)) {
                o00000O0 o00000o1 = o00000O0.this;
                Objects.requireNonNull(o00000o1);
                o0oOO o0ooo2 = new o0oOO();
                long j = i2;
                o0oooo2.o0000oo(j);
                o0oooo2.Oooo0O0(o0ooo2, j);
                if (o0ooo2.f52099Oooo0oO == j) {
                    o00000o1.f39453o000oOoO.execute(new o0000(o00000o1, new Object[]{o00000o1.f39440OoooO00, Integer.valueOf(i)}, i, o0ooo2, i2, z));
                    return;
                }
                throw new IOException(o0ooo2.f52099Oooo0oO + " != " + i2);
            }
            o0000O0O o0000o0oOooO0Oo = o00000O0.this.OooO0Oo(i);
            if (o0000o0oOooO0Oo == null) {
                o00000O0.this.OooOOoo(i, ErrorCode.INVALID_STREAM);
                o0oooo2.skip(i2);
                return;
            }
            o0000O0O.OooO0O0 oooO0O0 = o0000o0oOooO0Oo.f39490OooO0oO;
            long j2 = i2;
            Objects.requireNonNull(oooO0O0);
            while (j2 > 0) {
                synchronized (o0000O0O.this) {
                    z2 = oooO0O0.f39503OoooO00;
                    z3 = oooO0O0.f39500Oooo0oO.f52099Oooo0oO + j2 > oooO0O0.f39501Oooo0oo;
                }
                if (z3) {
                    o0oooo2.skip(j2);
                    o0000O0O.this.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    o0oooo2.skip(j2);
                    break;
                }
                long jOooo0O0 = o0oooo2.Oooo0O0(oooO0O0.f39499Oooo0o, j2);
                if (jOooo0O0 == -1) {
                    throw new EOFException();
                }
                j2 -= jOooo0O0;
                synchronized (o0000O0O.this) {
                    o0oOO o0ooo3 = oooO0O0.f39500Oooo0oO;
                    boolean z4 = o0ooo3.f52099Oooo0oO == 0;
                    o0ooo3.o0ooOOo(oooO0O0.f39499Oooo0o);
                    if (z4) {
                        o0000O0O.this.notifyAll();
                    }
                }
            }
            if (z) {
                o0000o0oOooO0Oo.OooO0oo();
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
        public final void OooO0OO(int i, ByteString byteString) {
            o0000O0O[] o0000o0oArr;
            byteString.OooO0o0();
            synchronized (o00000O0.this) {
                o0000o0oArr = (o0000O0O[]) o00000O0.this.f39434Oooo.values().toArray(new o0000O0O[o00000O0.this.f39434Oooo.size()]);
                o00000O0.this.f39438OoooO = true;
            }
            for (o0000O0O o0000o0o2 : o0000o0oArr) {
                int i2 = o0000o0o2.f39486OooO0OO;
                if (i2 > i) {
                    if (o0000o0o2.f39487OooO0Oo.f39436Oooo0oO == ((i2 & 1) == 1)) {
                        ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                        synchronized (o0000o0o2) {
                            if (o0000o0o2.f39493OooOO0O == null) {
                                o0000o0o2.f39493OooOO0O = errorCode;
                                o0000o0o2.notifyAll();
                            }
                        }
                        o00000O0.this.OooO0o(o0000o0o2.f39486OooO0OO);
                    } else {
                        continue;
                    }
                }
            }
        }

        /* JADX WARN: Type inference failed for: r11v15, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
        public final void OooO0Oo(boolean z, boolean z2, int i, List list, HeadersMode headersMode) {
            boolean zOooO0oO = true;
            if (o00000O0.OooO00o(o00000O0.this, i)) {
                o00000O0 o00000o1 = o00000O0.this;
                o00000o1.f39453o000oOoO.execute(new o0000Ooo(o00000o1, new Object[]{o00000o1.f39440OoooO00, Integer.valueOf(i)}, i, list, z2));
                return;
            }
            synchronized (o00000O0.this) {
                o00000O0 o00000o2 = o00000O0.this;
                if (o00000o2.f39438OoooO) {
                    return;
                }
                o0000O0O o0000o0oOooO0Oo = o00000o2.OooO0Oo(i);
                if (o0000o0oOooO0Oo == null) {
                    Objects.requireNonNull(headersMode);
                    if (headersMode == HeadersMode.SPDY_REPLY || headersMode == HeadersMode.SPDY_HEADERS) {
                        o00000O0.this.OooOOoo(i, ErrorCode.INVALID_STREAM);
                        return;
                    }
                    o00000O0 o00000o3 = o00000O0.this;
                    if (i <= o00000o3.f39439OoooO0) {
                        return;
                    }
                    if (i % 2 == o00000o3.f39441OoooO0O % 2) {
                        return;
                    }
                    o0000O0O o0000o0o2 = new o0000O0O(i, o00000o3, z, z2, list);
                    o00000O0 o00000o4 = o00000O0.this;
                    o00000o4.f39439OoooO0 = i;
                    o00000o4.f39434Oooo.put(Integer.valueOf(i), o0000o0o2);
                    o00000O0.f39433Oooooo0.execute(new o0000oo(this, new Object[]{o00000O0.this.f39440OoooO00, Integer.valueOf(i)}, o0000o0o2));
                    return;
                }
                Objects.requireNonNull(headersMode);
                if (headersMode == HeadersMode.SPDY_SYN_STREAM) {
                    o0000o0oOooO0Oo.OooO0o0(ErrorCode.PROTOCOL_ERROR);
                    o00000O0.this.OooO0o(i);
                    return;
                }
                ErrorCode errorCode = null;
                synchronized (o0000o0oOooO0Oo) {
                    if (o0000o0oOooO0Oo.f39488OooO0o == null) {
                        if (headersMode == HeadersMode.SPDY_HEADERS) {
                            errorCode = ErrorCode.PROTOCOL_ERROR;
                        } else {
                            o0000o0oOooO0Oo.f39488OooO0o = list;
                            zOooO0oO = o0000o0oOooO0Oo.OooO0oO();
                            o0000o0oOooO0Oo.notifyAll();
                        }
                    } else {
                        if (headersMode == HeadersMode.SPDY_REPLY) {
                            errorCode = ErrorCode.STREAM_IN_USE;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(o0000o0oOooO0Oo.f39488OooO0o);
                            arrayList.addAll(list);
                            o0000o0oOooO0Oo.f39488OooO0o = arrayList;
                        }
                    }
                }
                if (errorCode != null) {
                    o0000o0oOooO0Oo.OooO0o0(errorCode);
                } else if (!zOooO0oO) {
                    o0000o0oOooO0Oo.f39487OooO0Oo.OooO0o(o0000o0oOooO0Oo.f39486OooO0OO);
                }
                if (z2) {
                    o0000o0oOooO0Oo.OooO0oo();
                }
            }
        }

        public final void OooO0o(int i, ErrorCode errorCode) {
            if (o00000O0.OooO00o(o00000O0.this, i)) {
                o00000O0 o00000o1 = o00000O0.this;
                o00000o1.f39453o000oOoO.execute(new o0000O00(o00000o1, new Object[]{o00000o1.f39440OoooO00, Integer.valueOf(i)}, i, errorCode));
                return;
            }
            o0000O0O o0000o0oOooO0o = o00000O0.this.OooO0o(i);
            if (o0000o0oOooO0o != null) {
                synchronized (o0000o0oOooO0o) {
                    if (o0000o0oOooO0o.f39493OooOO0O == null) {
                        o0000o0oOooO0o.f39493OooOO0O = errorCode;
                        o0000o0oOooO0o.notifyAll();
                    }
                }
            }
        }

        public final void OooO0o0(boolean z, int i, int i2) {
            if (z) {
                synchronized (o00000O0.this) {
                }
            } else {
                o00000O0 o00000o1 = o00000O0.this;
                o00000O0.f39433Oooooo0.execute(new o00000O(o00000o1, new Object[]{o00000o1.f39440OoooO00, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
            }
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
        public final void OooO0oO(boolean z, o000O00O o000o00o2) {
            int i;
            o0000O0O[] o0000o0oArr;
            long j;
            synchronized (o00000O0.this) {
                int iOooO0O0 = o00000O0.this.f39447OoooOoo.OooO0O0();
                if (z) {
                    o000O00O o000o00o3 = o00000O0.this.f39447OoooOoo;
                    o000o00o3.f39544OooO0OO = 0;
                    o000o00o3.f39543OooO0O0 = 0;
                    o000o00o3.f39542OooO00o = 0;
                    Arrays.fill(o000o00o3.f39545OooO0Oo, 0);
                }
                o000O00O o000o00o4 = o00000O0.this.f39447OoooOoo;
                Objects.requireNonNull(o000o00o4);
                for (int i2 = 0; i2 < 10; i2++) {
                    if (o000o00o2.OooO0OO(i2)) {
                        o000o00o4.OooO0Oo(i2, o000o00o2.OooO00o(i2), o000o00o2.f39545OooO0Oo[i2]);
                    }
                }
                o00000O0 o00000o1 = o00000O0.this;
                if (o00000o1.f39435Oooo0o == Protocol.HTTP_2) {
                    o00000O0.f39433Oooooo0.execute(new o0000O0(this, new Object[]{o00000o1.f39440OoooO00}, o000o00o2));
                }
                int iOooO0O1 = o00000O0.this.f39447OoooOoo.OooO0O0();
                o0000o0oArr = null;
                if (iOooO0O1 == -1 || iOooO0O1 == iOooO0O0) {
                    j = 0;
                } else {
                    j = iOooO0O1 - iOooO0O0;
                    o00000O0 o00000o2 = o00000O0.this;
                    if (!o00000o2.f39448Ooooo00) {
                        o00000o2.f39445OoooOo0 += j;
                        if (j > 0) {
                            o00000o2.notifyAll();
                        }
                        o00000O0.this.f39448Ooooo00 = true;
                    }
                    if (!o00000O0.this.f39434Oooo.isEmpty()) {
                        o0000o0oArr = (o0000O0O[]) o00000O0.this.f39434Oooo.values().toArray(new o0000O0O[o00000O0.this.f39434Oooo.size()]);
                    }
                }
            }
            if (o0000o0oArr == null || j == 0) {
                return;
            }
            for (o0000O0O o0000o0o2 : o0000o0oArr) {
                synchronized (o0000o0o2) {
                    o0000o0o2.f39485OooO0O0 += j;
                    if (j > 0) {
                        o0000o0o2.notifyAll();
                    }
                }
            }
        }

        public final void OooO0oo(int i, long j) {
            if (i == 0) {
                synchronized (o00000O0.this) {
                    o00000O0 o00000o1 = o00000O0.this;
                    o00000o1.f39445OoooOo0 += j;
                    o00000o1.notifyAll();
                }
                return;
            }
            o0000O0O o0000o0oOooO0Oo = o00000O0.this.OooO0Oo(i);
            if (o0000o0oOooO0Oo != null) {
                synchronized (o0000o0oOooO0Oo) {
                    o0000o0oOooO0Oo.f39485OooO0O0 += j;
                    if (j > 0) {
                        o0000o0oOooO0Oo.notifyAll();
                    }
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = o000000.f39346OooO00o;
        f39433Oooooo0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new o000OOo("OkHttp FramedConnection"));
    }

    public o00000O0(OooO0OO oooO0OO) throws IOException {
        o000O00O o000o00o2 = new o000O00O();
        this.f39446OoooOoO = o000o00o2;
        o000O00O o000o00o3 = new o000O00O();
        this.f39447OoooOoo = o000o00o3;
        this.f39448Ooooo00 = false;
        this.f39452OooooOo = new LinkedHashSet();
        Protocol protocol = oooO0OO.f39462OooO0OO;
        this.f39435Oooo0o = protocol;
        this.f39443OoooOOO = o000O00.f39540OooO00o;
        this.f39436Oooo0oO = true;
        this.f39437Oooo0oo = o000O000.f39541OooO00o;
        this.f39441OoooO0O = 1;
        Protocol protocol2 = Protocol.HTTP_2;
        if (protocol == protocol2) {
            this.f39441OoooO0O = 3;
        }
        o000o00o2.OooO0Oo(7, 0, 16777216);
        String str = oooO0OO.f39460OooO00o;
        this.f39440OoooO00 = str;
        if (protocol == protocol2) {
            this.f39449Ooooo0o = new o0000OO0();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            String str2 = String.format("OkHttp %s Push Observer", str);
            byte[] bArr = o000000.f39346OooO00o;
            this.f39453o000oOoO = new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new o000OOo(str2));
            o000o00o3.OooO0Oo(7, 0, 65535);
            o000o00o3.OooO0Oo(5, 0, 16384);
        } else {
            if (protocol != Protocol.SPDY_3) {
                throw new AssertionError(protocol);
            }
            this.f39449Ooooo0o = new o000O0();
            this.f39453o000oOoO = null;
        }
        this.f39445OoooOo0 = o000o00o3.OooO0O0();
        Socket socket = oooO0OO.f39461OooO0O0;
        this.f39450OooooO0 = socket;
        this.f39451OooooOO = this.f39449Ooooo0o.OooO0O0(o0O000Oo.OooO0O0(o0O000Oo.OooO0o(socket)), true);
        new Thread(new OooO0o()).start();
    }

    public static boolean OooO00o(o00000O0 o00000o1, int i) {
        return o00000o1.f39435Oooo0o == Protocol.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    public final void OooO0O0(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        int i;
        o0000O0O[] o0000o0oArr = null;
        try {
            OooOOO(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f39434Oooo.isEmpty()) {
                o0000o0oArr = (o0000O0O[]) this.f39434Oooo.values().toArray(new o0000O0O[this.f39434Oooo.size()]);
                this.f39434Oooo.clear();
                OooO0oo(false);
            }
        }
        if (o0000o0oArr != null) {
            for (o0000O0O o0000o0o2 : o0000o0oArr) {
                try {
                    o0000o0o2.OooO0OO(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f39451OooooOO.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f39450OooooO0.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    public final synchronized o0000O0O OooO0Oo(int i) {
        return (o0000O0O) this.f39434Oooo.get(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    public final synchronized o0000O0O OooO0o(int i) {
        o0000O0O o0000o0o2;
        o0000o0o2 = (o0000O0O) this.f39434Oooo.remove(Integer.valueOf(i));
        if (o0000o0o2 != null && this.f39434Oooo.isEmpty()) {
            OooO0oo(true);
        }
        notifyAll();
        return o0000o0o2;
    }

    public final synchronized void OooO0oo(boolean z) {
        long jNanoTime;
        if (z) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            jNanoTime = Long.MAX_VALUE;
        }
        this.f39442OoooOO0 = jNanoTime;
    }

    public final void OooOOO(ErrorCode errorCode) throws IOException {
        synchronized (this.f39451OooooOO) {
            synchronized (this) {
                if (this.f39438OoooO) {
                    return;
                }
                this.f39438OoooO = true;
                this.f39451OooooOO.OooOo(this.f39439OoooO0, errorCode, o000000.f39346OooO00o);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.HashMap, java.util.Map<java.lang.Integer, o0Oo0o0o.o0000O0O>] */
    public final void OooOOo(int i, boolean z, o0oOO o0ooo2, long j) throws IOException {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f39451OooooOO.OoooO00(z, i, o0ooo2, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f39445OoooOo0;
                        if (j2 <= 0) {
                            if (!this.f39434Oooo.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f39451OooooOO.o00000oo());
                j3 = iMin;
                this.f39445OoooOo0 -= j3;
            }
            j -= j3;
            this.f39451OooooOO.OoooO00(z && j == 0, i, o0ooo2, iMin);
        }
    }

    public final void OooOOoo(int i, ErrorCode errorCode) {
        f39433Oooooo0.submit(new OooO00o(new Object[]{this.f39440OoooO00, Integer.valueOf(i)}, i, errorCode));
    }

    public final void OooOo0O(int i, long j) {
        f39433Oooooo0.execute(new OooO0O0(new Object[]{this.f39440OoooO00, Integer.valueOf(i)}, i, j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO0O0(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void flush() throws IOException {
        this.f39451OooooOO.flush();
    }
}
