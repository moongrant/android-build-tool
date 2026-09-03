package p519o0o0O0OO;

import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<MomentInRoomStateModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f52190OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(MutableLongState mutableLongState) {
        super(1);
        this.f52190OooO0Oo = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentInRoomStateModel momentInRoomStateModel) {
        MomentInRoomStateModel it = momentInRoomStateModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f52190OooO0Oo.setLongValue(it.getInRoom());
        return Unit.INSTANCE;
    }
}
