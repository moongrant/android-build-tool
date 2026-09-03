package p519o0o0O0OO;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f52200OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52201OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52202OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f52203OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(MomentFollowingVM momentFollowingVM, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z) {
        super(0);
        this.f52200OooO0Oo = momentFollowingVM;
        this.f52202OooO0o0 = momentDetailModel;
        this.f52201OooO0o = momentAdapterTag;
        this.f52203OooO0oO = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentFollowingVM momentFollowingVM = this.f52200OooO0Oo;
        MomentDetailModel momentDetailModel = this.f52202OooO0o0;
        momentFollowingVM.follow(momentDetailModel);
        if (this.f52201OooO0o == MomentAdapterTag.MomentListFeaturedFragment && !this.f52203OooO0oO) {
            OooO00o.OooO0OO("103046", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        }
        return Unit.INSTANCE;
    }
}
