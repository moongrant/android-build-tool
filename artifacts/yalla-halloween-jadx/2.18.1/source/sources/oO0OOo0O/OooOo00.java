package oO0OOo0O;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import org.greenrobot.eventbus.Subscribe;
import p689oO000Ooo.oo00oO;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Map<Class<?>, List<OooOOOO>> f52843OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o[] f52844OooO0O0 = new OooO00o[4];

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooOOOO> f52845OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<Class, Object> f52846OooO0O0 = new HashMap();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, Class> f52847OooO0OO = new HashMap();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final StringBuilder f52848OooO0Oo = new StringBuilder(128);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f52849OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Class<?> f52850OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public oo00oO f52851OooO0oO;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to oO0OOo0O.OooOo00$OooO00o for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final boolean OooO00o(java.lang.reflect.Method r3, java.lang.Class<?> r4) {
            /*
                r2 = this;
                java.util.Map<java.lang.Class, java.lang.Object> r0 = r2.f52846OooO0O0
                java.lang.Object r0 = r0.put(r4, r3)
                if (r0 != 0) goto La
                r3 = 1
                return r3
            La:
                boolean r1 = r0 instanceof java.lang.reflect.Method
                if (r1 == 0) goto L22
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                boolean r0 = r2.OooO0O0(r0, r4)
                if (r0 == 0) goto L1c
                java.util.Map<java.lang.Class, java.lang.Object> r0 = r2.f52846OooO0O0
                r0.put(r4, r2)
                goto L22
            L1c:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                r3.<init>()
                throw r3
            L22:
                boolean r3 = r2.OooO0O0(r3, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: oO0OOo0O.OooOo00.OooO00o.OooO00o(java.lang.reflect.Method, java.lang.Class):boolean");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final boolean OooO0O0(Method method, Class<?> cls) {
            this.f52848OooO0Oo.setLength(0);
            this.f52848OooO0Oo.append(method.getName());
            StringBuilder sb = this.f52848OooO0Oo;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String string = this.f52848OooO0Oo.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.f52847OooO0OO.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f52847OooO0OO.put(string, clsPut);
            return false;
        }

        public final void OooO0OO() {
            if (this.f52849OooO0o) {
                this.f52850OooO0o0 = null;
                return;
            }
            Class<? super Object> superclass = this.f52850OooO0o0.getSuperclass();
            this.f52850OooO0o0 = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f52850OooO0o0 = null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<oO0OOo0O.OooOOOO>] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.Class, java.lang.Object>] */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class>] */
        public final void OooO0Oo() {
            this.f52845OooO00o.clear();
            this.f52846OooO0O0.clear();
            this.f52847OooO0OO.clear();
            this.f52848OooO0Oo.setLength(0);
            this.f52850OooO0o0 = null;
            this.f52849OooO0o = false;
            this.f52851OooO0oO = null;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.ArrayList, java.util.List<oO0OOo0O.OooOOOO>] */
    public final void OooO00o(OooO00o oooO00o) {
        Method[] methods;
        Subscribe subscribe;
        try {
            methods = oooO00o.f52850OooO0o0.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = oooO00o.f52850OooO0o0.getMethods();
            oooO00o.f52849OooO0o = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && (subscribe = (Subscribe) method.getAnnotation(Subscribe.class)) != null) {
                    Class<?> cls = parameterTypes[0];
                    if (oooO00o.OooO00o(method, cls)) {
                        oooO00o.f52845OooO00o.add(new OooOOOO(method, cls, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                    }
                }
            }
        }
    }

    public final List<OooOOOO> OooO0O0(OooO00o oooO00o) {
        ArrayList arrayList = new ArrayList(oooO00o.f52845OooO00o);
        oooO00o.OooO0Oo();
        synchronized (f52844OooO0O0) {
            for (int i = 0; i < 4; i++) {
                OooO00o[] oooO00oArr = f52844OooO0O0;
                if (oooO00oArr[i] == null) {
                    oooO00oArr[i] = oooO00o;
                    break;
                }
            }
        }
        return arrayList;
    }

    public final OooO00o OooO0OO() {
        synchronized (f52844OooO0O0) {
            for (int i = 0; i < 4; i++) {
                OooO00o[] oooO00oArr = f52844OooO0O0;
                OooO00o oooO00o = oooO00oArr[i];
                if (oooO00o != null) {
                    oooO00oArr[i] = null;
                    return oooO00o;
                }
            }
            return new OooO00o();
        }
    }
}
