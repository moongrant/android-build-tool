package p089o000o000;

import androidx.annotation.IntRange;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O00o0<Key, Value> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo<Function0<Unit>> f28941OooO00o = new oo0o0Oo<>(OooO0OO.f28953Oooo0o);

    public static abstract class OooO00o<Key> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f28942OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f28943OooO0O0;

        /* JADX INFO: renamed from: o000o000.o00O00o0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0311OooO00o<Key> extends OooO00o<Key> {

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @NotNull
            public final Key f28944OooO0OO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0311OooO00o(@NotNull Key key, int i, boolean z) {
                super(i, z);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f28944OooO0OO = key;
            }

            @Override // o000o000.o00O00o0.OooO00o
            @NotNull
            public final Key OooO00o() {
                return this.f28944OooO0OO;
            }
        }

        public static final class OooO0O0<Key> extends OooO00o<Key> {

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @NotNull
            public final Key f28945OooO0OO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(@NotNull Key key, int i, boolean z) {
                super(i, z);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f28945OooO0OO = key;
            }

            @Override // o000o000.o00O00o0.OooO00o
            @NotNull
            public final Key OooO00o() {
                return this.f28945OooO0OO;
            }
        }

        public static final class OooO0OO<Key> extends OooO00o<Key> {

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @Nullable
            public final Key f28946OooO0OO;

            public OooO0OO(@Nullable Key key, int i, boolean z) {
                super(i, z);
                this.f28946OooO0OO = key;
            }

            @Override // o000o000.o00O00o0.OooO00o
            @Nullable
            public final Key OooO00o() {
                return this.f28946OooO0OO;
            }
        }

        public OooO00o(int i, boolean z) {
            this.f28942OooO00o = i;
            this.f28943OooO0O0 = z;
        }

        @Nullable
        public abstract Key OooO00o();
    }

    public static final class OooO0OO extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f28953Oooo0o = new OooO0OO();

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
    public abstract Key OooO0O0(@NotNull o00O0<Key, Value> o00o1);

    public final void OooO0OO() {
        this.f28941OooO00o.OooO00o();
    }

    @Nullable
    public abstract Object OooO0Oo(@NotNull OooO00o<Key> oooO00o, @NotNull Continuation<? super OooO0O0<Key, Value>> continuation);

    public static abstract class OooO0O0<Key, Value> {

        public static final class OooO00o<Key, Value> extends OooO0O0<Key, Value> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final Throwable f28947OooO00o;

            public OooO00o(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f28947OooO00o = throwable;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO00o) && Intrinsics.areEqual(this.f28947OooO00o, ((OooO00o) obj).f28947OooO00o);
            }

            public final int hashCode() {
                return this.f28947OooO00o.hashCode();
            }

            @NotNull
            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error(throwable=");
                sbOooO0o0.append(this.f28947OooO00o);
                sbOooO0o0.append(')');
                return sbOooO0o0.toString();
            }
        }

        /* JADX INFO: renamed from: o000o000.o00O00o0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0312OooO0O0<Key, Value> extends OooO0O0<Key, Value> {
        }

        public static final class OooO0OO<Key, Value> extends OooO0O0<Key, Value> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final List<Value> f28948OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public final Key f28949OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @Nullable
            public final Key f28950OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final int f28951OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final int f28952OooO0o0;

            static {
                new OooO0OO(CollectionsKt.emptyList(), null, null, 0, 0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public OooO0OO(@NotNull List<? extends Value> data, @Nullable Key key, @Nullable Key key2, @IntRange(from = -2147483648L) int i, @IntRange(from = -2147483648L) int i2) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.f28948OooO00o = data;
                this.f28949OooO0O0 = key;
                this.f28950OooO0OO = key2;
                this.f28951OooO0Oo = i;
                this.f28952OooO0o0 = i2;
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
                return Intrinsics.areEqual(this.f28948OooO00o, oooO0OO.f28948OooO00o) && Intrinsics.areEqual(this.f28949OooO0O0, oooO0OO.f28949OooO0O0) && Intrinsics.areEqual(this.f28950OooO0OO, oooO0OO.f28950OooO0OO) && this.f28951OooO0Oo == oooO0OO.f28951OooO0Oo && this.f28952OooO0o0 == oooO0OO.f28952OooO0o0;
            }

            public final int hashCode() {
                int iHashCode = this.f28948OooO00o.hashCode() * 31;
                Key key = this.f28949OooO0O0;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f28950OooO0OO;
                return ((((iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + this.f28951OooO0Oo) * 31) + this.f28952OooO0o0;
            }

            @NotNull
            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Page(data=");
                sbOooO0o0.append(this.f28948OooO00o);
                sbOooO0o0.append(", prevKey=");
                sbOooO0o0.append(this.f28949OooO0O0);
                sbOooO0o0.append(", nextKey=");
                sbOooO0o0.append(this.f28950OooO0OO);
                sbOooO0o0.append(", itemsBefore=");
                sbOooO0o0.append(this.f28951OooO0Oo);
                sbOooO0o0.append(", itemsAfter=");
                return o0O0ooO.OooO00o(sbOooO0o0, this.f28952OooO0o0, ')');
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public OooO0OO(@NotNull List<? extends Value> data, @Nullable Key key, @Nullable Key key2) {
                this(data, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                Intrinsics.checkNotNullParameter(data, "data");
            }
        }
    }
}
