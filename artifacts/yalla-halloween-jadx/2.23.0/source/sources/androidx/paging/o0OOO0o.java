package androidx.paging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import o000O00O.o000O00;
import o000O00O.o00O00;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Flow<Oooo000<T>> f7366OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O00 f7367OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000O00O.o0ooOOo f7368OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Function0<Oooo000.OooO0O0<T>> f7369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f7365OooO0o0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f7364OooO0o = new OooO00o();

    public static final class OooO00o implements o000O00O.o0ooOOo {
        @Override // o000O00O.o0ooOOo
        public final void OooO00o(@NotNull o00000 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        }
    }

    public static final class OooO0O0 implements o00O00 {
        @Override // o000O00O.o00O00
        public final void OooO00o() {
        }

        @Override // o000O00O.o00O00
        public final void OooO0O0() {
        }
    }

    public /* synthetic */ o0OOO0o(Flow flow, o00O00 o00o01, o000O00O.o0ooOOo o0ooooo) {
        this(flow, o00o01, o0ooooo, o000O00.f34521OooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(@NotNull Flow<? extends Oooo000<T>> flow, @NotNull o00O00 uiReceiver, @NotNull o000O00O.o0ooOOo hintReceiver, @NotNull Function0<Oooo000.OooO0O0<T>> cachedPageEvent) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(uiReceiver, "uiReceiver");
        Intrinsics.checkNotNullParameter(hintReceiver, "hintReceiver");
        Intrinsics.checkNotNullParameter(cachedPageEvent, "cachedPageEvent");
        this.f7366OooO00o = flow;
        this.f7367OooO0O0 = uiReceiver;
        this.f7368OooO0OO = hintReceiver;
        this.f7369OooO0Oo = cachedPageEvent;
    }
}
