package p535o0o0Oo0;

import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00o00 extends Lambda implements Function1<MomentInRoomStateModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f54245OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00o00(MutableLongState mutableLongState) {
        super(1);
        this.f54245OooO0Oo = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentInRoomStateModel momentInRoomStateModel) {
        MomentInRoomStateModel it = momentInRoomStateModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f54245OooO0Oo.setLongValue(it.getInRoom());
        return Unit.INSTANCE;
    }
}
