package o0000O0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O {

    public static final class OooO00o extends Lambda implements Function0<OooOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f27263Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOO0 oooOOO0) {
            super(0);
            this.f27263Oooo0o = oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() {
            return this.f27263Oooo0o;
        }
    }

    @NotNull
    public static OooOOO0 OooO00o(OooOOO0 oooOOO0, @NotNull OooOOO0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        other.OooO0Oo();
        oooOOO0.OooO0Oo();
        return other.OooO0OO(new OooO00o(oooOOO0));
    }

    @NotNull
    public static OooOOO0 OooO0O0(OooOOO0 oooOOO0, @NotNull Function0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return !Intrinsics.areEqual(oooOOO0, OooOOO0.OooO00o.f27268OooO00o) ? oooOOO0 : (OooOOO0) other.invoke();
    }
}
