package p485o0o00O0;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.activity.moment.TopicCreateActivity;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Observer<Response<Boolean>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicCreateActivity f47791OooO0Oo;

    public o(TopicCreateActivity topicCreateActivity) {
        this.f47791OooO0Oo = topicCreateActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Response<Boolean> response) {
        if (response.getIsSuccess()) {
            int i = TopicReviewActivity.f26396OooOo00;
            TopicCreateActivity context = this.f47791OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) TopicReviewActivity.class));
            context.finish();
        }
    }
}
