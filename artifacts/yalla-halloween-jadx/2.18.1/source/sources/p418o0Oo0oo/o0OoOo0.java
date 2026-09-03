package p418o0Oo0oo;

import OooO00o.OooO00o;
import androidx.compose.ui.input.pointer.PointerEventPass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f39752OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000000 f39753OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0OOO0o> f39754OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<o0OOO0o, o0Oo0oo> f39755OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o00Oo0 f39756OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Oooo000 f39757OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f39758OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f39759OooO0oo;

    public o0OoOo0(@NotNull o000000 pointerInputFilter) {
        Intrinsics.checkNotNullParameter(pointerInputFilter, "pointerInputFilter");
        this.f39753OooO0O0 = pointerInputFilter;
        this.f39754OooO0OO = new o000OOo<>(new o0OOO0o[16]);
        this.f39755OooO0Oo = new LinkedHashMap();
        this.f39759OooO0oo = true;
        this.f39752OooO = true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0208  */
    /* JADX WARN: Code duplicated, block: B:46:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x017f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0181  */
    /* JADX WARN: Code duplicated, block: B:51:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0186  */
    /* JADX WARN: Code duplicated, block: B:53:0x0188  */
    /* JADX WARN: Code duplicated, block: B:55:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x018d  */
    /* JADX WARN: Code duplicated, block: B:57:0x018f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0194  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x019c  */
    /* JADX WARN: Code duplicated, block: B:65:0x019e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.LinkedHashMap, java.util.Map<o0Oo0oo.o0OOO0o, o0Oo0oo.o0Oo0oo>] */
    @Override // p418o0Oo0oo.o00O0O
    public final boolean OooO00o(@NotNull Map<o0OOO0o, o0Oo0oo> changes, @NotNull Oooo000 parentCoordinates, @NotNull Oooo000 internalPointerEvent, boolean z) {
        o0Oo0oo o0oo0oo2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        int i2;
        boolean z8;
        boolean z9;
        boolean z10;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean zOooO00o = super.OooO00o(changes, parentCoordinates, internalPointerEvent, z);
        o000000 o000000Var = this.f39753OooO0O0;
        if (!o000000Var.f39669Oooo0oO) {
            return true;
        }
        this.f39757OooO0o0 = o000000Var.f39668Oooo0o;
        Iterator<Map.Entry<o0OOO0o, o0Oo0oo>> it = changes.entrySet().iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<o0OOO0o, o0Oo0oo> next = it.next();
            long j = next.getKey().f39740OooO00o;
            o0Oo0oo value = next.getValue();
            if (this.f39754OooO0OO.OooO0o(new o0OOO0o(j))) {
                ArrayList historical = new ArrayList();
                List<OooOo00> listOooO0O0 = value.OooO0O0();
                int size = listOooO0O0.size();
                while (i3 < size) {
                    OooOo00 oooOo00 = listOooO0O0.get(i3);
                    long j2 = oooOo00.f39657OooO00o;
                    Iterator<Map.Entry<o0OOO0o, o0Oo0oo>> it2 = it;
                    Oooo000 oooo000 = this.f39757OooO0o0;
                    Intrinsics.checkNotNull(oooo000);
                    historical.add(new OooOo00(j2, oooo000.OoooO0(parentCoordinates, oooOo00.f39658OooO0O0)));
                    i3++;
                    listOooO0O0 = listOooO0O0;
                    size = size;
                    it = it2;
                }
                Iterator<Map.Entry<o0OOO0o, o0Oo0oo>> it3 = it;
                Map<o0OOO0o, o0Oo0oo> map = this.f39755OooO0Oo;
                o0OOO0o o0ooo0o2 = new o0OOO0o(j);
                Oooo000 oooo001 = this.f39757OooO0o0;
                Intrinsics.checkNotNull(oooo001);
                long jOoooO0 = oooo001.OoooO0(parentCoordinates, value.f39746OooO0o);
                Oooo000 oooo002 = this.f39757OooO0o0;
                Intrinsics.checkNotNull(oooo002);
                long jOoooO1 = oooo002.OoooO0(parentCoordinates, value.f39744OooO0OO);
                long j3 = value.f39742OooO00o;
                long j4 = value.f39743OooO0O0;
                boolean z11 = value.f39745OooO0Oo;
                long j5 = value.f39747OooO0o0;
                boolean z12 = value.f39748OooO0oO;
                int i4 = value.f39749OooO0oo;
                long j6 = value.f39741OooO;
                Intrinsics.checkNotNullParameter(historical, "historical");
                o0Oo0oo o0oo0oo3 = new o0Oo0oo(j3, j4, jOoooO1, z11, j5, jOoooO0, z12, i4, historical, j6);
                o0oo0oo3.f39751OooOO0O = value.f39751OooOO0O;
                map.put(o0ooo0o2, o0oo0oo3);
                it = it3;
            }
        }
        if (this.f39755OooO0Oo.isEmpty()) {
            this.f39754OooO0OO.OooO0o0();
            this.f39722OooO00o.OooO0o0();
            return true;
        }
        for (int i5 = this.f39754OooO0OO.f3664Oooo0oo - 1; -1 < i5; i5--) {
            if (!changes.containsKey(new o0OOO0o(this.f39754OooO0OO.f3662Oooo0o[i5].f39740OooO00o))) {
                this.f39754OooO0OO.OooOOO0(i5);
            }
        }
        o00Oo0 o00oo1 = new o00Oo0(CollectionsKt.toList(this.f39755OooO0Oo.values()), internalPointerEvent);
        List<o0Oo0oo> list = o00oo1.f39723OooO00o;
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                o0oo0oo2 = null;
                break;
            }
            o0oo0oo2 = list.get(i6);
            if (internalPointerEvent.OooO00o(o0oo0oo2.f39742OooO00o)) {
                break;
            }
            i6++;
        }
        o0Oo0oo o0oo0oo4 = o0oo0oo2;
        if (o0oo0oo4 != null) {
            if (z) {
                if (!this.f39759OooO0oo && (o0oo0oo4.f39745OooO0Oo || o0oo0oo4.f39748OooO0oO)) {
                    Oooo000 oooo003 = this.f39757OooO0o0;
                    Intrinsics.checkNotNull(oooo003);
                    this.f39759OooO0oo = !o00Ooo.OooO0o0(o0oo0oo4, oooo003.OooO00o());
                }
                z4 = this.f39759OooO0oo;
                z5 = this.f39758OooO0oO;
                if (z4 == z5) {
                    i = o00oo1.f39726OooO0Oo;
                    if (i == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6 || !z5 || this.f39752OooO) {
                        if (i == 5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7 && z4 && o0oo0oo4.f39745OooO0Oo) {
                            o00oo1.f39726OooO0Oo = 3;
                        }
                    } else {
                        o00oo1.f39726OooO0Oo = 3;
                    }
                } else {
                    i2 = o00oo1.f39726OooO0Oo;
                    if (i2 == 3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        if (i2 == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (!z9) {
                            if (i2 == 5) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                i = o00oo1.f39726OooO0Oo;
                                if (i == 4) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    if (i == 5) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        o00oo1.f39726OooO0Oo = 3;
                                    }
                                } else {
                                    if (i == 5) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        o00oo1.f39726OooO0Oo = 3;
                                    }
                                }
                            }
                        }
                    }
                    o00oo1.f39726OooO0Oo = z4 ? 4 : 5;
                }
            } else {
                this.f39759OooO0oo = false;
            }
            z4 = this.f39759OooO0oo;
            z5 = this.f39758OooO0oO;
            if (z4 == z5) {
                i = o00oo1.f39726OooO0Oo;
                if (i == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (i == 5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        o00oo1.f39726OooO0Oo = 3;
                    }
                } else {
                    if (i == 5) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        o00oo1.f39726OooO0Oo = 3;
                    }
                }
            } else {
                i2 = o00oo1.f39726OooO0Oo;
                if (i2 == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    if (i2 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        if (i2 == 5) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i = o00oo1.f39726OooO0Oo;
                            if (i == 4) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (i == 5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    o00oo1.f39726OooO0Oo = 3;
                                }
                            } else {
                                if (i == 5) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    o00oo1.f39726OooO0Oo = 3;
                                }
                            }
                        }
                    }
                }
                o00oo1.f39726OooO0Oo = z4 ? 4 : 5;
            }
        }
        if (zOooO00o) {
            z2 = true;
        } else if (o00oo1.f39726OooO0Oo == 3) {
            o00Oo0 o00oo2 = this.f39756OooO0o;
            if (o00oo2 == null || o00oo2.f39723OooO00o.size() != o00oo1.f39723OooO00o.size()) {
                z3 = true;
                break;
            }
            int size3 = o00oo1.f39723OooO00o.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size3) {
                    z3 = false;
                    break;
                }
                if (!OooO.OooO00o(o00oo2.f39723OooO00o.get(i7).f39744OooO0OO, o00oo1.f39723OooO00o.get(i7).f39744OooO0OO)) {
                    z3 = true;
                    break;
                }
                i7++;
            }
            if (z3) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        this.f39756OooO0o = o00oo1;
        return z2;
    }

    @Override // p418o0Oo0oo.o00O0O
    public final void OooO0O0(@NotNull Oooo000 internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.OooO0O0(internalPointerEvent);
        o00Oo0 o00oo1 = this.f39756OooO0o;
        if (o00oo1 == null) {
            return;
        }
        this.f39758OooO0oO = this.f39759OooO0oo;
        List<o0Oo0oo> list = o00oo1.f39723OooO00o;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            o0Oo0oo o0oo0oo2 = list.get(i);
            if (o0oo0oo2.f39745OooO0Oo || (internalPointerEvent.OooO00o(o0oo0oo2.f39742OooO00o) && this.f39759OooO0oo)) {
                z = false;
            }
            if (z) {
                this.f39754OooO0OO.OooOO0O(new o0OOO0o(o0oo0oo2.f39742OooO00o));
            }
            i++;
        }
        this.f39759OooO0oo = false;
        this.f39752OooO = o00oo1.f39726OooO0Oo == 5;
    }

    public final void OooO0Oo() {
        o000OOo<o0OoOo0> o000ooo2 = this.f39722OooO00o;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
            do {
                o0oooo0Arr[i2].OooO0Oo();
                i2++;
            } while (i2 < i);
        }
        this.f39753OooO0O0.o0OO00O();
    }

    public final boolean OooO0o(@NotNull Map<o0OOO0o, o0Oo0oo> changes, @NotNull Oooo000 parentCoordinates, @NotNull Oooo000 internalPointerEvent, boolean z) {
        o000OOo<o0OoOo0> o000ooo2;
        int i;
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(parentCoordinates, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        int i2 = 0;
        if (this.f39755OooO0Oo.isEmpty() || !this.f39753OooO0O0.f39669Oooo0oO) {
            return false;
        }
        o00Oo0 o00oo1 = this.f39756OooO0o;
        Intrinsics.checkNotNull(o00oo1);
        Oooo000 oooo000 = this.f39757OooO0o0;
        Intrinsics.checkNotNull(oooo000);
        long jOooO00o = oooo000.OooO00o();
        this.f39753OooO0O0.oo0o0Oo(o00oo1, PointerEventPass.Initial, jOooO00o);
        if (this.f39753OooO0O0.f39669Oooo0oO && (i = (o000ooo2 = this.f39722OooO00o).f3664Oooo0oo) > 0) {
            o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
            do {
                o0OoOo0 o0oooo1 = o0oooo0Arr[i2];
                Map<o0OOO0o, o0Oo0oo> map = this.f39755OooO0Oo;
                Oooo000 oooo001 = this.f39757OooO0o0;
                Intrinsics.checkNotNull(oooo001);
                o0oooo1.OooO0o(map, oooo001, internalPointerEvent, z);
                i2++;
            } while (i2 < i);
        }
        o000000 o000000Var = this.f39753OooO0O0;
        if (o000000Var.f39669Oooo0oO) {
            o000000Var.oo0o0Oo(o00oo1, PointerEventPass.Main, jOooO00o);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.LinkedHashMap, java.util.Map<o0Oo0oo.o0OOO0o, o0Oo0oo.o0Oo0oo>] */
    public final boolean OooO0o0(@NotNull Oooo000 internalPointerEvent) {
        o000OOo<o0OoOo0> o000ooo2;
        int i;
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        boolean z = false;
        int i2 = 0;
        z = false;
        if (!this.f39755OooO0Oo.isEmpty() && this.f39753OooO0O0.f39669Oooo0oO) {
            o00Oo0 o00oo1 = this.f39756OooO0o;
            Intrinsics.checkNotNull(o00oo1);
            Oooo000 oooo000 = this.f39757OooO0o0;
            Intrinsics.checkNotNull(oooo000);
            this.f39753OooO0O0.oo0o0Oo(o00oo1, PointerEventPass.Final, oooo000.OooO00o());
            if (this.f39753OooO0O0.f39669Oooo0oO && (i = (o000ooo2 = this.f39722OooO00o).f3664Oooo0oo) > 0) {
                o0OoOo0[] o0oooo0Arr = o000ooo2.f3662Oooo0o;
                do {
                    o0oooo0Arr[i2].OooO0o0(internalPointerEvent);
                    i2++;
                } while (i2 < i);
            }
            z = true;
        }
        OooO0O0(internalPointerEvent);
        this.f39755OooO0Oo.clear();
        this.f39757OooO0o0 = null;
        return z;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Node(pointerInputFilter=");
        sbOooO0o0.append(this.f39753OooO0O0);
        sbOooO0o0.append(", children=");
        sbOooO0o0.append(this.f39722OooO00o);
        sbOooO0o0.append(", pointerIds=");
        sbOooO0o0.append(this.f39754OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
