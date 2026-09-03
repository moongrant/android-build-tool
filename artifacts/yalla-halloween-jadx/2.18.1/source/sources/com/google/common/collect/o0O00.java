package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o0O00 {

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Field f18572OooO00o;

        public OooO00o(Field field) {
            this.f18572OooO00o = field;
            field.setAccessible(true);
        }

        public final void OooO00o(T t, Object obj) {
            try {
                this.f18572OooO00o.set(t, obj);
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
    public static <K, V> void OooO0O0(Map<K, V> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void OooO0OO(o00OO0O0<K, V> o00oo0o1, ObjectInputStream objectInputStream, int i) throws IOException, ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = o00oo0o1.get(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void OooO0Oo(o00OO<E> o00oo2, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            o00oo2.OooOOo(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    public static <K, V> void OooO0o(o00OO0O0<K, V> o00oo0o1, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o00oo0o1.OooO0O0().size());
        for (Map.Entry<K, Collection<V>> entry : o00oo0o1.OooO0O0().entrySet()) {
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

    public static <E> void OooO0oO(o00OO<E> o00oo2, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(o00oo2.entrySet().size());
        for (o00OO.OooO00o<E> oooO00o : o00oo2.entrySet()) {
            objectOutputStream.writeObject(oooO00o.getElement());
            objectOutputStream.writeInt(oooO00o.getCount());
        }
    }
}
