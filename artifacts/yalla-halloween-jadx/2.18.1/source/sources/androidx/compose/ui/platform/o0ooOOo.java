package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {
    public static final boolean OooO00o(o00000O0.o00O0O o00o0o2) {
        o00000O0.OooOOOO oooOOOOOooO0o = o00o0o2.OooO0o();
        o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26973OooO00o;
        return o00000O0.OooOo00.OooO00o(oooOOOOOooO0o, o00000O0.oo000o.f26981OooOO0) == null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    public static final boolean OooO0O0(o00000O0.o00O0O o00o0o2) {
        LayoutNode layoutNodeOooO0o;
        o00000O0.OooOo oooOoOooO0Oo;
        boolean zAreEqual;
        o00000O0.OooOOOO oooOOOOOooO0OO;
        o00000O0.OooOOOO oooOOOO = o00o0o2.f26948OooO0o0;
        o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26915OooO00o;
        if (oooOOOO.OooO0O0(o00000O0.OooOOO.f26914OooO)) {
            o00000O0.OooOOOO oooOOOO2 = o00o0o2.f26948OooO0o0;
            o00000O0.oo000o oo000oVar = o00000O0.oo000o.f26973OooO00o;
            if (Intrinsics.areEqual(o00000O0.OooOo00.OooO00o(oooOOOO2, o00000O0.oo000o.f26983OooOO0o), Boolean.TRUE)) {
                layoutNodeOooO0o = OooO0o(o00o0o2.f26949OooO0oO, o00oO0o.f6559Oooo0o);
                if (layoutNodeOooO0o != null) {
                    return false;
                }
                oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(layoutNodeOooO0o);
                if (oooOoOooO0Oo != null || (oooOOOOOooO0OO = oooOoOooO0Oo.OooO0OO()) == null) {
                    zAreEqual = false;
                } else {
                    o00000O0.oo000o oo000oVar2 = o00000O0.oo000o.f26973OooO00o;
                    zAreEqual = Intrinsics.areEqual(o00000O0.OooOo00.OooO00o(oooOOOOOooO0OO, o00000O0.oo000o.f26983OooOO0o), Boolean.TRUE);
                }
                if (!zAreEqual) {
                    return false;
                }
            }
        } else {
            layoutNodeOooO0o = OooO0o(o00o0o2.f26949OooO0oO, o00oO0o.f6559Oooo0o);
            if (layoutNodeOooO0o != null) {
                return false;
            }
            oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(layoutNodeOooO0o);
            if (oooOoOooO0Oo != null) {
                zAreEqual = false;
            } else {
                zAreEqual = false;
            }
            if (!zAreEqual) {
                return false;
            }
        }
        return true;
    }

    public static final boolean OooO0OO(o00000O0.o00O0O o00o0o2) {
        return o00o0o2.f26949OooO0oO.f6152OooooO0 == LayoutDirection.Rtl;
    }

    public static final boolean OooO0Oo(o00000O0.o00O0O o00o0o2) {
        o00000O0.OooOOOO oooOOOO = o00o0o2.f26948OooO0o0;
        o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26915OooO00o;
        return oooOOOO.OooO0O0(o00000O0.OooOOO.f26914OooO);
    }

    public static final LayoutNode OooO0o(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode layoutNodeOooOOoo = layoutNode.OooOOoo(); layoutNodeOooOOoo != null; layoutNodeOooOOoo = layoutNodeOooOOoo.OooOOoo()) {
            if (function1.invoke(layoutNodeOooOOoo).booleanValue()) {
                return layoutNodeOooOOoo;
            }
        }
        return null;
    }

    @Nullable
    public static final o00O OooO0o0(@NotNull List<o00O> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).f6451Oooo0o == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final void OooO0oO(Region region, o00000O0.o00O0O o00o0o2, Map<Integer, o00OO000> map, o00000O0.o00O0O o00o0o3) {
        o00000O0.OooOo oooOoOooO0OO;
        o00O0O.OooOO0O oooOO0O;
        LayoutNode layoutNode;
        LayoutNode layoutNode2 = o00o0o3.f26949OooO0oO;
        boolean z = (layoutNode2.f6156Oooooo0 && layoutNode2.OooOoo0()) ? false : true;
        if (!region.isEmpty() || o00o0o3.f26947OooO0o == o00o0o2.f26947OooO0o) {
            if (!z || o00o0o3.f26945OooO0OO) {
                if (!o00o0o3.f26948OooO0o0.f26935Oooo0oO || (oooOoOooO0OO = o00000O0.o00Oo0.OooO0OO(o00o0o3.f26949OooO0oO)) == null) {
                    oooOoOooO0OO = o00o0o3.f26943OooO00o;
                }
                if (oooOoOooO0OO.f26651Oooo) {
                    o00000O0.OooOOOO oooOOOOO0ooOO0 = ((o00000O0.Oooo000) oooOoOooO0OO.f26653Oooo0oO).o0ooOO0();
                    o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26915OooO00o;
                    if (o00000O0.OooOo00.OooO00o(oooOOOOO0ooOO0, o00000O0.OooOOO.f26917OooO0OO) != null) {
                        o000000.oo000o oo000oVar = oooOoOooO0OO.f26652Oooo0o;
                        if (oo000oVar.OooOoO()) {
                            o0O0O00.Oooo000 oooo000OooO0Oo = o0O0O00.Oooo0.OooO0Oo(oo000oVar);
                            o00O0O.OooO0o oooO0o = oo000oVar.f26712OooooO0;
                            if (oooO0o == null) {
                                oooO0o = new o00O0O.OooO0o();
                                oo000oVar.f26712OooooO0 = oooO0o;
                            }
                            long jO0OO00O = oo000oVar.o0OO00O(oo000oVar.o00000O());
                            oooO0o.f30398OooO00o = -o00O0O.OooOo00.OooO0Oo(jO0OO00O);
                            oooO0o.f30399OooO0O0 = -o00O0O.OooOo00.OooO0O0(jO0OO00O);
                            oooO0o.f30400OooO0OO = o00O0O.OooOo00.OooO0Oo(jO0OO00O) + oo000oVar.OoooOoO();
                            oooO0o.f30401OooO0Oo = o00O0O.OooOo00.OooO0O0(jO0OO00O) + oo000oVar.OoooOOO();
                            while (true) {
                                if (oo000oVar == oooo000OooO0Oo) {
                                    Intrinsics.checkNotNullParameter(oooO0o, "<this>");
                                    oooOO0O = new o00O0O.OooOO0O(oooO0o.f30398OooO00o, oooO0o.f30399OooO0O0, oooO0o.f30400OooO0OO, oooO0o.f30401OooO0Oo);
                                    break;
                                }
                                oo000oVar.o0000O(oooO0o, false, true);
                                if (oooO0o.OooO0O0()) {
                                    oooOO0O = o00O0O.OooOO0O.f30402OooO0o;
                                    break;
                                } else {
                                    oo000oVar = oo000oVar.f26701OoooO0;
                                    Intrinsics.checkNotNull(oo000oVar);
                                }
                            }
                        } else {
                            oooOO0O = o00O0O.OooOO0O.f30402OooO0o;
                        }
                    } else {
                        oooOO0O = o0O0O00.Oooo0.OooO0O0(oooOoOooO0OO.f26652Oooo0o);
                    }
                } else {
                    oooOO0O = o00O0O.OooOO0O.f30402OooO0o;
                }
                Rect rectOooO00o = p145o00Oo0.o000O0.OooO00o(oooOO0O);
                Region region2 = new Region();
                region2.set(rectOooO00o);
                int i = o00o0o3.f26947OooO0o;
                if (i == o00o0o2.f26947OooO0o) {
                    i = -1;
                }
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(i);
                    Rect bounds = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                    map.put(numValueOf, new o00OO000(o00o0o3, bounds));
                    List listOooO0o0 = o00o0o3.OooO0o0(false);
                    for (int size = listOooO0o0.size() - 1; -1 < size; size--) {
                        OooO0oO(region, o00o0o2, map, (o00000O0.o00O0O) listOooO0o0.get(size));
                    }
                    region.op(rectOooO00o, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (o00o0o3.f26945OooO0OO) {
                    o00000O0.o00O0O o00o0oOooO0oO = o00o0o3.OooO0oO();
                    map.put(Integer.valueOf(i), new o00OO000(o00o0o3, p145o00Oo0.o000O0.OooO00o((o00o0oOooO0oO == null || (layoutNode = o00o0oOooO0oO.f26949OooO0oO) == null || !layoutNode.f6156Oooooo0) ? false : true ? o00o0oOooO0oO.OooO0Oo() : new o00O0O.OooOO0O(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10.0f, 10.0f))));
                } else if (i == -1) {
                    Integer numValueOf2 = Integer.valueOf(i);
                    Rect bounds2 = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                    map.put(numValueOf2, new o00OO000(o00o0o3, bounds2));
                }
            }
        }
    }
}
