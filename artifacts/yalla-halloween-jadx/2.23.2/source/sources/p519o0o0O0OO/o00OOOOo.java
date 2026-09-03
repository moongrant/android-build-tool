package p519o0o0O0OO;

import android.app.Activity;
import androidx.compose.runtime.MutableLongState;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.session.o0000O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p381o0OOoOo0.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f52194OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52195OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BaseMomentDetailVM f52196OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f52197OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f52198OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Activity f52199OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(MomentDetailModel momentDetailModel, boolean z, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner, Activity activity, MutableLongState mutableLongState) {
        super(0);
        this.f52195OooO0Oo = momentDetailModel;
        this.f52197OooO0o0 = z;
        this.f52196OooO0o = baseMomentDetailVM;
        this.f52198OooO0oO = lifecycleOwner;
        this.f52199OooO0oo = activity;
        this.f52194OooO = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("103045");
        MomentDetailModel momentDetailModel = this.f52195OooO0Oo;
        boolean zIsInRoom = momentDetailModel.isInRoom();
        boolean z = this.f52197OooO0o0;
        if (zIsInRoom && z) {
            OooO00o.OooO0O0("103028");
        }
        Activity activity = this.f52199OooO0oo;
        if (z) {
            o0OoOo0.OooO00o(this.f52196OooO0o.getInRoomState(momentDetailModel.getUserId()), this.f52198OooO0oO, new o00OOOO0(momentDetailModel, activity, this.f52194OooO));
        } else if (activity != null) {
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activity, o0000O00.OooO00o(momentDetailModel.getUserId()), false, 12);
        }
        return Unit.INSTANCE;
    }
}
