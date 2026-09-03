package p041Ooooo00;

import java.util.Iterator;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000OO;
import p039OoooOoO.o0000O00;
import p039OoooOoO.o000O0O0;
import p042Ooooo0o.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo<E> extends AbstractSet<E> implements o00000OO<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f3764Oooo = new OooO00o();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f3765OoooO00;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final Object f3766Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final Object f3767Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o0000O00<E, o00Oo0> f3768Oooo0oo;

    public static final class OooO00o {
    }

    static {
        o000O0 o000o0 = o000O0.f3772OooO00o;
        o0000O00.OooO00o oooO00o = o0000O00.f3729Oooo0oo;
        f3765OoooO00 = new o00Ooo(o000o0, o000o0, o0000O00.f3728Oooo);
    }

    public o00Ooo(@Nullable Object obj, @Nullable Object obj2, @NotNull o0000O00<E, o00Oo0> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.f3766Oooo0o = obj;
        this.f3767Oooo0oO = obj2;
        this.f3768Oooo0oo = hashMap;
    }

    @Override // java.util.Collection, java.util.Set, p037OoooOOo.o00000OO
    @NotNull
    public final o00000OO<E> add(E e) {
        if (this.f3768Oooo0oo.containsKey(e)) {
            return this;
        }
        if (isEmpty()) {
            return new o00Ooo(e, e, this.f3768Oooo0oo.OooO00o(e, new o00Oo0()));
        }
        Object obj = this.f3767Oooo0oO;
        o00Oo0 o00oo1 = this.f3768Oooo0oo.get(obj);
        Intrinsics.checkNotNull(o00oo1);
        return new o00Ooo(this.f3766Oooo0o, e, this.f3768Oooo0oo.OooO00o((E) obj, new o00Oo0(o00oo1.f3762OooO00o, e)).OooO00o(e, new o00Oo0(obj, o000O0.f3772OooO00o)));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3768Oooo0oo.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f3768Oooo0oo.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return new oo000o(this.f3766Oooo0o, this.f3768Oooo0oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Collection, java.util.Set, p037OoooOOo.o00000OO
    @NotNull
    public final o00000OO<E> remove(E e) {
        o00Oo0 o00oo1 = this.f3768Oooo0oo.get(e);
        if (o00oo1 == null) {
            return this;
        }
        o0000O00 o0000o00OooO00o = this.f3768Oooo0oo;
        o000O0O0 o000o0o0OooOo = o0000o00OooO00o.f3730Oooo0o.OooOo(e != null ? e.hashCode() : 0, e, 0);
        if (o0000o00OooO00o.f3730Oooo0o != o000o0o0OooOo) {
            o0000o00OooO00o = o000o0o0OooOo == null ? o0000O00.f3728Oooo : new o0000O00(o000o0o0OooOo, o0000o00OooO00o.size() - 1);
        }
        Object obj = o00oo1.f3762OooO00o;
        o000O0 o000o0 = o000O0.f3772OooO00o;
        if (obj != o000o0) {
            V v = o0000o00OooO00o.get(obj);
            Intrinsics.checkNotNull(v);
            o0000o00OooO00o = o0000o00OooO00o.OooO00o(o00oo1.f3762OooO00o, new o00Oo0(((o00Oo0) v).f3762OooO00o, o00oo1.f3763OooO0O0));
        }
        Object obj2 = o00oo1.f3763OooO0O0;
        if (obj2 != o000o0) {
            V v2 = o0000o00OooO00o.get(obj2);
            Intrinsics.checkNotNull(v2);
            o0000o00OooO00o = o0000o00OooO00o.OooO00o(o00oo1.f3763OooO0O0, new o00Oo0(o00oo1.f3762OooO00o, ((o00Oo0) v2).f3763OooO0O0));
        }
        Object obj3 = o00oo1.f3762OooO00o;
        Object obj4 = !(obj3 != o000o0) ? o00oo1.f3763OooO0O0 : this.f3766Oooo0o;
        if (o00oo1.f3763OooO0O0 != o000o0) {
            obj3 = this.f3767Oooo0oO;
        }
        return new o00Ooo(obj4, obj3, o0000o00OooO00o);
    }
}
