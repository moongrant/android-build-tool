package p047Oooooo0;

import androidx.compose.runtime.Stable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000O0;
import p038OoooOo0.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00OO0OO<T> implements List<T>, o0oOOo, KMutableList {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public OooO00o f4106Oooo0o;

    public static final class OooO00o<T> extends o0O0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public o00000O0<? extends T> f4107OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f4108OooO0Oo;

        public OooO00o(@NotNull o00000O0<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f4107OooO0OO = list;
        }

        @Override // p047Oooooo0.o0O0o
        public final void OooO00o(@NotNull o0O0o value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Object obj = oo0O.f4154OooO00o;
            synchronized (oo0O.f4154OooO00o) {
                this.f4107OooO0OO = ((OooO00o) value).f4107OooO0OO;
                this.f4108OooO0Oo = ((OooO00o) value).f4108OooO0Oo;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // p047Oooooo0.o0O0o
        @NotNull
        public final o0O0o OooO0O0() {
            return new OooO00o(this.f4107OooO0OO);
        }

        public final void OooO0OO(@NotNull o00000O0<? extends T> o00000o1) {
            Intrinsics.checkNotNullParameter(o00000o1, "<set-?>");
            this.f4107OooO0OO = o00000o1;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<T>, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f4109Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f4110Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(int i, Collection<? extends T> collection) {
            super(1);
            this.f4109Oooo0o = i;
            this.f4110Oooo0oO = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            List it = (List) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.addAll(this.f4109Oooo0o, this.f4110Oooo0oO));
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<T>, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f4111Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Collection<? extends T> collection) {
            super(1);
            this.f4111Oooo0o = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            List it = (List) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.retainAll(this.f4111Oooo0o));
        }
    }

    public o00OO0OO() {
        o000O0O0.OooO00o oooO00o = o000O0O0.f3709Oooo0oO;
        this.f4106Oooo0o = new OooO00o(o000O0O0.f3710Oooo0oo);
    }

    @Override // p047Oooooo0.o0oOOo
    @NotNull
    public final o0O0o OooO00o() {
        return this.f4106Oooo0o;
    }

    public final int OooO0O0() {
        return ((OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO())).f4108OooO0Oo;
    }

    @NotNull
    public final OooO00o<T> OooO0OO() {
        return (OooO00o) oo0o0O0.OooOOo0(this.f4106Oooo0o, this);
    }

    public final boolean OooO0o0(Function1<? super List<T>, Boolean> function1) {
        int i;
        o00000O0<? extends T> o00000o1;
        Boolean boolInvoke;
        oo00o oo00oVarOooO;
        boolean z;
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0.OooO00o<? extends T> oooO00oOooO0o = o00000o1.OooO0o();
            boolInvoke = function1.invoke(oooO00oOooO0o);
            o00000O0<? extends T> o00000o0Build = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000o0Build, o00000o1)) {
                break;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function2 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                    z = true;
                    if (oooO00o3.f4108OooO0Oo == i) {
                        oooO00o3.OooO0OO(o00000o0Build);
                        oooO00o3.f4108OooO0Oo++;
                    } else {
                        z = false;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return boolInvoke.booleanValue();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oO(int i, int i2) {
        int i3;
        o00000O0<? extends T> o00000o1;
        oo00o oo00oVarOooO;
        boolean z;
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i3 = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0.OooO00o<? extends T> oooO00oOooO0o = o00000o1.OooO0o();
            oooO00oOooO0o.subList(i, i2).clear();
            o00000O0<? extends T> o00000o0Build = oooO00oOooO0o.build();
            if (Intrinsics.areEqual(o00000o0Build, o00000o1)) {
                return;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        z = true;
                        if (oooO00o3.f4108OooO0Oo == i3) {
                            oooO00o3.OooO0OO(o00000o0Build);
                            oooO00o3.f4108OooO0Oo++;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
    }

    @Override // p047Oooooo0.o0oOOo
    public final void OooO0oo(@NotNull o0O0o value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.f4145OooO0O0 = this.f4106Oooo0o;
        this.f4106Oooo0o = (OooO00o) value;
    }

    @Override // p047Oooooo0.o0oOOo
    public final /* synthetic */ o0O0o OooOOOO(o0O0o o0o0o, o0O0o o0o0o2, o0O0o o0o0o3) {
        oo00oO.OooO00o(o0o0o, o0o0o2, o0o0o3);
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean add(T t) {
        int i;
        o00000O0<? extends T> o00000o1;
        boolean z;
        oo00o oo00oVarOooO;
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o0Add = o00000o1.add(t);
            z = false;
            if (Intrinsics.areEqual(o00000o0Add, o00000o1)) {
                return false;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        if (oooO00o3.f4108OooO0Oo == i) {
                            oooO00o3.OooO0OO(o00000o0Add);
                            oooO00o3.f4108OooO0Oo++;
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return OooO0o0(new OooO0O0(i, elements));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        oo00o oo00oVarOooO;
        Object obj = oo0O.f4154OooO00o;
        synchronized (oo0O.f4154OooO00o) {
            OooO00o oooO00o = this.f4106Oooo0o;
            Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
            synchronized (oo0o0O0.f4158OooO0OO) {
                oo00oVarOooO = oo0o0O0.OooO();
                OooO00o oooO00o2 = (OooO00o) oo0o0O0.OooOo0(oooO00o, this, oo00oVarOooO);
                o000O0O0.OooO00o oooO00o3 = o000O0O0.f3709Oooo0oO;
                oooO00o2.OooO0OO(o000O0O0.f3710Oooo0oo);
                oooO00o2.f4108OooO0Oo++;
            }
            oo0o0O0.OooOOO0(oo00oVarOooO, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return OooO0OO().f4107OooO0OO.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return OooO0OO().f4107OooO0OO.containsAll(elements);
    }

    @Override // java.util.List
    public final T get(int i) {
        return OooO0OO().f4107OooO0OO.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return OooO0OO().f4107OooO0OO.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return OooO0OO().f4107OooO0OO.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return OooO0OO().f4107OooO0OO.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator() {
        return new o0o0Oo(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        o00000O0<? extends T> o00000o1;
        oo00o oo00oVarOooO;
        boolean z;
        T t = get(i);
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i2 = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o0OoooO0 = o00000o1.OoooO0(i);
            if (Intrinsics.areEqual(o00000o0OoooO0, o00000o1)) {
                break;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                    z = true;
                    if (oooO00o3.f4108OooO0Oo == i2) {
                        oooO00o3.OooO0OO(o00000o0OoooO0);
                        oooO00o3.f4108OooO0Oo++;
                    } else {
                        z = false;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return t;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0058 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int i;
        o00000O0<? extends T> o00000o1;
        boolean z;
        oo00o oo00oVarOooO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o0RemoveAll = o00000o1.removeAll((Collection<? extends Object>) elements);
            z = false;
            if (Intrinsics.areEqual(o00000o0RemoveAll, o00000o1)) {
                return false;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        if (oooO00o3.f4108OooO0Oo == i) {
                            oooO00o3.OooO0OO(o00000o0RemoveAll);
                            oooO00o3.f4108OooO0Oo++;
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return OooO0o0(new OooO0OO(elements));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        o00000O0<? extends T> o00000o1;
        oo00o oo00oVarOooO;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i2 = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o2 = o00000o1.set(i, t);
            if (Intrinsics.areEqual(o00000o2, o00000o1)) {
                break;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    oo00oVarOooO = oo0o0O0.OooO();
                    OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                    z = true;
                    if (oooO00o3.f4108OooO0Oo == i2) {
                        oooO00o3.OooO0OO(o00000o2);
                        oooO00o3.f4108OooO0Oo++;
                    } else {
                        z = false;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return OooO0OO().f4107OooO0OO.size();
    }

    @Override // java.util.List
    @NotNull
    public final List<T> subList(int i, int i2) {
        if ((i >= 0 && i <= i2) && i2 <= size()) {
            return new o0(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0058 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        int i;
        o00000O0<? extends T> o00000o1;
        boolean z;
        oo00o oo00oVarOooO;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o0AddAll = o00000o1.addAll((Collection<? extends Object>) elements);
            z = false;
            if (Intrinsics.areEqual(o00000o0AddAll, o00000o1)) {
                return false;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        if (oooO00o3.f4108OooO0Oo == i) {
                            oooO00o3.OooO0OO(o00000o0AddAll);
                            oooO00o3.f4108OooO0Oo++;
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<T> listIterator(int i) {
        return new o0o0Oo(this, i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0052 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void add(int i, T t) {
        int i2;
        o00000O0<? extends T> o00000o1;
        oo00o oo00oVarOooO;
        boolean z;
        do {
            Object obj = oo0O.f4154OooO00o;
            Object obj2 = oo0O.f4154OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i2 = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o0Add = o00000o1.add(i, t);
            if (Intrinsics.areEqual(o00000o0Add, o00000o1)) {
                return;
            }
            synchronized (obj2) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        z = true;
                        if (oooO00o3.f4108OooO0Oo == i2) {
                            oooO00o3.OooO0OO(o00000o0Add);
                            oooO00o3.f4108OooO0Oo++;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0053 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        int i;
        o00000O0<? extends T> o00000o1;
        boolean z;
        oo00o oo00oVarOooO;
        do {
            Object obj2 = oo0O.f4154OooO00o;
            Object obj3 = oo0O.f4154OooO00o;
            synchronized (obj3) {
                OooO00o oooO00o = (OooO00o) oo0o0O0.OooO0oo(this.f4106Oooo0o, oo0o0O0.OooO());
                i = oooO00o.f4108OooO0Oo;
                o00000o1 = oooO00o.f4107OooO0OO;
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(o00000o1);
            o00000O0<? extends T> o00000o0Remove = o00000o1.remove(obj);
            z = false;
            if (Intrinsics.areEqual(o00000o0Remove, o00000o1)) {
                return false;
            }
            synchronized (obj3) {
                OooO00o oooO00o2 = this.f4106Oooo0o;
                Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
                synchronized (oo0o0O0.f4158OooO0OO) {
                    try {
                        oo00oVarOooO = oo0o0O0.OooO();
                        OooO00o oooO00o3 = (OooO00o) oo0o0O0.OooOo0(oooO00o2, this, oo00oVarOooO);
                        if (oooO00o3.f4108OooO0Oo == i) {
                            oooO00o3.OooO0OO(o00000o0Remove);
                            oooO00o3.f4108OooO0Oo++;
                            z = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                oo0o0O0.OooOOO0(oo00oVarOooO, this);
            }
        } while (!z);
        return true;
    }
}
