package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p101o000oo.o0000;
import p101o000oo.o00O000o;
import p101o000oo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Flow<Oooo000<T>> f10460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo0oOO0 f10461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000 f10462OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Oooo000.OooO0O0<T>> f10463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f10459OooO0o0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f10458OooO0o = new OooO00o();

    public static final class OooO00o implements o0000 {
        @Override // p101o000oo.o0000
        public final void OooO00o(@NotNull o00000 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        }
    }

    public static final class OooO0O0 implements oo0oOO0 {
        @Override // p101o000oo.oo0oOO0
        public final void OooO00o() {
        }

        @Override // p101o000oo.oo0oOO0
        public final void OooO0O0() {
        }
    }

    public /* synthetic */ o0OOO0o(Flow flow, oo0oOO0 oo0ooo0, o0000 o0000Var) {
        this(flow, oo0ooo0, o0000Var, o00O000o.f35515OooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(@NotNull Flow<? extends Oooo000<T>> flow, @NotNull oo0oOO0 uiReceiver, @NotNull o0000 hintReceiver, @NotNull Function0<Oooo000.OooO0O0<T>> cachedPageEvent) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(uiReceiver, "uiReceiver");
        Intrinsics.checkNotNullParameter(hintReceiver, "hintReceiver");
        Intrinsics.checkNotNullParameter(cachedPageEvent, "cachedPageEvent");
        this.f10460OooO00o = flow;
        this.f10461OooO0O0 = uiReceiver;
        this.f10462OooO0OO = hintReceiver;
        this.f10463OooO0Oo = cachedPageEvent;
    }
}
