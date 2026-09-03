package p543o0o0Ooo0;

import androidx.lifecycle.Lifecycle;
import com.yalla.yalla.ui.vm.user.MyUserInfoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Lambda implements Function1<Lifecycle.Event, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MyUserInfoVM f55674OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MyUserInfoVM myUserInfoVM) {
        super(1);
        this.f55674OooO0Oo = myUserInfoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Lifecycle.Event event) {
        Lifecycle.Event it = event;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == Lifecycle.Event.ON_START) {
            this.f55674OooO0Oo.syncUserInfo();
        }
        return Unit.INSTANCE;
    }
}
