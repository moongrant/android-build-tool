package oOO00O;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f60158OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f60157OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<Transition> f60159OooO0OO = new ArrayList<>();

    @Deprecated
    public o00oO0o() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00oO0o)) {
            return false;
        }
        o00oO0o o00oo0o2 = (o00oO0o) obj;
        return this.f60158OooO0O0 == o00oo0o2.f60158OooO0O0 && this.f60157OooO00o.equals(o00oo0o2.f60157OooO00o);
    }

    public final int hashCode() {
        return this.f60157OooO00o.hashCode() + (this.f60158OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbOooO0O0.append(this.f60158OooO0O0);
        sbOooO0O0.append("\n");
        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(sbOooO0O0.toString(), "    values:");
        HashMap map = this.f60157OooO00o;
        for (String str : map.keySet()) {
            strOooO00o = strOooO00o + "    " + str + ": " + map.get(str) + "\n";
        }
        return strOooO00o;
    }

    public o00oO0o(@NonNull View view) {
        this.f60158OooO0O0 = view;
    }
}
