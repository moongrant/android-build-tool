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
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0ooO.OooO00o f53796OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OO000 f53797OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<OooOO0.OooO00o> f53798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<OooO0OO.OooO00o> f53800OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Method, o000OOo<?>> f53795OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f53799OooO0o = false;

    public class OooO00o implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OOO0o f53801OooO00o = o0OOO0o.f53846OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object[] f53802OooO0O0 = new Object[0];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Class f53803OooO0OO;

        public OooO00o(Class cls) {
            this.f53803OooO0OO = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f53802OooO0O0;
            }
            return this.f53801OooO00o.OooO0OO(method) ? this.f53801OooO00o.OooO0O0(method, this.f53803OooO0OO, obj, objArr) : o0O0O00.this.OooO0OO(method).OooO00o(objArr);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OOO0o f53805OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public o0O0ooO.OooO00o f53806OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00OO000 f53807OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<OooOO0.OooO00o> f53808OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final List<OooO0OO.OooO00o> f53809OooO0o0;

        public OooO0O0() {
            o0OOO0o o0ooo0o2 = o0OOO0o.f53846OooO0OO;
            this.f53808OooO0Oo = new ArrayList();
            this.f53809OooO0o0 = new ArrayList();
            this.f53805OooO00o = o0ooo0o2;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<retrofit2.OooOO0$OooO00o>] */
        public final OooO0O0 OooO00o(OooOO0.OooO00o oooO00o) {
            this.f53808OooO0Oo.add(oooO00o);
            return this;
        }

        public final OooO0O0 OooO0O0(String toHttpUrl) {
            Objects.requireNonNull(toHttpUrl, "baseUrl == null");
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            o00OO000.OooO00o oooO00o = new o00OO000.OooO00o();
            oooO00o.OooO0oO(null, toHttpUrl);
            o00OO000 o00oo000OooO0OO = oooO00o.OooO0OO();
            List<String> list = o00oo000OooO0OO.f51388OooO0oO;
            if ("".equals(list.get(list.size() - 1))) {
                this.f53807OooO0OO = o00oo000OooO0OO;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + o00oo000OooO0OO);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<retrofit2.OooOO0$OooO00o>] */
        public final o0O0O00 OooO0OO() {
            if (this.f53807OooO0OO == null) {
                throw new IllegalStateException("Base URL required.");
            }
            o0O0ooO.OooO00o o00oo2 = this.f53806OooO0O0;
            if (o00oo2 == null) {
                o00oo2 = new o00OO();
            }
            Executor executorOooO00o = this.f53805OooO00o.OooO00o();
            ArrayList arrayList = new ArrayList(this.f53809OooO0o0);
            o0OOO0o o0ooo0o2 = this.f53805OooO00o;
            Objects.requireNonNull(o0ooo0o2);
            OooOOOO oooOOOO = new OooOOOO(executorOooO00o);
            arrayList.addAll(o0ooo0o2.f53847OooO00o ? Arrays.asList(OooO.f53727OooO00o, oooOOOO) : Collections.singletonList(oooOOOO));
            ArrayList arrayList2 = new ArrayList(this.f53808OooO0Oo.size() + 1 + (this.f53805OooO00o.f53847OooO00o ? 1 : 0));
            arrayList2.add(new retrofit2.OooO00o());
            arrayList2.addAll(this.f53808OooO0Oo);
            arrayList2.addAll(this.f53805OooO00o.f53847OooO00o ? Collections.singletonList(o00Ooo.f53792OooO00o) : Collections.emptyList());
            return new o0O0O00(o00oo2, this.f53807OooO0OO, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList));
        }

        public final OooO0O0 OooO0Oo(o00OO o00oo2) {
            Objects.requireNonNull(o00oo2, "client == null");
            this.f53806OooO0O0 = o00oo2;
            return this;
        }
    }

    public o0O0O00(o0O0ooO.OooO00o oooO00o, o00OO000 o00oo001, List list, List list2) {
        this.f53796OooO0O0 = oooO00o;
        this.f53797OooO0OO = o00oo001;
        this.f53798OooO0Oo = list;
        this.f53800OooO0o0 = list2;
    }

    public final OooO0OO<?, ?> OooO00o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f53800OooO0o0.indexOf(null) + 1;
        int size = this.f53800OooO0o0.size();
        for (int i = iIndexOf; i < size; i++) {
            OooO0OO<?, ?> oooO0OOOooO00o = this.f53800OooO0o0.get(i).OooO00o(type, annotationArr);
            if (oooO0OOOooO00o != null) {
                return oooO0OOOooO00o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f53800OooO0o0.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f53800OooO0o0.get(iIndexOf).getClass().getName());
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
        if (this.f53799OooO0o) {
            o0OOO0o o0ooo0o2 = o0OOO0o.f53846OooO0OO;
            for (Method method : cls.getDeclaredMethods()) {
                if (!o0ooo0o2.OooO0OO(method) && !Modifier.isStatic(method.getModifiers())) {
                    OooO0OO(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new OooO00o(cls));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.reflect.Method, retrofit2.o000OOo<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.reflect.Method, retrofit2.o000OOo<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.reflect.Method, retrofit2.o000OOo<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final o000OOo<?> OooO0OO(Method method) {
        o000OOo<?> o000oooOooO0O0;
        o000OOo<?> o000ooo2 = (o000OOo) this.f53795OooO00o.get(method);
        if (o000ooo2 != null) {
            return o000ooo2;
        }
        synchronized (this.f53795OooO00o) {
            o000oooOooO0O0 = (o000OOo) this.f53795OooO00o.get(method);
            if (o000oooOooO0O0 == null) {
                o000oooOooO0O0 = o000OOo.OooO0O0(this, method);
                this.f53795OooO00o.put(method, o000oooOooO0O0);
            }
        }
        return o000oooOooO0O0;
    }

    public final <T> OooOO0<T, o0o0Oo> OooO0Oo(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f53798OooO0Oo.indexOf(null) + 1;
        int size = this.f53798OooO0Oo.size();
        for (int i = iIndexOf; i < size; i++) {
            OooOO0<T, o0o0Oo> oooOO0OooO00o = this.f53798OooO0Oo.get(i).OooO00o(type);
            if (oooOO0OooO00o != null) {
                return oooOO0OooO00o;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f53798OooO0Oo.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f53798OooO0Oo.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lretrofit2/OooOO0<TT;Ljava/lang/String;>; */
    public final void OooO0o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.f53798OooO0Oo.size();
        for (int i = 0; i < size; i++) {
            Objects.requireNonNull(this.f53798OooO0Oo.get(i));
        }
    }

    public final <T> OooOO0<o00OOOOo, T> OooO0o0(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f53798OooO0Oo.indexOf(null) + 1;
        int size = this.f53798OooO0Oo.size();
        for (int i = iIndexOf; i < size; i++) {
            OooOO0<o00OOOOo, T> oooOO1 = (OooOO0<o00OOOOo, T>) this.f53798OooO0Oo.get(i).OooO0O0(type, annotationArr, this);
            if (oooOO1 != null) {
                return oooOO1;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f53798OooO0Oo.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f53798OooO0Oo.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
