package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o0000Ooo;
import p278o0O00o.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextView f17366OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TimeInterpolator f17367OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Button f17368OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f17369OooO0oO;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    public final boolean OooO00o(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f17366OooO0Oo.getPaddingTop() == i2 && this.f17366OooO0Oo.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f17366OooO0Oo;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooO.OooO0oO(textView)) {
            ViewCompat.OooO.OooOO0O(textView, ViewCompat.OooO.OooO0o(textView), i2, ViewCompat.OooO.OooO0o0(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f17368OooO0o0;
    }

    public TextView getMessageView() {
        return this.f17366OooO0Oo;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f17366OooO0Oo = (TextView) findViewById(o0000Ooo.snackbar_text);
        this.f17368OooO0o0 = (Button) findViewById(o0000Ooo.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(o00000O.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(o00000O.design_snackbar_padding_vertical);
        Layout layout = this.f17366OooO0Oo.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f17369OooO0oO <= 0 || this.f17368OooO0o0.getMeasuredWidth() <= this.f17369OooO0oO) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!OooO00o(0, dimensionPixelSize, dimensionPixelSize)) {
                z = false;
            }
        } else if (!OooO00o(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z = false;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f17369OooO0oO = i;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17367OooO0o = o0O00OOO.OooO00o.OooO0Oo(context, o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f40881OooO0O0);
    }
}
