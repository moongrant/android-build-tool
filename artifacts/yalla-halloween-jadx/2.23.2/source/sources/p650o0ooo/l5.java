package p650o0ooo;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p583o0oOoo00.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class l5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58377OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<WebPageInfo, Unit> f58378OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l5(FragmentActivity fragmentActivity, Function1<? super WebPageInfo, Unit> function1) {
        super(0);
        this.f58377OooO0Oo = fragmentActivity;
        this.f58378OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000OO.f56680OooOo0O.observe(this.f58377OooO0Oo, new j5(new k5(this.f58378OooO0o0)));
        return Unit.INSTANCE;
    }
}
