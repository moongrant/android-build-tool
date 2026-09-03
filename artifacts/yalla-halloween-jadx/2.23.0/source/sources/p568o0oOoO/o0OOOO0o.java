package p568o0oOoO;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.code.android.util.o0000O0O;
import com.yalla.yalla.ui.view.tips.GiftGuideView;
import com.yalla.yalla.ui.view.tips.OooO00o;
import java.util.ArrayList;
import p584o0oOooO0.oO00O0oO;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOOO0o implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ View f56215OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO00o f56216OooO0o0;

    public o0OOOO0o(OooO00o oooO00o, LinearLayout linearLayout) {
        this.f56216OooO0o0 = oooO00o;
        this.f56215OooO0Oo = linearLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Rect rect;
        OooO00o oooO00o = this.f56216OooO0o0;
        oooO00o.getClass();
        boolean zOooO0o0 = OooO.OooO0o0();
        int i = oO00O0oO.viewPager;
        View view = this.f56215OooO0Oo;
        View viewFindViewById = view.findViewById(i);
        View viewFindViewById2 = view.findViewById(oO00O0oO.layoutUser);
        View viewFindViewById3 = view.findViewById(oO00O0oO.tvSend);
        View viewFindViewById4 = view.findViewById(oO00O0oO.giftNum);
        int[] iArr = new int[2];
        oooO00o.f31372OooO.getLocationOnScreen(iArr);
        int iOooO0Oo = o0000O0O.OooO0Oo();
        ArrayList arrayList = new ArrayList();
        int[] iArr2 = new int[2];
        viewFindViewById.getLocationOnScreen(iArr2);
        iArr2[1] = iArr2[1] - (iArr[1] + iOooO0Oo);
        int measuredWidth = viewFindViewById.getMeasuredWidth() / 4;
        int measuredHeight = (viewFindViewById.getMeasuredHeight() - o0000O0.OooO00o(32)) / 2;
        if (zOooO0o0) {
            int iOooO0O0 = o0000O00.OooO0O0() - iArr2[0];
            int i2 = iArr2[1];
            rect = new Rect(iOooO0O0 - measuredWidth, i2, iOooO0O0, measuredHeight + i2);
        } else {
            int i3 = iArr2[0];
            int i4 = iArr2[1];
            rect = new Rect(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
        viewFindViewById2.getLocationOnScreen(iArr2);
        iArr2[1] = iArr2[1] - iOooO0Oo;
        int measuredWidth2 = viewFindViewById2.getMeasuredWidth();
        int measuredHeight2 = viewFindViewById2.getMeasuredHeight();
        int i5 = iArr2[0];
        int i6 = iArr2[1];
        Rect rect2 = new Rect(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (zOooO0o0) {
            viewFindViewById3.getLocationOnScreen(iArr2);
        } else {
            viewFindViewById4.getLocationOnScreen(iArr2);
        }
        iArr2[1] = iArr2[1] - iOooO0Oo;
        int measuredWidth3 = viewFindViewById3.getMeasuredWidth() + viewFindViewById4.getMeasuredWidth();
        int measuredHeight3 = viewFindViewById4.getMeasuredHeight();
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        Rect rect3 = new Rect(i7, i8, measuredWidth3 + i7, measuredHeight3 + i8);
        arrayList.add(rect);
        arrayList.add(rect2);
        arrayList.add(rect3);
        oooO00o.f31372OooO.setHollowAdapter(new GiftGuideView.OooO00o(arrayList));
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
