package p528o0o0OOOo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OOO extends Lambda implements Function1<o0000<MomentInRoomStateModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f54349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f54350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f54351OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OOO(MomentDetailModel momentDetailModel, AppCompatActivity appCompatActivity, MutableLongState mutableLongState) {
        super(1);
        this.f54349OooO0Oo = momentDetailModel;
        this.f54351OooO0o0 = appCompatActivity;
        this.f54350OooO0o = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<MomentInRoomStateModel> o0000Var) {
        o0000<MomentInRoomStateModel> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new oOOO0OO0(this.f54349OooO0Oo, this.f54351OooO0o0, this.f54350OooO0o);
        return Unit.INSTANCE;
    }
}
