package p039OoooOoO;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000<K, V> extends o0000Ooo<K, V> implements KMutableMap.Entry {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public V f3719Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o0000O<K, V> f3720Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(@NotNull o0000O<K, V> parentIterator, K k, V v) {
        super(k, v);
        Intrinsics.checkNotNullParameter(parentIterator, "parentIterator");
        this.f3720Oooo0oo = parentIterator;
        this.f3719Oooo = v;
    }

    @Override // p039OoooOoO.o0000Ooo, java.util.Map.Entry
    public final V getValue() {
        return this.f3719Oooo;
    }

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
    @Override // p039OoooOoO.o0000Ooo, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.f3719Oooo;
        this.f3719Oooo = v;
        o0000O<K, V> o0000o2 = this.f3720Oooo0oo;
        K k = this.f3737Oooo0o;
        o0000O0O<K, V, Map.Entry<K, V>> o0000o0o2 = o0000o2.f3721Oooo0o;
        if (o0000o0o2.f3732Oooo.containsKey(k)) {
            if (o0000o0o2.f3741Oooo0oo) {
                K kOooO00o = o0000o0o2.OooO00o();
                o0000o0o2.f3732Oooo.put(k, v);
                o0000o0o2.OooO0Oo(kOooO00o != null ? kOooO00o.hashCode() : 0, o0000o0o2.f3732Oooo.f3725Oooo0oo, kOooO00o, 0);
            } else {
                o0000o0o2.f3732Oooo.put(k, v);
            }
            o0000o0o2.f3735OoooO0O = o0000o0o2.f3732Oooo.f3727OoooO00;
        }
        return v2;
    }
}
