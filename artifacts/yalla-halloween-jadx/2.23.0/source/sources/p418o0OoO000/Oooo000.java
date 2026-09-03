package p418o0OoO000;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public interface Oooo000 {
    @Subscribe(threadMode = ThreadMode.POSTING)
    void onEvent(OooOo oooOo);

    @Subscribe(threadMode = ThreadMode.MAIN)
    void onEventMainThread(OooOo oooOo);
}
