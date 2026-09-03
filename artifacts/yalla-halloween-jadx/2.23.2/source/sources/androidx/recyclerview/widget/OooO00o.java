package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements o0OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC0179OooO00o f10582OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO.OooOO0 f10579OooO00o = new o000OO.OooOO0(30);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f10580OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<OooO0O0> f10581OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f10583OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OO00O f10584OooO0o0 = new o0OO00O(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0179OooO00o {
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f10585OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f10586OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Object f10587OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f10588OooO0Oo;

        public OooO0O0(int i, int i2, int i3, Object obj) {
            this.f10585OooO00o = i;
            this.f10586OooO0O0 = i2;
            this.f10588OooO0Oo = i3;
            this.f10587OooO0OO = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            int i = this.f10585OooO00o;
            if (i != oooO0O0.f10585OooO00o) {
                return false;
            }
            if (i == 8 && Math.abs(this.f10588OooO0Oo - this.f10586OooO0O0) == 1 && this.f10588OooO0Oo == oooO0O0.f10586OooO0O0 && this.f10586OooO0O0 == oooO0O0.f10588OooO0Oo) {
                return true;
            }
            if (this.f10588OooO0Oo != oooO0O0.f10588OooO0Oo || this.f10586OooO0O0 != oooO0O0.f10586OooO0O0) {
                return false;
            }
            Object obj2 = this.f10587OooO0OO;
            if (obj2 != null) {
                if (!obj2.equals(oooO0O0.f10587OooO0OO)) {
                    return false;
                }
            } else if (oooO0O0.f10587OooO0OO != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f10585OooO00o * 31) + this.f10586OooO0O0) * 31) + this.f10588OooO0Oo;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f10585OooO00o;
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
            sb.append(this.f10586OooO0O0);
            sb.append("c:");
            sb.append(this.f10588OooO0Oo);
            sb.append(",p:");
            sb.append(this.f10587OooO0OO);
            sb.append("]");
            return sb.toString();
        }
    }

    public OooO00o(RecyclerView.OooOO0 oooOO1) {
        this.f10582OooO0Oo = oooOO1;
    }

    public final void OooO(OooO0O0 oooO0O0) {
        this.f10581OooO0OO.add(oooO0O0);
        int i = oooO0O0.f10585OooO00o;
        InterfaceC0179OooO00o interfaceC0179OooO00o = this.f10582OooO0Oo;
        if (i == 1) {
            int i2 = oooO0O0.f10586OooO0O0;
            int i3 = oooO0O0.f10588OooO0Oo;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = oooO0O0.f10586OooO0O0;
            int i5 = oooO0O0.f10588OooO0Oo;
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = oooO0O0.f10586OooO0O0;
            int i7 = oooO0O0.f10588OooO0Oo;
            Object obj = oooO0O0.f10587OooO0OO;
            RecyclerView recyclerView3 = RecyclerView.this;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            throw new IllegalArgumentException("Unknown update op type for " + oooO0O0);
        }
        int i8 = oooO0O0.f10586OooO0O0;
        int i9 = oooO0O0.f10588OooO0Oo;
        RecyclerView recyclerView4 = RecyclerView.this;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    public final boolean OooO00o(int i) {
        ArrayList<OooO0O0> arrayList = this.f10581OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = arrayList.get(i2);
            int i3 = oooO0O0.f10585OooO00o;
            if (i3 == 8) {
                if (OooO0o(oooO0O0.f10588OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = oooO0O0.f10586OooO0O0;
                int i5 = oooO0O0.f10588OooO0Oo + i4;
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
        ArrayList<OooO0O0> arrayList = this.f10581OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.OooOO0) this.f10582OooO0Oo).OooO00o(arrayList.get(i));
        }
        OooOO0o(arrayList);
        this.f10583OooO0o = 0;
    }

    public final void OooO0OO() {
        OooO0O0();
        ArrayList<OooO0O0> arrayList = this.f10580OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = arrayList.get(i);
            int i2 = oooO0O0.f10585OooO00o;
            InterfaceC0179OooO00o interfaceC0179OooO00o = this.f10582OooO0Oo;
            if (i2 == 1) {
                RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) interfaceC0179OooO00o;
                oooOO1.OooO00o(oooO0O0);
                int i3 = oooO0O0.f10586OooO0O0;
                int i4 = oooO0O0.f10588OooO0Oo;
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                RecyclerView.OooOO0 oooOO2 = (RecyclerView.OooOO0) interfaceC0179OooO00o;
                oooOO2.OooO00o(oooO0O0);
                int i5 = oooO0O0.f10586OooO0O0;
                int i6 = oooO0O0.f10588OooO0Oo;
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f10729OooO0OO += i6;
            } else if (i2 == 4) {
                RecyclerView.OooOO0 oooOO3 = (RecyclerView.OooOO0) interfaceC0179OooO00o;
                oooOO3.OooO00o(oooO0O0);
                int i7 = oooO0O0.f10586OooO0O0;
                int i8 = oooO0O0.f10588OooO0Oo;
                Object obj = oooO0O0.f10587OooO0OO;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                RecyclerView.OooOO0 oooOO4 = (RecyclerView.OooOO0) interfaceC0179OooO00o;
                oooOO4.OooO00o(oooO0O0);
                int i9 = oooO0O0.f10586OooO0O0;
                int i10 = oooO0O0.f10588OooO0Oo;
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        OooOO0o(arrayList);
        this.f10583OooO0o = 0;
    }

    public final void OooO0Oo(OooO0O0 oooO0O0) {
        int i;
        o000OO.OooOO0 oooOO1;
        int i2 = oooO0O0.f10585OooO00o;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iOooOOO0 = OooOOO0(oooO0O0.f10586OooO0O0, i2);
        int i3 = oooO0O0.f10586OooO0O0;
        int i4 = oooO0O0.f10585OooO00o;
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
            int i7 = oooO0O0.f10588OooO0Oo;
            oooOO1 = this.f10579OooO00o;
            if (i5 >= i7) {
                break;
            }
            int iOooOOO1 = OooOOO0((i * i5) + oooO0O0.f10586OooO0O0, oooO0O0.f10585OooO00o);
            int i8 = oooO0O0.f10585OooO00o;
            if (i8 == 2 ? iOooOOO1 == iOooOOO0 : i8 == 4 && iOooOOO1 == iOooOOO0 + 1) {
                i6++;
            } else {
                OooO0O0 oooO0O0OooO0oo = OooO0oo(i8, iOooOOO0, i6, oooO0O0.f10587OooO0OO);
                OooO0o0(oooO0O0OooO0oo, i3);
                oooO0O0OooO0oo.f10587OooO0OO = null;
                oooOO1.OooO00o(oooO0O0OooO0oo);
                if (oooO0O0.f10585OooO00o == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iOooOOO0 = iOooOOO1;
            }
            i5++;
        }
        Object obj = oooO0O0.f10587OooO0OO;
        oooO0O0.f10587OooO0OO = null;
        oooOO1.OooO00o(oooO0O0);
        if (i6 > 0) {
            OooO0O0 oooO0O0OooO0oo2 = OooO0oo(oooO0O0.f10585OooO00o, iOooOOO0, i6, obj);
            OooO0o0(oooO0O0OooO0oo2, i3);
            oooO0O0OooO0oo2.f10587OooO0OO = null;
            oooOO1.OooO00o(oooO0O0OooO0oo2);
        }
    }

    public final int OooO0o(int i, int i2) {
        ArrayList<OooO0O0> arrayList = this.f10581OooO0OO;
        int size = arrayList.size();
        while (i2 < size) {
            OooO0O0 oooO0O0 = arrayList.get(i2);
            int i3 = oooO0O0.f10585OooO00o;
            if (i3 == 8) {
                int i4 = oooO0O0.f10586OooO0O0;
                if (i4 == i) {
                    i = oooO0O0.f10588OooO0Oo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (oooO0O0.f10588OooO0Oo <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = oooO0O0.f10586OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = oooO0O0.f10588OooO0Oo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += oooO0O0.f10588OooO0Oo;
                }
            }
            i2++;
        }
        return i;
    }

    public final void OooO0o0(OooO0O0 oooO0O0, int i) {
        RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) this.f10582OooO0Oo;
        oooOO1.OooO00o(oooO0O0);
        int i2 = oooO0O0.f10585OooO00o;
        if (i2 == 2) {
            int i3 = oooO0O0.f10588OooO0Oo;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i, i3, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f10729OooO0OO += i3;
            return;
        }
        if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i4 = oooO0O0.f10588OooO0Oo;
        Object obj = oooO0O0.f10587OooO0OO;
        RecyclerView recyclerView2 = RecyclerView.this;
        recyclerView2.viewRangeUpdate(i, i4, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final boolean OooO0oO() {
        return this.f10580OooO0O0.size() > 0;
    }

    public final OooO0O0 OooO0oo(int i, int i2, int i3, Object obj) {
        OooO0O0 oooO0O0 = (OooO0O0) this.f10579OooO00o.OooO0O0();
        if (oooO0O0 == null) {
            return new OooO0O0(i, i2, i3, obj);
        }
        oooO0O0.f10585OooO00o = i;
        oooO0O0.f10586OooO0O0 = i2;
        oooO0O0.f10588OooO0Oo = i3;
        oooO0O0.f10587OooO0OO = obj;
        return oooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:188:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0009 A[SYNTHETIC] */
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
        boolean z;
        byte b2;
        OooO0O0 oooO0O0OooO0oo;
        int i4;
        int i5;
        int i6;
        OooO0O0 oooO0O0OooO0oo2;
        boolean z2;
        boolean z3;
        OooO0O0 oooO0O0OooO0oo3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList<OooO0O0> arrayList = this.f10580OooO0O0;
        o0OO00O o0oo00o2 = this.f10584OooO0o0;
        o0oo00o2.getClass();
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
                if (arrayList.get(size).f10585OooO00o != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            i2 = 2;
            if (size == -1) {
                break;
            }
            int i15 = size + 1;
            OooO0O0 oooO0O0 = arrayList.get(size);
            OooO0O0 oooO0O1 = arrayList.get(i15);
            int i16 = oooO0O1.f10585OooO00o;
            if (i16 != 1) {
                o0OO00O.OooO00o oooO00o = o0oo00o2.f10934OooO00o;
                if (i16 == 2) {
                    int i17 = oooO0O0.f10586OooO0O0;
                    int i18 = oooO0O0.f10588OooO0Oo;
                    if (i17 < i18) {
                        if (oooO0O1.f10586OooO0O0 == i17 && oooO0O1.f10588OooO0Oo == i18 - i17) {
                            z3 = true;
                            z2 = false;
                        } else {
                            z3 = false;
                            z2 = z3;
                        }
                    } else if (oooO0O1.f10586OooO0O0 == i18 + 1 && oooO0O1.f10588OooO0Oo == i17 - i18) {
                        z3 = true;
                        z2 = z3;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    int i19 = oooO0O1.f10586OooO0O0;
                    if (i18 < i19) {
                        oooO0O1.f10586OooO0O0 = i19 - 1;
                    } else {
                        int i20 = oooO0O1.f10588OooO0Oo;
                        if (i18 < i19 + i20) {
                            oooO0O1.f10588OooO0Oo = i20 - 1;
                            oooO0O0.f10585OooO00o = 2;
                            oooO0O0.f10588OooO0Oo = 1;
                            if (oooO0O1.f10588OooO0Oo == 0) {
                                arrayList.remove(i15);
                                OooO00o oooO00o2 = (OooO00o) oooO00o;
                                oooO00o2.getClass();
                                oooO0O1.f10587OooO0OO = null;
                                oooO00o2.f10579OooO00o.OooO00o(oooO0O1);
                            }
                        }
                    }
                    int i21 = oooO0O0.f10586OooO0O0;
                    int i22 = oooO0O1.f10586OooO0O0;
                    if (i21 <= i22) {
                        oooO0O1.f10586OooO0O0 = i22 + 1;
                    } else {
                        int i23 = i22 + oooO0O1.f10588OooO0Oo;
                        if (i21 < i23) {
                            oooO0O0OooO0oo3 = ((OooO00o) oooO00o).OooO0oo(2, i21 + 1, i23 - i21, null);
                            oooO0O1.f10588OooO0Oo = oooO0O0.f10586OooO0O0 - oooO0O1.f10586OooO0O0;
                        }
                        if (z3) {
                            arrayList.set(size, oooO0O1);
                            arrayList.remove(i15);
                            OooO00o oooO00o3 = (OooO00o) oooO00o;
                            oooO00o3.getClass();
                            oooO0O0.f10587OooO0OO = null;
                            oooO00o3.f10579OooO00o.OooO00o(oooO0O0);
                        } else {
                            if (z2) {
                                if (oooO0O0OooO0oo3 != null) {
                                    i13 = oooO0O0.f10586OooO0O0;
                                    if (i13 > oooO0O0OooO0oo3.f10586OooO0O0) {
                                        oooO0O0.f10586OooO0O0 = i13 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                    }
                                    i14 = oooO0O0.f10588OooO0Oo;
                                    if (i14 > oooO0O0OooO0oo3.f10586OooO0O0) {
                                        oooO0O0.f10588OooO0Oo = i14 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                    }
                                }
                                i11 = oooO0O0.f10586OooO0O0;
                                if (i11 > oooO0O1.f10586OooO0O0) {
                                    oooO0O0.f10586OooO0O0 = i11 - oooO0O1.f10588OooO0Oo;
                                }
                                i12 = oooO0O0.f10588OooO0Oo;
                                if (i12 > oooO0O1.f10586OooO0O0) {
                                    oooO0O0.f10588OooO0Oo = i12 - oooO0O1.f10588OooO0Oo;
                                }
                            } else {
                                if (oooO0O0OooO0oo3 != null) {
                                    i9 = oooO0O0.f10586OooO0O0;
                                    if (i9 >= oooO0O0OooO0oo3.f10586OooO0O0) {
                                        oooO0O0.f10586OooO0O0 = i9 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                    }
                                    i10 = oooO0O0.f10588OooO0Oo;
                                    if (i10 >= oooO0O0OooO0oo3.f10586OooO0O0) {
                                        oooO0O0.f10588OooO0Oo = i10 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                    }
                                }
                                i7 = oooO0O0.f10586OooO0O0;
                                if (i7 >= oooO0O1.f10586OooO0O0) {
                                    oooO0O0.f10586OooO0O0 = i7 - oooO0O1.f10588OooO0Oo;
                                }
                                i8 = oooO0O0.f10588OooO0Oo;
                                if (i8 >= oooO0O1.f10586OooO0O0) {
                                    oooO0O0.f10588OooO0Oo = i8 - oooO0O1.f10588OooO0Oo;
                                }
                            }
                            arrayList.set(size, oooO0O1);
                            if (oooO0O0.f10586OooO0O0 != oooO0O0.f10588OooO0Oo) {
                                arrayList.set(i15, oooO0O0);
                            } else {
                                arrayList.remove(i15);
                            }
                            if (oooO0O0OooO0oo3 != null) {
                                arrayList.add(size, oooO0O0OooO0oo3);
                            }
                        }
                    }
                    oooO0O0OooO0oo3 = null;
                    if (z3) {
                        arrayList.set(size, oooO0O1);
                        arrayList.remove(i15);
                        OooO00o oooO00o4 = (OooO00o) oooO00o;
                        oooO00o4.getClass();
                        oooO0O0.f10587OooO0OO = null;
                        oooO00o4.f10579OooO00o.OooO00o(oooO0O0);
                    } else {
                        if (z2) {
                            if (oooO0O0OooO0oo3 != null) {
                                i13 = oooO0O0.f10586OooO0O0;
                                if (i13 > oooO0O0OooO0oo3.f10586OooO0O0) {
                                    oooO0O0.f10586OooO0O0 = i13 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                }
                                i14 = oooO0O0.f10588OooO0Oo;
                                if (i14 > oooO0O0OooO0oo3.f10586OooO0O0) {
                                    oooO0O0.f10588OooO0Oo = i14 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                }
                            }
                            i11 = oooO0O0.f10586OooO0O0;
                            if (i11 > oooO0O1.f10586OooO0O0) {
                                oooO0O0.f10586OooO0O0 = i11 - oooO0O1.f10588OooO0Oo;
                            }
                            i12 = oooO0O0.f10588OooO0Oo;
                            if (i12 > oooO0O1.f10586OooO0O0) {
                                oooO0O0.f10588OooO0Oo = i12 - oooO0O1.f10588OooO0Oo;
                            }
                        } else {
                            if (oooO0O0OooO0oo3 != null) {
                                i9 = oooO0O0.f10586OooO0O0;
                                if (i9 >= oooO0O0OooO0oo3.f10586OooO0O0) {
                                    oooO0O0.f10586OooO0O0 = i9 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                }
                                i10 = oooO0O0.f10588OooO0Oo;
                                if (i10 >= oooO0O0OooO0oo3.f10586OooO0O0) {
                                    oooO0O0.f10588OooO0Oo = i10 - oooO0O0OooO0oo3.f10588OooO0Oo;
                                }
                            }
                            i7 = oooO0O0.f10586OooO0O0;
                            if (i7 >= oooO0O1.f10586OooO0O0) {
                                oooO0O0.f10586OooO0O0 = i7 - oooO0O1.f10588OooO0Oo;
                            }
                            i8 = oooO0O0.f10588OooO0Oo;
                            if (i8 >= oooO0O1.f10586OooO0O0) {
                                oooO0O0.f10588OooO0Oo = i8 - oooO0O1.f10588OooO0Oo;
                            }
                        }
                        arrayList.set(size, oooO0O1);
                        if (oooO0O0.f10586OooO0O0 != oooO0O0.f10588OooO0Oo) {
                            arrayList.set(i15, oooO0O0);
                        } else {
                            arrayList.remove(i15);
                        }
                        if (oooO0O0OooO0oo3 != null) {
                            arrayList.add(size, oooO0O0OooO0oo3);
                        }
                    }
                } else if (i16 == 4) {
                    int i24 = oooO0O0.f10588OooO0Oo;
                    int i25 = oooO0O1.f10586OooO0O0;
                    if (i24 < i25) {
                        oooO0O1.f10586OooO0O0 = i25 - 1;
                    } else {
                        int i26 = oooO0O1.f10588OooO0Oo;
                        if (i24 < i25 + i26) {
                            oooO0O1.f10588OooO0Oo = i26 - 1;
                            oooO0O0OooO0oo = ((OooO00o) oooO00o).OooO0oo(4, oooO0O0.f10586OooO0O0, 1, oooO0O1.f10587OooO0OO);
                        }
                        i4 = oooO0O0.f10586OooO0O0;
                        i5 = oooO0O1.f10586OooO0O0;
                        if (i4 <= i5) {
                            oooO0O1.f10586OooO0O0 = i5 + 1;
                        } else {
                            i6 = i5 + oooO0O1.f10588OooO0Oo;
                            if (i4 < i6) {
                                int i27 = i6 - i4;
                                oooO0O0OooO0oo2 = ((OooO00o) oooO00o).OooO0oo(4, i4 + 1, i27, oooO0O1.f10587OooO0OO);
                                oooO0O1.f10588OooO0Oo -= i27;
                            }
                            arrayList.set(i15, oooO0O0);
                            if (oooO0O1.f10588OooO0Oo > 0) {
                                arrayList.set(size, oooO0O1);
                            } else {
                                arrayList.remove(size);
                                OooO00o oooO00o5 = (OooO00o) oooO00o;
                                oooO00o5.getClass();
                                oooO0O1.f10587OooO0OO = null;
                                oooO00o5.f10579OooO00o.OooO00o(oooO0O1);
                            }
                            if (oooO0O0OooO0oo != null) {
                                arrayList.add(size, oooO0O0OooO0oo);
                            }
                            if (oooO0O0OooO0oo2 != null) {
                                arrayList.add(size, oooO0O0OooO0oo2);
                            }
                        }
                        oooO0O0OooO0oo2 = null;
                        arrayList.set(i15, oooO0O0);
                        if (oooO0O1.f10588OooO0Oo > 0) {
                            arrayList.set(size, oooO0O1);
                        } else {
                            arrayList.remove(size);
                            OooO00o oooO00o6 = (OooO00o) oooO00o;
                            oooO00o6.getClass();
                            oooO0O1.f10587OooO0OO = null;
                            oooO00o6.f10579OooO00o.OooO00o(oooO0O1);
                        }
                        if (oooO0O0OooO0oo != null) {
                            arrayList.add(size, oooO0O0OooO0oo);
                        }
                        if (oooO0O0OooO0oo2 != null) {
                            arrayList.add(size, oooO0O0OooO0oo2);
                        }
                    }
                    oooO0O0OooO0oo = null;
                    i4 = oooO0O0.f10586OooO0O0;
                    i5 = oooO0O1.f10586OooO0O0;
                    if (i4 <= i5) {
                        oooO0O1.f10586OooO0O0 = i5 + 1;
                    } else {
                        i6 = i5 + oooO0O1.f10588OooO0Oo;
                        if (i4 < i6) {
                            int i28 = i6 - i4;
                            oooO0O0OooO0oo2 = ((OooO00o) oooO00o).OooO0oo(4, i4 + 1, i28, oooO0O1.f10587OooO0OO);
                            oooO0O1.f10588OooO0Oo -= i28;
                        }
                        arrayList.set(i15, oooO0O0);
                        if (oooO0O1.f10588OooO0Oo > 0) {
                            arrayList.set(size, oooO0O1);
                        } else {
                            arrayList.remove(size);
                            OooO00o oooO00o7 = (OooO00o) oooO00o;
                            oooO00o7.getClass();
                            oooO0O1.f10587OooO0OO = null;
                            oooO00o7.f10579OooO00o.OooO00o(oooO0O1);
                        }
                        if (oooO0O0OooO0oo != null) {
                            arrayList.add(size, oooO0O0OooO0oo);
                        }
                        if (oooO0O0OooO0oo2 != null) {
                            arrayList.add(size, oooO0O0OooO0oo2);
                        }
                    }
                    oooO0O0OooO0oo2 = null;
                    arrayList.set(i15, oooO0O0);
                    if (oooO0O1.f10588OooO0Oo > 0) {
                        arrayList.set(size, oooO0O1);
                    } else {
                        arrayList.remove(size);
                        OooO00o oooO00o8 = (OooO00o) oooO00o;
                        oooO00o8.getClass();
                        oooO0O1.f10587OooO0OO = null;
                        oooO00o8.f10579OooO00o.OooO00o(oooO0O1);
                    }
                    if (oooO0O0OooO0oo != null) {
                        arrayList.add(size, oooO0O0OooO0oo);
                    }
                    if (oooO0O0OooO0oo2 != null) {
                        arrayList.add(size, oooO0O0OooO0oo2);
                    }
                }
            } else {
                int i29 = oooO0O0.f10588OooO0Oo;
                int i30 = oooO0O1.f10586OooO0O0;
                int i31 = i29 < i30 ? -1 : 0;
                int i32 = oooO0O0.f10586OooO0O0;
                if (i32 < i30) {
                    i31++;
                }
                if (i30 <= i32) {
                    oooO0O0.f10586OooO0O0 = i32 + oooO0O1.f10588OooO0Oo;
                }
                int i33 = oooO0O1.f10586OooO0O0;
                if (i33 <= i29) {
                    oooO0O0.f10588OooO0Oo = i29 + oooO0O1.f10588OooO0Oo;
                }
                oooO0O1.f10586OooO0O0 = i33 + i31;
                arrayList.set(size, oooO0O1);
                arrayList.set(i15, oooO0O0);
            }
        }
        int size2 = arrayList.size();
        int i34 = 0;
        while (i34 < size2) {
            OooO0O0 oooO0O0OooO0oo4 = arrayList.get(i34);
            int i35 = oooO0O0OooO0oo4.f10585OooO00o;
            if (i35 != 1) {
                o000OO.OooOO0 oooOO1 = this.f10579OooO00o;
                InterfaceC0179OooO00o interfaceC0179OooO00o = this.f10582OooO0Oo;
                if (i35 == i2) {
                    int i36 = oooO0O0OooO0oo4.f10586OooO0O0;
                    int i37 = oooO0O0OooO0oo4.f10588OooO0Oo + i36;
                    int i38 = i36;
                    int i39 = 0;
                    byte b3 = -1;
                    while (i38 < i37) {
                        if (((RecyclerView.OooOO0) interfaceC0179OooO00o).OooO0O0(i38) != null || OooO00o(i38)) {
                            if (b3 == 0) {
                                OooO0Oo(OooO0oo(2, i36, i39, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                OooO(OooO0oo(2, i36, i39, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        b3 = b2;
                    }
                    if (i39 != oooO0O0OooO0oo4.f10588OooO0Oo) {
                        oooO0O0OooO0oo4.f10587OooO0OO = null;
                        oooOO1.OooO00o(oooO0O0OooO0oo4);
                        i3 = 2;
                        oooO0O0OooO0oo4 = OooO0oo(2, i36, i39, null);
                    } else {
                        i3 = 2;
                    }
                    if (b3 == 0) {
                        OooO0Oo(oooO0O0OooO0oo4);
                    } else {
                        OooO(oooO0O0OooO0oo4);
                    }
                } else if (i35 != 4) {
                    if (i35 == i) {
                        OooO(oooO0O0OooO0oo4);
                    }
                    i3 = i2;
                } else {
                    int i40 = oooO0O0OooO0oo4.f10586OooO0O0;
                    int i41 = oooO0O0OooO0oo4.f10588OooO0Oo + i40;
                    int i42 = i40;
                    int i43 = 0;
                    while (i40 < i41) {
                        if (((RecyclerView.OooOO0) interfaceC0179OooO00o).OooO0O0(i40) != null || OooO00o(i40)) {
                            if (b == 0) {
                                OooO0Oo(OooO0oo(4, i42, i43, oooO0O0OooO0oo4.f10587OooO0OO));
                                i42 = i40;
                                i43 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                OooO(OooO0oo(4, i42, i43, oooO0O0OooO0oo4.f10587OooO0OO));
                                i42 = i40;
                                i43 = 0;
                            }
                            b = 0;
                        }
                        i43++;
                        i40++;
                    }
                    if (i43 != oooO0O0OooO0oo4.f10588OooO0Oo) {
                        Object obj = oooO0O0OooO0oo4.f10587OooO0OO;
                        oooO0O0OooO0oo4.f10587OooO0OO = null;
                        oooOO1.OooO00o(oooO0O0OooO0oo4);
                        oooO0O0OooO0oo4 = OooO0oo(4, i42, i43, obj);
                    }
                    if (b == 0) {
                        OooO0Oo(oooO0O0OooO0oo4);
                    } else {
                        OooO(oooO0O0OooO0oo4);
                    }
                    i3 = 2;
                }
            } else {
                i3 = i2;
                OooO(oooO0O0OooO0oo4);
            }
            i34++;
            i2 = i3;
            i = 8;
            b = -1;
        }
        arrayList.clear();
    }

    public final void OooOO0O(OooO0O0 oooO0O0) {
        oooO0O0.f10587OooO0OO = null;
        this.f10579OooO00o.OooO00o(oooO0O0);
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
        ArrayList<OooO0O0> arrayList = this.f10581OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO0O0 oooO0O0 = arrayList.get(size);
            int i5 = oooO0O0.f10585OooO00o;
            if (i5 == 8) {
                int i6 = oooO0O0.f10586OooO0O0;
                int i7 = oooO0O0.f10588OooO0Oo;
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
                            oooO0O0.f10586OooO0O0 = i6 + 1;
                            oooO0O0.f10588OooO0Oo = i7 + 1;
                        } else if (i2 == 2) {
                            oooO0O0.f10586OooO0O0 = i6 - 1;
                            oooO0O0.f10588OooO0Oo = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        oooO0O0.f10588OooO0Oo = i7 + 1;
                    } else if (i2 == 2) {
                        oooO0O0.f10588OooO0Oo = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        oooO0O0.f10586OooO0O0 = i6 + 1;
                    } else if (i2 == 2) {
                        oooO0O0.f10586OooO0O0 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = oooO0O0.f10586OooO0O0;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= oooO0O0.f10588OooO0Oo;
                    } else if (i5 == 2) {
                        i += oooO0O0.f10588OooO0Oo;
                    }
                } else if (i2 == 1) {
                    oooO0O0.f10586OooO0O0 = i8 + 1;
                } else if (i2 == 2) {
                    oooO0O0.f10586OooO0O0 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            OooO0O0 oooO0O1 = arrayList.get(size2);
            if (oooO0O1.f10585OooO00o == 8) {
                int i9 = oooO0O1.f10588OooO0Oo;
                if (i9 == oooO0O1.f10586OooO0O0 || i9 < 0) {
                    arrayList.remove(size2);
                    OooOO0O(oooO0O1);
                }
            } else if (oooO0O1.f10588OooO0Oo <= 0) {
                arrayList.remove(size2);
                OooOO0O(oooO0O1);
            }
        }
        return i;
    }
}
