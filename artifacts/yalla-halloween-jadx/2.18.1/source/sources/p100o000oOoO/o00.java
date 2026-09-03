package p100o000oOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class o00<T> implements o00O000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f29324OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<T> f29325OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public T f29326OooO0OO;

    public o00(T t) {
        this.f29324OooO00o = t;
        this.f29326OooO0OO = t;
    }

    @Override // p100o000oOoO.o00O000
    public /* synthetic */ void OooO() {
    }

    @Override // p100o000oOoO.o00O000
    public final T OooO00o() {
        return this.f29326OooO0OO;
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0OO(T t) {
        this.f29325OooO0O0.add(this.f29326OooO0OO);
        this.f29326OooO0OO = t;
    }

    @Override // p100o000oOoO.o00O000
    public final /* synthetic */ void OooO0Oo() {
    }

    @Override // p100o000oOoO.o00O000
    public final void OooO0oO() {
        if (!(!this.f29325OooO0O0.isEmpty())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        List<T> list = this.f29325OooO0O0;
        this.f29326OooO0OO = (T) list.remove(list.size() - 1);
    }

    public abstract void OooOO0();

    @Override // p100o000oOoO.o00O000
    public final void clear() {
        this.f29325OooO0O0.clear();
        this.f29326OooO0OO = this.f29324OooO00o;
        OooOO0();
    }
}
