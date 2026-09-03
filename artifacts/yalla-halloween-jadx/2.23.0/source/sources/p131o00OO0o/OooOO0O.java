package p131o00OO0o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooOo00;
import o00OO0OO.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooOOO<OooO> {
    public OooOO0O(OooO oooO) {
        super(oooO);
    }

    @Override // p127o00O0oo.o0000
    public final void OooO00o() {
        OooO oooO = (OooO) this.f37259OooO0Oo;
        oooO.stop();
        oooO.f37267OooO0oO = true;
        OooOOO oooOOO = oooO.f37264OooO0Oo.f37274OooO00o;
        oooOOO.f37288OooO0OO.clear();
        Bitmap bitmap = oooOOO.f37296OooOO0o;
        if (bitmap != null) {
            oooOOO.f37291OooO0o0.OooO0Oo(bitmap);
            oooOOO.f37296OooOO0o = null;
        }
        oooOOO.f37290OooO0o = false;
        OooOOO.OooO00o oooO00o = oooOOO.f37285OooO;
        OooOo00 oooOo00 = oooOOO.f37289OooO0Oo;
        if (oooO00o != null) {
            oooOo00.OooOOO0(oooO00o);
            oooOOO.f37285OooO = null;
        }
        OooOOO.OooO00o oooO00o2 = oooOOO.f37295OooOO0O;
        if (oooO00o2 != null) {
            oooOo00.OooOOO0(oooO00o2);
            oooOOO.f37295OooOO0O = null;
        }
        OooOOO.OooO00o oooO00o3 = oooOOO.f37297OooOOO;
        if (oooO00o3 != null) {
            oooOo00.OooOOO0(oooO00o3);
            oooOOO.f37297OooOOO = null;
        }
        oooOOO.f37286OooO00o.clear();
        oooOOO.f37294OooOO0 = true;
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Class<OooO> OooO0O0() {
        return OooO.class;
    }

    @Override // p127o00O0oo.o0000
    public final int getSize() {
        OooOOO oooOOO = ((OooO) this.f37259OooO0Oo).f37264OooO0Oo.f37274OooO00o;
        return oooOOO.f37286OooO00o.OooO0oO() + oooOOO.f37299OooOOOO;
    }

    @Override // o00OO0OO.OooOOO, p127o00O0oo.o00000O0
    public final void initialize() {
        ((OooO) this.f37259OooO0Oo).f37264OooO0Oo.f37274OooO00o.f37296OooOO0o.prepareToDraw();
    }
}
