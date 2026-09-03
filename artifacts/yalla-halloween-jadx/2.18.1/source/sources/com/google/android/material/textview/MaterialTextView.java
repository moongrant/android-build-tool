package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import o0OOO0O.OooO0O0;
import o0OOO0O.OooO0OO;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean OooO0o0(Context context) {
        TypedValue typedValueOooO00o = OooO0O0.OooO00o(context, OooO0o.textAppearanceLineHeightEnabled);
        return (typedValueOooO00o != null && typedValueOooO00o.type == 18 && typedValueOooO00o.data == 0) ? false : true;
    }

    public final void OooO0OO(@NonNull Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, Oooo0.MaterialTextAppearance);
        Context context = getContext();
        int[] iArr = {Oooo0.MaterialTextAppearance_android_lineHeight, Oooo0.MaterialTextAppearance_lineHeight};
        int iOooO0OO = -1;
        for (int i2 = 0; i2 < 2 && iOooO0OO < 0; i2++) {
            iOooO0OO = OooO0OO.OooO0OO(context, typedArrayObtainStyledAttributes, iArr[i2], -1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (iOooO0OO >= 0) {
            setLineHeight(iOooO0OO);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (OooO0o0(context)) {
            OooO0OO(context.getTheme(), i);
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        if (OooO0o0(context2)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, Oooo0.MaterialTextView, i, i2);
            int[] iArr = {Oooo0.MaterialTextView_android_lineHeight, Oooo0.MaterialTextView_lineHeight};
            int iOooO0OO = -1;
            for (int i3 = 0; i3 < 2 && iOooO0OO < 0; i3++) {
                iOooO0OO = OooO0OO.OooO0OO(context2, typedArrayObtainStyledAttributes, iArr[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iOooO0OO != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, Oooo0.MaterialTextView, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(Oooo0.MaterialTextView_android_textAppearance, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                OooO0OO(theme, resourceId);
            }
        }
    }
}
