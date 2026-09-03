package o0OOOO00;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.internal.OooOo;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import p347o0OOO0o0.o000OOo;
import p347o0OOO0o0.o0OO00O;
import p347o0OOO0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o extends MaterialShapeDrawable implements OooOo.OooO0O0 {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NonNull
    public final Context f38205o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @Nullable
    public final Paint.FontMetrics f38206o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NonNull
    public final OooOo f38207o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NonNull
    public final ViewOnLayoutChangeListenerC0377OooO00o f38208o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public int f38209o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public int f38210o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NonNull
    public final Rect f38211o00ooo;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public float f38212o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public float f38213o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public float f38214o0Oo0oo;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public int f38215o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public int f38216o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public int f38217o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f38218oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public float f38219oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @Nullable
    public CharSequence f38220ooOO;

    /* JADX INFO: renamed from: o0OOOO00.OooO00o$OooO00o, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0377OooO00o implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0377OooO00o() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            OooO00o oooO00o = OooO00o.this;
            Objects.requireNonNull(oooO00o);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            oooO00o.f38217o0ooOoO = iArr[0];
            view.getWindowVisibleDisplayFrame(oooO00o.f38211o00ooo);
        }
    }

    public OooO00o(@NonNull Context context, @StyleRes int i) {
        super(context, null, 0, i);
        this.f38206o00Oo0 = new Paint.FontMetrics();
        OooOo oooOo = new OooOo(this);
        this.f38207o00Ooo = oooOo;
        this.f38208o00o0O = new ViewOnLayoutChangeListenerC0377OooO00o();
        this.f38211o00ooo = new Rect();
        this.f38213o0OOO0o = 1.0f;
        this.f38214o0Oo0oo = 1.0f;
        this.f38212o0OO00O = 0.5f;
        this.f38219oo0o0Oo = 1.0f;
        this.f38205o00O0O = context;
        oooOo.f17324OooO00o.density = context.getResources().getDisplayMetrics().density;
        oooOo.f17324OooO00o.setTextAlign(Paint.Align.CENTER);
    }

    @Override // com.google.android.material.internal.OooOo.OooO0O0
    public final void OooO00o() {
        invalidateSelf();
    }

    public final o0OO00O OooOoo() {
        float f = -OooOoo0();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f38216o0ooOOo)))) / 2.0f;
        return new o000OOo(new oo0o0Oo(this.f38216o0ooOOo), Math.min(Math.max(f, -fWidth), fWidth));
    }

    public final float OooOoo0() {
        int i;
        if (((this.f38211o00ooo.right - getBounds().right) - this.f38217o0ooOoO) - this.f38215o0ooOO0 < 0) {
            i = ((this.f38211o00ooo.right - getBounds().right) - this.f38217o0ooOoO) - this.f38215o0ooOO0;
        } else {
            if (((this.f38211o00ooo.left - getBounds().left) - this.f38217o0ooOoO) + this.f38215o0ooOO0 <= 0) {
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            i = ((this.f38211o00ooo.left - getBounds().left) - this.f38217o0ooOoO) + this.f38215o0ooOO0;
        }
        return i;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        canvas.save();
        float fOooOoo0 = OooOoo0();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f38216o0ooOOo)) - ((double) this.f38216o0ooOOo)));
        canvas.scale(this.f38213o0OOO0o, this.f38214o0Oo0oo, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f38212o0OO00O) + getBounds().top);
        canvas.translate(fOooOoo0, f);
        super.draw(canvas);
        if (this.f38220ooOO != null) {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            this.f38207o00Ooo.f17324OooO00o.getFontMetrics(this.f38206o00Oo0);
            Paint.FontMetrics fontMetrics = this.f38206o00Oo0;
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            OooOo oooOo = this.f38207o00Ooo;
            if (oooOo.f17328OooO0o != null) {
                oooOo.f17324OooO00o.drawableState = getState();
                OooOo oooOo2 = this.f38207o00Ooo;
                oooOo2.f17328OooO0o.OooO0o0(this.f38205o00O0O, oooOo2.f17324OooO00o, oooOo2.f17325OooO0O0);
                this.f38207o00Ooo.f17324OooO00o.setAlpha((int) (this.f38219oo0o0Oo * 255.0f));
            }
            CharSequence charSequence = this.f38220ooOO;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, this.f38207o00Ooo.f17324OooO00o);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f38207o00Ooo.f17324OooO00o.getTextSize(), this.f38209o00oO0O);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f38218oo000o * 2;
        CharSequence charSequence = this.f38220ooOO;
        return (int) Math.max(f + (charSequence == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f38207o00Ooo.OooO00o(charSequence.toString())), this.f38210o00oO0o);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        com.google.android.material.shape.OooO00o oooO00o = this.f17510Oooo0o.f17534OooO00o;
        Objects.requireNonNull(oooO00o);
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
        c0110OooO00o.f17577OooOO0O = OooOoo();
        setShapeAppearanceModel(c0110OooO00o.OooO00o());
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.OooOo.OooO0O0
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
