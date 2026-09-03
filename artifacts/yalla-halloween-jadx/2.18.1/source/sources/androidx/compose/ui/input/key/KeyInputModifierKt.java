package androidx.compose.ui.input.key;

import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p076o000OOo.OooOOO0;
import p076o000OOo.OooOo00;
import p650o0ooOoO.f;
import p650o0ooOoO.h;

/* JADX INFO: loaded from: classes.dex */
public final class KeyInputModifierKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00<h> f6080OooO00o = OooOOO0.OooO00o(OooO00o.f6081Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<h> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6081Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ h invoke() {
            return null;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull Function1<? super f, Boolean> onKeyEvent) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oOoo.OooO00o(o00oooo1, new h(onKeyEvent, null));
    }
}
