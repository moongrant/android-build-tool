package retrofit2;

import com.qiniu.android.http.request.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.o0o0Oo;
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

/* JADX INFO: loaded from: classes4.dex */
public abstract class o000OOo<T> {
    public static <T> o000OOo<T> OooO0O0(o0O0O00 o0o0o00, Method method) throws CloneNotSupportedException {
        Type genericReturnType;
        boolean z;
        int i;
        int i2;
        o0ooOOo<?>[] o0oooooArr;
        String str;
        String str2;
        o0ooOOo<?>[] o0oooooArr2;
        o0ooOOo<?> o000oooo2;
        o0ooOOo<?> o00oo0o2;
        o0ooOOo<?> o00oo0o3;
        o0OO00O.OooO00o oooO00o = new o0OO00O.OooO00o(o0o0o00, method);
        Annotation[] annotationArr = oooO00o.f53826OooO0OO;
        int length = annotationArr.length;
        int i3 = 0;
        while (true) {
            String str3 = Request.HttpMethodHEAD;
            o0ooOOo<?> o0ooooo2 = null;
            if (i3 >= length) {
                if (oooO00o.f53835OooOOO == null) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!oooO00o.f53837OooOOOO) {
                    if (oooO00o.f53840OooOOo0) {
                        throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (oooO00o.f53838OooOOOo) {
                        throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length2 = oooO00o.f53827OooO0Oo.length;
                oooO00o.f53844OooOo0O = new o0ooOOo[length2];
                int i4 = length2 - 1;
                int i5 = 0;
                while (i5 < length2) {
                    o0ooOOo<?>[] o0oooooArr3 = oooO00o.f53844OooOo0O;
                    Type type = oooO00o.f53829OooO0o0[i5];
                    Annotation[] annotationArr2 = oooO00o.f53827OooO0Oo[i5];
                    boolean z2 = i5 == i4;
                    if (annotationArr2 != null) {
                        int length3 = annotationArr2.length;
                        int i6 = 0;
                        while (i6 < length3) {
                            Annotation annotation = annotationArr2[i6];
                            int i7 = length2;
                            int i8 = i4;
                            int i9 = length3;
                            if (annotation instanceof Url) {
                                oooO00o.OooO0OO(i5, type);
                                if (oooO00o.f53836OooOOO0) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (oooO00o.f53823OooO) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (oooO00o.f53832OooOO0) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (oooO00o.f53833OooOO0O) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (oooO00o.f53834OooOO0o) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (oooO00o.f53839OooOOo != null) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Url cannot be used with @%s URL", oooO00o.f53835OooOOO);
                                }
                                oooO00o.f53836OooOOO0 = true;
                                if (type != o00OO000.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                o000oooo2 = new o0ooOOo.Oooo0(oooO00o.f53825OooO0O0, i5);
                                o0oooooArr2 = o0oooooArr3;
                                str2 = str3;
                            } else {
                                if (annotation instanceof Path) {
                                    oooO00o.OooO0OO(i5, type);
                                    if (oooO00o.f53832OooOO0) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (oooO00o.f53833OooOO0O) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (oooO00o.f53834OooOO0o) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (oooO00o.f53836OooOOO0) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (oooO00o.f53839OooOOo == null) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Path can only be used with relative url on @%s", oooO00o.f53835OooOOO);
                                    }
                                    oooO00o.f53823OooO = true;
                                    Path path = (Path) annotation;
                                    String strValue = path.value();
                                    if (!o0OO00O.OooO00o.f53822OooOoO0.matcher(strValue).matches()) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Path parameter name must match %s. Found: %s", o0OO00O.OooO00o.f53821OooOo.pattern(), strValue);
                                    }
                                    if (!oooO00o.f53842OooOo0.contains(strValue)) {
                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "URL \"%s\" does not contain \"{%s}\".", oooO00o.f53839OooOOo, strValue);
                                    }
                                    oooO00o.f53824OooO00o.OooO0o(type, annotationArr2);
                                    o00oo0o3 = new o0ooOOo.OooOOO<>(oooO00o.f53825OooO0O0, i5, strValue, path.encoded());
                                } else if (annotation instanceof Query) {
                                    oooO00o.OooO0OO(i5, type);
                                    Query query = (Query) annotation;
                                    String strValue2 = query.value();
                                    boolean zEncoded = query.encoded();
                                    Class<?> clsOooO0o = o000000.OooO0o(type);
                                    oooO00o.f53832OooOO0 = true;
                                    if (Iterable.class.isAssignableFrom(clsOooO0o)) {
                                        if (!(type instanceof ParameterizedType)) {
                                            throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, clsOooO0o.getSimpleName() + " must include generic type (e.g., " + clsOooO0o.getSimpleName() + "<String>)", new Object[0]);
                                        }
                                        oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(0, (ParameterizedType) type), annotationArr2);
                                        o00oo0o3 = new oo000o(new o0ooOOo.OooOOOO(strValue2, zEncoded));
                                    } else if (clsOooO0o.isArray()) {
                                        oooO00o.f53824OooO00o.OooO0o(o0OO00O.OooO00o.OooO00o(clsOooO0o.getComponentType()), annotationArr2);
                                        o00oo0o3 = new o00oO0o(new o0ooOOo.OooOOOO(strValue2, zEncoded));
                                    } else {
                                        oooO00o.f53824OooO00o.OooO0o(type, annotationArr2);
                                        o00oo0o3 = new o0ooOOo.OooOOOO(strValue2, zEncoded);
                                    }
                                } else {
                                    if (annotation instanceof QueryName) {
                                        oooO00o.OooO0OO(i5, type);
                                        boolean zEncoded2 = ((QueryName) annotation).encoded();
                                        Class<?> clsOooO0o2 = o000000.OooO0o(type);
                                        oooO00o.f53833OooOO0O = true;
                                        if (Iterable.class.isAssignableFrom(clsOooO0o2)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, clsOooO0o2.getSimpleName() + " must include generic type (e.g., " + clsOooO0o2.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(0, (ParameterizedType) type), annotationArr2);
                                            o00oo0o3 = new oo000o(new o0ooOOo.OooOo(zEncoded2));
                                        } else if (clsOooO0o2.isArray()) {
                                            oooO00o.f53824OooO00o.OooO0o(o0OO00O.OooO00o.OooO00o(clsOooO0o2.getComponentType()), annotationArr2);
                                            o00oo0o3 = new o00oO0o(new o0ooOOo.OooOo(zEncoded2));
                                        } else {
                                            oooO00o.f53824OooO00o.OooO0o(type, annotationArr2);
                                            o000oooo2 = new o0ooOOo.OooOo<>(zEncoded2);
                                            str2 = str3;
                                        }
                                    } else {
                                        str2 = str3;
                                        if (annotation instanceof QueryMap) {
                                            oooO00o.OooO0OO(i5, type);
                                            Class<?> clsOooO0o3 = o000000.OooO0o(type);
                                            oooO00o.f53834OooOO0o = true;
                                            if (!Map.class.isAssignableFrom(clsOooO0o3)) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeOooO0oO = o000000.OooO0oO(type, clsOooO0o3, Map.class);
                                            if (!(typeOooO0oO instanceof ParameterizedType)) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeOooO0oO;
                                            Type typeOooO0o0 = o000000.OooO0o0(0, parameterizedType);
                                            if (String.class != typeOooO0o0) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@QueryMap keys must be of type String: " + typeOooO0o0, new Object[0]);
                                            }
                                            oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(1, parameterizedType), annotationArr2);
                                            o00oo0o3 = new o0ooOOo.OooOo00<>(oooO00o.f53825OooO0O0, i5, ((QueryMap) annotation).encoded());
                                        } else if (annotation instanceof Header) {
                                            oooO00o.OooO0OO(i5, type);
                                            String strValue3 = ((Header) annotation).value();
                                            Class<?> clsOooO0o4 = o000000.OooO0o(type);
                                            if (Iterable.class.isAssignableFrom(clsOooO0o4)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, clsOooO0o4.getSimpleName() + " must include generic type (e.g., " + clsOooO0o4.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(0, (ParameterizedType) type), annotationArr2);
                                                o00oo0o3 = new oo000o(new o0ooOOo.OooO0o(strValue3));
                                            } else if (clsOooO0o4.isArray()) {
                                                oooO00o.f53824OooO00o.OooO0o(o0OO00O.OooO00o.OooO00o(clsOooO0o4.getComponentType()), annotationArr2);
                                                o00oo0o3 = new o00oO0o(new o0ooOOo.OooO0o(strValue3));
                                            } else {
                                                oooO00o.f53824OooO00o.OooO0o(type, annotationArr2);
                                                o000oooo2 = new o0ooOOo.OooO0o<>(strValue3);
                                            }
                                        } else if (annotation instanceof HeaderMap) {
                                            if (type == o00O.class) {
                                                o00oo0o3 = new o0ooOOo.OooOO0(oooO00o.f53825OooO0O0, i5);
                                            } else {
                                                oooO00o.OooO0OO(i5, type);
                                                Class<?> clsOooO0o5 = o000000.OooO0o(type);
                                                if (!Map.class.isAssignableFrom(clsOooO0o5)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeOooO0oO2 = o000000.OooO0oO(type, clsOooO0o5, Map.class);
                                                if (!(typeOooO0oO2 instanceof ParameterizedType)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType2 = (ParameterizedType) typeOooO0oO2;
                                                Type typeOooO0o1 = o000000.OooO0o0(0, parameterizedType2);
                                                if (String.class != typeOooO0o1) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@HeaderMap keys must be of type String: " + typeOooO0o1, new Object[0]);
                                                }
                                                oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(1, parameterizedType2), annotationArr2);
                                                o00oo0o3 = new o0ooOOo.OooO<>(oooO00o.f53825OooO0O0, i5);
                                            }
                                        } else if (annotation instanceof Field) {
                                            oooO00o.OooO0OO(i5, type);
                                            if (!oooO00o.f53838OooOOOo) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            Field field = (Field) annotation;
                                            String strValue4 = field.value();
                                            boolean zEncoded3 = field.encoded();
                                            oooO00o.f53828OooO0o = true;
                                            Class<?> clsOooO0o6 = o000000.OooO0o(type);
                                            if (Iterable.class.isAssignableFrom(clsOooO0o6)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, clsOooO0o6.getSimpleName() + " must include generic type (e.g., " + clsOooO0o6.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(0, (ParameterizedType) type), annotationArr2);
                                                o00oo0o3 = new oo000o(new o0ooOOo.OooO0O0(strValue4, zEncoded3));
                                            } else if (clsOooO0o6.isArray()) {
                                                oooO00o.f53824OooO00o.OooO0o(o0OO00O.OooO00o.OooO00o(clsOooO0o6.getComponentType()), annotationArr2);
                                                o00oo0o3 = new o00oO0o(new o0ooOOo.OooO0O0(strValue4, zEncoded3));
                                            } else {
                                                oooO00o.f53824OooO00o.OooO0o(type, annotationArr2);
                                                o00oo0o3 = new o0ooOOo.OooO0O0(strValue4, zEncoded3);
                                            }
                                        } else if (annotation instanceof FieldMap) {
                                            oooO00o.OooO0OO(i5, type);
                                            if (!oooO00o.f53838OooOOOo) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                            Class<?> clsOooO0o7 = o000000.OooO0o(type);
                                            if (!Map.class.isAssignableFrom(clsOooO0o7)) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@FieldMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeOooO0oO3 = o000000.OooO0oO(type, clsOooO0o7, Map.class);
                                            if (!(typeOooO0oO3 instanceof ParameterizedType)) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType3 = (ParameterizedType) typeOooO0oO3;
                                            Type typeOooO0o2 = o000000.OooO0o0(0, parameterizedType3);
                                            if (String.class != typeOooO0o2) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@FieldMap keys must be of type String: " + typeOooO0o2, new Object[0]);
                                            }
                                            oooO00o.f53824OooO00o.OooO0o(o000000.OooO0o0(1, parameterizedType3), annotationArr2);
                                            oooO00o.f53828OooO0o = true;
                                            o00oo0o3 = new o0ooOOo.OooO0OO<>(oooO00o.f53825OooO0O0, i5, ((FieldMap) annotation).encoded());
                                        } else if (annotation instanceof Part) {
                                            oooO00o.OooO0OO(i5, type);
                                            if (!oooO00o.f53840OooOOo0) {
                                                throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                            Part part = (Part) annotation;
                                            oooO00o.f53830OooO0oO = true;
                                            String strValue5 = part.value();
                                            Class<?> clsOooO0o8 = o000000.OooO0o(type);
                                            if (!strValue5.isEmpty()) {
                                                o0oooooArr2 = o0oooooArr3;
                                                o00O o00oOooO0OO = o00O.f51229Oooo0oO.OooO0OO("Content-Disposition", OooO0o.OooO0OO.OooO00o("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", part.encoding());
                                                if (Iterable.class.isAssignableFrom(clsOooO0o8)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, clsOooO0o8.getSimpleName() + " must include generic type (e.g., " + clsOooO0o8.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    Type typeOooO0o3 = o000000.OooO0o0(0, (ParameterizedType) type);
                                                    if (o00OO0OO.OooO0OO.class.isAssignableFrom(o000000.OooO0o(typeOooO0o3))) {
                                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                    o00oo0o2 = new oo000o(new o0ooOOo.OooOO0O(oooO00o.f53825OooO0O0, i5, o00oOooO0OO, oooO00o.f53824OooO00o.OooO0Oo(typeOooO0o3, annotationArr2, oooO00o.f53826OooO0OO)));
                                                } else if (clsOooO0o8.isArray()) {
                                                    Class<?> clsOooO00o = o0OO00O.OooO00o.OooO00o(clsOooO0o8.getComponentType());
                                                    if (o00OO0OO.OooO0OO.class.isAssignableFrom(clsOooO00o)) {
                                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                    o00oo0o2 = new o00oO0o(new o0ooOOo.OooOO0O(oooO00o.f53825OooO0O0, i5, o00oOooO0OO, oooO00o.f53824OooO00o.OooO0Oo(clsOooO00o, annotationArr2, oooO00o.f53826OooO0OO)));
                                                } else {
                                                    if (o00OO0OO.OooO0OO.class.isAssignableFrom(clsOooO0o8)) {
                                                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                    o000oooo2 = new o0ooOOo.OooOO0O<>(oooO00o.f53825OooO0O0, i5, o00oOooO0OO, oooO00o.f53824OooO00o.OooO0Oo(type, annotationArr2, oooO00o.f53826OooO0OO));
                                                }
                                                o000oooo2 = o00oo0o2;
                                            } else if (Iterable.class.isAssignableFrom(clsOooO0o8)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, clsOooO0o8.getSimpleName() + " must include generic type (e.g., " + clsOooO0o8.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                if (!o00OO0OO.OooO0OO.class.isAssignableFrom(o000000.OooO0o(o000000.OooO0o0(0, (ParameterizedType) type)))) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                o000oooo2 = new oo000o(o0ooOOo.Oooo000.f53903OooO00o);
                                            } else if (clsOooO0o8.isArray()) {
                                                if (!o00OO0OO.OooO0OO.class.isAssignableFrom(clsOooO0o8.getComponentType())) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                o00oo0o3 = new o00oO0o(o0ooOOo.Oooo000.f53903OooO00o);
                                            } else {
                                                if (!o00OO0OO.OooO0OO.class.isAssignableFrom(clsOooO0o8)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                                o00oo0o3 = o0ooOOo.Oooo000.f53903OooO00o;
                                            }
                                        } else {
                                            o0oooooArr2 = o0oooooArr3;
                                            if (annotation instanceof PartMap) {
                                                oooO00o.OooO0OO(i5, type);
                                                if (!oooO00o.f53840OooOOo0) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                oooO00o.f53830OooO0oO = true;
                                                Class<?> clsOooO0o9 = o000000.OooO0o(type);
                                                if (!Map.class.isAssignableFrom(clsOooO0o9)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeOooO0oO4 = o000000.OooO0oO(type, clsOooO0o9, Map.class);
                                                if (!(typeOooO0oO4 instanceof ParameterizedType)) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeOooO0oO4;
                                                Type typeOooO0o4 = o000000.OooO0o0(0, parameterizedType4);
                                                if (String.class != typeOooO0o4) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@PartMap keys must be of type String: " + typeOooO0o4, new Object[0]);
                                                }
                                                Type typeOooO0o5 = o000000.OooO0o0(1, parameterizedType4);
                                                if (o00OO0OO.OooO0OO.class.isAssignableFrom(o000000.OooO0o(typeOooO0o5))) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                o000oooo2 = new o0ooOOo.OooOOO0<>(oooO00o.f53825OooO0O0, i5, oooO00o.f53824OooO00o.OooO0Oo(typeOooO0o5, annotationArr2, oooO00o.f53826OooO0OO), ((PartMap) annotation).encoding());
                                            } else if (annotation instanceof Body) {
                                                oooO00o.OooO0OO(i5, type);
                                                if (oooO00o.f53838OooOOOo || oooO00o.f53840OooOOo0) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (oooO00o.f53831OooO0oo) {
                                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    OooOO0<T, o0o0Oo> oooOO0OooO0Oo = oooO00o.f53824OooO00o.OooO0Oo(type, annotationArr2, oooO00o.f53826OooO0OO);
                                                    oooO00o.f53831OooO0oo = true;
                                                    o000oooo2 = new o0ooOOo.OooO00o<>(oooO00o.f53825OooO0O0, i5, oooOO0OooO0Oo);
                                                } catch (RuntimeException e) {
                                                    throw o000000.OooOO0o(oooO00o.f53825OooO0O0, e, i5, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof Tag) {
                                                oooO00o.OooO0OO(i5, type);
                                                Class<?> clsOooO0o10 = o000000.OooO0o(type);
                                                for (int i10 = i5 - 1; i10 >= 0; i10--) {
                                                    o0ooOOo<?> o0ooooo3 = oooO00o.f53844OooOo0O[i10];
                                                    if ((o0ooooo3 instanceof o0ooOOo.o000oOoO) && ((o0ooOOo.o000oOoO) o0ooooo3).f53904OooO00o.equals(clsOooO0o10)) {
                                                        Method method2 = oooO00o.f53825OooO0O0;
                                                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("@Tag type ");
                                                        sbOooO0o0.append(clsOooO0o10.getName());
                                                        sbOooO0o0.append(" is duplicate of parameter #");
                                                        sbOooO0o0.append(i10 + 1);
                                                        sbOooO0o0.append(" and would always overwrite its value.");
                                                        throw o000000.OooOO0O(method2, i5, sbOooO0o0.toString(), new Object[0]);
                                                    }
                                                }
                                                o000oooo2 = new o0ooOOo.o000oOoO<>(clsOooO0o10);
                                            } else {
                                                o000oooo2 = null;
                                            }
                                        }
                                        o000oooo2 = o00oo0o3;
                                    }
                                    o0oooooArr2 = o0oooooArr3;
                                }
                                str2 = str3;
                                o000oooo2 = o00oo0o3;
                                o0oooooArr2 = o0oooooArr3;
                            }
                            if (o000oooo2 != null) {
                                if (o0ooooo2 != null) {
                                    throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                o0ooooo2 = o000oooo2;
                            }
                            i6++;
                            length2 = i7;
                            i4 = i8;
                            length3 = i9;
                            str3 = str2;
                            o0oooooArr3 = o0oooooArr2;
                        }
                        i = length2;
                        i2 = i4;
                        o0oooooArr = o0oooooArr3;
                        str = str3;
                    } else {
                        i = length2;
                        i2 = i4;
                        o0oooooArr = o0oooooArr3;
                        str = str3;
                        o0ooooo2 = null;
                    }
                    if (o0ooooo2 == null) {
                        if (z2) {
                            try {
                                if (o000000.OooO0o(type) == Continuation.class) {
                                    oooO00o.f53845OooOo0o = true;
                                    o0ooooo2 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw o000000.OooOO0O(oooO00o.f53825OooO0O0, i5, "No Retrofit annotation found.", new Object[0]);
                    }
                    o0oooooArr[i5] = o0ooooo2;
                    i5++;
                    o0ooooo2 = null;
                    length2 = i;
                    i4 = i2;
                    str3 = str;
                }
                String str4 = str3;
                if (oooO00o.f53839OooOOo == null && !oooO00o.f53836OooOOO0) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Missing either @%s URL or @Url parameter.", oooO00o.f53835OooOOO);
                }
                boolean z3 = oooO00o.f53838OooOOOo;
                if (!z3 && !oooO00o.f53840OooOOo0 && !oooO00o.f53837OooOOOO && oooO00o.f53831OooO0oo) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z3 && !oooO00o.f53828OooO0o) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (oooO00o.f53840OooOOo0 && !oooO00o.f53830OooO0oO) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                o0OO00O o0oo00o2 = new o0OO00O(oooO00o);
                Type genericReturnType2 = method.getGenericReturnType();
                if (o000000.OooO0oo(genericReturnType2)) {
                    throw o000000.OooOO0(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw o000000.OooOO0(method, null, "Service methods cannot return void.", new Object[0]);
                }
                boolean z4 = o0oo00o2.f53820OooOO0O;
                Annotation[] annotations = method.getAnnotations();
                if (z4) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeOooO0o6 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeOooO0o6 instanceof WildcardType) {
                        typeOooO0o6 = ((WildcardType) typeOooO0o6).getLowerBounds()[0];
                    }
                    if (o000000.OooO0o(typeOooO0o6) == oo0o0Oo.class && (typeOooO0o6 instanceof ParameterizedType)) {
                        typeOooO0o6 = o000000.OooO0o0(0, (ParameterizedType) typeOooO0o6);
                        z = true;
                    } else {
                        z = false;
                    }
                    genericReturnType = new o000000.OooO0O0(null, OooO0O0.class, typeOooO0o6);
                    annotations = SkipCallbackExecutorImpl.ensurePresent(annotations);
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                }
                try {
                    OooO0OO<?, ?> oooO0OOOooO00o = o0o0o00.OooO00o(genericReturnType, annotations);
                    Type typeResponseType = oooO0OOOooO00o.responseType();
                    if (typeResponseType == o00OOOO0.class) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("'");
                        sbOooO0o1.append(o000000.OooO0o(typeResponseType).getName());
                        sbOooO0o1.append("' is not a valid response body type. Did you mean ResponseBody?");
                        throw o000000.OooOO0(method, null, sbOooO0o1.toString(), new Object[0]);
                    }
                    if (typeResponseType == oo0o0Oo.class) {
                        throw o000000.OooOO0(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (o0oo00o2.f53813OooO0OO.equals(str4) && !Void.class.equals(typeResponseType)) {
                        throw o000000.OooOO0(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        OooOO0<o00OOOOo, T> oooOO0OooO0o0 = o0o0o00.OooO0o0(typeResponseType, method.getAnnotations());
                        o0O0ooO.OooO00o oooO00o2 = o0o0o00.f53796OooO0O0;
                        if (z4) {
                            return z ? new OooOo00.OooO0OO(o0oo00o2, oooO00o2, oooOO0OooO0o0, oooO0OOOooO00o) : new OooOo00.OooO0O0(o0oo00o2, oooO00o2, oooOO0OooO0o0, oooO0OOOooO00o);
                        }
                        return new OooOo00.OooO00o(o0oo00o2, oooO00o2, oooOO0OooO0o0, oooO0OOOooO00o);
                    } catch (RuntimeException e2) {
                        throw o000000.OooOO0(method, e2, "Unable to create converter for %s", typeResponseType);
                    }
                } catch (RuntimeException e3) {
                    throw o000000.OooOO0(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i3];
            if (annotation2 instanceof DELETE) {
                oooO00o.OooO0O0("DELETE", ((DELETE) annotation2).value(), false);
            } else if (annotation2 instanceof GET) {
                oooO00o.OooO0O0(Request.HttpMethodGet, ((GET) annotation2).value(), false);
            } else if (annotation2 instanceof HEAD) {
                oooO00o.OooO0O0(Request.HttpMethodHEAD, ((HEAD) annotation2).value(), false);
            } else if (annotation2 instanceof PATCH) {
                oooO00o.OooO0O0("PATCH", ((PATCH) annotation2).value(), true);
            } else if (annotation2 instanceof POST) {
                oooO00o.OooO0O0(Request.HttpMethodPOST, ((POST) annotation2).value(), true);
            } else if (annotation2 instanceof PUT) {
                oooO00o.OooO0O0(Request.HttpMethodPUT, ((PUT) annotation2).value(), true);
            } else if (annotation2 instanceof OPTIONS) {
                oooO00o.OooO0O0("OPTIONS", ((OPTIONS) annotation2).value(), false);
            } else if (annotation2 instanceof HTTP) {
                HTTP http = (HTTP) annotation2;
                oooO00o.OooO0O0(http.method(), http.path(), http.hasBody());
            } else if (annotation2 instanceof Headers) {
                String[] strArrValue = ((Headers) annotation2).value();
                if (strArrValue.length == 0) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "@Headers annotation is empty.", new Object[0]);
                }
                o00O.OooO00o oooO00o3 = new o00O.OooO00o();
                for (String str5 : strArrValue) {
                    int iIndexOf = str5.indexOf(58);
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            oooO00o.f53843OooOo00 = o00OO0O0.OooO0O0(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw o000000.OooOO0(oooO00o.f53825OooO0O0, e4, "Malformed content type: %s", strTrim);
                        }
                    } else {
                        oooO00o3.OooO00o(strSubstring, strTrim);
                    }
                }
                oooO00o.f53841OooOOoo = oooO00o3.OooO0Oo();
            } else if (annotation2 instanceof Multipart) {
                if (oooO00o.f53838OooOOOo) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                oooO00o.f53840OooOOo0 = true;
            } else if (!(annotation2 instanceof FormUrlEncoded)) {
                continue;
            } else {
                if (oooO00o.f53840OooOOo0) {
                    throw o000000.OooOO0(oooO00o.f53825OooO0O0, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                oooO00o.f53838OooOOOo = true;
            }
            i3++;
        }
    }

    @Nullable
    public abstract T OooO00o(Object[] objArr);
}
