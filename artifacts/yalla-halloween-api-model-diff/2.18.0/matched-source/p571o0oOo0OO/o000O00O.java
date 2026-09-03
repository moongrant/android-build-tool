package p571o0oOo0OO;

import com.yalla.yalla.common.model.MomentLogSourcePage;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            iArr[MomentAdapterTag.MomentListFeaturedFragment.ordinal()] = 1;
            iArr[MomentAdapterTag.PostDetailCommentSonList.ordinal()] = 2;
            iArr[MomentAdapterTag.MomentListFollowingFragment_Top.ordinal()] = 3;
            iArr[MomentAdapterTag.MomentListFollowingFragment_Recommend.ordinal()] = 4;
            iArr[MomentAdapterTag.MomentListFollowingFragment.ordinal()] = 5;
            iArr[MomentAdapterTag.TopicDetailFragmentPopular.ordinal()] = 6;
            iArr[MomentAdapterTag.TopicDetailFragmentLatest.ordinal()] = 7;
            iArr[MomentAdapterTag.TopicDetailNotificationBar.ordinal()] = 8;
            iArr[MomentAdapterTag.UserPostListActivity.ordinal()] = 9;
            iArr[MomentAdapterTag.RoomInfoMomentsFragment.ordinal()] = 10;
            iArr[MomentAdapterTag.MomentEditRecord.ordinal()] = 11;
            iArr[MomentAdapterTag.PostDetailActivity.ordinal()] = 12;
            iArr[MomentAdapterTag.MomentMessageList.ordinal()] = 13;
            iArr[MomentAdapterTag.MomentBanner.ordinal()] = 14;
            iArr[MomentAdapterTag.PrivateChat.ordinal()] = 15;
            iArr[MomentAdapterTag.Web.ordinal()] = 16;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public static final MomentLogSourcePage OooO00o(@Nullable MomentAdapterTag momentAdapterTag) {
        MomentLogSourcePage momentLogSourcePage;
        if (momentAdapterTag == null) {
            return null;
        }
        switch (OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()]) {
            case 1:
                momentLogSourcePage = MomentLogSourcePage.moments_featured;
                break;
            case 2:
            case 8:
            case 11:
            default:
                return null;
            case 3:
                momentLogSourcePage = MomentLogSourcePage.moments_following_top;
                break;
            case 4:
                momentLogSourcePage = MomentLogSourcePage.moments_following_recommend;
                break;
            case 5:
                momentLogSourcePage = MomentLogSourcePage.moments_following;
                break;
            case 6:
                momentLogSourcePage = MomentLogSourcePage.moments_topic_poluar;
                break;
            case 7:
                momentLogSourcePage = MomentLogSourcePage.moments_topic_latest;
                break;
            case 9:
                momentLogSourcePage = MomentLogSourcePage.personal_moments;
                break;
            case 10:
                momentLogSourcePage = MomentLogSourcePage.room_moments;
                break;
            case 12:
                momentLogSourcePage = MomentLogSourcePage.moments_content;
                break;
        }
        return momentLogSourcePage;
    }
}
