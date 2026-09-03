package p358o0OOOo0o;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.app.base.view.imageMore.ImageMoreView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p360o0OOOoO0.OooO0O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000O0O implements OooO0O0, BaseQuickAdapter.OooOOOO, ImageMoreView.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f38383OooO0Oo;

    public /* synthetic */ o0000O0O(Object obj) {
        this.f38383OooO0Oo = obj;
    }

    @Override // com.app.base.view.imageMore.ImageMoreView.OooO0O0
    public final void OooO00o(int i) {
        MomentDetailView this$0 = (MomentDetailView) this.f38383OooO0Oo;
        int i2 = MomentDetailView.f24937OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MomentDetailModel momentDetailModel = this$0.f24941Oooo0oo;
        MomentDetailModel forward = momentDetailModel != null ? momentDetailModel.getForward() : null;
        if (forward == null || this$0.f24939Oooo0o.f50241OooO0Oo.OooO0Oo().isEmpty()) {
            return;
        }
        o0O00000.OooO0OO("Moments_picture");
        Function1<? super PostDetailHeaderViewTag, Unit> function1 = this$0.com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String;
        if (function1 != null) {
            function1.invoke(PostDetailHeaderViewTag.PostDetailHideKeyboard);
        }
        String str = "";
        if (forward.getIsWaterMark()) {
            str = forward.getUserIdx() + "";
        }
        Object obj = this$0.f24939Oooo0o.f50241OooO0Oo.OooO0Oo().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "binding.ivImageMoreViewF…tListUrl(false)[position]");
        this$0.OooOo0O((String) obj);
        ShowImageActivity.f22515o00o0O.OooO00o(this$0.getActivity(), i, this$0.f24939Oooo0o.f50241OooO0Oo.OooO0Oo(), this$0.f24939Oooo0o.f50241OooO0Oo.getAllImageViewList(), str, false);
    }

    @Override // p360o0OOOoO0.OooO0O0
    public final void OooO0O0(Bundle bundle) {
        ((o000OO) this.f38383OooO0Oo).f38388OooO00o.OooO0O0(bundle);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        JoinTopicListActivity context = (JoinTopicListActivity) this.f38383OooO0Oo;
        JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22299Oooooo0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        if (context.OooOooO().getData().size() <= i || context.OooOooO().getItem(i) == null) {
            return;
        }
        TopicInfoModel item = context.OooOooO().getItem(i);
        Intrinsics.checkNotNull(item);
        TopicInfoModel topicInfo = item;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
        intent.putExtra("topic", topicInfo);
        context.startActivity(intent);
    }
}
