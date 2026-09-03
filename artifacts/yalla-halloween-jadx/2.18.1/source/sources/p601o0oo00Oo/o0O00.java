package p601o0oo00Oo;

import android.app.Activity;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48164Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(MomentDetailView momentDetailView) {
        super(0);
        this.f48164Oooo0o = momentDetailView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailView momentDetailView = this.f48164Oooo0o;
        if (!momentDetailView.f24952Ooooo00 && momentDetailView.f24938Oooo != MomentAdapterTag.MomentEditRecord) {
            momentDetailView.OooOo0();
            PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22417o0O0O00;
            Activity activity = this.f48164Oooo0o.getActivity();
            MomentDetailView momentDetailView2 = this.f48164Oooo0o;
            MomentDetailModel momentDetailModel = momentDetailView2.f24941Oooo0oo;
            MomentAdapterTag momentAdapterTag = momentDetailView2.f24938Oooo;
            PostDetailActivity.f22417o0O0O00.OooO00o(activity, momentDetailModel, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : momentAdapterTag == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag == MomentAdapterTag.TopicDetailFragmentLatest, (256 & 64) != 0 ? null : momentAdapterTag, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
        }
        return Unit.INSTANCE;
    }
}
