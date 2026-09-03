package com.yalla.yalla.ui.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import o0OO0o.OooOOO0;
import p389o0OOoooO.o00O0OO;
import p389o0OOoooO.oo0o0O0;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes5.dex */
public class XRefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public o000oOoO f31258o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public o000oOoO f31259o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public XRefreshFooterView f31260o00000o0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public OooO0OO f31261o0000Ooo;

    public class OooO00o implements o00O0OO {
        public OooO00o() {
        }

        @Override // p389o0OOoooO.o00O0OO
        public final void OooO00o(@NonNull SmartRefreshLayout smartRefreshLayout) {
            o000oOoO o000oooo2 = XRefreshLayout.this.f31258o00000OO;
            if (o000oooo2 != null) {
                o000oooo2.OooO0O0();
            }
        }
    }

    public class OooO0O0 implements oo0o0O0 {
        public OooO0O0() {
        }

        @Override // p389o0OOoooO.oo0o0O0
        public final void OooO00o(@NonNull OooOOO0 oooOOO0) {
            o000oOoO o000oooo2 = XRefreshLayout.this.f31259o00000Oo;
            if (o000oooo2 != null) {
                o000oooo2.OooO0O0();
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
        this.f21370o00Oo0 = 1.0f;
        this.f21350OoooOo0 = new OooO00o();
        XRefreshFooterView xRefreshFooterView = new XRefreshFooterView(getContext());
        this.f31260o00000o0 = xRefreshFooterView;
        OooOo(xRefreshFooterView);
        OooOo0(3.0f);
        this.f21371o00Ooo = 1.0f;
        this.f21351OoooOoO = new OooO0O0();
        this.f21331OooOooo = this.f21331OooOooo || !this.f21349OoooOOo;
        OooOo00(false);
        this.f21343OoooO = true;
        this.f21347OoooOO0 = true;
        this.f21304OooO = 500;
        this.f21332Oooo = true;
        this.f21339Oooo0o = true;
        this.f21340Oooo0o0 = true;
        this.f21341Oooo0oO = false;
        this.f21337Oooo0O0 = true;
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
        if (motionEvent.getAction() == 0 && (oooO0OO = this.f31261o0000Ooo) != null) {
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
        XRefreshFooterView xRefreshFooterView = this.f31260o00000o0;
        if (xRefreshFooterView != null) {
            xRefreshFooterView.setNoMoreText(i);
        }
    }

    public void setNoMoreDataTextColor(int i) {
        XRefreshFooterView xRefreshFooterView = this.f31260o00000o0;
        if (xRefreshFooterView != null) {
            xRefreshFooterView.setNoMoreTextColor(i);
        }
    }

    @Deprecated
    public void setOnLoadMoreListener(o000oOoO o000oooo2) {
        this.f31259o00000Oo = o000oooo2;
    }

    @Deprecated
    public void setOnRefreshListener(o000oOoO o000oooo2) {
        this.f31258o00000OO = o000oooo2;
    }

    public void setOnTouchDownListener(OooO0OO oooO0OO) {
        this.f31261o0000Ooo = oooO0OO;
    }

    public XRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOoo0();
    }
}
