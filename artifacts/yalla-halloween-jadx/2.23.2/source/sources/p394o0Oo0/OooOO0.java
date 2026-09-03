package p394o0Oo0;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class OooOO0 extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    private final Lazy showLoadingDialog$delegate = LazyKt.lazy(OooO00o.f43616OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43616OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }
    }

    @NotNull
    public final MutableState<Boolean> getShowLoadingDialog() {
        return (MutableState) this.showLoadingDialog$delegate.getValue();
    }
}
