package p601o0oo00Oo;

import android.app.Activity;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000o0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48171Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000o0(MomentDetailView momentDetailView) {
        super(1);
        this.f48171Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        MomentDetailView momentDetailView = this.f48171Oooo0o;
        if (!momentDetailView.f24952Ooooo00 && momentDetailView.f24938Oooo != MomentAdapterTag.MomentEditRecord) {
            MomentDetailModel momentDetailModel = momentDetailView.f24941Oooo0oo;
            if ((momentDetailModel != null ? momentDetailModel.getForward() : null) != null) {
                MomentDetailModel momentDetailModel2 = this.f48171Oooo0o.f24941Oooo0oo;
                MomentDetailModel forward = momentDetailModel2 != null ? momentDetailModel2.getForward() : null;
                if (forward != null) {
                    this.f48171Oooo0o.OooOo0();
                    PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
                    Activity activity = this.f48171Oooo0o.getActivity();
                    MomentAdapterTag momentAdapterTag = this.f48171Oooo0o.f24938Oooo;
                    PostDetailActivity.f22417o0O0O00.OooO00o(activity, forward, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
