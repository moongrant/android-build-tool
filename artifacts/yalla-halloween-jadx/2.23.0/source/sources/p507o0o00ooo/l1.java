package p507o0o00ooo;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f50025OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f50026OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Job> f50027OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f50028OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f50029OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(MutableState mutableState, MutableState mutableState2, Function1 function1, Function1 function2, CoroutineScope coroutineScope) {
        super(0);
        this.f50025OooO0Oo = coroutineScope;
        this.f50027OooO0o0 = mutableState;
        this.f50026OooO0o = function1;
        this.f50028OooO0oO = function2;
        this.f50029OooO0oo = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        j1 j1Var = j1.f49943OooO00o;
        MutableState<Job> mutableState = this.f50027OooO0o0;
        Job value = mutableState.getValue();
        if (value != null) {
            Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
        }
        mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.f50025OooO0Oo, null, null, new k1(this.f50026OooO0o, this.f50028OooO0oO, this.f50029OooO0oo, null), 3, null));
        return Unit.INSTANCE;
    }
}
