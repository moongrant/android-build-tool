package p519o0o0O0oO;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f52252OooO00o;

    public f4(TreasureBoxDialog treasureBoxDialog) {
        this.f52252OooO00o = treasureBoxDialog;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.f52252OooO00o.OooOO0(i);
    }
}
