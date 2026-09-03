package p545o0oO0O00;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public interface OooOOOO {
    @Subscribe(threadMode = ThreadMode.POSTING)
    void onEvent(OooOOO oooOOO);

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onEventMainThread(OooOOO oooOOO);
}
