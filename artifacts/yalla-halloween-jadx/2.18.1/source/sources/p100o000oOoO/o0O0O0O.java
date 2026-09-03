package p100o000oOoO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o0O0000O> f29548OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f29549OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f29550OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<o0O0000O> f29551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f29552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, o0oOO> f29553OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<HashMap<Object, LinkedHashSet<o0O0000O>>> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<Object, LinkedHashSet<o0O0000O>> invoke() {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            HashMap<Object, LinkedHashSet<o0O0000O>> map = new HashMap<>();
            o0O0O0O o0o0o0o = o0O0O0O.this;
            int size = o0o0o0o.f29548OooO00o.size();
            for (int i = 0; i < size; i++) {
                o0O0000O o0o0000o2 = o0o0o0o.f29548OooO00o.get(i);
                Object o0o00000 = o0o0000o2.f29519OooO0O0 != null ? new o0O00000(Integer.valueOf(o0o0000o2.f29518OooO00o), o0o0000o2.f29519OooO0O0) : Integer.valueOf(o0o0000o2.f29518OooO00o);
                LinkedHashSet<o0O0000O> linkedHashSet = map.get(o0o00000);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    map.put(o0o00000, linkedHashSet);
                }
                linkedHashSet.add(o0o0000o2);
            }
            return map;
        }
    }

    public o0O0O0O(@NotNull List<o0O0000O> keyInfos, int i) {
        Intrinsics.checkNotNullParameter(keyInfos, "keyInfos");
        this.f29548OooO00o = keyInfos;
        this.f29549OooO0O0 = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Invalid start index".toString());
        }
        this.f29551OooO0Oo = new ArrayList();
        HashMap<Integer, o0oOO> map = new HashMap<>();
        int size = keyInfos.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            o0O0000O o0o0000o2 = this.f29548OooO00o.get(i3);
            map.put(Integer.valueOf(o0o0000o2.f29520OooO0OO), new o0oOO(i3, i2, o0o0000o2.f29521OooO0Oo));
            i2 += o0o0000o2.f29521OooO0Oo;
        }
        this.f29553OooO0o0 = map;
        this.f29552OooO0o = LazyKt.lazy(new OooO00o());
    }

    public final int OooO00o(@NotNull o0O0000O keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        o0oOO o0ooo2 = this.f29553OooO0o0.get(Integer.valueOf(keyInfo.f29520OooO0OO));
        if (o0ooo2 != null) {
            return o0ooo2.f29672OooO0O0;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o000oOoO.o0O0000O>] */
    public final boolean OooO0O0(@NotNull o0O0000O keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        return this.f29551OooO0Oo.add(keyInfo);
    }

    public final void OooO0OO(@NotNull o0O0000O keyInfo, int i) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        this.f29553OooO0o0.put(Integer.valueOf(keyInfo.f29520OooO0OO), new o0oOO(-1, i, 0));
    }

    public final boolean OooO0Oo(int i, int i2) {
        int i3;
        o0oOO o0ooo2 = this.f29553OooO0o0.get(Integer.valueOf(i));
        if (o0ooo2 == null) {
            return false;
        }
        int i4 = o0ooo2.f29672OooO0O0;
        int i5 = i2 - o0ooo2.f29673OooO0OO;
        o0ooo2.f29673OooO0OO = i2;
        if (i5 == 0) {
            return true;
        }
        Collection<o0oOO> collectionValues = this.f29553OooO0o0.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "groupInfos.values");
        for (o0oOO o0ooo3 : collectionValues) {
            if (o0ooo3.f29672OooO0O0 >= i4 && !Intrinsics.areEqual(o0ooo3, o0ooo2) && (i3 = o0ooo3.f29672OooO0O0 + i5) >= 0) {
                o0ooo3.f29672OooO0O0 = i3;
            }
        }
        return true;
    }

    public final int OooO0o0(@NotNull o0O0000O keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        o0oOO o0ooo2 = this.f29553OooO0o0.get(Integer.valueOf(keyInfo.f29520OooO0OO));
        return o0ooo2 != null ? o0ooo2.f29673OooO0OO : keyInfo.f29521OooO0Oo;
    }
}
