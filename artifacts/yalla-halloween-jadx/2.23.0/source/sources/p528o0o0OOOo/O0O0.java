package p528o0o0OOOo;

import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p375o0OOoOO.o0000Ooo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f53697OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f53698OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f53699OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f53697OooO0Oo = momentDetailModel;
        this.f53699OooO0o0 = momentVideoVM;
        this.f53698OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f53697OooO0Oo;
        o0OO000.OooO0O0("106054", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId()), TuplesKt.to("state", Integer.valueOf(!momentDetailModel.isPraise() ? 1 : 0))));
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            MomentVideoVM momentVideoVM = this.f53699OooO0o0;
            if (!momentVideoVM.isPraising()) {
                o0000Ooo.OooO00o(momentVideoVM.praisePost(momentDetailModel.getId(), !momentDetailModel.isPraise()), this.f53698OooO0o, new O0000000(momentDetailModel, momentVideoVM));
            }
        } else {
            o000O00O.OooO00o(oO00OOo0.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
