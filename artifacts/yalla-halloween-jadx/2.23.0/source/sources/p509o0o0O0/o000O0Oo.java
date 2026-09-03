package p509o0o0O0;

import android.app.Activity;
import androidx.compose.runtime.MutableLongState;
import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oo.oo0ooO;
import p375o0OOoOO.o0000Ooo;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f50641OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50642OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f50643OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f50644OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f50645OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f50646OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(MomentDetailModel momentDetailModel, boolean z, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, Activity activity, MutableLongState mutableLongState) {
        super(0);
        this.f50642OooO0Oo = momentDetailModel;
        this.f50644OooO0o0 = z;
        this.f50643OooO0o = baseMomentDetailVM;
        this.f50645OooO0oO = lifecycleOwner;
        this.f50646OooO0oo = activity;
        this.f50641OooO = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("103045");
        MomentDetailModel momentDetailModel = this.f50642OooO0Oo;
        boolean zIsInRoom = momentDetailModel.isInRoom();
        boolean z = this.f50644OooO0o0;
        if (zIsInRoom && z) {
            o0OO000.OooO00o("103028");
        }
        Activity activity = this.f50646OooO0oo;
        if (z) {
            o0000Ooo.OooO00o(this.f50643OooO0o.getInRoomState(momentDetailModel.getUserId()), this.f50645OooO0oO, new o000O0(momentDetailModel, activity, this.f50641OooO));
        } else if (activity != null) {
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, activity, oo0ooO.OooO00o(momentDetailModel.getUserId()), false, 12);
        }
        return Unit.INSTANCE;
    }
}
