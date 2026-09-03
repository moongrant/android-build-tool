package p519o0o0O0OO;

import android.content.Context;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p521o0o0O0o0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f51915OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f51916OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51917OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag) {
        super(0);
        this.f51915OooO0Oo = momentAdapterTag;
        this.f51917OooO0o0 = momentDetailModel;
        this.f51916OooO0o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentAdapterTag momentAdapterTag = MomentAdapterTag.MomentListFollowingFragment;
        MomentAdapterTag momentAdapterTag2 = this.f51915OooO0Oo;
        if (momentAdapterTag2 == momentAdapterTag || momentAdapterTag2 == MomentAdapterTag.MomentListFollowingFragment_Top || momentAdapterTag2 == MomentAdapterTag.MomentListFollowingFragment_Recommend) {
            OooO00o.OooO0O0("103025");
            MomentDetailModel momentDetailModel = this.f51917OooO0o0;
            OooO00o.OooO0OO("106057", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        }
        MomentAdapterTag momentAdapterTag3 = this.f51915OooO0Oo;
        Context context = this.f51916OooO0o;
        MomentDetailModel momentDetailModel2 = this.f51917OooO0o0;
        if (momentAdapterTag3 != MomentAdapterTag.MomentEditRecord) {
            if (momentAdapterTag3 == MomentAdapterTag.RoomInfoMomentsFragment) {
                OooO00o.OooO0O0("102185");
            }
            o0000oo.OooO00o(context, momentDetailModel2, momentAdapterTag3, false, 0, true, 16);
        }
        return Unit.INSTANCE;
    }
}
