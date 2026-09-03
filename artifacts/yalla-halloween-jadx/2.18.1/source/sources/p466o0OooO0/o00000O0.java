package p466o0OooO0;

import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.google.android.exoplayer2.OooO0OO;
import com.google.android.exoplayer2.OooOO0;
import com.google.android.exoplayer2.Player;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.fragment.MainMomentsTopicRecommendFragment;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import p186o00o00Oo.o0ooOOo;
import p361o0OOOoOo.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements OooO0OO.OooO0O0, Continuation, ApiCountryUtils.OnLoadFinishListener, o0ooOOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f40487OooO0Oo;

    public /* synthetic */ o00000O0(Object obj) {
        this.f40487OooO0Oo = obj;
    }

    @Override // com.google.android.exoplayer2.OooO0OO.OooO0O0
    public final void OooO0OO(Player.OooO00o oooO00o) {
        oooO00o.OooOOo0(((OooOO0.OooO0O0) this.f40487OooO0Oo).f13238Oooo0o.f40559OooO0Oo);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MainMomentsTopicRecommendFragment.m362initView$lambda3((MainMomentsTopicRecommendFragment) this.f40487OooO0Oo);
    }

    @Override // com.app.base.app.appConfig.apiDataModela.ApiCountryUtils.OnLoadFinishListener
    public final void onLoadFinish(ArrayList arrayList) {
        UserCountrySelectActivity userCountrySelectActivity = (UserCountrySelectActivity) this.f40487OooO0Oo;
        userCountrySelectActivity.f23423Ooooo00.addAll(arrayList);
        userCountrySelectActivity.f23421OoooOoO.setNewData(userCountrySelectActivity.f23423Ooooo00);
        userCountrySelectActivity.OooOoOO();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f40487OooO0Oo;
        ExecutorService executorService = o000Oo0.f38478OooO00o;
        countDownLatch.countDown();
        return null;
    }
}
