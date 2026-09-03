package p538o0o0Oo0;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailActivity f43946Oooo0o;

    public o00O0000(PostDetailActivity postDetailActivity) {
        this.f43946Oooo0o = postDetailActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        o00O00.OooO0O0("onPageSelected position = " + i);
        PostDetailActivity postDetailActivity = this.f43946Oooo0o;
        postDetailActivity.f22436o0OOO0o = i;
        if (i == 0) {
            postDetailActivity.Oooo000().initData();
        } else if (i == 1) {
            postDetailActivity.Oooo00o().initData();
        } else if (i == 2) {
            postDetailActivity.Oooo00O().initData();
        }
        this.f43946Oooo0o.OooOooO().f50590OooOOOo.setCurrentItem(i);
        if (this.f43946Oooo0o.f22434o00ooo.get(i) == this.f43946Oooo0o.Oooo00O()) {
            this.f43946Oooo0o.Oooo00O().showFragment(true);
        } else {
            this.f43946Oooo0o.Oooo00O().showFragment(false);
        }
    }
}
