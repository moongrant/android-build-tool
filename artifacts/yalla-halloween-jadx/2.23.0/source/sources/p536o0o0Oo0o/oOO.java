package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.LazyListState;
import com.code.android.util.OooOOO;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f55175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55176OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(LazyListState lazyListState, CoroutineScope coroutineScope) {
        super(0);
        this.f55175OooO0Oo = coroutineScope;
        this.f55176OooO0o0 = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOO.OooO0OO(this.f55175OooO0Oo, new ooooO0O0(this.f55176OooO0o0, null));
        return Unit.INSTANCE;
    }
}
