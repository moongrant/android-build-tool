package p535o0o0Oo0;

import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
import com.yalla.yalla.ui.vm.moment.MomentPraiseVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54203OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f54204OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54205OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentPraiseVM f54206OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentGiftsVM f54207OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM, MomentPraiseVM momentPraiseVM, MomentGiftsVM momentGiftsVM) {
        super(0);
        this.f54203OooO0Oo = momentDetailModel;
        this.f54205OooO0o0 = momentVideoVM;
        this.f54204OooO0o = momentCommentsVM;
        this.f54206OooO0oO = momentPraiseVM;
        this.f54207OooO0oo = momentGiftsVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f54203OooO0Oo;
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            MomentVideoVM momentVideoVM = this.f54205OooO0o0;
            if (momentVideoVM.getCurrentMomentDetail() != null) {
                this.f54204OooO0o.showComment(momentVideoVM, this.f54206OooO0oO, this.f54207OooO0oo);
                OooO00o.OooO0OO("106055", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
            }
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
