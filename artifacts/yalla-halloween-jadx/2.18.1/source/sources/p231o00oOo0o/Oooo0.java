package p231o00oOo0o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<o0OO00O> f33908OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f33909OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f33910OooO0OO;

    @Override // p231o00oOo0o.o0Oo0oo
    public final void OooO00o(@NonNull o0OO00O o0oo00o2) {
        this.f33908OooO00o.remove(o0oo00o2);
    }

    @Override // p231o00oOo0o.o0Oo0oo
    public final void OooO0O0(@NonNull o0OO00O o0oo00o2) {
        this.f33908OooO00o.add(o0oo00o2);
        if (this.f33910OooO0OO) {
            o0oo00o2.onDestroy();
        } else if (this.f33909OooO0O0) {
            o0oo00o2.onStart();
        } else {
            o0oo00o2.onStop();
        }
    }

    public final void OooO0OO() {
        this.f33910OooO0OO = true;
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f33908OooO00o)).iterator();
        while (it.hasNext()) {
            ((o0OO00O) it.next()).onDestroy();
        }
    }

    public final void OooO0Oo() {
        this.f33909OooO0O0 = true;
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f33908OooO00o)).iterator();
        while (it.hasNext()) {
            ((o0OO00O) it.next()).onStart();
        }
    }

    public final void OooO0o0() {
        this.f33909OooO0O0 = false;
        Iterator it = ((ArrayList) o000O000.OooO0o0(this.f33908OooO00o)).iterator();
        while (it.hasNext()) {
            ((o0OO00O) it.next()).onStop();
        }
    }
}
