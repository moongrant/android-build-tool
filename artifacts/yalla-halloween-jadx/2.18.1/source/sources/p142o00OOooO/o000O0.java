package p142o00OOooO;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.app.base.fragment.MomentListFeaturedFragment;
import com.app.base.view.GifFaceView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.MessageListFragment;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.o0OOO0o;
import p186o00o00Oo.o0ooOOo;
import p254o00ooO0O.o00000O;
import p498o0o00Oo0.OooOOO;
import p538o0o0Oo0.oO0000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0 implements o0ooOOo, BaseQuickAdapter.OooOOO, BaseQuickAdapter.OooOOO0, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f31940OooO0Oo;

    public /* synthetic */ o000O0(Object obj) {
        this.f31940OooO0Oo = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO
    public final void OooO00o(View view, int i) {
        GifFaceView this$0 = (GifFaceView) this.f31940OooO0Oo;
        int i2 = GifFaceView.f12026OoooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f12031OoooO.clear();
        int childCount = this$0.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childView = this$0.getChildAt(i3);
            ?? r3 = this$0.f12031OoooO;
            Intrinsics.checkNotNullExpressionValue(childView, "childView");
            r3.add(childView);
        }
        this$0.f12032OoooO0 = false;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        MessageListFragment.m384initView$lambda1((MessageListFragment) this.f31940OooO0Oo, baseQuickAdapter, view, i);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        MomentListFeaturedFragment.m41initView$lambda8((MomentListFeaturedFragment) this.f31940OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicSearchActivity context = (TopicSearchActivity) this.f31940OooO0Oo;
        TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
        Intrinsics.checkNotNullParameter(context, "this$0");
        if (context.OooOoo().getData().get(i).getIsJoin() == 1) {
            TopicInfoModel topicInfoModel = context.OooOoo().getData().get(i);
            Intrinsics.checkNotNullExpressionValue(topicInfoModel, "baseAdapter.data[position]");
            TopicInfoModel topicInfo = topicInfoModel;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
            Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
            intent.putExtra("topic", topicInfo);
            context.startActivity(intent);
            return;
        }
        oO0000Oo onLogin = new oO0000Oo(context, i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }
}
