package p499o0o00o;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p483o0o000Oo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f50046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<BaseWebView> f50047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f50048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50049OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.f50045OooO0Oo = mutableState;
        this.f50047OooO0o0 = mutableState2;
        this.f50046OooO0o = mixedRoomActivity;
        this.f50048OooO0oO = mutableState3;
        this.f50049OooO0oo = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102105");
        ooOOOOoo oooooooo = ooOOOOoo.f50100OooO00o;
        MutableState<Boolean> mutableState = this.f50045OooO0Oo;
        MutableState<BaseWebView> mutableState2 = this.f50047OooO0o0;
        MixedRoomActivity mixedRoomActivity = this.f50046OooO0o;
        MutableState<String> mutableState3 = this.f50048OooO0oO;
        MutableState<Boolean> mutableState4 = this.f50049OooO0oo;
        o0000OO0 o0000oo1 = com.yalla.yalla.service.room.OooO00o.f24520OooOO0O;
        if (o0000oo1.f48511OooO0O0.getValue() == TurntableGameState.Close) {
            o0000oo1.f48511OooO0O0.setValue(TurntableGameState.Setting);
        }
        oooooooo.OooO0OO(mutableState, mutableState2, mixedRoomActivity, mutableState3, mutableState4);
        return Unit.INSTANCE;
    }
}
