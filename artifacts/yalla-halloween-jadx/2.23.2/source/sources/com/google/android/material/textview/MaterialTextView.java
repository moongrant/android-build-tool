package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import o0O0O0O.OooO00o;
import p272o0O0000o.o00000;
import p272o0O0000o.o000OO;
import p276o0O00OoO.OooO0OO;
import p276o0O00OoO.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    public final void OooOO0o(@NonNull Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, o000OO.MaterialTextAppearance);
        Context context = getContext();
        int[] iArr = {o000OO.MaterialTextAppearance_android_lineHeight, o000OO.MaterialTextAppearance_lineHeight};
        int iOooO0OO = -1;
        for (int i2 = 0; i2 < 2 && iOooO0OO < 0; i2++) {
            iOooO0OO = OooO0o.OooO0OO(context, typedArrayObtainStyledAttributes, iArr[i2], -1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (iOooO0OO >= 0) {
            setLineHeight(iOooO0OO);
        }
    }

    public final void OooOOO0(@Nullable AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (OooO0OO.OooO0O0(context, o00000.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = o000OO.MaterialTextView;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int[] iArr2 = {o000OO.MaterialTextView_android_lineHeight, o000OO.MaterialTextView_lineHeight};
            int iOooO0OO = -1;
            for (int i3 = 0; i3 < 2 && iOooO0OO < 0; i3++) {
                iOooO0OO = OooO0o.OooO0OO(context, typedArrayObtainStyledAttributes, iArr2[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iOooO0OO != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(o000OO.MaterialTextView_android_textAppearance, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                OooOO0o(theme, resourceId);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (OooO0OO.OooO0O0(context, o00000.textAppearanceLineHeightEnabled, true)) {
            OooOO0o(context.getTheme(), i);
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        OooOOO0(attributeSet, i, 0);
    }

    @Deprecated
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        OooOOO0(attributeSet, i, i2);
    }
}
