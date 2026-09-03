package o0OOOOOO;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import o0OOOO0o.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO<T> {
    public final Type OooO00o() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        OooOOOO.OooO0oO(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
