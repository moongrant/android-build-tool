package p485o0o00O0;

import android.app.Activity;
import com.code.android.util.o000O00O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p515o0o0O0O0.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f47939OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivityVM f47940OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f47941OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(MomentDetailModel momentDetailModel, Activity activity, MomentDetailActivityVM momentDetailActivityVM) {
        super(0);
        this.f47939OooO0Oo = momentDetailModel;
        this.f47941OooO0o0 = activity;
        this.f47940OooO0o = momentDetailActivityVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f47939OooO0Oo;
        if (o0OoOo0.OooO00o(momentDetailModel != null ? Boolean.valueOf(MomentStateKt.isSystemDelete(momentDetailModel)) : null)) {
            o000O00O.OooO00o(oO00OOo0.moment_delete_by_user);
            Activity activity = this.f47941OooO0o0;
            if (activity != null) {
                activity.finish();
            }
        } else {
            if (o0OoOo0.OooO00o(momentDetailModel != null ? Boolean.valueOf(MomentStateKt.isUnderReview(momentDetailModel)) : null)) {
                o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
            } else {
                Activity activity2 = this.f47941OooO0o0;
                MomentDetailActivityVM momentDetailActivityVM = this.f47940OooO0o;
                o000OOo.OooO00o(activity2, momentDetailActivityVM.getMPostDetailModel().getValue(), momentDetailActivityVM.getMomentAdapterTag().getValue(), this.f47940OooO0o, null, null);
                o0OO000.OooO00o("106062");
            }
        }
        return Unit.INSTANCE;
    }
}
