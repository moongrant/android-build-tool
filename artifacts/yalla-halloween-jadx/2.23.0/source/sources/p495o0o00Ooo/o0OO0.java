package p495o0o00Ooo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<RoomVoteDialog> f48857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48858OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48857OooO0Oo = mutableState;
        this.f48858OooO0o0 = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102109");
        MutableState<RoomVoteDialog> mutableState = this.f48857OooO0Oo;
        MixedRoomActivity mixedRoomActivity = this.f48858OooO0o0;
        o0OO00o0.OooO0O0(mutableState, mixedRoomActivity);
        o0OO00o0.OooO0Oo(mutableState, mixedRoomActivity);
        return Unit.INSTANCE;
    }
}
