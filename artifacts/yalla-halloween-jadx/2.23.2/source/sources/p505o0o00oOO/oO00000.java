package p505o0o00oOO;

import android.graphics.drawable.TransitionDrawable;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import p475o0Ooooo0.o0O00oO0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WalletActivity f50377OooO0Oo;

    public oO00000(WalletActivity walletActivity) {
        this.f50377OooO0Oo = walletActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        int i2 = WalletActivity.f26588OooOoOO;
        WalletActivity walletActivity = this.f50377OooO0Oo;
        int currentItem = walletActivity.OooOo().f43853OooO0oo.getCurrentItem();
        double d = currentItem;
        if (walletActivity.f26594OooOo0o == d) {
            return;
        }
        if (currentItem == 0) {
            TextView textView = walletActivity.OooOo().f43852OooO0oO;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Object value = o0O00oO0.OooO0O0().getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            textView.setText(o0O0O0Oo.OooO0Oo(sb.toString()));
            ((TransitionDrawable) walletActivity.f26590OooOo.getValue()).reverseTransition(300);
            ((TransitionDrawable) walletActivity.f26596OooOoO0.getValue()).reverseTransition(300);
        } else if (currentItem == 1) {
            walletActivity.OooOoO0();
        }
        walletActivity.f26594OooOo0o = d;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}
