package p341o0OO0ooo;

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
import p340o0OO0ooO.o000OOo;
import p340o0OO0ooO.o0O0O00;
import p340o0OO0ooO.o0ooOOo;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 implements Closeable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final ThreadPoolExecutor f42604OooOo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f42605OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Protocol f42606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000.OooO00o f42607OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f42608OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f42610OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f42611OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f42612OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000O00O.OooO00o f42614OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ThreadPoolExecutor f42615OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f42617OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o000O0 f42618OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o000O0 f42619OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f42620OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Socket f42621OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final o000OO0O f42622OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final o000000O f42623OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final LinkedHashSet f42624OooOo0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f42609OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f42613OooOO0o = System.nanoTime();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f42616OooOOOO = 0;

    public class OooO00o extends o0ooOOo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f42625OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f42626OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Object[] objArr, int i, ErrorCode errorCode) {
            super("OkHttp %s stream %d", objArr);
            this.f42626OooO0o0 = i;
            this.f42625OooO0o = errorCode;
        }

        @Override // p340o0OO0ooO.o0ooOOo
        public final void OooO00o() {
            try {
                o00000 o00000Var = o00000.this;
                o00000Var.f42623OooOo0O.Oooo0oo(this.f42626OooO0o0, this.f42625OooO0o);
            } catch (IOException unused) {
            }
        }
    }

    public class OooO0O0 extends o0ooOOo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f42628OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f42629OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Object[] objArr, int i, long j) {
            super("OkHttp Window Update %s stream %d", objArr);
            this.f42629OooO0o0 = i;
            this.f42628OooO0o = j;
        }

        @Override // p340o0OO0ooO.o0ooOOo
        public final void OooO00o() {
            try {
                o00000.this.f42623OooOo0O.OooO0o0(this.f42629OooO0o0, this.f42628OooO0o);
            } catch (IOException unused) {
            }
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f42631OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Socket f42632OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Protocol f42633OooO0OO = Protocol.SPDY_3;

        public OooO0OO(String str, Socket socket) throws IOException {
            this.f42631OooO00o = str;
            this.f42632OooO0O0 = socket;
        }
    }

    public class OooO0o extends o0ooOOo implements o000000.OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o000000 f42635OooO0o0;

        public OooO0o() {
            super("OkHttp %s", o00000.this.f42610OooO0oo);
        }

        @Override // p340o0OO0ooO.o0ooOOo
        public final void OooO00o() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            o00000 o00000Var = o00000.this;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    o000OO0O o000oo0o2 = o00000Var.f42622OooOo00;
                    boolean z = o00000Var.f42608OooO0o0;
                    o000000 o000000VarOooO0O0 = o000oo0o2.OooO0O0(o0OO.OooO0O0(o0OO.OooO0o(o00000Var.f42621OooOo0)), z);
                    this.f42635OooO0o0 = o000000VarOooO0O0;
                    if (!z) {
                        o000000VarOooO0O0.Oooo();
                    }
                    while (this.f42635OooO0o0.o0OO00O(this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        try {
                            o00000Var.OooO00o(errorCode, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            o00000Var.OooO00o(errorCode3, errorCode3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            o00000Var.OooO00o(errorCode, errorCode2);
                        } catch (IOException unused2) {
                        }
                        o000OOo.OooO0O0(this.f42635OooO0o0);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                errorCode = errorCode2;
            } catch (Throwable th3) {
                th = th3;
                errorCode = errorCode2;
                o00000Var.OooO00o(errorCode, errorCode2);
                o000OOo.OooO0O0(this.f42635OooO0o0);
                throw th;
            }
            o000OOo.OooO0O0(this.f42635OooO0o0);
        }

        public final void OooO0O0(int i, int i2, o0O0o0 o0o0o0, boolean z) throws IOException {
            boolean z2;
            boolean z3;
            o00000 o00000Var = o00000.this;
            if (o00000Var.f42606OooO0Oo == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
                o00000Var.getClass();
                oo0OOoo oo0oooo = new oo0OOoo();
                long j = i2;
                o0o0o0.OoooOoO(j);
                o0o0o0.OooOO0O(oo0oooo, j);
                if (oo0oooo.f59828OooO0o0 == j) {
                    o00000Var.f42615OooOOO0.execute(new o0000Ooo(o00000Var, new Object[]{o00000Var.f42610OooO0oo, Integer.valueOf(i)}, i, oo0oooo, i2, z));
                    return;
                }
                throw new IOException(oo0oooo.f59828OooO0o0 + " != " + i2);
            }
            o0000O0 o0000o0OooO0OO = o00000Var.OooO0OO(i);
            if (o0000o0OooO0OO == null) {
                o00000.this.OooOo(i, ErrorCode.INVALID_STREAM);
                o0o0o0.skip(i2);
                return;
            }
            o0000O0.OooO0O0 oooO0O0 = o0000o0OooO0OO.f42674OooO0oO;
            long j2 = i2;
            while (true) {
                if (j2 <= 0) {
                    oooO0O0.getClass();
                    break;
                }
                synchronized (o0000O0.this) {
                    z2 = oooO0O0.f42687OooO0oo;
                    z3 = oooO0O0.f42685OooO0o0.f59828OooO0o0 + j2 > oooO0O0.f42684OooO0o;
                }
                if (z3) {
                    o0o0o0.skip(j2);
                    o0000O0.this.OooO0o0(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z2) {
                    o0o0o0.skip(j2);
                    break;
                }
                long jOooOO0O = o0o0o0.OooOO0O(oooO0O0.f42683OooO0Oo, j2);
                if (jOooOO0O == -1) {
                    throw new EOFException();
                }
                j2 -= jOooOO0O;
                synchronized (o0000O0.this) {
                    oo0OOoo oo0oooo2 = oooO0O0.f42685OooO0o0;
                    boolean z4 = oo0oooo2.f59828OooO0o0 == 0;
                    oo0oooo2.o00Oo0(oooO0O0.f42683OooO0Oo);
                    if (z4) {
                        o0000O0.this.notifyAll();
                    }
                }
            }
            if (z) {
                o0000o0OooO0OO.OooO0oo();
            }
        }

        public final void OooO0OO(int i, ByteString byteString) {
            o0000O0[] o0000o0Arr;
            byteString.OooO0o0();
            synchronized (o00000.this) {
                o0000o0Arr = (o0000O0[]) o00000.this.f42609OooO0oO.values().toArray(new o0000O0[o00000.this.f42609OooO0oO.size()]);
                o00000.this.f42612OooOO0O = true;
            }
            for (o0000O0 o0000o1 : o0000o0Arr) {
                int i2 = o0000o1.f42670OooO0OO;
                if (i2 > i) {
                    if (o0000o1.f42671OooO0Oo.f42608OooO0o0 == ((i2 & 1) == 1)) {
                        o0000o1.OooOO0(ErrorCode.REFUSED_STREAM);
                        o00000.this.OooO0oO(o0000o1.f42670OooO0OO);
                    }
                }
            }
        }

        public final void OooO0Oo(boolean z, boolean z2, int i, ArrayList arrayList, HeadersMode headersMode) {
            o00000 o00000Var = o00000.this;
            if (o00000Var.f42606OooO0Oo == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
                o00000Var.f42615OooOOO0.execute(new o00000OO(o00000Var, new Object[]{o00000Var.f42610OooO0oo, Integer.valueOf(i)}, i, arrayList, z2));
                return;
            }
            synchronized (o00000Var) {
                try {
                    o00000 o00000Var2 = o00000.this;
                    if (o00000Var2.f42612OooOO0O) {
                        return;
                    }
                    o0000O0 o0000o0OooO0OO = o00000Var2.OooO0OO(i);
                    if (o0000o0OooO0OO != null) {
                        headersMode.getClass();
                        if (headersMode == HeadersMode.SPDY_SYN_STREAM) {
                            o0000o0OooO0OO.OooO0o0(ErrorCode.PROTOCOL_ERROR);
                            o00000.this.OooO0oO(i);
                            return;
                        } else {
                            o0000o0OooO0OO.OooO(arrayList, headersMode);
                            if (z2) {
                                o0000o0OooO0OO.OooO0oo();
                                return;
                            }
                            return;
                        }
                    }
                    headersMode.getClass();
                    if (headersMode == HeadersMode.SPDY_REPLY || headersMode == HeadersMode.SPDY_HEADERS) {
                        o00000.this.OooOo(i, ErrorCode.INVALID_STREAM);
                        return;
                    }
                    o00000 o00000Var3 = o00000.this;
                    if (i <= o00000Var3.f42605OooO) {
                        return;
                    }
                    if (i % 2 == o00000Var3.f42611OooOO0 % 2) {
                        return;
                    }
                    o0000O0 o0000o1 = new o0000O0(i, o00000Var3, z, z2, arrayList);
                    o00000 o00000Var4 = o00000.this;
                    o00000Var4.f42605OooO = i;
                    o00000Var4.f42609OooO0oO.put(Integer.valueOf(i), o0000o1);
                    o00000.f42604OooOo.execute(new o0000O00(this, new Object[]{o00000.this.f42610OooO0oo, Integer.valueOf(i)}, o0000o1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void OooO0o(int i, ErrorCode errorCode) {
            o00000 o00000Var = o00000.this;
            if (o00000Var.f42606OooO0Oo == Protocol.HTTP_2 && i != 0 && (i & 1) == 0) {
                o00000Var.f42615OooOOO0.execute(new o0000(o00000Var, new Object[]{o00000Var.f42610OooO0oo, Integer.valueOf(i)}, i, errorCode));
                return;
            }
            o0000O0 o0000o0OooO0oO = o00000Var.OooO0oO(i);
            if (o0000o0OooO0oO != null) {
                o0000o0OooO0oO.OooOO0(errorCode);
            }
        }

        public final void OooO0o0(int i, int i2, boolean z) {
            if (z) {
                synchronized (o00000.this) {
                }
            } else {
                o00000 o00000Var = o00000.this;
                o00000.f42604OooOo.execute(new o00000O0(o00000Var, new Object[]{o00000Var.f42610OooO0oo, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2));
            }
        }

        public final void OooO0oO(boolean z, o000O0 o000o0) {
            int i;
            o0000O0[] o0000o0Arr;
            long j;
            synchronized (o00000.this) {
                try {
                    int iOooO0O0 = o00000.this.f42618OooOOo.OooO0O0();
                    if (z) {
                        o000O0 o000o1 = o00000.this.f42618OooOOo;
                        o000o1.f42716OooO0OO = 0;
                        o000o1.f42715OooO0O0 = 0;
                        o000o1.f42714OooO00o = 0;
                        Arrays.fill(o000o1.f42717OooO0Oo, 0);
                    }
                    o000O0 o000o2 = o00000.this.f42618OooOOo;
                    o000o2.getClass();
                    int i2 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (i2 >= 10) {
                            break;
                        }
                        if (((1 << i2) & o000o0.f42714OooO00o) == 0) {
                            z2 = false;
                        }
                        if (z2) {
                            o000o2.OooO0OO(i2, o000o0.OooO00o(i2), o000o0.f42717OooO0Oo[i2]);
                        }
                        i2++;
                    }
                    o00000 o00000Var = o00000.this;
                    if (o00000Var.f42606OooO0Oo == Protocol.HTTP_2) {
                        o00000.f42604OooOo.execute(new o0000oo(this, new Object[]{o00000Var.f42610OooO0oo}, o000o0));
                    }
                    int iOooO0O1 = o00000.this.f42618OooOOo.OooO0O0();
                    o0000o0Arr = null;
                    if (iOooO0O1 == -1 || iOooO0O1 == iOooO0O0) {
                        j = 0;
                    } else {
                        j = iOooO0O1 - iOooO0O0;
                        o00000 o00000Var2 = o00000.this;
                        if (!o00000Var2.f42620OooOOoo) {
                            o00000Var2.f42617OooOOOo += j;
                            if (j > 0) {
                                o00000Var2.notifyAll();
                            }
                            o00000.this.f42620OooOOoo = true;
                        }
                        if (!o00000.this.f42609OooO0oO.isEmpty()) {
                            o0000o0Arr = (o0000O0[]) o00000.this.f42609OooO0oO.values().toArray(new o0000O0[o00000.this.f42609OooO0oO.size()]);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (o0000o0Arr == null || j == 0) {
                return;
            }
            for (o0000O0 o0000o1 : o0000o0Arr) {
                synchronized (o0000o1) {
                    o0000o1.f42669OooO0O0 += j;
                    if (j > 0) {
                        o0000o1.notifyAll();
                    }
                }
            }
        }

        public final void OooO0oo(int i, long j) {
            if (i == 0) {
                synchronized (o00000.this) {
                    o00000 o00000Var = o00000.this;
                    o00000Var.f42617OooOOOo += j;
                    o00000Var.notifyAll();
                }
                return;
            }
            o0000O0 o0000o0OooO0OO = o00000.this.OooO0OO(i);
            if (o0000o0OooO0OO != null) {
                synchronized (o0000o0OooO0OO) {
                    o0000o0OooO0OO.f42669OooO0O0 += j;
                    if (j > 0) {
                        o0000o0OooO0OO.notifyAll();
                    }
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = o000OOo.f42529OooO00o;
        f42604OooOo = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new o0O0O00("OkHttp FramedConnection"));
    }

    public o00000(OooO0OO oooO0OO) throws IOException {
        o000O0 o000o0 = new o000O0();
        this.f42619OooOOo0 = o000o0;
        o000O0 o000o1 = new o000O0();
        this.f42618OooOOo = o000o1;
        this.f42620OooOOoo = false;
        this.f42624OooOo0o = new LinkedHashSet();
        Protocol protocol = oooO0OO.f42633OooO0OO;
        this.f42606OooO0Oo = protocol;
        this.f42614OooOOO = o000O00O.f42720OooO00o;
        this.f42608OooO0o0 = true;
        this.f42607OooO0o = o000.f42601OooO00o;
        this.f42611OooOO0 = 1;
        Protocol protocol2 = Protocol.HTTP_2;
        if (protocol == protocol2) {
            this.f42611OooOO0 = 3;
        }
        o000o0.OooO0OO(7, 0, 16777216);
        String str = oooO0OO.f42631OooO00o;
        this.f42610OooO0oo = str;
        if (protocol == protocol2) {
            this.f42622OooOo00 = new o0000O();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            String str2 = String.format("OkHttp %s Push Observer", str);
            byte[] bArr = o000OOo.f42529OooO00o;
            this.f42615OooOOO0 = new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new o0O0O00(str2));
            o000o1.OooO0OO(7, 0, 65535);
            o000o1.OooO0OO(5, 0, 16384);
        } else {
            if (protocol != Protocol.SPDY_3) {
                throw new AssertionError(protocol);
            }
            this.f42622OooOo00 = new o000O0Oo();
            this.f42615OooOOO0 = null;
        }
        this.f42617OooOOOo = o000o1.OooO0O0();
        Socket socket = oooO0OO.f42632OooO0O0;
        this.f42621OooOo0 = socket;
        this.f42623OooOo0O = this.f42622OooOo00.OooO00o(o0OO.OooO00o(o0OO.OooO0Oo(socket)), true);
        new Thread(new OooO0o()).start();
    }

    public final void OooO00o(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        int i;
        o0000O0[] o0000o0Arr = null;
        try {
            OooOo00(errorCode);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f42609OooO0oO.isEmpty()) {
                o0000o0Arr = (o0000O0[]) this.f42609OooO0oO.values().toArray(new o0000O0[this.f42609OooO0oO.size()]);
                this.f42609OooO0oO.clear();
                OooOOo(false);
            }
        }
        if (o0000o0Arr != null) {
            for (o0000O0 o0000o1 : o0000o0Arr) {
                try {
                    o0000o1.OooO0OO(errorCode2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f42623OooOo0O.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f42621OooOo0.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    public final synchronized o0000O0 OooO0OO(int i) {
        return (o0000O0) this.f42609OooO0oO.get(Integer.valueOf(i));
    }

    public final synchronized o0000O0 OooO0oO(int i) {
        o0000O0 o0000o1;
        o0000o1 = (o0000O0) this.f42609OooO0oO.remove(Integer.valueOf(i));
        if (o0000o1 != null && this.f42609OooO0oO.isEmpty()) {
            OooOOo(true);
        }
        notifyAll();
        return o0000o1;
    }

    public final synchronized void OooOOo(boolean z) {
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
        this.f42613OooOO0o = jNanoTime;
    }

    public final void OooOo(int i, ErrorCode errorCode) {
        f42604OooOo.submit(new OooO00o(new Object[]{this.f42610OooO0oo, Integer.valueOf(i)}, i, errorCode));
    }

    public final void OooOo0(int i, boolean z, oo0OOoo oo0oooo, long j) throws IOException {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f42623OooOo0O.o00000oO(z, i, oo0oooo, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f42617OooOOOo;
                        if (j2 <= 0) {
                            if (!this.f42609OooO0oO.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f42623OooOo0O.OoooOo0());
                j3 = iMin;
                this.f42617OooOOOo -= j3;
            }
            j -= j3;
            this.f42623OooOo0O.o00000oO(z && j == 0, i, oo0oooo, iMin);
        }
    }

    public final void OooOo00(ErrorCode errorCode) throws IOException {
        synchronized (this.f42623OooOo0O) {
            synchronized (this) {
                if (this.f42612OooOO0O) {
                    return;
                }
                this.f42612OooOO0O = true;
                this.f42623OooOo0O.OooOOOo(this.f42605OooO, errorCode, o000OOo.f42529OooO00o);
            }
        }
    }

    public final void OooOooo(int i, long j) {
        f42604OooOo.execute(new OooO0O0(new Object[]{this.f42610OooO0oo, Integer.valueOf(i)}, i, j));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO00o(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void flush() throws IOException {
        this.f42623OooOo0O.flush();
    }
}
