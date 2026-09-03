package p387o0OOoo0o;

import androidx.compose.foundation.lazy.layout.OooO0OO;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import o0000OO.OooOOOO;
import o0000OO.o000000O;
import p386o0OOoo0O.o00O0000;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Type, o00O0000<?>> f38899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f38900OooO0O0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> implements o0o0Oo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00O0000 f38901OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Type f38902OooO0O0;

        public OooO00o(o00O0000 o00o0001, Type type) {
            this.f38901OooO00o = o00o0001;
            this.f38902OooO0O0 = type;
        }

        @Override // p387o0OOoo0o.o0o0Oo
        public final T OooO00o() {
            return (T) this.f38901OooO00o.OooO00o();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO0O0<T> implements o0o0Oo<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o00O0000 f38903OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ Type f38904OooO0O0;

        public OooO0O0(o00O0000 o00o0001, Type type) {
            this.f38903OooO00o = o00o0001;
            this.f38904OooO0O0 = type;
        }

        @Override // p387o0OOoo0o.o0o0Oo
        public final T OooO00o() {
            return (T) this.f38903OooO00o.OooO00o();
        }
    }

    public o00OO00O(Map<Type, o00O0000<?>> map, boolean z) {
        this.f38899OooO00o = map;
        this.f38900OooO0O0 = z;
    }

    public final <T> o0o0Oo<T> OooO00o(o00000O0<T> o00000o1) {
        String string;
        o0o0Oo<T> o00oo0o1;
        Type type = o00000o1.getType();
        Class<? super T> rawType = o00000o1.getRawType();
        o00O0000<?> o00o0001 = this.f38899OooO00o.get(type);
        if (o00o0001 != null) {
            return new OooO00o(o00o0001, type);
        }
        o00O0000<?> o00o0002 = this.f38899OooO00o.get(rawType);
        if (o00o0002 != null) {
            return new OooO0O0(o00o0002, type);
        }
        o0o0Oo<T> oo0ooo0 = null;
        if (Modifier.isAbstract(rawType.getModifiers())) {
            o00oo0o1 = null;
        } else {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                try {
                    declaredConstructor.setAccessible(true);
                    string = null;
                } catch (Exception e) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed making constructor '");
                    StringBuilder sb = new StringBuilder(declaredConstructor.getDeclaringClass().getName());
                    sb.append('#');
                    sb.append(declaredConstructor.getDeclaringClass().getSimpleName());
                    sb.append('(');
                    Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
                    for (int i = 0; i < parameterTypes.length; i++) {
                        if (i > 0) {
                            sb.append(", ");
                        }
                        sb.append(parameterTypes[i].getSimpleName());
                    }
                    sb.append(')');
                    sbOooO0o0.append(sb.toString());
                    sbOooO0o0.append("' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
                    sbOooO0o0.append(e.getMessage());
                    string = sbOooO0o0.toString();
                }
                o00oo0o1 = string != null ? new o00OO0O0(string) : new o00OO0OO(declaredConstructor);
            } catch (NoSuchMethodException unused) {
                o00oo0o1 = null;
            }
        }
        if (o00oo0o1 != null) {
            return o00oo0o1;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                oo0ooo0 = new o000000O();
            } else if (EnumSet.class.isAssignableFrom(rawType)) {
                oo0ooo0 = new oo0O(type);
            } else if (Set.class.isAssignableFrom(rawType)) {
                oo0ooo0 = new OooO0OO();
            } else {
                oo0ooo0 = Queue.class.isAssignableFrom(rawType) ? new o00OO() : new o00OOO00();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (rawType == EnumMap.class) {
                oo0ooo0 = new o00O0OO0(type);
            } else if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                oo0ooo0 = new OooOOOO();
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                oo0ooo0 = new oo0o0O0();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                oo0ooo0 = new o00O0OO();
            } else {
                oo0ooo0 = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(o00000O0.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new oo0oOO0() : new o00O0OOO();
            }
        }
        if (oo0ooo0 != null) {
            return oo0ooo0;
        }
        if (this.f38900OooO0O0) {
            return new o00O(rawType);
        }
        return new o00OO000("Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public final String toString() {
        return this.f38899OooO00o.toString();
    }
}
