package p486o0o00O00;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000;
import p417o0OoO0.o0ooOOo;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Button f48320OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48321OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f48322OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f48323OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(int i, TaskActivity taskActivity, Button button, int i2, String str) {
        super(1);
        this.f48319OooO0Oo = i;
        this.f48321OooO0o0 = taskActivity;
        this.f48320OooO0o = button;
        this.f48322OooO0oO = i2;
        this.f48323OooO0oo = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long l2 = l;
        try {
            if (this.f48319OooO0Oo == 36) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0O0().postValue(l2);
            } else {
                o000000O o000000o3 = o000000O.f46674OooO00o;
                o000000O.OooO0Oo().postValue(l2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TaskActivity taskActivity = this.f48321OooO0o0;
        taskActivity.f25547OooOoo--;
        ((o00000) o00Oo0.f45183OooO0oo.getValue()).OooOO0O(taskActivity.f25547OooOoo > 0);
        SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boolean.valueOf(taskActivity.f25547OooOoo > 0));
        Button button = this.f48320OooO0o;
        button.setEnabled(false);
        button.setText(taskActivity.getString(oO00OOo0.Done));
        button.setTextColor(o0000.OooO00o(oO00O0o.white));
        if (this.f48322OooO0oO == 1) {
            taskActivity.OooOo().f58638OooO0O0.setImageResource(oOo00OO0.icon_coin_main_slide);
            taskActivity.OooOo().f58642OooO0o0.setTextColor(o0000.OooO00o(oO00O0o.color_coin));
        } else {
            taskActivity.OooOo().f58638OooO0O0.setImageResource(oOo00OO0.icon_crystal_task_item_min);
            taskActivity.OooOo().f58642OooO0o0.setTextColor(o0000.OooO00o(oO00O0o.color_crystal));
        }
        taskActivity.OooOo().f58642OooO0o0.setText(this.f48323OooO0oo);
        int[] iArr = {0, 0};
        button.getLocationOnScreen(iArr);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1200L);
        iArr[1] = iArr[1] - o0000O0O.OooO0Oo();
        if (OooO.OooO0o0()) {
            iArr[0] = o0000O0.OooO00o(66) + (-o0ooOOo.f45529OooO00o);
        } else {
            iArr[0] = o0000O0.OooO00o(12) + iArr[0];
        }
        float f = iArr[0];
        int i = iArr[1];
        TranslateAnimation translateAnimation = new TranslateAnimation(0, f, 0, f, 0, i, 0, i - 70);
        translateAnimation.setDuration(1200L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new o0oOOo(taskActivity));
        taskActivity.OooOo().f58639OooO0OO.startAnimation(animationSet);
        taskActivity.OooOo().f58639OooO0OO.setVisibility(0);
        return Unit.INSTANCE;
    }
}
