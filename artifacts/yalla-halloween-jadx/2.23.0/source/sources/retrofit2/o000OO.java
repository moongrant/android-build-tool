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
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.oo00oO;
import p665o0oooOo.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O00o0.OooO00o f61134OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OO f61135OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<OooOOOO.OooO00o> f61136OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<OooO0OO.OooO00o> f61138OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f61133OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f61137OooO0o = false;

    public class OooO00o implements InvocationHandler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000O00 f61139OooO00o = o0000O00.f61104OooO0OO;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object[] f61140OooO0O0 = new Object[0];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Class f61141OooO0OO;

        public OooO00o(Class cls) {
            this.f61141OooO0OO = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f61140OooO0O0;
            }
            o0000O00 o0000o00 = this.f61139OooO00o;
            return o0000o00.f61105OooO00o && method.isDefault() ? o0000o00.OooO0O0(this.f61141OooO0OO, method, obj, objArr) : o000OO.this.OooO0OO(method).OooO00o(objArr);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000O00 f61143OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public o00O00o0.OooO00o f61144OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public o00OO f61145OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f61146OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f61147OooO0o0;

        public OooO0O0() {
            o0000O00 o0000o00 = o0000O00.f61104OooO0OO;
            this.f61146OooO0Oo = new ArrayList();
            this.f61147OooO0o0 = new ArrayList();
            this.f61143OooO00o = o0000o00;
        }

        public final void OooO00o(oOo00OO0 ooo00oo0) {
            this.f61146OooO0Oo.add(ooo00oo0);
        }

        public final void OooO0O0(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            Intrinsics.checkNotNullParameter(str, "<this>");
            o00OO.OooO00o oooO00o = new o00OO.OooO00o();
            oooO00o.OooO0oO(null, str);
            o00OO o00ooOooO0OO = oooO00o.OooO0OO();
            List<String> list = o00ooOooO0OO.f57207OooO0o;
            if ("".equals(list.get(list.size() - 1))) {
                this.f61145OooO0OO = o00ooOooO0OO;
            } else {
                throw new IllegalArgumentException("baseUrl must end in /: " + o00ooOooO0OO);
            }
        }

        public final o000OO OooO0OO() {
            if (this.f61145OooO0OO == null) {
                throw new IllegalStateException("Base URL required.");
            }
            o00O00o0.OooO00o o00oooo1 = this.f61144OooO0O0;
            if (o00oooo1 == null) {
                o00oooo1 = new o00OOOO0();
            }
            o0000O00 o0000o00 = this.f61143OooO00o;
            Executor executorOooO00o = o0000o00.OooO00o();
            ArrayList arrayList = new ArrayList(this.f61147OooO0o0);
            Oooo0 oooo0 = new Oooo0(executorOooO00o);
            boolean z = o0000o00.f61105OooO00o;
            arrayList.addAll(z ? Arrays.asList(OooOOO.f61009OooO00o, oooo0) : Collections.singletonList(oooo0));
            ArrayList arrayList2 = this.f61146OooO0Oo;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z ? 1 : 0));
            arrayList3.add(new retrofit2.OooO00o());
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(z ? Collections.singletonList(o0O0O00.f61160OooO00o) : Collections.emptyList());
            return new o000OO(o00oooo1, this.f61145OooO0OO, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList));
        }
    }

    public o000OO(o00O00o0.OooO00o oooO00o, o00OO o00oo2, List list, List list2) {
        this.f61134OooO0O0 = oooO00o;
        this.f61135OooO0OO = o00oo2;
        this.f61136OooO0Oo = list;
        this.f61138OooO0o0 = list2;
    }

    public final OooO0OO<?, ?> OooO00o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<OooO0OO.OooO00o> list = this.f61138OooO0o0;
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
        if (this.f61137OooO0o) {
            o0000O00 o0000o00 = o0000O00.f61104OooO0OO;
            for (Method method : cls.getDeclaredMethods()) {
                if (!(o0000o00.f61105OooO00o && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                    OooO0OO(method);
                }
            }
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new OooO00o(cls));
    }

    public final o0000O<?> OooO0OO(Method method) {
        o0000O<?> o0000oOooO0O0;
        o0000O<?> o0000o2 = (o0000O) this.f61133OooO00o.get(method);
        if (o0000o2 != null) {
            return o0000o2;
        }
        synchronized (this.f61133OooO00o) {
            o0000oOooO0O0 = (o0000O) this.f61133OooO00o.get(method);
            if (o0000oOooO0O0 == null) {
                o0000oOooO0O0 = o0000O.OooO0O0(this, method);
                this.f61133OooO00o.put(method, o0000oOooO0O0);
            }
        }
        return o0000oOooO0O0;
    }

    public final <T> OooOOOO<T, oo00oO> OooO0Oo(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<OooOOOO.OooO00o> list = this.f61136OooO0Oo;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            OooOOOO<T, oo00oO> oooOOOOOooO00o = list.get(i).OooO00o(type);
            if (oooOOOOOooO00o != null) {
                return oooOOOOOooO00o;
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
        List<OooOOOO.OooO00o> list = this.f61136OooO0Oo;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }

    public final <T> OooOOOO<o0O0o, T> OooO0o0(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<OooOOOO.OooO00o> list = this.f61136OooO0Oo;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            OooOOOO<o0O0o, T> oooOOOO = (OooOOOO<o0O0o, T>) list.get(i).OooO0O0(type, annotationArr, this);
            if (oooOOOO != null) {
                return oooOOOO;
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
