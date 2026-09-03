package p650o0ooo;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class d4 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f58190OooO00o;

    public d4(TreasureBoxDialog treasureBoxDialog) {
        this.f58190OooO00o = treasureBoxDialog;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f58190OooO00o.OooOO0(i);
    }
}
