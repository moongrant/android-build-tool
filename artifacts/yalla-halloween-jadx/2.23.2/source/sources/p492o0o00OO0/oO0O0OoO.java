package p492o0o00OO0;

import com.code.android.util.o0000;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p202o00o0o.o00O0O;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0OoO extends Lambda implements Function2<Integer, o00O0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f49438OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f49439OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0OoO(TopicDetailActivity topicDetailActivity, TopicInfoModel topicInfoModel) {
        super(2);
        this.f49438OooO0Oo = topicDetailActivity;
        this.f49439OooO0o0 = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o00O0O o00o0o2) {
        TopicInfoModel topicInfoModel;
        num.intValue();
        o00O0O item = o00o0o2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f39340OooO0Oo;
        if (!Intrinsics.areEqual(str, o0000.OooO0OO(o000000.share_with_friends))) {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Report))) {
                o00O00.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(3, this.f49439OooO0o0.getId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            }
            return Unit.INSTANCE;
        }
        int i = TopicDetailActivity.f25854OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f49438OooO0Oo;
        Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
        if (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) {
            return null;
        }
        OooO00o.OooO0O0("103037");
        ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Topic);
        shareToFriendModel.setTopicInfoModel(topicInfoModel);
        int i2 = ShareToFriendsActivity.f25275Oooo00o;
        ShareToFriendsActivity.OooO00o.OooO00o(topicDetailActivity, shareToFriendModel);
        return Unit.INSTANCE;
    }
}
