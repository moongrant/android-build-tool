package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class ArrayListMultimap<K, V> extends OooO<Object, Object> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @VisibleForTesting
    public transient int f18114OoooO0;

    private ArrayListMultimap() {
        super(new o0OO00O(12));
        oo000o.OooO0O0(3, "expectedValuesPerKey");
        this.f18114OoooO0 = 3;
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18114OoooO0 = 3;
        int i = objectInputStream.readInt();
        OooOOO0(new o0OO00O());
        o0O00.OooO0OO(this, objectInputStream, i);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00.OooO0o(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooO() {
        return new ArrayList(this.f18114OoooO0);
    }
}
