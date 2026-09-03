package p650o0ooo;

import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOOO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f58603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000000 f58604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f58605OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(CoroutineScope coroutineScope, MutableState<Integer> mutableState, o000000 o000000Var) {
        super(1);
        this.f58603OooO0Oo = coroutineScope;
        this.f58605OooO0o0 = mutableState;
        this.f58604OooO0o = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (this.f58605OooO0o0.getValue().intValue() != iIntValue) {
            OooOOO.OooO0OO(this.f58603OooO0Oo, new o0O0000O(this.f58604OooO0o, iIntValue, null));
        }
        return Unit.INSTANCE;
    }
}
