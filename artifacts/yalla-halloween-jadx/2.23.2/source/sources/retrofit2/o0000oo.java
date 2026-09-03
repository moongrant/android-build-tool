package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f60579OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f60580OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O000O f60581OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f60582OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f60583OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o0O000Oo f60584OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o0O000 f60585OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f60586OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f60587OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000000<?>[] f60588OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f60589OooOO0O;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final Pattern f60590OooOo = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final Pattern f60591OooOoO0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f60592OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000O0O f60593OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f60594OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Annotation[] f60595OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Annotation[][] f60596OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f60597OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type[] f60598OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f60599OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f60600OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f60601OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f60602OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f60603OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public String f60604OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f60605OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f60606OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f60607OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public String f60608OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f60609OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public o0O000 f60610OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public LinkedHashSet f60611OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @Nullable
        public o0O000Oo f60612OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public o000000<?>[] f60613OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f60614OooOo0o;

        public OooO00o(o0000O0O o0000o0o2, Method method) {
            this.f60593OooO00o = o0000o0o2;
            this.f60594OooO0O0 = method;
            this.f60595OooO0OO = method.getAnnotations();
            this.f60598OooO0o0 = method.getGenericParameterTypes();
            this.f60596OooO0Oo = method.getParameterAnnotations();
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
            String str3 = this.f60604OooOOO;
            Method method = this.f60594OooO0O0;
            if (str3 != null) {
                throw o0000O.OooOO0(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f60604OooOOO = str;
            this.f60606OooOOOO = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            Pattern pattern = f60590OooOo;
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (pattern.matcher(strSubstring).find()) {
                    throw o0000O.OooOO0(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f60608OooOOo = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f60611OooOo0 = linkedHashSet;
        }

        public final void OooO0OO(int i, Type type) {
            if (o0000O.OooO0oo(type)) {
                throw o0000O.OooOO0O(this.f60594OooO0O0, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public o0000oo(OooO00o oooO00o) {
        this.f60580OooO00o = oooO00o.f60594OooO0O0;
        this.f60581OooO0O0 = oooO00o.f60593OooO00o.f60566OooO0OO;
        this.f60582OooO0OO = oooO00o.f60604OooOOO;
        this.f60583OooO0Oo = oooO00o.f60608OooOOo;
        this.f60585OooO0o0 = oooO00o.f60610OooOOoo;
        this.f60584OooO0o = oooO00o.f60612OooOo00;
        this.f60586OooO0oO = oooO00o.f60606OooOOOO;
        this.f60587OooO0oo = oooO00o.f60607OooOOOo;
        this.f60579OooO = oooO00o.f60609OooOOo0;
        this.f60588OooOO0 = oooO00o.f60613OooOo0O;
        this.f60589OooOO0O = oooO00o.f60614OooOo0o;
    }
}
