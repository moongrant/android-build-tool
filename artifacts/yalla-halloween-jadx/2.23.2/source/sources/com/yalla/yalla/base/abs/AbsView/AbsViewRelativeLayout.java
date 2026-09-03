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
import p400o0Oo0O0.OooOO0O;
import p400o0Oo0O0.OooOOO;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsViewRelativeLayout<Model extends AbsJavaBean, ListenerTag> extends RelativeLayout implements Serializable, OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooOOO<ListenerTag> f22271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Context f22272OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public View f22273OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public LayoutInflater f22274OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO00o f22275OooO0oo;

    public class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            ((EmptyFriendView) AbsViewRelativeLayout.this).onClickNotDouble(view);
        }
    }

    public AbsViewRelativeLayout(Context context) {
        super(context);
        this.f22275OooO0oo = null;
        OooO00o(context);
    }

    public final void OooO00o(Context context) {
        this.f22272OooO0o = context;
        this.f22274OooO0oO = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0OO();
        OooO0O0();
    }

    public abstract void OooO0O0();

    public abstract void OooO0OO();

    public Context getContextBase() {
        return this.f22272OooO0o;
    }

    public final View getConvertView() {
        return this.f22273OooO0o0;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f22274OooO0oO;
    }

    public OooOOO<ListenerTag> getListener() {
        return this.f22271OooO0Oo;
    }

    public o0OOOO0o getNoDoubleClickListener() {
        if (this.f22275OooO0oo == null) {
            this.f22275OooO0oo = new OooO00o();
        }
        return this.f22275OooO0oo;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f22273OooO0o0 = this.f22274OooO0oO.inflate(i, (ViewGroup) null);
    }

    public void setListener(OooOOO<ListenerTag> oooOOO) {
        this.f22271OooO0Oo = oooOOO;
    }

    public AbsViewRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22275OooO0oo = null;
        OooO00o(context);
    }

    public AbsViewRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22275OooO0oo = null;
        OooO00o(context);
    }
}
