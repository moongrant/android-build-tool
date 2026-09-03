package p495o0o00Ooo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.o;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<o> f48945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48946OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(MutableState<o> mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48945OooO0Oo = mutableState;
        this.f48946OooO0o0 = mixedRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o value;
        o0OO000.OooO00o("102128");
        MixedRoomActivity mixedRoomActivity = this.f48946OooO0o0;
        MutableState<o> mutableState = this.f48945OooO0Oo;
        if (mutableState.getValue() == null) {
            try {
                mutableState.setValue(new o(mixedRoomActivity));
                value = mutableState.getValue();
                if (value != null) {
                    value.OooO();
                }
            } catch (Exception unused) {
            }
        } else {
            value = mutableState.getValue();
            if (value != null) {
                value.OooO();
            }
        }
        return Unit.INSTANCE;
    }
}
