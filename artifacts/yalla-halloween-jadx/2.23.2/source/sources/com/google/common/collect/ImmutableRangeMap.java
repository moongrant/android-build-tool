package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class ImmutableRangeMap<K extends Comparable<?>, V> implements o0OoOoOo<K, V>, Serializable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ImmutableRangeMap<Comparable<?>, Object> f18710OooO0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final transient ImmutableList<Range<K>> f18711OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient ImmutableList<V> f18712OooO0o0;

    public static class OooO00o<K extends Comparable<?>, V> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableMap<Range<K>, V> f18713OooO0Oo;

        public OooO00o(ImmutableMap<Range<K>, V> immutableMap) {
            this.f18713OooO0Oo = immutableMap;
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
            ImmutableMap<Range<K>, V> immutableMap = this.f18713OooO0Oo;
            if (immutableMap.isEmpty()) {
                return ImmutableRangeMap.f18710OooO0o;
            }
            ArrayList arrayList = new ArrayList();
            o0OO0<Map.Entry<Range<K>, V>> it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Range<K>, V> next = it.next();
                Range<K> key = next.getKey();
                V value = next.getValue();
                key.getClass();
                value.getClass();
                com.google.common.base.o0OoOo0.OooO0o(true ^ key.f18887OooO0Oo.equals(key.f18888OooO0o0), "Range must not be empty, but was %s", key);
                arrayList.add(new o000O0O0(key, value));
            }
            Range<Comparable> range2 = Range.f18886OooO0o;
            Range.OooO00o oooO00o = Range.OooO00o.f18889OooO0Oo;
            oooO00o.getClass();
            Collections.sort(arrayList, new o00Ooo(oo0O.OooO00o.KEY, oooO00o));
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
                    range3.getClass();
                    Object obj = range4.f18888OooO0o0;
                    o00000O0 o00000o1 = range3.f18887OooO0Oo;
                    int iCompareTo = o00000o1.compareTo(obj);
                    o00000O0 o00000o2 = range3.f18888OooO0o0;
                    o00000O0 o00000o3 = range4.f18887OooO0Oo;
                    if (iCompareTo <= 0 && o00000o3.compareTo(o00000o2) <= 0) {
                        int iCompareTo2 = o00000o1.compareTo(o00000o3);
                        o00000O0 o00000o4 = range4.f18888OooO0o0;
                        int iCompareTo3 = o00000o2.compareTo(o00000o4);
                        if (iCompareTo2 >= 0 && iCompareTo3 <= 0) {
                            range = range3;
                        } else if (iCompareTo2 > 0 || iCompareTo3 < 0) {
                            if (iCompareTo2 < 0) {
                                o00000o1 = o00000o3;
                            }
                            if (iCompareTo3 > 0) {
                                o00000o2 = o00000o4;
                            }
                            com.google.common.base.o0OoOo0.OooO0oO(o00000o1.compareTo(o00000o2) <= 0, "intersection is undefined for disconnected ranges %s and %s", range3, range4);
                            range = new Range(o00000o1, o00000o2);
                        } else {
                            range = range4;
                        }
                        if (!range.f18887OooO0Oo.equals(range.f18888OooO0o0)) {
                            String strValueOf = String.valueOf(range4);
                            String strValueOf2 = String.valueOf(range3);
                            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 47);
                            sb.append("Overlapping ranges: range ");
                            sb.append(strValueOf);
                            sb.append(" overlaps with entry ");
                            sb.append(strValueOf2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                range3.getClass();
                int i4 = i2 + 1;
                if (objArrCopyOf.length < i4) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO0O0(objArrCopyOf.length, i4));
                }
                objArrCopyOf[i2] = range3;
                Object value2 = ((Map.Entry) arrayList.get(i)).getValue();
                value2.getClass();
                int i5 = i3 + 1;
                if (objArrCopyOf2.length < i5) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, ImmutableCollection.OooO0O0.OooO0O0(objArrCopyOf2.length, i5));
                }
                objArrCopyOf2[i3] = value2;
                i++;
                i3 = i5;
                i2 = i4;
            }
            return new ImmutableRangeMap(ImmutableList.OooO(i2, objArrCopyOf), ImmutableList.OooO(i3, objArrCopyOf2));
        }
    }

    static {
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        o0O00 o0o01 = o0O00.f19060OooO0oo;
        f18710OooO0o = new ImmutableRangeMap<>(o0o01, o0o01);
    }

    public ImmutableRangeMap(o0O00 o0o01, o0O00 o0o02) {
        this.f18711OooO0Oo = o0o01;
        this.f18712OooO0o0 = o0o02;
    }

    @Override // com.google.common.collect.o0OoOoOo
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap<Range<K>, V> OooO00o() {
        ImmutableList<Range<K>> immutableList = this.f18711OooO0Oo;
        if (immutableList.isEmpty()) {
            return o0OoO00O.f19150OooOO0;
        }
        Range<Comparable> range = Range.f18886OooO0o;
        return new ImmutableSortedMap(new o0O00OO(immutableList, Range.OooO00o.f18889OooO0Oo), this.f18712OooO0o0, null);
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof o0OoOoOo) {
            return OooO00o().equals(((o0OoOoOo) obj).OooO00o());
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
