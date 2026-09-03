package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements o0Oo0oo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC0062OooO00o f8876OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o000OO0O.OooO<OooO0O0> f8873OooO00o = new o000OO0O.OooOO0(30);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f8874OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<OooO0O0> f8875OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8877OooO0o = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0Oo0oo f8878OooO0o0 = new o0Oo0oo(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0062OooO00o {
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8879OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8880OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Object f8881OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8882OooO0Oo;

        public OooO0O0(int i, int i2, int i3, Object obj) {
            this.f8879OooO00o = i;
            this.f8880OooO0O0 = i2;
            this.f8882OooO0Oo = i3;
            this.f8881OooO0OO = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            int i = this.f8879OooO00o;
            if (i != oooO0O0.f8879OooO00o) {
                return false;
            }
            if (i == 8 && Math.abs(this.f8882OooO0Oo - this.f8880OooO0O0) == 1 && this.f8882OooO0Oo == oooO0O0.f8880OooO0O0 && this.f8880OooO0O0 == oooO0O0.f8882OooO0Oo) {
                return true;
            }
            if (this.f8882OooO0Oo != oooO0O0.f8882OooO0Oo || this.f8880OooO0O0 != oooO0O0.f8880OooO0O0) {
                return false;
            }
            Object obj2 = this.f8881OooO0OO;
            if (obj2 != null) {
                if (!obj2.equals(oooO0O0.f8881OooO0OO)) {
                    return false;
                }
            } else if (oooO0O0.f8881OooO0OO != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f8879OooO00o * 31) + this.f8880OooO0O0) * 31) + this.f8882OooO0Oo;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f8879OooO00o;
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
            sb.append(this.f8880OooO0O0);
            sb.append("c:");
            sb.append(this.f8882OooO0Oo);
            sb.append(",p:");
            sb.append(this.f8881OooO0OO);
            sb.append("]");
            return sb.toString();
        }
    }

    public OooO00o(InterfaceC0062OooO00o interfaceC0062OooO00o) {
        this.f8876OooO0Oo = interfaceC0062OooO00o;
    }

    public final void OooO(OooO0O0 oooO0O0) {
        this.f8875OooO0OO.add(oooO0O0);
        int i = oooO0O0.f8879OooO00o;
        if (i == 1) {
            RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) this.f8876OooO0Oo;
            RecyclerView.this.offsetPositionRecordsForInsert(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo);
            RecyclerView.this.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            RecyclerView.OooOO0 oooOO2 = (RecyclerView.OooOO0) this.f8876OooO0Oo;
            RecyclerView.this.offsetPositionRecordsForRemove(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO0OO(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo, oooO0O0.f8881OooO0OO);
        } else {
            if (i != 8) {
                throw new IllegalArgumentException("Unknown update op type for " + oooO0O0);
            }
            RecyclerView.OooOO0 oooOO3 = (RecyclerView.OooOO0) this.f8876OooO0Oo;
            RecyclerView.this.offsetPositionRecordsForMove(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }
    }

    public final boolean OooO00o(int i) {
        int size = this.f8875OooO0OO.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = this.f8875OooO0OO.get(i2);
            int i3 = oooO0O0.f8879OooO00o;
            if (i3 == 8) {
                if (OooO0o(oooO0O0.f8882OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = oooO0O0.f8880OooO0O0;
                int i5 = oooO0O0.f8882OooO0Oo + i4;
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
        int size = this.f8875OooO0OO.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO00o(this.f8875OooO0OO.get(i));
        }
        OooOO0o(this.f8875OooO0OO);
        this.f8877OooO0o = 0;
    }

    public final void OooO0OO() {
        OooO0O0();
        int size = this.f8874OooO0O0.size();
        for (int i = 0; i < size; i++) {
            OooO0O0 oooO0O0 = this.f8874OooO0O0.get(i);
            int i2 = oooO0O0.f8879OooO00o;
            if (i2 == 1) {
                ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO00o(oooO0O0);
                RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) this.f8876OooO0Oo;
                RecyclerView.this.offsetPositionRecordsForInsert(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO00o(oooO0O0);
                InterfaceC0062OooO00o interfaceC0062OooO00o = this.f8876OooO0Oo;
                int i3 = oooO0O0.f8880OooO0O0;
                int i4 = oooO0O0.f8882OooO0Oo;
                RecyclerView.OooOO0 oooOO2 = (RecyclerView.OooOO0) interfaceC0062OooO00o;
                RecyclerView.this.offsetPositionRecordsForRemove(i3, i4, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.f9059OooO0OO += i4;
            } else if (i2 == 4) {
                ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO00o(oooO0O0);
                ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO0OO(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo, oooO0O0.f8881OooO0OO);
            } else if (i2 == 8) {
                ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO00o(oooO0O0);
                RecyclerView.OooOO0 oooOO3 = (RecyclerView.OooOO0) this.f8876OooO0Oo;
                RecyclerView.this.offsetPositionRecordsForMove(oooO0O0.f8880OooO0O0, oooO0O0.f8882OooO0Oo);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        OooOO0o(this.f8874OooO0O0);
        this.f8877OooO0o = 0;
    }

    public final void OooO0Oo(OooO0O0 oooO0O0) {
        int i;
        int i2 = oooO0O0.f8879OooO00o;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iOooOOO0 = OooOOO0(oooO0O0.f8880OooO0O0, i2);
        int i3 = oooO0O0.f8880OooO0O0;
        int i4 = oooO0O0.f8879OooO00o;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + oooO0O0);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < oooO0O0.f8882OooO0Oo; i6++) {
            int iOooOOO1 = OooOOO0((i * i6) + oooO0O0.f8880OooO0O0, oooO0O0.f8879OooO00o);
            int i7 = oooO0O0.f8879OooO00o;
            if (i7 == 2 ? iOooOOO1 == iOooOOO0 : i7 == 4 && iOooOOO1 == iOooOOO0 + 1) {
                i5++;
            } else {
                OooO0O0 oooO0O0OooO0oo = OooO0oo(i7, iOooOOO0, i5, oooO0O0.f8881OooO0OO);
                OooO0o0(oooO0O0OooO0oo, i3);
                oooO0O0OooO0oo.f8881OooO0OO = null;
                this.f8873OooO00o.OooO00o(oooO0O0OooO0oo);
                if (oooO0O0.f8879OooO00o == 4) {
                    i3 += i5;
                }
                iOooOOO0 = iOooOOO1;
                i5 = 1;
            }
        }
        Object obj = oooO0O0.f8881OooO0OO;
        oooO0O0.f8881OooO0OO = null;
        this.f8873OooO00o.OooO00o(oooO0O0);
        if (i5 > 0) {
            OooO0O0 oooO0O0OooO0oo2 = OooO0oo(oooO0O0.f8879OooO00o, iOooOOO0, i5, obj);
            OooO0o0(oooO0O0OooO0oo2, i3);
            oooO0O0OooO0oo2.f8881OooO0OO = null;
            this.f8873OooO00o.OooO00o(oooO0O0OooO0oo2);
        }
    }

    public final int OooO0o(int i, int i2) {
        int size = this.f8875OooO0OO.size();
        while (i2 < size) {
            OooO0O0 oooO0O0 = this.f8875OooO0OO.get(i2);
            int i3 = oooO0O0.f8879OooO00o;
            if (i3 == 8) {
                int i4 = oooO0O0.f8880OooO0O0;
                if (i4 == i) {
                    i = oooO0O0.f8882OooO0Oo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (oooO0O0.f8882OooO0Oo <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = oooO0O0.f8880OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = oooO0O0.f8882OooO0Oo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += oooO0O0.f8882OooO0Oo;
                }
            }
            i2++;
        }
        return i;
    }

    public final void OooO0o0(OooO0O0 oooO0O0, int i) {
        ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO00o(oooO0O0);
        int i2 = oooO0O0.f8879OooO00o;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO0OO(i, oooO0O0.f8882OooO0Oo, oooO0O0.f8881OooO0OO);
            return;
        }
        InterfaceC0062OooO00o interfaceC0062OooO00o = this.f8876OooO0Oo;
        int i3 = oooO0O0.f8882OooO0Oo;
        RecyclerView.OooOO0 oooOO1 = (RecyclerView.OooOO0) interfaceC0062OooO00o;
        RecyclerView.this.offsetPositionRecordsForRemove(i, i3, true);
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f9059OooO0OO += i3;
    }

    public final boolean OooO0oO() {
        return this.f8874OooO0O0.size() > 0;
    }

    public final OooO0O0 OooO0oo(int i, int i2, int i3, Object obj) {
        OooO0O0 OooO0O1 = this.f8873OooO00o.OooO0O0();
        if (OooO0O1 == null) {
            return new OooO0O0(i, i2, i3, obj);
        }
        OooO0O1.f8879OooO00o = i;
        OooO0O1.f8880OooO0O0 = i2;
        OooO0O1.f8882OooO0Oo = i3;
        OooO0O1.f8881OooO0OO = obj;
        return OooO0O1;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019a  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:182:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x014a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:89:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x0184  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    public final void OooOO0() {
        boolean z;
        byte b;
        OooO0O0 oooO0O0OooO0oo;
        int i;
        int i2;
        int i3;
        OooO0O0 oooO0O0OooO0oo2;
        boolean z2;
        boolean z3;
        boolean z4;
        OooO0O0 oooO0O0OooO0oo3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        o0Oo0oo o0oo0oo2 = this.f8878OooO0o0;
        ArrayList<OooO0O0> arrayList = this.f8874OooO0O0;
        Objects.requireNonNull(o0oo0oo2);
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).f8879OooO00o == 8) {
                    if (z5) {
                        break;
                    }
                } else {
                    z5 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            OooO0O0 oooO0O0 = arrayList.get(size);
            OooO0O0 oooO0O1 = arrayList.get(i12);
            int i13 = oooO0O1.f8879OooO00o;
            if (i13 == 1) {
                int i14 = oooO0O0.f8882OooO0Oo;
                int i15 = oooO0O1.f8880OooO0O0;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = oooO0O0.f8880OooO0O0;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    oooO0O0.f8880OooO0O0 = i17 + oooO0O1.f8882OooO0Oo;
                }
                int i18 = oooO0O1.f8880OooO0O0;
                if (i18 <= i14) {
                    oooO0O0.f8882OooO0Oo = i14 + oooO0O1.f8882OooO0Oo;
                }
                oooO0O1.f8880OooO0O0 = i18 + i16;
                arrayList.set(size, oooO0O1);
                arrayList.set(i12, oooO0O0);
            } else if (i13 == 2) {
                int i19 = oooO0O0.f8880OooO0O0;
                int i20 = oooO0O0.f8882OooO0Oo;
                if (i19 < i20) {
                    if (oooO0O1.f8880OooO0O0 == i19 && oooO0O1.f8882OooO0Oo == i20 - i19) {
                        z4 = false;
                        z3 = z4;
                        z2 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (oooO0O1.f8880OooO0O0 == i20 + 1 && oooO0O1.f8882OooO0Oo == i19 - i20) {
                    z4 = true;
                    z3 = z4;
                    z2 = true;
                } else {
                    z2 = false;
                    z3 = true;
                }
                int i21 = oooO0O1.f8880OooO0O0;
                if (i20 < i21) {
                    oooO0O1.f8880OooO0O0 = i21 - 1;
                } else {
                    int i22 = oooO0O1.f8882OooO0Oo;
                    if (i20 < i21 + i22) {
                        oooO0O1.f8882OooO0Oo = i22 - 1;
                        oooO0O0.f8879OooO00o = 2;
                        oooO0O0.f8882OooO0Oo = 1;
                        if (oooO0O1.f8882OooO0Oo == 0) {
                            arrayList.remove(i12);
                            OooO00o oooO00o = (OooO00o) o0oo0oo2.f9206OooO00o;
                            Objects.requireNonNull(oooO00o);
                            oooO0O1.f8881OooO0OO = null;
                            oooO00o.f8873OooO00o.OooO00o(oooO0O1);
                        }
                    }
                }
                int i23 = oooO0O0.f8880OooO0O0;
                int i24 = oooO0O1.f8880OooO0O0;
                if (i23 <= i24) {
                    oooO0O1.f8880OooO0O0 = i24 + 1;
                } else {
                    int i25 = i24 + oooO0O1.f8882OooO0Oo;
                    if (i23 < i25) {
                        oooO0O0OooO0oo3 = ((OooO00o) o0oo0oo2.f9206OooO00o).OooO0oo(2, i23 + 1, i25 - i23, null);
                        oooO0O1.f8882OooO0Oo = oooO0O0.f8880OooO0O0 - oooO0O1.f8880OooO0O0;
                    }
                    if (z2) {
                        arrayList.set(size, oooO0O1);
                        arrayList.remove(i12);
                        OooO00o oooO00o2 = (OooO00o) o0oo0oo2.f9206OooO00o;
                        Objects.requireNonNull(oooO00o2);
                        oooO0O0.f8881OooO0OO = null;
                        oooO00o2.f8873OooO00o.OooO00o(oooO0O0);
                    } else {
                        if (z3) {
                            if (oooO0O0OooO0oo3 != null) {
                                i10 = oooO0O0.f8880OooO0O0;
                                if (i10 > oooO0O0OooO0oo3.f8880OooO0O0) {
                                    oooO0O0.f8880OooO0O0 = i10 - oooO0O0OooO0oo3.f8882OooO0Oo;
                                }
                                i11 = oooO0O0.f8882OooO0Oo;
                                if (i11 > oooO0O0OooO0oo3.f8880OooO0O0) {
                                    oooO0O0.f8882OooO0Oo = i11 - oooO0O0OooO0oo3.f8882OooO0Oo;
                                }
                            }
                            i8 = oooO0O0.f8880OooO0O0;
                            if (i8 > oooO0O1.f8880OooO0O0) {
                                oooO0O0.f8880OooO0O0 = i8 - oooO0O1.f8882OooO0Oo;
                            }
                            i9 = oooO0O0.f8882OooO0Oo;
                            if (i9 > oooO0O1.f8880OooO0O0) {
                                oooO0O0.f8882OooO0Oo = i9 - oooO0O1.f8882OooO0Oo;
                            }
                        } else {
                            if (oooO0O0OooO0oo3 != null) {
                                i6 = oooO0O0.f8880OooO0O0;
                                if (i6 >= oooO0O0OooO0oo3.f8880OooO0O0) {
                                    oooO0O0.f8880OooO0O0 = i6 - oooO0O0OooO0oo3.f8882OooO0Oo;
                                }
                                i7 = oooO0O0.f8882OooO0Oo;
                                if (i7 >= oooO0O0OooO0oo3.f8880OooO0O0) {
                                    oooO0O0.f8882OooO0Oo = i7 - oooO0O0OooO0oo3.f8882OooO0Oo;
                                }
                            }
                            i4 = oooO0O0.f8880OooO0O0;
                            if (i4 >= oooO0O1.f8880OooO0O0) {
                                oooO0O0.f8880OooO0O0 = i4 - oooO0O1.f8882OooO0Oo;
                            }
                            i5 = oooO0O0.f8882OooO0Oo;
                            if (i5 >= oooO0O1.f8880OooO0O0) {
                                oooO0O0.f8882OooO0Oo = i5 - oooO0O1.f8882OooO0Oo;
                            }
                        }
                        arrayList.set(size, oooO0O1);
                        if (oooO0O0.f8880OooO0O0 != oooO0O0.f8882OooO0Oo) {
                            arrayList.set(i12, oooO0O0);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (oooO0O0OooO0oo3 != null) {
                            arrayList.add(size, oooO0O0OooO0oo3);
                        }
                    }
                }
                oooO0O0OooO0oo3 = null;
                if (z2) {
                    arrayList.set(size, oooO0O1);
                    arrayList.remove(i12);
                    OooO00o oooO00o3 = (OooO00o) o0oo0oo2.f9206OooO00o;
                    Objects.requireNonNull(oooO00o3);
                    oooO0O0.f8881OooO0OO = null;
                    oooO00o3.f8873OooO00o.OooO00o(oooO0O0);
                } else {
                    if (z3) {
                        if (oooO0O0OooO0oo3 != null) {
                            i10 = oooO0O0.f8880OooO0O0;
                            if (i10 > oooO0O0OooO0oo3.f8880OooO0O0) {
                                oooO0O0.f8880OooO0O0 = i10 - oooO0O0OooO0oo3.f8882OooO0Oo;
                            }
                            i11 = oooO0O0.f8882OooO0Oo;
                            if (i11 > oooO0O0OooO0oo3.f8880OooO0O0) {
                                oooO0O0.f8882OooO0Oo = i11 - oooO0O0OooO0oo3.f8882OooO0Oo;
                            }
                        }
                        i8 = oooO0O0.f8880OooO0O0;
                        if (i8 > oooO0O1.f8880OooO0O0) {
                            oooO0O0.f8880OooO0O0 = i8 - oooO0O1.f8882OooO0Oo;
                        }
                        i9 = oooO0O0.f8882OooO0Oo;
                        if (i9 > oooO0O1.f8880OooO0O0) {
                            oooO0O0.f8882OooO0Oo = i9 - oooO0O1.f8882OooO0Oo;
                        }
                    } else {
                        if (oooO0O0OooO0oo3 != null) {
                            i6 = oooO0O0.f8880OooO0O0;
                            if (i6 >= oooO0O0OooO0oo3.f8880OooO0O0) {
                                oooO0O0.f8880OooO0O0 = i6 - oooO0O0OooO0oo3.f8882OooO0Oo;
                            }
                            i7 = oooO0O0.f8882OooO0Oo;
                            if (i7 >= oooO0O0OooO0oo3.f8880OooO0O0) {
                                oooO0O0.f8882OooO0Oo = i7 - oooO0O0OooO0oo3.f8882OooO0Oo;
                            }
                        }
                        i4 = oooO0O0.f8880OooO0O0;
                        if (i4 >= oooO0O1.f8880OooO0O0) {
                            oooO0O0.f8880OooO0O0 = i4 - oooO0O1.f8882OooO0Oo;
                        }
                        i5 = oooO0O0.f8882OooO0Oo;
                        if (i5 >= oooO0O1.f8880OooO0O0) {
                            oooO0O0.f8882OooO0Oo = i5 - oooO0O1.f8882OooO0Oo;
                        }
                    }
                    arrayList.set(size, oooO0O1);
                    if (oooO0O0.f8880OooO0O0 != oooO0O0.f8882OooO0Oo) {
                        arrayList.set(i12, oooO0O0);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (oooO0O0OooO0oo3 != null) {
                        arrayList.add(size, oooO0O0OooO0oo3);
                    }
                }
            } else if (i13 == 4) {
                int i26 = oooO0O0.f8882OooO0Oo;
                int i27 = oooO0O1.f8880OooO0O0;
                if (i26 < i27) {
                    oooO0O1.f8880OooO0O0 = i27 - 1;
                } else {
                    int i28 = oooO0O1.f8882OooO0Oo;
                    if (i26 < i27 + i28) {
                        oooO0O1.f8882OooO0Oo = i28 - 1;
                        oooO0O0OooO0oo = ((OooO00o) o0oo0oo2.f9206OooO00o).OooO0oo(4, oooO0O0.f8880OooO0O0, 1, oooO0O1.f8881OooO0OO);
                    }
                    i = oooO0O0.f8880OooO0O0;
                    i2 = oooO0O1.f8880OooO0O0;
                    if (i <= i2) {
                        oooO0O1.f8880OooO0O0 = i2 + 1;
                    } else {
                        i3 = i2 + oooO0O1.f8882OooO0Oo;
                        if (i < i3) {
                            int i29 = i3 - i;
                            oooO0O0OooO0oo2 = ((OooO00o) o0oo0oo2.f9206OooO00o).OooO0oo(4, i + 1, i29, oooO0O1.f8881OooO0OO);
                            oooO0O1.f8882OooO0Oo -= i29;
                        }
                        arrayList.set(i12, oooO0O0);
                        if (oooO0O1.f8882OooO0Oo > 0) {
                            arrayList.set(size, oooO0O1);
                        } else {
                            arrayList.remove(size);
                            OooO00o oooO00o4 = (OooO00o) o0oo0oo2.f9206OooO00o;
                            Objects.requireNonNull(oooO00o4);
                            oooO0O1.f8881OooO0OO = null;
                            oooO00o4.f8873OooO00o.OooO00o(oooO0O1);
                        }
                        if (oooO0O0OooO0oo != null) {
                            arrayList.add(size, oooO0O0OooO0oo);
                        }
                        if (oooO0O0OooO0oo2 != null) {
                            arrayList.add(size, oooO0O0OooO0oo2);
                        }
                    }
                    oooO0O0OooO0oo2 = null;
                    arrayList.set(i12, oooO0O0);
                    if (oooO0O1.f8882OooO0Oo > 0) {
                        arrayList.set(size, oooO0O1);
                    } else {
                        arrayList.remove(size);
                        OooO00o oooO00o5 = (OooO00o) o0oo0oo2.f9206OooO00o;
                        Objects.requireNonNull(oooO00o5);
                        oooO0O1.f8881OooO0OO = null;
                        oooO00o5.f8873OooO00o.OooO00o(oooO0O1);
                    }
                    if (oooO0O0OooO0oo != null) {
                        arrayList.add(size, oooO0O0OooO0oo);
                    }
                    if (oooO0O0OooO0oo2 != null) {
                        arrayList.add(size, oooO0O0OooO0oo2);
                    }
                }
                oooO0O0OooO0oo = null;
                i = oooO0O0.f8880OooO0O0;
                i2 = oooO0O1.f8880OooO0O0;
                if (i <= i2) {
                    oooO0O1.f8880OooO0O0 = i2 + 1;
                } else {
                    i3 = i2 + oooO0O1.f8882OooO0Oo;
                    if (i < i3) {
                        int i210 = i3 - i;
                        oooO0O0OooO0oo2 = ((OooO00o) o0oo0oo2.f9206OooO00o).OooO0oo(4, i + 1, i210, oooO0O1.f8881OooO0OO);
                        oooO0O1.f8882OooO0Oo -= i210;
                    }
                    arrayList.set(i12, oooO0O0);
                    if (oooO0O1.f8882OooO0Oo > 0) {
                        arrayList.set(size, oooO0O1);
                    } else {
                        arrayList.remove(size);
                        OooO00o oooO00o6 = (OooO00o) o0oo0oo2.f9206OooO00o;
                        Objects.requireNonNull(oooO00o6);
                        oooO0O1.f8881OooO0OO = null;
                        oooO00o6.f8873OooO00o.OooO00o(oooO0O1);
                    }
                    if (oooO0O0OooO0oo != null) {
                        arrayList.add(size, oooO0O0OooO0oo);
                    }
                    if (oooO0O0OooO0oo2 != null) {
                        arrayList.add(size, oooO0O0OooO0oo2);
                    }
                }
                oooO0O0OooO0oo2 = null;
                arrayList.set(i12, oooO0O0);
                if (oooO0O1.f8882OooO0Oo > 0) {
                    arrayList.set(size, oooO0O1);
                } else {
                    arrayList.remove(size);
                    OooO00o oooO00o7 = (OooO00o) o0oo0oo2.f9206OooO00o;
                    Objects.requireNonNull(oooO00o7);
                    oooO0O1.f8881OooO0OO = null;
                    oooO00o7.f8873OooO00o.OooO00o(oooO0O1);
                }
                if (oooO0O0OooO0oo != null) {
                    arrayList.add(size, oooO0O0OooO0oo);
                }
                if (oooO0O0OooO0oo2 != null) {
                    arrayList.add(size, oooO0O0OooO0oo2);
                }
            }
        }
        int size2 = this.f8874OooO0O0.size();
        for (int i30 = 0; i30 < size2; i30++) {
            OooO0O0 oooO0O0OooO0oo4 = this.f8874OooO0O0.get(i30);
            int i31 = oooO0O0OooO0oo4.f8879OooO00o;
            if (i31 == 1) {
                OooO(oooO0O0OooO0oo4);
            } else if (i31 == 2) {
                int i32 = oooO0O0OooO0oo4.f8880OooO0O0;
                int i33 = oooO0O0OooO0oo4.f8882OooO0Oo + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO0O0(i34) != null || OooO00o(i34)) {
                        if (b2 == 0) {
                            OooO0Oo(OooO0oo(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            OooO(OooO0oo(2, i32, i35, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != oooO0O0OooO0oo4.f8882OooO0Oo) {
                    oooO0O0OooO0oo4.f8881OooO0OO = null;
                    this.f8873OooO00o.OooO00o(oooO0O0OooO0oo4);
                    oooO0O0OooO0oo4 = OooO0oo(2, i32, i35, null);
                }
                if (b2 == 0) {
                    OooO0Oo(oooO0O0OooO0oo4);
                } else {
                    OooO(oooO0O0OooO0oo4);
                }
            } else if (i31 == 4) {
                int i36 = oooO0O0OooO0oo4.f8880OooO0O0;
                int i37 = oooO0O0OooO0oo4.f8882OooO0Oo + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (((RecyclerView.OooOO0) this.f8876OooO0Oo).OooO0O0(i36) != null || OooO00o(i36)) {
                        if (b3 == 0) {
                            OooO0Oo(OooO0oo(4, i38, i39, oooO0O0OooO0oo4.f8881OooO0OO));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            OooO(OooO0oo(4, i38, i39, oooO0O0OooO0oo4.f8881OooO0OO));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != oooO0O0OooO0oo4.f8882OooO0Oo) {
                    Object obj = oooO0O0OooO0oo4.f8881OooO0OO;
                    oooO0O0OooO0oo4.f8881OooO0OO = null;
                    this.f8873OooO00o.OooO00o(oooO0O0OooO0oo4);
                    oooO0O0OooO0oo4 = OooO0oo(4, i38, i39, obj);
                }
                if (b3 == 0) {
                    OooO0Oo(oooO0O0OooO0oo4);
                } else {
                    OooO(oooO0O0OooO0oo4);
                }
            } else if (i31 == 8) {
                OooO(oooO0O0OooO0oo4);
            }
        }
        this.f8874OooO0O0.clear();
    }

    public final void OooOO0O(OooO0O0 oooO0O0) {
        oooO0O0.f8881OooO0OO = null;
        this.f8873OooO00o.OooO00o(oooO0O0);
    }

    public final void OooOO0o(List<OooO0O0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            OooOO0O(list.get(i));
        }
        list.clear();
    }

    public final int OooOOO0(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f8875OooO0OO.size() - 1; size >= 0; size--) {
            OooO0O0 oooO0O0 = this.f8875OooO0OO.get(size);
            int i5 = oooO0O0.f8879OooO00o;
            if (i5 == 8) {
                int i6 = oooO0O0.f8880OooO0O0;
                int i7 = oooO0O0.f8882OooO0Oo;
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
                            oooO0O0.f8880OooO0O0 = i6 + 1;
                            oooO0O0.f8882OooO0Oo = i7 + 1;
                        } else if (i2 == 2) {
                            oooO0O0.f8880OooO0O0 = i6 - 1;
                            oooO0O0.f8882OooO0Oo = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        oooO0O0.f8882OooO0Oo = i7 + 1;
                    } else if (i2 == 2) {
                        oooO0O0.f8882OooO0Oo = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        oooO0O0.f8880OooO0O0 = i6 + 1;
                    } else if (i2 == 2) {
                        oooO0O0.f8880OooO0O0 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = oooO0O0.f8880OooO0O0;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= oooO0O0.f8882OooO0Oo;
                    } else if (i5 == 2) {
                        i += oooO0O0.f8882OooO0Oo;
                    }
                } else if (i2 == 1) {
                    oooO0O0.f8880OooO0O0 = i8 + 1;
                } else if (i2 == 2) {
                    oooO0O0.f8880OooO0O0 = i8 - 1;
                }
            }
        }
        for (int size2 = this.f8875OooO0OO.size() - 1; size2 >= 0; size2--) {
            OooO0O0 oooO0O1 = this.f8875OooO0OO.get(size2);
            if (oooO0O1.f8879OooO00o == 8) {
                int i9 = oooO0O1.f8882OooO0Oo;
                if (i9 == oooO0O1.f8880OooO0O0 || i9 < 0) {
                    this.f8875OooO0OO.remove(size2);
                    OooOO0O(oooO0O1);
                }
            } else if (oooO0O1.f8882OooO0Oo <= 0) {
                this.f8875OooO0OO.remove(size2);
                OooOO0O(oooO0O1);
            }
        }
        return i;
    }
}
