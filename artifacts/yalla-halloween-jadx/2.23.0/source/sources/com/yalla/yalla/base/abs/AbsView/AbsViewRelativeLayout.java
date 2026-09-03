package com.yalla.yalla.base.abs.AbsView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.LayoutRes;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.ui.view.emptyView.EmptyFriendView;
import java.io.Serializable;
import p466o0Oooo0o.oo00o;
import p629o0ooO0O0.o0000;
import p629o0ooO0O0.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsViewRelativeLayout<Model extends AbsJavaBean, ListenerTag> extends RelativeLayout implements Serializable, o00000OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0000<ListenerTag> f22744OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Context f22745OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f22746OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public LayoutInflater f22747OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f22748OooO0oo;

    public class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            ((EmptyFriendView) AbsViewRelativeLayout.this).onClickNotDouble(view);
        }
    }

    public AbsViewRelativeLayout(Context context) {
        super(context);
        this.f22748OooO0oo = null;
        OooO00o(context);
    }

    public final void OooO00o(Context context) {
        this.f22745OooO0o = context;
        this.f22747OooO0oO = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0OO();
        OooO0O0();
    }

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public Context getContextBase() {
        return this.f22745OooO0o;
    }

    public final View getConvertView() {
        return this.f22746OooO0o0;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f22747OooO0oO;
    }

    public o0000<ListenerTag> getListener() {
        return this.f22744OooO0Oo;
    }

    public oo00o getNoDoubleClickListener() {
        if (this.f22748OooO0oo == null) {
            this.f22748OooO0oo = new OooO00o();
        }
        return this.f22748OooO0oo;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f22746OooO0o0 = this.f22747OooO0oO.inflate(i, (ViewGroup) null);
    }

    public void setListener(o0000<ListenerTag> o0000Var) {
        this.f22744OooO0Oo = o0000Var;
    }

    public AbsViewRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22748OooO0oo = null;
        OooO00o(context);
    }

    public AbsViewRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22748OooO0oo = null;
        OooO00o(context);
    }
}
