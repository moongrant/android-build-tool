package androidx.paging;

import androidx.annotation.IntRange;
import com.code.android.paging.PagingLoadException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__IndentKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagingSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingSource.kt\nandroidx/paging/PagingSource\n+ 2 Logger.kt\nandroidx/paging/LoggerKt\n*L\n1#1,437:1\n41#2,10:438\n*S KotlinDebug\n*F\n+ 1 PagingSource.kt\nandroidx/paging/PagingSource\n*L\n371#1:438,10\n*E\n"})
public abstract class o0O0O00<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O00O.o0OOO0o<Function0<Unit>> f7348OooO00o = new o000O00O.o0OOO0o<>(OooO0OO.f7359OooO0Oo);

    public static abstract class OooO00o<Key> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7349OooO00o;

        /* JADX INFO: renamed from: androidx.paging.o0O0O00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0155OooO00o<Key> extends OooO00o<Key> {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final Key f7350OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155OooO00o(@NotNull Key key, int i, boolean z) {
                super(i, z);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f7350OooO0O0 = key;
            }

            @Override // androidx.paging.o0O0O00.OooO00o
            @NotNull
            public final Key OooO00o() {
                return this.f7350OooO0O0;
            }
        }

        public static final class OooO0O0<Key> extends OooO00o<Key> {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final Key f7351OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(@NotNull Key key, int i, boolean z) {
                super(i, z);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f7351OooO0O0 = key;
            }

            @Override // androidx.paging.o0O0O00.OooO00o
            @NotNull
            public final Key OooO00o() {
                return this.f7351OooO0O0;
            }
        }

        public static final class OooO0OO<Key> extends OooO00o<Key> {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public final Key f7352OooO0O0;

            public OooO0OO(@Nullable Key key, int i, boolean z) {
                super(i, z);
                this.f7352OooO0O0 = key;
            }

            @Override // androidx.paging.o0O0O00.OooO00o
            @Nullable
            public final Key OooO00o() {
                return this.f7352OooO0O0;
            }
        }

        public OooO00o(int i, boolean z) {
            this.f7349OooO00o = i;
        }

        @Nullable
        public abstract Key OooO00o();
    }

    public static final class OooO0OO extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f7359OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            Function0<? extends Unit> it = function0;
            Intrinsics.checkNotNullParameter(it, "it");
            it.invoke();
            return Unit.INSTANCE;
        }
    }

    public boolean OooO00o() {
        return false;
    }

    @Nullable
    public abstract Key OooO0O0(@NotNull o000000<Key, Value> o000000Var);

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final void OooO0OO() {
        boolean z;
        if (this.f7348OooO00o.OooO00o()) {
            o000O00O.o0OO00O o0oo00o2 = o000O00O.oo0o0Oo.f34666OooO00o;
            if (o0oo00o2 != null) {
                z = o0oo00o2.OooO0O0(3);
            }
            if (z) {
                o0oo00o2.OooO00o(3, "Invalidated PagingSource " + this);
            }
        }
    }

    @Nullable
    public abstract Object OooO0Oo(@NotNull OooO00o<Key> oooO00o, @NotNull Continuation<? super OooO0O0<Key, Value>> continuation);

    public static abstract class OooO0O0<Key, Value> {

        public static final class OooO00o<Key, Value> extends OooO0O0<Key, Value> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final Throwable f7353OooO0Oo;

            public OooO00o(@NotNull PagingLoadException throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f7353OooO0Oo = throwable;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO00o) && Intrinsics.areEqual(this.f7353OooO0Oo, ((OooO00o) obj).f7353OooO0Oo);
            }

            public final int hashCode() {
                return this.f7353OooO0Oo.hashCode();
            }

            @NotNull
            public final String toString() {
                return StringsKt__IndentKt.trimMargin$default("LoadResult.Error(\n                    |   throwable: " + this.f7353OooO0Oo + "\n                    |) ", null, 1, null);
            }
        }

        /* JADX INFO: renamed from: androidx.paging.o0O0O00$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0156OooO0O0<Key, Value> extends OooO0O0<Key, Value> {
            @NotNull
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        public static final class OooO0OO<Key, Value> extends OooO0O0<Key, Value> implements Iterable<Value>, KMappedMarker {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            @NotNull
            public final List<Value> f7354OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            @Nullable
            public final Key f7355OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            @Nullable
            public final Key f7356OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final int f7357OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final int f7358OooO0oo;

            static {
                new OooO0OO(CollectionsKt.emptyList(), null, null, 0, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OooO0OO(@NotNull List data, @Nullable Integer num, @Nullable Integer num2, @IntRange(from = -2147483648L) int i, @IntRange(from = -2147483648L) int i2) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.f7354OooO0Oo = data;
                this.f7356OooO0o0 = num;
                this.f7355OooO0o = num2;
                this.f7357OooO0oO = i;
                this.f7358OooO0oo = i2;
                if (!(i == Integer.MIN_VALUE || i >= 0)) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
                }
                if (!(i2 == Integer.MIN_VALUE || i2 >= 0)) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0OO)) {
                    return false;
                }
                OooO0OO oooO0OO = (OooO0OO) obj;
                return Intrinsics.areEqual(this.f7354OooO0Oo, oooO0OO.f7354OooO0Oo) && Intrinsics.areEqual(this.f7356OooO0o0, oooO0OO.f7356OooO0o0) && Intrinsics.areEqual(this.f7355OooO0o, oooO0OO.f7355OooO0o) && this.f7357OooO0oO == oooO0OO.f7357OooO0oO && this.f7358OooO0oo == oooO0OO.f7358OooO0oo;
            }

            public final int hashCode() {
                int iHashCode = this.f7354OooO0Oo.hashCode() * 31;
                Key key = this.f7356OooO0o0;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f7355OooO0o;
                return ((((iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + this.f7357OooO0oO) * 31) + this.f7358OooO0oo;
            }

            @Override // java.lang.Iterable
            @NotNull
            public final Iterator<Value> iterator() {
                return this.f7354OooO0Oo.listIterator();
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List<Value> list = this.f7354OooO0Oo;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(CollectionsKt.firstOrNull((List) list));
                sb.append("\n                    |   last Item: ");
                sb.append(CollectionsKt.lastOrNull((List) list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.f7355OooO0o);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.f7356OooO0o0);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.f7357OooO0oO);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.f7358OooO0oo);
                sb.append("\n                    |) ");
                return StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public OooO0OO(@Nullable Integer num, @Nullable Integer num2, @NotNull List data) {
                this(data, num, num2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                Intrinsics.checkNotNullParameter(data, "data");
            }
        }
    }
}
