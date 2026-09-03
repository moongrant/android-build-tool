package p535o0o0Oo0;

import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentStateKt;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.activity.message.o0oOO;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p381o0OOoOo0.o0OoOo0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54217OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54218OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54219OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O000(MomentDetailModel momentDetailModel, MomentVideoVM momentVideoVM, LifecycleOwner lifecycleOwner) {
        super(0);
        this.f54217OooO0Oo = momentDetailModel;
        this.f54219OooO0o0 = momentVideoVM;
        this.f54218OooO0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailModel momentDetailModel = this.f54217OooO0Oo;
        OooO00o.OooO0OO("106054", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId()), TuplesKt.to("state", Integer.valueOf(!momentDetailModel.isPraise() ? 1 : 0))));
        if (MomentStateKt.isApprovedState(momentDetailModel)) {
            MomentVideoVM momentVideoVM = this.f54219OooO0o0;
            if (!momentVideoVM.isPraising()) {
                o0OoOo0.OooO00o(momentVideoVM.praisePost(momentDetailModel.getId(), !momentDetailModel.isPraise()), this.f54218OooO0o, new oOO0(momentDetailModel, momentVideoVM));
            }
        } else {
            o000O00.OooO00o(o000000.This_content_is_in_review_Please_try_again_later);
        }
        return Unit.INSTANCE;
    }
}
