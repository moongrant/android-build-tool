package p334o0OO00o;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Unsafe f37425OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Class f37426OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0OO0o f37427OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f37428OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final long f37429OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f37430OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final boolean f37431OooO0oO;

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0039  */
    static {
        o0OO0o o0ooooo1;
        boolean z;
        boolean z2;
        o0OO0o o0oo0o2;
        Unsafe unsafeOooOO0O = OooOO0O();
        f37425OooO00o = unsafeOooOO0O;
        f37426OooO0O0 = o00OO00O.OooO00o();
        Class<?> cls = Long.TYPE;
        boolean zOooOo0 = OooOo0(cls);
        boolean zOooOo1 = OooOo0(Integer.TYPE);
        if (unsafeOooOO0O == null) {
            o0ooooo1 = null;
        } else if (zOooOo0) {
            o0ooooo1 = new o0OO0o00(unsafeOooOO0O);
        } else if (zOooOo1) {
            o0ooooo1 = new o0OOooO0(unsafeOooOO0O);
        } else {
            o0ooooo1 = null;
        }
        f37427OooO0OO = o0ooooo1;
        if (o0ooooo1 == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = o0ooooo1.f37424OooO00o.getClass();
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
        f37428OooO0Oo = z;
        o0OO0o o0oo0o3 = f37427OooO0OO;
        if (o0oo0o3 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = o0oo0o3.f37424OooO00o.getClass();
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
        f37430OooO0o0 = z2;
        f37429OooO0o = OooOo0o(byte[].class);
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
        if (fieldOooO0O0 != null && (o0oo0o2 = f37427OooO0OO) != null) {
            o0oo0o2.OooOO0o(fieldOooO0O0);
        }
        f37431OooO0oO = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object OooO(Class cls) {
        try {
            return f37425OooO00o.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int OooO00o(Class cls) {
        if (f37430OooO0o0) {
            return f37427OooO0OO.OooO(cls);
        }
        return -1;
    }

    public static Field OooO0O0() {
        Field declaredField;
        Field declaredField2;
        int i = o00OO00O.f37328OooO00o;
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
        long j2 = (-4) & j;
        o0OO0o o0oo0o2 = f37427OooO0OO;
        int iOooOO0 = o0oo0o2.OooOO0(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        o0oo0o2.OooOOO(obj, j2, ((255 & b) << i) | (iOooOO0 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static void OooO0Oo(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        o0OO0o o0oo0o2 = f37427OooO0OO;
        int i = (((int) j) & 3) << 3;
        o0oo0o2.OooOOO(obj, j2, ((255 & b) << i) | (o0oo0o2.OooOO0(obj, j2) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static float OooO0o(Object obj, long j) {
        return f37427OooO0OO.OooO0O0(obj, j);
    }

    public static double OooO0o0(Object obj, long j) {
        return f37427OooO0OO.OooO00o(obj, j);
    }

    public static int OooO0oO(Object obj, long j) {
        return f37427OooO0OO.OooOO0(obj, j);
    }

    public static long OooO0oo(Object obj, long j) {
        return f37427OooO0OO.OooOO0O(obj, j);
    }

    public static Object OooOO0(Object obj, long j) {
        return f37427OooO0OO.OooOOO0(obj, j);
    }

    public static Unsafe OooOO0O() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o0OO0O0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void OooOO0o(Throwable th) {
        Logger.getLogger(o0OO0oO0.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void OooOOO(Object obj, long j, double d) {
        f37427OooO0OO.OooO0o0(obj, j, d);
    }

    public static void OooOOO0(Object obj, long j, boolean z) {
        f37427OooO0OO.OooO0OO(obj, j, z);
    }

    public static void OooOOOO(Object obj, long j, float f) {
        f37427OooO0OO.OooO0o(obj, j, f);
    }

    public static void OooOOOo(Object obj, long j, int i) {
        f37427OooO0OO.OooOOO(obj, j, i);
    }

    public static void OooOOo(Object obj, long j, Object obj2) {
        f37427OooO0OO.OooOOOo(obj, j, obj2);
    }

    public static void OooOOo0(Object obj, long j, long j2) {
        f37427OooO0OO.OooOOOO(obj, j, j2);
    }

    public static /* bridge */ /* synthetic */ boolean OooOOoo(Object obj, long j) {
        return ((byte) ((f37427OooO0OO.OooOO0(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean OooOo0(Class cls) {
        int i = o00OO00O.f37328OooO00o;
        try {
            Class cls2 = f37426OooO0O0;
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

    public static /* bridge */ /* synthetic */ boolean OooOo00(Object obj, long j) {
        return ((byte) ((f37427OooO0OO.OooOO0(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean OooOo0O(Object obj, long j) {
        return f37427OooO0OO.OooO0oO(obj, j);
    }

    public static int OooOo0o(Class cls) {
        if (f37430OooO0o0) {
            return f37427OooO0OO.OooO0oo(cls);
        }
        return -1;
    }
}
