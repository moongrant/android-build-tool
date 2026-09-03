package com.app.selectPicture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import java.io.Serializable;
import o00O0OOO.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsViewLinearLayout<ListenerTag> extends LinearLayout implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o<ListenerTag> f9786OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Context f9787OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f9788OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public LayoutInflater f9789OooO0oO;

    public AbsViewLinearLayout(Context context) {
        super(context);
        OooO00o(context);
    }

    public final void OooO00o(Context context) {
        this.f9787OooO0o = context;
        this.f9789OooO0oO = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0OO();
        OooO0O0();
    }

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public Context getContextBase() {
        return this.f9787OooO0o;
    }

    public final View getConvertView() {
        return this.f9788OooO0o0;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f9789OooO0oO;
    }

    public OooO00o<ListenerTag> getListener() {
        return this.f9786OooO0Oo;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f9788OooO0o0 = this.f9789OooO0oO.inflate(i, (ViewGroup) null);
    }

    public void setListener(OooO00o<ListenerTag> oooO00o) {
        this.f9786OooO0Oo = oooO00o;
    }

    public AbsViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO00o(context);
    }

    public AbsViewLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO00o(context);
    }
}
