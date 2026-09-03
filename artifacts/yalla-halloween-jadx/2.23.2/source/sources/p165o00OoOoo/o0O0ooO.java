package p165o00OoOoo;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.OooOo00;
import p163o00OoOo0.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO extends o0OOO0o<o00> {
    public o0O0ooO(o00 o00Var) {
        super(o00Var);
    }

    @Override // p144o00Oo.o00oOoo
    public final void OooO00o() {
        o00 o00Var = (o00) this.f38106OooO0Oo;
        o00Var.stop();
        o00Var.f38160OooO0oO = true;
        o00O000 o00o001 = o00Var.f38157OooO0Oo.f38167OooO00o;
        o00o001.f38183OooO0OO.clear();
        Bitmap bitmap = o00o001.f38191OooOO0o;
        if (bitmap != null) {
            o00o001.f38186OooO0o0.OooO0Oo(bitmap);
            o00o001.f38191OooOO0o = null;
        }
        o00o001.f38185OooO0o = false;
        o00O000.OooO00o oooO00o = o00o001.f38180OooO;
        OooOo00 oooOo00 = o00o001.f38184OooO0Oo;
        if (oooO00o != null) {
            oooOo00.OooOOO0(oooO00o);
            o00o001.f38180OooO = null;
        }
        o00O000.OooO00o oooO00o2 = o00o001.f38190OooOO0O;
        if (oooO00o2 != null) {
            oooOo00.OooOOO0(oooO00o2);
            o00o001.f38190OooOO0O = null;
        }
        o00O000.OooO00o oooO00o3 = o00o001.f38192OooOOO;
        if (oooO00o3 != null) {
            oooOo00.OooOOO0(oooO00o3);
            o00o001.f38192OooOOO = null;
        }
        o00o001.f38181OooO00o.clear();
        o00o001.f38189OooOO0 = true;
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Class<o00> OooO0OO() {
        return o00.class;
    }

    @Override // p144o00Oo.o00oOoo
    public final int getSize() {
        o00O000 o00o001 = ((o00) this.f38106OooO0Oo).f38157OooO0Oo.f38167OooO00o;
        return o00o001.f38181OooO00o.OooO0oO() + o00o001.f38194OooOOOO;
    }

    @Override // p163o00OoOo0.o0OOO0o, p144o00Oo.o000OOo0
    public final void initialize() {
        ((o00) this.f38106OooO0Oo).f38157OooO0Oo.f38167OooO00o.f38191OooOO0o.prepareToDraw();
    }
}
