package p013OooOo0O;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOO0 extends OooO0o {

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public OooO00o f263OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f264OoooOoo;

    public static class OooO00o extends OooO0o.OooO0OO {

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int[][] f265Oooo00o;

        public OooO00o(OooO00o oooO00o, OooOO0 oooOO1, Resources resources) {
            super(oooO00o, oooOO1, resources);
            if (oooO00o != null) {
                this.f265Oooo00o = oooO00o.f265Oooo00o;
            } else {
                this.f265Oooo00o = new int[this.f237OooO0oO.length][];
            }
        }

        @Override // OooOo0O.OooO0o.OooO0OO
        public void OooO0o0() {
            int[][] iArr = this.f265Oooo00o;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f265Oooo00o;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f265Oooo00o = iArr2;
        }

        public final int OooO0oo(int[] iArr) {
            int[][] iArr2 = this.f265Oooo00o;
            int i = this.f238OooO0oo;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new OooOO0(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new OooOO0(this, resources);
        }
    }

    public OooOO0(OooO00o oooO00o, Resources resources) {
        OooO0o0(new OooO00o(oooO00o, this, resources));
        onStateChange(getState());
    }

    @Override // p013OooOo0O.OooO0o
    /* JADX INFO: renamed from: OooO0o, reason: merged with bridge method [inline-methods] */
    public OooO00o OooO0O0() {
        return new OooO00o(this.f263OoooOoO, this, null);
    }

    @Override // p013OooOo0O.OooO0o
    public void OooO0o0(@NonNull OooO0o.OooO0OO oooO0OO) {
        this.f217Oooo0o = oooO0OO;
        int i = this.f223OoooO0O;
        if (i >= 0) {
            Drawable drawableOooO0Oo = oooO0OO.OooO0Oo(i);
            this.f219Oooo0oo = drawableOooO0Oo;
            if (drawableOooO0Oo != null) {
                OooO0OO(drawableOooO0Oo);
            }
        }
        this.f216Oooo = null;
        if (oooO0OO instanceof OooO00o) {
            this.f263OoooOoO = (OooO00o) oooO0OO;
        }
    }

    @Override // p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f264OoooOoo) {
            super.mutate();
            this.f263OoooOoO.OooO0o0();
            this.f264OoooOoo = true;
        }
        return this;
    }

    @Override // p013OooOo0O.OooO0o, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iOooO0oo = this.f263OoooOoO.OooO0oo(iArr);
        if (iOooO0oo < 0) {
            iOooO0oo = this.f263OoooOoO.OooO0oo(StateSet.WILD_CARD);
        }
        return OooO0Oo(iOooO0oo) || zOnStateChange;
    }

    public OooOO0() {
    }
}
