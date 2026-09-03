package p535o0o0Oo0;

import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54201OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54202OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM) {
        super(0);
        this.f54201OooO0Oo = momentDetailModel;
        this.f54202OooO0o0 = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (MomentStateKt.isApprovedState(this.f54201OooO0Oo)) {
            this.f54202OooO0o0.setShowDialogGift(true);
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
