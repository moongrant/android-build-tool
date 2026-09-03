package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class OooO extends Number {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Unsafe f19709OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final long f19710OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final long f19711OooOO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public volatile transient OooO0O0[] f19712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile transient int f19713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile transient long f19714OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ThreadLocal<int[]> f19707OooO0oO = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Random f19708OooO0oo = new Random();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f19706OooO = Runtime.getRuntime().availableProcessors();

    public class OooO00o implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe OooO00o() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return OooO00o();
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Unsafe f19715OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final long f19716OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public volatile long f19717OooO00o;

        static {
            try {
                Unsafe unsafeOooO0o0 = OooO.OooO0o0();
                f19715OooO0O0 = unsafeOooO0o0;
                f19716OooO0OO = unsafeOooO0o0.objectFieldOffset(OooO0O0.class.getDeclaredField("OooO00o"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public OooO0O0(long j) {
            this.f19717OooO00o = j;
        }

        public final boolean OooO00o(long j, long j2) {
            return f19715OooO0O0.compareAndSwapLong(this, f19716OooO0OO, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafeOooO0o0 = OooO0o0();
            f19709OooOO0 = unsafeOooO0o0;
            f19710OooOO0O = unsafeOooO0o0.objectFieldOffset(OooO.class.getDeclaredField("OooO0o0"));
            f19711OooOO0o = unsafeOooO0o0.objectFieldOffset(OooO.class.getDeclaredField("OooO0o"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public static Unsafe OooO0o0() {
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

    public final boolean OooO0OO(long j, long j2) {
        return f19709OooOO0.compareAndSwapLong(this, f19710OooOO0O, j, j2);
    }

    public final boolean OooO0Oo() {
        return f19709OooOO0.compareAndSwapInt(this, f19711OooOO0o, 0, 1);
    }
}
