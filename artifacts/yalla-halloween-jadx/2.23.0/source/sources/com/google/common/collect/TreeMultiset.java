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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends Oooo0<E> implements Serializable {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f19372OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient o000O0Oo<E> f19373OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient OooO<OooO0o<E>> f19374OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final transient OooO0o<E> f19375OooOO0;

    public static final class OooO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @CheckForNull
        public T f19376OooO00o;

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(@CheckForNull OooO0o oooO0o, @CheckForNull OooO0o oooO0o2) {
            if (this.f19376OooO00o != oooO0o) {
                throw new ConcurrentModificationException();
            }
            this.f19376OooO00o = oooO0o2;
        }
    }

    public class OooO00o implements Iterator<o0oOO.OooO00o<E>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<E> f19377OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public o0OO00OO f19379OooO0o0;

        /* JADX WARN: Code duplicated, block: B:19:0x0044  */
        public OooO00o() {
            OooO0o<E> oooO0oOooO0Oo;
            OooO0o oooO0o = (OooO0o<E>) TreeMultiset.this.f19374OooO0oo.f19376OooO00o;
            if (oooO0o != null) {
                o000O0Oo<E> o000o0oo2 = TreeMultiset.this.f19373OooO;
                boolean z = o000o0oo2.f19440OooO0o0;
                OooO0o<E> oooO0o2 = TreeMultiset.this.f19375OooOO0;
                if (z) {
                    Comparator<? super E> comparator = TreeMultiset.this.f19359OooO0o;
                    E e = o000o0oo2.f19439OooO0o;
                    oooO0oOooO0Oo = oooO0o.OooO0Oo(comparator, e);
                    if (oooO0oOooO0Oo != null) {
                        if (o000o0oo2.f19441OooO0oO == BoundType.OPEN && comparator.compare(e, oooO0oOooO0Oo.f19382OooO00o) == 0) {
                            oooO0oOooO0Oo = oooO0oOooO0Oo.f19381OooO;
                            Objects.requireNonNull(oooO0oOooO0Oo);
                        }
                    }
                } else {
                    oooO0oOooO0Oo = oooO0o2.f19381OooO;
                    Objects.requireNonNull(oooO0oOooO0Oo);
                }
                oooO0oOooO0Oo = (oooO0oOooO0Oo == oooO0o2 || !o000o0oo2.OooO00o(oooO0oOooO0Oo.f19382OooO00o)) ? null : oooO0oOooO0Oo;
            }
            this.f19377OooO0Oo = oooO0oOooO0Oo;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            OooO0o<E> oooO0o = this.f19377OooO0Oo;
            if (oooO0o == null) {
                return false;
            }
            if (!TreeMultiset.this.f19373OooO.OooO0OO(oooO0o.f19382OooO00o)) {
                return true;
            }
            this.f19377OooO0Oo = null;
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            OooO0o<E> oooO0o = this.f19377OooO0Oo;
            Objects.requireNonNull(oooO0o);
            int i = TreeMultiset.f19372OooOO0O;
            TreeMultiset treeMultiset = TreeMultiset.this;
            treeMultiset.getClass();
            o0OO00OO o0oo00oo2 = new o0OO00OO(treeMultiset, oooO0o);
            this.f19379OooO0o0 = o0oo00oo2;
            OooO0o<E> oooO0o2 = this.f19377OooO0Oo.f19381OooO;
            Objects.requireNonNull(oooO0o2);
            if (oooO0o2 == treeMultiset.f19375OooOO0) {
                this.f19377OooO0Oo = null;
            } else {
                OooO0o<E> oooO0o3 = this.f19377OooO0Oo.f19381OooO;
                Objects.requireNonNull(oooO0o3);
                this.f19377OooO0Oo = oooO0o3;
            }
            return o0oo00oo2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.o000oOoO.OooOOO(this.f19379OooO0o0 != null, "no calls to next() since the last call to remove()");
            TreeMultiset.this.o0000OOo(this.f19379OooO0o0.f19619OooO0Oo.f19382OooO00o);
            this.f19379OooO0o0 = null;
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19380OooO00o;

        static {
            int[] iArr = new int[BoundType.values().length];
            f19380OooO00o = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19380OooO00o[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class OooO0OO {
        private static final /* synthetic */ OooO0OO[] $VALUES;
        public static final OooO0OO DISTINCT;
        public static final OooO0OO SIZE;

        public final enum OooO00o extends OooO0OO {
            public OooO00o() {
                super("SIZE", 0);
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0OO
            public final int OooO00o(OooO0o<?> oooO0o) {
                return oooO0o.f19383OooO0O0;
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0OO
            public final long OooO0O0(@CheckForNull OooO0o<?> oooO0o) {
                if (oooO0o == null) {
                    return 0L;
                }
                return oooO0o.f19385OooO0Oo;
            }
        }

        public final enum OooO0O0 extends OooO0OO {
            public OooO0O0() {
                super("DISTINCT", 1);
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0OO
            public final int OooO00o(OooO0o<?> oooO0o) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.OooO0OO
            public final long OooO0O0(@CheckForNull OooO0o<?> oooO0o) {
                if (oooO0o == null) {
                    return 0L;
                }
                return oooO0o.f19384OooO0OO;
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            SIZE = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            DISTINCT = oooO0O0;
            $VALUES = new OooO0OO[]{oooO00o, oooO0O0};
        }

        public OooO0OO() {
            throw null;
        }

        public OooO0OO(String str, int i) {
            super(str, i);
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) $VALUES.clone();
        }

        public abstract int OooO00o(OooO0o<?> oooO0o);

        public abstract long OooO0O0(@CheckForNull OooO0o<?> oooO0o);
    }

    public TreeMultiset(OooO<OooO0o<E>> oooO, o000O0Oo<E> o000o0oo2, OooO0o<E> oooO0o) {
        super(o000o0oo2.f19438OooO0Oo);
        this.f19374OooO0oo = oooO;
        this.f19373OooO = o000o0oo2;
        this.f19375OooOO0 = oooO0o;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        o0O00oO0.OooO00o(Oooo0.class, "comparator").OooO00o(this, comparator);
        o0O00oO0.OooO00o OooO00o2 = o0O00oO0.OooO00o(TreeMultiset.class, "range");
        BoundType boundType = BoundType.OPEN;
        OooO00o2.OooO00o(this, new o000O0Oo(comparator, false, null, boundType, false, null, boundType));
        o0O00oO0.OooO00o(TreeMultiset.class, "rootReference").OooO00o(this, new OooO());
        OooO0o<E> oooO0o = new OooO0o<>();
        o0O00oO0.OooO00o(TreeMultiset.class, "header").OooO00o(this, oooO0o);
        oooO0o.f19381OooO = oooO0o;
        oooO0o.f19389OooO0oo = oooO0o;
        o0O00oO0.OooO0Oo(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(OooO0oO().comparator());
        o0O00oO0.OooO0oO(this, objectOutputStream);
    }

    public final long OooO(OooO0OO oooO0OO, @CheckForNull OooO0o<E> oooO0o) {
        long jOooO0O0;
        long jOooO;
        if (oooO0o == null) {
            return 0L;
        }
        o000O0Oo<E> o000o0oo2 = this.f19373OooO;
        int iCompare = this.f19359OooO0o.compare(o000o0oo2.f19439OooO0o, oooO0o.f19382OooO00o);
        if (iCompare < 0) {
            return OooO(oooO0OO, oooO0o.f19386OooO0o);
        }
        if (iCompare == 0) {
            int i = OooO0O0.f19380OooO00o[o000o0oo2.f19441OooO0oO.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return oooO0OO.OooO0O0(oooO0o.f19386OooO0o);
                }
                throw new AssertionError();
            }
            jOooO0O0 = oooO0OO.OooO00o(oooO0o);
            jOooO = oooO0OO.OooO0O0(oooO0o.f19386OooO0o);
        } else {
            jOooO0O0 = oooO0OO.OooO0O0(oooO0o.f19386OooO0o) + ((long) oooO0OO.OooO00o(oooO0o));
            jOooO = OooO(oooO0OO, oooO0o.f19388OooO0oO);
        }
        return jOooO + jOooO0O0;
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        return com.google.common.primitives.OooO0o.OooO0OO(OooOO0(OooO0OO.DISTINCT));
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0Oo() {
        return new o0O00o0(new OooO00o());
    }

    @Override // com.google.common.collect.Oooo0
    public final o0OO00o0 OooO0o() {
        return new o0OO00o0(this);
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o0oOO.OooO00o<E>> OooO0o0() {
        return new OooO00o();
    }

    public final long OooO0oo(OooO0OO oooO0OO, @CheckForNull OooO0o<E> oooO0o) {
        long jOooO0O0;
        long jOooO0oo;
        if (oooO0o == null) {
            return 0L;
        }
        o000O0Oo<E> o000o0oo2 = this.f19373OooO;
        int iCompare = this.f19359OooO0o.compare(o000o0oo2.f19437OooO, oooO0o.f19382OooO00o);
        if (iCompare > 0) {
            return OooO0oo(oooO0OO, oooO0o.f19388OooO0oO);
        }
        if (iCompare == 0) {
            int i = OooO0O0.f19380OooO00o[o000o0oo2.f19443OooOO0.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return oooO0OO.OooO0O0(oooO0o.f19388OooO0oO);
                }
                throw new AssertionError();
            }
            jOooO0O0 = oooO0OO.OooO00o(oooO0o);
            jOooO0oo = oooO0OO.OooO0O0(oooO0o.f19388OooO0oO);
        } else {
            jOooO0O0 = oooO0OO.OooO0O0(oooO0o.f19388OooO0oO) + ((long) oooO0OO.OooO00o(oooO0o));
            jOooO0oo = OooO0oo(oooO0OO, oooO0o.f19386OooO0o);
        }
        return jOooO0oo + jOooO0O0;
    }

    public final long OooOO0(OooO0OO oooO0OO) {
        OooO0o<E> oooO0o = this.f19374OooO0oo.f19376OooO00o;
        long jOooO0O0 = oooO0OO.OooO0O0(oooO0o);
        o000O0Oo<E> o000o0oo2 = this.f19373OooO;
        if (o000o0oo2.f19440OooO0o0) {
            jOooO0O0 -= OooO(oooO0OO, oooO0o);
        }
        return o000o0oo2.f19442OooO0oo ? jOooO0O0 - OooO0oo(oooO0OO, oooO0o) : jOooO0O0;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooo00o(int i, @CheckForNull Object obj) {
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return o000OOo(obj);
        }
        OooO<OooO0o<E>> oooO = this.f19374OooO0oo;
        OooO0o<E> oooO0o = oooO.f19376OooO00o;
        int[] iArr = new int[1];
        try {
            if (this.f19373OooO.OooO00o(obj) && oooO0o != null) {
                oooO.OooO00o(oooO0o, oooO0o.OooOO0O(this.f19359OooO0o, obj, i, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooooo(@ParametricNullness E e, int i) {
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return o000OOo(e);
        }
        com.google.common.base.o000oOoO.OooO0Oo(this.f19373OooO.OooO00o(e));
        OooO<OooO0o<E>> oooO = this.f19374OooO0oo;
        OooO0o<E> oooO0o = oooO.f19376OooO00o;
        Comparator<? super E> comparator = this.f19359OooO0o;
        if (oooO0o != null) {
            int[] iArr = new int[1];
            oooO.OooO00o(oooO0o, oooO0o.OooO00o(comparator, e, i, iArr));
            return iArr[0];
        }
        comparator.compare(e, e);
        OooO0o<E> oooO0o2 = new OooO0o<>(e, i);
        OooO0o<E> oooO0o3 = this.f19375OooOO0;
        oooO0o3.f19381OooO = oooO0o2;
        oooO0o2.f19389OooO0oo = oooO0o3;
        oooO0o2.f19381OooO = oooO0o3;
        oooO0o3.f19389OooO0oo = oooO0o2;
        oooO.OooO00o(oooO0o, oooO0o2);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        o000O0Oo<E> o000o0oo2 = this.f19373OooO;
        if (o000o0oo2.f19440OooO0o0 || o000o0oo2.f19442OooO0oo) {
            o00O0O0O.OooO0O0(new OooO00o());
            return;
        }
        OooO0o<E> oooO0o = this.f19375OooOO0;
        OooO0o<E> oooO0o2 = oooO0o.f19381OooO;
        Objects.requireNonNull(oooO0o2);
        while (oooO0o2 != oooO0o) {
            OooO0o<E> oooO0o3 = oooO0o2.f19381OooO;
            Objects.requireNonNull(oooO0o3);
            oooO0o2.f19383OooO0O0 = 0;
            oooO0o2.f19386OooO0o = null;
            oooO0o2.f19388OooO0oO = null;
            oooO0o2.f19389OooO0oo = null;
            oooO0o2.f19381OooO = null;
            oooO0o2 = oooO0o3;
        }
        oooO0o.f19381OooO = oooO0o;
        oooO0o.f19389OooO0oo = oooO0o;
        this.f19374OooO0oo.f19376OooO00o = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return oo00oO.OooO0OO(this);
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> o00000O(@ParametricNullness E e, BoundType boundType) {
        return new TreeMultiset(this.f19374OooO0oo, this.f19373OooO.OooO0O0(new o000O0Oo<>(this.f19359OooO0o, true, e, boundType, false, null, BoundType.OPEN)), this.f19375OooOO0);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int o0000OOo(@ParametricNullness Object obj) {
        OooO<OooO0o<E>> oooO;
        OooO0o<E> oooO0o;
        oo000o.OooO0O0(0, "count");
        if (!this.f19373OooO.OooO00o(obj) || (oooO0o = (oooO = this.f19374OooO0oo).f19376OooO00o) == null) {
            return 0;
        }
        int[] iArr = new int[1];
        oooO.OooO00o(oooO0o, oooO0o.OooOOo0(this.f19359OooO0o, obj, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000OOo(@CheckForNull Object obj) {
        try {
            OooO0o<E> oooO0o = this.f19374OooO0oo.f19376OooO00o;
            if (this.f19373OooO.OooO00o(obj) && oooO0o != null) {
                return oooO0o.OooO0o0(this.f19359OooO0o, obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final boolean o00Oo0(int i, @ParametricNullness Object obj) {
        oo000o.OooO0O0(0, "newCount");
        oo000o.OooO0O0(i, "oldCount");
        com.google.common.base.o000oOoO.OooO0Oo(this.f19373OooO.OooO00o(obj));
        OooO<OooO0o<E>> oooO = this.f19374OooO0oo;
        OooO0o<E> oooO0o = oooO.f19376OooO00o;
        if (oooO0o == null) {
            return i == 0;
        }
        int[] iArr = new int[1];
        oooO.OooO00o(oooO0o, oooO0o.OooOOOo(this.f19359OooO0o, obj, i, iArr));
        return iArr[0] == i;
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> o0O0O00(@ParametricNullness E e, BoundType boundType) {
        return new TreeMultiset(this.f19374OooO0oo, this.f19373OooO.OooO0O0(new o000O0Oo<>(this.f19359OooO0o, false, null, BoundType.OPEN, true, e, boundType)), this.f19375OooOO0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.OooO0o.OooO0OO(OooOO0(OooO0OO.SIZE));
    }

    public static final class OooO0o<E> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<E> f19381OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @CheckForNull
        public final E f19382OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f19383OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f19384OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f19385OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public OooO0o<E> f19386OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19387OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<E> f19388OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<E> f19389OooO0oo;

        public OooO0o(@ParametricNullness E e, int i) {
            com.google.common.base.o000oOoO.OooO0Oo(i > 0);
            this.f19382OooO00o = e;
            this.f19383OooO0O0 = i;
            this.f19385OooO0Oo = i;
            this.f19384OooO0OO = 1;
            this.f19387OooO0o0 = 1;
            this.f19386OooO0o = null;
            this.f19388OooO0oO = null;
        }

        public final void OooO() {
            OooO0o<E> oooO0o = this.f19386OooO0o;
            int i = TreeMultiset.f19372OooOO0O;
            int i2 = (oooO0o == null ? 0 : oooO0o.f19384OooO0OO) + 1;
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            this.f19384OooO0OO = (oooO0o2 != null ? oooO0o2.f19384OooO0OO : 0) + i2;
            this.f19385OooO0Oo = (oooO0o2 != null ? oooO0o2.f19385OooO0Oo : 0L) + (oooO0o == null ? 0L : oooO0o.f19385OooO0Oo) + ((long) this.f19383OooO0O0);
            OooOO0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final OooO0o<E> OooO00o(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.f19382OooO00o);
            if (iCompare < 0) {
                OooO0o<E> oooO0o = this.f19386OooO0o;
                if (oooO0o == null) {
                    iArr[0] = 0;
                    OooO0O0(i, e);
                    return this;
                }
                int i2 = oooO0o.f19387OooO0o0;
                OooO0o<E> oooO0oOooO00o = oooO0o.OooO00o(comparator, e, i, iArr);
                this.f19386OooO0o = oooO0oOooO00o;
                if (iArr[0] == 0) {
                    this.f19384OooO0OO++;
                }
                this.f19385OooO0Oo += (long) i;
                return oooO0oOooO00o.f19387OooO0o0 == i2 ? this : OooO0oo();
            }
            if (iCompare <= 0) {
                int i3 = this.f19383OooO0O0;
                iArr[0] = i3;
                long j = i;
                com.google.common.base.o000oOoO.OooO0Oo(((long) i3) + j <= 2147483647L);
                this.f19383OooO0O0 += i;
                this.f19385OooO0Oo += j;
                return this;
            }
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                iArr[0] = 0;
                OooO0OO(i, e);
                return this;
            }
            int i4 = oooO0o2.f19387OooO0o0;
            OooO0o<E> oooO0oOooO00o2 = oooO0o2.OooO00o(comparator, e, i, iArr);
            this.f19388OooO0oO = oooO0oOooO00o2;
            if (iArr[0] == 0) {
                this.f19384OooO0OO++;
            }
            this.f19385OooO0Oo += (long) i;
            return oooO0oOooO00o2.f19387OooO0o0 == i4 ? this : OooO0oo();
        }

        public final void OooO0O0(int i, @ParametricNullness Object obj) {
            this.f19386OooO0o = new OooO0o<>(obj, i);
            OooO0o<E> oooO0o = this.f19389OooO0oo;
            Objects.requireNonNull(oooO0o);
            OooO0o<E> oooO0o2 = this.f19386OooO0o;
            int i2 = TreeMultiset.f19372OooOO0O;
            oooO0o.f19381OooO = oooO0o2;
            oooO0o2.f19389OooO0oo = oooO0o;
            oooO0o2.f19381OooO = this;
            this.f19389OooO0oo = oooO0o2;
            this.f19387OooO0o0 = Math.max(2, this.f19387OooO0o0);
            this.f19384OooO0OO++;
            this.f19385OooO0Oo += (long) i;
        }

        public final void OooO0OO(int i, @ParametricNullness Object obj) {
            OooO0o<E> oooO0o = new OooO0o<>(obj, i);
            this.f19388OooO0oO = oooO0o;
            OooO0o<E> oooO0o2 = this.f19381OooO;
            Objects.requireNonNull(oooO0o2);
            int i2 = TreeMultiset.f19372OooOO0O;
            this.f19381OooO = oooO0o;
            oooO0o.f19389OooO0oo = this;
            oooO0o.f19381OooO = oooO0o2;
            oooO0o2.f19389OooO0oo = oooO0o;
            this.f19387OooO0o0 = Math.max(2, this.f19387OooO0o0);
            this.f19384OooO0OO++;
            this.f19385OooO0Oo += (long) i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final OooO0o<E> OooO0Oo(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, this.f19382OooO00o);
            if (iCompare < 0) {
                OooO0o<E> oooO0o = this.f19386OooO0o;
                return oooO0o == null ? this : (OooO0o) com.google.common.base.OooOo.OooO00o(oooO0o.OooO0Oo(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                return null;
            }
            return oooO0o2.OooO0Oo(comparator, e);
        }

        @CheckForNull
        public final OooO0o<E> OooO0o() {
            int i = this.f19383OooO0O0;
            this.f19383OooO0O0 = 0;
            OooO0o<E> oooO0o = this.f19389OooO0oo;
            Objects.requireNonNull(oooO0o);
            OooO0o<E> oooO0o2 = this.f19381OooO;
            Objects.requireNonNull(oooO0o2);
            int i2 = TreeMultiset.f19372OooOO0O;
            oooO0o.f19381OooO = oooO0o2;
            oooO0o2.f19389OooO0oo = oooO0o;
            OooO0o<E> oooO0o3 = this.f19386OooO0o;
            if (oooO0o3 == null) {
                return this.f19388OooO0oO;
            }
            OooO0o<E> oooO0o4 = this.f19388OooO0oO;
            if (oooO0o4 == null) {
                return oooO0o3;
            }
            if (oooO0o3.f19387OooO0o0 >= oooO0o4.f19387OooO0o0) {
                OooO0o<E> oooO0o5 = this.f19389OooO0oo;
                Objects.requireNonNull(oooO0o5);
                oooO0o5.f19386OooO0o = this.f19386OooO0o.OooOO0o(oooO0o5);
                oooO0o5.f19388OooO0oO = this.f19388OooO0oO;
                oooO0o5.f19384OooO0OO = this.f19384OooO0OO - 1;
                oooO0o5.f19385OooO0Oo = this.f19385OooO0Oo - ((long) i);
                return oooO0o5.OooO0oo();
            }
            OooO0o<E> oooO0o6 = this.f19381OooO;
            Objects.requireNonNull(oooO0o6);
            oooO0o6.f19388OooO0oO = this.f19388OooO0oO.OooOOO0(oooO0o6);
            oooO0o6.f19386OooO0o = this.f19386OooO0o;
            oooO0o6.f19384OooO0OO = this.f19384OooO0OO - 1;
            oooO0o6.f19385OooO0Oo = this.f19385OooO0Oo - ((long) i);
            return oooO0o6.OooO0oo();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int OooO0o0(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, this.f19382OooO00o);
            if (iCompare < 0) {
                OooO0o<E> oooO0o = this.f19386OooO0o;
                if (oooO0o == null) {
                    return 0;
                }
                return oooO0o.OooO0o0(comparator, e);
            }
            if (iCompare <= 0) {
                return this.f19383OooO0O0;
            }
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                return 0;
            }
            return oooO0o2.OooO0o0(comparator, e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final OooO0o<E> OooO0oO(Comparator<? super E> comparator, @ParametricNullness E e) {
            int iCompare = comparator.compare(e, this.f19382OooO00o);
            if (iCompare > 0) {
                OooO0o<E> oooO0o = this.f19388OooO0oO;
                return oooO0o == null ? this : (OooO0o) com.google.common.base.OooOo.OooO00o(oooO0o.OooO0oO(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            OooO0o<E> oooO0o2 = this.f19386OooO0o;
            if (oooO0o2 == null) {
                return null;
            }
            return oooO0o2.OooO0oO(comparator, e);
        }

        public final OooO0o<E> OooO0oo() {
            OooO0o<E> oooO0o = this.f19386OooO0o;
            int i = oooO0o == null ? 0 : oooO0o.f19387OooO0o0;
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            int i2 = i - (oooO0o2 == null ? 0 : oooO0o2.f19387OooO0o0);
            if (i2 == -2) {
                Objects.requireNonNull(oooO0o2);
                OooO0o<E> oooO0o3 = this.f19388OooO0oO;
                OooO0o<E> oooO0o4 = oooO0o3.f19386OooO0o;
                int i3 = oooO0o4 == null ? 0 : oooO0o4.f19387OooO0o0;
                OooO0o<E> oooO0o5 = oooO0o3.f19388OooO0oO;
                if (i3 - (oooO0o5 != null ? oooO0o5.f19387OooO0o0 : 0) > 0) {
                    this.f19388OooO0oO = oooO0o3.OooOOOO();
                }
                return OooOOO();
            }
            if (i2 != 2) {
                OooOO0();
                return this;
            }
            Objects.requireNonNull(oooO0o);
            OooO0o<E> oooO0o6 = this.f19386OooO0o;
            OooO0o<E> oooO0o7 = oooO0o6.f19386OooO0o;
            int i4 = oooO0o7 == null ? 0 : oooO0o7.f19387OooO0o0;
            OooO0o<E> oooO0o8 = oooO0o6.f19388OooO0oO;
            if (i4 - (oooO0o8 != null ? oooO0o8.f19387OooO0o0 : 0) < 0) {
                this.f19386OooO0o = oooO0o6.OooOOO();
            }
            return OooOOOO();
        }

        public final void OooOO0() {
            OooO0o<E> oooO0o = this.f19386OooO0o;
            int i = oooO0o == null ? 0 : oooO0o.f19387OooO0o0;
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            this.f19387OooO0o0 = Math.max(i, oooO0o2 != null ? oooO0o2.f19387OooO0o0 : 0) + 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public final OooO0o<E> OooOO0O(Comparator<? super E> comparator, @ParametricNullness E e, int i, int[] iArr) {
            int iCompare = comparator.compare(e, this.f19382OooO00o);
            if (iCompare < 0) {
                OooO0o<E> oooO0o = this.f19386OooO0o;
                if (oooO0o == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f19386OooO0o = oooO0o.OooOO0O(comparator, e, i, iArr);
                int i2 = iArr[0];
                if (i2 > 0) {
                    if (i >= i2) {
                        this.f19384OooO0OO--;
                        this.f19385OooO0Oo -= (long) i2;
                    } else {
                        this.f19385OooO0Oo -= (long) i;
                    }
                }
                return i2 == 0 ? this : OooO0oo();
            }
            if (iCompare <= 0) {
                int i3 = this.f19383OooO0O0;
                iArr[0] = i3;
                if (i >= i3) {
                    return OooO0o();
                }
                this.f19383OooO0O0 = i3 - i;
                this.f19385OooO0Oo -= (long) i;
                return this;
            }
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f19388OooO0oO = oooO0o2.OooOO0O(comparator, e, i, iArr);
            int i4 = iArr[0];
            if (i4 > 0) {
                if (i >= i4) {
                    this.f19384OooO0OO--;
                    this.f19385OooO0Oo -= (long) i4;
                } else {
                    this.f19385OooO0Oo -= (long) i;
                }
            }
            return OooO0oo();
        }

        @CheckForNull
        public final OooO0o<E> OooOO0o(OooO0o<E> oooO0o) {
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                return this.f19386OooO0o;
            }
            this.f19388OooO0oO = oooO0o2.OooOO0o(oooO0o);
            this.f19384OooO0OO--;
            this.f19385OooO0Oo -= (long) oooO0o.f19383OooO0O0;
            return OooO0oo();
        }

        public final OooO0o<E> OooOOO() {
            com.google.common.base.o000oOoO.OooOOO0(this.f19388OooO0oO != null);
            OooO0o<E> oooO0o = this.f19388OooO0oO;
            this.f19388OooO0oO = oooO0o.f19386OooO0o;
            oooO0o.f19386OooO0o = this;
            oooO0o.f19385OooO0Oo = this.f19385OooO0Oo;
            oooO0o.f19384OooO0OO = this.f19384OooO0OO;
            OooO();
            oooO0o.OooOO0();
            return oooO0o;
        }

        @CheckForNull
        public final OooO0o<E> OooOOO0(OooO0o<E> oooO0o) {
            OooO0o<E> oooO0o2 = this.f19386OooO0o;
            if (oooO0o2 == null) {
                return this.f19388OooO0oO;
            }
            this.f19386OooO0o = oooO0o2.OooOOO0(oooO0o);
            this.f19384OooO0OO--;
            this.f19385OooO0Oo -= (long) oooO0o.f19383OooO0O0;
            return OooO0oo();
        }

        public final OooO0o<E> OooOOOO() {
            com.google.common.base.o000oOoO.OooOOO0(this.f19386OooO0o != null);
            OooO0o<E> oooO0o = this.f19386OooO0o;
            this.f19386OooO0o = oooO0o.f19388OooO0oO;
            oooO0o.f19388OooO0oO = this;
            oooO0o.f19385OooO0Oo = this.f19385OooO0Oo;
            oooO0o.f19384OooO0OO = this.f19384OooO0OO;
            OooO();
            oooO0o.OooOO0();
            return oooO0o;
        }

        @CheckForNull
        public final OooO0o OooOOOo(Comparator comparator, @ParametricNullness Object obj, int i, int[] iArr) {
            int iCompare = comparator.compare(obj, this.f19382OooO00o);
            if (iCompare < 0) {
                OooO0o<E> oooO0o = this.f19386OooO0o;
                if (oooO0o == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f19386OooO0o = oooO0o.OooOOOo(comparator, obj, i, iArr);
                int i2 = iArr[0];
                if (i2 == i) {
                    if (i2 != 0) {
                        this.f19384OooO0OO--;
                    }
                    this.f19385OooO0Oo += (long) (0 - i2);
                }
                return OooO0oo();
            }
            if (iCompare <= 0) {
                int i3 = this.f19383OooO0O0;
                iArr[0] = i3;
                return i == i3 ? OooO0o() : this;
            }
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f19388OooO0oO = oooO0o2.OooOOOo(comparator, obj, i, iArr);
            int i4 = iArr[0];
            if (i4 == i) {
                if (i4 != 0) {
                    this.f19384OooO0OO--;
                }
                this.f19385OooO0Oo += (long) (0 - i4);
            }
            return OooO0oo();
        }

        @CheckForNull
        public final OooO0o OooOOo0(Comparator comparator, @ParametricNullness Object obj, int[] iArr) {
            int iCompare = comparator.compare(obj, this.f19382OooO00o);
            if (iCompare < 0) {
                OooO0o<E> oooO0o = this.f19386OooO0o;
                if (oooO0o == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f19386OooO0o = oooO0o.OooOOo0(comparator, obj, iArr);
                int i = iArr[0];
                if (i != 0) {
                    this.f19384OooO0OO--;
                }
                this.f19385OooO0Oo += (long) (0 - i);
                return OooO0oo();
            }
            if (iCompare <= 0) {
                iArr[0] = this.f19383OooO0O0;
                return OooO0o();
            }
            OooO0o<E> oooO0o2 = this.f19388OooO0oO;
            if (oooO0o2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f19388OooO0oO = oooO0o2.OooOOo0(comparator, obj, iArr);
            int i2 = iArr[0];
            if (i2 != 0) {
                this.f19384OooO0OO--;
            }
            this.f19385OooO0Oo += (long) (0 - i2);
            return OooO0oo();
        }

        public final String toString() {
            return new oo00oO.OooO0o(this.f19382OooO00o, this.f19383OooO0O0).toString();
        }

        public OooO0o() {
            this.f19382OooO00o = null;
            this.f19383OooO0O0 = 1;
        }
    }
}
