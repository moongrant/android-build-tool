package p100o000oOoO;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ArrayList<T> f29666OooO00o = new ArrayList<>();

    public final void OooO00o() {
        this.f29666OooO00o.clear();
    }

    public final int OooO0O0() {
        return this.f29666OooO00o.size();
    }

    public final boolean OooO0OO() {
        return !this.f29666OooO00o.isEmpty();
    }

    public final T OooO0Oo() {
        return this.f29666OooO00o.remove(OooO0O0() - 1);
    }

    public final boolean OooO0o0(T t) {
        return this.f29666OooO00o.add(t);
    }
}
