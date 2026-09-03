package p509o0o0O0;

import android.content.Context;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p515o0o0O0O0.o00oO0o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f51208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f51209OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51210OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag) {
        super(0);
        this.f51208OooO0Oo = momentAdapterTag;
        this.f51210OooO0o0 = momentDetailModel;
        this.f51209OooO0o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentAdapterTag momentAdapterTag = MomentAdapterTag.MomentListFollowingFragment;
        MomentAdapterTag momentAdapterTag2 = this.f51208OooO0Oo;
        if (momentAdapterTag2 == momentAdapterTag || momentAdapterTag2 == MomentAdapterTag.MomentListFollowingFragment_Top || momentAdapterTag2 == MomentAdapterTag.MomentListFollowingFragment_Recommend) {
            o0OO000.OooO00o("103025");
            MomentDetailModel momentDetailModel = this.f51210OooO0o0;
            o0OO000.OooO0O0("106057", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        }
        MomentAdapterTag momentAdapterTag3 = this.f51208OooO0Oo;
        Context context = this.f51209OooO0o;
        MomentDetailModel momentDetailModel2 = this.f51210OooO0o0;
        if (momentAdapterTag3 != MomentAdapterTag.MomentEditRecord) {
            if (momentAdapterTag3 == MomentAdapterTag.RoomInfoMomentsFragment) {
                o0OO000.OooO00o("102185");
            }
            o00oO0o.OooO00o(context, momentDetailModel2, momentAdapterTag3, false, 0, true, 16);
        }
        return Unit.INSTANCE;
    }
}
