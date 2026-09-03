package p579o0oOoOOo;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f45957OooO00o;

    public g1(TreasureBoxDialog treasureBoxDialog) {
        this.f45957OooO00o = treasureBoxDialog;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f45957OooO00o.OooOO0O(i);
    }
}
