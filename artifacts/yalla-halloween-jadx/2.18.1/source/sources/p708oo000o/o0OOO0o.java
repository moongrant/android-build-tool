package p708oo000o;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.graphics.vector.VectorComposeKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f53247Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Map<String, o0OoOo0> f53248Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(o00Ooo o00ooo2, Map<String, ? extends o0OoOo0> map) {
            super(2);
            this.f53247Oooo0o = o00ooo2;
            this.f53248Oooo0oO = map;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                o0OOO0o.OooO00o((o00O0O) this.f53247Oooo0o, this.f53248Oooo0oO, ooo00o2, 64, 0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f53249Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0O f53250Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Map<String, o0OoOo0> f53251Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f53252Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o00O0O o00o0o2, Map<String, ? extends o0OoOo0> map, int i, int i2) {
            super(2);
            this.f53250Oooo0o = o00o0o2;
            this.f53251Oooo0oO = map;
            this.f53252Oooo0oo = i;
            this.f53249Oooo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OOO0o.OooO00o(this.f53250Oooo0o, this.f53251Oooo0oO, ooo00o, this.f53252Oooo0oo | 1, this.f53249Oooo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements o0OoOo0 {
        @Override // p708oo000o.o0OoOo0
        public final Object OooO00o(oo0o0Oo property, Object obj) {
            Intrinsics.checkNotNullParameter(property, "property");
            return obj;
        }
    }

    public static final class OooO0o implements o0OoOo0 {
        @Override // p708oo000o.o0OoOo0
        public final Object OooO00o(oo0o0Oo property, Object obj) {
            Intrinsics.checkNotNullParameter(property, "property");
            return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x0152  */
    /* JADX WARN: Code duplicated, block: B:44:0x0158  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0219  */
    @ComposableTarget(applier = "androidx.compose.ui.graphics.vector.VectorComposable")
    @Composable
    public static final void OooO00o(@NotNull o00O0O group, @Nullable Map<String, ? extends o0OoOo0> map, @Nullable oOO00O ooo00o, int i, int i2) {
        int i3;
        Map<String, ? extends o0OoOo0> mapEmptyMap;
        Map<String, ? extends o0OoOo0> map2;
        Map<String, ? extends o0OoOo0> map3;
        Map<String, ? extends o0OoOo0> map4;
        o0OoOo0 oooO0o;
        o0OoOo0 oooO0OO;
        Intrinsics.checkNotNullParameter(group, "group");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-446179233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(group) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 16;
        }
        if (i4 == 2 && (i3 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            map2 = map;
        } else {
            ooo00oOooOOo.OooOOo0();
            if ((i & 1) == 0 || ooo00oOooOOo.Oooo000()) {
                if (i4 != 0) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                ooo00oOooOOo.Oooo0oO();
                for (o00Ooo o00ooo2 : group.f53215o000oOoO) {
                    if (o00ooo2 instanceof o0OO00O) {
                        ooo00oOooOOo.OooO0o0(-326285835);
                        o0OO00O o0oo00o2 = (o0OO00O) o00ooo2;
                        oooO0OO = mapEmptyMap.get(o0oo00o2.f53234OooO00o);
                        if (oooO0OO == null) {
                            oooO0OO = new OooO0OO();
                        }
                        o0OoOo0 o0oooo1 = oooO0OO;
                        VectorComposeKt.OooO0O0((List) o0oooo1.OooO00o(oo0o0Oo.OooO0OO.f53260OooO00o, o0oo00o2.f53235OooO0O0), o0oo00o2.f53236OooO0OO, o0oo00o2.f53234OooO00o, (o0Oo0oo) o0oooo1.OooO00o(oo0o0Oo.OooO00o.f53258OooO00o, o0oo00o2.f53237OooO0Oo), ((Number) o0oooo1.OooO00o(oo0o0Oo.OooO0O0.f53259OooO00o, Float.valueOf(o0oo00o2.f53239OooO0o0))).floatValue(), (o0Oo0oo) o0oooo1.OooO00o(oo0o0Oo.OooOOO.f53264OooO00o, o0oo00o2.f53238OooO0o), ((Number) o0oooo1.OooO00o(oo0o0Oo.OooOOOO.f53266OooO00o, Float.valueOf(o0oo00o2.f53240OooO0oO))).floatValue(), ((Number) o0oooo1.OooO00o(oo0o0Oo.OooOo00.f53268OooO00o, Float.valueOf(o0oo00o2.f53241OooO0oo))).floatValue(), o0oo00o2.f53233OooO, o0oo00o2.f53242OooOO0, o0oo00o2.f53243OooOO0O, ((Number) o0oooo1.OooO00o(oo0o0Oo.o0OoOo0.f53272OooO00o, Float.valueOf(o0oo00o2.f53244OooOO0o))).floatValue(), ((Number) o0oooo1.OooO00o(oo0o0Oo.Oooo0.f53269OooO00o, Float.valueOf(o0oo00o2.f53246OooOOO0))).floatValue(), ((Number) o0oooo1.OooO00o(oo0o0Oo.o000oOoO.f53271OooO00o, Float.valueOf(o0oo00o2.f53245OooOOO))).floatValue(), ooo00oOooOOo, 8, 0, 0);
                        ooo00oOooOOo.Oooo0o0();
                        mapEmptyMap = mapEmptyMap;
                    } else {
                        map3 = mapEmptyMap;
                        if (o00ooo2 instanceof o00O0O) {
                            ooo00oOooOOo.OooO0o0(-326283977);
                            o00O0O o00o0o2 = (o00O0O) o00ooo2;
                            map4 = map3;
                            oooO0o = map4.get(o00o0o2.f53207Oooo0o);
                            if (oooO0o == null) {
                                oooO0o = new OooO0o();
                            }
                            VectorComposeKt.OooO00o(o00o0o2.f53207Oooo0o, ((Number) oooO0o.OooO00o(oo0o0Oo.OooOO0.f53262OooO00o, Float.valueOf(o00o0o2.f53208Oooo0oO))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooO0o.f53261OooO00o, Float.valueOf(o00o0o2.f53209Oooo0oo))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooO.f53257OooO00o, Float.valueOf(o00o0o2.f53206Oooo))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooOO0O.f53263OooO00o, Float.valueOf(o00o0o2.f53212OoooO00))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooOOO0.f53265OooO00o, Float.valueOf(o00o0o2.f53211OoooO0))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooOo.f53267OooO00o, Float.valueOf(o00o0o2.f53213OoooO0O))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.Oooo000.f53270OooO00o, Float.valueOf(o00o0o2.f53210OoooO))).floatValue(), (List) oooO0o.OooO00o(oo0o0Oo.OooO0OO.f53260OooO00o, o00o0o2.f53214OoooOO0), o00O0000.OooO00o(ooo00oOooOOo, 1450046638, new OooO00o(o00ooo2, map4)), ooo00oOooOOo, 939524096, 0);
                            ooo00oOooOOo.Oooo0o0();
                        } else {
                            map4 = map3;
                            ooo00oOooOOo.OooO0o0(-326282507);
                            ooo00oOooOOo.Oooo0o0();
                        }
                        mapEmptyMap = map4;
                    }
                }
                map2 = mapEmptyMap;
            } else {
                ooo00oOooOOo.OooOoo0();
            }
            mapEmptyMap = map;
            ooo00oOooOOo.Oooo0oO();
            while (r22.hasNext()) {
                if (o00ooo2 instanceof o0OO00O) {
                    ooo00oOooOOo.OooO0o0(-326285835);
                    o0OO00O o0oo00o3 = (o0OO00O) o00ooo2;
                    oooO0OO = mapEmptyMap.get(o0oo00o3.f53234OooO00o);
                    if (oooO0OO == null) {
                        oooO0OO = new OooO0OO();
                    }
                    o0OoOo0 o0oooo2 = oooO0OO;
                    VectorComposeKt.OooO0O0((List) o0oooo2.OooO00o(oo0o0Oo.OooO0OO.f53260OooO00o, o0oo00o3.f53235OooO0O0), o0oo00o3.f53236OooO0OO, o0oo00o3.f53234OooO00o, (o0Oo0oo) o0oooo2.OooO00o(oo0o0Oo.OooO00o.f53258OooO00o, o0oo00o3.f53237OooO0Oo), ((Number) o0oooo2.OooO00o(oo0o0Oo.OooO0O0.f53259OooO00o, Float.valueOf(o0oo00o3.f53239OooO0o0))).floatValue(), (o0Oo0oo) o0oooo2.OooO00o(oo0o0Oo.OooOOO.f53264OooO00o, o0oo00o3.f53238OooO0o), ((Number) o0oooo2.OooO00o(oo0o0Oo.OooOOOO.f53266OooO00o, Float.valueOf(o0oo00o3.f53240OooO0oO))).floatValue(), ((Number) o0oooo2.OooO00o(oo0o0Oo.OooOo00.f53268OooO00o, Float.valueOf(o0oo00o3.f53241OooO0oo))).floatValue(), o0oo00o3.f53233OooO, o0oo00o3.f53242OooOO0, o0oo00o3.f53243OooOO0O, ((Number) o0oooo2.OooO00o(oo0o0Oo.o0OoOo0.f53272OooO00o, Float.valueOf(o0oo00o3.f53244OooOO0o))).floatValue(), ((Number) o0oooo2.OooO00o(oo0o0Oo.Oooo0.f53269OooO00o, Float.valueOf(o0oo00o3.f53246OooOOO0))).floatValue(), ((Number) o0oooo2.OooO00o(oo0o0Oo.o000oOoO.f53271OooO00o, Float.valueOf(o0oo00o3.f53245OooOOO))).floatValue(), ooo00oOooOOo, 8, 0, 0);
                    ooo00oOooOOo.Oooo0o0();
                    mapEmptyMap = mapEmptyMap;
                } else {
                    map3 = mapEmptyMap;
                    if (o00ooo2 instanceof o00O0O) {
                        ooo00oOooOOo.OooO0o0(-326283977);
                        o00O0O o00o0o3 = (o00O0O) o00ooo2;
                        map4 = map3;
                        oooO0o = map4.get(o00o0o3.f53207Oooo0o);
                        if (oooO0o == null) {
                            oooO0o = new OooO0o();
                        }
                        VectorComposeKt.OooO00o(o00o0o3.f53207Oooo0o, ((Number) oooO0o.OooO00o(oo0o0Oo.OooOO0.f53262OooO00o, Float.valueOf(o00o0o3.f53208Oooo0oO))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooO0o.f53261OooO00o, Float.valueOf(o00o0o3.f53209Oooo0oo))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooO.f53257OooO00o, Float.valueOf(o00o0o3.f53206Oooo))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooOO0O.f53263OooO00o, Float.valueOf(o00o0o3.f53212OoooO00))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooOOO0.f53265OooO00o, Float.valueOf(o00o0o3.f53211OoooO0))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.OooOo.f53267OooO00o, Float.valueOf(o00o0o3.f53213OoooO0O))).floatValue(), ((Number) oooO0o.OooO00o(oo0o0Oo.Oooo000.f53270OooO00o, Float.valueOf(o00o0o3.f53210OoooO))).floatValue(), (List) oooO0o.OooO00o(oo0o0Oo.OooO0OO.f53260OooO00o, o00o0o3.f53214OoooOO0), o00O0000.OooO00o(ooo00oOooOOo, 1450046638, new OooO00o(o00ooo2, map4)), ooo00oOooOOo, 939524096, 0);
                        ooo00oOooOOo.Oooo0o0();
                    } else {
                        map4 = map3;
                        ooo00oOooOOo.OooO0o0(-326282507);
                        ooo00oOooOOo.Oooo0o0();
                    }
                    mapEmptyMap = map4;
                }
            }
            map2 = mapEmptyMap;
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(group, map2, i, i2));
    }
}
