package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DeviceProperties;
import p084o000Ooo.o0OOO0o;
import p265o00ooo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    public static final int OooO00o(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(Oooo0.OooO00o(33, "Unknown color scheme: ", i));
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i5 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int iOooO00o = OooO00o(i2, i4, i5, i5);
        int i6 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i7 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int iOooO00o2 = OooO00o(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            iOooO00o = iOooO00o2;
        } else if (i != 2) {
            throw new IllegalStateException(Oooo0.OooO00o(32, "Unknown button size: ", i));
        }
        Drawable drawableOooO0o0 = o0OOO0o.OooO0o0(resources.getDrawable(iOooO00o));
        o0OOO0o.OooO0O0.OooO0oo(drawableOooO0o0, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        o0OOO0o.OooO0O0.OooO(drawableOooO0o0, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawableOooO0o0);
        int i8 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i9 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(OooO00o(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
        } else {
            if (i != 2) {
                throw new IllegalStateException(Oooo0.OooO00o(32, "Unknown button size: ", i));
            }
            setText((CharSequence) null);
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
