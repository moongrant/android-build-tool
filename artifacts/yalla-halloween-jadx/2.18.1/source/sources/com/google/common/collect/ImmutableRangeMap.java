package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtIncompatible
public class ImmutableRangeMap<K extends Comparable<?>, V> implements oo00oO<K, V>, Serializable {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final ImmutableRangeMap<Comparable<?>, Object> f18196Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final transient ImmutableList<Range<K>> f18197Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final transient ImmutableList<V> f18198Oooo0oO;

    public static class OooO00o<K extends Comparable<?>, V> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableMap<Range<K>, V> f18199Oooo0o;

        public OooO00o(ImmutableMap<Range<K>, V> immutableMap) {
            this.f18199Oooo0o = immutableMap;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public Object readResolve() {
            Range range;
            if (this.f18199Oooo0o.isEmpty()) {
                return ImmutableRangeMap.f18196Oooo0oo;
            }
            ArrayList arrayList = new ArrayList();
            o0O0o000<Map.Entry<Range<K>, V>> it = this.f18199Oooo0o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                Range<K> key = next.getKey();
                V value = next.getValue();
                Objects.requireNonNull(key);
                Objects.requireNonNull(value);
                o0OOOO0o.OooOOOO.OooO0oO(true ^ key.f18369Oooo0o.equals(key.f18370Oooo0oO), "Range must not be empty, but was %s", key);
                arrayList.add(new o000OO0O(key, value));
            }
            Range<Comparable> range2 = Range.f18368Oooo0oo;
            Collections.sort(arrayList, new o00Ooo(o00OO00O.OooO00o.KEY));
            int size = arrayList.size();
            oo000o.OooO0O0(size, "initialCapacity");
            Object[] objArrCopyOf = new Object[size];
            int size2 = arrayList.size();
            oo000o.OooO0O0(size2, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[size2];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < arrayList.size()) {
                Range range3 = (Range) ((Map.Entry) arrayList.get(i)).getKey();
                if (i > 0) {
                    Range range4 = (Range) ((Map.Entry) arrayList.get(i - 1)).getKey();
                    if (range3.f18369Oooo0o.compareTo(range4.f18370Oooo0oO) <= 0 && range4.f18369Oooo0o.compareTo(range3.f18370Oooo0oO) <= 0) {
                        int iCompareTo = range3.f18369Oooo0o.compareTo(range4.f18369Oooo0o);
                        int iCompareTo2 = range3.f18370Oooo0oO.compareTo(range4.f18370Oooo0oO);
                        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
                            range = range3;
                        } else if (iCompareTo > 0 || iCompareTo2 < 0) {
                            range = new Range(iCompareTo >= 0 ? range3.f18369Oooo0o : range4.f18369Oooo0o, iCompareTo2 <= 0 ? range3.f18370Oooo0oO : range4.f18370Oooo0oO);
                        } else {
                            range = range4;
                        }
                        if (!range.f18369Oooo0o.equals(range.f18370Oooo0oO)) {
                            throw new IllegalArgumentException("Overlapping ranges: range " + range4 + " overlaps with entry " + range3);
                        }
                    }
                }
                Objects.requireNonNull(range3);
                int i4 = i2 + 1;
                if (objArrCopyOf.length < i4) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i4));
                }
                objArrCopyOf[i2] = range3;
                Object value2 = ((Map.Entry) arrayList.get(i)).getValue();
                Objects.requireNonNull(value2);
                int i5 = i3 + 1;
                if (objArrCopyOf2.length < i5) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf2.length, i5));
                }
                objArrCopyOf2[i3] = value2;
                i++;
                i3 = i5;
                i2 = i4;
            }
            return new ImmutableRangeMap(ImmutableList.OooOO0(objArrCopyOf, i2), ImmutableList.OooOO0(objArrCopyOf2, i3));
        }
    }

    static {
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        ImmutableList<Object> immutableList = o0.f18399OoooO00;
        f18196Oooo0oo = new ImmutableRangeMap<>(immutableList, immutableList);
    }

    public ImmutableRangeMap(ImmutableList<Range<K>> immutableList, ImmutableList<V> immutableList2) {
        this.f18197Oooo0o = immutableList;
        this.f18198Oooo0oO = immutableList2;
    }

    @Override // com.google.common.collect.oo00oO
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap<Range<K>, V> OooO00o() {
        if (this.f18197Oooo0o.isEmpty()) {
            return (ImmutableMap<Range<K>, V>) o0O00000.f18579OoooO0O;
        }
        ImmutableList<Range<K>> immutableList = this.f18197Oooo0o;
        Range<Comparable> range = Range.f18368Oooo0oo;
        return new ImmutableSortedMap(new o0O000O(immutableList, Range.OooO00o.f18371Oooo0o), this.f18198Oooo0oO);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof oo00oO) {
            return OooO00o().equals(((oo00oO) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public final String toString() {
        return OooO00o().toString();
    }

    public Object writeReplace() {
        return new OooO00o(OooO00o());
    }
}
