package p198o00o0OoO;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O implements o00OO00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39074OooO0Oo;

    public /* synthetic */ o00O(Object obj) {
        this.f39074OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        JoinTopicListActivity context = (JoinTopicListActivity) this.f39074OooO0Oo;
        int i2 = JoinTopicListActivity.f26043OooOoO0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        if (context.OooOoO0().f10111OooOOoo.size() <= i || context.OooOoO0().OooOOO(i) == null) {
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

    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        o00OO00O o00oo00o = (o00OO00O) this.f39074OooO0Oo;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        o00oo00o.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + o00oo00o.f39094OooO0o0.getTime()).execute();
        return null;
    }
}
