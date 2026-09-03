package p047Oooooo0;

import androidx.compose.runtime.Stable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000O;
import p039OoooOoO.o0000O00;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00OO<K, V> implements Map<K, V>, o0oOOo, KMutableMap {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Collection<V> f4099Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public OooO00o f4100Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Set<Map.Entry<K, V>> f4101Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Set<K> f4102Oooo0oo;

    public static final class OooO00o<K, V> extends o0O0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public o00000O<K, ? extends V> f4103OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f4104OooO0Oo;

        public OooO00o(@NotNull o00000O<K, ? extends V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.f4103OooO0OO = map;
        }

        @Override // p047Oooooo0.o0O0o
        public final void OooO00o(@NotNull o0O0o value) {
            Intrinsics.checkNotNullParameter(value, "value");
            OooO00o oooO00o = (OooO00o) value;
            Object obj = o00OOO00.f4125OooO00o;
            synchronized (o00OOO00.f4125OooO00o) {
                this.f4103OooO0OO = oooO00o.f4103OooO0OO;
                this.f4104OooO0Oo = oooO00o.f4104OooO0Oo;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // p047Oooooo0.o0O0o
        @NotNull
        public final o0O0o OooO0O0() {
            return new OooO00o(this.f4103OooO0OO);
        }

        public final void OooO0OO(@NotNull o00000O<K, ? extends V> o00000o) {
            Intrinsics.checkNotNullParameter(o00000o, "<set-?>");
            this.f4103OooO0OO = o00000o;
        }
    }

    public o00OO() {
        o0000O00.OooO00o oooO00o = o0000O00.f3729Oooo0oo;
        this.f4100Oooo0o = new OooO00o(o0000O00.f3728Oooo);
        this.f4101Oooo0oO = new oo0oOO0(this);
        this.f4102Oooo0oo = new o00O(this);
        this.f4099Oooo = new o00OO00O(this);
    }

    @Override // p047Oooooo0.o0oOOo
    @NotNull
    public final o0O0o OooO00o() {
        return this.f4100Oooo0o;
    }

    public final int OooO0O0() {
        return OooO0OO().f4104OooO0Oo;
    }

    @NotNull
    public final OooO00o<K, V> OooO0OO() {
        return (OooO00o) oo0o0O0.OooOOo0(this.f4100Oooo0o, this);
    }

    @Override // p047Oooooo0.o0oOOo
    public final void OooO0oo(@NotNull o0O0o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4100Oooo0o = (OooO00o) value;
    }

    @Override // p047Oooooo0.o0oOOo
    public final /* synthetic */ o0O0o OooOOOO(o0O0o o0o0o, o0O0o o0o0o2, o0O0o o0o0o3) {
        oo00oO.OooO00o(o0o0o, o0o0o2, o0o0o3);
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        oo00o oo00oVarOooO;
        OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4100Oooo0o, oo0o0O0.OooO());
        o0000O00.OooO00o oooO00o2 = o0000O00.f3729Oooo0oo;
        o0000O00 o0000o00 = o0000O00.f3728Oooo;
        if (o0000o00 != oooO00o.f4103OooO0OO) {
            Object obj = o00OOO00.f4125OooO00o;
            synchronized (o00OOO00.f4125OooO00o) {
                OooO00o oooO00o3 = this.f4100Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    OooO00o oooO00o4 = (OooO00o) oo0o0O0.OooOo0(oooO00o3, this, oo00oVarOooO);
                    oooO00o4.OooO0OO(o0000o00);
                    oooO00o4.f4104OooO0Oo++;
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO0OO().f4103OooO0OO.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return OooO0OO().f4103OooO0OO.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f4101Oooo0oO;
    }

    @Override // java.util.Map
    @Nullable
    public final V get(Object obj) {
        return OooO0OO().f4103OooO0OO.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return OooO0OO().f4103OooO0OO.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f4102Oooo0oo;
    }

    @Override // java.util.Map
    @Nullable
    public final V put(K k, V v) {
        o00000O<K, ? extends V> o00000o;
        int i;
        V vPut;
        oo00o oo00oVarOooO;
        boolean z;
        do {
            Object obj = o00OOO00.f4125OooO00o;
            Object obj2 = o00OOO00.f4125OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4100Oooo0o, oo0o0O0.OooO());
                o00000o = oooO00o.f4103OooO0OO;
                i = oooO00o.f4104OooO0Oo;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o);
            o00000O.OooO00o<K, ? extends V> oooO00oOooO0o = o00000o.OooO0o();
            vPut = oooO00oOooO0o.put(k, v);
            o00000O<K, ? extends V> o00000oBuild = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000oBuild, o00000o)) {
                break;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4100Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                    z = true;
                    if (oooO00o3.f4104OooO0Oo == i) {
                        oooO00o3.OooO0OO(o00000oBuild);
                        oooO00o3.f4104OooO0Oo++;
                    } else {
                        z = false;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return vPut;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005d */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void putAll(@NotNull Map<? extends K, ? extends V> from) {
        o00000O<K, ? extends V> o00000o;
        int i;
        oo00o oo00oVarOooO;
        boolean z;
        Intrinsics.checkNotNullParameter(from, "from");
        do {
            Object obj = o00OOO00.f4125OooO00o;
            Object obj2 = o00OOO00.f4125OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4100Oooo0o, oo0o0O0.OooO());
                o00000o = oooO00o.f4103OooO0OO;
                i = oooO00o.f4104OooO0Oo;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o);
            o00000O.OooO00o<K, ? extends V> oooO00oOooO0o = o00000o.OooO0o();
            oooO00oOooO0o.putAll(from);
            o00000O<K, ? extends V> o00000oBuild = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000oBuild, o00000o)) {
                return;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4100Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        z = true;
                        if (oooO00o3.f4104OooO0Oo == i) {
                            oooO00o3.OooO0OO(o00000oBuild);
                            oooO00o3.f4104OooO0Oo++;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
    }

    @Override // java.util.Map
    @Nullable
    public final V remove(Object obj) {
        o00000O<K, ? extends V> o00000o;
        int i;
        V vRemove;
        oo00o oo00oVarOooO;
        boolean z;
        do {
            Object obj2 = o00OOO00.f4125OooO00o;
            Object obj3 = o00OOO00.f4125OooO00o;
            synchronized (obj3) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4100Oooo0o, oo0o0O0.OooO());
                o00000o = oooO00o.f4103OooO0OO;
                i = oooO00o.f4104OooO0Oo;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o);
            o00000O.OooO00o<K, ? extends V> oooO00oOooO0o = o00000o.OooO0o();
            vRemove = oooO00oOooO0o.remove(obj);
            o00000O<K, ? extends V> o00000oBuild = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000oBuild, o00000o)) {
                break;
            }
            synchronized (obj3) {
                OooO00o oooO00o2 = this.f4100Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                    z = true;
                    if (oooO00o3.f4104OooO0Oo == i) {
                        oooO00o3.OooO0OO(o00000oBuild);
                        oooO00o3.f4104OooO0Oo++;
                    } else {
                        z = false;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return OooO0OO().f4103OooO0OO.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f4099Oooo;
    }
}
