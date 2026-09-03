package o0OO0oO0;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
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
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import o000O0O0.o00000O;
import o0OOO0OO.OooO0O0;
import p337o0OO0o0.OooOOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o000000O;
import p347o0OOO0o0.o0OOO0o;
import p347o0OOO0o0.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final ColorDrawable f37992OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final double f37993OooOo00 = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Drawable f37994OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f37995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Rect f37996OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f37997OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final MaterialShapeDrawable f37998OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Dimension
    public int f37999OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Dimension
    public int f38000OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38001OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Dimension
    public int f38002OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Drawable f38003OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ColorStateList f38004OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ColorStateList f38005OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ColorStateList f38006OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public com.google.android.material.shape.OooO00o f38007OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public RippleDrawable f38008OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public LayerDrawable f38009OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f38010OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f38011OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f38012OooOOoo;

    /* JADX INFO: renamed from: o0OO0oO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0373OooO00o extends InsetDrawable {
        public C0373OooO00o(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f37992OooOo0 = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public OooO00o(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i2 = MaterialCardView.f16738OooooO0;
        this.f37996OooO0O0 = new Rect();
        this.f38010OooOOo = false;
        this.f37995OooO00o = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, i, i2);
        this.f37997OooO0OO = materialShapeDrawable;
        materialShapeDrawable.OooOOO0(materialCardView.getContext());
        materialShapeDrawable.OooOOoo();
        com.google.android.material.shape.OooO00o oooO00o = materialShapeDrawable.f17510Oooo0o.f17534OooO00o;
        Objects.requireNonNull(oooO00o);
        com.google.android.material.shape.OooO00o.C0110OooO00o c0110OooO00o = new com.google.android.material.shape.OooO00o.C0110OooO00o(oooO00o);
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, Oooo0.CardView, i, Oooo000.CardView);
        int i3 = Oooo0.CardView_cardCornerRadius;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            c0110OooO00o.OooO0OO(typedArrayObtainStyledAttributes.getDimension(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        }
        this.f37998OooO0Oo = new MaterialShapeDrawable();
        OooO(new com.google.android.material.shape.OooO00o(c0110OooO00o));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooO(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f38007OooOOO0 = oooO00o;
        this.f37997OooO0OO.setShapeAppearanceModel(oooO00o);
        MaterialShapeDrawable materialShapeDrawable = this.f37997OooO0OO;
        materialShapeDrawable.f17530OoooooO = !materialShapeDrawable.OooOOO();
        MaterialShapeDrawable materialShapeDrawable2 = this.f37998OooO0Oo;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(oooO00o);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.f38011OooOOo0;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(oooO00o);
        }
    }

    public final float OooO00o() {
        float fOooO0O0 = OooO0O0(this.f38007OooOOO0.f17556OooO00o, this.f37997OooO0OO.OooOO0O());
        o0OOO0o o0ooo0o2 = this.f38007OooOOO0.f17557OooO0O0;
        MaterialShapeDrawable materialShapeDrawable = this.f37997OooO0OO;
        float fMax = Math.max(fOooO0O0, OooO0O0(o0ooo0o2, materialShapeDrawable.f17510Oooo0o.f17534OooO00o.f17560OooO0o.OooO00o(materialShapeDrawable.OooO0oo())));
        o0OOO0o o0ooo0o3 = this.f38007OooOOO0.f17558OooO0OO;
        MaterialShapeDrawable materialShapeDrawable2 = this.f37997OooO0OO;
        float fOooO0O1 = OooO0O0(o0ooo0o3, materialShapeDrawable2.f17510Oooo0o.f17534OooO00o.f17562OooO0oO.OooO00o(materialShapeDrawable2.OooO0oo()));
        o0OOO0o o0ooo0o4 = this.f38007OooOOO0.f17559OooO0Oo;
        MaterialShapeDrawable materialShapeDrawable3 = this.f37997OooO0OO;
        return Math.max(fMax, Math.max(fOooO0O1, OooO0O0(o0ooo0o4, materialShapeDrawable3.f17510Oooo0o.f17534OooO00o.f17563OooO0oo.OooO00o(materialShapeDrawable3.OooO0oo()))));
    }

    public final float OooO0O0(o0OOO0o o0ooo0o2, float f) {
        if (o0ooo0o2 instanceof o000000O) {
            return (float) ((1.0d - f37993OooOo00) * ((double) f));
        }
        return o0ooo0o2 instanceof o0Oo0oo ? f / 2.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final float OooO0OO() {
        return (this.f37995OooO00o.getMaxCardElevation() * 1.5f) + (OooOO0() ? OooO00o() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    @NonNull
    public final Drawable OooO0Oo() {
        if (this.f38008OooOOOO == null) {
            int[] iArr = OooO0O0.f38129OooO00o;
            this.f38011OooOOo0 = new MaterialShapeDrawable(this.f38007OooOOO0);
            this.f38008OooOOOO = new RippleDrawable(this.f38004OooOO0O, null, this.f38011OooOOo0);
        }
        if (this.f38009OooOOOo == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f38008OooOOOO, this.f37998OooO0Oo, this.f38003OooOO0});
            this.f38009OooOOOo = layerDrawable;
            layerDrawable.setId(2, OooOOO0.mtrl_card_checked_layer_id);
        }
        return this.f38009OooOOOo;
    }

    public final void OooO0o(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.f38009OooOOOo != null) {
            if (this.f37995OooO00o.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(OooO0OO() * 2.0f);
                iCeil2 = (int) Math.ceil((this.f37995OooO00o.getMaxCardElevation() + (OooOO0() ? OooO00o() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.f38001OooO0oO;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.f38000OooO0o0) - this.f37999OooO0o) - iCeil2 : this.f38000OooO0o0;
            int i7 = (i5 & 80) == 80 ? this.f38000OooO0o0 : ((i2 - this.f38000OooO0o0) - this.f37999OooO0o) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.f38000OooO0o0 : ((i - this.f38000OooO0o0) - this.f37999OooO0o) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.f38000OooO0o0) - this.f37999OooO0o) - iCeil : this.f38000OooO0o0;
            MaterialCardView materialCardView = this.f37995OooO00o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO.OooO0Oo(materialCardView) == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.f38009OooOOOo.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    @NonNull
    public final Drawable OooO0o0(Drawable drawable) {
        int iCeil;
        int i;
        if (this.f37995OooO00o.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil(OooO0OO());
            iCeil = (int) Math.ceil(this.f37995OooO00o.getMaxCardElevation() + (OooOO0() ? OooO00o() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new C0373OooO00o(drawable, iCeil, i, iCeil, i);
    }

    public final void OooO0oO(ColorStateList colorStateList) {
        this.f37997OooO0OO.OooOOOo(colorStateList);
    }

    public final void OooO0oo(@Nullable Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = p084o000Ooo.o0OOO0o.OooO0o0(drawable).mutate();
            this.f38003OooOO0 = drawableMutate;
            o000Ooo.o0OOO0o.OooO0O0.OooO0oo(drawableMutate, this.f38005OooOO0o);
            boolean zIsChecked = this.f37995OooO00o.isChecked();
            Drawable drawable2 = this.f38003OooOO0;
            if (drawable2 != null) {
                drawable2.setAlpha(zIsChecked ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            }
        } else {
            this.f38003OooOO0 = f37992OooOo0;
        }
        LayerDrawable layerDrawable = this.f38009OooOOOo;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(OooOOO0.mtrl_card_checked_layer_id, this.f38003OooOO0);
        }
    }

    public final boolean OooOO0() {
        return this.f37995OooO00o.getPreventCornerOverlap() && this.f37997OooO0OO.OooOOO() && this.f37995OooO00o.getUseCompatPadding();
    }

    public final void OooOO0O() {
        Drawable drawable = this.f37994OooO;
        Drawable drawableOooO0Oo = this.f37995OooO00o.isClickable() ? OooO0Oo() : this.f37998OooO0Oo;
        this.f37994OooO = drawableOooO0Oo;
        if (drawable != drawableOooO0Oo) {
            if (Build.VERSION.SDK_INT < 23 || !(this.f37995OooO00o.getForeground() instanceof InsetDrawable)) {
                this.f37995OooO00o.setForeground(OooO0o0(drawableOooO0Oo));
            } else {
                ((InsetDrawable) this.f37995OooO00o.getForeground()).setDrawable(drawableOooO0Oo);
            }
        }
    }

    public final void OooOO0o() {
        boolean z = (this.f37995OooO00o.getPreventCornerOverlap() && !this.f37997OooO0OO.OooOOO()) || OooOO0();
        float cardViewRadius = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooO00o = z ? OooO00o() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (this.f37995OooO00o.getPreventCornerOverlap() && this.f37995OooO00o.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - f37993OooOo00) * ((double) this.f37995OooO00o.getCardViewRadius()));
        }
        int i = (int) (fOooO00o - cardViewRadius);
        MaterialCardView materialCardView = this.f37995OooO00o;
        Rect rect = this.f37996OooO0O0;
        materialCardView.f5503OoooO00.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.f5497OoooOO0.OooO0o0(materialCardView.f5504OoooO0O);
    }

    public final void OooOOO() {
        int[] iArr = OooO0O0.f38129OooO00o;
        RippleDrawable rippleDrawable = this.f38008OooOOOO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(this.f38004OooOO0O);
        }
    }

    public final void OooOOO0() {
        if (!this.f38010OooOOo) {
            this.f37995OooO00o.setBackgroundInternal(OooO0o0(this.f37997OooO0OO));
        }
        this.f37995OooO00o.setForeground(OooO0o0(this.f37994OooO));
    }

    public final void OooOOOO() {
        this.f37998OooO0Oo.OooOo0O(this.f38002OooO0oo, this.f38006OooOOO);
    }
}
