package retrofit2;

import com.google.firebase.perf.FirebasePerformance;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O000o0;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0oO0Ooo;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o000OO<T> {
    /* JADX WARN: Code duplicated, block: B:384:0x08b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:385:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:568:0x08d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:0x08bd A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Oooo0 OooO0O0(o0000O0O o0000o0o2, Method method) {
        Type genericReturnType;
        boolean z;
        Annotation[][] annotationArr;
        int i;
        boolean z2;
        String str;
        int i2;
        o000000<?>[] o000000VarArr;
        o000000<?> o000000Var;
        String str2;
        o000000<?>[] o000000VarArr2;
        boolean z3;
        int i3;
        o000000<?> o000ooo2;
        o000000<?> o000oooo2;
        o000000<?> oooO0OO;
        o000000<?> o000ooo3;
        o000000<?> oooOo;
        o0000oo.OooO00o oooO00o = new o0000oo.OooO00o(o0000o0o2, method);
        Annotation[] annotationArr2 = oooO00o.f60595OooO0OO;
        int length = annotationArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            Method method2 = oooO00o.f60594OooO0O0;
            String str3 = "HEAD";
            if (i5 >= length) {
                if (oooO00o.f60604OooOOO == null) {
                    throw o0000O.OooOO0(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!oooO00o.f60606OooOOOO) {
                    if (oooO00o.f60609OooOOo0) {
                        throw o0000O.OooOO0(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (oooO00o.f60607OooOOOo) {
                        throw o0000O.OooOO0(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = oooO00o.f60596OooO0Oo;
                int length2 = annotationArr3.length;
                oooO00o.f60613OooOo0O = new o000000[length2];
                int i6 = length2 - 1;
                boolean z4 = true;
                boolean z5 = false;
                while (i4 < length2) {
                    o000000<?>[] o000000VarArr3 = oooO00o.f60613OooOo0O;
                    Type type = oooO00o.f60598OooO0o0[i4];
                    Annotation[] annotationArr4 = annotationArr3[i4];
                    if (i4 == i6) {
                        z5 = z4;
                    }
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i7 = 0;
                        o000000Var = null;
                        while (i7 < length3) {
                            Annotation[][] annotationArr5 = annotationArr3;
                            Annotation annotation = annotationArr4[i7];
                            int i8 = length2;
                            int i9 = i6;
                            int i10 = length3;
                            if (annotation instanceof Url) {
                                oooO00o.OooO0OO(i4, type);
                                if (oooO00o.f60605OooOOO0) {
                                    throw o0000O.OooOO0O(method2, i4, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (oooO00o.f60592OooO) {
                                    throw o0000O.OooOO0O(method2, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (oooO00o.f60601OooOO0) {
                                    throw o0000O.OooOO0O(method2, i4, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (oooO00o.f60602OooOO0O) {
                                    throw o0000O.OooOO0O(method2, i4, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (oooO00o.f60603OooOO0o) {
                                    throw o0000O.OooOO0O(method2, i4, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (oooO00o.f60608OooOOo != null) {
                                    throw o0000O.OooOO0O(method2, i4, "@Url cannot be used with @%s URL", oooO00o.f60604OooOOO);
                                }
                                oooO00o.f60605OooOOO0 = true;
                                if (type != o0O000O.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw o0000O.OooOO0O(method2, i4, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                o000ooo2 = new o000000.Oooo0(i4, method2);
                            } else {
                                boolean z6 = annotation instanceof Path;
                                o0000O0O o0000o0o3 = oooO00o.f60593OooO00o;
                                if (z6) {
                                    oooO00o.OooO0OO(i4, type);
                                    if (oooO00o.f60601OooOO0) {
                                        throw o0000O.OooOO0O(method2, i4, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (oooO00o.f60602OooOO0O) {
                                        throw o0000O.OooOO0O(method2, i4, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (oooO00o.f60603OooOO0o) {
                                        throw o0000O.OooOO0O(method2, i4, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (oooO00o.f60605OooOOO0) {
                                        throw o0000O.OooOO0O(method2, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (oooO00o.f60608OooOOo == null) {
                                        throw o0000O.OooOO0O(method2, i4, "@Path can only be used with relative url on @%s", oooO00o.f60604OooOOO);
                                    }
                                    oooO00o.f60592OooO = true;
                                    Path path = (Path) annotation;
                                    String strValue = path.value();
                                    if (!o0000oo.OooO00o.f60591OooOoO0.matcher(strValue).matches()) {
                                        throw o0000O.OooOO0O(method2, i4, "@Path parameter name must match %s. Found: %s", o0000oo.OooO00o.f60590OooOo.pattern(), strValue);
                                    }
                                    if (!oooO00o.f60611OooOo0.contains(strValue)) {
                                        throw o0000O.OooOO0O(method2, i4, "URL \"%s\" does not contain \"{%s}\".", oooO00o.f60608OooOOo, strValue);
                                    }
                                    o0000o0o3.OooO0o(type, annotationArr4);
                                    o000ooo2 = new o000000.OooOOO(method2, i4, strValue, path.encoded());
                                } else {
                                    str2 = str3;
                                    if (annotation instanceof Query) {
                                        oooO00o.OooO0OO(i4, type);
                                        Query query = (Query) annotation;
                                        String strValue2 = query.value();
                                        boolean zEncoded = query.encoded();
                                        Class<?> clsOooO0o = o0000O.OooO0o(type);
                                        o000000VarArr2 = o000000VarArr3;
                                        oooO00o.f60601OooOO0 = true;
                                        if (Iterable.class.isAssignableFrom(clsOooO0o)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw o0000O.OooOO0O(method2, i4, clsOooO0o.getSimpleName() + " must include generic type (e.g., " + clsOooO0o.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            o0000o0o3.OooO0o(o0000O.OooO0o0(0, (ParameterizedType) type), annotationArr4);
                                            o000ooo2 = new o0O0O00(new o000000.OooOOOO(strValue2, zEncoded));
                                        } else if (clsOooO0o.isArray()) {
                                            o0000o0o3.OooO0o(o0000oo.OooO00o.OooO00o(clsOooO0o.getComponentType()), annotationArr4);
                                            o000ooo2 = new o000OOo(new o000000.OooOOOO(strValue2, zEncoded));
                                        } else {
                                            o0000o0o3.OooO0o(type, annotationArr4);
                                            oooOo = new o000000.OooOOOO<>(strValue2, zEncoded);
                                            o000ooo2 = oooOo;
                                        }
                                        z3 = z5;
                                        i3 = i7;
                                    } else {
                                        o000000VarArr2 = o000000VarArr3;
                                        if (annotation instanceof QueryName) {
                                            oooO00o.OooO0OO(i4, type);
                                            boolean zEncoded2 = ((QueryName) annotation).encoded();
                                            Class<?> clsOooO0o2 = o0000O.OooO0o(type);
                                            oooO00o.f60602OooOO0O = true;
                                            if (Iterable.class.isAssignableFrom(clsOooO0o2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw o0000O.OooOO0O(method2, i4, clsOooO0o2.getSimpleName() + " must include generic type (e.g., " + clsOooO0o2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                o0000o0o3.OooO0o(o0000O.OooO0o0(0, (ParameterizedType) type), annotationArr4);
                                                o000ooo2 = new o0O0O00(new o000000.OooOo(zEncoded2));
                                            } else if (clsOooO0o2.isArray()) {
                                                o0000o0o3.OooO0o(o0000oo.OooO00o.OooO00o(clsOooO0o2.getComponentType()), annotationArr4);
                                                o000ooo2 = new o000OOo(new o000000.OooOo(zEncoded2));
                                            } else {
                                                o0000o0o3.OooO0o(type, annotationArr4);
                                                oooOo = new o000000.OooOo<>(zEncoded2);
                                                o000ooo2 = oooOo;
                                            }
                                            z3 = z5;
                                            i3 = i7;
                                        } else {
                                            z3 = z5;
                                            if (annotation instanceof QueryMap) {
                                                oooO00o.OooO0OO(i4, type);
                                                Class<?> clsOooO0o3 = o0000O.OooO0o(type);
                                                oooO00o.f60603OooOO0o = true;
                                                if (!Map.class.isAssignableFrom(clsOooO0o3)) {
                                                    throw o0000O.OooOO0O(method2, i4, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeOooO0oO = o0000O.OooO0oO(type, clsOooO0o3);
                                                if (!(typeOooO0oO instanceof ParameterizedType)) {
                                                    throw o0000O.OooOO0O(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeOooO0oO;
                                                Type typeOooO0o0 = o0000O.OooO0o0(0, parameterizedType);
                                                if (String.class != typeOooO0o0) {
                                                    throw o0000O.OooOO0O(method2, i4, "@QueryMap keys must be of type String: " + typeOooO0o0, new Object[0]);
                                                }
                                                o0000o0o3.OooO0o(o0000O.OooO0o0(1, parameterizedType), annotationArr4);
                                                oooO0OO = new o000000.OooOo00<>(method2, i4, ((QueryMap) annotation).encoded());
                                            } else if (annotation instanceof Header) {
                                                oooO00o.OooO0OO(i4, type);
                                                String strValue3 = ((Header) annotation).value();
                                                Class<?> clsOooO0o4 = o0000O.OooO0o(type);
                                                if (Iterable.class.isAssignableFrom(clsOooO0o4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw o0000O.OooOO0O(method2, i4, clsOooO0o4.getSimpleName() + " must include generic type (e.g., " + clsOooO0o4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    o0000o0o3.OooO0o(o0000O.OooO0o0(0, (ParameterizedType) type), annotationArr4);
                                                    o000ooo3 = new o0O0O00(new o000000.OooO0o(strValue3));
                                                } else if (clsOooO0o4.isArray()) {
                                                    o0000o0o3.OooO0o(o0000oo.OooO00o.OooO00o(clsOooO0o4.getComponentType()), annotationArr4);
                                                    o000ooo3 = new o000OOo(new o000000.OooO0o(strValue3));
                                                } else {
                                                    o0000o0o3.OooO0o(type, annotationArr4);
                                                    oooO0OO = new o000000.OooO0o<>(strValue3);
                                                }
                                                o000ooo2 = o000ooo3;
                                                i3 = i7;
                                            } else if (annotation instanceof HeaderMap) {
                                                if (type == o0O000.class) {
                                                    oooO0OO = new o000000.OooOO0(i4, method2);
                                                } else {
                                                    oooO00o.OooO0OO(i4, type);
                                                    Class<?> clsOooO0o5 = o0000O.OooO0o(type);
                                                    if (!Map.class.isAssignableFrom(clsOooO0o5)) {
                                                        throw o0000O.OooOO0O(method2, i4, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeOooO0oO2 = o0000O.OooO0oO(type, clsOooO0o5);
                                                    if (!(typeOooO0oO2 instanceof ParameterizedType)) {
                                                        throw o0000O.OooOO0O(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeOooO0oO2;
                                                    Type typeOooO0o1 = o0000O.OooO0o0(0, parameterizedType2);
                                                    if (String.class != typeOooO0o1) {
                                                        throw o0000O.OooOO0O(method2, i4, "@HeaderMap keys must be of type String: " + typeOooO0o1, new Object[0]);
                                                    }
                                                    o0000o0o3.OooO0o(o0000O.OooO0o0(1, parameterizedType2), annotationArr4);
                                                    oooO0OO = new o000000.OooO<>(method2, i4);
                                                }
                                            } else if (annotation instanceof Field) {
                                                oooO00o.OooO0OO(i4, type);
                                                if (!oooO00o.f60607OooOOOo) {
                                                    throw o0000O.OooOO0O(method2, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Field field = (Field) annotation;
                                                String strValue4 = field.value();
                                                boolean zEncoded3 = field.encoded();
                                                oooO00o.f60597OooO0o = true;
                                                Class<?> clsOooO0o6 = o0000O.OooO0o(type);
                                                if (Iterable.class.isAssignableFrom(clsOooO0o6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw o0000O.OooOO0O(method2, i4, clsOooO0o6.getSimpleName() + " must include generic type (e.g., " + clsOooO0o6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    o0000o0o3.OooO0o(o0000O.OooO0o0(0, (ParameterizedType) type), annotationArr4);
                                                    o000ooo3 = new o0O0O00(new o000000.OooO0O0(strValue4, zEncoded3));
                                                } else if (clsOooO0o6.isArray()) {
                                                    o0000o0o3.OooO0o(o0000oo.OooO00o.OooO00o(clsOooO0o6.getComponentType()), annotationArr4);
                                                    o000ooo3 = new o000OOo(new o000000.OooO0O0(strValue4, zEncoded3));
                                                } else {
                                                    o0000o0o3.OooO0o(type, annotationArr4);
                                                    oooO0OO = new o000000.OooO0O0<>(strValue4, zEncoded3);
                                                }
                                                o000ooo2 = o000ooo3;
                                                i3 = i7;
                                            } else if (annotation instanceof FieldMap) {
                                                oooO00o.OooO0OO(i4, type);
                                                if (!oooO00o.f60607OooOOOo) {
                                                    throw o0000O.OooOO0O(method2, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class<?> clsOooO0o7 = o0000O.OooO0o(type);
                                                if (!Map.class.isAssignableFrom(clsOooO0o7)) {
                                                    throw o0000O.OooOO0O(method2, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeOooO0oO3 = o0000O.OooO0oO(type, clsOooO0o7);
                                                if (!(typeOooO0oO3 instanceof ParameterizedType)) {
                                                    throw o0000O.OooOO0O(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeOooO0oO3;
                                                Type typeOooO0o2 = o0000O.OooO0o0(0, parameterizedType3);
                                                if (String.class != typeOooO0o2) {
                                                    throw o0000O.OooOO0O(method2, i4, "@FieldMap keys must be of type String: " + typeOooO0o2, new Object[0]);
                                                }
                                                o0000o0o3.OooO0o(o0000O.OooO0o0(1, parameterizedType3), annotationArr4);
                                                oooO00o.f60597OooO0o = true;
                                                oooO0OO = new o000000.OooO0OO<>(method2, i4, ((FieldMap) annotation).encoded());
                                            } else {
                                                i3 = i7;
                                                if (annotation instanceof Part) {
                                                    oooO00o.OooO0OO(i4, type);
                                                    if (!oooO00o.f60609OooOOo0) {
                                                        throw o0000O.OooOO0O(method2, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    Part part = (Part) annotation;
                                                    oooO00o.f60599OooO0oO = true;
                                                    String strValue5 = part.value();
                                                    Class<?> clsOooO0o8 = o0000O.OooO0o(type);
                                                    if (strValue5.isEmpty()) {
                                                        boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsOooO0o8);
                                                        o000oooo2 = o000000.Oooo000.f60537OooO00o;
                                                        if (zIsAssignableFrom) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw o0000O.OooOO0O(method2, i4, clsOooO0o8.getSimpleName() + " must include generic type (e.g., " + clsOooO0o8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            if (!o0O000o0.OooO0OO.class.isAssignableFrom(o0000O.OooO0o(o0000O.OooO0o0(0, (ParameterizedType) type)))) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            o000ooo2 = new o0O0O00(o000oooo2);
                                                        } else if (!clsOooO0o8.isArray()) {
                                                            if (!o0O000o0.OooO0OO.class.isAssignableFrom(clsOooO0o8)) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            o000ooo2 = o000oooo2;
                                                        } else {
                                                            if (!o0O000o0.OooO0OO.class.isAssignableFrom(clsOooO0o8.getComponentType())) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            o000ooo2 = new o000OOo(o000oooo2);
                                                        }
                                                    } else {
                                                        o0O000 o0o000OooO0OO = o0O000.OooO0O0.OooO0OO("Content-Disposition", p004OooO0oO.o000oOoO.OooO0O0("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", part.encoding());
                                                        if (Iterable.class.isAssignableFrom(clsOooO0o8)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw o0000O.OooOO0O(method2, i4, clsOooO0o8.getSimpleName() + " must include generic type (e.g., " + clsOooO0o8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            Type typeOooO0o3 = o0000O.OooO0o0(0, (ParameterizedType) type);
                                                            if (o0O000o0.OooO0OO.class.isAssignableFrom(o0000O.OooO0o(typeOooO0o3))) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            o000ooo2 = new o0O0O00(new o000000.OooOO0O(method2, i4, o0o000OooO0OO, o0000o0o3.OooO0Oo(typeOooO0o3, annotationArr4, annotationArr2)));
                                                        } else if (clsOooO0o8.isArray()) {
                                                            Class<?> clsOooO00o = o0000oo.OooO00o.OooO00o(clsOooO0o8.getComponentType());
                                                            if (o0O000o0.OooO0OO.class.isAssignableFrom(clsOooO00o)) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            o000ooo2 = new o000OOo(new o000000.OooOO0O(method2, i4, o0o000OooO0OO, o0000o0o3.OooO0Oo(clsOooO00o, annotationArr4, annotationArr2)));
                                                        } else {
                                                            if (o0O000o0.OooO0OO.class.isAssignableFrom(clsOooO0o8)) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            o000oooo2 = new o000000.OooOO0O<>(method2, i4, o0o000OooO0OO, o0000o0o3.OooO0Oo(type, annotationArr4, annotationArr2));
                                                            o000ooo2 = o000oooo2;
                                                        }
                                                    }
                                                } else {
                                                    if (annotation instanceof PartMap) {
                                                        oooO00o.OooO0OO(i4, type);
                                                        if (!oooO00o.f60609OooOOo0) {
                                                            throw o0000O.OooOO0O(method2, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                        oooO00o.f60599OooO0oO = true;
                                                        Class<?> clsOooO0o9 = o0000O.OooO0o(type);
                                                        if (!Map.class.isAssignableFrom(clsOooO0o9)) {
                                                            throw o0000O.OooOO0O(method2, i4, "@PartMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeOooO0oO4 = o0000O.OooO0oO(type, clsOooO0o9);
                                                        if (!(typeOooO0oO4 instanceof ParameterizedType)) {
                                                            throw o0000O.OooOO0O(method2, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType4 = (ParameterizedType) typeOooO0oO4;
                                                        Type typeOooO0o4 = o0000O.OooO0o0(0, parameterizedType4);
                                                        if (String.class != typeOooO0o4) {
                                                            throw o0000O.OooOO0O(method2, i4, "@PartMap keys must be of type String: " + typeOooO0o4, new Object[0]);
                                                        }
                                                        Type typeOooO0o5 = o0000O.OooO0o0(1, parameterizedType4);
                                                        if (o0O000o0.OooO0OO.class.isAssignableFrom(o0000O.OooO0o(typeOooO0o5))) {
                                                            throw o0000O.OooOO0O(method2, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                        }
                                                        o000oooo2 = new o000000.OooOOO0<>(method2, i4, o0000o0o3.OooO0Oo(typeOooO0o5, annotationArr4, annotationArr2), ((PartMap) annotation).encoding());
                                                    } else if (annotation instanceof Body) {
                                                        oooO00o.OooO0OO(i4, type);
                                                        if (oooO00o.f60607OooOOOo || oooO00o.f60609OooOOo0) {
                                                            throw o0000O.OooOO0O(method2, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                        }
                                                        if (oooO00o.f60600OooO0oo) {
                                                            throw o0000O.OooOO0O(method2, i4, "Multiple @Body method annotations found.", new Object[0]);
                                                        }
                                                        try {
                                                            OooOOO<T, o0oO0Ooo> oooOOOOooO0Oo = o0000o0o3.OooO0Oo(type, annotationArr4, annotationArr2);
                                                            oooO00o.f60600OooO0oo = true;
                                                            o000oooo2 = new o000000.OooO00o<>(method2, i4, oooOOOOooO0Oo);
                                                        } catch (RuntimeException e) {
                                                            throw o0000O.OooOO0o(method2, e, i4, "Unable to create @Body converter for %s", type);
                                                        }
                                                    } else if (annotation instanceof Tag) {
                                                        oooO00o.OooO0OO(i4, type);
                                                        Class<?> clsOooO0o10 = o0000O.OooO0o(type);
                                                        for (int i11 = i4 - 1; i11 >= 0; i11--) {
                                                            o000000<?> o000000Var2 = oooO00o.f60613OooOo0O[i11];
                                                            if ((o000000Var2 instanceof o000000.o000oOoO) && ((o000000.o000oOoO) o000000Var2).f60538OooO00o.equals(clsOooO0o10)) {
                                                                throw o0000O.OooOO0O(method2, i4, "@Tag type " + clsOooO0o10.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                                                            }
                                                        }
                                                        o000oooo2 = new o000000.o000oOoO<>(clsOooO0o10);
                                                    } else {
                                                        o000ooo2 = null;
                                                    }
                                                    o000ooo2 = o000oooo2;
                                                }
                                            }
                                            o000ooo2 = oooO0OO;
                                            i3 = i7;
                                        }
                                    }
                                }
                                if (o000ooo2 != null) {
                                    if (o000000Var == null) {
                                        throw o0000O.OooOO0O(method2, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    o000000Var = o000ooo2;
                                }
                                i7 = i3 + 1;
                                annotationArr3 = annotationArr5;
                                length2 = i8;
                                i6 = i9;
                                length3 = i10;
                                str3 = str2;
                                o000000VarArr3 = o000000VarArr2;
                                z5 = z3;
                            }
                            str2 = str3;
                            o000000VarArr2 = o000000VarArr3;
                            z3 = z5;
                            i3 = i7;
                            if (o000ooo2 != null) {
                                if (o000000Var == null) {
                                    throw o0000O.OooOO0O(method2, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                o000000Var = o000ooo2;
                            }
                            i7 = i3 + 1;
                            annotationArr3 = annotationArr5;
                            length2 = i8;
                            i6 = i9;
                            length3 = i10;
                            str3 = str2;
                            o000000VarArr3 = o000000VarArr2;
                            z5 = z3;
                        }
                        annotationArr = annotationArr3;
                        i = length2;
                        z2 = z5;
                        str = str3;
                        i2 = i6;
                        o000000VarArr = o000000VarArr3;
                    } else {
                        annotationArr = annotationArr3;
                        i = length2;
                        z2 = z5;
                        str = str3;
                        i2 = i6;
                        o000000VarArr = o000000VarArr3;
                        o000000Var = null;
                    }
                    if (o000000Var == null) {
                        if (z2) {
                            try {
                                if (o0000O.OooO0o(type) == Continuation.class) {
                                    oooO00o.f60614OooOo0o = true;
                                    o000000Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw o0000O.OooOO0O(method2, i4, "No Retrofit annotation found.", new Object[0]);
                    }
                    o000000VarArr[i4] = o000000Var;
                    i4++;
                    z5 = false;
                    z4 = true;
                    annotationArr3 = annotationArr;
                    length2 = i;
                    i6 = i2;
                    str3 = str;
                }
                String str4 = str3;
                if (oooO00o.f60608OooOOo == null && !oooO00o.f60605OooOOO0) {
                    throw o0000O.OooOO0(method2, null, "Missing either @%s URL or @Url parameter.", oooO00o.f60604OooOOO);
                }
                boolean z7 = oooO00o.f60607OooOOOo;
                if (!z7 && !oooO00o.f60609OooOOo0 && !oooO00o.f60606OooOOOO && oooO00o.f60600OooO0oo) {
                    throw o0000O.OooOO0(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z7 && !oooO00o.f60597OooO0o) {
                    throw o0000O.OooOO0(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (oooO00o.f60609OooOOo0 && !oooO00o.f60599OooO0oO) {
                    throw o0000O.OooOO0(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                o0000oo o0000ooVar = new o0000oo(oooO00o);
                Type genericReturnType2 = method.getGenericReturnType();
                if (o0000O.OooO0oo(genericReturnType2)) {
                    throw o0000O.OooOO0(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw o0000O.OooOO0(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z8 = o0000ooVar.f60589OooOO0O;
                if (z8) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeOooO0o6 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeOooO0o6 instanceof WildcardType) {
                        typeOooO0o6 = ((WildcardType) typeOooO0o6).getLowerBounds()[0];
                    }
                    if (o0000O.OooO0o(typeOooO0o6) == o0000O0.class && (typeOooO0o6 instanceof ParameterizedType)) {
                        typeOooO0o6 = o0000O.OooO0o0(0, (ParameterizedType) typeOooO0o6);
                        z = true;
                    } else {
                        z = false;
                    }
                    genericReturnType = new o0000O.OooO0O0(null, OooO0O0.class, typeOooO0o6);
                    annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                }
                try {
                    OooO0OO<?, ?> oooO0OOOooO00o = o0000o0o2.OooO00o(genericReturnType, annotations);
                    Type typeResponseType = oooO0OOOooO00o.responseType();
                    if (typeResponseType == o0O00o00.class) {
                        throw o0000O.OooOO0(method, null, "'" + o0000O.OooO0o(typeResponseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeResponseType == o0000O0.class) {
                        throw o0000O.OooOO0(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (o0000ooVar.f60582OooO0OO.equals(str4) && !Void.class.equals(typeResponseType)) {
                        throw o0000O.OooOO0(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        OooOOO<o0O00oO0, T> oooOOOOooO0o0 = o0000o0o2.OooO0o0(typeResponseType, method.getAnnotations());
                        o00OO.OooO00o oooO00o2 = o0000o0o2.f60565OooO0O0;
                        if (z8) {
                            return z ? new Oooo0.OooO0OO(o0000ooVar, oooO00o2, oooOOOOooO0o0, oooO0OOOooO00o) : new Oooo0.OooO0O0(o0000ooVar, oooO00o2, oooOOOOooO0o0, oooO0OOOooO00o);
                        }
                        return new Oooo0.OooO00o(o0000ooVar, oooO00o2, oooOOOOooO0o0, oooO0OOOooO00o);
                    } catch (RuntimeException e2) {
                        throw o0000O.OooOO0(method, e2, "Unable to create converter for %s", typeResponseType);
                    }
                } catch (RuntimeException e3) {
                    throw o0000O.OooOO0(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i5];
            if (annotation2 instanceof DELETE) {
                oooO00o.OooO0O0(FirebasePerformance.HttpMethod.DELETE, ((DELETE) annotation2).value(), false);
            } else if (annotation2 instanceof GET) {
                oooO00o.OooO0O0("GET", ((GET) annotation2).value(), false);
            } else if (annotation2 instanceof HEAD) {
                oooO00o.OooO0O0("HEAD", ((HEAD) annotation2).value(), false);
            } else if (annotation2 instanceof PATCH) {
                oooO00o.OooO0O0(FirebasePerformance.HttpMethod.PATCH, ((PATCH) annotation2).value(), true);
            } else if (annotation2 instanceof POST) {
                oooO00o.OooO0O0("POST", ((POST) annotation2).value(), true);
            } else if (annotation2 instanceof PUT) {
                oooO00o.OooO0O0("PUT", ((PUT) annotation2).value(), true);
            } else if (annotation2 instanceof OPTIONS) {
                oooO00o.OooO0O0(FirebasePerformance.HttpMethod.OPTIONS, ((OPTIONS) annotation2).value(), false);
            } else if (annotation2 instanceof HTTP) {
                HTTP http = (HTTP) annotation2;
                oooO00o.OooO0O0(http.method(), http.path(), http.hasBody());
            } else if (annotation2 instanceof Headers) {
                String[] strArrValue = ((Headers) annotation2).value();
                if (strArrValue.length == 0) {
                    throw o0000O.OooOO0(method2, null, "@Headers annotation is empty.", new Object[0]);
                }
                o0O000.OooO00o oooO00o3 = new o0O000.OooO00o();
                for (String str5 : strArrValue) {
                    int iIndexOf = str5.indexOf(58);
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw o0000O.OooOO0(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Pattern pattern = o0O000Oo.f57807OooO0o0;
                            oooO00o.f60612OooOo00 = o0O000Oo.OooO00o.OooO00o(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw o0000O.OooOO0(method2, e4, "Malformed content type: %s", strTrim);
                        }
                    } else {
                        oooO00o3.OooO00o(strSubstring, strTrim);
                    }
                }
                oooO00o.f60610OooOOoo = oooO00o3.OooO0OO();
            } else if (annotation2 instanceof Multipart) {
                if (oooO00o.f60607OooOOOo) {
                    throw o0000O.OooOO0(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                oooO00o.f60609OooOOo0 = true;
            } else if (!(annotation2 instanceof FormUrlEncoded)) {
                continue;
            } else {
                if (oooO00o.f60609OooOOo0) {
                    throw o0000O.OooOO0(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                oooO00o.f60607OooOOOo = true;
            }
            i5++;
        }
    }

    @Nullable
    public abstract T OooO00o(Object[] objArr);
}
