package com.app.base.framework.abs.AbsView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.app.base.bean.AbsJavaBean;
import com.app.base.view.emptyView.EmptyFriendView;
import java.io.Serializable;
import o00Oo00.OooO0OO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsViewRelativeLayout<Model extends AbsJavaBean, ListenerTag> extends RelativeLayout implements Serializable, o00Oo00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public LayoutInflater f11723Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0OO<ListenerTag> f11724Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f11725Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f11726Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO00o f11727OoooO00;

    public class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            ((EmptyFriendView) AbsViewRelativeLayout.this).onClickNotDouble(view);
        }
    }

    public AbsViewRelativeLayout(Context context) {
        super(context);
        this.f11727OoooO00 = null;
        OooO0O0(context);
    }

    public final View OooO00o(@IdRes int i) {
        return p148o00Oo0O.o00Oo0.OooO00o(getConvertView(), i, getNoDoubleClickListener());
    }

    public final void OooO0O0(Context context) {
        this.f11726Oooo0oo = context;
        this.f11723Oooo = LayoutInflater.from(context);
        setConvertView(getConvertViewId());
        OooO0Oo();
        OooO0OO();
    }

    public abstract void OooO0OO();

    public abstract void OooO0Oo();

    public Context getContextBase() {
        return this.f11726Oooo0oo;
    }

    public final View getConvertView() {
        return this.f11725Oooo0oO;
    }

    public abstract int getConvertViewId();

    public LayoutInflater getInflater() {
        return this.f11723Oooo;
    }

    public OooO0OO<ListenerTag> getListener() {
        return this.f11724Oooo0o;
    }

    public o00Oo0 getNoDoubleClickListener() {
        if (this.f11727OoooO00 == null) {
            this.f11727OoooO00 = new OooO00o();
        }
        return this.f11727OoooO00;
    }

    public final void setConvertView(@LayoutRes int i) {
        this.f11725Oooo0oO = this.f11723Oooo.inflate(i, (ViewGroup) null);
    }

    public void setListener(OooO0OO<ListenerTag> oooO0OO) {
        this.f11724Oooo0o = oooO0OO;
    }

    public AbsViewRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11727OoooO00 = null;
        OooO0O0(context);
    }

    public AbsViewRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11727OoooO00 = null;
        OooO0O0(context);
    }
}
