package o0OOOO;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public abstract class OooO extends Number {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final long f38190OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final Unsafe f38193OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final long f38194OoooOO0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NullableDecl
    public volatile transient OooO0O0[] f38195Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public volatile transient long f38196Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public volatile transient int f38197Oooo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final ThreadLocal<int[]> f38189Oooo = new ThreadLocal<>();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final Random f38192OoooO00 = new Random();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final int f38191OoooO0 = Runtime.getRuntime().availableProcessors();

    public static class OooO00o implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Unsafe f38198OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final long f38199OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile long f38200OooO00o;

        static {
            try {
                Unsafe unsafeOooO0Oo = OooO.OooO0Oo();
                f38198OooO0O0 = unsafeOooO0Oo;
                f38199OooO0OO = unsafeOooO0Oo.objectFieldOffset(OooO0O0.class.getDeclaredField("OooO00o"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public OooO0O0(long j) {
            this.f38200OooO00o = j;
        }

        public final boolean OooO00o(long j, long j2) {
            return f38198OooO0O0.compareAndSwapLong(this, f38199OooO0OO, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafeOooO0Oo = OooO0Oo();
            f38193OoooO0O = unsafeOooO0Oo;
            f38190OoooO = unsafeOooO0Oo.objectFieldOffset(OooO.class.getDeclaredField("Oooo0oO"));
            f38194OoooOO0 = unsafeOooO0Oo.objectFieldOffset(OooO.class.getDeclaredField("Oooo0oo"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static Unsafe OooO0Oo() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new OooO00o());
        }
    }

    public final boolean OooO0O0(long j, long j2) {
        return f38193OoooO0O.compareAndSwapLong(this, f38190OoooO, j, j2);
    }

    public final boolean OooO0OO() {
        return f38193OoooO0O.compareAndSwapInt(this, f38194OoooOO0, 0, 1);
    }
}
