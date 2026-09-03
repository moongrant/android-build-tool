package androidx.compose.ui.platform;

import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function1<o00O000o, Unit> f6560OooO00o = OooO00o.f6562Oooo0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f6561OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<o00O000o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6562Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O000o o00o000o2) {
            Intrinsics.checkNotNullParameter(o00o000o2, "$this$null");
            return Unit.INSTANCE;
        }
    }

    @PublishedApi
    @NotNull
    public static final p048OoooooO.o00OOOO0 OooO00o(@NotNull p048OoooooO.o00OOOO0 o00oooo1, @NotNull p048OoooooO.o00OOOO0 wrapped) {
        Function1<o00O000o, Unit> inspectorInfo = f6560OooO00o;
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        o0O0ooO o0o0ooo = new o0O0ooO();
        return o00oooo1.OooOOoo(o0o0ooo).OooOOoo(wrapped).OooOOoo(o0o0ooo.f6614Oooo0oO);
    }
}
