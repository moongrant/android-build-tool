package p528o0o0OOOo;

import com.code.android.util.o000O00O;
import com.google.firebase.messaging.o0OO00O;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00 extends Lambda implements Function1<PraisePostResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54397OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54398OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
        super(1);
        this.f54397OooO0Oo = momentDetailModel;
        this.f54398OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraisePostResultModel praisePostResultModel) {
        PraisePostResultModel it = praisePostResultModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f54397OooO0Oo.isPraise()) {
            MomentVideoVM momentVideoVM = this.f54398OooO0o0;
            if (momentVideoVM.getShowVideoLikeTip()) {
                momentVideoVM.setShowVideoLikeTip(false);
                o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
                o0o0o00OooO0o0.getClass();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o0OO00O.OooO00o("videoLikeTip", o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
                o000O00O.OooO00o(oO00OOo0.video_feed_double_like);
            }
        }
        return Unit.INSTANCE;
    }
}
