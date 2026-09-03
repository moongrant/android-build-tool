package p387o0OOoo0o;

import OooO00o.OooO00o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO implements o0o0Oo<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Constructor f38906OooO00o;

    public o00OO0OO(Constructor constructor) {
        this.f38906OooO00o = constructor;
    }

    @Override // p387o0OOoo0o.o0o0Oo
    public final Object OooO00o() {
        try {
            return this.f38906OooO00o.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to invoke ");
            sbOooO0o0.append(this.f38906OooO00o);
            sbOooO0o0.append(" with no args");
            throw new RuntimeException(sbOooO0o0.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Failed to invoke ");
            sbOooO0o1.append(this.f38906OooO00o);
            sbOooO0o1.append(" with no args");
            throw new RuntimeException(sbOooO0o1.toString(), e3.getTargetException());
        }
    }
}
