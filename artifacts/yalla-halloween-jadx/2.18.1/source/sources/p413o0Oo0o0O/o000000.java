package p413o0Oo0o0O;

import com.facebook.internal.security.CertificateUtil;
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
import p412o0Oo0o00.o0000O;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f39346OooO00o = new byte[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f39347OooO0O0 = new String[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Charset f39348OooO0OO = Charset.forName("UTF-8");

    public static <T> List<T> OooO(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static void OooO00o(long j, long j2) {
        if ((j2 | 0) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void OooO0O0(Closeable closeable, Closeable closeable2) throws IOException {
        closeable.close();
        th = null;
        try {
            closeable2.close();
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

    public static void OooO0OO(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void OooO0Oo(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!OooOO0O(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean OooO0o(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean OooO0o0(o0O0O0O o0o0o0o) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            return OooOO0o(o0o0o0o, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String OooO0oO(o0000O o0000o2) {
        if (o0000o2.f39264OooO0o0 == o0000O.OooO0OO(o0000o2.f39259OooO00o)) {
            return o0000o2.f39262OooO0Oo;
        }
        return o0000o2.f39262OooO0Oo + CertificateUtil.DELIMITER + o0000o2.f39264OooO0o0;
    }

    public static <T> List<T> OooO0oo(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] OooOO0(Object[] objArr, Object[] objArr2) {
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

    public static boolean OooOO0O(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean OooOO0o(o0O0O0O o0o0o0o, int i) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jOooO0OO = o0o0o0o.timeout().OooO0o0() ? o0o0o0o.timeout().OooO0OO() - jNanoTime : Long.MAX_VALUE;
        o0o0o0o.timeout().OooO0Oo(Math.min(jOooO0OO, timeUnit.toNanos(i)) + jNanoTime);
        try {
            o0oOO o0ooo2 = new o0oOO();
            while (o0o0o0o.Oooo0O0(o0ooo2, 2048L) != -1) {
                o0ooo2.OooO0Oo();
            }
            if (jOooO0OO == Long.MAX_VALUE) {
                o0o0o0o.timeout().OooO00o();
            } else {
                o0o0o0o.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jOooO0OO == Long.MAX_VALUE) {
                o0o0o0o.timeout().OooO00o();
            } else {
                o0o0o0o.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            return false;
        } catch (Throwable th) {
            if (jOooO0OO == Long.MAX_VALUE) {
                o0o0o0o.timeout().OooO00o();
            } else {
                o0o0o0o.timeout().OooO0Oo(jNanoTime + jOooO0OO);
            }
            throw th;
        }
    }
}
