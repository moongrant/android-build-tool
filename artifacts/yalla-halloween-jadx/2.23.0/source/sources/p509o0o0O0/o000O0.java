package p509o0o0O0;

import android.app.Activity;
import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<o0000<MomentInRoomStateModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50622OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f50623OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f50624OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(MomentDetailModel momentDetailModel, Activity activity, MutableLongState mutableLongState) {
        super(1);
        this.f50622OooO0Oo = momentDetailModel;
        this.f50624OooO0o0 = activity;
        this.f50623OooO0o = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<MomentInRoomStateModel> o0000Var) {
        o0000<MomentInRoomStateModel> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new o000O00O(this.f50622OooO0Oo, this.f50624OooO0o0, this.f50623OooO0o);
        return Unit.INSTANCE;
    }
}
