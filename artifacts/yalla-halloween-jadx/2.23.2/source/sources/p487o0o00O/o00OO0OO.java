package p487o0o00O;

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
import p414o0Oo0oO.oO0O0OoO;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f48819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Button f48820OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48821OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f48822OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f48823OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(int i, TaskActivity taskActivity, Button button, int i2, String str) {
        super(1);
        this.f48819OooO0Oo = i;
        this.f48821OooO0o0 = taskActivity;
        this.f48820OooO0o = button;
        this.f48822OooO0oO = i2;
        this.f48823OooO0oo = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long l2 = l;
        try {
            if (this.f48819OooO0Oo == 36) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(l2);
            } else {
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0Oo().postValue(l2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        TaskActivity taskActivity = this.f48821OooO0o0;
        taskActivity.f25093OooOoo--;
        ((oO0O0OoO) o00Ooo.f46414OooO0oo.getValue()).OooOO0O(taskActivity.f25093OooOoo > 0);
        SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boolean.valueOf(taskActivity.f25093OooOoo > 0));
        Button button = this.f48820OooO0o;
        button.setEnabled(false);
        button.setText(taskActivity.getString(o000000.Done));
        button.setTextColor(o0000.OooO00o(o0OOO0o.white));
        if (this.f48822OooO0oO == 1) {
            taskActivity.OooOo().f44332OooO0O0.setImageResource(o0Oo0oo.icon_coin_main_slide);
            taskActivity.OooOo().f44336OooO0o0.setTextColor(o0000.OooO00o(o0OOO0o.color_coin));
        } else {
            taskActivity.OooOo().f44332OooO0O0.setImageResource(o0Oo0oo.icon_crystal_task_item_min);
            taskActivity.OooOo().f44336OooO0o0.setTextColor(o0000.OooO00o(o0OOO0o.color_crystal));
        }
        taskActivity.OooOo().f44336OooO0o0.setText(this.f48823OooO0oo);
        int[] iArr = {0, 0};
        button.getLocationOnScreen(iArr);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1200L);
        iArr[1] = iArr[1] - o0000O0O.OooO0Oo();
        if (OooOo00.OooO0o0()) {
            iArr[0] = o0000O0.OooO00o(66) + (-o000O000.f46650OooO00o);
        } else {
            iArr[0] = o0000O0.OooO00o(12) + iArr[0];
        }
        float f = iArr[0];
        int i = iArr[1];
        TranslateAnimation translateAnimation = new TranslateAnimation(0, f, 0, f, 0, i, 0, i - 70);
        translateAnimation.setDuration(1200L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new o0oOO(taskActivity));
        taskActivity.OooOo().f44333OooO0OO.startAnimation(animationSet);
        taskActivity.OooOo().f44333OooO0OO.setVisibility(0);
        return Unit.INSTANCE;
    }
}
