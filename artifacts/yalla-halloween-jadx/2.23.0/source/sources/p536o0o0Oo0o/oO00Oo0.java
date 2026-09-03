package p536o0o0Oo0o;

import androidx.lifecycle.Lifecycle;
import com.yalla.yalla.ui.vm.user.MyUserInfoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo0 extends Lambda implements Function1<Lifecycle.Event, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MyUserInfoVM f55132OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo0(MyUserInfoVM myUserInfoVM) {
        super(1);
        this.f55132OooO0Oo = myUserInfoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Lifecycle.Event event) {
        Lifecycle.Event it = event;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == Lifecycle.Event.ON_START) {
            this.f55132OooO0Oo.syncUserInfo();
        }
        return Unit.INSTANCE;
    }
}
