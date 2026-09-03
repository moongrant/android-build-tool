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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p337o0OO0o0.Oooo0;
import p347o0OOO0o0.o000000;
import p347o0OOO0o0.o000000O;
import p347o0OOO0o0.o0O0O00;
import p347o0OOO0o0.o0OO00O;
import p347o0OOO0o0.o0OOO0o;
import p347o0OOO0o0.o0Oo0oo;
import p347o0OOO0o0.o0ooOOo;
import p347o0OOO0o0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final o000000 f17554OooOOO0 = new o000000(0.5f);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0OO00O f17555OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0OOO0o f17556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0OOO0o f17557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0OOO0o f17558OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0OOO0o f17559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0ooOOo f17560OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0ooOOo f17561OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0ooOOo f17562OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0ooOOo f17563OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0OO00O f17564OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o0OO00O f17565OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0OO00O f17566OooOO0o;

    public OooO00o(C0110OooO00o c0110OooO00o) {
        this.f17556OooO00o = c0110OooO00o.f17568OooO00o;
        this.f17557OooO0O0 = c0110OooO00o.f17569OooO0O0;
        this.f17558OooO0OO = c0110OooO00o.f17570OooO0OO;
        this.f17559OooO0Oo = c0110OooO00o.f17571OooO0Oo;
        this.f17561OooO0o0 = c0110OooO00o.f17573OooO0o0;
        this.f17560OooO0o = c0110OooO00o.f17572OooO0o;
        this.f17562OooO0oO = c0110OooO00o.f17574OooO0oO;
        this.f17563OooO0oo = c0110OooO00o.f17575OooO0oo;
        this.f17555OooO = c0110OooO00o.f17567OooO;
        this.f17564OooOO0 = c0110OooO00o.f17576OooOO0;
        this.f17565OooOO0O = c0110OooO00o.f17577OooOO0O;
        this.f17566OooOO0o = c0110OooO00o.f17578OooOO0o;
    }

    @NonNull
    public static C0110OooO00o OooO00o(Context context, @StyleRes int i, @StyleRes int i2) {
        return OooO0O0(context, i, i2, new oo000o(0));
    }

    @NonNull
    public static C0110OooO00o OooO0O0(Context context, @StyleRes int i, @StyleRes int i2, @NonNull o0ooOOo o0ooooo2) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Oooo0.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(Oooo0.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(Oooo0.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(Oooo0.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(Oooo0.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(Oooo0.ShapeAppearance_cornerFamilyBottomLeft, i3);
            o0ooOOo o0oooooOooO0o0 = OooO0o0(typedArrayObtainStyledAttributes, Oooo0.ShapeAppearance_cornerSize, o0ooooo2);
            o0ooOOo o0oooooOooO0o1 = OooO0o0(typedArrayObtainStyledAttributes, Oooo0.ShapeAppearance_cornerSizeTopLeft, o0oooooOooO0o0);
            o0ooOOo o0oooooOooO0o2 = OooO0o0(typedArrayObtainStyledAttributes, Oooo0.ShapeAppearance_cornerSizeTopRight, o0oooooOooO0o0);
            o0ooOOo o0oooooOooO0o3 = OooO0o0(typedArrayObtainStyledAttributes, Oooo0.ShapeAppearance_cornerSizeBottomRight, o0oooooOooO0o0);
            o0ooOOo o0oooooOooO0o4 = OooO0o0(typedArrayObtainStyledAttributes, Oooo0.ShapeAppearance_cornerSizeBottomLeft, o0oooooOooO0o0);
            C0110OooO00o c0110OooO00o = new C0110OooO00o();
            o0OOO0o o0ooo0oOooO00o = o0O0O00.OooO00o(i4);
            c0110OooO00o.f17568OooO00o = o0ooo0oOooO00o;
            C0110OooO00o.OooO0O0(o0ooo0oOooO00o);
            c0110OooO00o.f17573OooO0o0 = o0oooooOooO0o1;
            o0OOO0o o0ooo0oOooO00o2 = o0O0O00.OooO00o(i5);
            c0110OooO00o.f17569OooO0O0 = o0ooo0oOooO00o2;
            C0110OooO00o.OooO0O0(o0ooo0oOooO00o2);
            c0110OooO00o.f17572OooO0o = o0oooooOooO0o2;
            o0OOO0o o0ooo0oOooO00o3 = o0O0O00.OooO00o(i6);
            c0110OooO00o.f17570OooO0OO = o0ooo0oOooO00o3;
            C0110OooO00o.OooO0O0(o0ooo0oOooO00o3);
            c0110OooO00o.f17574OooO0oO = o0oooooOooO0o3;
            o0OOO0o o0ooo0oOooO00o4 = o0O0O00.OooO00o(i7);
            c0110OooO00o.f17571OooO0Oo = o0ooo0oOooO00o4;
            C0110OooO00o.OooO0O0(o0ooo0oOooO00o4);
            c0110OooO00o.f17575OooO0oo = o0oooooOooO0o4;
            return c0110OooO00o;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static C0110OooO00o OooO0OO(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        return OooO0Oo(context, attributeSet, i, i2, new oo000o(0));
    }

    @NonNull
    public static C0110OooO00o OooO0Oo(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, @NonNull o0ooOOo o0ooooo2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(Oooo0.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(Oooo0.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return OooO0O0(context, resourceId, resourceId2, o0ooooo2);
    }

    @NonNull
    public static o0ooOOo OooO0o0(TypedArray typedArray, int i, @NonNull o0ooOOo o0ooooo2) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return o0ooooo2;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new oo000o(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new o000000(typedValuePeekValue.getFraction(1.0f, 1.0f)) : o0ooooo2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO0o(@NonNull RectF rectF) {
        boolean z = this.f17566OooOO0o.getClass().equals(o0OO00O.class) && this.f17564OooOO0.getClass().equals(o0OO00O.class) && this.f17555OooO.getClass().equals(o0OO00O.class) && this.f17565OooOO0O.getClass().equals(o0OO00O.class);
        float fOooO00o = this.f17561OooO0o0.OooO00o(rectF);
        return z && ((this.f17560OooO0o.OooO00o(rectF) > fOooO00o ? 1 : (this.f17560OooO0o.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f17563OooO0oo.OooO00o(rectF) > fOooO00o ? 1 : (this.f17563OooO0oo.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0 && (this.f17562OooO0oO.OooO00o(rectF) > fOooO00o ? 1 : (this.f17562OooO0oO.OooO00o(rectF) == fOooO00o ? 0 : -1)) == 0) && ((this.f17557OooO0O0 instanceof o000000O) && (this.f17556OooO00o instanceof o000000O) && (this.f17558OooO0OO instanceof o000000O) && (this.f17559OooO0Oo instanceof o000000O));
    }

    @NonNull
    public final OooO00o OooO0oO(float f) {
        C0110OooO00o c0110OooO00o = new C0110OooO00o(this);
        c0110OooO00o.OooO0OO(f);
        return c0110OooO00o.OooO00o();
    }

    /* JADX INFO: renamed from: com.google.android.material.shape.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0110OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NonNull
        public o0OO00O f17567OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public o0OOO0o f17568OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public o0OOO0o f17569OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public o0OOO0o f17570OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public o0OOO0o f17571OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public o0ooOOo f17572OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public o0ooOOo f17573OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NonNull
        public o0ooOOo f17574OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public o0ooOOo f17575OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @NonNull
        public o0OO00O f17576OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NonNull
        public o0OO00O f17577OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @NonNull
        public o0OO00O f17578OooOO0o;

        public C0110OooO00o() {
            this.f17568OooO00o = new o000000O();
            this.f17569OooO0O0 = new o000000O();
            this.f17570OooO0OO = new o000000O();
            this.f17571OooO0Oo = new o000000O();
            this.f17573OooO0o0 = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17572OooO0o = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17574OooO0oO = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17575OooO0oo = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17567OooO = new o0OO00O();
            this.f17576OooOO0 = new o0OO00O();
            this.f17577OooOO0O = new o0OO00O();
            this.f17578OooOO0o = new o0OO00O();
        }

        public static void OooO0O0(o0OOO0o o0ooo0o2) {
            if (o0ooo0o2 instanceof o000000O) {
            } else if (o0ooo0o2 instanceof o0Oo0oo) {
            }
        }

        @NonNull
        public final OooO00o OooO00o() {
            return new OooO00o(this);
        }

        @NonNull
        public final C0110OooO00o OooO0OO(@Dimension float f) {
            OooO0o(f);
            OooO0oO(f);
            OooO0o0(f);
            OooO0Oo(f);
            return this;
        }

        @NonNull
        public final C0110OooO00o OooO0Oo(@Dimension float f) {
            this.f17575OooO0oo = new oo000o(f);
            return this;
        }

        @NonNull
        public final C0110OooO00o OooO0o(@Dimension float f) {
            this.f17573OooO0o0 = new oo000o(f);
            return this;
        }

        @NonNull
        public final C0110OooO00o OooO0o0(@Dimension float f) {
            this.f17574OooO0oO = new oo000o(f);
            return this;
        }

        @NonNull
        public final C0110OooO00o OooO0oO(@Dimension float f) {
            this.f17572OooO0o = new oo000o(f);
            return this;
        }

        public C0110OooO00o(@NonNull OooO00o oooO00o) {
            this.f17568OooO00o = new o000000O();
            this.f17569OooO0O0 = new o000000O();
            this.f17570OooO0OO = new o000000O();
            this.f17571OooO0Oo = new o000000O();
            this.f17573OooO0o0 = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17572OooO0o = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17574OooO0oO = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17575OooO0oo = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f17567OooO = new o0OO00O();
            this.f17576OooOO0 = new o0OO00O();
            this.f17577OooOO0O = new o0OO00O();
            this.f17578OooOO0o = new o0OO00O();
            this.f17568OooO00o = oooO00o.f17556OooO00o;
            this.f17569OooO0O0 = oooO00o.f17557OooO0O0;
            this.f17570OooO0OO = oooO00o.f17558OooO0OO;
            this.f17571OooO0Oo = oooO00o.f17559OooO0Oo;
            this.f17573OooO0o0 = oooO00o.f17561OooO0o0;
            this.f17572OooO0o = oooO00o.f17560OooO0o;
            this.f17574OooO0oO = oooO00o.f17562OooO0oO;
            this.f17575OooO0oo = oooO00o.f17563OooO0oo;
            this.f17567OooO = oooO00o.f17555OooO;
            this.f17576OooOO0 = oooO00o.f17564OooOO0;
            this.f17577OooOO0O = oooO00o.f17565OooOO0O;
            this.f17578OooOO0o = oooO00o.f17566OooOO0o;
        }
    }

    public OooO00o() {
        this.f17556OooO00o = new o000000O();
        this.f17557OooO0O0 = new o000000O();
        this.f17558OooO0OO = new o000000O();
        this.f17559OooO0Oo = new o000000O();
        this.f17561OooO0o0 = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17560OooO0o = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17562OooO0oO = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17563OooO0oo = new oo000o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f17555OooO = new o0OO00O();
        this.f17564OooOO0 = new o0OO00O();
        this.f17565OooOO0O = new o0OO00O();
        this.f17566OooOO0o = new o0OO00O();
    }
}
