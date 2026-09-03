package p032OoooO0;

import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p054o00000oo.o000O;
import p054o00000oo.o000OOo0;
import p054o00000oo.o00O00;
import p054o00000oo.o00O000o;
import p054o00000oo.o00OO000;
import p054o00000oo.o00OOO00;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f3171OooO00o = new OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OoooO0.o00O0O0O$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0023OooO00o extends Lambda implements Function1<List<? extends o000O>, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o000OOo0 f3172Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ Function1<oo0oOO0, Unit> f3173Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0023OooO00o(o000OOo0 o000ooo1, Function1<? super oo0oOO0, Unit> function1) {
                super(1);
                this.f3172Oooo0o = o000ooo1;
                this.f3173Oooo0oO = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(List<? extends o000O> list) {
                List<? extends o000O> it = list;
                Intrinsics.checkNotNullParameter(it, "it");
                this.f3173Oooo0oO.invoke(this.f3172Oooo0o.OooO00o(it));
                return Unit.INSTANCE;
            }
        }

        @JvmStatic
        @NotNull
        public final o00OOO00 OooO00o(@NotNull o00OO000 textInputService, @NotNull oo0oOO0 value, @NotNull o000OOo0 editProcessor, @NotNull o00O00 imeOptions, @NotNull Function1<? super oo0oOO0, Unit> onValueChange, @NotNull Function1<? super o00O000o, Unit> onImeActionPerformed) {
            Intrinsics.checkNotNullParameter(textInputService, "textInputService");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            C0023OooO00o onEditCommand = new C0023OooO00o(editProcessor, onValueChange);
            Objects.requireNonNull(textInputService);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
            Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
            Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
            textInputService.f27198OooO00o.OooO0Oo(value, imeOptions, onEditCommand, onImeActionPerformed);
            o00OOO00 o00ooo01 = new o00OOO00(textInputService, textInputService.f27198OooO00o);
            textInputService.f27199OooO0O0.set(o00ooo01);
            return o00ooo01;
        }
    }
}
