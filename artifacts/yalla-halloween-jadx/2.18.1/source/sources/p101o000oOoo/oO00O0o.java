package p101o000oOoo;

import OooO00o.OooO00o;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p016OooOoO0.OooOo00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oO00O0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View f29743OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, Object> f29742OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<Transition> f29744OooO0OO = new ArrayList<>();

    @Deprecated
    public oO00O0o() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oO00O0o)) {
            return false;
        }
        oO00O0o oo00o0o = (oO00O0o) obj;
        return this.f29743OooO0O0 == oo00o0o.f29743OooO0O0 && this.f29742OooO00o.equals(oo00o0o.f29742OooO00o);
    }

    public final int hashCode() {
        return this.f29742OooO00o.hashCode() + (this.f29743OooO0O0.hashCode() * 31);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TransitionValues@");
        sbOooO0o0.append(Integer.toHexString(hashCode()));
        sbOooO0o0.append(":\n");
        StringBuilder sbOooO00o = Oooo0.OooO00o(sbOooO0o0.toString(), "    view = ");
        sbOooO00o.append(this.f29743OooO0O0);
        sbOooO00o.append("\n");
        String strOooO0Oo = OooOo00.OooO0Oo(sbOooO00o.toString(), "    values:");
        for (String str : this.f29742OooO00o.keySet()) {
            strOooO0Oo = strOooO0Oo + "    " + str + ": " + this.f29742OooO00o.get(str) + "\n";
        }
        return strOooO0Oo;
    }

    public oO00O0o(@NonNull View view) {
        this.f29743OooO0O0 = view;
    }
}
