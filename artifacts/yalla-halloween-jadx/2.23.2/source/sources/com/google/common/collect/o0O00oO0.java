package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o0O00oO0 {

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Field f19101OooO00o;

        public OooO00o(Field field) {
            this.f19101OooO00o = field;
            field.setAccessible(true);
        }

        public final void OooO00o(T t, Object obj) {
            try {
                this.f19101OooO00o.set(t, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static <T> OooO00o<T> OooO00o(Class<T> cls, String str) {
        try {
            return new OooO00o<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void OooO0O0(Map<K, V> map, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void OooO0OO(o00OO<K, V> o00oo2, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = o00oo2.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void OooO0Oo(o0oOO<E> o0ooo2, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            o0ooo2.Oooooo(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void OooO0o(o00OO<K, V> o00oo2, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o00oo2.OooO0Oo().size());
        for (Map.Entry<K, Collection<V>> entry : o00oo2.OooO0Oo().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static <K, V> void OooO0o0(Map<K, V> map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public static <E> void OooO0oO(o0oOO<E> o0ooo2, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o0ooo2.entrySet().size());
        for (o0oOO.OooO00o<E> oooO00o : o0ooo2.entrySet()) {
            objectOutputStream.writeObject(oooO00o.getElement());
            objectOutputStream.writeInt(oooO00o.getCount());
        }
    }
}
