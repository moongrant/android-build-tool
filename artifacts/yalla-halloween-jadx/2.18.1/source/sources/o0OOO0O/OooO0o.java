package o0OOO0O;

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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p337o0OO0o0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f38035OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final ColorStateList f38036OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f38037OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38038OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f38040OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f38041OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f38042OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f38043OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f38044OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f38045OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @FontRes
    public final int f38046OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Typeface f38047OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f38048OooOOO0 = false;

    public class OooO00o extends androidx.core.content.res.OooO00o.OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f38049OooO00o;

        public OooO00o(OooOO0 oooOO1) {
            this.f38049OooO00o = oooOO1;
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0Oo(int i) {
            OooO0o.this.f38048OooOOO0 = true;
            this.f38049OooO00o.OooO00o(i);
        }

        @Override // androidx.core.content.res.OooO00o.OooO
        public final void OooO0o0(@NonNull Typeface typeface) {
            OooO0o oooO0o = OooO0o.this;
            oooO0o.f38047OooOOO = Typeface.create(typeface, oooO0o.f38038OooO0OO);
            OooO0o oooO0o2 = OooO0o.this;
            oooO0o2.f38048OooOOO0 = true;
            this.f38049OooO00o.OooO0O0(oooO0o2.f38047OooOOO, false);
        }
    }

    public OooO0o(@NonNull Context context, @StyleRes int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, Oooo0.TextAppearance);
        this.f38045OooOO0O = typedArrayObtainStyledAttributes.getDimension(Oooo0.TextAppearance_android_textSize, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f38044OooOO0 = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_textColor);
        OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_textColorHint);
        OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_textColorLink);
        this.f38038OooO0OO = typedArrayObtainStyledAttributes.getInt(Oooo0.TextAppearance_android_textStyle, 0);
        this.f38039OooO0Oo = typedArrayObtainStyledAttributes.getInt(Oooo0.TextAppearance_android_typeface, 1);
        int i2 = Oooo0.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : Oooo0.TextAppearance_android_fontFamily;
        this.f38046OooOO0o = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f38037OooO0O0 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(Oooo0.TextAppearance_textAllCaps, false);
        this.f38036OooO00o = OooO0OO.OooO00o(context, typedArrayObtainStyledAttributes, Oooo0.TextAppearance_android_shadowColor);
        this.f38041OooO0o0 = typedArrayObtainStyledAttributes.getFloat(Oooo0.TextAppearance_android_shadowDx, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f38040OooO0o = typedArrayObtainStyledAttributes.getFloat(Oooo0.TextAppearance_android_shadowDy, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f38042OooO0oO = typedArrayObtainStyledAttributes.getFloat(Oooo0.TextAppearance_android_shadowRadius, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, Oooo0.MaterialTextAppearance);
        int i3 = Oooo0.MaterialTextAppearance_android_letterSpacing;
        this.f38043OooO0oo = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.f38035OooO = typedArrayObtainStyledAttributes2.getFloat(i3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        String str;
        if (this.f38047OooOOO == null && (str = this.f38037OooO0O0) != null) {
            this.f38047OooOOO = Typeface.create(str, this.f38038OooO0OO);
        }
        if (this.f38047OooOOO == null) {
            int i = this.f38039OooO0Oo;
            if (i == 1) {
                this.f38047OooOOO = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f38047OooOOO = Typeface.SERIF;
            } else if (i != 3) {
                this.f38047OooOOO = Typeface.DEFAULT;
            } else {
                this.f38047OooOOO = Typeface.MONOSPACE;
            }
            this.f38047OooOOO = Typeface.create(this.f38047OooOOO, this.f38038OooO0OO);
        }
    }

    @NonNull
    @VisibleForTesting
    public final Typeface OooO0O0(@NonNull Context context) {
        if (this.f38048OooOOO0) {
            return this.f38047OooOOO;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceOooO00o = androidx.core.content.res.OooO00o.OooO00o(context, this.f38046OooOO0o);
                this.f38047OooOOO = typefaceOooO00o;
                if (typefaceOooO00o != null) {
                    this.f38047OooOOO = Typeface.create(typefaceOooO00o, this.f38038OooO0OO);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error loading font ");
                sbOooO0o0.append(this.f38037OooO0O0);
                Log.d("TextAppearance", sbOooO0o0.toString(), e);
            }
        }
        OooO00o();
        this.f38048OooOOO0 = true;
        return this.f38047OooOOO;
    }

    public final void OooO0OO(@NonNull Context context, @NonNull OooOO0 oooOO1) {
        if (OooO0Oo(context)) {
            OooO0O0(context);
        } else {
            OooO00o();
        }
        int i = this.f38046OooOO0o;
        if (i == 0) {
            this.f38048OooOOO0 = true;
        }
        if (this.f38048OooOOO0) {
            oooOO1.OooO0O0(this.f38047OooOOO, true);
            return;
        }
        try {
            OooO00o oooO00o = new OooO00o(oooOO1);
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
            if (context.isRestricted()) {
                oooO00o.OooO00o(-4);
            } else {
                androidx.core.content.res.OooO00o.OooO0O0(context, i, new TypedValue(), 0, oooO00o, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f38048OooOOO0 = true;
            oooOO1.OooO00o(1);
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error loading font ");
            sbOooO0o0.append(this.f38037OooO0O0);
            Log.d("TextAppearance", sbOooO0o0.toString(), e);
            this.f38048OooOOO0 = true;
            oooOO1.OooO00o(-3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final boolean OooO0Oo(Context context) {
        Typeface typefaceOooO0O0;
        int i = this.f38046OooOO0o;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.OooO00o.f7829OooO00o;
            if (context.isRestricted()) {
                typefaceOooO0O0 = null;
            } else {
                typefaceOooO0O0 = androidx.core.content.res.OooO00o.OooO0O0(context, i, new TypedValue(), 0, null, false, true);
            }
        } else {
            typefaceOooO0O0 = null;
        }
        return typefaceOooO0O0 != null;
    }

    public final void OooO0o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull OooOO0 oooOO1) {
        if (OooO0Oo(context)) {
            OooO0oO(context, textPaint, OooO0O0(context));
            return;
        }
        OooO00o();
        OooO0oO(context, textPaint, this.f38047OooOOO);
        OooO0OO(context, new OooO(this, context, textPaint, oooOO1));
    }

    public final void OooO0o0(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull OooOO0 oooOO1) {
        OooO0o(context, textPaint, oooOO1);
        ColorStateList colorStateList = this.f38044OooOO0;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f38042OooO0oO;
        float f2 = this.f38041OooO0o0;
        float f3 = this.f38040OooO0o;
        ColorStateList colorStateList2 = this.f38036OooO00o;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void OooO0oO(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface typefaceOooO00o = OooOO0O.OooO00o(context.getResources().getConfiguration(), typeface);
        if (typefaceOooO00o != null) {
            typeface = typefaceOooO00o;
        }
        textPaint.setTypeface(typeface);
        int i = this.f38038OooO0OO & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        textPaint.setTextSize(this.f38045OooOO0O);
        if (this.f38043OooO0oo) {
            textPaint.setLetterSpacing(this.f38035OooO);
        }
    }
}
