package p545o0oO0Ooo;

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
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d1 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f55812OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final ColorStateList f55813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f55814OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f55815OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f55816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f55817OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f55818OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f55819OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f55820OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f55821OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f55822OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @FontRes
    public final int f55823OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Typeface f55824OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f55825OooOOO0 = false;

    public class OooO00o extends androidx.core.content.res.OooO00o.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ f1 f55826OooO00o;

        public OooO00o(f1 f1Var) {
            this.f55826OooO00o = f1Var;
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0OO(int i) {
            d1.this.f55825OooOOO0 = true;
            this.f55826OooO00o.OooO00o(i);
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0Oo(@NonNull Typeface typeface) {
            d1 d1Var = d1.this;
            d1Var.f55824OooOOO = Typeface.create(typeface, d1Var.f55815OooO0OO);
            d1Var.f55825OooOOO0 = true;
            this.f55826OooO00o.OooO0O0(d1Var.f55824OooOOO, false);
        }
    }

    public d1(@NonNull Context context, @StyleRes int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, o000OO.TextAppearance);
        this.f55822OooOO0O = typedArrayObtainStyledAttributes.getDimension(o000OO.TextAppearance_android_textSize, 0.0f);
        this.f55821OooOO0 = c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColor);
        c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorHint);
        c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_textColorLink);
        this.f55815OooO0OO = typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_textStyle, 0);
        this.f55816OooO0Oo = typedArrayObtainStyledAttributes.getInt(o000OO.TextAppearance_android_typeface, 1);
        int i2 = o000OO.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : o000OO.TextAppearance_android_fontFamily;
        this.f55823OooOO0o = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f55814OooO0O0 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(o000OO.TextAppearance_textAllCaps, false);
        this.f55813OooO00o = c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.TextAppearance_android_shadowColor);
        this.f55818OooO0o0 = typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDx, 0.0f);
        this.f55817OooO0o = typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowDy, 0.0f);
        this.f55819OooO0oO = typedArrayObtainStyledAttributes.getFloat(o000OO.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, o000OO.MaterialTextAppearance);
        int i3 = o000OO.MaterialTextAppearance_android_letterSpacing;
        this.f55820OooO0oo = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.f55812OooO = typedArrayObtainStyledAttributes2.getFloat(i3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        String str;
        Typeface typeface = this.f55824OooOOO;
        int i = this.f55815OooO0OO;
        if (typeface == null && (str = this.f55814OooO0O0) != null) {
            this.f55824OooOOO = Typeface.create(str, i);
        }
        if (this.f55824OooOOO == null) {
            int i2 = this.f55816OooO0Oo;
            if (i2 == 1) {
                this.f55824OooOOO = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f55824OooOOO = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f55824OooOOO = Typeface.DEFAULT;
            } else {
                this.f55824OooOOO = Typeface.MONOSPACE;
            }
            this.f55824OooOOO = Typeface.create(this.f55824OooOOO, i);
        }
    }

    @NonNull
    @VisibleForTesting
    public final Typeface OooO0O0(@NonNull Context context) {
        if (this.f55825OooOOO0) {
            return this.f55824OooOOO;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooO0O0 = androidx.core.content.res.OooO00o.OooO0O0(this.f55823OooOO0o, context);
                this.f55824OooOOO = typefaceOooO0O0;
                if (typefaceOooO0O0 != null) {
                    this.f55824OooOOO = Typeface.create(typefaceOooO0O0, this.f55815OooO0OO);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f55814OooO0O0, e);
            }
        }
        OooO00o();
        this.f55825OooOOO0 = true;
        return this.f55824OooOOO;
    }

    public final void OooO0OO(@NonNull Context context, @NonNull f1 f1Var) {
        if (OooO0Oo(context)) {
            OooO0O0(context);
        } else {
            OooO00o();
        }
        int i = this.f55823OooOO0o;
        if (i == 0) {
            this.f55825OooOOO0 = true;
        }
        if (this.f55825OooOOO0) {
            f1Var.OooO0O0(this.f55824OooOOO, true);
            return;
        }
        try {
            OooO00o oooO00o = new OooO00o(f1Var);
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
            if (context.isRestricted()) {
                oooO00o.OooO00o(-4);
            } else {
                androidx.core.content.res.OooO00o.OooO0OO(context, i, new TypedValue(), 0, oooO00o, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f55825OooOOO0 = true;
            f1Var.OooO00o(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f55814OooO0O0, e);
            this.f55825OooOOO0 = true;
            f1Var.OooO00o(-3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final boolean OooO0Oo(Context context) {
        Typeface typefaceOooO0OO;
        int i = this.f55823OooOO0o;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f5288OooO00o;
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

    public final void OooO0o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f1 f1Var) {
        if (OooO0Oo(context)) {
            OooO0oO(context, textPaint, OooO0O0(context));
            return;
        }
        OooO00o();
        OooO0oO(context, textPaint, this.f55824OooOOO);
        OooO0OO(context, new e1(this, context, textPaint, f1Var));
    }

    public final void OooO0o0(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f1 f1Var) {
        OooO0o(context, textPaint, f1Var);
        ColorStateList colorStateList = this.f55821OooOO0;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f55813OooO00o;
        textPaint.setShadowLayer(this.f55819OooO0oO, this.f55818OooO0o0, this.f55817OooO0o, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void OooO0oO(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceOooO00o = h1.OooO00o(context.getResources().getConfiguration(), typeface);
        if (typefaceOooO00o != null) {
            typeface = typefaceOooO00o;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f55815OooO0OO;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f55822OooOO0O);
        if (this.f55820OooO0oo) {
            textPaint.setLetterSpacing(this.f55812OooO);
        }
    }
}
