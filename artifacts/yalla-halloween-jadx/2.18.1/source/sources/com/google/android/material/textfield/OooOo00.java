package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public TextInputLayout f17893OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f17894OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public CheckableImageButton f17895OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @DrawableRes
    public final int f17896OooO0Oo;

    public OooOo00(@NonNull TextInputLayout textInputLayout, @DrawableRes int i) {
        this.f17893OooO00o = textInputLayout;
        this.f17894OooO0O0 = textInputLayout.getContext();
        this.f17895OooO0OO = textInputLayout.getEndIconView();
        this.f17896OooO0Oo = i;
    }

    public abstract void OooO00o();

    public boolean OooO0O0(int i) {
        return true;
    }

    public void OooO0OO(boolean z) {
    }
}
