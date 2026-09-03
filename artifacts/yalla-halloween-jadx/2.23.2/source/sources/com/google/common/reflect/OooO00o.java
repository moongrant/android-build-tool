package com.google.common.reflect;

import com.google.common.base.o0OoOo0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class OooO00o<T> {
    public final Type OooO00o() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        o0OoOo0.OooO0o(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
