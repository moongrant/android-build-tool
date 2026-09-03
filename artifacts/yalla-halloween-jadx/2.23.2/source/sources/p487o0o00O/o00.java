package p487o0o00O;

import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48742OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(MainSearchActivity mainSearchActivity) {
        super(1);
        this.f48742OooO0Oo = mainSearchActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super String, ? extends Unit> function1) {
        Function1<? super String, ? extends Unit> it = function1;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48742OooO0Oo.f24967OooOoO0 = it;
        return Unit.INSTANCE;
    }
}
