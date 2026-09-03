package p425o0OoO0o;

import androidx.media3.common.OooOO0;
import androidx.media3.exoplayer.trackselection.OooO0O0;
import com.google.common.base.o00O0O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00Ooo implements o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f46761OooO0Oo;

    public /* synthetic */ o00Ooo(OooO0O0 oooO0O0) {
        this.f46761OooO0Oo = oooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    @Override // com.google.common.base.o00O0O
    public final boolean apply(Object obj) {
        boolean z;
        boolean z2;
        OooO0O0.OooO oooO;
        OooO0O0.OooO oooO2;
        OooO0O0 oooO0O0 = this.f46761OooO0Oo;
        OooOO0 oooOO1 = (OooOO0) obj;
        synchronized (oooO0O0.f8134OooO0OO) {
            z = true;
            if (oooO0O0.f8138OooO0oO.f8189o00Oo0 && !oooO0O0.f8136OooO0o) {
                if (oooOO1.f6426OooOoo0 > 2) {
                    String str = oooOO1.f6412OooOOOO;
                    if (str != null) {
                        switch (str) {
                            case "audio/eac3-joc":
                            case "audio/ac3":
                            case "audio/ac4":
                            case "audio/eac3":
                                z2 = true;
                                break;
                            default:
                                z2 = false;
                                break;
                        }
                    } else {
                        z2 = false;
                    }
                    if ((!z2 || (o00.f34910OooO00o >= 32 && (oooO2 = oooO0O0.f8139OooO0oo) != null && oooO2.f8141OooO0O0)) && (o00.f34910OooO00o < 32 || (oooO = oooO0O0.f8139OooO0oo) == null || !oooO.f8141OooO0O0 || !oooO.f8140OooO00o.isAvailable() || !oooO0O0.f8139OooO0oo.f8140OooO00o.isEnabled() || !oooO0O0.f8139OooO0oo.OooO00o(oooO0O0.f8133OooO, oooOO1))) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }
}
