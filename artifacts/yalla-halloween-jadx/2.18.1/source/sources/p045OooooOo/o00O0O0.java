package p045OooooOo;

import androidx.compose.runtime.Composable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 implements o00O0O00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f4010OooO0Oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o00O<o00O0O0, ?> f4011OooO0o0 = (o00OO000.OooO0OO) o00OO000.OooO00o(OooO00o.f4018Oooo0o, OooO0O0.f4019Oooo0o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<Object, Map<String, List<Object>>> f4012OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<Object, OooO0o> f4013OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public o00O0OO f4014OooO0OO;

    public static final class OooO extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Object f4016Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0o f4017Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Object obj, OooO0o oooO0o) {
            super(1);
            this.f4016Oooo0oO = obj;
            this.f4017Oooo0oo = oooO0o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            boolean z = !o00O0O0.this.f4013OooO0O0.containsKey(this.f4016Oooo0oO);
            Object obj = this.f4016Oooo0oO;
            if (z) {
                o00O0O0.this.f4012OooO00o.remove(obj);
                o00O0O0.this.f4013OooO0O0.put(this.f4016Oooo0oO, this.f4017Oooo0oo);
                return new o00O0O0O(this.f4017Oooo0oo, o00O0O0.this, this.f4016Oooo0oO);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    public static final class OooO00o extends Lambda implements Function2<o00OO00O, o00O0O0, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f4018Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, OooooOo.o00O0O0$OooO0o>] */
        @Override // kotlin.jvm.functions.Function2
        public final Map<Object, Map<String, ? extends List<? extends Object>>> invoke(o00OO00O o00oo00o, o00O0O0 o00o0o0) {
            o00OO00O Saver = o00oo00o;
            o00O0O0 it = o00o0o0;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            Map<Object, Map<String, List<Object>>> mutableMap = MapsKt.toMutableMap(it.f4012OooO00o);
            Iterator it2 = it.f4013OooO0O0.values().iterator();
            while (it2.hasNext()) {
                ((OooO0o) it2.next()).OooO00o(mutableMap);
            }
            if (mutableMap.isEmpty()) {
                return null;
            }
            return mutableMap;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Map<Object, Map<String, ? extends List<? extends Object>>>, o00O0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f4019Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o00O0O0 invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            Map<Object, Map<String, ? extends List<? extends Object>>> it = map;
            Intrinsics.checkNotNullParameter(it, "it");
            return new o00O0O0(it);
        }
    }

    public static final class OooO0OO {
    }

    public final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Object f4020OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f4021OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final o00O0OOO f4022OooO0OO;

        public static final class OooO00o extends Lambda implements Function1<Object, Boolean> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o00O0O0 f4023Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o00O0O0 o00o0o0) {
                super(1);
                this.f4023Oooo0o = o00o0o0;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                o00O0OO o00o0oo2 = this.f4023Oooo0o.f4014OooO0OO;
                return Boolean.valueOf(o00o0oo2 != null ? o00o0oo2.canBeSaved(it) : true);
            }
        }

        public OooO0o(@NotNull o00O0O0 o00o0o0, Object key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f4020OooO00o = key;
            this.f4021OooO0O0 = true;
            Map<String, List<Object>> map = o00o0o0.f4012OooO00o.get(key);
            OooO00o canBeSaved = new OooO00o(o00o0o0);
            o0O0O0o0<o00O0OO> o0o0o0o0 = oo0oOO0.f4048OooO00o;
            Intrinsics.checkNotNullParameter(canBeSaved, "canBeSaved");
            this.f4022OooO0OO = new o00O0OOO(map, canBeSaved);
        }

        public final void OooO00o(@NotNull Map<Object, Map<String, List<Object>>> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            if (this.f4021OooO0O0) {
                Map<String, List<Object>> mapOooO00o = this.f4022OooO0OO.OooO00o();
                if (mapOooO00o.isEmpty()) {
                    map.remove(this.f4020OooO00o);
                } else {
                    map.put(this.f4020OooO00o, mapOooO00o);
                }
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f4024Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Object f4026Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, Unit> f4027Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Object obj, Function2<? super oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f4026Oooo0oO = obj;
            this.f4027Oooo0oo = function2;
            this.f4024Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00O0O0.this.OooO00o(this.f4026Oooo0oO, this.f4027Oooo0oo, ooo00o, this.f4024Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public o00O0O0() {
        this(null, 1, null);
    }

    public o00O0O0(@NotNull Map<Object, Map<String, List<Object>>> savedStates) {
        Intrinsics.checkNotNullParameter(savedStates, "savedStates");
        this.f4012OooO00o = savedStates;
        this.f4013OooO0O0 = new LinkedHashMap();
    }

    @Override // p045OooooOo.o00O0O00
    @Composable
    public final void OooO00o(@NotNull Object key, @NotNull Function2<? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1198538093);
        ooo00oOooOOo.OooO0o0(444418301);
        ooo00oOooOOo.OooOOOO(key);
        ooo00oOooOOo.OooO0o0(-642722479);
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            o00O0OO o00o0oo2 = this.f4014OooO0OO;
            if (!(o00o0oo2 != null ? o00o0oo2.canBeSaved(key) : true)) {
                throw new IllegalArgumentException(("Type of the key " + key + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objOooO0o = new OooO0o(this, key);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        OooO0o oooO0o = (OooO0o) objOooO0o;
        o00OO0O0.OooO00o(new o0O0OO0[]{oo0oOO0.f4048OooO00o.OooO0O0(oooO0o.f4022OooO0OO)}, content, ooo00oOooOOo, (i & 112) | 8);
        o00Oo00.OooO0O0(Unit.INSTANCE, new OooO(key, oooO0o), ooo00oOooOOo);
        ooo00oOooOOo.Oooo0o0();
        ooo00oOooOOo.OooO0Oo();
        ooo00oOooOOo.Oooo0o0();
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0(key, content, i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, OooooOo.o00O0O0$OooO0o>] */
    @Override // p045OooooOo.o00O0O00
    public final void OooO0O0(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        OooO0o oooO0o = (OooO0o) this.f4013OooO0O0.get(key);
        if (oooO0o != null) {
            oooO0o.f4021OooO0O0 = false;
        } else {
            this.f4012OooO00o.remove(key);
        }
    }

    public o00O0O0(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        LinkedHashMap savedStates = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(savedStates, "savedStates");
        this.f4012OooO00o = savedStates;
        this.f4013OooO0O0 = new LinkedHashMap();
    }
}
