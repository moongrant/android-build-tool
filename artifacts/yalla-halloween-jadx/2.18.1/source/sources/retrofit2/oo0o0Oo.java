package retrofit2;

import javax.annotation.Nullable;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0Oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OOOO0 f53906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final T f53907OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o00OOOOo f53908OooO0OO;

    public oo0o0Oo(o00OOOO0 o00oooo1, @Nullable T t, @Nullable o00OOOOo o00ooooo2) {
        this.f53906OooO00o = o00oooo1;
        this.f53907OooO0O0 = t;
        this.f53908OooO0OO = o00ooooo2;
    }

    public static <T> oo0o0Oo<T> OooO0O0(@Nullable T t, o00OOOO0 o00oooo1) {
        if (o00oooo1.OooO0Oo()) {
            return new oo0o0Oo<>(o00oooo1, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final boolean OooO00o() {
        return this.f53906OooO00o.OooO0Oo();
    }

    public final String toString() {
        return this.f53906OooO00o.toString();
    }
}
