package p238o00oOooO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.util.List;
import java.util.Objects;
import p103o000oo00.OooOO0O;
import p217o00oO00o.o00000OO;
import p243o00oo00O.o000;

/* JADX INFO: loaded from: classes.dex */
public final class oOOOOo0O extends Drawable implements oo000000.OooO0O0, Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f34070Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO00o f34071Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f34072Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f34073Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f34074OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f34075OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f34076OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f34077OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Paint f34078OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public List<OooOO0O> f34079OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Rect f34080o000oOoO;

    public static final class OooO00o extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @VisibleForTesting
        public final oo000000 f34081OooO00o;

        public OooO00o(oo000000 oo000000Var) {
            this.f34081OooO00o = oo000000Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new oOOOOo0O(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new oOOOOo0O(this);
        }
    }

    public oOOOOo0O(Context context, GifDecoder gifDecoder, o00000OO<Bitmap> o00000oo2, int i, int i2, Bitmap bitmap) {
        OooO00o oooO00o = new OooO00o(new oo000000(OooO0OO.OooO0O0(context), gifDecoder, i, i2, o00000oo2, bitmap));
        this.f34076OoooO00 = true;
        this.f34077OoooO0O = -1;
        this.f34071Oooo0o = oooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    @Override // o00oOooO.oo000000.OooO0O0
    public final void OooO00o() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        oo000000 oo000000Var = this.f34071Oooo0o.f34081OooO00o;
        oo000000.OooO00o oooO00o = oo000000Var.f34086OooO;
        if ((oooO00o != null ? oooO00o.f34105OoooO00 : -1) == oo000000Var.f34087OooO00o.OooO0OO() - 1) {
            this.f34075OoooO0++;
        }
        int i = this.f34077OoooO0O;
        if (i == -1 || this.f34075OoooO0 < i) {
            return;
        }
        ?? r0 = this.f34079OoooOOO;
        if (r0 != 0) {
            int size = r0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OooOO0O) this.f34079OoooOOO.get(i2)).OooO00o();
            }
        }
        stop();
    }

    public final Bitmap OooO0O0() {
        return this.f34071Oooo0o.f34081OooO00o.f34097OooOO0o;
    }

    public final Paint OooO0OO() {
        if (this.f34078OoooOO0 == null) {
            this.f34078OoooOO0 = new Paint(2);
        }
        return this.f34078OoooOO0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to o00oOooO.oOOOOo0O for r4v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void OooO0Oo() {
        /*
            r4 = this;
            boolean r0 = r4.f34070Oooo
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request."
            p243o00oo00O.o000.OooO00o(r0, r2)
            o00oOooO.oOOOOo0O$OooO00o r0 = r4.f34071Oooo0o
            o00oOooO.oo000000 r0 = r0.f34081OooO00o
            com.bumptech.glide.gifdecoder.GifDecoder r0 = r0.f34087OooO00o
            int r0 = r0.OooO0OO()
            if (r0 != r1) goto L19
            r4.invalidateSelf()
            goto L5d
        L19:
            boolean r0 = r4.f34072Oooo0oO
            if (r0 != 0) goto L5d
            r4.f34072Oooo0oO = r1
            o00oOooO.oOOOOo0O$OooO00o r0 = r4.f34071Oooo0o
            o00oOooO.oo000000 r0 = r0.f34081OooO00o
            boolean r2 = r0.f34095OooOO0
            if (r2 != 0) goto L55
            java.util.List<o00oOooO.oo000000$OooO0O0> r2 = r0.f34089OooO0OO
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L4d
            java.util.List<o00oOooO.oo000000$OooO0O0> r2 = r0.f34089OooO0OO
            boolean r2 = r2.isEmpty()
            java.util.List<o00oOooO.oo000000$OooO0O0> r3 = r0.f34089OooO0OO
            r3.add(r4)
            if (r2 == 0) goto L49
            boolean r2 = r0.f34091OooO0o
            if (r2 == 0) goto L41
            goto L49
        L41:
            r0.f34091OooO0o = r1
            r1 = 0
            r0.f34095OooOO0 = r1
            r0.OooO00o()
        L49:
            r4.invalidateSelf()
            goto L5d
        L4d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot subscribe twice in a row"
            r0.<init>(r1)
            throw r0
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot subscribe to a cleared frame loader"
            r0.<init>(r1)
            throw r0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p238o00oOooO.oOOOOo0O.OooO0Oo():void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    public final boolean OooO0o(@NonNull OooOO0O oooOO0O) {
        ?? r0 = this.f34079OoooOOO;
        if (r0 == 0 || oooOO0O == null) {
            return false;
        }
        return r0.remove(oooOO0O);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o00oOooO.oo000000$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o00oOooO.oo000000$OooO0O0>] */
    public final void OooO0o0() {
        this.f34072Oooo0oO = false;
        oo000000 oo000000Var = this.f34071Oooo0o.f34081OooO00o;
        oo000000Var.f34089OooO0OO.remove(this);
        if (oo000000Var.f34089OooO0OO.isEmpty()) {
            oo000000Var.f34091OooO0o = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f34070Oooo) {
            return;
        }
        if (this.f34074OoooO) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f34080o000oOoO == null) {
                this.f34080o000oOoO = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f34080o000oOoO);
            this.f34074OoooO = false;
        }
        oo000000 oo000000Var = this.f34071Oooo0o.f34081OooO00o;
        oo000000.OooO00o oooO00o = oo000000Var.f34086OooO;
        Bitmap bitmap = oooO00o != null ? oooO00o.f34106OoooO0O : oo000000Var.f34097OooOO0o;
        if (this.f34080o000oOoO == null) {
            this.f34080o000oOoO = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f34080o000oOoO, OooO0OO());
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f34071Oooo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f34071Oooo0o.f34081OooO00o.f34102OooOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f34071Oooo0o.f34081OooO00o.f34101OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f34072Oooo0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f34074OoooO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        OooO0OO().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        OooO0OO().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        o000.OooO00o(!this.f34070Oooo, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f34076OoooO00 = z;
        if (!z) {
            OooO0o0();
        } else if (this.f34073Oooo0oo) {
            OooO0Oo();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f34073Oooo0oo = true;
        this.f34075OoooO0 = 0;
        if (this.f34076OoooO00) {
            OooO0Oo();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f34073Oooo0oo = false;
        OooO0o0();
    }

    public oOOOOo0O(OooO00o oooO00o) {
        this.f34076OoooO00 = true;
        this.f34077OoooO0O = -1;
        Objects.requireNonNull(oooO00o, "Argument must not be null");
        this.f34071Oooo0o = oooO00o;
    }
}
