package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements o0O0O0O<K, V> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @LazyInit
    public transient OooO00o f19197OooO0oo;

    public static final class OooO00o<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Weak
        public final transient ImmutableSetMultimap<K, V> f19198OooO0oO;

        public OooO00o(ImmutableSetMultimap<K, V> immutableSetMultimap) {
            this.f19198OooO0oO = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: OooO0oo */
        public final o0OO0<Map.Entry<K, V>> iterator() {
            this.f19198OooO0oO.OooOO0o();
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f19198OooO0oO.OooO0OO(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            this.f19198OooO0oO.getClass();
            return 0;
        }
    }

    @GwtIncompatible
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0O00oO0.OooO00o<ImmutableSetMultimap> f19199OooO00o = o0O00oO0.OooO00o(ImmutableSetMultimap.class, "emptySet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object objOooOo00;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(p166o00Ooo00.o0OOO0o.OooO00o(29, "Invalid key count ", i));
        }
        ImmutableMap.OooO00o OooO00o2 = ImmutableMap.OooO00o();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(p166o00Ooo00.o0OOO0o.OooO00o(31, "Invalid value count ", i4));
            }
            ImmutableSet.OooO00o oooO00o = comparator == null ? new ImmutableSet.OooO00o() : new ImmutableSortedSet.OooO00o(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                oooO00o.OooO00o(objectInputStream.readObject());
            }
            ImmutableSet immutableSetOooO = oooO00o.OooO();
            if (immutableSetOooO.size() != i4) {
                String strValueOf = String.valueOf(object);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
                sb.append("Duplicate key-value pairs exist for key ");
                sb.append(strValueOf);
                throw new InvalidObjectException(sb.toString());
            }
            OooO00o2.OooO0OO(object, immutableSetOooO);
            i2 += i4;
        }
        try {
            ImmutableMultimap.OooO0OO.f19177OooO00o.OooO00o(this, OooO00o2.OooO00o(true));
            o0O00oO0.OooO00o<ImmutableMultimap> oooO00o2 = ImmutableMultimap.OooO0OO.f19178OooO0O0;
            oooO00o2.getClass();
            try {
                oooO00o2.f19577OooO00o.set(this, Integer.valueOf(i2));
                o0O00oO0.OooO00o<ImmutableSetMultimap> oooO00o3 = OooO0O0.f19199OooO00o;
                if (comparator == null) {
                    int i6 = ImmutableSet.f19194OooO0o;
                    objOooOo00 = o0O00O0o.f19566OooOOO0;
                } else {
                    objOooOo00 = ImmutableSortedSet.OooOo00(comparator);
                }
                oooO00o3.OooO00o(this, objOooOo00);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
        o0O00oO0.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Collection OooO00o(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.OooOOO
    public final Collection OooO0oo() {
        OooO00o oooO00o = this.f19197OooO0oo;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO00o oooO00o2 = new OooO00o(this);
        this.f19197OooO0oo = oooO00o2;
        return oooO00o2;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: OooOO0O */
    public final ImmutableCollection OooO0oo() {
        OooO00o oooO00o = this.f19197OooO0oo;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO00o oooO00o2 = new OooO00o(this);
        this.f19197OooO0oo = oooO00o2;
        return oooO00o2;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableCollection OooOOO() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection OooOOO0() {
        throw null;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO
    public final Collection get(Object obj) {
        throw null;
    }
}
