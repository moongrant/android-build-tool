package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends o0O0ooO<E> implements o0oOO<E> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient ImmutableSet<o0oOO.OooO00o<E>> f18703OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient o0O00 f18704OooO0o0;

    public class OooO00o extends o0OO0<E> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f18705OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Iterator f18706OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public E f18707OooO0o0;

        public OooO00o(o0OO0 o0oo1) {
            this.f18706OooO0o = o0oo1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18705OooO0Oo > 0 || this.f18706OooO0o.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (this.f18705OooO0Oo <= 0) {
                o0oOO.OooO00o oooO00o = (o0oOO.OooO00o) this.f18706OooO0o.next();
                this.f18707OooO0o0 = (E) oooO00o.getElement();
                this.f18705OooO0Oo = oooO00o.getCount();
            }
            this.f18705OooO0Oo--;
            E e = this.f18707OooO0o0;
            Objects.requireNonNull(e);
            return e;
        }
    }

    public static class OooO0O0<E> extends ImmutableCollection.OooO0O0<E> {
    }

    public final class OooO0OO extends o00O00<o0oOO.OooO00o<E>> {
        public OooO0OO() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return ImmutableMultiset.this.OooO0o();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof o0oOO.OooO00o)) {
                return false;
            }
            o0oOO.OooO00o oooO00o = (o0oOO.OooO00o) obj;
            return oooO00o.getCount() > 0 && ImmutableMultiset.this.o000000O(oooO00o.getElement()) == oooO00o.getCount();
        }

        @Override // com.google.common.collect.o00O00
        public final Object get(int i) {
            return ImmutableMultiset.this.OooOO0O(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.OooO0oO().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        public Object writeReplace() {
            return new OooO0o(ImmutableMultiset.this);
        }
    }

    @GwtIncompatible
    public static class OooO0o<E> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ImmutableMultiset<E> f18709OooO0Oo;

        public OooO0o(ImmutableMultiset<E> immutableMultiset) {
            this.f18709OooO0Oo = immutableMultiset;
        }

        public Object readResolve() {
            return this.f18709OooO0Oo.entrySet();
        }
    }

    @Override // com.google.common.collect.o0oOO
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet<E> OooO0oO();

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> OooO00o() {
        o0O00 o0o01 = this.f18704OooO0o0;
        if (o0o01 != null) {
            return o0o01;
        }
        ImmutableList<E> immutableListOooO00o = super.OooO00o();
        this.f18704OooO0o0 = (o0O00) immutableListOooO00o;
        return immutableListOooO00o;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public final int OooO0O0(int i, Object[] objArr) {
        o0OO0<o0oOO.OooO00o<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            o0oOO.OooO00o<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.getElement());
            i += next.getCount();
        }
        return i;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<E> iterator() {
        return new OooO00o(entrySet().iterator());
    }

    @Override // com.google.common.collect.o0oOO
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<o0oOO.OooO00o<E>> entrySet() {
        ImmutableSet<o0oOO.OooO00o<E>> oooO0OO = this.f18703OooO0o;
        if (oooO0OO == null) {
            oooO0OO = isEmpty() ? o0O00O0o.f19090OooOOO0 : new OooO0OO();
            this.f18703OooO0o = oooO0OO;
        }
        return oooO0OO;
    }

    public abstract o0oOO.OooO00o<E> OooOO0O(int i);

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int Oooo00o(int i, @CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int Oooooo(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return o000000O(obj) > 0;
    }

    @Override // java.util.Collection, com.google.common.collect.o0oOO
    public final boolean equals(@CheckForNull Object obj) {
        return oo00oO.OooO00o(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o0oOO
    public final int hashCode() {
        return o0O0O0Oo.OooO0OO(entrySet());
    }

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int o0000OOo(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean o00o0O(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    abstract Object writeReplace();
}
