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
import p145o00Oo0.o00oO0o;
import p145o00Oo0.o0OOO0o;
import p145o00Oo0.o0ooOOo;
import p145o00Oo0.oo000o;
import p166o00Ooo.o000000;
import p166o00Ooo.o000000O;
import p166o00Ooo.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int[] f4152OooO = {R.attr.colorBackground};

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o000OOo f4153OooOO0 = new o000OOo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f4154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f4155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f4156OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Rect f4157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f4158OooO0oo;

    public class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Drawable f4159OooO00o;

        public OooO00o() {
        }

        public final void OooO00o(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.f4157OooO0oO.set(i, i2, i3, i4);
            Rect rect = cardView.f4155OooO0o;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((o000000O) this.f4158OooO0oo.f4159OooO00o).f38217OooO0oo;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    @Px
    public int getContentPaddingBottom() {
        return this.f4155OooO0o.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.f4155OooO0o.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.f4155OooO0o.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.f4155OooO0o.top;
    }

    public float getMaxCardElevation() {
        return ((o000000O) this.f4158OooO0oo.f4159OooO00o).f38215OooO0o0;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4156OooO0o0;
    }

    public float getRadius() {
        return ((o000000O) this.f4158OooO0oo.f4159OooO00o).f38210OooO00o;
    }

    public boolean getUseCompatPadding() {
        return this.f4154OooO0Oo;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        o000000O o000000o2 = (o000000O) this.f4158OooO0oo.f4159OooO00o;
        o000000o2.OooO0O0(colorStateListValueOf);
        o000000o2.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f4153OooOO0.OooO00o(this.f4158OooO0oo, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4156OooO0o0) {
            this.f4156OooO0o0 = z;
            o000OOo o000ooo2 = f4153OooOO0;
            OooO00o oooO00o = this.f4158OooO0oo;
            o000ooo2.OooO00o(oooO00o, ((o000000O) oooO00o.f4159OooO00o).f38215OooO0o0);
        }
    }

    public void setRadius(float f) {
        o000000O o000000o2 = (o000000O) this.f4158OooO0oo.f4159OooO00o;
        if (f == o000000o2.f38210OooO00o) {
            return;
        }
        o000000o2.f38210OooO00o = f;
        o000000o2.OooO0OO(null);
        o000000o2.invalidateSelf();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setUseCompatPadding(boolean z) {
        if (this.f4154OooO0Oo != z) {
            this.f4154OooO0Oo = z;
            o000OOo o000ooo2 = f4153OooOO0;
            OooO00o oooO00o = this.f4158OooO0oo;
            o000ooo2.OooO00o(oooO00o, ((o000000O) oooO00o.f4159OooO00o).f38215OooO0o0);
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
        this.f4155OooO0o = rect;
        this.f4157OooO0oO = new Rect();
        OooO00o oooO00o = new OooO00o();
        this.f4158OooO0oo = oooO00o;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0OOO0o.CardView, i, o0ooOOo.CardView);
        int i2 = o0OOO0o.CardView_cardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f4152OooO);
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
        float dimension = typedArrayObtainStyledAttributes.getDimension(o0OOO0o.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(o0OOO0o.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(o0OOO0o.CardView_cardMaxElevation, 0.0f);
        this.f4154OooO0Oo = typedArrayObtainStyledAttributes.getBoolean(o0OOO0o.CardView_cardUseCompatPadding, false);
        this.f4156OooO0o0 = typedArrayObtainStyledAttributes.getBoolean(o0OOO0o.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(o0OOO0o.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        o000OOo o000ooo2 = f4153OooOO0;
        o000000O o000000o2 = new o000000O(dimension, colorStateListValueOf);
        oooO00o.f4159OooO00o = o000000o2;
        setBackgroundDrawable(o000000o2);
        setClipToOutline(true);
        setElevation(dimension2);
        o000ooo2.OooO00o(oooO00o, dimension3);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        o000000O o000000o2 = (o000000O) this.f4158OooO0oo.f4159OooO00o;
        o000000o2.OooO0O0(colorStateList);
        o000000o2.invalidateSelf();
    }
}
