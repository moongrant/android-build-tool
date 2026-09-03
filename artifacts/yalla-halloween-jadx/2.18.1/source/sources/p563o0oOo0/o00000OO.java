package p563o0oOo0;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p617o0oo0o.o000O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO extends OooO0OO<MomentDetailModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public MomentAdapterTag f44990OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f44991OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f44992OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public ArrayList<String> f44993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public EnterRoomParentPage f44994OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f44995OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f44996OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<o000O000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f44997Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FragmentActivity fragmentActivity) {
            super(0);
            this.f44997Oooo0o = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O000 invoke() {
            return new o000O000(this.f44997Oooo0o, GiftPropTypeShow.InMomentList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(@NotNull FragmentActivity context, @NotNull MomentAdapterTag momentTag) {
        super(context, R.layout.item_post_detail_header_new);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(momentTag, "momentTag");
        this.f44992OooO0OO = "";
        this.f44993OooO0Oo = new ArrayList<>();
        this.f44996OooO0oO = LazyKt.lazy(new OooO00o(context));
        this.f44990OooO00o = momentTag;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        MomentDetailModel item = (MomentDetailModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.f12564OooO0o0;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.yalla.yalla.ui.view.MomentDetailView");
        MomentDetailView momentDetailView = (MomentDetailView) view;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        momentDetailView.setPostDetailHeaderView((FragmentActivity) context);
        momentDetailView.setTopicDetailId(this.f44991OooO0O0);
        momentDetailView.setTopicOwnerId(this.f44992OooO0OO);
        momentDetailView.setTopicManagers(this.f44993OooO0Oo);
        momentDetailView.setTopPostId(this.f44995OooO0o0);
        momentDetailView.setEnterRoomParentPage(this.f44994OooO0o);
        momentDetailView.setMomentAdapterTag(this.f44990OooO00o);
        momentDetailView.setForwarding(true);
        momentDetailView.setShowReply(false);
        momentDetailView.OooOOo0(item, helper.getLayoutPosition());
        momentDetailView.setShowGiftDialogListener(new o00000O0(this));
        momentDetailView.setListener(new o00000O(this, momentDetailView, item));
    }
}
