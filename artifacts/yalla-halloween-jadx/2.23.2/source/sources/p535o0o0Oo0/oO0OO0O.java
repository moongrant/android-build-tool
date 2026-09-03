package p535o0o0Oo0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p381o0OOoOo0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO0O extends Lambda implements Function1<o00O0O<Boolean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54097OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO0O(MutableState<Boolean> mutableState) {
        super(1);
        this.f54097OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0O<Boolean> o00o0o2) {
        o00O0O<Boolean> launchCollectApi = o00o0o2;
        Intrinsics.checkNotNullParameter(launchCollectApi, "$this$launchCollectApi");
        launchCollectApi.f43270OooO00o = new oO0OO00(this.f54097OooO0Oo);
        return Unit.INSTANCE;
    }
}
