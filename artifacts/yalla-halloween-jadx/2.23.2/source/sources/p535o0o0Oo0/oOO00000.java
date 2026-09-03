package p535o0o0Oo0;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p381o0OOoOo0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00000 extends Lambda implements Function1<o00O0O<MomentInRoomStateModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54208OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f54209OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f54210OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00000(MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MutableLongState mutableLongState) {
        super(1);
        this.f54208OooO0Oo = momentDetailModel;
        this.f54210OooO0o0 = appCompatActivity;
        this.f54209OooO0o = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0O<MomentInRoomStateModel> o00o0o2) {
        o00O0O<MomentInRoomStateModel> launchCollectApi = o00o0o2;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f43270OooO00o = new oO(this.f54208OooO0Oo, this.f54210OooO0o0, this.f54209OooO0o);
        return Unit.INSTANCE;
    }
}
