package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.o0O00o0;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p039OoooOoo.o00OO;
import p375o0OOoOO.o0000Ooo;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f54338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f54339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54341OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00(MomentVideoVM momentVideoVM, MomentDetailModel momentDetailModel, LifecycleOwner lifecycleOwner, MutableState<Boolean> mutableState) {
        super(0);
        this.f54338OooO0Oo = momentVideoVM;
        this.f54340OooO0o0 = momentDetailModel;
        this.f54339OooO0o = lifecycleOwner;
        this.f54341OooO0oO = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVideoVM momentVideoVM = this.f54338OooO0Oo;
        MomentDetailModel momentDetailModel = this.f54340OooO0o0;
        o0000Ooo.OooO00o(momentVideoVM.userFollow(momentDetailModel), this.f54339OooO0o, new oOOO000o(this.f54341OooO0oO));
        o0OO000.OooO0O0("106063", MapsKt.mapOf(o00OO.OooO0O0(momentDetailModel, "discovery_id"), o0O00o0.OooO00o(momentDetailModel, "video_id"), TuplesKt.to("rec_sessionid", momentDetailModel.getSessionId())));
        return Unit.INSTANCE;
    }
}
