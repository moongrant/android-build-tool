package p089o000o000;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO<T> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f29064OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Flow<o0000O0O<T>> f29065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO000 f29066OooO0O0;

    public static final class OooO00o implements o00OO000 {
        @Override // p089o000o000.o00OO000
        public final void OooO00o() {
        }

        @Override // p089o000o000.o00OO000
        public final void OooO0O0(@NotNull o00OO0O0 viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
        }

        @Override // p089o000o000.o00OO000
        public final void refresh() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0ooO(@NotNull Flow<? extends o0000O0O<T>> flow, @NotNull o00OO000 receiver) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        this.f29065OooO00o = flow;
        this.f29066OooO0O0 = receiver;
    }
}
