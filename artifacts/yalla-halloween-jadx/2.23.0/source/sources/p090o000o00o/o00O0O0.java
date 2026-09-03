package p090o000o00o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p084o000Ooo0.o000oOoO;
import p089o000o00O.o00O00o0;
import p089o000o00O.oOO00O;
import p089o000o00O.oo00o;
import p091o000o0O.o0Oo0oo;
import p674oooo00o.oO0O000o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00O0O0<T> implements oOO00O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f35229OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public T f35230OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0O000o<T> f35231OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f35232OooO0Oo;

    public interface OooO00o {
    }

    public o00O0O0(oO0O000o<T> oo0o000o) {
        this.f35231OooO0OO = oo0o000o;
    }

    @Override // p089o000o00O.oOO00O
    public final void OooO00o(@Nullable T t) {
        this.f35230OooO0O0 = t;
        OooO0o0(this.f35232OooO0Oo, t);
    }

    public abstract boolean OooO0O0(@NonNull o0Oo0oo o0oo0oo2);

    public abstract boolean OooO0OO(@NonNull T t);

    public final void OooO0Oo(@NonNull Collection collection) {
        this.f35229OooO00o.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) it.next();
            if (OooO0O0(o0oo0oo2)) {
                this.f35229OooO00o.add(o0oo0oo2.f35262OooO00o);
            }
        }
        if (this.f35229OooO00o.isEmpty()) {
            this.f35231OooO0OO.OooO0O0(this);
        } else {
            oO0O000o<T> oo0o000o = this.f35231OooO0OO;
            synchronized (oo0o000o.f60983OooO0OO) {
                if (oo0o000o.f60984OooO0Oo.add(this)) {
                    if (oo0o000o.f60984OooO0Oo.size() == 1) {
                        oo0o000o.f60985OooO0o0 = oo0o000o.OooO00o();
                        o000oOoO.OooO0OO().OooO00o(oO0O000o.f60980OooO0o, String.format("%s: initial state = %s", oo0o000o.getClass().getSimpleName(), oo0o000o.f60985OooO0o0), new Throwable[0]);
                        oo0o000o.OooO0Oo();
                    }
                    OooO00o(oo0o000o.f60985OooO0o0);
                }
            }
        }
        OooO0o0(this.f35232OooO0Oo, this.f35230OooO0O0);
    }

    public final void OooO0o0(@Nullable OooO00o oooO00o, @Nullable T t) {
        if (this.f35229OooO00o.isEmpty() || oooO00o == null) {
            return;
        }
        if (t != null && !OooO0OO(t)) {
            ((oo00o) oooO00o).OooO0O0(this.f35229OooO00o);
            return;
        }
        ArrayList arrayList = this.f35229OooO00o;
        oo00o oo00oVar = (oo00o) oooO00o;
        synchronized (oo00oVar.f35228OooO0OO) {
            o00O00o0 o00o00o1 = oo00oVar.f35226OooO00o;
            if (o00o00o1 != null) {
                o00o00o1.OooO0O0(arrayList);
            }
        }
    }
}
