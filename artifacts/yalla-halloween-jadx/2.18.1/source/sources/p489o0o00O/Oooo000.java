package p489o0o00O;

import androidx.viewpager.widget.ViewPager;
import com.umeng.analytics.MobclickAgent;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String[] f40991OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f40992OooO0O0 = -1;

    public class OooO00o implements ViewPager.OooOOO0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String[] f40993Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ViewPager f40994Oooo0oO;

        public OooO00o(String[] strArr, ViewPager viewPager) {
            this.f40993Oooo0o = strArr;
            this.f40994Oooo0oO = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            Oooo000 oooo000 = Oooo000.this;
            String[] strArr = oooo000.f40991OooO00o;
            if (strArr == null || strArr.length == 0) {
                return;
            }
            String[] strArr2 = this.f40993Oooo0o;
            if (i > strArr2.length - 1) {
                return;
            }
            int i2 = oooo000.f40992OooO0O0;
            if (i2 == -1) {
                MobclickAgent.onPageStart(strArr2[i]);
                MobclickAgent.onResume(this.f40994Oooo0oO.getContext());
            } else {
                MobclickAgent.onPageEnd(strArr2[i2]);
                MobclickAgent.onPageStart(this.f40993Oooo0o[i]);
            }
            Oooo000.this.f40992OooO0O0 = i;
        }
    }

    public final void OooO00o(ViewPager viewPager, String... strArr) {
        if (viewPager == null || strArr.length < 2) {
            return;
        }
        this.f40991OooO00o = strArr;
        viewPager.OooO0O0(new OooO00o(strArr, viewPager));
        this.f40992OooO0O0 = viewPager.getCurrentItem();
    }

    public final void OooO0O0() {
        int i = this.f40992OooO0O0;
        if (i > -1) {
            MobclickAgent.onPageEnd(this.f40991OooO00o[i]);
        }
    }

    public final void OooO0OO() {
        int i = this.f40992OooO0O0;
        if (i > -1) {
            MobclickAgent.onPageStart(this.f40991OooO00o[i]);
        }
    }
}
