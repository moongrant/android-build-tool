package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicEditDescActivity;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 implements Observer<Response<Boolean>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicEditDescActivity f48116OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f48117OooO0o0;

    public oO0OO00(TopicEditDescActivity topicEditDescActivity, String str) {
        this.f48116OooO0Oo = topicEditDescActivity;
        this.f48117OooO0o0 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<Boolean> response) {
        if (response.getIsSuccess()) {
            TopicEditDescActivity topicEditDescActivity = this.f48116OooO0Oo;
            long j = topicEditDescActivity.f26351OooOo0;
            String str = this.f48117OooO0o0;
            if (j != 0) {
                ((TopicEditVM) topicEditDescActivity.f26353OooOo0O.getValue()).changeTopicDesc(topicEditDescActivity.f26351OooOo0, str).observe(topicEditDescActivity, new oO0oO000(topicEditDescActivity, str));
            } else {
                LiveEventBus.get("TOPIC_DESC").post(str);
                topicEditDescActivity.finish();
            }
        }
    }
}
