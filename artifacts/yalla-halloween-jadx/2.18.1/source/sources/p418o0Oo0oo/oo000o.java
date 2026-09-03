package p418o0Oo0oo;

import android.content.Context;
import android.content.Intent;
import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import oO0000o0.OooO0O0;
import oO0000o0.OooO0o;
import oO0o0o.OooO00o;
import p314o0O0oO0o.o00000O;
import p677o0oooo0o.ooOOO0Oo;
import p696oO0OO0oo.OooOO0O;
import p701oO0Oo0oo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {
    public static int OooO00o(Context context, double d) {
        return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + 0.5d);
    }

    public static OooO0O0 OooO0O0(ECParameterSpec eCParameterSpec) {
        if (!(eCParameterSpec instanceof Oooo0)) {
            if (eCParameterSpec == null) {
                return new OooO0O0();
            }
            OooOO0O oooOO0OOooO0O0 = OooO00o.OooO0O0(eCParameterSpec.getCurve());
            return new OooO0O0(new OooO0o(oooOO0OOooO0O0, OooO00o.OooO0OO(oooOO0OOooO0O0, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        Oooo0 oooo0 = (Oooo0) eCParameterSpec;
        ooOOO0Oo ooooo0ooOooO0o0 = o00000O.OooO0o0(oooo0.f52924OooO00o);
        if (ooooo0ooOooO0o0 == null) {
            ooooo0ooOooO0o0 = new ooOOO0Oo(oooo0.f52924OooO00o);
        }
        return new OooO0O0(ooooo0ooOooO0o0);
    }

    public static boolean OooO0OO(Context context, Intent intent) {
        if (!(!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty())) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
