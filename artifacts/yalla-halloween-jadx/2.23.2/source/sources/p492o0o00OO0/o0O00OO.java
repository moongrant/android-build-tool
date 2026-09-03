package p492o0o00OO0;

import android.app.Activity;
import com.code.android.util.o000O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p521o0o0O0o0.o000O000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f49258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivityVM f49259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f49260OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(MomentDetailModel momentDetailModel, Activity activity, MomentDetailActivityVM momentDetailActivityVM) {
        super(0);
        this.f49258OooO0Oo = momentDetailModel;
        this.f49260OooO0o0 = activity;
        this.f49259OooO0o = momentDetailActivityVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f49258OooO0Oo;
        if (o0OoOo0.OooO00o(momentDetailModel != null ? Boolean.valueOf(MomentStateKt.isSystemDelete(momentDetailModel)) : null)) {
            o000O00.OooO00o(o000000.moment_delete_by_user);
            Activity activity = this.f49260OooO0o0;
            if (activity != null) {
                activity.finish();
            }
        } else {
            if (o0OoOo0.OooO00o(momentDetailModel != null ? Boolean.valueOf(MomentStateKt.isUnderReview(momentDetailModel)) : null)) {
                o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
            } else {
                Activity activity2 = this.f49260OooO0o0;
                MomentDetailActivityVM momentDetailActivityVM = this.f49259OooO0o;
                o000O000.OooO00o(activity2, momentDetailActivityVM.getMPostDetailModel().getValue(), momentDetailActivityVM.getMomentAdapterTag().getValue(), this.f49259OooO0o, null, null);
                OooO00o.OooO0O0("106062");
            }
        }
        return Unit.INSTANCE;
    }
}
