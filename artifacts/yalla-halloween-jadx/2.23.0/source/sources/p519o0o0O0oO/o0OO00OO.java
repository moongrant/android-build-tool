package p519o0o0O0oO;

import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOOO;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p184o00o00o.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f52712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f52713OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f52714OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(CoroutineScope coroutineScope, MutableState<Integer> mutableState, Oooo000 oooo000) {
        super(1);
        this.f52712OooO0Oo = coroutineScope;
        this.f52714OooO0o0 = mutableState;
        this.f52713OooO0o = oooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (this.f52714OooO0o0.getValue().intValue() != iIntValue) {
            OooOOO.OooO0OO(this.f52712OooO0Oo, new oo0ooO(this.f52713OooO0o, iIntValue, null));
        }
        return Unit.INSTANCE;
    }
}
