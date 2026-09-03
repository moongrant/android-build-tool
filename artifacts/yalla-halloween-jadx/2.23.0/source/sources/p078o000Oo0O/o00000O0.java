package p078o000Oo0O;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.OooOOOO;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f34937OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f34936OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<Transition> f34938OooO0OO = new ArrayList<>();

    @Deprecated
    public o00000O0() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00000O0)) {
            return false;
        }
        o00000O0 o00000o1 = (o00000O0) obj;
        return this.f34937OooO0O0 == o00000o1.f34937OooO0O0 && this.f34936OooO00o.equals(o00000o1.f34936OooO00o);
    }

    public final int hashCode() {
        return this.f34936OooO00o.hashCode() + (this.f34937OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbOooO0O0.append(this.f34937OooO0O0);
        sbOooO0O0.append("\n");
        String strOooO00o = OooOOOO.OooO00o(sbOooO0O0.toString(), "    values:");
        HashMap map = this.f34936OooO00o;
        for (String str : map.keySet()) {
            strOooO00o = strOooO00o + "    " + str + ": " + map.get(str) + "\n";
        }
        return strOooO00o;
    }

    public o00000O0(@NonNull View view) {
        this.f34937OooO0O0 = view;
    }
}
