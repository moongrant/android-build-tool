package p499o0o00o0O;

import android.graphics.drawable.TransitionDrawable;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import p464o0Oooo.o000000O;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WalletActivity f49415OooO0Oo;

    public o0oOO(WalletActivity walletActivity) {
        this.f49415OooO0Oo = walletActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        int i2 = WalletActivity.f27054OooOoOO;
        WalletActivity walletActivity = this.f49415OooO0Oo;
        int currentItem = walletActivity.OooOo().f58687OooO0oo.getCurrentItem();
        double d = currentItem;
        if (walletActivity.f27060OooOo0o == d) {
            return;
        }
        if (currentItem == 0) {
            TextView textView = walletActivity.OooOo().f58686OooO0oO;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Object value = o000000O.OooO0O0().getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            textView.setText(OooOOOO.OooO0Oo(sb.toString()));
            ((TransitionDrawable) walletActivity.f27056OooOo.getValue()).reverseTransition(300);
            ((TransitionDrawable) walletActivity.f27062OooOoO0.getValue()).reverseTransition(300);
        } else if (currentItem == 1) {
            walletActivity.OooOoO0();
        }
        walletActivity.f27060OooOo0o = d;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}
