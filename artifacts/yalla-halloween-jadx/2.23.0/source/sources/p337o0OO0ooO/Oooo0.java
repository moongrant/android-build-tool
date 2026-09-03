package p337o0OO0ooO;

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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import okio.ByteString;
import p336o0OO0oo0.OooOOO;
import p336o0OO0oo0.o000oOoO;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o000O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final ThreadPoolExecutor f43331OooOo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f43332OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Protocol f43333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00.OooO00o f43334OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f43335OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f43337OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f43338OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f43339OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00000O0.OooO00o f43341OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ThreadPoolExecutor f43342OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f43344OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00000O f43345OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o00000O f43346OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f43347OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Socket f43348OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o0000Ooo f43349OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final Oooo000 f43350OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedHashSet f43351OooOo0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f43336OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f43340OooOO0o = System.nanoTime();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f43343OooOOOO = 0;

    public class OooO00o extends OooOOO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f43352OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f43353OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Object[] objArr, int i, ErrorCode errorCode) {
            super("OkHttp %s stream %d", objArr);
            this.f43353OooO0o0 = i;
            this.f43352OooO0o = errorCode;
        }

        @Override // p336o0OO0oo0.OooOOO
        public final void OooO00o() {
            try {
                Oooo0 oooo0 = Oooo0.this;
                oooo0.f43350OooOo0O.Oooo0oO(this.f43353OooO0o0, this.f43352OooO0o);
            } catch (IOException unused) {
            }
        }
    }

    public class OooO0O0 extends OooOOO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f43355OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f43356OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object[] objArr, int i, long j) {
            super("OkHttp Window Update %s stream %d", objArr);
            this.f43356OooO0o0 = i;
            this.f43355OooO0o = j;
        }

        @Override // p336o0OO0oo0.OooOOO
        public final void OooO00o() {
            try {
                Oooo0.this.f43350OooOo0O.OooO0o0(this.f43356OooO0o0, this.f43355OooO0o);
            } catch (IOException unused) {
            }
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f43358OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Socket f43359OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Protocol f43360OooO0OO = Protocol.SPDY_3;

        public OooO0OO(String str, Socket socket) throws IOException {
            this.f43358OooO00o = str;
            this.f43359OooO0O0 = socket;
        }
    }

    public class OooO0o extends OooOOO implements OooOo.OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOo f43362OooO0o0;

        public OooO0o() {
            super("OkHttp %s", Oooo0.this.f43337OooO0oo);
        }

        @Override // p336o0OO0oo0.OooOOO
        public final void OooO00o() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            Oooo0 oooo0 = Oooo0.this;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    o0000Ooo o0000ooo = oooo0.f43349OooOo00;
                    boolean z = oooo0.f43335OooO0o0;
                    OooOo oooOoOooO00o = o0000ooo.OooO00o(o000O0Oo.OooO0O0(o000O0Oo.OooO0o(oooo0.f43348OooOo0)), z);
                    this.f43362OooO0o0 = oooOoOooO00o;
                    if (!z) {
                        oooOoOooO00o.Oooo0oo();
                    }
                    while (this.f43362OooO0o0.OoooOOO(this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        try {
                            oooo0.OooO00o(errorCode, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            oooo0.OooO00o(errorCode3, errorCode3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            oooo0.OooO00o(errorCode, errorCode2);
                        } catch (IOException unused2) {
                        }
                        o000oOoO.OooO0O0(this.f43362OooO0o0);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                errorCode = errorCode2;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                oooo0.OooO00o(errorCode, errorCode2);
                o000oOoO.OooO0O0(this.f43362OooO0o0);
                throw th;
            }
            o000oOoO.OooO0O0(this.f43362OooO0o0);
        }

        public final void OooO0O0(int i, int i2, o0000 o0000Var, boolean z) throws IOException {
            boolean z2;
            boolean z3;
            Oooo0 oooo0 = Oooo0.this;
            if (oooo0.f43333OooO0Oo == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
                oooo0.getClass();
                o00000O o00000o = new o00000O();
                long j = i2;
                o0000Var.OoooOoO(j);
                o0000Var.o0000OO0(o00000o, j);
                if (o00000o.f60177OooO0o0 == j) {
                    oooo0.f43342OooOOO0.execute(new o00Oo0(oooo0, new Object[]{oooo0.f43337OooO0oo, Integer.valueOf(i)}, i, o00000o, i2, z));
                    return;
                }
                throw new IOException(o00000o.f60177OooO0o0 + " != " + i2);
            }
            o0ooOOo o0oooooOooO0OO = oooo0.OooO0OO(i);
            if (o0oooooOooO0OO == null) {
                Oooo0.this.OooOo0(i, ErrorCode.INVALID_STREAM);
                o0000Var.skip(i2);
                return;
            }
            o0ooOOo.OooO0O0 oooO0O0 = o0oooooOooO0OO.f43450OooO0oO;
            long j2 = i2;
            while (true) {
                if (j2 <= 0) {
                    oooO0O0.getClass();
                    break;
                }
                synchronized (o0ooOOo.this) {
                    z2 = oooO0O0.f43463OooO0oo;
                    z3 = oooO0O0.f43461OooO0o0.f60177OooO0o0 + j2 > oooO0O0.f43460OooO0o;
                }
                if (z3) {
                    o0000Var.skip(j2);
                    o0ooOOo.this.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    o0000Var.skip(j2);
                    break;
                }
                long jO0000OO0 = o0000Var.o0000OO0(oooO0O0.f43459OooO0Oo, j2);
                if (jO0000OO0 == -1) {
                    throw new EOFException();
                }
                j2 -= jO0000OO0;
                synchronized (o0ooOOo.this) {
                    o00000O o00000o2 = oooO0O0.f43461OooO0o0;
                    boolean z4 = o00000o2.f60177OooO0o0 == 0;
                    o00000o2.Oooo000(oooO0O0.f43459OooO0Oo);
                    if (z4) {
                        o0ooOOo.this.notifyAll();
                    }
                }
            }
            if (z) {
                o0oooooOooO0OO.OooO0oo();
            }
        }

        public final void OooO0OO(int i, ByteString byteString) {
            o0ooOOo[] o0oooooArr;
            byteString.OooO0o0();
            synchronized (Oooo0.this) {
                o0oooooArr = (o0ooOOo[]) Oooo0.this.f43336OooO0oO.values().toArray(new o0ooOOo[Oooo0.this.f43336OooO0oO.size()]);
                Oooo0.this.f43339OooOO0O = true;
            }
            for (o0ooOOo o0ooooo : o0oooooArr) {
                int i2 = o0ooooo.f43446OooO0OO;
                if (i2 > i) {
                    if (o0ooooo.f43447OooO0Oo.f43335OooO0o0 == ((i2 & 1) == 1)) {
                        o0ooooo.OooOO0(ErrorCode.REFUSED_STREAM);
                        Oooo0.this.OooO0oO(o0ooooo.f43446OooO0OO);
                    }
                }
            }
        }

        public final void OooO0Oo(boolean z, boolean z2, int i, ArrayList arrayList, HeadersMode headersMode) {
            Oooo0 oooo0 = Oooo0.this;
            if (oooo0.f43333OooO0Oo == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
                oooo0.f43342OooOOO0.execute(new o00O0O(oooo0, new Object[]{oooo0.f43337OooO0oo, Integer.valueOf(i)}, i, arrayList, z2));
                return;
            }
            synchronized (oooo0) {
                try {
                    Oooo0 oooo1 = Oooo0.this;
                    if (oooo1.f43339OooOO0O) {
                        return;
                    }
                    o0ooOOo o0oooooOooO0OO = oooo1.OooO0OO(i);
                    if (o0oooooOooO0OO != null) {
                        headersMode.getClass();
                        if (headersMode == HeadersMode.SPDY_SYN_STREAM) {
                            o0oooooOooO0OO.OooO0o0(ErrorCode.PROTOCOL_ERROR);
                            Oooo0.this.OooO0oO(i);
                            return;
                        } else {
                            o0oooooOooO0OO.OooO(arrayList, headersMode);
                            if (z2) {
                                o0oooooOooO0OO.OooO0oo();
                                return;
                            }
                            return;
                        }
                    }
                    headersMode.getClass();
                    if (headersMode == HeadersMode.SPDY_REPLY || headersMode == HeadersMode.SPDY_HEADERS) {
                        Oooo0.this.OooOo0(i, ErrorCode.INVALID_STREAM);
                        return;
                    }
                    Oooo0 oooo2 = Oooo0.this;
                    if (i <= oooo2.f43332OooO) {
                        return;
                    }
                    if (i % 2 == oooo2.f43338OooOO0 % 2) {
                        return;
                    }
                    o0ooOOo o0ooooo = new o0ooOOo(i, oooo2, z, z2, arrayList);
                    Oooo0 oooo3 = Oooo0.this;
                    oooo3.f43332OooO = i;
                    oooo3.f43336OooO0oO.put(Integer.valueOf(i), o0ooooo);
                    Oooo0.f43331OooOo.execute(new oo000o(this, new Object[]{Oooo0.this.f43337OooO0oo, Integer.valueOf(i)}, o0ooooo));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void OooO0o(int i, ErrorCode errorCode) {
            Oooo0 oooo0 = Oooo0.this;
            if (oooo0.f43333OooO0Oo == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
                oooo0.f43342OooOOO0.execute(new o00Ooo(oooo0, new Object[]{oooo0.f43337OooO0oo, Integer.valueOf(i)}, i, errorCode));
                return;
            }
            o0ooOOo o0oooooOooO0oO = oooo0.OooO0oO(i);
            if (o0oooooOooO0oO != null) {
                o0oooooOooO0oO.OooOO0(errorCode);
            }
        }

        public final void OooO0o0(int i, int i2, boolean z) {
            if (z) {
                synchronized (Oooo0.this) {
                }
            } else {
                Oooo0 oooo0 = Oooo0.this;
                Oooo0.f43331OooOo.execute(new o000oOoO(oooo0, new Object[]{oooo0.f43337OooO0oo, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
            }
        }

        public final void OooO0oO(boolean z, o00000O o00000o) {
            int i;
            o0ooOOo[] o0oooooArr;
            long j;
            synchronized (Oooo0.this) {
                try {
                    int iOooO0O0 = Oooo0.this.f43345OooOOo.OooO0O0();
                    if (z) {
                        o00000O o00000o2 = Oooo0.this.f43345OooOOo;
                        o00000o2.f43369OooO0OO = 0;
                        o00000o2.f43368OooO0O0 = 0;
                        o00000o2.f43367OooO00o = 0;
                        Arrays.fill(o00000o2.f43370OooO0Oo, 0);
                    }
                    o00000O o00000o3 = Oooo0.this.f43345OooOOo;
                    o00000o3.getClass();
                    int i2 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (i2 >= 10) {
                            break;
                        }
                        if (((1 << i2) & o00000o.f43367OooO00o) == 0) {
                            z2 = false;
                        }
                        if (z2) {
                            o00000o3.OooO0OO(i2, o00000o.OooO00o(i2), o00000o.f43370OooO0Oo[i2]);
                        }
                        i2++;
                    }
                    Oooo0 oooo0 = Oooo0.this;
                    if (oooo0.f43333OooO0Oo == Protocol.HTTP_2) {
                        Oooo0.f43331OooOo.execute(new o00oO0o(this, new Object[]{oooo0.f43337OooO0oo}, o00000o));
                    }
                    int iOooO0O1 = Oooo0.this.f43345OooOOo.OooO0O0();
                    o0oooooArr = null;
                    if (iOooO0O1 == -1 || iOooO0O1 == iOooO0O0) {
                        j = 0;
                    } else {
                        j = iOooO0O1 - iOooO0O0;
                        Oooo0 oooo1 = Oooo0.this;
                        if (!oooo1.f43347OooOOoo) {
                            oooo1.f43344OooOOOo += j;
                            if (j > 0) {
                                oooo1.notifyAll();
                            }
                            Oooo0.this.f43347OooOOoo = true;
                        }
                        if (!Oooo0.this.f43336OooO0oO.isEmpty()) {
                            o0oooooArr = (o0ooOOo[]) Oooo0.this.f43336OooO0oO.values().toArray(new o0ooOOo[Oooo0.this.f43336OooO0oO.size()]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (o0oooooArr == null || j == 0) {
                return;
            }
            for (o0ooOOo o0ooooo : o0oooooArr) {
                synchronized (o0ooooo) {
                    o0ooooo.f43445OooO0O0 += j;
                    if (j > 0) {
                        o0ooooo.notifyAll();
                    }
                }
            }
        }

        public final void OooO0oo(int i, long j) {
            if (i == 0) {
                synchronized (Oooo0.this) {
                    Oooo0 oooo0 = Oooo0.this;
                    oooo0.f43344OooOOOo += j;
                    oooo0.notifyAll();
                }
                return;
            }
            o0ooOOo o0oooooOooO0OO = Oooo0.this.OooO0OO(i);
            if (o0oooooOooO0OO != null) {
                synchronized (o0oooooOooO0OO) {
                    o0oooooOooO0OO.f43445OooO0O0 += j;
                    if (j > 0) {
                        o0oooooOooO0OO.notifyAll();
                    }
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = o000oOoO.f43328OooO00o;
        f43331OooOo = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new p336o0OO0oo0.Oooo0("OkHttp FramedConnection"));
    }

    public Oooo0(OooO0OO oooO0OO) throws IOException {
        o00000O o00000o = new o00000O();
        this.f43346OooOOo0 = o00000o;
        o00000O o00000o2 = new o00000O();
        this.f43345OooOOo = o00000o2;
        this.f43347OooOOoo = false;
        this.f43351OooOo0o = new LinkedHashSet();
        Protocol protocol = oooO0OO.f43360OooO0OO;
        this.f43333OooO0Oo = protocol;
        this.f43341OooOOO = o00000O0.f43371OooO00o;
        this.f43335OooO0o0 = true;
        this.f43334OooO0o = o0O0O00.f43397OooO00o;
        this.f43338OooOO0 = 1;
        Protocol protocol2 = Protocol.HTTP_2;
        if (protocol == protocol2) {
            this.f43338OooOO0 = 3;
        }
        o00000o.OooO0OO(7, 0, 16777216);
        String str = oooO0OO.f43358OooO00o;
        this.f43337OooO0oo = str;
        if (protocol == protocol2) {
            this.f43349OooOo00 = new o0OO00O();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            String str2 = String.format("OkHttp %s Push Observer", str);
            byte[] bArr = o000oOoO.f43328OooO00o;
            this.f43342OooOOO0 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new p336o0OO0oo0.Oooo0(str2));
            o00000o2.OooO0OO(7, 0, 65535);
            o00000o2.OooO0OO(5, 0, 16384);
        } else {
            if (protocol != Protocol.SPDY_3) {
                throw new AssertionError(protocol);
            }
            this.f43349OooOo00 = new o00000OO();
            this.f43342OooOOO0 = null;
        }
        this.f43344OooOOOo = o00000o2.OooO0O0();
        Socket socket = oooO0OO.f43359OooO0O0;
        this.f43348OooOo0 = socket;
        this.f43350OooOo0O = this.f43349OooOo00.OooO0O0(o000O0Oo.OooO00o(o000O0Oo.OooO0Oo(socket)), true);
        new Thread(new OooO0o()).start();
    }

    public final void OooO00o(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        int i;
        o0ooOOo[] o0oooooArr = null;
        try {
            OooOOo(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f43336OooO0oO.isEmpty()) {
                o0oooooArr = (o0ooOOo[]) this.f43336OooO0oO.values().toArray(new o0ooOOo[this.f43336OooO0oO.size()]);
                this.f43336OooO0oO.clear();
                OooOOo0(false);
            }
        }
        if (o0oooooArr != null) {
            for (o0ooOOo o0ooooo : o0oooooArr) {
                try {
                    o0ooooo.OooO0OO(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f43350OooOo0O.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f43348OooOo0.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public final synchronized o0ooOOo OooO0OO(int i) {
        return (o0ooOOo) this.f43336OooO0oO.get(Integer.valueOf(i));
    }

    public final synchronized o0ooOOo OooO0oO(int i) {
        o0ooOOo o0ooooo;
        o0ooooo = (o0ooOOo) this.f43336OooO0oO.remove(Integer.valueOf(i));
        if (o0ooooo != null && this.f43336OooO0oO.isEmpty()) {
            OooOOo0(true);
        }
        notifyAll();
        return o0ooooo;
    }

    public final void OooOOo(ErrorCode errorCode) throws IOException {
        synchronized (this.f43350OooOo0O) {
            synchronized (this) {
                if (this.f43339OooOO0O) {
                    return;
                }
                this.f43339OooOO0O = true;
                this.f43350OooOo0O.OooOOOO(this.f43332OooO, errorCode, o000oOoO.f43328OooO00o);
            }
        }
    }

    public final synchronized void OooOOo0(boolean z) {
        long jNanoTime;
        if (z) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            jNanoTime = LongCompanionObject.MAX_VALUE;
        }
        this.f43340OooOO0o = jNanoTime;
    }

    public final void OooOo(int i, long j) {
        f43331OooOo.execute(new OooO0O0(new Object[]{this.f43337OooO0oo, Integer.valueOf(i)}, i, j));
    }

    public final void OooOo0(int i, ErrorCode errorCode) {
        f43331OooOo.submit(new OooO00o(new Object[]{this.f43337OooO0oo, Integer.valueOf(i)}, i, errorCode));
    }

    public final void OooOo00(int i, boolean z, o00000O o00000o, long j) throws IOException {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f43350OooOo0O.o0Oo0oo(z, i, o00000o, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f43344OooOOOo;
                        if (j2 <= 0) {
                            if (!this.f43336OooO0oO.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f43350OooOo0O.OoooOo0());
                j3 = iMin;
                this.f43344OooOOOo -= j3;
            }
            j -= j3;
            this.f43350OooOo0O.o0Oo0oo(z && j == 0, i, o00000o, iMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO00o(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void flush() throws IOException {
        this.f43350OooOo0O.flush();
    }
}
