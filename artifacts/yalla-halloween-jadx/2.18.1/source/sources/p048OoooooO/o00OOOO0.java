package p048OoooooO;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
public interface o00OOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f4197OooO00o = 0;

    public static final class OooO00o implements o00OOOO0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f4198Oooo0o = new OooO00o();

        @Override // p048OoooooO.o00OOOO0
        @NotNull
        public final o00OOOO0 OooOOoo(@NotNull o00OOOO0 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        @Override // p048OoooooO.o00OOOO0
        public final <R> R Oooo(R r, @NotNull Function2<? super R, ? super OooO0O0, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // p048OoooooO.o00OOOO0
        public final boolean OooooOo(@NotNull Function1<? super OooO0O0, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // p048OoooooO.o00OOOO0
        public final <R> R o0Oo0oo(R r, @NotNull Function2<? super OooO0O0, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @NotNull
        public final String toString() {
            return "Modifier";
        }
    }

    public interface OooO0O0 extends o00OOOO0 {
    }

    @NotNull
    o00OOOO0 OooOOoo(@NotNull o00OOOO0 o00oooo1);

    <R> R Oooo(R r, @NotNull Function2<? super R, ? super OooO0O0, ? extends R> function2);

    boolean OooooOo(@NotNull Function1<? super OooO0O0, Boolean> function1);

    <R> R o0Oo0oo(R r, @NotNull Function2<? super OooO0O0, ? super R, ? extends R> function2);
}
