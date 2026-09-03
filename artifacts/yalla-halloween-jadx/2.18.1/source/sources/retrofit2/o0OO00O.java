package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f53810OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f53811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO000 f53812OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f53813OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f53814OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o00OO0O0 f53815OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00O f53816OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f53817OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f53818OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0ooOOo<?>[] f53819OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f53820OooOO0O;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final Pattern f53821OooOo = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final Pattern f53822OooOoO0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f53823OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0O00 f53824OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f53825OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Annotation[] f53826OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Annotation[][] f53827OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f53828OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Type[] f53829OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f53830OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f53831OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f53832OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f53833OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f53834OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public String f53835OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f53836OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f53837OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f53838OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public String f53839OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f53840OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public o00O f53841OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public Set<String> f53842OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @Nullable
        public o00OO0O0 f53843OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public o0ooOOo<?>[] f53844OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f53845OooOo0o;

        public OooO00o(o0O0O00 o0o0o00, Method method) {
            this.f53824OooO00o = o0o0o00;
            this.f53825OooO0O0 = method;
            this.f53826OooO0OO = method.getAnnotations();
            this.f53829OooO0o0 = method.getGenericParameterTypes();
            this.f53827OooO0Oo = method.getParameterAnnotations();
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
            String str3 = this.f53835OooOOO;
            if (str3 != null) {
                throw o000000.OooOO0(this.f53825OooO0O0, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f53835OooOOO = str;
            this.f53837OooOOOO = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f53821OooOo.matcher(strSubstring).find()) {
                    throw o000000.OooOO0(this.f53825OooO0O0, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f53839OooOOo = str2;
            Matcher matcher = f53821OooOo.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f53842OooOo0 = linkedHashSet;
        }

        public final void OooO0OO(int i, Type type) {
            if (o000000.OooO0oo(type)) {
                throw o000000.OooOO0O(this.f53825OooO0O0, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public o0OO00O(OooO00o oooO00o) {
        this.f53811OooO00o = oooO00o.f53825OooO0O0;
        this.f53812OooO0O0 = oooO00o.f53824OooO00o.f53797OooO0OO;
        this.f53813OooO0OO = oooO00o.f53835OooOOO;
        this.f53814OooO0Oo = oooO00o.f53839OooOOo;
        this.f53816OooO0o0 = oooO00o.f53841OooOOoo;
        this.f53815OooO0o = oooO00o.f53843OooOo00;
        this.f53817OooO0oO = oooO00o.f53837OooOOOO;
        this.f53818OooO0oo = oooO00o.f53838OooOOOo;
        this.f53810OooO = oooO00o.f53840OooOOo0;
        this.f53819OooOO0 = oooO00o.f53844OooOo0O;
        this.f53820OooOO0O = oooO00o.f53845OooOo0o;
    }
}
