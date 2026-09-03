package p551o0oOOoOO;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OO000o<T> implements oo0oO0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? extends T> f55951OooO00o;

    public o0OO000o(@NonNull Class<? extends T> cls) {
        this.f55951OooO00o = cls;
    }

    @Override // p551o0oOOoOO.oo0oO0
    @NonNull
    public final T OooO00o() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.f55951OooO00o.newInstance();
    }
}
