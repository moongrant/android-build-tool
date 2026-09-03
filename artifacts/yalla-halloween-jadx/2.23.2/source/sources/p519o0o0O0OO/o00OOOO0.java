package p519o0o0O0OO;

import android.app.Activity;
import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p381o0OOoOo0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function1<o00O0O<MomentInRoomStateModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52191OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f52192OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f52193OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(MomentDetailModel momentDetailModel, Activity activity, MutableLongState mutableLongState) {
        super(1);
        this.f52191OooO0Oo = momentDetailModel;
        this.f52193OooO0o0 = activity;
        this.f52192OooO0o = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0O<MomentInRoomStateModel> o00o0o2) {
        o00O0O<MomentInRoomStateModel> launchCollectApi = o00o0o2;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f43270OooO00o = new o0o0Oo(this.f52191OooO0Oo, this.f52193OooO0o0, this.f52192OooO0o);
        return Unit.INSTANCE;
    }
}
