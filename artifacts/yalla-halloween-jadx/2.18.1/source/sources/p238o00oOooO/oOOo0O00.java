package p238o00oOooO;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import p227o00oOOoO.ooooO000;

/* JADX INFO: loaded from: classes.dex */
public final class oOOo0O00 extends ooooO000<oOOOOo0O> {
    public oOOo0O00(oOOOOo0O oooooo0o) {
        super(oooooo0o);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o00oOooO.oo000000$OooO0O0>] */
    @Override // p214o00oO0.o00OOOO0
    public final void OooO00o() {
        ((oOOOOo0O) this.f33879Oooo0o).stop();
        oOOOOo0O oooooo0o = (oOOOOo0O) this.f33879Oooo0o;
        oooooo0o.f34070Oooo = true;
        oo000000 oo000000Var = oooooo0o.f34071Oooo0o.f34081OooO00o;
        oo000000Var.f34089OooO0OO.clear();
        Bitmap bitmap = oo000000Var.f34097OooOO0o;
        if (bitmap != null) {
            oo000000Var.f34092OooO0o0.OooO0O0(bitmap);
            oo000000Var.f34097OooOO0o = null;
        }
        oo000000Var.f34091OooO0o = false;
        oo000000.OooO00o oooO00o = oo000000Var.f34086OooO;
        if (oooO00o != null) {
            oo000000Var.f34090OooO0Oo.OooO0o0(oooO00o);
            oo000000Var.f34086OooO = null;
        }
        oo000000.OooO00o oooO00o2 = oo000000Var.f34096OooOO0O;
        if (oooO00o2 != null) {
            oo000000Var.f34090OooO0Oo.OooO0o0(oooO00o2);
            oo000000Var.f34096OooOO0O = null;
        }
        oo000000.OooO00o oooO00o3 = oo000000Var.f34098OooOOO;
        if (oooO00o3 != null) {
            oo000000Var.f34090OooO0Oo.OooO0o0(oooO00o3);
            oo000000Var.f34098OooOOO = null;
        }
        oo000000Var.f34087OooO00o.clear();
        oo000000Var.f34095OooOO0 = true;
    }

    @Override // p214o00oO0.o00OOOO0
    @NonNull
    public final Class<oOOOOo0O> OooO0OO() {
        return oOOOOo0O.class;
    }

    @Override // p214o00oO0.o00OOOO0
    public final int getSize() {
        oo000000 oo000000Var = ((oOOOOo0O) this.f33879Oooo0o).f34071Oooo0o.f34081OooO00o;
        return oo000000Var.f34087OooO00o.OooO0oO() + oo000000Var.f34100OooOOOO;
    }

    @Override // p227o00oOOoO.ooooO000, p214o00oO0.o00OOO00
    public final void initialize() {
        ((oOOOOo0O) this.f33879Oooo0o).OooO0O0().prepareToDraw();
    }
}
