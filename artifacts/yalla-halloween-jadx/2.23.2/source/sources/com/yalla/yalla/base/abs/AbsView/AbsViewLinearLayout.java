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
import p400o0Oo0O0.OooOO0O;
import p400o0Oo0O0.OooOOO;
import p473o0OoooOo.o0OOOO0o;
import p587o0oOooOO.u;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsViewLinearLayout<ListenerTag> extends LinearLayout implements Serializable, OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO<ListenerTag> f22265OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Context f22266OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f22267OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public LayoutInflater f22268OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f22269OooO0oo;

    public class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            AbsViewLinearLayout.this.getClass();
        }
    }

    public AbsViewLinearLayout(Context context) {
        super(context);
        this.f22269OooO0oo = null;
        OooO0O0(context);
    }

    public final View OooO00o(@IdRes int i) {
        return u.OooO00o(getConvertView(), i, null);
    }

    public final void OooO0O0(Context context) {
        this.f22266OooO0o = context;
        this.f22268OooO0oO = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0Oo();
        OooO0OO();
    }

    public abstract void OooO0OO();

    public abstract void OooO0Oo();

    public Context getContextBase() {
        return this.f22266OooO0o;
    }

    public final View getConvertView() {
        return this.f22267OooO0o0;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f22268OooO0oO;
    }

    public OooOOO<ListenerTag> getListener() {
        return this.f22265OooO0Oo;
    }

    public o0OOOO0o getNoDoubleClickListener() {
        if (this.f22269OooO0oo == null) {
            this.f22269OooO0oo = new OooO00o();
        }
        return this.f22269OooO0oo;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f22267OooO0o0 = this.f22268OooO0oO.inflate(i, (ViewGroup) null);
    }

    public void setListener(OooOOO<ListenerTag> oooOOO) {
        this.f22265OooO0Oo = oooOOO;
    }

    public AbsViewLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22269OooO0oo = null;
        OooO0O0(context);
    }

    public AbsViewLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22269OooO0oo = null;
        OooO0O0(context);
    }
}
