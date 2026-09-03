package com.google.android.gms.internal.measurement;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oo0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Unsafe f15602OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class f15603OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final oO0Oo f15604OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f15605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final long f15606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f15607OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f15608OooO0oO;

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    static {
        oO0Oo o0ooo001;
        boolean z;
        boolean z2;
        oO0Oo oo0oo;
        Unsafe unsafeOooOO0O = OooOO0O();
        f15602OooO00o = unsafeOooOO0O;
        int i = o0o0Oo.f15594OooO00o;
        f15603OooO0O0 = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zOooOo0 = OooOo0(cls);
        boolean zOooOo1 = OooOo0(Integer.TYPE);
        if (unsafeOooOO0O == null) {
            o0ooo001 = null;
        } else if (zOooOo0) {
            o0ooo001 = new o0o0000(unsafeOooOO0O);
        } else if (zOooOo1) {
            o0ooo001 = new o0OOo000(unsafeOooOO0O);
        } else {
            o0ooo001 = null;
        }
        f15604OooO0OO = o0ooo001;
        if (o0ooo001 == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = o0ooo001.f15615OooO00o.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (OooO0O0() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                OooOO0o(th);
            }
        }
        f15605OooO0Oo = z;
        oO0Oo oo0oo2 = f15604OooO0OO;
        if (oo0oo2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = oo0oo2.f15615OooO00o.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                OooOO0o(th2);
                z2 = false;
            }
        }
        f15607OooO0o0 = z2;
        f15606OooO0o = OooOo0o(byte[].class);
        OooOo0o(boolean[].class);
        OooO00o(boolean[].class);
        OooOo0o(int[].class);
        OooO00o(int[].class);
        OooOo0o(long[].class);
        OooO00o(long[].class);
        OooOo0o(float[].class);
        OooO00o(float[].class);
        OooOo0o(double[].class);
        OooO00o(double[].class);
        OooOo0o(Object[].class);
        OooO00o(Object[].class);
        Field fieldOooO0O0 = OooO0O0();
        if (fieldOooO0O0 != null && (oo0oo = f15604OooO0OO) != null) {
            oo0oo.f15615OooO00o.objectFieldOffset(fieldOooO0O0);
        }
        f15608OooO0oO = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object OooO(Class cls) {
        try {
            return f15602OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void OooO00o(Class cls) {
        if (f15607OooO0o0) {
            f15604OooO0OO.f15615OooO00o.arrayIndexScale(cls);
        }
    }

    public static Field OooO0O0() {
        Field declaredField;
        Field declaredField2;
        int i = o0o0Oo.f15594OooO00o;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void OooO0OO(Object obj, long j, byte b) {
        oO0Oo oo0oo = f15604OooO0OO;
        long j2 = (-4) & j;
        int i = oo0oo.f15615OooO00o.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        oo0oo.f15615OooO00o.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    public static void OooO0Oo(Object obj, long j, byte b) {
        oO0Oo oo0oo = f15604OooO0OO;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        oo0oo.f15615OooO00o.putInt(obj, j2, ((255 & b) << i) | (oo0oo.f15615OooO00o.getInt(obj, j2) & (~(255 << i))));
    }

    public static float OooO0o(long j, Object obj) {
        return f15604OooO0OO.OooO0O0(j, obj);
    }

    public static double OooO0o0(long j, Object obj) {
        return f15604OooO0OO.OooO00o(j, obj);
    }

    public static int OooO0oO(long j, Object obj) {
        return f15604OooO0OO.f15615OooO00o.getInt(obj, j);
    }

    public static long OooO0oo(long j, Object obj) {
        return f15604OooO0OO.f15615OooO00o.getLong(obj, j);
    }

    public static Object OooOO0(long j, Object obj) {
        return f15604OooO0OO.f15615OooO00o.getObject(obj, j);
    }

    public static Unsafe OooOO0O() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0OOOO0o());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void OooOO0o(Throwable th) {
        Logger.getLogger(o0oo0000.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void OooOOO(Object obj, long j, double d) {
        f15604OooO0OO.OooO0o0(obj, j, d);
    }

    public static void OooOOO0(Object obj, long j, boolean z) {
        f15604OooO0OO.OooO0OO(obj, j, z);
    }

    public static void OooOOOO(Object obj, long j, float f) {
        f15604OooO0OO.OooO0o(obj, j, f);
    }

    public static void OooOOOo(int i, long j, Object obj) {
        f15604OooO0OO.f15615OooO00o.putInt(obj, j, i);
    }

    public static void OooOOo(long j, Object obj, Object obj2) {
        f15604OooO0OO.f15615OooO00o.putObject(obj, j, obj2);
    }

    public static void OooOOo0(Object obj, long j, long j2) {
        f15604OooO0OO.f15615OooO00o.putLong(obj, j, j2);
    }

    public static /* bridge */ /* synthetic */ boolean OooOOoo(long j, Object obj) {
        return ((byte) ((f15604OooO0OO.f15615OooO00o.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean OooOo0(Class cls) {
        int i = o0o0Oo.f15594OooO00o;
        try {
            Class cls2 = f15603OooO0O0;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* bridge */ /* synthetic */ boolean OooOo00(long j, Object obj) {
        return ((byte) ((f15604OooO0OO.f15615OooO00o.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean OooOo0O(long j, Object obj) {
        return f15604OooO0OO.OooO0oO(j, obj);
    }

    public static int OooOo0o(Class cls) {
        if (f15607OooO0o0) {
            return f15604OooO0OO.f15615OooO00o.arrayBaseOffset(cls);
        }
        return -1;
    }
}
