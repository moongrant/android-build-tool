package p387o0OOoo0o;

import OooO00o.OooO00o;
import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 implements o0o0Oo<Object> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Type f38897OooO00o;

    public o00O0OO0(Type type) {
        this.f38897OooO00o = type;
    }

    @Override // p387o0OOoo0o.o0o0Oo
    public final Object OooO00o() {
        Type type = this.f38897OooO00o;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Invalid EnumMap type: ");
            sbOooO0o0.append(this.f38897OooO00o.toString());
            throw new JsonIOException(sbOooO0o0.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Invalid EnumMap type: ");
        sbOooO0o1.append(this.f38897OooO00o.toString());
        throw new JsonIOException(sbOooO0o1.toString());
    }
}
