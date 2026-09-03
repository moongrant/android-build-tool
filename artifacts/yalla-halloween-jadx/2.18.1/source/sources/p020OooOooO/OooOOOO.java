package p020OooOooO;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOOO {
    public final OooOo OooO00o(OooOo00 oooOo00) {
        return (OooOo) ((CardView.OooO00o) oooOo00).f5505OooO00o;
    }

    public final float OooO0O0(OooOo00 oooOo00) {
        return OooO00o(oooOo00).f386OooO0o0;
    }

    public final float OooO0OO(OooOo00 oooOo00) {
        return OooO00o(oooOo00).f381OooO00o;
    }

    public final void OooO0Oo(OooOo00 oooOo00, float f) {
        OooOo oooOoOooO00o = OooO00o(oooOo00);
        CardView.OooO00o oooO00o = (CardView.OooO00o) oooOo00;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean zOooO00o = oooO00o.OooO00o();
        if (f != oooOoOooO00o.f386OooO0o0 || oooOoOooO00o.f385OooO0o != useCompatPadding || oooOoOooO00o.f387OooO0oO != zOooO00o) {
            oooOoOooO00o.f386OooO0o0 = f;
            oooOoOooO00o.f385OooO0o = useCompatPadding;
            oooOoOooO00o.f387OooO0oO = zOooO00o;
            oooOoOooO00o.OooO0OO(null);
            oooOoOooO00o.invalidateSelf();
        }
        OooO0o0(oooOo00);
    }

    public final void OooO0o0(OooOo00 oooOo00) {
        CardView.OooO00o oooO00o = (CardView.OooO00o) oooOo00;
        if (!CardView.this.getUseCompatPadding()) {
            oooO00o.OooO0O0(0, 0, 0, 0);
            return;
        }
        float fOooO0O0 = OooO0O0(oooOo00);
        float fOooO0OO = OooO0OO(oooOo00);
        int iCeil = (int) Math.ceil(Oooo000.OooO00o(fOooO0O0, fOooO0OO, oooO00o.OooO00o()));
        int iCeil2 = (int) Math.ceil(Oooo000.OooO0O0(fOooO0O0, fOooO0OO, oooO00o.OooO00o()));
        oooO00o.OooO0O0(iCeil, iCeil2, iCeil, iCeil2);
    }
}
