package p528o0o0OOOo;

import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import com.yalla.yalla.ui.vm.moment.MomentPraiseVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOOoo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f54355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentPraiseVM f54357OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentGiftsVM f54358OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM) {
        super(0);
        this.f54354OooO0Oo = momentDetailModel;
        this.f54356OooO0o0 = momentVideoVM;
        this.f54355OooO0o = momentCommentsVM;
        this.f54357OooO0oO = momentPraiseVM;
        this.f54358OooO0oo = momentGiftsVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f54354OooO0Oo;
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            MomentVideoVM momentVideoVM = this.f54356OooO0o0;
            if (momentVideoVM.getCurrentMomentDetail() != null) {
                this.f54355OooO0o.showComment(momentVideoVM, this.f54357OooO0oO, this.f54358OooO0oo);
                o0OO000.OooO0O0("106055", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            }
        } else {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
