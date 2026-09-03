package p563o0oOo0;

import android.content.Context;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends Lambda implements Function1<PostDetailHeaderViewTag, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000OO f44986Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f44987Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f44988Oooo0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostDetailHeaderViewTag.values().length];
            iArr[PostDetailHeaderViewTag.PostListToPostDetailForComments.ordinal()] = 1;
            iArr[PostDetailHeaderViewTag.PostListToPostDetail.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(o00000OO o00000oo2, MomentDetailView momentDetailView, MomentDetailModel momentDetailModel) {
        super(1);
        this.f44986Oooo0o = o00000oo2;
        this.f44987Oooo0oO = momentDetailView;
        this.f44988Oooo0oo = momentDetailModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PostDetailHeaderViewTag postDetailHeaderViewTag) {
        PostDetailHeaderViewTag tag = postDetailHeaderViewTag;
        Intrinsics.checkNotNullParameter(tag, "tag");
        MomentAdapterTag momentAdapterTag = this.f44986Oooo0o.f44990OooO00o;
        if (momentAdapterTag != MomentAdapterTag.MomentEditRecord) {
            if (momentAdapterTag == MomentAdapterTag.RoomInfoMomentsFragment) {
                o0O00000.OooO0OO("InRoom_roomMoments_details");
            }
            int i = OooO00o.$EnumSwitchMapping$0[tag.ordinal()];
            if (i == 1) {
                this.f44987Oooo0oO.OooOo0();
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                Context context = this.f44986Oooo0o.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                MomentDetailModel momentDetailModel = this.f44988Oooo0oo;
                MomentAdapterTag momentAdapterTag2 = this.f44986Oooo0o.f44990OooO00o;
                PostDetailActivity.f22417o0O0O00.OooO00o(context, momentDetailModel, (256 & 4) != 0 ? false : true, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag2 == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag2 == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag2, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
            } else if (i == 2) {
                this.f44987Oooo0oO.OooOo0();
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
                Context context2 = this.f44986Oooo0o.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                MomentDetailModel momentDetailModel2 = this.f44988Oooo0oo;
                MomentAdapterTag momentAdapterTag3 = this.f44986Oooo0o.f44990OooO00o;
                PostDetailActivity.f22417o0O0O00.OooO00o(context2, momentDetailModel2, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag3 == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag3 == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag3, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
            }
        }
        return Unit.INSTANCE;
    }
}
