package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> {

    public static final class OooO00o<K, V> extends ImmutableMultimap.OooO00o<K, V> {
        public final ImmutableListMultimap<K, V> OooO00o() {
            Set<Map.Entry<K, Collection<V>>> setEntrySet = this.f18186OooO00o.entrySet();
            if (((AbstractCollection) setEntrySet).isEmpty()) {
                return o0000O00.f18438OoooO0;
            }
            o0OO00O.OooO00o oooO00o = (o0OO00O.OooO00o) setEntrySet;
            Object[] objArrCopyOf = new Object[o0OO00O.this.f18652OoooO * 2];
            int i = 0;
            int size = 0;
            for (Map.Entry<K, V> entry : oooO00o) {
                K key = entry.getKey();
                ImmutableList immutableListOooOO0o = ImmutableList.OooOO0o((Collection) entry.getValue());
                if (!immutableListOooOO0o.isEmpty()) {
                    int i2 = i + 1;
                    int i3 = i2 * 2;
                    if (i3 > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i3));
                    }
                    oo000o.OooO00o(key, immutableListOooOO0o);
                    int i4 = i * 2;
                    objArrCopyOf[i4] = key;
                    objArrCopyOf[i4 + 1] = immutableListOooOO0o;
                    size += immutableListOooOO0o.size();
                    i = i2;
                }
            }
            return new ImmutableListMultimap<>(o0O00000.OooOO0o(i, objArrCopyOf), size);
        }

        @CanIgnoreReturnValue
        public final OooO00o<K, V> OooO0O0(K k, V... vArr) {
            List listAsList = Arrays.asList(vArr);
            Collection collection = this.f18186OooO00o.get(k);
            if (collection != null) {
                for (Object obj : listAsList) {
                    oo000o.OooO00o(k, obj);
                    collection.add(obj);
                }
            } else {
                Iterator it = listAsList.iterator();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        Object next = it.next();
                        oo000o.OooO00o(k, next);
                        arrayList.add(next);
                    }
                    this.f18186OooO00o.put(k, arrayList);
                }
            }
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    public static <K, V> OooO00o<K, V> OooO() {
        return new OooO00o<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(android.support.v4.media.OooO00o.OooO00o("Invalid key count ", i));
        }
        ImmutableMap.OooO00o OooO00o2 = ImmutableMap.OooO00o();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(android.support.v4.media.OooO00o.OooO00o("Invalid value count ", i4));
            }
            OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
            oo000o.OooO0O0(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < i4) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                int i7 = i6 + 1;
                if (objArrCopyOf.length < i7) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableCollection.OooO0O0.OooO00o(objArrCopyOf.length, i7));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i6] = object2;
                    i5++;
                    i6++;
                }
                z = false;
                objArrCopyOf[i6] = object2;
                i5++;
                i6++;
            }
            OooO00o2.OooO0OO(object, ImmutableList.OooOO0(objArrCopyOf, i6));
            i2 += i4;
        }
        try {
            ImmutableMultimap.OooO0O0.f18187OooO00o.OooO00o(this, OooO00o2.OooO00o());
            o0O00.OooO00o<ImmutableMultimap> oooO00o = ImmutableMultimap.OooO0O0.f18188OooO0O0;
            Objects.requireNonNull(oooO00o);
            try {
                oooO00o.f18572OooO00o.set(this, Integer.valueOf(i2));
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
        o0O00.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    @Deprecated
    public final Collection OooO00o(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @CanIgnoreReturnValue
    @Deprecated
    public final ImmutableCollection OooO0oo() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO0O0
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public final ImmutableList<V> get(@NullableDecl K k) {
        ImmutableList<V> immutableList = (ImmutableList) this.f18184Oooo.get(k);
        if (immutableList != null) {
            return immutableList;
        }
        OooO0OO oooO0OO = ImmutableList.f18169Oooo0oO;
        return (ImmutableList<V>) o0.f18399OoooO00;
    }
}
