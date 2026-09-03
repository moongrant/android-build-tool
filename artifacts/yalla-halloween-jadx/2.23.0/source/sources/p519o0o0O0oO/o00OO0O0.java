package p519o0o0O0oO;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.http.ApiResult;
import p037OoooOo0.o000Oo0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 implements Observer<ApiResult<Long>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Button f52596OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52597OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f52598OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f52599OooO0oO;

    public o00OO0O0(Button button, o00O0OOO o00o0ooo2, int i, String str) {
        this.f52596OooO0Oo = button;
        this.f52598OooO0o0 = o00o0ooo2;
        this.f52597OooO0o = i;
        this.f52599OooO0oO = str;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<Long> apiResult) {
        StringBuilder sb;
        ApiResult<Long> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        o00O0OOO o00o0ooo2 = this.f52598OooO0o0;
        if (!zIsSuccess || apiResult2.getData() == null) {
            o00o0ooo2.OooOOOo();
            return;
        }
        Button button = this.f52596OooO0Oo;
        button.setEnabled(false);
        button.setText(o0000.OooO0OO(oO00OOo0.task_Done));
        button.setTextColor(o0000.OooO00o(oO00O0o.white));
        RecyclerView recyclerView = o00o0ooo2.OooOOOO().f57651OooO0O0;
        int i = this.f52597OooO0o;
        if (recyclerView.getChildAt(i) == null) {
            return;
        }
        TextView textView = (TextView) o00o0ooo2.OooOOOO().f57651OooO0O0.getChildAt(i).findViewById(oO00O0oO.tv_anim_num_dialog);
        boolean zOooO0o0 = OooO.OooO0o0();
        String str = this.f52599OooO0oO;
        if (zOooO0o0) {
            sb = o000Oo0.OooO0O0(str, "+");
        } else {
            sb = new StringBuilder("+");
            sb.append(str);
        }
        textView.setText(sb.toString());
        LinearLayout linearLayout = (LinearLayout) o00o0ooo2.OooOOOO().f57651OooO0O0.getChildAt(i).findViewById(oO00O0oO.ll_get_crystal_anim);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1200L);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -2.0f);
        translateAnimation.setDuration(1200L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new o00OO00O(linearLayout));
        linearLayout.startAnimation(animationSet);
        linearLayout.setVisibility(0);
        o00o0ooo2.f52567OooOO0o.loadTaskListData(1, true);
    }
}
