package p528o0o0OOOo;

import androidx.compose.runtime.MutableLongState;
import com.yalla.yalla.model.moment.MomentInRoomStateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0O0o extends Lambda implements Function1<MomentInRoomStateModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableLongState f54345OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0O0o(MutableLongState mutableLongState) {
        super(1);
        this.f54345OooO0Oo = mutableLongState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentInRoomStateModel momentInRoomStateModel) {
        MomentInRoomStateModel it = momentInRoomStateModel;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f54345OooO0Oo.setLongValue(it.getInRoom());
        return Unit.INSTANCE;
    }
}
