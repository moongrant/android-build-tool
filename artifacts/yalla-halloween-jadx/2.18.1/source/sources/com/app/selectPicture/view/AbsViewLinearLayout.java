package com.app.selectPicture.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import java.io.Serializable;
import p200o00o0Oo0.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsViewLinearLayout<ListenerTag> extends LinearLayout implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LayoutInflater f12328Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00000OO<ListenerTag> f12329Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f12330Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f12331Oooo0oo;

    public AbsViewLinearLayout(Context context) {
        super(context);
        OooO00o(context);
    }

    public final void OooO00o(Context context) {
        this.f12331Oooo0oo = context;
        this.f12328Oooo = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0OO();
        OooO0O0();
    }

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public Context getContextBase() {
        return this.f12331Oooo0oo;
    }

    public final View getConvertView() {
        return this.f12330Oooo0oO;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f12328Oooo;
    }

    public o00000OO<ListenerTag> getListener() {
        return this.f12329Oooo0o;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f12330Oooo0oO = this.f12328Oooo.inflate(i, (ViewGroup) null);
    }

    public void setListener(o00000OO<ListenerTag> o00000oo2) {
        this.f12329Oooo0o = o00000oo2;
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
