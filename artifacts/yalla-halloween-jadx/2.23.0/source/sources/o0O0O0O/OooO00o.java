package o0O0O0O;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.internal.o00Oo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import o0O00o00.OooOOO0;
import o0O00o00.OooOOOO;
import p545o0oO0Ooo.d1;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o extends MaterialShapeDrawable implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public CharSequence f41897OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final Paint.FontMetrics f41898OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NonNull
    public final Context f41899OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f41900OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NonNull
    public final ViewOnLayoutChangeListenerC0450OooO00o f41901OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f41902Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f41903Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NonNull
    public final Rect f41904Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f41905Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f41906Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f41907Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f41908Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f41909Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f41910Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f41911Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f41912Oooo0oo;

    /* JADX INFO: renamed from: o0O0O0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0450OooO00o implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0450OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            OooO00o oooO00o = OooO00o.this;
            oooO00o.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            oooO00o.f41910Oooo0o0 = iArr[0];
            view.getWindowVisibleDisplayFrame(oooO00o.f41904Oooo000);
        }
    }

    public OooO00o(@NonNull Context context, @StyleRes int i) {
        super(context, null, 0, i);
        this.f41898OooOoo = new Paint.FontMetrics();
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f41900OooOooO = o00oo1;
        this.f41901OooOooo = new ViewOnLayoutChangeListenerC0450OooO00o();
        this.f41904Oooo000 = new Rect();
        this.f41909Oooo0o = 1.0f;
        this.f41911Oooo0oO = 1.0f;
        this.f41912Oooo0oo = 0.5f;
        this.f41902Oooo = 1.0f;
        this.f41899OooOoo0 = context;
        TextPaint textPaint = o00oo1.f17313OooO00o;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float OooOo() {
        int i;
        Rect rect = this.f41904Oooo000;
        if (((rect.right - getBounds().right) - this.f41910Oooo0o0) - this.f41907Oooo0O0 < 0) {
            i = ((rect.right - getBounds().right) - this.f41910Oooo0o0) - this.f41907Oooo0O0;
        } else {
            if (((rect.left - getBounds().left) - this.f41910Oooo0o0) + this.f41907Oooo0O0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f41910Oooo0o0) + this.f41907Oooo0O0;
        }
        return i;
    }

    public final OooOOOO OooOoO0() {
        float f = -OooOo();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f41908Oooo0OO)))) / 2.0f;
        return new OooOOOO(new OooOOO0(this.f41908Oooo0OO), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        canvas.save();
        float fOooOo = OooOo();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f41908Oooo0OO)) - ((double) this.f41908Oooo0OO)));
        canvas.scale(this.f41909Oooo0o, this.f41911Oooo0oO, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f41912Oooo0oo) + getBounds().top);
        canvas.translate(fOooOo, f);
        super.draw(canvas);
        if (this.f41897OooOoOO != null) {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            o00Oo0 o00oo1 = this.f41900OooOooO;
            TextPaint textPaint = o00oo1.f17313OooO00o;
            Paint.FontMetrics fontMetrics = this.f41898OooOoo;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            d1 d1Var = o00oo1.f17317OooO0o;
            TextPaint textPaint2 = o00oo1.f17313OooO00o;
            if (d1Var != null) {
                textPaint2.drawableState = getState();
                o00oo1.f17317OooO0o.OooO0o0(this.f41899OooOoo0, textPaint2, o00oo1.f17314OooO0O0);
                textPaint2.setAlpha((int) (this.f41902Oooo * 255.0f));
            }
            CharSequence charSequence = this.f41897OooOoOO;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f41900OooOooO.f17313OooO00o.getTextSize(), this.f41903Oooo0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f41905Oooo00O * 2;
        CharSequence charSequence = this.f41897OooOoOO;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f41900OooOooO.OooO00o(charSequence.toString())), this.f41906Oooo00o);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0O0 oooO0O0 = this.f17582OooO0Oo.f17605OooO00o;
        oooO0O0.getClass();
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(oooO0O0);
        oooO00o.f17649OooOO0O = OooOoO0();
        setShapeAppearanceModel(new OooO0O0(oooO00o));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
