package p495o0o00Ooo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.constant.TurntableGameState;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0o000.o00000OO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f48969OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48970OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<BaseWebView> f48971OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f48972OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f48973OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(MutableState<Boolean> mutableState, MutableState<BaseWebView> mutableState2, MixedRoomActivity mixedRoomActivity, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.f48969OooO0Oo = mutableState;
        this.f48971OooO0o0 = mutableState2;
        this.f48970OooO0o = mixedRoomActivity;
        this.f48972OooO0oO = mutableState3;
        this.f48973OooO0oo = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102105");
        MutableState<Boolean> mutableState = this.f48969OooO0Oo;
        MutableState<BaseWebView> mutableState2 = this.f48971OooO0o0;
        MixedRoomActivity mixedRoomActivity = this.f48970OooO0o;
        MutableState<String> mutableState3 = this.f48972OooO0oO;
        MutableState<Boolean> mutableState4 = this.f48973OooO0oo;
        o0OO000 o0oo000 = o0OO000.f48859OooO00o;
        o00000OO o00000oo2 = OooO00o.f24982OooOO0O;
        if (o00000oo2.f47424OooO0O0.getValue() == TurntableGameState.Close) {
            o00000oo2.f47424OooO0O0.setValue(TurntableGameState.Setting);
        }
        o0oo000.OooO0OO(mutableState, mutableState2, mixedRoomActivity, mutableState3, mutableState4);
        return Unit.INSTANCE;
    }
}
