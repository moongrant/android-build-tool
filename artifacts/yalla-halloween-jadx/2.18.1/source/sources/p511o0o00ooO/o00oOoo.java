package p511o0o00ooO;

import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo<T> implements o00O000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<? extends T> f42032OooO00o;

    public o00oOoo(@NonNull Class<? extends T> cls) {
        this.f42032OooO00o = cls;
    }

    @Override // p511o0o00ooO.o00O000
    @NonNull
    public final T OooO00o() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        return this.f42032OooO00o.newInstance();
    }
}
