package p100o000oOoO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0O0 {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OO0<?>[] f29495Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f29496Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f29497Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o0O0OO0<?>[] o0o0oo0Arr, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f29495Oooo0o = o0o0oo0Arr;
            this.f29496Oooo0oO = function2;
            this.f29497Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0OO0<?>[] o0o0oo0Arr = this.f29495Oooo0o;
            o00OO0O0.OooO00o((o0O0OO0[]) Arrays.copyOf(o0o0oo0Arr, o0o0oo0Arr.length), this.f29496Oooo0oO, ooo00o, this.f29497Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO00o(@NotNull o0O0OO0<?>[] values, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1390796515);
        ooo00oOooOOo.OooOOO(values);
        content.invoke(ooo00oOooOOo, Integer.valueOf((i >> 3) & 14));
        ooo00oOooOOo.OooOooo();
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(values, content, i));
    }

    @NotNull
    public static final <T> o0O0O0o0<T> OooO0O0(@NotNull o0OO<T> policy, @NotNull Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new o00OOOOo(policy, defaultFactory);
    }

    @NotNull
    public static final <T> o0O0O0o0<T> OooO0Oo(@NotNull Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new o0oo0000(defaultFactory);
    }
}
