package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p013OooOo0o.o00Oo0;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class TabItem extends View {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final CharSequence f17382OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f17383OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Drawable f17384OooO0o0;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.TabItem);
        this.f17382OooO0Oo = typedArrayObtainStyledAttributes.getText(o000OO.TabItem_android_text);
        int i = o000OO.TabItem_android_icon;
        this.f17384OooO0o0 = (!typedArrayObtainStyledAttributes.hasValue(i) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(i, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(i) : o00Oo0.OooO00o(context, resourceId);
        this.f17383OooO0o = typedArrayObtainStyledAttributes.getResourceId(o000OO.TabItem_android_layout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
