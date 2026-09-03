package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p337o0OO0o0.OooOOO0;
import p348o0OOO0oO.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements OooOOOO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f17739Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Button f17740Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f17741Oooo0oo;

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
        if (this.f17739Oooo0o.getPaddingTop() == i2 && this.f17739Oooo0o.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f17739Oooo0o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooO.OooO0oO(textView)) {
            ViewCompat.OooO.OooOO0O(textView, ViewCompat.OooO.OooO0o(textView), i2, ViewCompat.OooO.OooO0o0(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f17740Oooo0oO;
    }

    public TextView getMessageView() {
        return this.f17739Oooo0o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f17739Oooo0o = (TextView) findViewById(OooOOO0.snackbar_text);
        this.f17740Oooo0oO = (Button) findViewById(OooOOO0.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(p337o0OO0o0.OooOO0.design_snackbar_padding_vertical);
        boolean z2 = this.f17739Oooo0o.getLayout().getLineCount() > 1;
        if (!z2 || this.f17741Oooo0oo <= 0 || this.f17740Oooo0oO.getMeasuredWidth() <= this.f17741Oooo0oo) {
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
        this.f17741Oooo0oo = i;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
