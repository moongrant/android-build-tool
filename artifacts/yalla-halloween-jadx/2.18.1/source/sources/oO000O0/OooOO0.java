package oO000O0;

import com.android.billingclient.api.o0O0O00;
import p696oO0OO0oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends o0O0O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooOo00 f52550Oooo0o;

    public OooOO0(OooOo00 oooOo00) {
        if (oooOo00 == null) {
            throw new IllegalArgumentException("point has null value");
        }
        if (oooOo00.OooOO0()) {
            throw new IllegalArgumentException("point at infinity");
        }
        OooOo00 oooOo00OooOOO = oooOo00.OooOOO();
        if (!oooOo00OooOOO.OooOO0o()) {
            throw new IllegalArgumentException("point not on curve");
        }
        this.f52550Oooo0o = oooOo00OooOOO;
    }
}
