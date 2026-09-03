package p509o0o0O0;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentPoll;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000OO0;
import p515o0o0O0O0.o00oO0o;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f51118OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentPoll f51119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f51120OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f51121OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51122OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f51123OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Activity f51124OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f51125OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f51126OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f51127OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(MomentPoll momentPoll, boolean z, Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z2, Activity activity, int i, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f51119OooO0Oo = momentPoll;
        this.f51121OooO0o0 = z;
        this.f51120OooO0o = context;
        this.f51122OooO0oO = momentDetailModel;
        this.f51123OooO0oo = momentAdapterTag;
        this.f51118OooO = z2;
        this.f51124OooOO0 = activity;
        this.f51125OooOO0O = i;
        this.f51126OooOO0o = baseMomentDetailVM;
        this.f51127OooOOO0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentPoll momentPoll = this.f51119OooO0Oo;
        if (momentPoll.getIsExpire() || this.f51121OooO0o0) {
            o00oO0o.OooO00o(this.f51120OooO0o, this.f51122OooO0oO, this.f51123OooO0oo, this.f51118OooO, 0, false, 48);
        } else {
            o0OO000.OooO00o("103014");
            long voteOptionId = momentPoll.getVoteOptionId();
            long id = momentPoll.getId();
            MomentPoll.Option option = momentPoll.getOptions().get(this.f51125OooOO0O);
            BaseMomentDetailVM baseMomentDetailVM = this.f51126OooOO0o;
            LifecycleOwner lifecycleOwner = this.f51127OooOOO0;
            MomentDetailModel momentDetailModel = this.f51122OooO0oO;
            boolean z = this.f51118OooO;
            if (voteOptionId == 0) {
                baseMomentDetailVM.momentPoll(id, option.getId()).observe(lifecycleOwner, new o0000OO0(new o0oO0Ooo(momentDetailModel, z), null, null, false, 14));
            } else {
                Activity activity = this.f51124OooOO0;
                if (activity != null) {
                    o0OO00O o0oo00o2 = new o0OO00O(activity);
                    o0oo00o2.OooOoO0(oO00OOo0.moment_poll_cancel_Title);
                    o0oo00o2.OooOOOO(oO00OOo0.moment_poll_cancel_Retract);
                    o0oo00o2.OooOo0(new o0O00oO0(baseMomentDetailVM, id, voteOptionId, lifecycleOwner, momentDetailModel, z));
                    o0oo00o2.OooOo(true);
                    o0oo00o2.OooOO0o();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
