package p538o0o0Oo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p251o00ooO.o000O00;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o000 extends Lambda implements Function2<Integer, o000O00, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicDetailActivity f44018Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f44019Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(TopicDetailActivity topicDetailActivity, TopicInfoModel topicInfoModel) {
        super(2);
        this.f44018Oooo0o = topicDetailActivity;
        this.f44019Oooo0oO = topicInfoModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, o000O00 o000o01) {
        TopicInfoModel topicInfoModel;
        num.intValue();
        o000O00 item = o000o01;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f34212Oooo0o;
        if (!Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.share_with_friends))) {
            if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.report))) {
                o000O.OooO00o(u5.f47570OooO00o, u5.OooO0o(3, this.f44019Oooo0oO.getId(), (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
            }
            return Unit.INSTANCE;
        }
        TopicDetailActivity topicDetailActivity = this.f44018Oooo0o;
        TopicDetailActivity.OooO00o oooO00o = TopicDetailActivity.f22567o0OoOo0;
        Response response = (Response) topicDetailActivity.Oooo000().getTopicDetailLiveData().getValue();
        if (response == null || (topicInfoModel = (TopicInfoModel) response.getData()) == null) {
            return null;
        }
        TopicDetailActivity topicDetailActivity2 = this.f44018Oooo0o;
        o0O00000.OooO0OO("Moments_topics_share");
        ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareType.Topic);
        shareToFriendModel.setTopicInfoModel(topicInfoModel);
        ShareToFriendsActivity.f22209o00o0O.OooO00o(topicDetailActivity2, shareToFriendModel);
        return Unit.INSTANCE;
    }
}
