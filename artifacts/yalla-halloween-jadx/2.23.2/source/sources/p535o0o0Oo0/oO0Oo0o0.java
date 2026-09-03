package p535o0o0Oo0;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
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

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54107OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54108OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
        super(0);
        this.f54105OooO0Oo = momentVideoVM;
        this.f54107OooO0o0 = momentDetailModel;
        this.f54106OooO0o = lifecycleOwner;
        this.f54108OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f54105OooO0Oo;
        MomentDetailModel momentDetailModel = this.f54107OooO0o0;
        o0OoOo0.OooO00o(momentVideoVM.userFollow(momentDetailModel), this.f54106OooO0o, new oO0OO0O(this.f54108OooO0oO));
        OooO00o.OooO0OO("106063", MapsKt.mapOf(o0oOO.OooO00o(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        return Unit.INSTANCE;
    }
}
