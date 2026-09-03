package p519o0o0O0OO;

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
import o0oo0000.OooO00o;
import p205o00o0o0o.o000O;
import p384o0OOoo0O.o000oOoO;
import p521o0o0O0o0.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f52699OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentPoll f52700OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f52701OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52702OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52703OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MomentAdapterTag f52704OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Activity f52705OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f52706OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52707OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f52708OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(MomentPoll momentPoll, boolean z, Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z2, Activity activity, int i, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f52700OooO0Oo = momentPoll;
        this.f52702OooO0o0 = z;
        this.f52701OooO0o = context;
        this.f52703OooO0oO = momentDetailModel;
        this.f52704OooO0oo = momentAdapterTag;
        this.f52699OooO = z2;
        this.f52705OooOO0 = activity;
        this.f52706OooOO0O = i;
        this.f52707OooOO0o = baseMomentDetailVM;
        this.f52708OooOOO0 = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentPoll momentPoll = this.f52700OooO0Oo;
        if (momentPoll.getIsExpire() || this.f52702OooO0o0) {
            o0000oo.OooO00o(this.f52701OooO0o, this.f52703OooO0oO, this.f52704OooO0oo, this.f52699OooO, 0, false, 48);
        } else {
            OooO00o.OooO0O0("103014");
            long voteOptionId = momentPoll.getVoteOptionId();
            long id = momentPoll.getId();
            MomentPoll.Option option = momentPoll.getOptions().get(this.f52706OooOO0O);
            BaseMomentDetailVM baseMomentDetailVM = this.f52707OooOO0o;
            LifecycleOwner lifecycleOwner = this.f52708OooOOO0;
            MomentDetailModel momentDetailModel = this.f52703OooO0oO;
            boolean z = this.f52699OooO;
            if (voteOptionId == 0) {
                baseMomentDetailVM.momentPoll(id, option.getId()).observe(lifecycleOwner, new o000oOoO(new o0oo0000(momentDetailModel, z), null, null, false, 14));
            } else {
                Activity activity = this.f52705OooOO0;
                if (activity != null) {
                    o000O o000o = new o000O(activity);
                    o000o.OooOoO0(o000000.moment_poll_cancel_Title);
                    o000o.OooOOOO(o000000.moment_poll_cancel_Retract);
                    o000o.OooOo0(new o(baseMomentDetailVM, id, voteOptionId, lifecycleOwner, momentDetailModel, z));
                    o000o.OooOo(true);
                    o000o.OooOO0o();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
