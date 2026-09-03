package p189o00o00oO;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.app.base.view.tips.GiftGuideView;
import com.app.base.view.tips.OooO00o;
import com.weieyu.yalla.R;
import java.util.ArrayList;
import java.util.Objects;
import p168o00Ooo0.oo000o;
import p206o00o0o0o.o000OO0O;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ View f33048Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO00o f33049Oooo0oO;

    public o0O0O00(OooO00o oooO00o, View view) {
        this.f33049Oooo0oO = oooO00o;
        this.f33048Oooo0o = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Rect rect;
        OooO00o oooO00o = this.f33049Oooo0oO;
        View view = this.f33048Oooo0o;
        Objects.requireNonNull(oooO00o);
        boolean zOooO0o0 = oo000o.OooO0o0();
        View viewFindViewById = view.findViewById(R.id.viewPager);
        View viewFindViewById2 = view.findViewById(R.id.layoutUser);
        View viewFindViewById3 = view.findViewById(R.id.tvSend);
        View viewFindViewById4 = view.findViewById(R.id.giftNum);
        int[] iArr = new int[2];
        oooO00o.f12239OoooO0.getLocationOnScreen(iArr);
        int iOooO0OO = o000OOo0.OooO0OO();
        ArrayList arrayList = new ArrayList();
        int[] iArr2 = new int[2];
        viewFindViewById.getLocationOnScreen(iArr2);
        iArr2[1] = iArr2[1] - (iArr[1] + iOooO0OO);
        int measuredWidth = viewFindViewById.getMeasuredWidth() / 4;
        int measuredHeight = (viewFindViewById.getMeasuredHeight() - o000OO00.OooO00o(32)) / 2;
        if (zOooO0o0) {
            int iOooO0oo = o000OO0O.OooO0oo() - iArr2[0];
            rect = new Rect(iOooO0oo - measuredWidth, iArr2[1], iOooO0oo, iArr2[1] + measuredHeight);
        } else {
            rect = new Rect(iArr2[0], iArr2[1], iArr2[0] + measuredWidth, iArr2[1] + measuredHeight);
        }
        viewFindViewById2.getLocationOnScreen(iArr2);
        iArr2[1] = iArr2[1] - iOooO0OO;
        Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + viewFindViewById2.getMeasuredWidth(), iArr2[1] + viewFindViewById2.getMeasuredHeight());
        if (zOooO0o0) {
            viewFindViewById3.getLocationOnScreen(iArr2);
        } else {
            viewFindViewById4.getLocationOnScreen(iArr2);
        }
        iArr2[1] = iArr2[1] - iOooO0OO;
        Rect rect3 = new Rect(iArr2[0], iArr2[1], iArr2[0] + viewFindViewById3.getMeasuredWidth() + viewFindViewById4.getMeasuredWidth(), iArr2[1] + viewFindViewById4.getMeasuredHeight());
        arrayList.add(rect);
        arrayList.add(rect2);
        arrayList.add(rect3);
        oooO00o.f12239OoooO0.setHollowAdapter(new GiftGuideView.OooO00o(arrayList));
        this.f33048Oooo0o.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
