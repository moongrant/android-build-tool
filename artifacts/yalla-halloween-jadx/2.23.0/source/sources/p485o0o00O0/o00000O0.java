package p485o0o00O0;

import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p203o00o0o0o.o0O000Oo;
import p515o0o0O0O0.Oooo000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47801OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MomentDetailActivity momentDetailActivity) {
        super(0);
        this.f47801OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentDetailActivity.f26057Oooo0;
        MomentDetailActivity momentDetailActivity = this.f47801OooO0Oo;
        MomentDetailModel momentDetailModel = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
        if (o0OoOo0.OooO00o(momentDetailModel != null ? Boolean.valueOf(MomentStateKt.isSystemDelete(momentDetailModel)) : null)) {
            o000O00O.OooO00o(oO00OOo0.moment_delete_by_user);
            momentDetailActivity.finish();
        } else {
            MomentDetailModel momentDetailModel2 = (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity);
            if (o0OoOo0.OooO00o(momentDetailModel2 != null ? Boolean.valueOf(MomentStateKt.isApprovedState(momentDetailModel2)) : null)) {
                Oooo000.OooO0OO(null, (MomentDetailModel) o0O000Oo.OooO00o(momentDetailActivity), true, momentDetailActivity.OooOooo().getMomentAdapterTag().getValue(), momentDetailActivity, null, true, null, null, momentDetailActivity.OooOooo(), null, false, new o00000(momentDetailActivity));
            } else {
                o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
            }
        }
        return Unit.INSTANCE;
    }
}
