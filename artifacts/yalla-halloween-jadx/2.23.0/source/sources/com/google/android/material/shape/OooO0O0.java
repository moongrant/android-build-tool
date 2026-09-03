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
import o0O00o00.OooO;
import o0O00o00.OooOO0;
import o0O00o00.OooOO0O;
import o0O00o00.OooOOO;
import o0O00o00.OooOo;
import o0O00o00.OooOo00;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooOo00 f17626OooOOO0 = new OooOo00(0.5f);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0O f17627OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f17628OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f17629OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f17630OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f17631OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O00o00.OooO0o f17632OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O00o00.OooO0o f17633OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0O00o00.OooO0o f17634OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O00o00.OooO0o f17635OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0O f17636OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f17637OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0O f17638OooOO0o;

    /* JADX INFO: renamed from: com.google.android.material.shape.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface InterfaceC0223OooO0O0 {
        @NonNull
        o0O00o00.OooO0o OooO00o(@NonNull o0O00o00.OooO0o oooO0o);
    }

    public OooO0O0(OooO00o oooO00o) {
        this.f17628OooO00o = oooO00o.f17640OooO00o;
        this.f17629OooO0O0 = oooO00o.f17641OooO0O0;
        this.f17630OooO0OO = oooO00o.f17642OooO0OO;
        this.f17631OooO0Oo = oooO00o.f17643OooO0Oo;
        this.f17633OooO0o0 = oooO00o.f17645OooO0o0;
        this.f17632OooO0o = oooO00o.f17644OooO0o;
        this.f17634OooO0oO = oooO00o.f17646OooO0oO;
        this.f17635OooO0oo = oooO00o.f17647OooO0oo;
        this.f17627OooO = oooO00o.f17639OooO;
        this.f17636OooOO0 = oooO00o.f17648OooOO0;
        this.f17637OooOO0O = oooO00o.f17649OooOO0O;
        this.f17638OooOO0o = oooO00o.f17650OooOO0o;
    }

    @NonNull
    public static OooO00o OooO00o(@StyleRes int i, Context context, @StyleRes int i2) {
        return OooO0O0(context, i, i2, new o0O00o00.OooO00o(0));
    }

    @NonNull
    public static OooO00o OooO0O0(Context context, @StyleRes int i, @StyleRes int i2, @NonNull o0O00o00.OooO0o oooO0o) {
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
            o0O00o00.OooO0o oooO0oOooO0o0 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSize, oooO0o);
            o0O00o00.OooO0o oooO0oOooO0o1 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeTopLeft, oooO0oOooO0o0);
            o0O00o00.OooO0o oooO0oOooO0o2 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeTopRight, oooO0oOooO0o0);
            o0O00o00.OooO0o oooO0oOooO0o3 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeBottomRight, oooO0oOooO0o0);
            o0O00o00.OooO0o oooO0oOooO0o4 = OooO0o0(typedArrayObtainStyledAttributes, o000OO.ShapeAppearance_cornerSizeBottomLeft, oooO0oOooO0o0);
            OooO00o oooO00o = new OooO00o();
            OooO oooOOooO00o = OooOOO.OooO00o(i4);
            oooO00o.f17640OooO00o = oooOOooO00o;
            float fOooO00o = OooO00o.OooO00o(oooOOooO00o);
            if (fOooO00o != -1.0f) {
                oooO00o.OooO0o0(fOooO00o);
            }
            oooO00o.f17645OooO0o0 = oooO0oOooO0o1;
            OooO oooOOooO00o2 = OooOOO.OooO00o(i5);
            oooO00o.f17641OooO0O0 = oooOOooO00o2;
            float fOooO00o2 = OooO00o.OooO00o(oooOOooO00o2);
            if (fOooO00o2 != -1.0f) {
                oooO00o.OooO0o(fOooO00o2);
            }
            oooO00o.f17644OooO0o = oooO0oOooO0o2;
            OooO oooOOooO00o3 = OooOOO.OooO00o(i6);
            oooO00o.f17642OooO0OO = oooOOooO00o3;
            float fOooO00o3 = OooO00o.OooO00o(oooOOooO00o3);
            if (fOooO00o3 != -1.0f) {
                oooO00o.OooO0Oo(fOooO00o3);
            }
            oooO00o.f17646OooO0oO = oooO0oOooO0o3;
            OooO oooOOooO00o4 = OooOOO.OooO00o(i7);
            oooO00o.f17643OooO0Oo = oooOOooO00o4;
            float fOooO00o4 = OooO00o.OooO00o(oooOOooO00o4);
            if (fOooO00o4 != -1.0f) {
                oooO00o.OooO0OO(fOooO00o4);
            }
            oooO00o.f17647OooO0oo = oooO0oOooO0o4;
            return oooO00o;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static OooO00o OooO0OO(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        return OooO0Oo(context, attributeSet, i, i2, new o0O00o00.OooO00o(0));
    }

    @NonNull
    public static OooO00o OooO0Oo(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, @NonNull o0O00o00.OooO0o oooO0o) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(o000OO.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return OooO0O0(context, resourceId, resourceId2, oooO0o);
    }

    @NonNull
    public static o0O00o00.OooO0o OooO0o0(TypedArray typedArray, int i, @NonNull o0O00o00.OooO0o oooO0o) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return oooO0o;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new o0O00o00.OooO00o(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new OooOo00(typedValuePeekValue.getFraction(1.0f, 1.0f)) : oooO0o;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO0o(@NonNull RectF rectF) {
        boolean z = this.f17638OooOO0o.getClass().equals(OooOO0O.class) && this.f17636OooOO0.getClass().equals(OooOO0O.class) && this.f17627OooO.getClass().equals(OooOO0O.class) && this.f17637OooOO0O.getClass().equals(OooOO0O.class);
        float fOooO00o = this.f17633OooO0o0.OooO00o(rectF);
        return z && ((this.f17632OooO0o.OooO00o(rectF) > fOooO00o ? 1 : (this.f17632OooO0o.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f17635OooO0oo.OooO00o(rectF) > fOooO00o ? 1 : (this.f17635OooO0oo.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f17634OooO0oO.OooO00o(rectF) > fOooO00o ? 1 : (this.f17634OooO0oO.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0) && ((this.f17629OooO0O0 instanceof OooOo) && (this.f17628OooO00o instanceof OooOo) && (this.f17630OooO0OO instanceof OooOo) && (this.f17631OooO0Oo instanceof OooOo));
    }

    @NonNull
    public final OooO0O0 OooO0oO(float f) {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.OooO0O0(f);
        return new OooO0O0(oooO00o);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final OooO0O0 OooO0oo(@NonNull InterfaceC0223OooO0O0 interfaceC0223OooO0O0) {
        OooO00o oooO00o = new OooO00o(this);
        oooO00o.f17645OooO0o0 = interfaceC0223OooO0O0.OooO00o(this.f17633OooO0o0);
        oooO00o.f17644OooO0o = interfaceC0223OooO0O0.OooO00o(this.f17632OooO0o);
        oooO00o.f17647OooO0oo = interfaceC0223OooO0O0.OooO00o(this.f17635OooO0oo);
        oooO00o.f17646OooO0oO = interfaceC0223OooO0O0.OooO00o(this.f17634OooO0oO);
        return new OooO0O0(oooO00o);
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NonNull
        public OooOO0O f17639OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public OooO f17640OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public OooO f17641OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public OooO f17642OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public OooO f17643OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public o0O00o00.OooO0o f17644OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public o0O00o00.OooO0o f17645OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NonNull
        public o0O00o00.OooO0o f17646OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public o0O00o00.OooO0o f17647OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NonNull
        public final OooOO0O f17648OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NonNull
        public OooOO0O f17649OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NonNull
        public final OooOO0O f17650OooOO0o;

        public OooO00o() {
            this.f17640OooO00o = new OooOo();
            this.f17641OooO0O0 = new OooOo();
            this.f17642OooO0OO = new OooOo();
            this.f17643OooO0Oo = new OooOo();
            this.f17645OooO0o0 = new o0O00o00.OooO00o(0.0f);
            this.f17644OooO0o = new o0O00o00.OooO00o(0.0f);
            this.f17646OooO0oO = new o0O00o00.OooO00o(0.0f);
            this.f17647OooO0oo = new o0O00o00.OooO00o(0.0f);
            this.f17639OooO = new OooOO0O();
            this.f17648OooOO0 = new OooOO0O();
            this.f17649OooOO0O = new OooOO0O();
            this.f17650OooOO0o = new OooOO0O();
        }

        public static float OooO00o(OooO oooO) {
            if (oooO instanceof OooOo) {
                return ((OooOo) oooO).f41804OooO00o;
            }
            if (oooO instanceof OooOO0) {
                return ((OooOO0) oooO).f41800OooO00o;
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
            this.f17647OooO0oo = new o0O00o00.OooO00o(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0Oo(@Dimension float f) {
            this.f17646OooO0oO = new o0O00o00.OooO00o(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0o(@Dimension float f) {
            this.f17644OooO0o = new o0O00o00.OooO00o(f);
        }

        @NonNull
        @CanIgnoreReturnValue
        public final void OooO0o0(@Dimension float f) {
            this.f17645OooO0o0 = new o0O00o00.OooO00o(f);
        }

        public OooO00o(@NonNull OooO0O0 oooO0O0) {
            this.f17640OooO00o = new OooOo();
            this.f17641OooO0O0 = new OooOo();
            this.f17642OooO0OO = new OooOo();
            this.f17643OooO0Oo = new OooOo();
            this.f17645OooO0o0 = new o0O00o00.OooO00o(0.0f);
            this.f17644OooO0o = new o0O00o00.OooO00o(0.0f);
            this.f17646OooO0oO = new o0O00o00.OooO00o(0.0f);
            this.f17647OooO0oo = new o0O00o00.OooO00o(0.0f);
            this.f17639OooO = new OooOO0O();
            this.f17648OooOO0 = new OooOO0O();
            this.f17649OooOO0O = new OooOO0O();
            this.f17650OooOO0o = new OooOO0O();
            this.f17640OooO00o = oooO0O0.f17628OooO00o;
            this.f17641OooO0O0 = oooO0O0.f17629OooO0O0;
            this.f17642OooO0OO = oooO0O0.f17630OooO0OO;
            this.f17643OooO0Oo = oooO0O0.f17631OooO0Oo;
            this.f17645OooO0o0 = oooO0O0.f17633OooO0o0;
            this.f17644OooO0o = oooO0O0.f17632OooO0o;
            this.f17646OooO0oO = oooO0O0.f17634OooO0oO;
            this.f17647OooO0oo = oooO0O0.f17635OooO0oo;
            this.f17639OooO = oooO0O0.f17627OooO;
            this.f17648OooOO0 = oooO0O0.f17636OooOO0;
            this.f17649OooOO0O = oooO0O0.f17637OooOO0O;
            this.f17650OooOO0o = oooO0O0.f17638OooOO0o;
        }
    }

    public OooO0O0() {
        this.f17628OooO00o = new OooOo();
        this.f17629OooO0O0 = new OooOo();
        this.f17630OooO0OO = new OooOo();
        this.f17631OooO0Oo = new OooOo();
        this.f17633OooO0o0 = new o0O00o00.OooO00o(0.0f);
        this.f17632OooO0o = new o0O00o00.OooO00o(0.0f);
        this.f17634OooO0oO = new o0O00o00.OooO00o(0.0f);
        this.f17635OooO0oo = new o0O00o00.OooO00o(0.0f);
        this.f17627OooO = new OooOO0O();
        this.f17636OooOO0 = new OooOO0O();
        this.f17637OooOO0O = new OooOO0O();
        this.f17638OooOO0o = new OooOO0O();
    }
}
