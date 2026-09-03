package p555o0oOOoo;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo<T> implements oo0OOoo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? extends T> f56155OooO00o;

    public o0O0OOOo(@NonNull Class<? extends T> cls) {
        this.f56155OooO00o = cls;
    }

    @Override // p555o0oOOoo.oo0OOoo
    @NonNull
    public final T OooO00o() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.f56155OooO00o.newInstance();
    }
}
