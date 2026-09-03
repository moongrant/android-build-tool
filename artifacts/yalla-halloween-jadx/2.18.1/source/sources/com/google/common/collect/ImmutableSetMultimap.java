package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements o0OoO00O<K, V> {

    @GwtIncompatible
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0O00.OooO00o<ImmutableSetMultimap> f18207OooO00o = o0O00.OooO00o(ImmutableSetMultimap.class, "emptySet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object objOooOo0;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            ImmutableSet.OooO00o oooO00o = comparator == null ? new ImmutableSet.OooO00o() : new ImmutableSortedSet.OooO00o(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                oooO00o.OooO0Oo(objectInputStream.readObject());
            }
            ImmutableSet immutableSetOooO0o = oooO00o.OooO0o();
            if (immutableSetOooO0o.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            OooO00o2.OooO0OO(object, immutableSetOooO0o);
            i2 += i4;
        }
        try {
            ImmutableMultimap.OooO0O0.f18187OooO00o.OooO00o(this, OooO00o2.OooO00o());
            o0O00.OooO00o<ImmutableMultimap> oooO00o2 = ImmutableMultimap.OooO0O0.f18188OooO0O0;
            Objects.requireNonNull(oooO00o2);
            try {
                oooO00o2.f18572OooO00o.set(this, Integer.valueOf(i2));
                o0O00.OooO00o<ImmutableSetMultimap> oooO00o3 = OooO00o.f18207OooO00o;
                if (comparator == null) {
                    int i6 = ImmutableSet.f18204Oooo0oo;
                    objOooOo0 = o0O0000O.f18593OoooOO0;
                } else {
                    objOooOo0 = ImmutableSortedSet.OooOo0(comparator);
                }
                oooO00o3.OooO00o(this, objOooOo0);
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
        o0O00.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    @Deprecated
    public final Collection OooO00o(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: OooO0oO */
    public final ImmutableCollection get(@NullableDecl Object obj) {
        return (ImmutableSet) o0OOOO0o.OooOOO0.OooO00o((ImmutableSet) this.f18184Oooo.get(obj), null);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    @CanIgnoreReturnValue
    @Deprecated
    public final ImmutableCollection OooO0oo() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO0O0
    public final Collection get(@NullableDecl Object obj) {
        return (ImmutableSet) o0OOOO0o.OooOOO0.OooO00o((ImmutableSet) this.f18184Oooo.get(obj), null);
    }
}
