package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import p272o0O0000o.o000OO;
import p280o0O00o0O.OooOO0;
import p280o0O00o0O.OooOO0O;
import p280o0O00o0O.OooOOO;
import p280o0O00o0O.OooOOO0;
import p280o0O00o0O.OooOo00;
import p280o0O00o0O.Oooo0;
import p280o0O00o0O.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Oooo000 f17149OooOOO0 = new Oooo000(0.5f);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO f17150OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f17151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f17152OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f17153OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f17154OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f17155OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f17156OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0 f17157OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f17158OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOOO f17159OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOO f17160OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOOO f17161OooOO0o;

    /* JADX INFO: renamed from: com.google.android.material.shape.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface InterfaceC0220OooO0O0 {
        @NonNull
        OooOO0 OooO00o(@NonNull OooOO0 oooOO1);
    }

    public OooO0O0(OooO00o oooO00o) {
        this.f17151OooO00o = oooO00o.f17163OooO00o;
        this.f17152OooO0O0 = oooO00o.f17164OooO0O0;
        this.f17153OooO0OO = oooO00o.f17165OooO0OO;
        this.f17154OooO0Oo = oooO00o.f17166OooO0Oo;
        this.f17156OooO0o0 = oooO00o.f17168OooO0o0;
        this.f17155OooO0o = oooO00o.f17167OooO0o;
        this.f17157OooO0oO = oooO00o.f17169OooO0oO;
        this.f17158OooO0oo = oooO00o.f17170OooO0oo;
        this.f17150OooO = oooO00o.f17162OooO;
        this.f17159OooOO0 = oooO00o.f17171OooOO0;
        this.f17160OooOO0O = oooO00o.f17172OooOO0O;
        this.f17161OooOO0o = oooO00o.f17173OooOO0o;
    }

    @NonNull
    public static OooO00o OooO00o(@StyleRes int i, Context context, @StyleRes int i2) {
        return OooO0O0(context, i, i2, new p280o0O00o0O.OooO0OO(0));
    }

    @NonNull
    public static OooO00o OooO0O0(Context context, @StyleRes int i, @StyleRes int i2, @NonNull OooOO0 oooOO1) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(o000OO.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(o000OO.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(o000OO.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(o000OO.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(o000OO.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(o000OO.ShapeAppearance_cornerFamilyBottomLeft, i3);
            OooOO0 oooOO0OooO0o0 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSize, oooOO1);
            OooOO0 oooOO0OooO0o1 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeTopLeft, oooOO0OooO0o0);
            OooOO0 oooOO0OooO0o2 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeTopRight, oooOO0OooO0o0);
            OooOO0 oooOO0OooO0o3 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeBottomRight, oooOO0OooO0o0);
            OooOO0 oooOO0OooO0o4 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeBottomLeft, oooOO0OooO0o0);
            OooO00o oooO00o = new OooO00o();
            OooOO0O oooOO0OOooO00o = OooOo00.OooO00o(i4);
            oooO00o.f17163OooO00o = oooOO0OOooO00o;
            float fOooO00o = OooO00o.OooO00o(oooOO0OOooO00o);
            if (fOooO00o != -1.0f) {
                oooO00o.OooO0o0(fOooO00o);
            }
            oooO00o.f17168OooO0o0 = oooOO0OooO0o1;
            OooOO0O oooOO0OOooO00o2 = OooOo00.OooO00o(i5);
            oooO00o.f17164OooO0O0 = oooOO0OOooO00o2;
            float fOooO00o2 = OooO00o.OooO00o(oooOO0OOooO00o2);
            if (fOooO00o2 != -1.0f) {
                oooO00o.OooO0o(fOooO00o2);
            }
            oooO00o.f17167OooO0o = oooOO0OooO0o2;
            OooOO0O oooOO0OOooO00o3 = OooOo00.OooO00o(i6);
            oooO00o.f17165OooO0OO = oooOO0OOooO00o3;
            float fOooO00o3 = OooO00o.OooO00o(oooOO0OOooO00o3);
            if (fOooO00o3 != -1.0f) {
                oooO00o.OooO0Oo(fOooO00o3);
            }
            oooO00o.f17169OooO0oO = oooOO0OooO0o3;
            OooOO0O oooOO0OOooO00o4 = OooOo00.OooO00o(i7);
            oooO00o.f17166OooO0Oo = oooOO0OOooO00o4;
            float fOooO00o4 = OooO00o.OooO00o(oooOO0OOooO00o4);
            if (fOooO00o4 != -1.0f) {
                oooO00o.OooO0OO(fOooO00o4);
            }
            oooO00o.f17170OooO0oo = oooOO0OooO0o4;
            return oooO00o;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static OooO00o OooO0OO(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        return OooO0Oo(context, attributeSet, i, i2, new p280o0O00o0O.OooO0OO(0));
    }

    @NonNull
    public static OooO00o OooO0Oo(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, @NonNull OooOO0 oooOO1) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return OooO0O0(context, resourceId, resourceId2, oooOO1);
    }

    @NonNull
    public static OooOO0 OooO0o0(TypedArray typedArray, int i, @NonNull OooOO0 oooOO1) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return oooOO1;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new p280o0O00o0O.OooO0OO(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new Oooo000(typedValuePeekValue.getFraction(1.0f, 1.0f)) : oooOO1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO0o(@NonNull RectF rectF) {
        boolean z = this.f17161OooOO0o.getClass().equals(OooOOO.class) && this.f17159OooOO0.getClass().equals(OooOOO.class) && this.f17150OooO.getClass().equals(OooOOO.class) && this.f17160OooOO0O.getClass().equals(OooOOO.class);
        float fOooO00o = this.f17156OooO0o0.OooO00o(rectF);
        return z && ((this.f17155OooO0o.OooO00o(rectF) > fOooO00o ? 1 : (this.f17155OooO0o.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f17158OooO0oo.OooO00o(rectF) > fOooO00o ? 1 : (this.f17158OooO0oo.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f17157OooO0oO.OooO00o(rectF) > fOooO00o ? 1 : (this.f17157OooO0oO.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0) && ((this.f17152OooO0O0 instanceof Oooo0) && (this.f17151OooO00o instanceof Oooo0) && (this.f17153OooO0OO instanceof Oooo0) && (this.f17154OooO0Oo instanceof Oooo0));
    }

    @NonNull
    public final OooO0O0 OooO0oO(float f) {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.OooO0O0(f);
        return new OooO0O0(oooO00o);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final OooO0O0 OooO0oo(@NonNull InterfaceC0220OooO0O0 interfaceC0220OooO0O0) {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.f17168OooO0o0 = interfaceC0220OooO0O0.OooO00o(this.f17156OooO0o0);
        oooO00o.f17167OooO0o = interfaceC0220OooO0O0.OooO00o(this.f17155OooO0o);
        oooO00o.f17170OooO0oo = interfaceC0220OooO0O0.OooO00o(this.f17158OooO0oo);
        oooO00o.f17169OooO0oO = interfaceC0220OooO0O0.OooO00o(this.f17157OooO0oO);
        return new OooO0O0(oooO00o);
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NonNull
        public OooOOO f17162OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public OooOO0O f17163OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public OooOO0O f17164OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public OooOO0O f17165OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public OooOO0O f17166OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public OooOO0 f17167OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public OooOO0 f17168OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NonNull
        public OooOO0 f17169OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public OooOO0 f17170OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NonNull
        public final OooOOO f17171OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NonNull
        public OooOOO f17172OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NonNull
        public final OooOOO f17173OooOO0o;

        public OooO00o() {
            this.f17163OooO00o = new Oooo0();
            this.f17164OooO0O0 = new Oooo0();
            this.f17165OooO0OO = new Oooo0();
            this.f17166OooO0Oo = new Oooo0();
            this.f17168OooO0o0 = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17167OooO0o = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17169OooO0oO = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17170OooO0oo = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17162OooO = new OooOOO();
            this.f17171OooOO0 = new OooOOO();
            this.f17172OooOO0O = new OooOOO();
            this.f17173OooOO0o = new OooOOO();
        }

        public static float OooO00o(OooOO0O oooOO0O) {
            if (oooOO0O instanceof Oooo0) {
                return ((Oooo0) oooOO0O).f41071OooO00o;
            }
            if (oooOO0O instanceof OooOOO0) {
                return ((OooOOO0) oooOO0O).f41067OooO00o;
            }
            return -1.0f;
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0O0(@Dimension float f) {
            OooO0o0(f);
            OooO0o(f);
            OooO0Oo(f);
            OooO0OO(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0OO(@Dimension float f) {
            this.f17170OooO0oo = new p280o0O00o0O.OooO0OO(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0Oo(@Dimension float f) {
            this.f17169OooO0oO = new p280o0O00o0O.OooO0OO(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0o(@Dimension float f) {
            this.f17167OooO0o = new p280o0O00o0O.OooO0OO(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0o0(@Dimension float f) {
            this.f17168OooO0o0 = new p280o0O00o0O.OooO0OO(f);
        }

        public OooO00o(@NonNull OooO0O0 oooO0O0) {
            this.f17163OooO00o = new Oooo0();
            this.f17164OooO0O0 = new Oooo0();
            this.f17165OooO0OO = new Oooo0();
            this.f17166OooO0Oo = new Oooo0();
            this.f17168OooO0o0 = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17167OooO0o = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17169OooO0oO = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17170OooO0oo = new p280o0O00o0O.OooO0OO(0.0f);
            this.f17162OooO = new OooOOO();
            this.f17171OooOO0 = new OooOOO();
            this.f17172OooOO0O = new OooOOO();
            this.f17173OooOO0o = new OooOOO();
            this.f17163OooO00o = oooO0O0.f17151OooO00o;
            this.f17164OooO0O0 = oooO0O0.f17152OooO0O0;
            this.f17165OooO0OO = oooO0O0.f17153OooO0OO;
            this.f17166OooO0Oo = oooO0O0.f17154OooO0Oo;
            this.f17168OooO0o0 = oooO0O0.f17156OooO0o0;
            this.f17167OooO0o = oooO0O0.f17155OooO0o;
            this.f17169OooO0oO = oooO0O0.f17157OooO0oO;
            this.f17170OooO0oo = oooO0O0.f17158OooO0oo;
            this.f17162OooO = oooO0O0.f17150OooO;
            this.f17171OooOO0 = oooO0O0.f17159OooOO0;
            this.f17172OooOO0O = oooO0O0.f17160OooOO0O;
            this.f17173OooOO0o = oooO0O0.f17161OooOO0o;
        }
    }

    public OooO0O0() {
        this.f17151OooO00o = new Oooo0();
        this.f17152OooO0O0 = new Oooo0();
        this.f17153OooO0OO = new Oooo0();
        this.f17154OooO0Oo = new Oooo0();
        this.f17156OooO0o0 = new p280o0O00o0O.OooO0OO(0.0f);
        this.f17155OooO0o = new p280o0O00o0O.OooO0OO(0.0f);
        this.f17157OooO0oO = new p280o0O00o0O.OooO0OO(0.0f);
        this.f17158OooO0oo = new p280o0O00o0O.OooO0OO(0.0f);
        this.f17150OooO = new OooOOO();
        this.f17159OooOO0 = new OooOOO();
        this.f17160OooOO0O = new OooOOO();
        this.f17161OooOO0o = new OooOOO();
    }
}
