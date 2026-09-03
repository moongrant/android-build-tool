package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicCreateNameActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0 implements Observer<Response<Boolean>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f48037OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicCreateNameActivity f48038OooO0o0;

    public oO000O0(TopicCreateNameActivity topicCreateNameActivity, String str) {
        this.f48037OooO0Oo = str;
        this.f48038OooO0o0 = topicCreateNameActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<Boolean> response) {
        if (response.getIsSuccess()) {
            LiveEventBus.get("TOPIC_NAME").post(this.f48037OooO0Oo);
            this.f48038OooO0o0.finish();
        }
    }
}
