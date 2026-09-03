package p340o0OO0ooO;

import com.facebook.internal.security.CertificateUtil;
import com.squareup.okhttp.o000oOoO;
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
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.oO00000;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f42529OooO00o = new byte[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f42530OooO0O0 = new String[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Charset f42531OooO0OO = Charset.forName("UTF-8");

    public static void OooO00o(o0O0o00O o0o0o00o, o0OOo000 o0ooo001) throws IOException {
        o0o0o00o.close();
        th = null;
        try {
            o0ooo001.close();
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

    public static String OooO0o0(o000oOoO o000oooo2) {
        int i = o000oooo2.f21126OooO0o0;
        int iOooO0OO = o000oOoO.OooO0OO(o000oooo2.f21121OooO00o);
        String str = o000oooo2.f21124OooO0Oo;
        if (i == iOooO0OO) {
            return str;
        }
        return str + CertificateUtil.DELIMITER + o000oooo2.f21126OooO0o0;
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

    public static boolean OooO0oo(oO00000 oo00000, int i, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jOooO0OO = oo00000.timeout().OooO0o0() ? oo00000.timeout().OooO0OO() - jNanoTime : Long.MAX_VALUE;
        oo00000.timeout().OooO0Oo(Math.min(jOooO0OO, timeUnit.toNanos(i)) + jNanoTime);
        try {
            oo0OOoo oo0oooo = new oo0OOoo();
            while (oo00000.OooOO0O(oo0oooo, 2048L) != -1) {
                oo0oooo.OooO0oO();
            }
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                oo00000.timeout().OooO00o();
                return true;
            }
            oo00000.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            return true;
        } catch (InterruptedIOException unused) {
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                oo00000.timeout().OooO00o();
                return false;
            }
            oo00000.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            return false;
        } catch (Throwable th) {
            if (jOooO0OO == LongCompanionObject.MAX_VALUE) {
                oo00000.timeout().OooO00o();
            } else {
                oo00000.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            throw th;
        }
    }
}
