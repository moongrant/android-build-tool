package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f17299OooO0Oo;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final void OooO0O0(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f17299OooO0Oo = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f17299OooO0Oo;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        OooO0O0(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17299OooO0Oo = getVisibility();
    }
}
