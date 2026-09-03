package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p018OooOoo.o00oO0o;
import p018OooOoo.o0OOO0o;
import p018OooOoo.o0ooOOo;
import p018OooOoo.oo000o;
import p020OooOooO.OooOOOO;
import p020OooOooO.OooOo;
import p020OooOooO.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final int[] f5496OoooO = {R.attr.colorBackground};

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final OooOOOO f5497OoooOO0 = new OooOOOO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f5498Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f5499Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f5500Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f5501Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Rect f5502OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Rect f5503OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooO00o f5504OoooO0O;

    public class OooO00o implements OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Drawable f5505OooO00o;

        public OooO00o() {
        }

        public final boolean OooO00o() {
            return CardView.this.getPreventCornerOverlap();
        }

        public final void OooO0O0(int i, int i2, int i3, int i4) {
            CardView.this.f5502OoooO0.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f5503OoooO00;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f5497OoooOO0.OooO00o(this.f5504OoooO0O).f388OooO0oo;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f5503OoooO00.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f5503OoooO00.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f5503OoooO00.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f5503OoooO00.top;
    }

    public float getMaxCardElevation() {
        return f5497OoooOO0.OooO0O0(this.f5504OoooO0O);
    }

    public boolean getPreventCornerOverlap() {
        return this.f5500Oooo0oO;
    }

    public float getRadius() {
        return f5497OoooOO0.OooO0OO(this.f5504OoooO0O);
    }

    public boolean getUseCompatPadding() {
        return this.f5499Oooo0o;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        OooOOOO oooOOOO = f5497OoooOO0;
        OooO00o oooO00o = this.f5504OoooO0O;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        OooOo oooOoOooO00o = oooOOOO.OooO00o(oooO00o);
        oooOoOooO00o.OooO0O0(colorStateListValueOf);
        oooOoOooO00o.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f5497OoooOO0.OooO0Oo(this.f5504OoooO0O, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f5498Oooo = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f5501Oooo0oo = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f5500Oooo0oO) {
            this.f5500Oooo0oO = z;
            OooOOOO oooOOOO = f5497OoooOO0;
            OooO00o oooO00o = this.f5504OoooO0O;
            oooOOOO.OooO0Oo(oooO00o, oooOOOO.OooO0O0(oooO00o));
        }
    }

    public void setRadius(float f) {
        OooOo oooOoOooO00o = f5497OoooOO0.OooO00o(this.f5504OoooO0O);
        if (f == oooOoOooO00o.f381OooO00o) {
            return;
        }
        oooOoOooO00o.f381OooO00o = f;
        oooOoOooO00o.OooO0OO(null);
        oooOoOooO00o.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f5499Oooo0o != z) {
            this.f5499Oooo0o = z;
            OooOOOO oooOOOO = f5497OoooOO0;
            OooO00o oooO00o = this.f5504OoooO0O;
            oooOOOO.OooO0Oo(oooO00o, oooOOOO.OooO0O0(oooO00o));
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, oo000o.cardViewStyle);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.f5503OoooO00 = rect;
        this.f5502OoooO0 = new Rect();
        OooO00o oooO00o = new OooO00o();
        this.f5504OoooO0O = oooO00o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OOO0o.CardView, i, o0ooOOo.CardView);
        int i2 = o0OOO0o.CardView_cardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f5496OoooO);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(o00oO0o.cardview_light_background);
            } else {
                color = getResources().getColor(o00oO0o.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(o0OOO0o.CardView_cardCornerRadius, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(o0OOO0o.CardView_cardElevation, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(o0OOO0o.CardView_cardMaxElevation, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f5499Oooo0o = typedArrayObtainStyledAttributes.getBoolean(o0OOO0o.CardView_cardUseCompatPadding, false);
        this.f5500Oooo0oO = typedArrayObtainStyledAttributes.getBoolean(o0OOO0o.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f5501Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_android_minWidth, 0);
        this.f5498Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooOOOO oooOOOO = f5497OoooOO0;
        OooOo oooOo = new OooOo(colorStateListValueOf, dimension);
        oooO00o.f5505OooO00o = oooOo;
        setBackgroundDrawable(oooOo);
        setClipToOutline(true);
        setElevation(dimension2);
        oooOOOO.OooO0Oo(oooO00o, dimension3);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        OooOo oooOoOooO00o = f5497OoooOO0.OooO00o(this.f5504OoooO0O);
        oooOoOooO00o.OooO0O0(colorStateList);
        oooOoOooO00o.invalidateSelf();
    }
}
