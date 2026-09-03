package p231o00oOo0o;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p234o00oOoOO.oOO0O0O0;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<oOO0O0O0> f33918OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<oOO0O0O0> f33919OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f33920OooO0OO;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0O0O0>] */
    public final boolean OooO00o(@Nullable oOO0O0O0 ooo0o0o0) {
        boolean z = true;
        if (ooo0o0o0 == null) {
            return true;
        }
        boolean zRemove = this.f33918OooO00o.remove(ooo0o0o0);
        if (!this.f33919OooO0O0.remove(ooo0o0o0) && !zRemove) {
            z = false;
        }
        if (z) {
            ooo0o0o0.clear();
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o00oOoOO.oOO0O0O0>] */
    public final void OooO0O0() {
        for (oOO0O0O0 ooo0o0o0 : (ArrayList) o000O000.OooO0o0(this.f33918OooO00o)) {
            if (!ooo0o0o0.OooOO0() && !ooo0o0o0.OooO0o()) {
                ooo0o0o0.clear();
                if (this.f33920OooO0OO) {
                    this.f33919OooO0O0.add(ooo0o0o0);
                } else {
                    ooo0o0o0.OooO0oo();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f33918OooO00o.size() + ", isPaused=" + this.f33920OooO0OO + "}";
    }
}
