package p059o0000Ooo;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p301o0O0Oooo.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00oOoo f27659OooO00o = new o00oOoo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final HashMap<K, V> f27660OooO0O0 = new HashMap<>(0, 0.75f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<K> f27661OooO0OO = new LinkedHashSet<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f27662OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f27663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27664OooO0o0;

    @Nullable
    public final V OooO00o(K k) {
        synchronized (this.f27659OooO00o) {
            V v = this.f27660OooO0O0.get(k);
            if (v == null) {
                this.f27663OooO0o++;
                return null;
            }
            this.f27661OooO0OO.remove(k);
            this.f27661OooO0OO.add(k);
            this.f27664OooO0o0++;
            return v;
        }
    }

    @Nullable
    public final V OooO0O0(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw null;
        }
        synchronized (this.f27659OooO00o) {
            this.f27662OooO0Oo = OooO0Oo() + 1;
            vPut = this.f27660OooO0O0.put(k, v);
            if (vPut != null) {
                this.f27662OooO0Oo = OooO0Oo() - 1;
            }
            if (this.f27661OooO0OO.contains(k)) {
                this.f27661OooO0OO.remove(k);
            }
            this.f27661OooO0OO.add(k);
        }
        OooO0o0();
        return vPut;
    }

    @Nullable
    public final V OooO0OO(K k) {
        V vRemove;
        Objects.requireNonNull(k);
        synchronized (this.f27659OooO00o) {
            vRemove = this.f27660OooO0O0.remove(k);
            this.f27661OooO0OO.remove(k);
            if (vRemove != null) {
                this.f27662OooO0Oo = OooO0Oo() - 1;
            }
            Unit unit = Unit.INSTANCE;
        }
        return vRemove;
    }

    @JvmName(name = "size")
    public final int OooO0Oo() {
        int i;
        synchronized (this.f27659OooO00o) {
            i = this.f27662OooO0Oo;
        }
        return i;
    }

    public final void OooO0o0() {
        Object objFirst;
        V v;
        while (true) {
            synchronized (this.f27659OooO00o) {
                if (OooO0Oo() < 0 || ((this.f27660OooO0O0.isEmpty() && OooO0Oo() != 0) || this.f27660OooO0O0.isEmpty() != this.f27661OooO0OO.isEmpty())) {
                    break;
                }
                objFirst = null;
                if (OooO0Oo() <= 16 || this.f27660OooO0O0.isEmpty()) {
                    v = null;
                } else {
                    objFirst = CollectionsKt.first(this.f27661OooO0OO);
                    v = this.f27660OooO0O0.get(objFirst);
                    if (v == null) {
                        throw new IllegalStateException("inconsistent state");
                    }
                    TypeIntrinsics.asMutableMap(this.f27660OooO0O0).remove(objFirst);
                    TypeIntrinsics.asMutableCollection(this.f27661OooO0OO).remove(objFirst);
                    int iOooO0Oo = OooO0Oo();
                    Intrinsics.checkNotNull(objFirst);
                    Intrinsics.checkNotNull(v);
                    this.f27662OooO0Oo = iOooO0Oo - 1;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (objFirst == null && v == null) {
                return;
            }
            Intrinsics.checkNotNull(objFirst);
            Intrinsics.checkNotNull(v);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    @NotNull
    public final String toString() {
        String str;
        synchronized (this.f27659OooO00o) {
            int i = this.f27664OooO0o0;
            int i2 = this.f27663OooO0o + i;
            str = "LruCache[maxSize=16,hits=" + this.f27664OooO0o0 + ",misses=" + this.f27663OooO0o + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
