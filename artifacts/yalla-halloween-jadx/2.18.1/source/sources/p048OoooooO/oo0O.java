package p048OoooooO;

import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class oo0O implements o00OOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f4205Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f4206Oooo0oO;

    public static final class OooO00o extends Lambda implements Function2<String, o00OOOO0.OooO0O0, String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f4207Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, o00OOOO0.OooO0O0 oooO0O0) {
            String acc = str;
            o00OOOO0.OooO0O0 element = oooO0O0;
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public oo0O(@NotNull o00OOOO0 outer, @NotNull o00OOOO0 inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f4205Oooo0o = outer;
        this.f4206Oooo0oO = inner;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p048OoooooO.o00OOOO0
    public final <R> R Oooo(R r, @NotNull Function2<? super R, ? super o00OOOO0.OooO0O0, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.f4206Oooo0oO.Oooo(this.f4205Oooo0o.Oooo(r, operation), operation);
    }

    @Override // p048OoooooO.o00OOOO0
    public final boolean OooooOo(@NotNull Function1<? super o00OOOO0.OooO0O0, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return this.f4205Oooo0o.OooooOo(predicate) && this.f4206Oooo0oO.OooooOo(predicate);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof oo0O) {
            oo0O oo0o = (oo0O) obj;
            if (Intrinsics.areEqual(this.f4205Oooo0o, oo0o.f4205Oooo0o) && Intrinsics.areEqual(this.f4206Oooo0oO, oo0o.f4206Oooo0oO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4206Oooo0oO.hashCode() * 31) + this.f4205Oooo0o.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p048OoooooO.o00OOOO0
    public final <R> R o0Oo0oo(R r, @NotNull Function2<? super o00OOOO0.OooO0O0, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.f4205Oooo0o.o0Oo0oo(this.f4206Oooo0oO.o0Oo0oo(r, operation), operation);
    }

    @NotNull
    public final String toString() {
        return o00oO0o.OooO0O0(o00O0O0O.OooO00o('['), (String) Oooo("", OooO00o.f4207Oooo0o), ']');
    }
}
