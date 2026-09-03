package p231o00oOo0o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p235o00oOoOo.oOOO0O0o;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O0 implements o0OO00O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Set<oOOO0O0o<?>> f33921Oooo0o = Collections.newSetFromMap(new WeakHashMap());

    @Override // p231o00oOo0o.o0OO00O
    public final void onDestroy() {
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f33921Oooo0o)).iterator();
        while (it.hasNext()) {
            ((oOOO0O0o) it.next()).onDestroy();
        }
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onStart() {
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f33921Oooo0o)).iterator();
        while (it.hasNext()) {
            ((oOOO0O0o) it.next()).onStart();
        }
    }

    @Override // p231o00oOo0o.o0OO00O
    public final void onStop() {
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f33921Oooo0o)).iterator();
        while (it.hasNext()) {
            ((oOOO0O0o) it.next()).onStop();
        }
    }
}
