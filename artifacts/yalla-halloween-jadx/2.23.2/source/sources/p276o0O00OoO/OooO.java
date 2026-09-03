package p276o0O00OoO;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f41008OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final ColorStateList f41009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f41010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f41011OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f41012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f41013OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f41014OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f41015OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f41016OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f41017OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f41018OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @FontRes
    public final int f41019OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Typeface f41020OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f41021OooOOO0 = false;

    public class OooO00o extends androidx.core.content.res.OooO00o.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f41022OooO00o;

        public OooO00o(OooOO0O oooOO0O) {
            this.f41022OooO00o = oooOO0O;
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0OO(int i) {
            OooO.this.f41021OooOOO0 = true;
            this.f41022OooO00o.OooO00o(i);
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0Oo(@NonNull Typeface typeface) {
            OooO oooO = OooO.this;
            oooO.f41020OooOOO = Typeface.create(typeface, oooO.f41011OooO0OO);
            oooO.f41021OooOOO0 = true;
            this.f41022OooO00o.OooO0O0(oooO.f41020OooOOO, false);
        }
    }

    public OooO(@NonNull Context context, @StyleRes int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, o000OO.TextAppearance);
        this.f41018OooOO0O = typedArrayObtainStyledAttributes.getDimension(o000OO.TextAppearance_android_textSize, 0.0f);
        this.f41017OooOO0 = OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColor);
        OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorHint);
        OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorLink);
        this.f41011OooO0OO = typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_textStyle, 0);
        this.f41012OooO0Oo = typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_typeface, 1);
        int i2 = o000OO.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : o000OO.TextAppearance_android_fontFamily;
        this.f41019OooOO0o = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f41010OooO0O0 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(o000OO.TextAppearance_textAllCaps, false);
        this.f41009OooO00o = OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_shadowColor);
        this.f41014OooO0o0 = typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDx, 0.0f);
        this.f41013OooO0o = typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDy, 0.0f);
        this.f41015OooO0oO = typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, o000OO.MaterialTextAppearance);
        int i3 = o000OO.MaterialTextAppearance_android_letterSpacing;
        this.f41016OooO0oo = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.f41008OooO = typedArrayObtainStyledAttributes2.getFloat(i3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        String str;
        Typeface typeface = this.f41020OooOOO;
        int i = this.f41011OooO0OO;
        if (typeface == null && (str = this.f41010OooO0O0) != null) {
            this.f41020OooOOO = Typeface.create(str, i);
        }
        if (this.f41020OooOOO == null) {
            int i2 = this.f41012OooO0Oo;
            if (i2 == 1) {
                this.f41020OooOOO = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f41020OooOOO = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f41020OooOOO = Typeface.DEFAULT;
            } else {
                this.f41020OooOOO = Typeface.MONOSPACE;
            }
            this.f41020OooOOO = Typeface.create(this.f41020OooOOO, i);
        }
    }

    @NonNull
    @VisibleForTesting
    public final Typeface OooO0O0(@NonNull Context context) {
        if (this.f41021OooOOO0) {
            return this.f41020OooOOO;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooO0O0 = androidx.core.content.res.OooO00o.OooO0O0(this.f41019OooOO0o, context);
                this.f41020OooOOO = typefaceOooO0O0;
                if (typefaceOooO0O0 != null) {
                    this.f41020OooOOO = Typeface.create(typefaceOooO0O0, this.f41011OooO0OO);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f41010OooO0O0, e);
            }
        }
        OooO00o();
        this.f41021OooOOO0 = true;
        return this.f41020OooOOO;
    }

    public final void OooO0OO(@NonNull Context context, @NonNull OooOO0O oooOO0O) {
        if (OooO0Oo(context)) {
            OooO0O0(context);
        } else {
            OooO00o();
        }
        int i = this.f41019OooOO0o;
        if (i == 0) {
            this.f41021OooOOO0 = true;
        }
        if (this.f41021OooOOO0) {
            oooOO0O.OooO0O0(this.f41020OooOOO, true);
            return;
        }
        try {
            OooO00o oooO00o = new OooO00o(oooOO0O);
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5298OooO00o;
            if (context.isRestricted()) {
                oooO00o.OooO00o(-4);
            } else {
                androidx.core.content.res.OooO00o.OooO0OO(context, i, new TypedValue(), 0, oooO00o, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f41021OooOOO0 = true;
            oooOO0O.OooO00o(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f41010OooO0O0, e);
            this.f41021OooOOO0 = true;
            oooOO0O.OooO00o(-3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final boolean OooO0Oo(Context context) {
        Typeface typefaceOooO0OO;
        int i = this.f41019OooOO0o;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5298OooO00o;
            if (context.isRestricted()) {
                typefaceOooO0OO = null;
            } else {
                typefaceOooO0OO = androidx.core.content.res.OooO00o.OooO0OO(context, i, new TypedValue(), 0, null, false, true);
            }
        } else {
            typefaceOooO0OO = null;
        }
        return typefaceOooO0OO != null;
    }

    public final void OooO0o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull OooOO0O oooOO0O) {
        if (OooO0Oo(context)) {
            OooO0oO(context, textPaint, OooO0O0(context));
            return;
        }
        OooO00o();
        OooO0oO(context, textPaint, this.f41020OooOOO);
        OooO0OO(context, new OooOO0(this, context, textPaint, oooOO0O));
    }

    public final void OooO0o0(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull OooOO0O oooOO0O) {
        OooO0o(context, textPaint, oooOO0O);
        ColorStateList colorStateList = this.f41017OooOO0;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f41009OooO00o;
        textPaint.setShadowLayer(this.f41015OooO0oO, this.f41014OooO0o0, this.f41013OooO0o, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void OooO0oO(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceOooO00o = OooOOO.OooO00o(context.getResources().getConfiguration(), typeface);
        if (typefaceOooO00o != null) {
            typeface = typefaceOooO00o;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f41011OooO0OO;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f41018OooOO0O);
        if (this.f41016OooO0oo) {
            textPaint.setLetterSpacing(this.f41008OooO);
        }
    }
}
