package p535o0o0OOoO;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f43704Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(TaskActivity taskActivity) {
        super(0);
        this.f43704Oooo0o = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OpenAuthManager openAuthManager = this.f43704Oooo0o.f22070OoooooO;
        Intrinsics.checkNotNull(openAuthManager);
        openAuthManager.OooO0o0();
        return Unit.INSTANCE;
    }
}
