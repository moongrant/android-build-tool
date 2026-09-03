package p097o000o0oO;

import android.content.Context;
import coil.memory.MemoryCache;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109o000ooo.o000oOoO;
import p109o000ooo.o00O0O;
import p109o000ooo.o00oO0o;
import p321o0O0ooO.o000OO0O;
import p321o0O0ooO.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public interface o000O000 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f35419OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o000oOoO f35420OooO0O0 = o000OO0O.f42849OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o0000O0 f35421OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o00O0000 f35422OooO0Oo = new o00O0000();

        public OooO00o(@NotNull Context context) {
            this.f35419OooO00o = context.getApplicationContext();
        }

        @NotNull
        public final o000Oo0 OooO00o() {
            Context context = this.f35419OooO00o;
            o000oOoO o000oooo2 = this.f35420OooO0O0;
            Lazy lazy = LazyKt.lazy(new o0000O(this));
            Lazy lazy2 = LazyKt.lazy(new o0000OO0(this));
            Lazy lazy3 = LazyKt.lazy(o000.f35393OooO0Oo);
            o0000O0 o0000o1 = this.f35421OooO0OO;
            if (o0000o1 == null) {
                o0000o1 = new o0000O0();
            }
            return new o000Oo0(context, o000oooo2, lazy, lazy2, lazy3, o0000o1, this.f35422OooO0Oo);
        }
    }

    @NotNull
    o000oOoO OooO00o();

    @NotNull
    o00O0O OooO0O0(@NotNull coil.request.OooO00o oooO00o);

    @Nullable
    Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o00oO0o> continuation);

    @Nullable
    MemoryCache OooO0Oo();

    @NotNull
    o0000O0 getComponents();
}
