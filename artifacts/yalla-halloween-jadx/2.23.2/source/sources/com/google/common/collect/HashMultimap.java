package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class HashMultimap<K, V> extends OooOo<Object, Object> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public transient int f18674OooOO0;

    private HashMultimap() {
        super(new o0OO00O(12));
        this.f18674OooOO0 = 2;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18674OooOO0 = 2;
        int i = objectInputStream.readInt();
        OooOOo(new o0OO00O(12));
        o0O00oO0.OooO0OO(this, objectInputStream, i);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00oO0.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOO0O() {
        return new oo0o0Oo(this.f18674OooOO0);
    }
}
