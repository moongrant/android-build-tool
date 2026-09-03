package p499o0o00o;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0oO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<RoomVoteDialog> f50039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f50040OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f50039OooO0Oo = mutableState;
        this.f50040OooO0o0 = mixedRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102109");
        MutableState<RoomVoteDialog> mutableState = this.f50039OooO0Oo;
        MixedRoomActivity mixedRoomActivity = this.f50040OooO0o0;
        oOo00OO0.OooO0Oo(mutableState, mixedRoomActivity);
        oOo00OO0.OooO0OO(mutableState, mixedRoomActivity);
        return Unit.INSTANCE;
    }
}
