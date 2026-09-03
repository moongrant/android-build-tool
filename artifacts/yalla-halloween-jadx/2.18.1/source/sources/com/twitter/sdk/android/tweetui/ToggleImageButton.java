package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import p439o0OoOOo0.o000O0O0;
import p439o0OoOOo0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public class ToggleImageButton extends ImageButton {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final int[] f20136OoooO00 = {o000O0O0.state_toggled_on};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f20137Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f20138Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f20139Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f20140Oooo0oo;

    public ToggleImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f20138Oooo0o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20136OoooO00);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f20137Oooo) {
            setToggledOn(!this.f20138Oooo0o);
        }
        return super.performClick();
    }

    public void setToggledOn(boolean z) {
        this.f20138Oooo0o = z;
        setContentDescription(z ? this.f20139Oooo0oO : this.f20140Oooo0oo);
        refreshDrawableState();
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o00O000.ToggleImageButton, i, 0);
            String string = typedArrayObtainStyledAttributes.getString(o00O000.ToggleImageButton_contentDescriptionOn);
            String string2 = typedArrayObtainStyledAttributes.getString(o00O000.ToggleImageButton_contentDescriptionOff);
            this.f20139Oooo0oO = string == null ? (String) getContentDescription() : string;
            this.f20140Oooo0oo = string2 == null ? (String) getContentDescription() : string2;
            this.f20137Oooo = typedArrayObtainStyledAttributes.getBoolean(o00O000.ToggleImageButton_toggleOnClick, true);
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
