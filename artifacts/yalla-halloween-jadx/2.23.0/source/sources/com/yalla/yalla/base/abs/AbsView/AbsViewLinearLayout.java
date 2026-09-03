package com.yalla.yalla.base.abs.AbsView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import java.io.Serializable;
import p466o0Oooo0o.oo00o;
import p539o0o0OoOO.z0;
import p629o0ooO0O0.o0000;
import p629o0ooO0O0.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsViewLinearLayout<ListenerTag> extends LinearLayout implements Serializable, o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000<ListenerTag> f22738OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Context f22739OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f22740OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public LayoutInflater f22741OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f22742OooO0oo;

    public class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            AbsViewLinearLayout.this.getClass();
        }
    }

    public AbsViewLinearLayout(Context context) {
        super(context);
        this.f22742OooO0oo = null;
        OooO0O0(context);
    }

    public final View OooO00o(@IdRes int i) {
        return z0.OooO00o(getConvertView(), i, null);
    }

    public final void OooO0O0(Context context) {
        this.f22739OooO0o = context;
        this.f22741OooO0oO = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0Oo();
        OooO0OO();
    }

    public abstract void OooO0OO();

    public abstract void OooO0Oo();

    public Context getContextBase() {
        return this.f22739OooO0o;
    }

    public final View getConvertView() {
        return this.f22740OooO0o0;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f22741OooO0oO;
    }

    public o0000<ListenerTag> getListener() {
        return this.f22738OooO0Oo;
    }

    public oo00o getNoDoubleClickListener() {
        if (this.f22742OooO0oo == null) {
            this.f22742OooO0oo = new OooO00o();
        }
        return this.f22742OooO0oo;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f22740OooO0o0 = this.f22741OooO0oO.inflate(i, (ViewGroup) null);
    }

    public void setListener(o0000<ListenerTag> o0000Var) {
        this.f22738OooO0Oo = o0000Var;
    }

    public AbsViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22742OooO0oo = null;
        OooO0O0(context);
    }

    public AbsViewLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22742OooO0oo = null;
        OooO0O0(context);
    }
}
