package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
            ImmutableList.OooO00o oooO00o = new ImmutableList.OooO00o();
            for (int i5 = 0; i5 < i4; i5++) {
                oooO00o.OooO0OO(objectInputStream.readObject());
            }
            OooO00o2.OooO0OO(object, oooO00o.OooO0oo());
            i2 += i4;
        }
        try {
            ImmutableMultimap.OooO0OO.f19177OooO00o.OooO00o(this, OooO00o2.OooO00o(true));
            o0O00oO0.OooO00o<ImmutableMultimap> oooO00o2 = ImmutableMultimap.OooO0OO.f19178OooO0O0;
            oooO00o2.getClass();
            try {
                oooO00o2.f19577OooO00o.set(this, Integer.valueOf(i2));
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
        o0O00oO0.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Collection OooO00o(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
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
