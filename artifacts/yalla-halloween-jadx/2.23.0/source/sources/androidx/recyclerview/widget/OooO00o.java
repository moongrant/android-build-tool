package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements o0Oo0oo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC0160OooO00o f7494OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO.OooOO0 f7491OooO00o = new o000OO.OooOO0(30);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f7492OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<OooO0O0> f7493OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f7495OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0Oo0oo f7496OooO0o0 = new o0Oo0oo(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0160OooO00o {
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7497OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7498OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Object f7499OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7500OooO0Oo;

        public OooO0O0(int i, int i2, int i3, Object obj) {
            this.f7497OooO00o = i;
            this.f7498OooO0O0 = i2;
            this.f7500OooO0Oo = i3;
            this.f7499OooO0OO = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            int i = this.f7497OooO00o;
            if (i != oooO0O0.f7497OooO00o) {
                return false;
            }
            if (i == 8 && Math.abs(this.f7500OooO0Oo - this.f7498OooO0O0) == 1 && this.f7500OooO0Oo == oooO0O0.f7498OooO0O0 && this.f7498OooO0O0 == oooO0O0.f7500OooO0Oo) {
                return true;
            }
            if (this.f7500OooO0Oo != oooO0O0.f7500OooO0Oo || this.f7498OooO0O0 != oooO0O0.f7498OooO0O0) {
                return false;
            }
            Object obj2 = this.f7499OooO0OO;
            if (obj2 != null) {
                if (!obj2.equals(oooO0O0.f7499OooO0OO)) {
                    return false;
                }
            } else if (oooO0O0.f7499OooO0OO != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f7497OooO00o * 31) + this.f7498OooO0O0) * 31) + this.f7500OooO0Oo;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f7497OooO00o;
            if (i == 1) {
                str = "add";
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f7498OooO0O0);
            sb.append("c:");
            sb.append(this.f7500OooO0Oo);
            sb.append(",p:");
            sb.append(this.f7499OooO0OO);
            sb.append("]");
            return sb.toString();
        }
    }

    public OooO00o(RecyclerView.OooOO0 oooOO1) {
        this.f7494OooO0Oo = oooOO1;
    }

    public final void OooO(OooO0O0 oooO0O0) {
        this.f7493OooO0OO.add(oooO0O0);
        int i = oooO0O0.f7497OooO00o;
        InterfaceC0160OooO00o interfaceC0160OooO00o = this.f7494OooO0Oo;
        if (i == 1) {
            int i2 = oooO0O0.f7498OooO0O0;
            int i3 = oooO0O0.f7500OooO0Oo;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = oooO0O0.f7498OooO0O0;
            int i5 = oooO0O0.f7500OooO0Oo;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = oooO0O0.f7498OooO0O0;
            int i7 = oooO0O0.f7500OooO0Oo;
            Object obj = oooO0O0.f7499OooO0OO;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + oooO0O0);
        }
        int i8 = oooO0O0.f7498OooO0O0;
        int i9 = oooO0O0.f7500OooO0Oo;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    public final boolean OooO00o(int i) {
        ArrayList<OooO0O0> arrayList = this.f7493OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = arrayList.get(i2);
            int i3 = oooO0O0.f7497OooO00o;
            if (i3 == 8) {
                if (OooO0o(oooO0O0.f7500OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = oooO0O0.f7498OooO0O0;
                int i5 = oooO0O0.f7500OooO0Oo + i4;
                while (i4 < i5) {
                    if (OooO0o(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void OooO0O0() {
        ArrayList<OooO0O0> arrayList = this.f7493OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.OooOO0) this.f7494OooO0Oo).OooO00o(arrayList.get(i));
        }
        OooOO0o(arrayList);
        this.f7495OooO0o = 0;
    }

    public final void OooO0OO() {
        OooO0O0();
        ArrayList<OooO0O0> arrayList = this.f7492OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = arrayList.get(i);
            int i2 = oooO0O0.f7497OooO00o;
            InterfaceC0160OooO00o interfaceC0160OooO00o = this.f7494OooO0Oo;
            if (i2 == 1) {
                RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) interfaceC0160OooO00o;
                oooOO1.OooO00o(oooO0O0);
                int i3 = oooO0O0.f7498OooO0O0;
                int i4 = oooO0O0.f7500OooO0Oo;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                RecyclerView.OooOO0 oooOO2 = (RecyclerView.OooOO0) interfaceC0160OooO00o;
                oooOO2.OooO00o(oooO0O0);
                int i5 = oooO0O0.f7498OooO0O0;
                int i6 = oooO0O0.f7500OooO0Oo;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f7670OooO0OO += i6;
            } else if (i2 == 4) {
                RecyclerView.OooOO0 oooOO3 = (RecyclerView.OooOO0) interfaceC0160OooO00o;
                oooOO3.OooO00o(oooO0O0);
                int i7 = oooO0O0.f7498OooO0O0;
                int i8 = oooO0O0.f7500OooO0Oo;
                Object obj = oooO0O0.f7499OooO0OO;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                RecyclerView.OooOO0 oooOO4 = (RecyclerView.OooOO0) interfaceC0160OooO00o;
                oooOO4.OooO00o(oooO0O0);
                int i9 = oooO0O0.f7498OooO0O0;
                int i10 = oooO0O0.f7500OooO0Oo;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        OooOO0o(arrayList);
        this.f7495OooO0o = 0;
    }

    public final void OooO0Oo(OooO0O0 oooO0O0) {
        int i;
        o000OO.OooOO0 oooOO1;
        int i2 = oooO0O0.f7497OooO00o;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iOooOOO0 = OooOOO0(oooO0O0.f7498OooO0O0, i2);
        int i3 = oooO0O0.f7498OooO0O0;
        int i4 = oooO0O0.f7497OooO00o;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + oooO0O0);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = oooO0O0.f7500OooO0Oo;
            oooOO1 = this.f7491OooO00o;
            if (i5 >= i7) {
                break;
            }
            int iOooOOO1 = OooOOO0((i * i5) + oooO0O0.f7498OooO0O0, oooO0O0.f7497OooO00o);
            int i8 = oooO0O0.f7497OooO00o;
            if (i8 == 2 ? iOooOOO1 == iOooOOO0 : i8 == 4 && iOooOOO1 == iOooOOO0 + 1) {
                i6++;
            } else {
                OooO0O0 oooO0O0OooO0oo = OooO0oo(i8, iOooOOO0, i6, oooO0O0.f7499OooO0OO);
                OooO0o0(oooO0O0OooO0oo, i3);
                oooO0O0OooO0oo.f7499OooO0OO = null;
                oooOO1.OooO00o(oooO0O0OooO0oo);
                if (oooO0O0.f7497OooO00o == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iOooOOO0 = iOooOOO1;
            }
            i5++;
        }
        Object obj = oooO0O0.f7499OooO0OO;
        oooO0O0.f7499OooO0OO = null;
        oooOO1.OooO00o(oooO0O0);
        if (i6 > 0) {
            OooO0O0 oooO0O0OooO0oo2 = OooO0oo(oooO0O0.f7497OooO00o, iOooOOO0, i6, obj);
            OooO0o0(oooO0O0OooO0oo2, i3);
            oooO0O0OooO0oo2.f7499OooO0OO = null;
            oooOO1.OooO00o(oooO0O0OooO0oo2);
        }
    }

    public final int OooO0o(int i, int i2) {
        ArrayList<OooO0O0> arrayList = this.f7493OooO0OO;
        int size = arrayList.size();
        while (i2 < size) {
            OooO0O0 oooO0O0 = arrayList.get(i2);
            int i3 = oooO0O0.f7497OooO00o;
            if (i3 == 8) {
                int i4 = oooO0O0.f7498OooO0O0;
                if (i4 == i) {
                    i = oooO0O0.f7500OooO0Oo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (oooO0O0.f7500OooO0Oo <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = oooO0O0.f7498OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = oooO0O0.f7500OooO0Oo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += oooO0O0.f7500OooO0Oo;
                }
            }
            i2++;
        }
        return i;
    }

    public final void OooO0o0(OooO0O0 oooO0O0, int i) {
        RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) this.f7494OooO0Oo;
        oooOO1.OooO00o(oooO0O0);
        int i2 = oooO0O0.f7497OooO00o;
        if (i2 == 2) {
            int i3 = oooO0O0.f7500OooO0Oo;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i3, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f7670OooO0OO += i3;
            return;
        }
        if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i4 = oooO0O0.f7500OooO0Oo;
        Object obj = oooO0O0.f7499OooO0OO;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i, i4, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final boolean OooO0oO() {
        return this.f7492OooO0O0.size() > 0;
    }

    public final OooO0O0 OooO0oo(int i, int i2, int i3, Object obj) {
        OooO0O0 oooO0O0 = (OooO0O0) this.f7491OooO00o.OooO0O0();
        if (oooO0O0 == null) {
            return new OooO0O0(i, i2, i3, obj);
        }
        oooO0O0.f7497OooO00o = i;
        oooO0O0.f7498OooO0O0 = i2;
        oooO0O0.f7500OooO0Oo = i3;
        oooO0O0.f7499OooO0OO = obj;
        return oooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:201:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187  */
    public final void OooOO0() {
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        boolean z;
        byte b2;
        OooO0O0 oooO0O0OooO0oo;
        int i5;
        int i6;
        int i7;
        OooO0O0 oooO0O0OooO0oo2;
        boolean z2;
        boolean z3;
        OooO0O0 oooO0O0OooO0oo3;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList<OooO0O0> arrayList = this.f7492OooO0O0;
        o0Oo0oo o0oo0oo2 = this.f7496OooO0o0;
        o0oo0oo2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                i = 8;
                b = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f7497OooO00o != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            i2 = 4;
            i3 = 2;
            if (size == -1) {
                break;
            }
            int i16 = size + 1;
            OooO0O0 oooO0O0 = arrayList.get(size);
            OooO0O0 oooO0O1 = arrayList.get(i16);
            int i17 = oooO0O1.f7497OooO00o;
            if (i17 != 1) {
                o0Oo0oo.OooO00o oooO00o = o0oo0oo2.f7823OooO00o;
                if (i17 == 2) {
                    int i18 = oooO0O0.f7498OooO0O0;
                    int i19 = oooO0O0.f7500OooO0Oo;
                    if (i18 < i19) {
                        if (oooO0O1.f7498OooO0O0 == i18 && oooO0O1.f7500OooO0Oo == i19 - i18) {
                            z3 = true;
                            z2 = false;
                        } else {
                            z3 = false;
                            z2 = z3;
                        }
                    } else if (oooO0O1.f7498OooO0O0 == i19 + 1 && oooO0O1.f7500OooO0Oo == i18 - i19) {
                        z3 = true;
                        z2 = z3;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    int i20 = oooO0O1.f7498OooO0O0;
                    if (i19 < i20) {
                        oooO0O1.f7498OooO0O0 = i20 - 1;
                    } else {
                        int i21 = oooO0O1.f7500OooO0Oo;
                        if (i19 < i20 + i21) {
                            oooO0O1.f7500OooO0Oo = i21 - 1;
                            oooO0O0.f7497OooO00o = 2;
                            oooO0O0.f7500OooO0Oo = 1;
                            if (oooO0O1.f7500OooO0Oo == 0) {
                                arrayList.remove(i16);
                                OooO00o oooO00o2 = (OooO00o) oooO00o;
                                oooO00o2.getClass();
                                oooO0O1.f7499OooO0OO = null;
                                oooO00o2.f7491OooO00o.OooO00o(oooO0O1);
                            }
                        }
                    }
                    int i22 = oooO0O0.f7498OooO0O0;
                    int i23 = oooO0O1.f7498OooO0O0;
                    if (i22 <= i23) {
                        oooO0O1.f7498OooO0O0 = i23 + 1;
                    } else {
                        int i24 = i23 + oooO0O1.f7500OooO0Oo;
                        if (i22 < i24) {
                            oooO0O0OooO0oo3 = ((OooO00o) oooO00o).OooO0oo(2, i22 + 1, i24 - i22, null);
                            oooO0O1.f7500OooO0Oo = oooO0O0.f7498OooO0O0 - oooO0O1.f7498OooO0O0;
                        }
                        if (z3) {
                            arrayList.set(size, oooO0O1);
                            arrayList.remove(i16);
                            OooO00o oooO00o3 = (OooO00o) oooO00o;
                            oooO00o3.getClass();
                            oooO0O0.f7499OooO0OO = null;
                            oooO00o3.f7491OooO00o.OooO00o(oooO0O0);
                        } else {
                            if (z2) {
                                if (oooO0O0OooO0oo3 != null) {
                                    i14 = oooO0O0.f7498OooO0O0;
                                    if (i14 > oooO0O0OooO0oo3.f7498OooO0O0) {
                                        oooO0O0.f7498OooO0O0 = i14 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                    }
                                    i15 = oooO0O0.f7500OooO0Oo;
                                    if (i15 > oooO0O0OooO0oo3.f7498OooO0O0) {
                                        oooO0O0.f7500OooO0Oo = i15 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                    }
                                }
                                i12 = oooO0O0.f7498OooO0O0;
                                if (i12 > oooO0O1.f7498OooO0O0) {
                                    oooO0O0.f7498OooO0O0 = i12 - oooO0O1.f7500OooO0Oo;
                                }
                                i13 = oooO0O0.f7500OooO0Oo;
                                if (i13 > oooO0O1.f7498OooO0O0) {
                                    oooO0O0.f7500OooO0Oo = i13 - oooO0O1.f7500OooO0Oo;
                                }
                            } else {
                                if (oooO0O0OooO0oo3 != null) {
                                    i10 = oooO0O0.f7498OooO0O0;
                                    if (i10 >= oooO0O0OooO0oo3.f7498OooO0O0) {
                                        oooO0O0.f7498OooO0O0 = i10 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                    }
                                    i11 = oooO0O0.f7500OooO0Oo;
                                    if (i11 >= oooO0O0OooO0oo3.f7498OooO0O0) {
                                        oooO0O0.f7500OooO0Oo = i11 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                    }
                                }
                                i8 = oooO0O0.f7498OooO0O0;
                                if (i8 >= oooO0O1.f7498OooO0O0) {
                                    oooO0O0.f7498OooO0O0 = i8 - oooO0O1.f7500OooO0Oo;
                                }
                                i9 = oooO0O0.f7500OooO0Oo;
                                if (i9 >= oooO0O1.f7498OooO0O0) {
                                    oooO0O0.f7500OooO0Oo = i9 - oooO0O1.f7500OooO0Oo;
                                }
                            }
                            arrayList.set(size, oooO0O1);
                            if (oooO0O0.f7498OooO0O0 != oooO0O0.f7500OooO0Oo) {
                                arrayList.set(i16, oooO0O0);
                            } else {
                                arrayList.remove(i16);
                            }
                            if (oooO0O0OooO0oo3 != null) {
                                arrayList.add(size, oooO0O0OooO0oo3);
                            }
                        }
                    }
                    oooO0O0OooO0oo3 = null;
                    if (z3) {
                        arrayList.set(size, oooO0O1);
                        arrayList.remove(i16);
                        OooO00o oooO00o4 = (OooO00o) oooO00o;
                        oooO00o4.getClass();
                        oooO0O0.f7499OooO0OO = null;
                        oooO00o4.f7491OooO00o.OooO00o(oooO0O0);
                    } else {
                        if (z2) {
                            if (oooO0O0OooO0oo3 != null) {
                                i14 = oooO0O0.f7498OooO0O0;
                                if (i14 > oooO0O0OooO0oo3.f7498OooO0O0) {
                                    oooO0O0.f7498OooO0O0 = i14 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                }
                                i15 = oooO0O0.f7500OooO0Oo;
                                if (i15 > oooO0O0OooO0oo3.f7498OooO0O0) {
                                    oooO0O0.f7500OooO0Oo = i15 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                }
                            }
                            i12 = oooO0O0.f7498OooO0O0;
                            if (i12 > oooO0O1.f7498OooO0O0) {
                                oooO0O0.f7498OooO0O0 = i12 - oooO0O1.f7500OooO0Oo;
                            }
                            i13 = oooO0O0.f7500OooO0Oo;
                            if (i13 > oooO0O1.f7498OooO0O0) {
                                oooO0O0.f7500OooO0Oo = i13 - oooO0O1.f7500OooO0Oo;
                            }
                        } else {
                            if (oooO0O0OooO0oo3 != null) {
                                i10 = oooO0O0.f7498OooO0O0;
                                if (i10 >= oooO0O0OooO0oo3.f7498OooO0O0) {
                                    oooO0O0.f7498OooO0O0 = i10 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                }
                                i11 = oooO0O0.f7500OooO0Oo;
                                if (i11 >= oooO0O0OooO0oo3.f7498OooO0O0) {
                                    oooO0O0.f7500OooO0Oo = i11 - oooO0O0OooO0oo3.f7500OooO0Oo;
                                }
                            }
                            i8 = oooO0O0.f7498OooO0O0;
                            if (i8 >= oooO0O1.f7498OooO0O0) {
                                oooO0O0.f7498OooO0O0 = i8 - oooO0O1.f7500OooO0Oo;
                            }
                            i9 = oooO0O0.f7500OooO0Oo;
                            if (i9 >= oooO0O1.f7498OooO0O0) {
                                oooO0O0.f7500OooO0Oo = i9 - oooO0O1.f7500OooO0Oo;
                            }
                        }
                        arrayList.set(size, oooO0O1);
                        if (oooO0O0.f7498OooO0O0 != oooO0O0.f7500OooO0Oo) {
                            arrayList.set(i16, oooO0O0);
                        } else {
                            arrayList.remove(i16);
                        }
                        if (oooO0O0OooO0oo3 != null) {
                            arrayList.add(size, oooO0O0OooO0oo3);
                        }
                    }
                } else if (i17 == 4) {
                    int i25 = oooO0O0.f7500OooO0Oo;
                    int i26 = oooO0O1.f7498OooO0O0;
                    if (i25 < i26) {
                        oooO0O1.f7498OooO0O0 = i26 - 1;
                    } else {
                        int i27 = oooO0O1.f7500OooO0Oo;
                        if (i25 < i26 + i27) {
                            oooO0O1.f7500OooO0Oo = i27 - 1;
                            oooO0O0OooO0oo = ((OooO00o) oooO00o).OooO0oo(4, oooO0O0.f7498OooO0O0, 1, oooO0O1.f7499OooO0OO);
                        }
                        i5 = oooO0O0.f7498OooO0O0;
                        i6 = oooO0O1.f7498OooO0O0;
                        if (i5 <= i6) {
                            oooO0O1.f7498OooO0O0 = i6 + 1;
                        } else {
                            i7 = i6 + oooO0O1.f7500OooO0Oo;
                            if (i5 < i7) {
                                int i28 = i7 - i5;
                                oooO0O0OooO0oo2 = ((OooO00o) oooO00o).OooO0oo(4, i5 + 1, i28, oooO0O1.f7499OooO0OO);
                                oooO0O1.f7500OooO0Oo -= i28;
                            }
                            arrayList.set(i16, oooO0O0);
                            if (oooO0O1.f7500OooO0Oo > 0) {
                                arrayList.set(size, oooO0O1);
                            } else {
                                arrayList.remove(size);
                                OooO00o oooO00o5 = (OooO00o) oooO00o;
                                oooO00o5.getClass();
                                oooO0O1.f7499OooO0OO = null;
                                oooO00o5.f7491OooO00o.OooO00o(oooO0O1);
                            }
                            if (oooO0O0OooO0oo != null) {
                                arrayList.add(size, oooO0O0OooO0oo);
                            }
                            if (oooO0O0OooO0oo2 != null) {
                                arrayList.add(size, oooO0O0OooO0oo2);
                            }
                        }
                        oooO0O0OooO0oo2 = null;
                        arrayList.set(i16, oooO0O0);
                        if (oooO0O1.f7500OooO0Oo > 0) {
                            arrayList.set(size, oooO0O1);
                        } else {
                            arrayList.remove(size);
                            OooO00o oooO00o6 = (OooO00o) oooO00o;
                            oooO00o6.getClass();
                            oooO0O1.f7499OooO0OO = null;
                            oooO00o6.f7491OooO00o.OooO00o(oooO0O1);
                        }
                        if (oooO0O0OooO0oo != null) {
                            arrayList.add(size, oooO0O0OooO0oo);
                        }
                        if (oooO0O0OooO0oo2 != null) {
                            arrayList.add(size, oooO0O0OooO0oo2);
                        }
                    }
                    oooO0O0OooO0oo = null;
                    i5 = oooO0O0.f7498OooO0O0;
                    i6 = oooO0O1.f7498OooO0O0;
                    if (i5 <= i6) {
                        oooO0O1.f7498OooO0O0 = i6 + 1;
                    } else {
                        i7 = i6 + oooO0O1.f7500OooO0Oo;
                        if (i5 < i7) {
                            int i29 = i7 - i5;
                            oooO0O0OooO0oo2 = ((OooO00o) oooO00o).OooO0oo(4, i5 + 1, i29, oooO0O1.f7499OooO0OO);
                            oooO0O1.f7500OooO0Oo -= i29;
                        }
                        arrayList.set(i16, oooO0O0);
                        if (oooO0O1.f7500OooO0Oo > 0) {
                            arrayList.set(size, oooO0O1);
                        } else {
                            arrayList.remove(size);
                            OooO00o oooO00o7 = (OooO00o) oooO00o;
                            oooO00o7.getClass();
                            oooO0O1.f7499OooO0OO = null;
                            oooO00o7.f7491OooO00o.OooO00o(oooO0O1);
                        }
                        if (oooO0O0OooO0oo != null) {
                            arrayList.add(size, oooO0O0OooO0oo);
                        }
                        if (oooO0O0OooO0oo2 != null) {
                            arrayList.add(size, oooO0O0OooO0oo2);
                        }
                    }
                    oooO0O0OooO0oo2 = null;
                    arrayList.set(i16, oooO0O0);
                    if (oooO0O1.f7500OooO0Oo > 0) {
                        arrayList.set(size, oooO0O1);
                    } else {
                        arrayList.remove(size);
                        OooO00o oooO00o8 = (OooO00o) oooO00o;
                        oooO00o8.getClass();
                        oooO0O1.f7499OooO0OO = null;
                        oooO00o8.f7491OooO00o.OooO00o(oooO0O1);
                    }
                    if (oooO0O0OooO0oo != null) {
                        arrayList.add(size, oooO0O0OooO0oo);
                    }
                    if (oooO0O0OooO0oo2 != null) {
                        arrayList.add(size, oooO0O0OooO0oo2);
                    }
                }
            } else {
                int i30 = oooO0O0.f7500OooO0Oo;
                int i31 = oooO0O1.f7498OooO0O0;
                int i32 = i30 < i31 ? -1 : 0;
                int i33 = oooO0O0.f7498OooO0O0;
                if (i33 < i31) {
                    i32++;
                }
                if (i31 <= i33) {
                    oooO0O0.f7498OooO0O0 = i33 + oooO0O1.f7500OooO0Oo;
                }
                int i34 = oooO0O1.f7498OooO0O0;
                if (i34 <= i30) {
                    oooO0O0.f7500OooO0Oo = i30 + oooO0O1.f7500OooO0Oo;
                }
                oooO0O1.f7498OooO0O0 = i34 + i32;
                arrayList.set(size, oooO0O1);
                arrayList.set(i16, oooO0O0);
            }
        }
        int size2 = arrayList.size();
        int i35 = 0;
        while (i35 < size2) {
            OooO0O0 oooO0O0OooO0oo4 = arrayList.get(i35);
            int i36 = oooO0O0OooO0oo4.f7497OooO00o;
            if (i36 != 1) {
                o000OO.OooOO0 oooOO1 = this.f7491OooO00o;
                InterfaceC0160OooO00o interfaceC0160OooO00o = this.f7494OooO0Oo;
                if (i36 == i3) {
                    int i37 = oooO0O0OooO0oo4.f7498OooO0O0;
                    int i38 = oooO0O0OooO0oo4.f7500OooO0Oo + i37;
                    int i39 = i37;
                    int i40 = 0;
                    byte b3 = -1;
                    while (i39 < i38) {
                        RecyclerView recyclerView = RecyclerView.this;
                        RecyclerView.o0O0O00 o0o0o00FindViewHolderForPosition = recyclerView.findViewHolderForPosition(i39, true);
                        if (o0o0o00FindViewHolderForPosition == null || recyclerView.mChildHelper.OooOO0O(o0o0o00FindViewHolderForPosition.itemView)) {
                            o0o0o00FindViewHolderForPosition = null;
                        }
                        if (o0o0o00FindViewHolderForPosition != null || OooO00o(i39)) {
                            if (b3 == 0) {
                                OooO0Oo(OooO0oo(2, i37, i40, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                OooO(OooO0oo(2, i37, i40, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i39 -= i40;
                            i38 -= i40;
                            i40 = 1;
                        } else {
                            i40++;
                        }
                        i39++;
                        b3 = b2;
                    }
                    if (i40 != oooO0O0OooO0oo4.f7500OooO0Oo) {
                        oooO0O0OooO0oo4.f7499OooO0OO = null;
                        oooOO1.OooO00o(oooO0O0OooO0oo4);
                        i4 = 2;
                        oooO0O0OooO0oo4 = OooO0oo(2, i37, i40, null);
                    } else {
                        i4 = 2;
                    }
                    if (b3 == 0) {
                        OooO0Oo(oooO0O0OooO0oo4);
                    } else {
                        OooO(oooO0O0OooO0oo4);
                    }
                } else if (i36 != i2) {
                    if (i36 == i) {
                        OooO(oooO0O0OooO0oo4);
                    }
                    i4 = i3;
                } else {
                    int i41 = oooO0O0OooO0oo4.f7498OooO0O0;
                    int i42 = oooO0O0OooO0oo4.f7500OooO0Oo + i41;
                    int i43 = i41;
                    int i44 = 0;
                    while (i41 < i42) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.o0O0O00 o0o0o00FindViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i41, true);
                        if (o0o0o00FindViewHolderForPosition2 == null || recyclerView2.mChildHelper.OooOO0O(o0o0o00FindViewHolderForPosition2.itemView)) {
                            o0o0o00FindViewHolderForPosition2 = null;
                        }
                        if (o0o0o00FindViewHolderForPosition2 != null || OooO00o(i41)) {
                            if (b == 0) {
                                OooO0Oo(OooO0oo(4, i43, i44, oooO0O0OooO0oo4.f7499OooO0OO));
                                i43 = i41;
                                i44 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                OooO(OooO0oo(4, i43, i44, oooO0O0OooO0oo4.f7499OooO0OO));
                                i43 = i41;
                                i44 = 0;
                            }
                            b = 0;
                        }
                        i44++;
                        i41++;
                    }
                    if (i44 != oooO0O0OooO0oo4.f7500OooO0Oo) {
                        Object obj = oooO0O0OooO0oo4.f7499OooO0OO;
                        oooO0O0OooO0oo4.f7499OooO0OO = null;
                        oooOO1.OooO00o(oooO0O0OooO0oo4);
                        oooO0O0OooO0oo4 = OooO0oo(4, i43, i44, obj);
                    }
                    if (b == 0) {
                        OooO0Oo(oooO0O0OooO0oo4);
                    } else {
                        OooO(oooO0O0OooO0oo4);
                    }
                    i4 = 2;
                }
            } else {
                i4 = i3;
                OooO(oooO0O0OooO0oo4);
            }
            i35++;
            i3 = i4;
            i = 8;
            b = -1;
            i2 = 4;
        }
        arrayList.clear();
    }

    public final void OooOO0O(OooO0O0 oooO0O0) {
        oooO0O0.f7499OooO0OO = null;
        this.f7491OooO00o.OooO00o(oooO0O0);
    }

    public final void OooOO0o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOO0O((OooO0O0) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int OooOOO0(int i, int i2) {
        int i3;
        int i4;
        ArrayList<OooO0O0> arrayList = this.f7493OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO0O0 oooO0O0 = arrayList.get(size);
            int i5 = oooO0O0.f7497OooO00o;
            if (i5 == 8) {
                int i6 = oooO0O0.f7498OooO0O0;
                int i7 = oooO0O0.f7500OooO0Oo;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            oooO0O0.f7498OooO0O0 = i6 + 1;
                            oooO0O0.f7500OooO0Oo = i7 + 1;
                        } else if (i2 == 2) {
                            oooO0O0.f7498OooO0O0 = i6 - 1;
                            oooO0O0.f7500OooO0Oo = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        oooO0O0.f7500OooO0Oo = i7 + 1;
                    } else if (i2 == 2) {
                        oooO0O0.f7500OooO0Oo = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        oooO0O0.f7498OooO0O0 = i6 + 1;
                    } else if (i2 == 2) {
                        oooO0O0.f7498OooO0O0 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = oooO0O0.f7498OooO0O0;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= oooO0O0.f7500OooO0Oo;
                    } else if (i5 == 2) {
                        i += oooO0O0.f7500OooO0Oo;
                    }
                } else if (i2 == 1) {
                    oooO0O0.f7498OooO0O0 = i8 + 1;
                } else if (i2 == 2) {
                    oooO0O0.f7498OooO0O0 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            OooO0O0 oooO0O1 = arrayList.get(size2);
            if (oooO0O1.f7497OooO00o == 8) {
                int i9 = oooO0O1.f7500OooO0Oo;
                if (i9 == oooO0O1.f7498OooO0O0 || i9 < 0) {
                    arrayList.remove(size2);
                    OooOO0O(oooO0O1);
                }
            } else if (oooO0O1.f7500OooO0Oo <= 0) {
                arrayList.remove(size2);
                OooOO0O(oooO0O1);
            }
        }
        return i;
    }
}
