package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p012OooOo0.OooOO0O;
import p337o0OO0o0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final CharSequence f17751Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Drawable f17752Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f17753Oooo0oo;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.TabItem);
        this.f17751Oooo0o = typedArrayObtainStyledAttributes.getText(Oooo0.TabItem_android_text);
        int i = Oooo0.TabItem_android_icon;
        this.f17752Oooo0oO = (!typedArrayObtainStyledAttributes.hasValue(i) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i) : OooOO0O.OooO0O0(context, resourceId);
        this.f17753Oooo0oo = typedArrayObtainStyledAttributes.getResourceId(Oooo0.TabItem_android_layout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
