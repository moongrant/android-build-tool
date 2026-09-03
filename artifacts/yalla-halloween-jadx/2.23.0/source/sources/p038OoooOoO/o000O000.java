package p038OoooOoO;

import androidx.annotation.NonNull;
import androidx.camera.core.Oooo0;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000O0o f1632OooO00o;

    public o000O000(o000O0o o000o0o2) {
        this.f1632OooO00o = o000o0o2;
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
        Iterator<Oooo0> it = this.f1632OooO00o.f1634OooO0Oo.iterator();
        while (it.hasNext()) {
            SessionConfig sessionConfig = it.next().f3497OooOOO0;
            Iterator<o000oOoO> it2 = sessionConfig.f3622OooO0o.f3652OooO0o0.iterator();
            while (it2.hasNext()) {
                it2.next().OooO0O0(new o000Oo0(o00oo1, sessionConfig.f3622OooO0o.f3653OooO0oO, -1L));
            }
        }
    }
}
