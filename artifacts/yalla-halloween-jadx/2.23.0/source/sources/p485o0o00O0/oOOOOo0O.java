package p485o0o00O0;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.youth.banner.listener.OnBannerListener;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;
import p539o0o0OoOO.r1;
import p539o0o0OoOO.s1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOOOOo0O implements BaseQuickAdapter.OooO0o, OnBannerListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48174OooO0Oo;

    public /* synthetic */ oOOOOo0O(Object obj) {
        this.f48174OooO0Oo = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public final void OnBannerClick(Object obj, int i) {
        r1 this$0 = (r1) this.f48174OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s1 onLogin = new s1(this$0, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicSearchActivity context = (TopicSearchActivity) this.f48174OooO0Oo;
        int i2 = TopicSearchActivity.f26398OooOoo0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        TopicInfoModel topicInfoModel = context.OooOoO().f10111OooOOoo.get(i);
        Intrinsics.checkNotNullExpressionValue(topicInfoModel, "baseAdapter.data[position]");
        TopicInfoModel topicInfo = topicInfoModel;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
        intent.putExtra("topic", topicInfo);
        context.startActivity(intent);
    }
}
