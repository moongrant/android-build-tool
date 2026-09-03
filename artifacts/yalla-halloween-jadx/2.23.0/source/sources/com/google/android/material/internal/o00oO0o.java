package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.o000Oo0;
import p270o0O0000o.o00000;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f17321OooO00o = {o00000.colorPrimary};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f17322OooO0O0 = {o00000.colorPrimaryVariant};

    public static void OooO00o(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ThemeEnforcement, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o000OO.ThemeEnforcement_enforceMaterialTheme, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(o00000.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                OooO0OO(context, f17322OooO0O0, "Theme.MaterialComponents");
            }
        }
        OooO0OO(context, f17321OooO00o, "Theme.AppCompat");
    }

    public static void OooO0O0(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @Nullable @StyleableRes int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ThemeEnforcement, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(o000OO.ThemeEnforcement_enforceTextAppearance, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int length = iArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(o000OO.ThemeEnforcement_android_textAppearance, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public static void OooO0OO(@NonNull Context context, @NonNull int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                if (z) {
                    throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO00o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        z = true;
        if (z) {
            throw new IllegalArgumentException(p004OooO0oO.o000oOoO.OooO00o("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    @NonNull
    public static TypedArray OooO0Oo(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        OooO00o(context, attributeSet, i, i2);
        OooO0O0(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static o000Oo0 OooO0o0(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        OooO00o(context, attributeSet, i, i2);
        OooO0O0(context, attributeSet, iArr, i, i2, iArr2);
        return new o000Oo0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
