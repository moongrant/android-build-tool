package p540o0o0OoO0;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.room.RoomLoginModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0OO;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0Oo0 extends Lambda implements Function1<KeyboardActionScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f54975OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0Oo0(MutableState<String> mutableState) {
        super(1);
        this.f54975OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(KeyboardActionScope keyboardActionScope) {
        KeyboardActionScope $receiver = keyboardActionScope;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        MutableState<String> mutableState = this.f54975OooO0Oo;
        if (mutableState.getValue().length() == 4) {
            ArrayList arrayList = OooO00o.f24511OooO00o;
            OooO00o.OooO0oO(OooO0OO.AbstractC0317OooO0OO.OooO0O0.f24592OooO00o);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                String value = mutableState.getValue();
                RoomLoginModel roomLoginModel = roomLiveService.f24604OooOO0O;
                if (roomLoginModel != null) {
                    roomLoginModel.setPassword(value);
                }
                roomLiveService.OooO0o();
            }
        }
        return Unit.INSTANCE;
    }
}
