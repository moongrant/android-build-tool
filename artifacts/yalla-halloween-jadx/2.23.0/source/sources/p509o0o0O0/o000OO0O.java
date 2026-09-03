package p509o0o0O0;

import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f50653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f50654OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50655OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f50656OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(MomentFollowingVM momentFollowingVM, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z) {
        super(0);
        this.f50653OooO0Oo = momentFollowingVM;
        this.f50655OooO0o0 = momentDetailModel;
        this.f50654OooO0o = momentAdapterTag;
        this.f50656OooO0oO = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentFollowingVM momentFollowingVM = this.f50653OooO0Oo;
        MomentDetailModel momentDetailModel = this.f50655OooO0o0;
        momentFollowingVM.follow(momentDetailModel);
        if (this.f50654OooO0o == MomentAdapterTag.MomentListFeaturedFragment && !this.f50656OooO0oO) {
            o0OO000.OooO0O0("103046", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        }
        return Unit.INSTANCE;
    }
}
