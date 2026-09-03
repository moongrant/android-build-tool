package androidx.media3.session;

import android.content.Intent;
import android.view.View;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo000o implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9494OooO0Oo;

    public /* synthetic */ oo000o(Object obj) {
        this.f9494OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        JoinTopicListActivity context = (JoinTopicListActivity) this.f9494OooO0Oo;
        int i2 = JoinTopicListActivity.f25596OooOoO0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        if (context.OooOoO0().f13189OooOOoo.size() <= i || context.OooOoO0().OooOOO(i) == null) {
            return;
        }
        TopicInfoModel topicInfoModelOooOOO = context.OooOoO0().OooOOO(i);
        Intrinsics.checkNotNull(topicInfoModelOooOOO);
        TopicInfoModel topicInfo = topicInfoModelOooOOO;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
        intent.putExtra("topic", topicInfo);
        context.startActivity(intent);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onMediaMetadataChanged(((o00O00O) this.f9494OooO0Oo).f9390OooOoo);
    }
}
