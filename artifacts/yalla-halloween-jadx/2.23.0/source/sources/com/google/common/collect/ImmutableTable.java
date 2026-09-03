package com.google.common.collect;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends o0OoOo0<R, C, V> implements Serializable {

    public static final class OooO00o implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Object[] f19224OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Object[] f19225OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Object[] f19226OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int[] f19227OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int[] f19228OooO0oo;

        public OooO00o(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f19224OooO0Oo = objArr;
            this.f19226OooO0o0 = objArr2;
            this.f19225OooO0o = objArr3;
            this.f19227OooO0oO = iArr;
            this.f19228OooO0oo = iArr2;
        }

        public static OooO00o OooO00o(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            Object[] array = immutableTable.OooOOOO().toArray();
            Object[] array2 = immutableTable.OooO().toArray();
            Collection<V> collectionOooOOO = (Collection<V>) immutableTable.f19641OooO0o0;
            if (collectionOooOOO == null) {
                collectionOooOOO = immutableTable.OooOOO();
                immutableTable.f19641OooO0o0 = collectionOooOOO;
            }
            return new OooO00o(array, array2, collectionOooOOO.toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.f19225OooO0o;
            if (objArr.length == 0) {
                return o0O0o00O.f19588OooOO0;
            }
            int length = objArr.length;
            Object[] objArr2 = this.f19226OooO0o0;
            Object[] objArr3 = this.f19224OooO0Oo;
            int i = 0;
            if (length == 1) {
                return new o0O0OO0(objArr3[0], objArr2[0], objArr[0]);
            }
            int length2 = objArr.length;
            oo000o.OooO0O0(length2, "initialCapacity");
            Object[] objArrCopyOf = new Object[length2];
            int i2 = 0;
            while (i < objArr.length) {
                o0OO000o o0oo000oOooO0oO = ImmutableTable.OooO0oO(objArr3[this.f19227OooO0oO[i]], objArr2[this.f19228OooO0oo[i]], objArr[i]);
                int i3 = i2 + 1;
                if (objArrCopyOf.length < i3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO0O0(objArrCopyOf.length, i3));
                }
                objArrCopyOf[i2] = o0oo000oOooO0oO;
                i++;
                i2 = i3;
            }
            o0O00 o0o00OooO = ImmutableList.OooO(i2, objArrCopyOf);
            ImmutableSet immutableSetOooOO0o = ImmutableSet.OooOO0o(objArr3);
            ImmutableSet immutableSetOooOO0o2 = ImmutableSet.OooOO0o(objArr2);
            return ((long) o0o00OooO.f19538OooO0oO) > (((long) immutableSetOooOO0o.size()) * ((long) immutableSetOooOO0o2.size())) / 2 ? new o00000O(o0o00OooO, immutableSetOooOO0o, immutableSetOooOO0o2) : new o0O0o00O(o0o00OooO, immutableSetOooOO0o, immutableSetOooOO0o2);
        }
    }

    public static o0OO000o OooO0oO(Object obj, Object obj2, Object obj3) {
        if (obj == null) {
            throw new NullPointerException("rowKey");
        }
        if (obj2 == null) {
            throw new NullPointerException("columnKey");
        }
        if (obj3 != null) {
            return new o0OO000o(obj, obj2, obj3);
        }
        throw new NullPointerException(AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }

    public final ImmutableSet<C> OooO() {
        return OooOO0().keySet();
    }

    @Override // com.google.common.collect.o0OoOo0
    public final Iterator OooO0OO() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.o0OoOo0
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void OooO0Oo() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o0OoOo0, com.google.common.collect.o0O
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<o0O.OooO00o<R, C, V>> OooO00o() {
        return (ImmutableSet) super.OooO00o();
    }

    public abstract ImmutableMap<C, Map<R, V>> OooOO0();

    @Override // com.google.common.collect.o0OoOo0
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet<o0O.OooO00o<R, C, V>> OooO0o0();

    public abstract OooO00o OooOO0o();

    @Override // 
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection<V> OooOOO();

    public final ImmutableSet<R> OooOOOO() {
        return OooO0O0().keySet();
    }

    @Override // com.google.common.collect.o0O
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableMap<R, Map<C, V>> OooO0O0();

    public final Object writeReplace() {
        return OooOO0o();
    }
}
