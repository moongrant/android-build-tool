package p534o0o0OOoo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageVM f53589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f53590OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOo0(FriendRequestMessageVM friendRequestMessageVM, MutableState<Long> mutableState) {
        super(1);
        this.f53589OooO0Oo = friendRequestMessageVM;
        this.f53590OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        this.f53589OooO0Oo.deleteMessage(this.f53590OooO0o0.getValue().longValue());
        return Unit.INSTANCE;
    }
}
