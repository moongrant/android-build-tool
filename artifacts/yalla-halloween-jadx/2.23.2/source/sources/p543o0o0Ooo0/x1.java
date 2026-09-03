package p543o0o0Ooo0;

import androidx.compose.foundation.lazy.LazyListState;
import com.code.android.util.OooOOO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f55712OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55713OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(LazyListState lazyListState, CoroutineScope coroutineScope) {
        super(0);
        this.f55712OooO0Oo = coroutineScope;
        this.f55713OooO0o0 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOO.OooO0OO(this.f55712OooO0Oo, new w1(this.f55713OooO0o0, null));
        return Unit.INSTANCE;
    }
}
