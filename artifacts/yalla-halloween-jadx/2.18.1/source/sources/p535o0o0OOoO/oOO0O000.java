package p535o0o0OOoO;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000OOo0;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0O000 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f43692Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f43693Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f43694Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Button f43695Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ String f43696OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O000(int i, TaskActivity taskActivity, Button button, int i2, String str) {
        super(1);
        this.f43693Oooo0o = i;
        this.f43694Oooo0oO = taskActivity;
        this.f43695Oooo0oo = button;
        this.f43692Oooo = i2;
        this.f43696OoooO00 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long l2 = l;
        try {
            if (this.f43693Oooo0o == 36) {
                OooOOO.f41216OooO00o.OooO0OO().postValue(l2);
            } else {
                OooOOO.f41216OooO00o.OooO0o().postValue(l2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f43694Oooo0oO.f22072o00O0O--;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        OooOOO0.OooO0oo().OooOO0O(this.f43694Oooo0oO.f22072o00O0O > 0);
        SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boolean.valueOf(this.f43694Oooo0oO.f22072o00O0O > 0));
        this.f43695Oooo0oo.setEnabled(false);
        this.f43695Oooo0oo.setText(this.f43694Oooo0oO.getString(R.string.Done));
        this.f43695Oooo0oo.setTextColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.white));
        if (this.f43692Oooo == 1) {
            this.f43694Oooo0oO.OooOooO().f49073OooO0O0.setImageResource(R.drawable.icon_coin_main_slide);
            this.f43694Oooo0oO.OooOooO().f49077OooO0o0.setTextColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_coin));
        } else {
            this.f43694Oooo0oO.OooOooO().f49073OooO0O0.setImageResource(R.drawable.icon_crystal_task_item_min);
            this.f43694Oooo0oO.OooOooO().f49077OooO0o0.setTextColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_crystal));
        }
        this.f43694Oooo0oO.OooOooO().f49077OooO0o0.setText(this.f43696OoooO00);
        TaskActivity taskActivity = this.f43694Oooo0oO;
        Button button = this.f43695Oooo0oo;
        Objects.requireNonNull(taskActivity);
        int[] iArr = {0, 0};
        button.getLocationOnScreen(iArr);
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        alphaAnimation.setDuration(1200L);
        iArr[1] = iArr[1] - o000OOo0.OooO0OO();
        if (oo000o.OooO0o0()) {
            iArr[0] = OooOo00.OooO00o(66.0f) + (-o000O0Oo.f42985OooO00o);
        } else {
            iArr[0] = OooOo00.OooO00o(12.0f) + iArr[0];
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0, iArr[0], 0, iArr[0], 0, iArr[1], 0, iArr[1] - 70);
        translateAnimation.setDuration(1200L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setAnimationListener(new ooooO0O0(taskActivity));
        taskActivity.OooOooO().f49074OooO0OO.startAnimation(animationSet);
        taskActivity.OooOooO().f49074OooO0OO.setVisibility(0);
        return Unit.INSTANCE;
    }
}
