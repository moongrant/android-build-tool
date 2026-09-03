package p166o00Ooo;

import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OOo {
    public final void OooO00o(o000000 o000000Var, float f) {
        CardView.OooO00o oooO00o = (CardView.OooO00o) o000000Var;
        o000000O o000000o2 = (o000000O) oooO00o.f4159OooO00o;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean preventCornerOverlap = CardView.this.getPreventCornerOverlap();
        if (f != o000000o2.f38215OooO0o0 || o000000o2.f38214OooO0o != useCompatPadding || o000000o2.f38216OooO0oO != preventCornerOverlap) {
            o000000o2.f38215OooO0o0 = f;
            o000000o2.f38214OooO0o = useCompatPadding;
            o000000o2.f38216OooO0oO = preventCornerOverlap;
            o000000o2.OooO0OO(null);
            o000000o2.invalidateSelf();
        }
        OooO0O0(oooO00o);
    }

    public final void OooO0O0(o000000 o000000Var) {
        float f;
        CardView.OooO00o oooO00o = (CardView.OooO00o) o000000Var;
        if (!CardView.this.getUseCompatPadding()) {
            oooO00o.OooO00o(0, 0, 0, 0);
            return;
        }
        Drawable drawable = oooO00o.f4159OooO00o;
        float f2 = ((o000000O) drawable).f38215OooO0o0;
        float f3 = ((o000000O) drawable).f38210OooO00o;
        CardView cardView = CardView.this;
        if (cardView.getPreventCornerOverlap()) {
            f = (float) (((1.0d - o00000.f38207OooO00o) * ((double) f3)) + ((double) f2));
        } else {
            int i = o00000.f38208OooO0O0;
            f = f2;
        }
        int iCeil = (int) Math.ceil(f);
        int iCeil2 = (int) Math.ceil(o00000.OooO00o(f2, f3, cardView.getPreventCornerOverlap()));
        oooO00o.OooO00o(iCeil, iCeil2, iCeil, iCeil2);
    }
}
