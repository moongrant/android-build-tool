package p443o0OoOoOO;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import java.util.WeakHashMap;
import o0O00OO.OooO00o;
import o0O00o00.OooO;
import o0O00o00.OooOO0;
import o0O00o00.OooOo;
import p053o00000oo.o00Ooo;
import p270o0O0000o.o00000;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;
import p274o0O00OoO.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final ColorDrawable f46304OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final double f46305OooOoO0 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Drawable f46306OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f46307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Rect f46308OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f46309OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f46310OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Dimension
    public int f46311OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Dimension
    public int f46312OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f46313OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Dimension
    public int f46314OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Drawable f46315OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f46316OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f46317OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f46318OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f46319OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public RippleDrawable f46320OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public LayerDrawable f46321OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f46322OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f46323OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f46324OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f46325OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final TimeInterpolator f46326OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public ValueAnimator f46327OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final int f46328OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f46329OooOo0o;

    static {
        f46304OooOoO = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public o0oO0Ooo(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i2 = MaterialCardView.f16593OooOOo;
        this.f46308OooO0O0 = new Rect();
        this.f46322OooOOo = false;
        this.f46325OooOo = 0.0f;
        this.f46307OooO00o = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f46309OooO0OO = materialShapeDrawable;
        materialShapeDrawable.OooOO0O(materialCardView.getContext());
        materialShapeDrawable.OooOOo0();
        OooO0O0 oooO0O0 = materialShapeDrawable.f17582OooO0Oo.f17605OooO00o;
        oooO0O0.getClass();
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(oooO0O0);
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, o000OO.CardView, i, o0000O0O.CardView);
        int i3 = o000OO.CardView_cardCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            oooO00o.OooO0O0(typedArrayObtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f46310OooO0Oo = new MaterialShapeDrawable();
        OooO0oo(new OooO0O0(oooO00o));
        this.f46326OooOo0 = OooO00o.OooO0Oo(materialCardView.getContext(), o00000.motionEasingLinearInterpolator, o0O000.OooO0O0.f41571OooO00o);
        this.f46328OooOo0O = OooO00o.OooO0OO(o00000.motionDurationShort2, materialCardView.getContext(), 300);
        this.f46329OooOo0o = OooO00o.OooO0OO(o00000.motionDurationShort1, materialCardView.getContext(), 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float OooO0O0(OooO oooO, float f) {
        if (oooO instanceof OooOo) {
            return (float) ((1.0d - f46305OooOoO0) * ((double) f));
        }
        if (oooO instanceof OooOO0) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final boolean OooO() {
        MaterialCardView materialCardView = this.f46307OooO00o;
        return materialCardView.getPreventCornerOverlap() && this.f46309OooO0OO.OooOO0o() && materialCardView.getUseCompatPadding();
    }

    public final float OooO00o() {
        OooO oooO = this.f46319OooOOO0.f17628OooO00o;
        MaterialShapeDrawable materialShapeDrawable = this.f46309OooO0OO;
        return Math.max(Math.max(OooO0O0(oooO, materialShapeDrawable.OooOO0()), OooO0O0(this.f46319OooOOO0.f17629OooO0O0, materialShapeDrawable.f17582OooO0Oo.f17605OooO00o.f17632OooO0o.OooO00o(materialShapeDrawable.OooO0oo()))), Math.max(OooO0O0(this.f46319OooOOO0.f17630OooO0OO, materialShapeDrawable.f17582OooO0Oo.f17605OooO00o.f17634OooO0oO.OooO00o(materialShapeDrawable.OooO0oo())), OooO0O0(this.f46319OooOOO0.f17631OooO0Oo, materialShapeDrawable.f17582OooO0Oo.f17605OooO00o.f17635OooO0oo.OooO00o(materialShapeDrawable.OooO0oo()))));
    }

    @NonNull
    public final LayerDrawable OooO0OO() {
        if (this.f46320OooOOOO == null) {
            int[] iArr = OooO0OO.f41776OooO00o;
            this.f46323OooOOo0 = new MaterialShapeDrawable(this.f46319OooOOO0);
            this.f46320OooOOOO = new RippleDrawable(this.f46316OooOO0O, null, this.f46323OooOOo0);
        }
        if (this.f46321OooOOOo == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f46320OooOOOO, this.f46310OooO0Oo, this.f46315OooOO0});
            this.f46321OooOOOo = layerDrawable;
            layerDrawable.setId(2, o0000Ooo.mtrl_card_checked_layer_id);
        }
        return this.f46321OooOOOo;
    }

    @NonNull
    public final o0O00OOO OooO0Oo(Drawable drawable) {
        int iCeil;
        int i;
        MaterialCardView materialCardView = this.f46307OooO00o;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (OooO() ? OooO00o() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (OooO() ? OooO00o() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new o0O00OOO(drawable, iCeil, i, iCeil, i);
    }

    public final void OooO0o(boolean z, boolean z2) {
        Drawable drawable = this.f46315OooOO0;
        if (drawable != null) {
            if (!z2) {
                drawable.setAlpha(z ? 255 : 0);
                this.f46325OooOo = z ? 1.0f : 0.0f;
                return;
            }
            float f = z ? 1.0f : 0.0f;
            float f2 = z ? 1.0f - this.f46325OooOo : this.f46325OooOo;
            ValueAnimator valueAnimator = this.f46327OooOo00;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f46327OooOo00 = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f46325OooOo, f);
            this.f46327OooOo00 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOoOO.o0O00OO
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    o0oO0Ooo o0oo0ooo2 = this.f46303OooO0Oo;
                    o0oo0ooo2.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    o0oo0ooo2.f46315OooOO0.setAlpha((int) (255.0f * fFloatValue));
                    o0oo0ooo2.f46325OooOo = fFloatValue;
                }
            });
            this.f46327OooOo00.setInterpolator(this.f46326OooOo0);
            this.f46327OooOo00.setDuration((long) ((z ? this.f46328OooOo0O : this.f46329OooOo0o) * f2));
            this.f46327OooOo00.start();
        }
    }

    public final void OooO0o0(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f46321OooOOOo != null) {
            MaterialCardView materialCardView = this.f46307OooO00o;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (OooO() ? OooO00o() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (OooO() ? OooO00o() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f46313OooO0oO;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.f46312OooO0o0) - this.f46311OooO0o) - iCeil2 : this.f46312OooO0o0;
            int i7 = (i5 & 80) == 80 ? this.f46312OooO0o0 : ((i2 - this.f46312OooO0o0) - this.f46311OooO0o) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.f46312OooO0o0 : ((i - this.f46312OooO0o0) - this.f46311OooO0o) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.f46312OooO0o0) - this.f46311OooO0o) - iCeil : this.f46312OooO0o0;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO.OooO0Oo(materialCardView) == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.f46321OooOOOo.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    public final void OooO0oO(@Nullable Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f46315OooOO0 = drawableMutate;
            o00Ooo.OooO0O0.OooO0oo(drawableMutate, this.f46317OooOO0o);
            OooO0o(this.f46307OooO00o.isChecked(), false);
        } else {
            this.f46315OooOO0 = f46304OooOoO;
        }
        LayerDrawable layerDrawable = this.f46321OooOOOo;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(o0000Ooo.mtrl_card_checked_layer_id, this.f46315OooOO0);
        }
    }

    public final void OooO0oo(@NonNull OooO0O0 oooO0O0) {
        this.f46319OooOOO0 = oooO0O0;
        MaterialShapeDrawable materialShapeDrawable = this.f46309OooO0OO;
        materialShapeDrawable.setShapeAppearanceModel(oooO0O0);
        materialShapeDrawable.f17602OooOoO0 = !materialShapeDrawable.OooOO0o();
        MaterialShapeDrawable materialShapeDrawable2 = this.f46310OooO0Oo;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(oooO0O0);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f46323OooOOo0;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(oooO0O0);
        }
    }

    public final void OooOO0() {
        MaterialCardView materialCardView = this.f46307OooO00o;
        boolean z = true;
        if (!(materialCardView.getPreventCornerOverlap() && !this.f46309OooO0OO.OooOO0o()) && !OooO()) {
            z = false;
        }
        float cardViewRadius = 0.0f;
        float fOooO00o = z ? OooO00o() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f46305OooOoO0) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fOooO00o - cardViewRadius);
        Rect rect = this.f46308OooO0O0;
        materialCardView.f4155OooO0o.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.f4153OooOO0.OooO0O0(materialCardView.f4158OooO0oo);
    }

    public final void OooOO0O() {
        boolean z = this.f46322OooOOo;
        MaterialCardView materialCardView = this.f46307OooO00o;
        if (!z) {
            materialCardView.setBackgroundInternal(OooO0Oo(this.f46309OooO0OO));
        }
        materialCardView.setForeground(OooO0Oo(this.f46306OooO));
    }
}
