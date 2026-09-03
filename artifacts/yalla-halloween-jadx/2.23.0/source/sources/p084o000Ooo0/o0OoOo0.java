package p084o000Ooo0;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.OverwritingInputMerger;
import java.util.UUID;
import p091o000o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends o0ooOOo {

    public static final class OooO00o extends o0ooOOo.OooO00o<OooO00o, o0OoOo0> {
        public OooO00o() {
            this.f35119OooO0O0.f35265OooO0Oo = OverwritingInputMerger.class.getName();
        }
    }

    public o0OoOo0(OooO00o oooO00o) {
        super(oooO00o.f35118OooO00o, oooO00o.f35119OooO0O0, oooO00o.f35120OooO0OO);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @NonNull
    public static o0OoOo0 OooO00o() {
        OooO00o oooO00o = new OooO00o();
        o0OoOo0 o0oooo0 = new o0OoOo0(oooO00o);
        OooO oooO = oooO00o.f35119OooO0O0.f35270OooOO0;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 24) {
            if (!(oooO.f35090OooO0oo.f35097OooO00o.size() > 0)) {
                if (!oooO.f35086OooO0Oo) {
                    z = false;
                }
            }
        } else if (!oooO.f35086OooO0Oo && !oooO.f35084OooO0O0 && !oooO.f35085OooO0OO) {
            z = false;
        }
        o0Oo0oo o0oo0oo2 = oooO00o.f35119OooO0O0;
        if (o0oo0oo2.f35278OooOOo0) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (o0oo0oo2.f35268OooO0oO > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        oooO00o.f35118OooO00o = UUID.randomUUID();
        o0Oo0oo o0oo0oo3 = new o0Oo0oo(oooO00o.f35119OooO0O0);
        oooO00o.f35119OooO0O0 = o0oo0oo3;
        o0oo0oo3.f35262OooO00o = oooO00o.f35118OooO00o.toString();
        return o0oooo0;
    }
}
