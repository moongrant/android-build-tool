package p116o00O0O0o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.o00Ooo;
import o00O0OO0.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOO0<T> implements o00O0O0O.OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0O<T> f36184OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList f36185OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f36186OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public T f36187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO00o f36188OooO0o0;

    public interface OooO00o {
        void OooO00o(@NotNull ArrayList arrayList);

        void OooO0O0(@NotNull ArrayList arrayList);
    }

    public OooOOO0(@NotNull OooOO0O<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f36184OooO00o = tracker;
        this.f36185OooO0O0 = new ArrayList();
        this.f36186OooO0OO = new ArrayList();
    }

    @Override // o00O0O0O.OooO00o
    public final void OooO00o(T t) {
        this.f36187OooO0Oo = t;
        OooO0o0(this.f36188OooO0o0, t);
    }

    public abstract boolean OooO0O0(@NotNull o00Ooo o00ooo2);

    public abstract boolean OooO0OO(T t);

    public final void OooO0Oo(@NotNull Collection workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.f36185OooO0O0.clear();
        this.f36186OooO0OO.clear();
        ArrayList arrayList = this.f36185OooO0O0;
        for (T t : workSpecs) {
            if (OooO0O0((o00Ooo) t)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = this.f36185OooO0O0;
        ArrayList arrayList3 = this.f36186OooO0OO;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((o00Ooo) it.next()).f36216OooO00o);
        }
        if (this.f36185OooO0O0.isEmpty()) {
            this.f36184OooO00o.OooO0O0(this);
        } else {
            OooOO0O<T> oooOO0O = this.f36184OooO00o;
            oooOO0O.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            synchronized (oooOO0O.f36258OooO0OO) {
                if (oooOO0O.f36259OooO0Oo.add(this)) {
                    if (oooOO0O.f36259OooO0Oo.size() == 1) {
                        oooOO0O.f36260OooO0o0 = oooOO0O.OooO00o();
                        o0Oo0oo.OooO0Oo().OooO00o(o00O0OO0.OooOOO0.f36262OooO00o, oooOO0O.getClass().getSimpleName() + ": initial state = " + oooOO0O.f36260OooO0o0);
                        oooOO0O.OooO0Oo();
                    }
                    OooO00o(oooOO0O.f36260OooO0o0);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        OooO0o0(this.f36188OooO0o0, this.f36187OooO0Oo);
    }

    public final void OooO0o0(OooO00o oooO00o, T t) {
        ArrayList arrayList = this.f36185OooO0O0;
        if (arrayList.isEmpty() || oooO00o == null) {
            return;
        }
        if (t == null || OooO0OO(t)) {
            oooO00o.OooO00o(arrayList);
        } else {
            oooO00o.OooO0O0(arrayList);
        }
    }
}
