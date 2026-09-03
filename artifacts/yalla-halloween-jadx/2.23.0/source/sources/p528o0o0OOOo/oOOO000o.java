package p528o0o0OOOo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p375o0OOoOO.o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO000o extends Lambda implements Function1<o0000<Boolean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54342OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO000o(MutableState<Boolean> mutableState) {
        super(1);
        this.f54342OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000<Boolean> o0000Var) {
        o0000<Boolean> launchCollectApi = o0000Var;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f44046OooO00o = new oOO(this.f54342OooO0Oo);
        return Unit.INSTANCE;
    }
}
