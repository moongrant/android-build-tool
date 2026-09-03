package OooOo;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class OooO extends OooO0O0 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f217OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public OooO00o f218OooOOo0;

    public static class OooO00o extends OooO0O0.OooO0OO {

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int[][] f219Oooo00o;

        public OooO00o(OooO00o oooO00o, OooO oooO, Resources resources) {
            super(oooO00o, oooO, resources);
            if (oooO00o != null) {
                this.f219Oooo00o = oooO00o.f219Oooo00o;
            } else {
                this.f219Oooo00o = new int[this.f256OooO0oO.length][];
            }
        }

        public final int OooO0o(int[] iArr) {
            int[][] iArr2 = this.f219Oooo00o;
            int i = this.f257OooO0oo;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // OooOo.OooO0O0.OooO0OO
        public void OooO0o0() {
            int[][] iArr = this.f219Oooo00o;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f219Oooo00o[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f219Oooo00o = iArr2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new OooO(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new OooO(this, resources);
        }
    }

    public OooO(OooO00o oooO00o, Resources resources) {
        OooO0o0(new OooO00o(oooO00o, this, resources));
        onStateChange(getState());
    }

    @Override // OooOo.OooO0O0
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public OooO00o OooO0O0() {
        return new OooO00o(this.f218OooOOo0, this, null);
    }

    @Override // OooOo.OooO0O0
    public void OooO0o0(@NonNull OooO0O0.OooO0OO oooO0OO) {
        this.f236OooO0Oo = oooO0OO;
        int i = this.f241OooOO0;
        if (i >= 0) {
            Drawable drawableOooO0Oo = oooO0OO.OooO0Oo(i);
            this.f237OooO0o = drawableOooO0Oo;
            if (drawableOooO0Oo != null) {
                OooO0OO(drawableOooO0Oo);
            }
        }
        this.f239OooO0oO = null;
        if (oooO0OO instanceof OooO00o) {
            this.f218OooOOo0 = (OooO00o) oooO0OO;
        }
    }

    @Override // OooOo.OooO0O0, android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // OooOo.OooO0O0, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f217OooOOo) {
            super.mutate();
            this.f218OooOOo0.OooO0o0();
            this.f217OooOOo = true;
        }
        return this;
    }

    @Override // OooOo.OooO0O0, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iOooO0o = this.f218OooOOo0.OooO0o(iArr);
        if (iOooO0o < 0) {
            iOooO0o = this.f218OooOOo0.OooO0o(StateSet.WILD_CARD);
        }
        return OooO0Oo(iOooO0o) || zOnStateChange;
    }

    public OooO() {
    }
}
