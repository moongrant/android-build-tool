package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0oO0Ooo;
import p670o0oooo0.o00O000o;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO.OooO00o f60565OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O000O f60566OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<OooOOO.OooO00o> f60567OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<OooO0OO.OooO00o> f60569OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f60564OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f60568OooO0o = false;

    public class OooO00o implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000 f60570OooO00o = o0000.f60496OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object[] f60571OooO0O0 = new Object[0];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Class f60572OooO0OO;

        public OooO00o(Class cls) {
            this.f60572OooO0OO = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f60571OooO0O0;
            }
            o0000 o0000Var = this.f60570OooO00o;
            return o0000Var.f60497OooO00o && method.isDefault() ? o0000Var.OooO0O0(this.f60572OooO0OO, method, obj, objArr) : o0000O0O.this.OooO0OO(method).OooO00o(objArr);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000 f60574OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public o00OO.OooO00o f60575OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o0O000O f60576OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f60577OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f60578OooO0o0;

        public OooO0O0() {
            o0000 o0000Var = o0000.f60496OooO0OO;
            this.f60577OooO0Oo = new ArrayList();
            this.f60578OooO0o0 = new ArrayList();
            this.f60574OooO00o = o0000Var;
        }

        public final void OooO00o(o00O000o o00o000o2) {
            this.f60577OooO0Oo.add(o00o000o2);
        }

        public final void OooO0O0(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            Intrinsics.checkNotNullParameter(str, "<this>");
            o0O000O.OooO00o oooO00o = new o0O000O.OooO00o();
            oooO00o.OooO0oO(null, str);
            o0O000O o0o000oOooO0OO = oooO00o.OooO0OO();
            List<String> list = o0o000oOooO0OO.f57793OooO0o;
            if ("".equals(list.get(list.size() - 1))) {
                this.f60576OooO0OO = o0o000oOooO0OO;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + o0o000oOooO0OO);
            }
        }

        public final o0000O0O OooO0OO() {
            if (this.f60576OooO0OO == null) {
                throw new IllegalStateException("Base URL required.");
            }
            o00OO.OooO00o o0ooo00o2 = this.f60575OooO0O0;
            if (o0ooo00o2 == null) {
                o0ooo00o2 = new o0OoO00O();
            }
            o00OO.OooO00o oooO00o = o0ooo00o2;
            o0000 o0000Var = this.f60574OooO00o;
            Executor executorOooO00o = o0000Var.OooO00o();
            ArrayList arrayList = new ArrayList(this.f60578OooO0o0);
            Oooo000 oooo000 = new Oooo000(executorOooO00o);
            boolean z = o0000Var.f60497OooO00o;
            arrayList.addAll(z ? Arrays.asList(OooOOO0.f60470OooO00o, oooo000) : Collections.singletonList(oooo000));
            ArrayList arrayList2 = this.f60577OooO0Oo;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z ? 1 : 0));
            arrayList3.add(new retrofit2.OooO00o());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(z ? Collections.singletonList(oo0o0Oo.f60645OooO00o) : Collections.emptyList());
            return new o0000O0O(oooO00o, this.f60576OooO0OO, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList), executorOooO00o);
        }
    }

    public o0000O0O(o00OO.OooO00o oooO00o, o0O000O o0o000o, List list, List list2, @Nullable Executor executor) {
        this.f60565OooO0O0 = oooO00o;
        this.f60566OooO0OO = o0o000o;
        this.f60567OooO0Oo = list;
        this.f60569OooO0o0 = list2;
    }

    public final OooO0OO<?, ?> OooO00o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<OooO0OO.OooO00o> list = this.f60569OooO0o0;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            OooO0OO<?, ?> oooO0OOOooO00o = list.get(i).OooO00o(type, annotationArr);
            if (oooO0OOOooO00o != null) {
                return oooO0OOOooO00o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T OooO0O0(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<T> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f60568OooO0o) {
            o0000 o0000Var = o0000.f60496OooO0OO;
            for (Method method : cls.getDeclaredMethods()) {
                if (!(o0000Var.f60497OooO00o && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    OooO0OO(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new OooO00o(cls));
    }

    public final o000OO<?> OooO0OO(Method method) {
        o000OO<?> o000ooOooO0O0;
        o000OO<?> o000oo2 = (o000OO) this.f60564OooO00o.get(method);
        if (o000oo2 != null) {
            return o000oo2;
        }
        synchronized (this.f60564OooO00o) {
            o000ooOooO0O0 = (o000OO) this.f60564OooO00o.get(method);
            if (o000ooOooO0O0 == null) {
                o000ooOooO0O0 = o000OO.OooO0O0(this, method);
                this.f60564OooO00o.put(method, o000ooOooO0O0);
            }
        }
        return o000ooOooO0O0;
    }

    public final <T> OooOOO<T, o0oO0Ooo> OooO0Oo(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<OooOOO.OooO00o> list = this.f60567OooO0Oo;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            OooOOO<T, o0oO0Ooo> oooOOOOooO00o = list.get(i).OooO00o(type);
            if (oooOOOOooO00o != null) {
                return oooOOOOooO00o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void OooO0o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<OooOOO.OooO00o> list = this.f60567OooO0Oo;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }

    public final <T> OooOOO<o0O00oO0, T> OooO0o0(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<OooOOO.OooO00o> list = this.f60567OooO0Oo;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            OooOOO<o0O00oO0, T> oooOOO = (OooOOO<o0O00oO0, T>) list.get(i).OooO0O0(type, annotationArr, this);
            if (oooOOO != null) {
                return oooOOO;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
