package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class o00O0 {

    public static final class OooO00o<T> extends OooO0OO<T> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public static final OooO0OO f18465OoooO00 = new OooO00o(new Object[0]);

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int f18466Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final T[] f18467Oooo0oo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Object[] objArr) {
            super(0, 0);
            this.f18467Oooo0oo = objArr;
            this.f18466Oooo = 0;
        }

        @Override // com.google.common.collect.OooO0OO
        public final T OooO00o(int i) {
            return this.f18467Oooo0oo[this.f18466Oooo + i];
        }
    }

    public enum OooO0O0 implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(false);
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean OooO00o(Collection<T> collection, Iterator<? extends T> it) {
        Objects.requireNonNull(collection);
        Objects.requireNonNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void OooO0O0(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @NullableDecl
    public static Object OooO0OO(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @NullableDecl
    public static <T> T OooO0Oo(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }
}
