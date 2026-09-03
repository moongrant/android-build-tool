package o00OO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public class OooO00o extends ViewModel {
    public static final int $stable = 8;

    @NotNull
    private final Lazy showLoadingDialog$delegate = LazyKt.lazy(C0338OooO00o.f31171Oooo0o);

    /* JADX INFO: renamed from: o00OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0338OooO00o extends Lambda implements Function0<o0O00OO<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0338OooO00o f31171Oooo0o = new C0338OooO00o();

        public C0338OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00OO<Boolean> invoke() {
            return o0OOO00.OooO0Oo(Boolean.FALSE);
        }
    }

    @NotNull
    public final o0O00OO<Boolean> getShowLoadingDialog() {
        return (o0O00OO) this.showLoadingDialog$delegate.getValue();
    }
}
