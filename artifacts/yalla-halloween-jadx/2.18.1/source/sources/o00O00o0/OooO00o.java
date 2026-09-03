package o00O00o0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final C0333OooO00o<K, V> f30329OooO00o = new C0333OooO00o<>(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final HashMap<K, C0333OooO00o<K, V>> f30330OooO0O0 = new HashMap<>();

    /* JADX INFO: renamed from: o00O00o0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0333OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final K f30331OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public List<V> f30332OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public C0333OooO00o<K, V> f30333OooO0OO = this;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public C0333OooO00o<K, V> f30334OooO0Oo = this;

        public C0333OooO00o(@Nullable K k) {
            this.f30331OooO00o = k;
        }

        public final void OooO00o(@NotNull C0333OooO00o<K, V> c0333OooO00o) {
            Intrinsics.checkNotNullParameter(c0333OooO00o, "<set-?>");
            this.f30334OooO0Oo = c0333OooO00o;
        }

        public final void OooO0O0(@NotNull C0333OooO00o<K, V> c0333OooO00o) {
            Intrinsics.checkNotNullParameter(c0333OooO00o, "<set-?>");
            this.f30333OooO0OO = c0333OooO00o;
        }
    }

    public final <K, V> void OooO00o(C0333OooO00o<K, V> c0333OooO00o) {
        C0333OooO00o<K, V> c0333OooO00o2 = c0333OooO00o.f30334OooO0Oo;
        Objects.requireNonNull(c0333OooO00o2);
        Intrinsics.checkNotNullParameter(c0333OooO00o, "<set-?>");
        c0333OooO00o2.f30333OooO0OO = c0333OooO00o;
        C0333OooO00o<K, V> c0333OooO00o3 = c0333OooO00o.f30333OooO0OO;
        Objects.requireNonNull(c0333OooO00o3);
        Intrinsics.checkNotNullParameter(c0333OooO00o, "<set-?>");
        c0333OooO00o3.f30334OooO0Oo = c0333OooO00o;
    }

    public final void OooO0O0(K k, V v) {
        HashMap<K, C0333OooO00o<K, V>> map = this.f30330OooO0O0;
        C0333OooO00o<K, V> c0333OooO00o = map.get(k);
        if (c0333OooO00o == null) {
            c0333OooO00o = new C0333OooO00o<>(k);
            OooO0OO(c0333OooO00o);
            c0333OooO00o.OooO0O0(this.f30329OooO00o.f30333OooO0OO);
            c0333OooO00o.OooO00o(this.f30329OooO00o);
            OooO00o(c0333OooO00o);
            map.put(k, c0333OooO00o);
        }
        C0333OooO00o<K, V> c0333OooO00o2 = c0333OooO00o;
        ArrayList arrayList = c0333OooO00o2.f30332OooO0O0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            c0333OooO00o2.f30332OooO0O0 = arrayList;
        }
        arrayList.add(v);
    }

    public final <K, V> void OooO0OO(C0333OooO00o<K, V> c0333OooO00o) {
        c0333OooO00o.f30333OooO0OO.OooO00o(c0333OooO00o.f30334OooO0Oo);
        c0333OooO00o.f30334OooO0Oo.OooO0O0(c0333OooO00o.f30333OooO0OO);
    }

    @Nullable
    public final V OooO0Oo() {
        C0333OooO00o<K, V> c0333OooO00o = this.f30329OooO00o.f30333OooO0OO;
        while (true) {
            V v = null;
            if (Intrinsics.areEqual(c0333OooO00o, this.f30329OooO00o)) {
                return null;
            }
            List<V> list = c0333OooO00o.f30332OooO0O0;
            if (list != null) {
                v = (V) CollectionsKt.removeLastOrNull(list);
            }
            if (v != null) {
                return v;
            }
            OooO0OO(c0333OooO00o);
            HashMap<K, C0333OooO00o<K, V>> map = this.f30330OooO0O0;
            K k = c0333OooO00o.f30331OooO00o;
            Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            TypeIntrinsics.asMutableMap(map).remove(k);
            c0333OooO00o = c0333OooO00o.f30333OooO0OO;
        }
    }

    @Nullable
    public final V OooO0o0(K k) {
        HashMap<K, C0333OooO00o<K, V>> map = this.f30330OooO0O0;
        C0333OooO00o<K, V> c0333OooO00o = map.get(k);
        if (c0333OooO00o == null) {
            c0333OooO00o = new C0333OooO00o<>(k);
            map.put(k, c0333OooO00o);
        }
        C0333OooO00o<K, V> c0333OooO00o2 = c0333OooO00o;
        OooO0OO(c0333OooO00o2);
        c0333OooO00o2.OooO0O0(this.f30329OooO00o);
        c0333OooO00o2.OooO00o(this.f30329OooO00o.f30334OooO0Oo);
        OooO00o(c0333OooO00o2);
        List<V> list = c0333OooO00o2.f30332OooO0O0;
        if (list == null) {
            return null;
        }
        return (V) CollectionsKt.removeLastOrNull(list);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LinkedMultimap( ");
        C0333OooO00o<K, V> c0333OooO00o = this.f30329OooO00o.f30334OooO0Oo;
        while (!Intrinsics.areEqual(c0333OooO00o, this.f30329OooO00o)) {
            sbOooO0o0.append('{');
            sbOooO0o0.append(c0333OooO00o.f30331OooO00o);
            sbOooO0o0.append(':');
            List<V> list = c0333OooO00o.f30332OooO0O0;
            sbOooO0o0.append(list == null ? 0 : list.size());
            sbOooO0o0.append('}');
            c0333OooO00o = c0333OooO00o.f30334OooO0Oo;
            if (!Intrinsics.areEqual(c0333OooO00o, this.f30329OooO00o)) {
                sbOooO0o0.append(", ");
            }
        }
        sbOooO0o0.append(" )");
        String string = sbOooO0o0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
