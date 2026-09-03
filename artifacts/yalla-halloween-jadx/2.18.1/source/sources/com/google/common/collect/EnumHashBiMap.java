package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class EnumHashBiMap<K extends Enum<K>, V> extends OooO0O0<K, V> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient Class<K> f18124OoooO0;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f18124OoooO0 = (Class) objectInputStream.readObject();
        OooO0oo(new EnumMap(this.f18124OoooO0), new HashMap((this.f18124OoooO0.getEnumConstants().length * 3) / 2));
        o0O00.OooO0O0(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18124OoooO0);
        o0O00.OooO0o0(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooO0O0
    public final Object OooO0OO(Object obj) {
        Enum r1 = (Enum) obj;
        Objects.requireNonNull(r1);
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.OooO0O0, com.google.common.collect.o0000OO0, java.util.Map
    @CanIgnoreReturnValue
    public final Object put(Object obj, @NullableDecl Object obj2) {
        return super.put((Enum) obj, obj2);
    }
}
