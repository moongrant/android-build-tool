package com.app.base.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import p186o00o00Oo.o0ooOOo;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p417o0Oo0oOo.oO00OOO;

/* JADX INFO: loaded from: classes.dex */
public class XRefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: o000O0O0, reason: collision with root package name */
    public XRefreshFooterView f12221o000O0O0;

    /* JADX INFO: renamed from: o000O0Oo, reason: collision with root package name */
    public o0ooOOo f12222o000O0Oo;

    /* JADX INFO: renamed from: o000O0o0, reason: collision with root package name */
    public OooO0OO f12223o000O0o0;

    /* JADX INFO: renamed from: o000OO0O, reason: collision with root package name */
    public o0ooOOo f12224o000OO0O;

    public class OooO00o implements oO00OOO {
        public OooO00o() {
        }

        @Override // p417o0Oo0oOo.oO00OOO
        public final void OooO0O0(@NonNull oO000Oo oo000oo) {
            o0ooOOo o0ooooo2 = XRefreshLayout.this.f12222o000O0Oo;
            if (o0ooooo2 != null) {
                o0ooooo2.OooO0oO();
            }
        }
    }

    public class OooO0O0 implements oO00OO0O {
        public OooO0O0() {
        }

        @Override // p417o0Oo0oOo.oO00OO0O
        public final void OooO0OO(@NonNull oO000Oo oo000oo) {
            o0ooOOo o0ooooo2 = XRefreshLayout.this.f12224o000OO0O;
            if (o0ooooo2 != null) {
                o0ooooo2.OooO0oO();
            }
        }
    }

    public interface OooO0OO {
        void OooO0OO();
    }

    public XRefreshLayout(Context context) {
        super(context);
        Oooo0();
    }

    public final void Oooo0() {
        setTag("close egg");
        Oooo000(new XRefershHeaderView(getContext()));
        OooOoo(2.5f);
        this.f19514o0000OO = 1.0f;
        this.f19505o00000OO = new OooO00o();
        XRefreshFooterView xRefreshFooterView = new XRefreshFooterView(getContext());
        this.f12221o000O0O0 = xRefreshFooterView;
        OooOooo(xRefreshFooterView);
        OooOoo0(3.0f);
        this.f19516o0000OOO = 1.0f;
        this.f19506o00000Oo = new OooO0O0();
        this.f19542o00Oo0 = this.f19542o00Oo0 || !this.f19499o00000;
        OooOoOO(false);
        this.f19537o000OOo = true;
        this.f19500o000000 = true;
        this.f19479OoooO0 = 500;
        this.f19551o0Oo0oo = true;
        this.f19554o0ooOOo = true;
        this.f19553o0ooOO0 = true;
        this.f19555o0ooOoO = false;
        this.f19546o00oO0o = true;
    }

    public final boolean Oooo00o() {
        if (getState() == RefreshState.None) {
            return OooO0oo();
        }
        return false;
    }

    public final void Oooo0O0(boolean z) {
        if (z) {
            OooOo00(false);
        } else {
            OooOOo0(false);
        }
    }

    public final void Oooo0OO(boolean z, boolean z2) {
        if (z) {
            OooOo00(z2);
        }
    }

    public final void Oooo0o0(boolean z, boolean z2, boolean z3) {
        if (z) {
            OooOo00(z2);
        } else {
            OooOOo0(z2);
        }
        if (z && z2 && !z3) {
            OooOoOO(true);
        }
        OooOooO(z3);
    }

    @Override // com.scwang.smartrefresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OooO0OO oooO0OO;
        if (motionEvent.getAction() == 0 && (oooO0OO = this.f12223o000O0o0) != null) {
            oooO0OO.OooO0OO();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Deprecated
    public void setLoadComplete(boolean z) {
        if (z) {
            OooOo00(false);
        } else {
            OooOOo0(false);
        }
    }

    public void setLoadFail(boolean z) {
        if (z) {
            OooOo00(false);
        }
    }

    public void setLoadSuccess(boolean z) {
        if (z) {
            OooOo00(true);
        }
    }

    public void setNoMoreDataText(int i) {
        XRefreshFooterView xRefreshFooterView = this.f12221o000O0O0;
        if (xRefreshFooterView != null) {
            xRefreshFooterView.setNoMoreText(i);
        }
    }

    public void setNoMoreDataTextColor(int i) {
        XRefreshFooterView xRefreshFooterView = this.f12221o000O0O0;
        if (xRefreshFooterView != null) {
            xRefreshFooterView.setNoMoreTextColor(i);
        }
    }

    @Deprecated
    public void setOnLoadMoreListener(o0ooOOo o0ooooo2) {
        this.f12224o000OO0O = o0ooooo2;
    }

    @Deprecated
    public void setOnRefreshListener(o0ooOOo o0ooooo2) {
        this.f12222o000O0Oo = o0ooooo2;
    }

    public void setOnTouchDownListener(OooO0OO oooO0OO) {
        this.f12223o000O0o0 = oooO0OO;
    }

    public XRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Oooo0();
    }
}
