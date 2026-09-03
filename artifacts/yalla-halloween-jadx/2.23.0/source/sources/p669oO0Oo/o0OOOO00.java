package p669oO0Oo;

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
public final class o0OOOO00 extends Lambda implements Function1<KeyboardActionScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f60728OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(MutableState<String> mutableState) {
        super(1);
        this.f60728OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(KeyboardActionScope keyboardActionScope) {
        KeyboardActionScope $receiver = keyboardActionScope;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        MutableState<String> mutableState = this.f60728OooO0Oo;
        if (mutableState.getValue().length() == 4) {
            ArrayList arrayList = OooO00o.f24973OooO00o;
            OooO00o.OooO0oO(OooO0OO.AbstractC0318OooO0OO.OooO0O0.f25054OooO00o);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                String value = mutableState.getValue();
                RoomLoginModel roomLoginModel = roomLiveService.f25066OooOO0O;
                if (roomLoginModel != null) {
                    roomLoginModel.setPassword(value);
                }
                roomLiveService.OooO0o();
            }
        }
        return Unit.INSTANCE;
    }
}
