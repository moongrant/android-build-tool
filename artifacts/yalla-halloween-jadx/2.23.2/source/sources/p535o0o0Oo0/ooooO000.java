package p535o0o0Oo0;

import androidx.appcompat.widget.o0000O0O;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.PraisePostResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO000 extends Lambda implements Function1<PraisePostResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54348OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO000(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
        super(1);
        this.f54347OooO0Oo = momentDetailModel;
        this.f54348OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PraisePostResultModel praisePostResultModel) {
        PraisePostResultModel it = praisePostResultModel;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f54347OooO0Oo.isPraise()) {
            MomentVideoVM momentVideoVM = this.f54348OooO0o0;
            if (momentVideoVM.getShowVideoLikeTip()) {
                momentVideoVM.setShowVideoLikeTip(false);
                oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
                oo0ooo0oOooO0o0.getClass();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0000O0O.OooO0O0("videoLikeTip", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
                o000O00.OooO00o(o000000.video_feed_double_like);
            }
        }
        return Unit.INSTANCE;
    }
}
