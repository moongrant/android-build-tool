package p140o00OOOoO;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0o {
    @Subscribe(threadMode = ThreadMode.POSTING)
    void onEvent(OooO0OO oooO0OO);

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onEventMainThread(OooO0OO oooO0OO);
}
