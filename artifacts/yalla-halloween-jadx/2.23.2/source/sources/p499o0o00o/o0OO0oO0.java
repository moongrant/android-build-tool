package p499o0o00o;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f49976OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<MessageBoxFragment> f49977OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f49976OooO0Oo = mixedRoomActivity;
        this.f49977OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102249");
        MessageBoxFragment messageBoxFragment = new MessageBoxFragment();
        MutableState<MessageBoxFragment> mutableState = this.f49977OooO0o0;
        mutableState.setValue(messageBoxFragment);
        MessageBoxFragment value = mutableState.getValue();
        if (value != null) {
            value.show(this.f49976OooO0Oo.getSupportFragmentManager(), o0000.OooO0OO(o000000.nav_title_message));
        }
        return Unit.INSTANCE;
    }
}
