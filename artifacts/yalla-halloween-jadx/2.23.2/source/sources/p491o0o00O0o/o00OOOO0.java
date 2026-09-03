package p491o0o00O0o;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.PhoneCountryCodeSelectActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import com.yalla.yalla.ui.fragment.room.RoomInfoMemberListFragment;
import kotlin.jvm.internal.Intrinsics;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00OOOO0 implements BaseQuickAdapter.OooO0O0, BaseQuickAdapter.OooO0o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f48993OooO0Oo;

    public /* synthetic */ o00OOOO0(Object obj) {
        this.f48993OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        PhoneCountryCodeSelectActivity this$0 = (PhoneCountryCodeSelectActivity) this.f48993OooO0Oo;
        int i2 = PhoneCountryCodeSelectActivity.f24796OooOoO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent();
        oo00oO oo00oo = this$0.f24798OooOo;
        if (oo00oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo00oo = null;
        }
        intent.putExtra("DATA", (Parcelable) oo00oo.f13189OooOOoo.get(i));
        this$0.setResult(-1, intent);
        this$0.finish();
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        RoomInfoMemberListFragment.initData$lambda$20((RoomInfoMemberListFragment) this.f48993OooO0Oo);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        TopicSearchActivity context = (TopicSearchActivity) this.f48993OooO0Oo;
        int i2 = TopicSearchActivity.f25947OooOoo0;
        Intrinsics.checkNotNullParameter(context, "this$0");
        TopicInfoModel topicInfoModel = context.OooOoO().f13189OooOOoo.get(i);
        Intrinsics.checkNotNullExpressionValue(topicInfoModel, "get(...)");
        TopicInfoModel topicInfo = topicInfoModel;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(topicInfo, "topicInfo");
        Intent intent = new Intent(context, (Class<?>) TopicDetailActivity.class);
        intent.putExtra("topic", topicInfo);
        context.startActivity(intent);
    }
}
