package p533o0o0Oo0;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f54708OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f54709OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(MutableState mutableState, String str) {
        super(0);
        this.f54708OooO0Oo = str;
        this.f54709OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableState<String> mutableState = this.f54709OooO0o0;
        if (Intrinsics.areEqual(this.f54708OooO0Oo, mutableState.getValue())) {
            mutableState.setValue("");
        }
        return Unit.INSTANCE;
    }
}
