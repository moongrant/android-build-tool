package p164o00Ooo;

import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO {
    public final void OooO00o(OooOOOO oooOOOO, float f) {
        CardView.OooO00o oooO00o = (CardView.OooO00o) oooOOOO;
        OooOo00 oooOo00 = (OooOo00) oooO00o.f4159OooO00o;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f != oooOo00.f38524OooO0o0 || oooOo00.f38523OooO0o != useCompatPadding || oooOo00.f38525OooO0oO != preventCornerOverlap) {
            oooOo00.f38524OooO0o0 = f;
            oooOo00.f38523OooO0o = useCompatPadding;
            oooOo00.f38525OooO0oO = preventCornerOverlap;
            oooOo00.OooO0OO(null);
            oooOo00.invalidateSelf();
        }
        OooO0O0(oooO00o);
    }

    public final void OooO0O0(OooOOOO oooOOOO) {
        float f;
        CardView.OooO00o oooO00o = (CardView.OooO00o) oooOOOO;
        if (!CardView.this.getUseCompatPadding()) {
            oooO00o.OooO00o(0, 0, 0, 0);
            return;
        }
        Drawable drawable = oooO00o.f4159OooO00o;
        float f2 = ((OooOo00) drawable).f38524OooO0o0;
        float f3 = ((OooOo00) drawable).f38519OooO00o;
        CardView cardView = CardView.this;
        if (cardView.getPreventCornerOverlap()) {
            f = (float) (((1.0d - OooOo.f38516OooO00o) * ((double) f3)) + ((double) f2));
        } else {
            int i = OooOo.f38517OooO0O0;
            f = f2;
        }
        int iCeil = (int) Math.ceil(f);
        int iCeil2 = (int) Math.ceil(OooOo.OooO00o(f2, f3, cardView.getPreventCornerOverlap()));
        oooO00o.OooO00o(iCeil, iCeil2, iCeil, iCeil2);
    }
}
