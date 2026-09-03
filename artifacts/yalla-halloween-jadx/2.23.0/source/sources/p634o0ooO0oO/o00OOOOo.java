package p634o0ooO0oO;

import com.google.firebase.perf.FirebasePerformance;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;
import p635o0ooO0oo.o0O000o0;
import p647o0ooOooo.mc;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO f57313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oo0O f57315OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final oo00oO f57316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o00O00OO f57317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f57318OooO0o0;

    public o00OOOOo(@NotNull o00OO url, @NotNull String method, @NotNull oo0O headers, @Nullable oo00oO oo00oo, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f57313OooO00o = url;
        this.f57314OooO0O0 = method;
        this.f57315OooO0OO = headers;
        this.f57316OooO0Oo = oo00oo;
        this.f57318OooO0o0 = tags;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final o00O00OO OooO00o() {
        o00O00OO o00o00oo2 = this.f57317OooO0o;
        if (o00o00oo2 != null) {
            return o00o00oo2;
        }
        o00O00OO o00o00oo3 = o00O00OO.f57155OooOOO;
        o00O00OO o00o00ooOooO0O0 = o00O00OO.OooO0O0.OooO0O0(this.f57315OooO0OO);
        this.f57317OooO0o = o00o00ooOooO0O0;
        return o00o00ooOooO0O0;
    }

    @Nullable
    public final String OooO0O0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f57315OooO0OO.OooO00o(name);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f57314OooO0O0);
        sb.append(", url=");
        sb.append(this.f57313OooO00o);
        oo0O oo0o = this.f57315OooO0OO;
        if (oo0o.f57369OooO0Oo.length / 2 != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : oo0o) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i = i2;
            }
            sb.append(']');
        }
        Map<Class<?>, Object> map = this.f57318OooO0o0;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00OO f57319OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f57320OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public oo0O.OooO00o f57321OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public oo00oO f57322OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public Map<Class<?>, Object> f57323OooO0o0;

        public OooO00o() {
            this.f57323OooO0o0 = new LinkedHashMap();
            this.f57320OooO0O0 = "GET";
            this.f57321OooO0OO = new oo0O.OooO00o();
        }

        @NotNull
        public final void OooO(@NotNull Class type, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f57323OooO0o0.remove(type);
                return;
            }
            if (this.f57323OooO0o0.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
                this.f57323OooO0o0 = linkedHashMap;
            }
            Map<Class<?>, Object> map = this.f57323OooO0o0;
            Object objCast = type.cast(obj);
            Intrinsics.checkNotNull(objCast);
            map.put(type, objCast);
        }

        @NotNull
        public final void OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f57321OooO0OO.OooO00o(name, value);
        }

        @NotNull
        public final o00OOOOo OooO0O0() {
            Map mapUnmodifiableMap;
            o00OO o00oo2 = this.f57319OooO00o;
            if (o00oo2 == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.f57320OooO0O0;
            oo0O oo0oOooO0OO = this.f57321OooO0OO.OooO0OO();
            oo00oO oo00oo = this.f57322OooO0Oo;
            Map<Class<?>, Object> map = this.f57323OooO0o0;
            byte[] bArr = o0O000o0.f57386OooO00o;
            Intrinsics.checkNotNullParameter(map, "<this>");
            if (map.isEmpty()) {
                mapUnmodifiableMap = MapsKt.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new o00OOOOo(o00oo2, str, oo0oOooO0OO, oo00oo, mapUnmodifiableMap);
        }

        @NotNull
        public final void OooO0OO(@NotNull o00O00OO cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                OooO0oo("Cache-Control");
            } else {
                OooO0Oo("Cache-Control", string);
            }
        }

        @NotNull
        public final void OooO0Oo(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            oo0O.OooO00o oooO00o = this.f57321OooO0OO;
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            oo0O.OooO0O0.OooO00o(name);
            oo0O.OooO0O0.OooO0O0(value, name);
            oooO00o.OooO0Oo(name);
            oooO00o.OooO0O0(name, value);
        }

        @NotNull
        public final void OooO0o(@NotNull String method, @Nullable oo00oO oo00oo) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (oo00oo == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (!(!(Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, FirebasePerformance.HttpMethod.PATCH) || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")))) {
                    throw new IllegalArgumentException(o000oOoO.OooO00o("method ", method, " must have a request body.").toString());
                }
            } else if (!mc.OooO00o(method)) {
                throw new IllegalArgumentException(o000oOoO.OooO00o("method ", method, " must not have a request body.").toString());
            }
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            this.f57320OooO0O0 = method;
            this.f57322OooO0Oo = oo00oo;
        }

        @NotNull
        public final void OooO0o0(@NotNull oo0O headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            oo0O.OooO00o oooO00oOooO0Oo = headers.OooO0Oo();
            Intrinsics.checkNotNullParameter(oooO00oOooO0Oo, "<set-?>");
            this.f57321OooO0OO = oooO00oOooO0Oo;
        }

        @NotNull
        public final void OooO0oO(@NotNull oo00oO body) {
            Intrinsics.checkNotNullParameter(body, "body");
            OooO0o("POST", body);
        }

        @NotNull
        public final void OooO0oo(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f57321OooO0OO.OooO0Oo(name);
        }

        @NotNull
        public final void OooOO0(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt__StringsJVMKt.startsWith(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("http:", strSubstring);
            } else if (StringsKt__StringsJVMKt.startsWith(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("https:", strSubstring2);
            }
            Intrinsics.checkNotNullParameter(url, "<this>");
            o00OO.OooO00o oooO00o = new o00OO.OooO00o();
            oooO00o.OooO0oO(null, url);
            o00OO url2 = oooO00o.OooO0OO();
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f57319OooO00o = url2;
        }

        public OooO00o(@NotNull o00OOOOo request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f57323OooO0o0 = new LinkedHashMap();
            this.f57319OooO00o = request.f57313OooO00o;
            this.f57320OooO0O0 = request.f57314OooO0O0;
            this.f57322OooO0Oo = request.f57316OooO0Oo;
            Map<Class<?>, Object> map = request.f57318OooO0o0;
            if (map.isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt.toMutableMap(map);
            }
            this.f57323OooO0o0 = mutableMap;
            this.f57321OooO0OO = request.f57315OooO0OO.OooO0Oo();
        }
    }
}
