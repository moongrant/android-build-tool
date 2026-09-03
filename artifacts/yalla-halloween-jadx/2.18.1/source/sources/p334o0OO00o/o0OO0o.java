package p334o0OO00o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Unsafe f37424OooO00o;

    public o0OO0o(Unsafe unsafe) {
        this.f37424OooO00o = unsafe;
    }

    public final int OooO(Class cls) {
        return this.f37424OooO00o.arrayIndexScale(cls);
    }

    public abstract double OooO00o(Object obj, long j);

    public abstract float OooO0O0(Object obj, long j);

    public abstract void OooO0OO(Object obj, long j, boolean z);

    public abstract void OooO0Oo(Object obj, long j, byte b);

    public abstract void OooO0o(Object obj, long j, float f);

    public abstract void OooO0o0(Object obj, long j, double d);

    public abstract boolean OooO0oO(Object obj, long j);

    public final int OooO0oo(Class cls) {
        return this.f37424OooO00o.arrayBaseOffset(cls);
    }

    public final int OooOO0(Object obj, long j) {
        return this.f37424OooO00o.getInt(obj, j);
    }

    public final long OooOO0O(Object obj, long j) {
        return this.f37424OooO00o.getLong(obj, j);
    }

    public final long OooOO0o(Field field) {
        return this.f37424OooO00o.objectFieldOffset(field);
    }

    public final void OooOOO(Object obj, long j, int i) {
        this.f37424OooO00o.putInt(obj, j, i);
    }

    public final Object OooOOO0(Object obj, long j) {
        return this.f37424OooO00o.getObject(obj, j);
    }

    public final void OooOOOO(Object obj, long j, long j2) {
        this.f37424OooO00o.putLong(obj, j, j2);
    }

    public final void OooOOOo(Object obj, long j, Object obj2) {
        this.f37424OooO00o.putObject(obj, j, obj2);
    }
}
