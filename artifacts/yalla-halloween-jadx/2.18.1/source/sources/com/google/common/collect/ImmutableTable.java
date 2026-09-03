package com.google.common.collect;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class ImmutableTable<R, C, V> extends o0OoOo0<R, C, V> implements Serializable {

    public static final class OooO00o implements Serializable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int[] f18232Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Object[] f18233Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Object[] f18234Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Object[] f18235Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int[] f18236OoooO00;

        public OooO00o(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f18233Oooo0o = objArr;
            this.f18234Oooo0oO = objArr2;
            this.f18235Oooo0oo = objArr3;
            this.f18232Oooo = iArr;
            this.f18236OoooO00 = iArr2;
        }

        public static OooO00o OooO00o(ImmutableTable<?, ?, ?> immutableTable, int[] iArr, int[] iArr2) {
            Object[] array = immutableTable.OooO0O0().keySet().toArray();
            Object[] array2 = immutableTable.OooO0oo().toArray();
            Collection<V> collectionOooOOO0 = (Collection<V>) immutableTable.f18672Oooo0oO;
            if (collectionOooOOO0 == null) {
                collectionOooOOO0 = immutableTable.OooOOO0();
                immutableTable.f18672Oooo0oO = collectionOooOOO0;
            }
            return new OooO00o(array, array2, collectionOooOOO0.toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.f18235Oooo0oo;
            if (objArr.length == 0) {
                return o0O0O0O.f18616OoooO0O;
            }
            int i = 0;
            if (objArr.length == 1) {
                return new o0O00OO(this.f18233Oooo0o[0], this.f18234Oooo0oO[0], objArr[0]);
            }
            int length = objArr.length;
            oo000o.OooO0O0(length, "initialCapacity");
            Object[] objArrCopyOf = new Object[length];
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.f18235Oooo0oo;
                if (i >= objArr2.length) {
                    break;
                }
                o0O0O0o0.OooO00o oooO00oOooO0o = ImmutableTable.OooO0o(this.f18233Oooo0o[this.f18232Oooo[i]], this.f18234Oooo0oO[this.f18236OoooO00[i]], objArr2[i]);
                int i3 = i2 + 1;
                if (objArrCopyOf.length < i3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i3));
                }
                objArrCopyOf[i2] = oooO00oOooO0o;
                i++;
                i2 = i3;
            }
            ImmutableList immutableListOooOO0 = ImmutableList.OooOO0(objArrCopyOf, i2);
            ImmutableSet immutableSetOooOO0o = ImmutableSet.OooOO0o(this.f18233Oooo0o);
            ImmutableSet immutableSetOooOO0o2 = ImmutableSet.OooOO0o(this.f18234Oooo0oO);
            return ((long) ((o0) immutableListOooOO0).f18400Oooo) > (((long) immutableSetOooOO0o.size()) * ((long) immutableSetOooOO0o2.size())) / 2 ? new o00000O0(immutableListOooOO0, immutableSetOooOO0o, immutableSetOooOO0o2) : new o0O0O0O(immutableListOooOO0, immutableSetOooOO0o, immutableSetOooOO0o2);
        }
    }

    public static <R, C, V> o0O0O0o0.OooO00o<R, C, V> OooO0o(R r, C c, V v) {
        o0OOOO0o.OooOOOO.OooOO0(r, "rowKey");
        o0OOOO0o.OooOOOO.OooOO0(c, "columnKey");
        o0OOOO0o.OooOOOO.OooOO0(v, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new o0O0OOO0(r, c, v);
    }

    public abstract ImmutableMap<C, Map<R, V>> OooO();

    @Override // com.google.common.collect.o0OoOo0
    public final Iterator OooO0OO() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.o0OoOo0, com.google.common.collect.o0O0O0o0
    /* JADX INFO: renamed from: OooO0oO, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<o0O0O0o0.OooO00o<R, C, V>> OooO00o() {
        return (ImmutableSet) super.OooO00o();
    }

    public final ImmutableSet<C> OooO0oo() {
        return OooO().keySet();
    }

    @Override // com.google.common.collect.o0OoOo0
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet<o0O0O0o0.OooO00o<R, C, V>> OooO0Oo();

    public abstract OooO00o OooOO0O();

    @Override // 
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection<V> OooOOO0();

    @Override // com.google.common.collect.o0O0O0o0
    /* JADX INFO: renamed from: OooOOO */
    public abstract ImmutableMap<R, Map<C, V>> OooO0O0();

    @Override // com.google.common.collect.o0OoOo0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final Object writeReplace() {
        return OooOO0O();
    }
}
