package p241o00oo0O;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.trackselection.OooO0O0;
import com.google.common.base.o0OoOo0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f40401OooO0Oo;

    /* JADX WARN: Code duplicated, block: B:33:0x0053  */
    @Override // com.google.common.base.o0OoOo0
    public final boolean apply(Object obj) {
        boolean z;
        boolean z2;
        OooO0O0.OooO oooO;
        OooO0O0.OooO oooO2;
        OooO0O0 oooO0O0 = this.f40401OooO0Oo;
        OooOo oooOo = (OooOo) obj;
        synchronized (oooO0O0.f13618OooO0OO) {
            z = true;
            if (oooO0O0.f13622OooO0oO.f13673o00Oo0 && !oooO0O0.f13620OooO0o) {
                if (oooOo.f11225OooOoo0 > 2) {
                    String str = oooOo.f11211OooOOOO;
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
                    if ((!z2 || (o0O00.f40595OooO00o >= 32 && (oooO2 = oooO0O0.f13623OooO0oo) != null && oooO2.f13625OooO0O0)) && (o0O00.f40595OooO00o < 32 || (oooO = oooO0O0.f13623OooO0oo) == null || !oooO.f13625OooO0O0 || !oooO.f13624OooO00o.isAvailable() || !oooO0O0.f13623OooO0oo.f13624OooO00o.isEnabled() || !oooO0O0.f13623OooO0oo.OooO00o(oooOo, oooO0O0.f13617OooO))) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }
}
