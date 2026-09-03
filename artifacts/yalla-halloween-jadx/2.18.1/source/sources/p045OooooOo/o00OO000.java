package p045OooooOo;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O<Object, Object> f4038OooO00o = (OooO0OO) OooO00o(OooO00o.f4039Oooo0o, OooO0O0.f4040Oooo0o);

    public static final class OooO00o extends Lambda implements Function2<o00OO00O, Object, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f4039Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO00O o00oo00o, Object obj) {
            o00OO00O Saver = o00oo00o;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            return obj;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Object, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f4040Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    public static final class OooO0OO<Original, Saveable> implements o00O<Original, Saveable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function2<o00OO00O, Original, Saveable> f4041OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Function1<Saveable, Original> f4042OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function2<? super o00OO00O, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.f4041OooO00o = function2;
            this.f4042OooO0O0 = function1;
        }

        @Override // p045OooooOo.o00O
        @Nullable
        public final Original OooO00o(@NotNull Saveable value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return this.f4042OooO0O0.invoke(value);
        }

        @Override // p045OooooOo.o00O
        @Nullable
        public final Saveable OooO0O0(@NotNull o00OO00O o00oo00o, Original original) {
            Intrinsics.checkNotNullParameter(o00oo00o, "<this>");
            return this.f4041OooO00o.invoke(o00oo00o, original);
        }
    }

    @NotNull
    public static final <Original, Saveable> o00O<Original, Saveable> OooO00o(@NotNull Function2<? super o00OO00O, ? super Original, ? extends Saveable> save, @NotNull Function1<? super Saveable, ? extends Original> restore) {
        Intrinsics.checkNotNullParameter(save, "save");
        Intrinsics.checkNotNullParameter(restore, "restore");
        return new OooO0OO(save, restore);
    }
}
