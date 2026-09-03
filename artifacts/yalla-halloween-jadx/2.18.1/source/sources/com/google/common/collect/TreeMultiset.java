package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class TreeMultiset<E> extends Oooo0<E> implements Serializable {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final /* synthetic */ int f18378OoooO = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient o000O0<E> f18379OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient OooOO0<OooO<E>> f18380OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final transient OooO<E> f18381OoooO0O;

    public static final class OooO<E> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NullableDecl
        public OooO<E> f18382OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NullableDecl
        public final E f18383OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f18384OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f18385OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f18386OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NullableDecl
        public OooO<E> f18387OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f18388OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NullableDecl
        public OooO<E> f18389OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NullableDecl
        public OooO<E> f18390OooO0oo;

        public OooO(@NullableDecl E e, int i) {
            o0OOOO0o.OooOOOO.OooO0O0(i > 0);
            this.f18383OooO00o = e;
            this.f18384OooO0O0 = i;
            this.f18386OooO0Oo = i;
            this.f18385OooO0OO = 1;
            this.f18388OooO0o0 = 1;
            this.f18387OooO0o = null;
            this.f18389OooO0oO = null;
        }

        public static int OooO(@NullableDecl OooO<?> oooO) {
            if (oooO == null) {
                return 0;
            }
            return oooO.f18388OooO0o0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final OooO<E> OooO00o(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.f18383OooO00o);
            if (iCompare < 0) {
                OooO<E> oooO = this.f18387OooO0o;
                if (oooO == null) {
                    iArr[0] = 0;
                    OooO0O0(e, i);
                    return this;
                }
                int i2 = oooO.f18388OooO0o0;
                OooO<E> oooOOooO00o = oooO.OooO00o(comparator, e, i, iArr);
                this.f18387OooO0o = oooOOooO00o;
                if (iArr[0] == 0) {
                    this.f18385OooO0OO++;
                }
                this.f18386OooO0Oo += (long) i;
                return oooOOooO00o.f18388OooO0o0 == i2 ? this : OooOO0();
            }
            if (iCompare <= 0) {
                int i3 = this.f18384OooO0O0;
                iArr[0] = i3;
                long j = i;
                o0OOOO0o.OooOOOO.OooO0O0(((long) i3) + j <= 2147483647L);
                this.f18384OooO0O0 += i;
                this.f18386OooO0Oo += j;
                return this;
            }
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                iArr[0] = 0;
                OooO0OO(e, i);
                return this;
            }
            int i4 = oooO2.f18388OooO0o0;
            OooO<E> oooOOooO00o2 = oooO2.OooO00o(comparator, e, i, iArr);
            this.f18389OooO0oO = oooOOooO00o2;
            if (iArr[0] == 0) {
                this.f18385OooO0OO++;
            }
            this.f18386OooO0Oo += (long) i;
            return oooOOooO00o2.f18388OooO0o0 == i4 ? this : OooOO0();
        }

        public final OooO<E> OooO0O0(E e, int i) {
            OooO<E> oooO = new OooO<>(e, i);
            this.f18387OooO0o = oooO;
            OooO<E> oooO2 = this.f18390OooO0oo;
            int i2 = TreeMultiset.f18378OoooO;
            oooO2.f18382OooO = oooO;
            oooO.f18390OooO0oo = oooO2;
            oooO.f18382OooO = this;
            this.f18390OooO0oo = oooO;
            this.f18388OooO0o0 = Math.max(2, this.f18388OooO0o0);
            this.f18385OooO0OO++;
            this.f18386OooO0Oo += (long) i;
            return this;
        }

        public final OooO<E> OooO0OO(E e, int i) {
            OooO<E> oooO = new OooO<>(e, i);
            this.f18389OooO0oO = oooO;
            OooO<E> oooO2 = this.f18382OooO;
            int i2 = TreeMultiset.f18378OoooO;
            this.f18382OooO = oooO;
            oooO.f18390OooO0oo = this;
            oooO.f18382OooO = oooO2;
            oooO2.f18390OooO0oo = oooO;
            this.f18388OooO0o0 = Math.max(2, this.f18388OooO0o0);
            this.f18385OooO0OO++;
            this.f18386OooO0Oo += (long) i;
            return this;
        }

        public final int OooO0Oo() {
            return OooO(this.f18387OooO0o) - OooO(this.f18389OooO0oO);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int OooO0o(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, this.f18383OooO00o);
            if (iCompare < 0) {
                OooO<E> oooO = this.f18387OooO0o;
                if (oooO == null) {
                    return 0;
                }
                return oooO.OooO0o(comparator, e);
            }
            if (iCompare <= 0) {
                return this.f18384OooO0O0;
            }
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                return 0;
            }
            return oooO2.OooO0o(comparator, e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        public final OooO<E> OooO0o0(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, this.f18383OooO00o);
            if (iCompare < 0) {
                OooO<E> oooO = this.f18387OooO0o;
                return oooO == null ? this : (OooO) o0OOOO0o.OooOOO0.OooO00o(oooO.OooO0o0(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                return null;
            }
            return oooO2.OooO0o0(comparator, e);
        }

        public final OooO<E> OooO0oO() {
            int i = this.f18384OooO0O0;
            this.f18384OooO0O0 = 0;
            OooO<E> oooO = this.f18390OooO0oo;
            OooO<E> oooO2 = this.f18382OooO;
            int i2 = TreeMultiset.f18378OoooO;
            oooO.f18382OooO = oooO2;
            oooO2.f18390OooO0oo = oooO;
            OooO<E> oooO3 = this.f18387OooO0o;
            if (oooO3 == null) {
                return this.f18389OooO0oO;
            }
            OooO<E> oooO4 = this.f18389OooO0oO;
            if (oooO4 == null) {
                return oooO3;
            }
            if (oooO3.f18388OooO0o0 >= oooO4.f18388OooO0o0) {
                OooO<E> oooO5 = this.f18390OooO0oo;
                oooO5.f18387OooO0o = oooO3.OooOOO(oooO5);
                oooO5.f18389OooO0oO = this.f18389OooO0oO;
                oooO5.f18385OooO0OO = this.f18385OooO0OO - 1;
                oooO5.f18386OooO0Oo = this.f18386OooO0Oo - ((long) i);
                return oooO5.OooOO0();
            }
            OooO<E> oooO6 = this.f18382OooO;
            oooO6.f18389OooO0oO = oooO4.OooOOOO(oooO6);
            oooO6.f18387OooO0o = this.f18387OooO0o;
            oooO6.f18385OooO0OO = this.f18385OooO0OO - 1;
            oooO6.f18386OooO0Oo = this.f18386OooO0Oo - ((long) i);
            return oooO6.OooOO0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NullableDecl
        public final OooO<E> OooO0oo(Comparator<? super E> comparator, E e) {
            int iCompare = comparator.compare(e, this.f18383OooO00o);
            if (iCompare > 0) {
                OooO<E> oooO = this.f18389OooO0oO;
                return oooO == null ? this : (OooO) o0OOOO0o.OooOOO0.OooO00o(oooO.OooO0oo(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            OooO<E> oooO2 = this.f18387OooO0o;
            if (oooO2 == null) {
                return null;
            }
            return oooO2.OooO0oo(comparator, e);
        }

        public final OooO<E> OooOO0() {
            int iOooO0Oo = OooO0Oo();
            if (iOooO0Oo == -2) {
                if (this.f18389OooO0oO.OooO0Oo() > 0) {
                    this.f18389OooO0oO = this.f18389OooO0oO.OooOOo0();
                }
                return OooOOOo();
            }
            if (iOooO0Oo != 2) {
                OooOO0o();
                return this;
            }
            if (this.f18387OooO0o.OooO0Oo() < 0) {
                this.f18387OooO0o = this.f18387OooO0o.OooOOOo();
            }
            return OooOOo0();
        }

        public final void OooOO0O() {
            OooO<E> oooO = this.f18387OooO0o;
            int i = TreeMultiset.f18378OoooO;
            int i2 = (oooO == null ? 0 : oooO.f18385OooO0OO) + 1;
            OooO<E> oooO2 = this.f18389OooO0oO;
            this.f18385OooO0OO = i2 + (oooO2 != null ? oooO2.f18385OooO0OO : 0);
            this.f18386OooO0Oo = ((long) this.f18384OooO0O0) + (oooO == null ? 0L : oooO.f18386OooO0Oo) + (oooO2 != null ? oooO2.f18386OooO0Oo : 0L);
            OooOO0o();
        }

        public final void OooOO0o() {
            this.f18388OooO0o0 = Math.max(OooO(this.f18387OooO0o), OooO(this.f18389OooO0oO)) + 1;
        }

        public final OooO<E> OooOOO(OooO<E> oooO) {
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                return this.f18387OooO0o;
            }
            this.f18389OooO0oO = oooO2.OooOOO(oooO);
            this.f18385OooO0OO--;
            this.f18386OooO0Oo -= (long) oooO.f18384OooO0O0;
            return OooOO0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final OooO<E> OooOOO0(Comparator<? super E> comparator, @NullableDecl E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.f18383OooO00o);
            if (iCompare < 0) {
                OooO<E> oooO = this.f18387OooO0o;
                if (oooO == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f18387OooO0o = oooO.OooOOO0(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f18385OooO0OO--;
                        this.f18386OooO0Oo -= (long) iArr[0];
                    } else {
                        this.f18386OooO0Oo -= (long) i;
                    }
                }
                return iArr[0] == 0 ? this : OooOO0();
            }
            if (iCompare <= 0) {
                int i2 = this.f18384OooO0O0;
                iArr[0] = i2;
                if (i >= i2) {
                    return OooO0oO();
                }
                this.f18384OooO0O0 = i2 - i;
                this.f18386OooO0Oo -= (long) i;
                return this;
            }
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f18389OooO0oO = oooO2.OooOOO0(comparator, e, i, iArr);
            if (iArr[0] > 0) {
                if (i >= iArr[0]) {
                    this.f18385OooO0OO--;
                    this.f18386OooO0Oo -= (long) iArr[0];
                } else {
                    this.f18386OooO0Oo -= (long) i;
                }
            }
            return OooOO0();
        }

        public final OooO<E> OooOOOO(OooO<E> oooO) {
            OooO<E> oooO2 = this.f18387OooO0o;
            if (oooO2 == null) {
                return this.f18389OooO0oO;
            }
            this.f18387OooO0o = oooO2.OooOOOO(oooO);
            this.f18385OooO0OO--;
            this.f18386OooO0Oo -= (long) oooO.f18384OooO0O0;
            return OooOO0();
        }

        public final OooO<E> OooOOOo() {
            o0OOOO0o.OooOOOO.OooOOO0(this.f18389OooO0oO != null);
            OooO<E> oooO = this.f18389OooO0oO;
            this.f18389OooO0oO = oooO.f18387OooO0o;
            oooO.f18387OooO0o = this;
            oooO.f18386OooO0Oo = this.f18386OooO0Oo;
            oooO.f18385OooO0OO = this.f18385OooO0OO;
            OooOO0O();
            oooO.OooOO0o();
            return oooO;
        }

        public final OooO OooOOo(Comparator comparator, @NullableDecl Object obj, int i, int[] iArr) {
            int iCompare = comparator.compare(obj, this.f18383OooO00o);
            if (iCompare < 0) {
                OooO<E> oooO = this.f18387OooO0o;
                if (oooO == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f18387OooO0o = oooO.OooOOo(comparator, obj, i, iArr);
                if (iArr[0] == i) {
                    if (iArr[0] != 0) {
                        this.f18385OooO0OO--;
                    }
                    this.f18386OooO0Oo += (long) (0 - iArr[0]);
                }
                return OooOO0();
            }
            if (iCompare <= 0) {
                int i2 = this.f18384OooO0O0;
                iArr[0] = i2;
                return i == i2 ? OooO0oO() : this;
            }
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f18389OooO0oO = oooO2.OooOOo(comparator, obj, i, iArr);
            if (iArr[0] == i) {
                if (iArr[0] != 0) {
                    this.f18385OooO0OO--;
                }
                this.f18386OooO0Oo += (long) (0 - iArr[0]);
            }
            return OooOO0();
        }

        public final OooO<E> OooOOo0() {
            o0OOOO0o.OooOOOO.OooOOO0(this.f18387OooO0o != null);
            OooO<E> oooO = this.f18387OooO0o;
            this.f18387OooO0o = oooO.f18389OooO0oO;
            oooO.f18389OooO0oO = this;
            oooO.f18386OooO0Oo = this.f18386OooO0Oo;
            oooO.f18385OooO0OO = this.f18385OooO0OO;
            OooOO0O();
            oooO.OooOO0o();
            return oooO;
        }

        public final OooO OooOOoo(Comparator comparator, @NullableDecl Object obj, int[] iArr) {
            int iCompare = comparator.compare(obj, this.f18383OooO00o);
            if (iCompare < 0) {
                OooO<E> oooO = this.f18387OooO0o;
                if (oooO == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f18387OooO0o = oooO.OooOOoo(comparator, obj, iArr);
                if (iArr[0] != 0) {
                    this.f18385OooO0OO--;
                }
                this.f18386OooO0Oo += (long) (0 - iArr[0]);
                return OooOO0();
            }
            if (iCompare <= 0) {
                iArr[0] = this.f18384OooO0O0;
                return OooO0oO();
            }
            OooO<E> oooO2 = this.f18389OooO0oO;
            if (oooO2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f18389OooO0oO = oooO2.OooOOoo(comparator, obj, iArr);
            if (iArr[0] != 0) {
                this.f18385OooO0OO--;
            }
            this.f18386OooO0Oo += (long) (0 - iArr[0]);
            return OooOO0();
        }

        public final String toString() {
            E e = this.f18383OooO00o;
            int i = this.f18384OooO0O0;
            oo000o.OooO0O0(i, "count");
            String strValueOf = String.valueOf(e);
            if (i == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + i;
        }
    }

    public class OooO00o implements Iterator<o00OO.OooO00o<E>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO<E> f18391Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public o00OO.OooO00o<E> f18392Oooo0oO;

        public OooO00o() {
            OooO<E> oooOOooO0o0;
            OooO<E> oooO = TreeMultiset.this.f18380OoooO00.f18398OooO00o;
            OooO<E> oooO2 = null;
            if (oooO != null) {
                o000O0<E> o000o0 = TreeMultiset.this.f18379OoooO0;
                if (o000o0.f18446Oooo0oO) {
                    E e = o000o0.f18447Oooo0oo;
                    oooOOooO0o0 = oooO.OooO0o0(TreeMultiset.this.f18366Oooo0oo, e);
                    if (oooOOooO0o0 != null) {
                        if (TreeMultiset.this.f18379OoooO0.f18444Oooo == BoundType.OPEN && TreeMultiset.this.f18366Oooo0oo.compare(e, oooOOooO0o0.f18383OooO00o) == 0) {
                            oooOOooO0o0 = oooOOooO0o0.f18382OooO;
                        }
                    }
                } else {
                    oooOOooO0o0 = TreeMultiset.this.f18381OoooO0O.f18382OooO;
                }
                if (oooOOooO0o0 != TreeMultiset.this.f18381OoooO0O && TreeMultiset.this.f18379OoooO0.OooO00o(oooOOooO0o0.f18383OooO00o)) {
                    oooO2 = oooOOooO0o0;
                }
            }
            this.f18391Oooo0o = oooO2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            OooO<E> oooO = this.f18391Oooo0o;
            if (oooO == null) {
                return false;
            }
            if (!TreeMultiset.this.f18379OoooO0.OooO0OO(oooO.f18383OooO00o)) {
                return true;
            }
            this.f18391Oooo0o = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            OooO<E> oooO = this.f18391Oooo0o;
            int i = TreeMultiset.f18378OoooO;
            Objects.requireNonNull(treeMultiset);
            oo0OOoo oo0oooo = new oo0OOoo(treeMultiset, oooO);
            this.f18392Oooo0oO = oo0oooo;
            OooO<E> oooO2 = this.f18391Oooo0o.f18382OooO;
            if (oooO2 == TreeMultiset.this.f18381OoooO0O) {
                this.f18391Oooo0o = null;
            } else {
                this.f18391Oooo0o = oooO2;
            }
            return oo0oooo;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f18392Oooo0oO != null);
            TreeMultiset.this.o0000O0O(this.f18392Oooo0oO.f18681Oooo0o.f18383OooO00o);
            this.f18392Oooo0oO = null;
        }
    }

    public class OooO0O0 implements Iterator<o00OO.OooO00o<E>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO<E> f18394Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public o00OO.OooO00o<E> f18395Oooo0oO;

        /* JADX WARN: Code duplicated, block: B:20:0x0047  */
        public OooO0O0() {
            OooO<E> oooOOooO0oo;
            OooO<E> oooO = TreeMultiset.this.f18380OoooO00.f18398OooO00o;
            if (oooO != null) {
                o000O0<E> o000o0 = TreeMultiset.this.f18379OoooO0;
                if (o000o0.f18449OoooO00) {
                    E e = o000o0.f18448OoooO0;
                    oooOOooO0oo = oooO.OooO0oo(TreeMultiset.this.f18366Oooo0oo, e);
                    if (oooOOooO0oo != null) {
                        if (TreeMultiset.this.f18379OoooO0.f18450OoooO0O == BoundType.OPEN && TreeMultiset.this.f18366Oooo0oo.compare(e, oooOOooO0oo.f18383OooO00o) == 0) {
                            oooOOooO0oo = oooOOooO0oo.f18390OooO0oo;
                        }
                    }
                } else {
                    oooOOooO0oo = TreeMultiset.this.f18381OoooO0O.f18390OooO0oo;
                }
                oooOOooO0oo = (oooOOooO0oo == TreeMultiset.this.f18381OoooO0O || !TreeMultiset.this.f18379OoooO0.OooO00o(oooOOooO0oo.f18383OooO00o)) ? null : oooOOooO0oo;
            }
            this.f18394Oooo0o = oooOOooO0oo;
            this.f18395Oooo0oO = null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            OooO<E> oooO = this.f18394Oooo0o;
            if (oooO == null) {
                return false;
            }
            if (!TreeMultiset.this.f18379OoooO0.OooO0Oo(oooO.f18383OooO00o)) {
                return true;
            }
            this.f18394Oooo0o = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            TreeMultiset treeMultiset = TreeMultiset.this;
            OooO<E> oooO = this.f18394Oooo0o;
            int i = TreeMultiset.f18378OoooO;
            Objects.requireNonNull(treeMultiset);
            oo0OOoo oo0oooo = new oo0OOoo(treeMultiset, oooO);
            this.f18395Oooo0oO = oo0oooo;
            OooO<E> oooO2 = this.f18394Oooo0o.f18390OooO0oo;
            if (oooO2 == TreeMultiset.this.f18381OoooO0O) {
                this.f18394Oooo0o = null;
            } else {
                this.f18394Oooo0o = oooO2;
            }
            return oo0oooo;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f18395Oooo0oO != null);
            TreeMultiset.this.o0000O0O(this.f18395Oooo0oO.f18681Oooo0o.f18383OooO00o);
            this.f18395Oooo0oO = null;
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f18397OooO00o;

        static {
            int[] iArr = new int[BoundType.values().length];
            f18397OooO00o = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18397OooO00o[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0o {
        private static final /* synthetic */ OooO0o[] $VALUES;
        public static final OooO0o DISTINCT;
        public static final OooO0o SIZE;

        public static enum OooO00o extends OooO0o {
            public OooO00o() {
                super("SIZE", 0, null);
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0o
            public final int OooO00o(OooO<?> oooO) {
                return oooO.f18384OooO0O0;
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0o
            public final long OooO0O0(@NullableDecl OooO<?> oooO) {
                if (oooO == null) {
                    return 0L;
                }
                return oooO.f18386OooO0Oo;
            }
        }

        public static enum OooO0O0 extends OooO0o {
            public OooO0O0() {
                super("DISTINCT", 1, null);
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0o
            public final int OooO00o(OooO<?> oooO) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0o
            public final long OooO0O0(@NullableDecl OooO<?> oooO) {
                if (oooO == null) {
                    return 0L;
                }
                return oooO.f18385OooO0OO;
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            SIZE = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            DISTINCT = oooO0O0;
            $VALUES = new OooO0o[]{oooO00o, oooO0O0};
        }

        public OooO0o(String str, int i, oo0OOoo oo0oooo) {
            super(str, i);
        }

        public static OooO0o valueOf(String str) {
            return (OooO0o) Enum.valueOf(OooO0o.class, str);
        }

        public static OooO0o[] values() {
            return (OooO0o[]) $VALUES.clone();
        }

        public abstract int OooO00o(OooO<?> oooO);

        public abstract long OooO0O0(@NullableDecl OooO<?> oooO);
    }

    public static final class OooOO0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NullableDecl
        public T f18398OooO00o;

        public final void OooO00o(@NullableDecl T t, T t2) {
            if (this.f18398OooO00o != t) {
                throw new ConcurrentModificationException();
            }
            this.f18398OooO00o = t2;
        }
    }

    public TreeMultiset(OooOO0<OooO<E>> oooOO1, o000O0<E> o000o0, OooO<E> oooO) {
        super(o000o0.f18445Oooo0o);
        this.f18380OoooO00 = oooOO1;
        this.f18379OoooO0 = o000o0;
        this.f18381OoooO0O = oooO;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        o0O00.OooO00o(Oooo0.class, "comparator").OooO00o(this, comparator);
        o0O00.OooO00o OooO00o2 = o0O00.OooO00o(TreeMultiset.class, "range");
        BoundType boundType = BoundType.OPEN;
        OooO00o2.OooO00o(this, new o000O0(comparator, false, null, boundType, false, null, boundType));
        o0O00.OooO00o(TreeMultiset.class, "rootReference").OooO00o(this, new OooOO0());
        OooO<E> oooO = new OooO<>(null, 1);
        o0O00.OooO00o(TreeMultiset.class, "header").OooO00o(this, oooO);
        oooO.f18382OooO = oooO;
        oooO.f18390OooO0oo = oooO;
        o0O00.OooO0Oo(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(OooO0Oo().comparator());
        o0O00.OooO0oO(this, objectOutputStream);
    }

    public final long OooO(OooO0o oooO0o, @NullableDecl OooO<E> oooO) {
        long jOooO0O0;
        long jOooO;
        if (oooO == null) {
            return 0L;
        }
        int iCompare = this.f18366Oooo0oo.compare(this.f18379OoooO0.f18448OoooO0, oooO.f18383OooO00o);
        if (iCompare > 0) {
            return OooO(oooO0o, oooO.f18389OooO0oO);
        }
        if (iCompare == 0) {
            int i = OooO0OO.f18397OooO00o[this.f18379OoooO0.f18450OoooO0O.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return oooO0o.OooO0O0(oooO.f18389OooO0oO);
                }
                throw new AssertionError();
            }
            jOooO0O0 = oooO0o.OooO00o(oooO);
            jOooO = oooO0o.OooO0O0(oooO.f18389OooO0oO);
        } else {
            jOooO0O0 = oooO0o.OooO0O0(oooO.f18389OooO0oO) + ((long) oooO0o.OooO00o(oooO));
            jOooO = OooO(oooO0o, oooO.f18387OooO0o);
        }
        return jOooO + jOooO0O0;
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        return o0OOOOO.OooO0OO.OooO00o(OooOO0O(OooO0o.DISTINCT));
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0o0() {
        return new o00OOO00(new OooO00o());
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o00OO.OooO00o<E>> OooO0oO() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.Oooo0
    public final Iterator<o00OO.OooO00o<E>> OooO0oo() {
        return new OooO0O0();
    }

    public final long OooOO0(OooO0o oooO0o, @NullableDecl OooO<E> oooO) {
        long jOooO0O0;
        long jOooOO0;
        if (oooO == null) {
            return 0L;
        }
        int iCompare = this.f18366Oooo0oo.compare(this.f18379OoooO0.f18447Oooo0oo, oooO.f18383OooO00o);
        if (iCompare < 0) {
            return OooOO0(oooO0o, oooO.f18387OooO0o);
        }
        if (iCompare == 0) {
            int i = OooO0OO.f18397OooO00o[this.f18379OoooO0.f18444Oooo.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return oooO0o.OooO0O0(oooO.f18387OooO0o);
                }
                throw new AssertionError();
            }
            jOooO0O0 = oooO0o.OooO00o(oooO);
            jOooOO0 = oooO0o.OooO0O0(oooO.f18387OooO0o);
        } else {
            jOooO0O0 = oooO0o.OooO0O0(oooO.f18387OooO0o) + ((long) oooO0o.OooO00o(oooO));
            jOooOO0 = OooOO0(oooO0o, oooO.f18389OooO0oO);
        }
        return jOooOO0 + jOooO0O0;
    }

    public final long OooOO0O(OooO0o oooO0o) {
        OooO<E> oooO = this.f18380OoooO00.f18398OooO00o;
        long jOooO0O0 = oooO0o.OooO0O0(oooO);
        if (this.f18379OoooO0.f18446Oooo0oO) {
            jOooO0O0 -= OooOO0(oooO0o, oooO);
        }
        return this.f18379OoooO0.f18449OoooO00 ? jOooO0O0 - OooO(oooO0o, oooO) : jOooO0O0;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOO(@NullableDecl Object obj, int i) {
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return Ooooo0o(obj);
        }
        OooO<E> oooO = this.f18380OoooO00.f18398OooO00o;
        int[] iArr = new int[1];
        try {
            if (this.f18379OoooO0.OooO00o(obj) && oooO != null) {
                this.f18380OoooO00.OooO00o(oooO, oooO.OooOOO0(this.f18366Oooo0oo, obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOo(@NullableDecl E e, int i) {
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return Ooooo0o(e);
        }
        o0OOOO0o.OooOOOO.OooO0O0(this.f18379OoooO0.OooO00o(e));
        OooO<E> oooO = this.f18380OoooO00.f18398OooO00o;
        if (oooO != null) {
            int[] iArr = new int[1];
            this.f18380OoooO00.OooO00o(oooO, oooO.OooO00o(this.f18366Oooo0oo, e, i, iArr));
            return iArr[0];
        }
        this.f18366Oooo0oo.compare(e, e);
        OooO<E> oooO2 = new OooO<>(e, i);
        OooO<E> oooO3 = this.f18381OoooO0O;
        oooO3.f18382OooO = oooO2;
        oooO2.f18390OooO0oo = oooO3;
        oooO2.f18382OooO = oooO3;
        oooO3.f18390OooO0oo = oooO2;
        this.f18380OoooO00.OooO00o(oooO, oooO2);
        return 0;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final boolean Oooo0(@NullableDecl Object obj, int i) {
        oo000o.OooO0O0(0, "newCount");
        oo000o.OooO0O0(i, "oldCount");
        o0OOOO0o.OooOOOO.OooO0O0(this.f18379OoooO0.OooO00o(obj));
        OooO<E> oooO = this.f18380OoooO00.f18398OooO00o;
        if (oooO == null) {
            return i == 0;
        }
        int[] iArr = new int[1];
        this.f18380OoooO00.OooO00o(oooO, oooO.OooOOo(this.f18366Oooo0oo, obj, i, iArr));
        return iArr[0] == i;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> OoooOOo(@NullableDecl E e, BoundType boundType) {
        return new TreeMultiset(this.f18380OoooO00, this.f18379OoooO0.OooO0O0(new o000O0<>(this.f18366Oooo0oo, false, null, BoundType.OPEN, true, e, boundType)), this.f18381OoooO0O);
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(@NullableDecl Object obj) {
        try {
            OooO<E> oooO = this.f18380OoooO00.f18398OooO00o;
            if (this.f18379OoooO0.OooO00o(obj) && oooO != null) {
                return oooO.OooO0o(this.f18366Oooo0oo, obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        o000O0<E> o000o0 = this.f18379OoooO0;
        if (o000o0.f18446Oooo0oO || o000o0.f18449OoooO00) {
            o00O0.OooO0O0(new OooO00o());
            return;
        }
        OooO<E> oooO = this.f18381OoooO0O.f18382OooO;
        while (true) {
            OooO<E> oooO2 = this.f18381OoooO0O;
            if (oooO == oooO2) {
                oooO2.f18382OooO = oooO2;
                oooO2.f18390OooO0oo = oooO2;
                this.f18380OoooO00.f18398OooO00o = null;
                return;
            } else {
                OooO<E> oooO3 = oooO.f18382OooO;
                oooO.f18384OooO0O0 = 0;
                oooO.f18387OooO0o = null;
                oooO.f18389OooO0oO = null;
                oooO.f18390OooO0oo = null;
                oooO.f18382OooO = null;
                oooO = oooO3;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return o00OOO0.OooO0O0(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int o0000O0O(@NullableDecl Object obj) {
        OooO<E> oooO;
        oo000o.OooO0O0(0, "count");
        if (!this.f18379OoooO0.OooO00o(obj) || (oooO = this.f18380OoooO00.f18398OooO00o) == null) {
            return 0;
        }
        int[] iArr = new int[1];
        this.f18380OoooO00.OooO00o(oooO, oooO.OooOOoo(this.f18366Oooo0oo, obj, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> o0OoOo0(@NullableDecl E e, BoundType boundType) {
        return new TreeMultiset(this.f18380OoooO00, this.f18379OoooO0.OooO0O0(new o000O0<>(this.f18366Oooo0oo, true, e, boundType, false, null, BoundType.OPEN)), this.f18381OoooO0O);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    public final int size() {
        return o0OOOOO.OooO0OO.OooO00o(OooOO0O(OooO0o.SIZE));
    }
}
