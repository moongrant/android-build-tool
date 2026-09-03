package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements View.OnTouchListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f17891Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f17892Oooo0oO;

    public OooOOOO(OooOO0O oooOO0O, AutoCompleteTextView autoCompleteTextView) {
        this.f17892Oooo0oO = oooOO0O;
        this.f17891Oooo0o = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f17892Oooo0oO.OooOOO0()) {
                this.f17892Oooo0oO.f17868OooOO0o = false;
            }
            OooOO0O.OooO0oO(this.f17892Oooo0oO, this.f17891Oooo0o);
            OooOO0O.OooO0oo(this.f17892Oooo0oO);
        }
        return false;
    }
}
