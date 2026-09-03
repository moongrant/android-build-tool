package p336o0OO0oo0;

import com.facebook.internal.security.CertificateUtil;
import com.squareup.okhttp.o0OoOo0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import p659o0oooO00.o00;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;
import p659o0oooO00.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f43328OooO00o = new byte[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f43329OooO0O0 = new String[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Charset f43330OooO0OO = Charset.forName("UTF-8");

    public static void OooO00o(o0000Ooo o0000ooo, o00 o00Var) throws IOException {
        o0000ooo.close();
        th = null;
        try {
            o00Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static void OooO0O0(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void OooO0OO(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!((e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) ? false : true)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean OooO0Oo(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> List<T> OooO0o(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static String OooO0o0(o0OoOo0 o0oooo0) {
        int i = o0oooo0.f21636OooO0o0;
        int iOooO0OO = o0OoOo0.OooO0OO(o0oooo0.f21631OooO00o);
        String str = o0oooo0.f21634OooO0Oo;
        if (i == iOooO0OO) {
            return str;
        }
        return str + CertificateUtil.DELIMITER + o0oooo0.f21636OooO0o0;
    }

    public static Object[] OooO0oO(Object[] objArr, Object[] objArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            for (Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) String.class, arrayList.size()));
    }

    public static boolean OooO0oo(o00O00 o00o01, int i, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jOooO0OO = o00o01.timeout().OooO0o0() ? o00o01.timeout().OooO0OO() - jNanoTime : Long.MAX_VALUE;
        o00o01.timeout().OooO0Oo(Math.min(jOooO0OO, timeUnit.toNanos(i)) + jNanoTime);
        try {
            o00000O o00000o = new o00000O();
            while (o00o01.o0000OO0(o00000o, 2048L) != -1) {
                o00000o.OooO0oO();
            }
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                o00o01.timeout().OooO00o();
                return true;
            }
            o00o01.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            return true;
        } catch (InterruptedIOException unused) {
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                o00o01.timeout().OooO00o();
                return false;
            }
            o00o01.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            return false;
        } catch (Throwable th) {
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                o00o01.timeout().OooO00o();
            } else {
                o00o01.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            throw th;
        }
    }
}
