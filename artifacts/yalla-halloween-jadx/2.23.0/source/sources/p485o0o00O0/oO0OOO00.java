package p485o0o00O0;

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
import p156o00OoOO.OooOo;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 extends Lambda implements Function2<Integer, OooOo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f48120OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f48121OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOO00(TopicDetailActivity topicDetailActivity, TopicInfoModel topicInfoModel) {
        super(2);
        this.f48120OooO0Oo = topicDetailActivity;
        this.f48121OooO0o0 = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, OooOo oooOo) {
        TopicInfoModel topicInfoModel;
        num.intValue();
        OooOo item = oooOo;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f38216OooO0Oo;
        if (!Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.share_with_friends))) {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Report))) {
                oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(3, this.f48121OooO0o0.getId(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            }
            return Unit.INSTANCE;
        }
        int i = TopicDetailActivity.f26305OooOoOO;
        TopicDetailActivity topicDetailActivity = this.f48120OooO0Oo;
        Response response = (Response) topicDetailActivity.OooOoo0().getTopicDetailLiveData().getValue();
        if (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) {
            return null;
        }
        o0OO000.OooO00o("103037");
        ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Topic);
        shareToFriendModel.setTopicInfoModel(topicInfoModel);
        int i2 = ShareToFriendsActivity.f25730Oooo00o;
        ShareToFriendsActivity.OooO00o.OooO00o(topicDetailActivity, shareToFriendModel);
        return Unit.INSTANCE;
    }
}
