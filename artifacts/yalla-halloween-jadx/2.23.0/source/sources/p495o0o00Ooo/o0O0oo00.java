package p495o0o00Ooo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<TreasureBoxDialog> f48854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48855OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(MutableState<TreasureBoxDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48854OooO0Oo = mutableState;
        this.f48855OooO0o0 = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<TreasureBoxDialog> mutableState = this.f48854OooO0Oo;
        if (mutableState.getValue() == null) {
            mutableState.setValue(new TreasureBoxDialog(this.f48855OooO0o0));
        }
        TreasureBoxDialog value = mutableState.getValue();
        if (value != null) {
            value.OooO();
        }
        return Unit.INSTANCE;
    }
}
