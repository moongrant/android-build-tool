package com.google.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Unsafe f19385OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f19386OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f19387OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f19388OooO0Oo;

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
            return null;
        }
    }

    static {
        boolean z;
        Field declaredField;
        Unsafe unsafeOooO0o0 = OooO0o0();
        f19385OooO00o = unsafeOooO0o0;
        boolean z2 = false;
        if (unsafeOooO0o0 != null) {
            try {
                Class<?> cls = unsafeOooO0o0.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                z = true;
            } catch (Throwable unused) {
                z = false;
            }
        } else {
            z = false;
        }
        f19386OooO0O0 = z;
        Unsafe unsafe = f19385OooO00o;
        if (unsafe != null) {
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("arrayBaseOffset", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getByte", Object.class, cls4);
                cls3.getMethod("putByte", Object.class, cls4, Byte.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("copyMemory", Object.class, cls4, Object.class, cls4, cls4);
                z2 = true;
            } catch (Throwable unused2) {
            }
        }
        f19387OooO0OO = z2;
        f19388OooO0Oo = OooO00o();
        try {
            declaredField = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
            declaredField.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField = null;
        }
        OooO0O0(declaredField);
    }

    public static int OooO00o() {
        if (f19387OooO0OO) {
            return f19385OooO00o.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    public static long OooO0O0(Field field) {
        Unsafe unsafe;
        if (field == null || (unsafe = f19385OooO00o) == null) {
            return -1L;
        }
        return unsafe.objectFieldOffset(field);
    }

    public static byte OooO0OO(byte[] bArr, long j) {
        return f19385OooO00o.getByte(bArr, j);
    }

    public static long OooO0Oo(byte[] bArr, long j) {
        return f19385OooO00o.getLong(bArr, j);
    }

    public static void OooO0o(byte[] bArr, long j, byte b) {
        f19385OooO00o.putByte(bArr, j, b);
    }

    public static Unsafe OooO0o0() {
        try {
            return (Unsafe) AccessController.doPrivileged(new OooO00o());
        } catch (Throwable unused) {
            return null;
        }
    }
}
