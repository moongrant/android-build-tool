package p118o00O0Oo;

import android.content.Context;
import coil.memory.MemoryCache;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import o00OO00O.OooOOOO;
import o00OO00O.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p131o00O0oo0.o00Oo0;
import p131o00O0oo0.o0Oo0oo;
import p131o00O0oo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public interface o00000O {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f36369OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o00Oo0 f36370OooO0O0 = OooOOOO.f37078OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o000OOo f36371OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final o0OoOo0 f36372OooO0Oo = new o0OoOo0();

        public OooO00o(@NotNull Context context) {
            this.f36369OooO00o = context.getApplicationContext();
        }

        @NotNull
        public final o0000Ooo OooO00o() {
            Context context = this.f36369OooO00o;
            o00Oo0 o00oo1 = this.f36370OooO0O0;
            Lazy lazy = LazyKt.lazy(new o000000O(this));
            Lazy lazy2 = LazyKt.lazy(new o00000(this));
            Lazy lazy3 = LazyKt.lazy(o00000O0.f36373OooO0Oo);
            o000OOo o000ooo2 = this.f36371OooO0OO;
            if (o000ooo2 == null) {
                o000ooo2 = new o000OOo();
            }
            return new o0000Ooo(context, o00oo1, lazy, lazy2, lazy3, o000ooo2, this.f36372OooO0Oo);
        }
    }

    @NotNull
    o00Oo0 OooO00o();

    @NotNull
    oo000o OooO0O0(@NotNull coil.request.OooO00o oooO00o);

    @Nullable
    Object OooO0OO(@NotNull coil.request.OooO00o oooO00o, @NotNull Continuation<? super o0Oo0oo> continuation);

    @Nullable
    MemoryCache OooO0Oo();

    @NotNull
    o000OOo getComponents();
}
