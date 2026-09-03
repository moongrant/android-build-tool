package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class ArrayListMultimap<K, V> extends OooO<Object, Object> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public transient int f18625OooOO0;

    private ArrayListMultimap() {
        super(new o0OO00O(12));
        oo000o.OooO0O0(3, "expectedValuesPerKey");
        this.f18625OooOO0 = 3;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18625OooOO0 = 3;
        int i = objectInputStream.readInt();
        OooOOo(new o0OO00O());
        o0O00oO0.OooO0OO(this, objectInputStream, i);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00oO0.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOO0O() {
        return new ArrayList(this.f18625OooOO0);
    }
}
