package p519o0o0O0oO;

import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o00O000o;

/* JADX INFO: loaded from: classes4.dex */
public final class k5 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f52410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<WebPageInfo, Unit> f52411OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k5(FragmentActivity fragmentActivity, Function1<? super WebPageInfo, Unit> function1) {
        super(0);
        this.f52410OooO0Oo = fragmentActivity;
        this.f52411OooO0o0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000o.f44511OooOo0O.observe(this.f52410OooO0Oo, new i5(new j5(this.f52411OooO0o0)));
        return Unit.INSTANCE;
    }
}
