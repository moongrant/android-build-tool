package p499o0o00o;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p650o0ooo.o0O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0O0OO0> f49959OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f49960OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(MutableState<o0O0OO0> mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f49959OooO0Oo = mutableState;
        this.f49960OooO0o0 = mixedRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O0OO0 value;
        OooO00o.OooO0O0("102128");
        MixedRoomActivity mixedRoomActivity = this.f49960OooO0o0;
        MutableState<o0O0OO0> mutableState = this.f49959OooO0Oo;
        if (mutableState.getValue() == null) {
            try {
                mutableState.setValue(new o0O0OO0(mixedRoomActivity));
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
