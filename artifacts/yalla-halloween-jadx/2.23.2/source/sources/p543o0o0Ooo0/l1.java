package p543o0o0Ooo0;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<LayoutCoordinates> f55463OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(MutableState mutableState, MomentUserListVM momentUserListVM) {
        super(0);
        this.f55462OooO0Oo = momentUserListVM;
        this.f55463OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f55462OooO0Oo.setLayoutCoordinates(this.f55463OooO0o0.getValue());
        return Unit.INSTANCE;
    }
}
