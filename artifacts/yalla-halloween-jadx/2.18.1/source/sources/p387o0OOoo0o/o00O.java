package p387o0OOoo0o;

import OooO00o.OooO00o;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O implements o0o0Oo<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo00oO f38888OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Class f38889OooO0O0;

    public o00O(Class cls) {
        oo00oO o0o00o1;
        this.f38889OooO0O0 = cls;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            o0o00o1 = new o00OOOOo(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    o0o00o1 = new o00Oo00(declaredMethod2, iIntValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    o0o00o1 = new o0oOO(declaredMethod3);
                }
            } catch (Exception unused3) {
                o0o00o1 = new o0O00o0();
            }
        }
        this.f38888OooO00o = o0o00o1;
    }

    @Override // p387o0OOoo0o.o0o0Oo
    public final Object OooO00o() {
        try {
            return this.f38888OooO00o.OooO0O0(this.f38889OooO0O0);
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to create instance of ");
            sbOooO0o0.append(this.f38889OooO0O0);
            sbOooO0o0.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(sbOooO0o0.toString(), e);
        }
    }
}
