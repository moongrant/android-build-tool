package p516o0o0O00o;

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
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51505OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f51506OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Job> f51507OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f51508OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f51509OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(MutableState mutableState, MutableState mutableState2, Function1 function1, Function1 function2, CoroutineScope coroutineScope) {
        super(0);
        this.f51505OooO0Oo = coroutineScope;
        this.f51507OooO0o0 = mutableState;
        this.f51506OooO0o = function1;
        this.f51508OooO0oO = function2;
        this.f51509OooO0oo = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OoO00O o0ooo00o2 = o0OoO00O.f51610OooO00o;
        MutableState<Job> mutableState = this.f51507OooO0o0;
        Job value = mutableState.getValue();
        if (value != null) {
            Job.DefaultImpls.cancel$default(value, (CancellationException) null, 1, (Object) null);
        }
        mutableState.setValue(BuildersKt__Builders_commonKt.launch$default(this.f51505OooO0Oo, null, null, new o0O00O0o(this.f51506OooO0o, this.f51508OooO0oO, this.f51509OooO0oo, null), 3, null));
        return Unit.INSTANCE;
    }
}
