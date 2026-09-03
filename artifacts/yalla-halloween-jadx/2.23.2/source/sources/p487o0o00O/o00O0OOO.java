package p487o0o00O;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p386o0OOooO.oo0o0Oo;
import p420o0OoO0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f48815OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(FragmentActivity fragmentActivity) {
        super(0);
        this.f48815OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!oo0o0Oo.OooO0o0()) {
            int i = OooO0OO.f46612OooO00o;
            FragmentActivity context = this.f48815OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
        }
        return Unit.INSTANCE;
    }
}
