package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes4.dex */
public class ToggleImageButton extends ImageButton {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final int[] f22332OooO0oo = {o0ooOOo.state_toggled_on};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f22333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f22334OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f22335OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f22336OooO0oO;

    public ToggleImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f22333OooO0Oo) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22332OooO0oo);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f22336OooO0oO) {
            setToggledOn(!this.f22333OooO0Oo);
        }
        return super.performClick();
    }

    public void setToggledOn(boolean z) {
        this.f22333OooO0Oo = z;
        setContentDescription(z ? this.f22335OooO0o0 : this.f22334OooO0o);
        refreshDrawableState();
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o000000O.ToggleImageButton, i, 0);
            String string = typedArrayObtainStyledAttributes.getString(o000000O.ToggleImageButton_contentDescriptionOn);
            String string2 = typedArrayObtainStyledAttributes.getString(o000000O.ToggleImageButton_contentDescriptionOff);
            this.f22335OooO0o0 = string == null ? (String) getContentDescription() : string;
            this.f22334OooO0o = string2 == null ? (String) getContentDescription() : string2;
            this.f22336OooO0oO = typedArrayObtainStyledAttributes.getBoolean(o000000O.ToggleImageButton_toggleOnClick, true);
            setToggledOn(false);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }
}
