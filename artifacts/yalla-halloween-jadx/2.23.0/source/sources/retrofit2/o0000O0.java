package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f61068OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f61069OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO f61070OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f61071OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f61072OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o00OOO0 f61073OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final oo0O f61074OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f61075OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f61076OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000000O<?>[] f61077OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f61078OooOO0O;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final Pattern f61079OooOo = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final Pattern f61080OooOoO0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f61081OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000OO f61082OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f61083OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Annotation[] f61084OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Annotation[][] f61085OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f61086OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type[] f61087OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f61088OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f61089OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f61090OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f61091OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f61092OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public String f61093OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f61094OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f61095OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f61096OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public String f61097OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f61098OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public oo0O f61099OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public LinkedHashSet f61100OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @Nullable
        public o00OOO0 f61101OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public o000000O<?>[] f61102OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f61103OooOo0o;

        public OooO00o(o000OO o000oo2, Method method) {
            this.f61082OooO00o = o000oo2;
            this.f61083OooO0O0 = method;
            this.f61084OooO0OO = method.getAnnotations();
            this.f61087OooO0o0 = method.getGenericParameterTypes();
            this.f61085OooO0Oo = method.getParameterAnnotations();
        }

        public static Class<?> OooO00o(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public final void OooO0O0(String str, String str2, boolean z) {
            String str3 = this.f61093OooOOO;
            Method method = this.f61083OooO0O0;
            if (str3 != null) {
                throw o0000OO0.OooOO0(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f61093OooOOO = str;
            this.f61095OooOOOO = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f61079OooOo;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw o0000OO0.OooOO0(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f61097OooOOo = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f61100OooOo0 = linkedHashSet;
        }

        public final void OooO0OO(int i, Type type) {
            if (o0000OO0.OooO0oo(type)) {
                throw o0000OO0.OooOO0O(this.f61083OooO0O0, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public o0000O0(OooO00o oooO00o) {
        this.f61069OooO00o = oooO00o.f61083OooO0O0;
        this.f61070OooO0O0 = oooO00o.f61082OooO00o.f61135OooO0OO;
        this.f61071OooO0OO = oooO00o.f61093OooOOO;
        this.f61072OooO0Oo = oooO00o.f61097OooOOo;
        this.f61074OooO0o0 = oooO00o.f61099OooOOoo;
        this.f61073OooO0o = oooO00o.f61101OooOo00;
        this.f61075OooO0oO = oooO00o.f61095OooOOOO;
        this.f61076OooO0oo = oooO00o.f61096OooOOOo;
        this.f61068OooO = oooO00o.f61098OooOOo0;
        this.f61077OooOO0 = oooO00o.f61102OooOo0O;
        this.f61078OooOO0O = oooO00o.f61103OooOo0o;
    }
}
