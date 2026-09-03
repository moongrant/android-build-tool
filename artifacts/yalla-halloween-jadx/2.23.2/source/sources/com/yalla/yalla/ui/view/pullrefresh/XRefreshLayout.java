package com.yalla.yalla.ui.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o0OO0oO0.OooOOO0;
import p338o0OO0oOo.Oooo0;
import p338o0OO0oOo.Oooo000;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public class XRefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public o00O0O f30717o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public o00O0O f30718o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public XRefreshFooterView f30719o00000o0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public OooO0OO f30720o0000Ooo;

    public class OooO00o implements Oooo0 {
        public OooO00o() {
        }

        @Override // p338o0OO0oOo.Oooo0
        public final void OooO00o(@NonNull SmartRefreshLayout smartRefreshLayout) {
            o00O0O o00o0o2 = XRefreshLayout.this.f30717o00000OO;
            if (o00o0o2 != null) {
                o00o0o2.OooO0OO();
            }
        }
    }

    public class OooO0O0 implements Oooo000 {
        public OooO0O0() {
        }

        @Override // p338o0OO0oOo.Oooo000
        public final void OooO00o(@NonNull OooOOO0 oooOOO0) {
            o00O0O o00o0o2 = XRefreshLayout.this.f30718o00000Oo;
            if (o00o0o2 != null) {
                o00o0o2.OooO0OO();
            }
        }
    }

    public interface OooO0OO {
        void OooO00o();
    }

    public XRefreshLayout(Context context) {
        super(context);
        OooOoo0();
    }

    public final void OooOoOO() {
        if (getState() == RefreshState.None) {
            OooO0oo();
        }
    }

    public final void OooOoo(boolean z) {
        if (z) {
            OooOO0o(false);
        } else {
            OooOO0O(false);
        }
    }

    public final void OooOoo0() {
        setTag("close egg");
        OooOoO0(new XRefershHeaderView(getContext()));
        OooOo0O(2.5f);
        this.f20897o00Oo0 = 1.0f;
        this.f20877OoooOo0 = new OooO00o();
        XRefreshFooterView xRefreshFooterView = new XRefreshFooterView(getContext());
        this.f30719o00000o0 = xRefreshFooterView;
        OooOo(xRefreshFooterView);
        OooOo0(3.0f);
        this.f20898o00Ooo = 1.0f;
        this.f20878OoooOoO = new OooO0O0();
        this.f20858OooOooo = this.f20858OooOooo || !this.f20876OoooOOo;
        OooOo00(false);
        this.f20870OoooO = true;
        this.f20874OoooOO0 = true;
        this.f20831OooO = 500;
        this.f20859Oooo = true;
        this.f20866Oooo0o = true;
        this.f20867Oooo0o0 = true;
        this.f20868Oooo0oO = false;
        this.f20864Oooo0O0 = true;
    }

    public final void OooOooO(boolean z, boolean z2) {
        if (z) {
            OooOO0o(z2);
        }
    }

    public final void OooOooo(boolean z, boolean z2, boolean z3) {
        if (z) {
            OooOO0o(z2);
        } else {
            OooOO0O(z2);
        }
        if (z && z2 && !z3) {
            OooOo00(true);
        }
        OooOo0o(z3);
    }

    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OooO0OO oooO0OO;
        if (motionEvent.getAction() == 0 && (oooO0OO = this.f30720o0000Ooo) != null) {
            oooO0OO.OooO00o();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Deprecated
    public void setLoadComplete(boolean z) {
        if (z) {
            OooOO0o(false);
        } else {
            OooOO0O(false);
        }
    }

    public void setLoadFail(boolean z) {
        if (z) {
            OooOO0o(false);
        }
    }

    public void setLoadSuccess(boolean z) {
        if (z) {
            OooOO0o(true);
        }
    }

    public void setNoMoreDataText(int i) {
        XRefreshFooterView xRefreshFooterView = this.f30719o00000o0;
        if (xRefreshFooterView != null) {
            xRefreshFooterView.setNoMoreText(i);
        }
    }

    public void setNoMoreDataTextColor(int i) {
        XRefreshFooterView xRefreshFooterView = this.f30719o00000o0;
        if (xRefreshFooterView != null) {
            xRefreshFooterView.setNoMoreTextColor(i);
        }
    }

    @Deprecated
    public void setOnLoadMoreListener(o00O0O o00o0o2) {
        this.f30718o00000Oo = o00o0o2;
    }

    @Deprecated
    public void setOnRefreshListener(o00O0O o00o0o2) {
        this.f30717o00000OO = o00o0o2;
    }

    public void setOnTouchDownListener(OooO0OO oooO0OO) {
        this.f30720o0000Ooo = oooO0OO;
    }

    public XRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOoo0();
    }
}
