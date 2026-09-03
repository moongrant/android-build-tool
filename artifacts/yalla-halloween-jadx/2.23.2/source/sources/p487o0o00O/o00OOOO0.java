package p487o0o00O;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f48828OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(TaskActivity taskActivity) {
        super(0);
        this.f48828OooO0Oo = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OpenAuthManager openAuthManager = this.f48828OooO0Oo.f25085OooOo;
        Intrinsics.checkNotNull(openAuthManager);
        openAuthManager.OooO0o0();
        return Unit.INSTANCE;
    }
}
