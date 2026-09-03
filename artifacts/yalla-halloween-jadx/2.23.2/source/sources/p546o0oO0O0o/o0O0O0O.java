package p546o0oO0O0o;

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
import p276o0O00OoO.OooO;
import p280o0O00o0O.OooOOOO;
import p280o0O00o0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0O0O0O extends MaterialShapeDrawable implements o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public CharSequence f55761OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final Paint.FontMetrics f55762OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NonNull
    public final Context f55763OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NonNull
    public final o00Oo0 f55764OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NonNull
    public final OooO00o f55765OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f55766Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f55767Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NonNull
    public final Rect f55768Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f55769Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f55770Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f55771Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f55772Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public float f55773Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f55774Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f55775Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f55776Oooo0oo;

    public class OooO00o implements View.OnLayoutChangeListener {
        public OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            o0O0O0O o0o0o0o = o0O0O0O.this;
            o0o0o0o.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            o0o0o0o.f55774Oooo0o0 = iArr[0];
            view.getWindowVisibleDisplayFrame(o0o0o0o.f55768Oooo000);
        }
    }

    public o0O0O0O(@NonNull Context context, @StyleRes int i) {
        super(context, null, 0, i);
        this.f55762OooOoo = new Paint.FontMetrics();
        o00Oo0 o00oo1 = new o00Oo0(this);
        this.f55764OooOooO = o00oo1;
        this.f55765OooOooo = new OooO00o();
        this.f55768Oooo000 = new Rect();
        this.f55773Oooo0o = 1.0f;
        this.f55775Oooo0oO = 1.0f;
        this.f55776Oooo0oo = 0.5f;
        this.f55766Oooo = 1.0f;
        this.f55763OooOoo0 = context;
        TextPaint textPaint = o00oo1.f16840OooO00o;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float OooOo() {
        int i;
        Rect rect = this.f55768Oooo000;
        if (((rect.right - getBounds().right) - this.f55774Oooo0o0) - this.f55771Oooo0O0 < 0) {
            i = ((rect.right - getBounds().right) - this.f55774Oooo0o0) - this.f55771Oooo0O0;
        } else {
            if (((rect.left - getBounds().left) - this.f55774Oooo0o0) + this.f55771Oooo0O0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f55774Oooo0o0) + this.f55771Oooo0O0;
        }
        return i;
    }

    public final OooOo OooOoO0() {
        float f = -OooOo();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f55772Oooo0OO)))) / 2.0f;
        return new OooOo(new OooOOOO(this.f55772Oooo0OO), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        canvas.save();
        float fOooOo = OooOo();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f55772Oooo0OO)) - ((double) this.f55772Oooo0OO)));
        canvas.scale(this.f55773Oooo0o, this.f55775Oooo0oO, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f55776Oooo0oo) + getBounds().top);
        canvas.translate(fOooOo, f);
        super.draw(canvas);
        if (this.f55761OooOoOO != null) {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            o00Oo0 o00oo1 = this.f55764OooOooO;
            TextPaint textPaint = o00oo1.f16840OooO00o;
            Paint.FontMetrics fontMetrics = this.f55762OooOoo;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            OooO oooO = o00oo1.f16844OooO0o;
            TextPaint textPaint2 = o00oo1.f16840OooO00o;
            if (oooO != null) {
                textPaint2.drawableState = getState();
                o00oo1.f16844OooO0o.OooO0o0(this.f55763OooOoo0, textPaint2, o00oo1.f16841OooO0O0);
                textPaint2.setAlpha((int) (this.f55766Oooo * 255.0f));
            }
            CharSequence charSequence = this.f55761OooOoOO;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f55764OooOooO.f16840OooO00o.getTextSize(), this.f55767Oooo0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f55769Oooo00O * 2;
        CharSequence charSequence = this.f55761OooOoOO;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f55764OooOooO.OooO00o(charSequence.toString())), this.f55770Oooo00o);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0O0 oooO0O0 = this.f17105OooO0Oo.f17128OooO00o;
        oooO0O0.getClass();
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(oooO0O0);
        oooO00o.f17172OooOO0O = OooOoO0();
        setShapeAppearanceModel(new OooO0O0(oooO00o));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
