package p495o0o00Ooo;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f48813OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<MessageBoxFragment> f48814OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f48813OooO0Oo = mixedRoomActivity;
        this.f48814OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102249");
        MessageBoxFragment messageBoxFragment = new MessageBoxFragment();
        MutableState<MessageBoxFragment> mutableState = this.f48814OooO0o0;
        mutableState.setValue(messageBoxFragment);
        MessageBoxFragment value = mutableState.getValue();
        if (value != null) {
            value.show(this.f48813OooO0Oo.getSupportFragmentManager(), o0000.OooO0OO(oO00OOo0.nav_title_message));
        }
        return Unit.INSTANCE;
    }
}
