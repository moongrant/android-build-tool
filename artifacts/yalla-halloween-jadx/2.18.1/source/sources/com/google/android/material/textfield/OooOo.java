package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {
    public static void OooO00o(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = o0OOO0o.OooO0o0(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                o0OOO0o.OooO0O0.OooO0oo(drawable, colorStateList);
            } else {
                o0OOO0o.OooO0O0.OooO0oo(drawable, ColorStateList.valueOf(colorStateList.getColorForState(OooO0O0(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                o0OOO0o.OooO0O0.OooO(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static int[] OooO0O0(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    public static void OooO0OO(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(OooO0O0(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = o0OOO0o.OooO0o0(drawable).mutate();
        o0OOO0o.OooO0O0.OooO0oo(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void OooO0Oo(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        boolean zOooO00o = ViewCompat.OooO0OO.OooO00o(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zOooO00o || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zOooO00o);
        checkableImageButton.setPressable(zOooO00o);
        checkableImageButton.setLongClickable(z);
        ViewCompat.OooO0o.OooOOoo(checkableImageButton, z2 ? 1 : 2);
    }
}
