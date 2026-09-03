package p501o0o00oO0;

import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.MomentListFeaturedFragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentAdapterTag.PostDetailCommentSonList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Recommend.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MomentAdapterTag.TopicDetailFragmentPopular.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MomentAdapterTag.TopicDetailFragmentLatest.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MomentAdapterTag.TopicDetailNotificationBar.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MomentAdapterTag.UserPostListActivity.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MomentAdapterTag.RoomInfoMomentsFragment.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MomentAdapterTag.MomentEditRecord.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MomentAdapterTag.PostDetailActivity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MomentAdapterTag.MomentMessageList.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MomentAdapterTag.MomentBanner.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MomentAdapterTag.PrivateChat.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MomentAdapterTag.Web.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
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
