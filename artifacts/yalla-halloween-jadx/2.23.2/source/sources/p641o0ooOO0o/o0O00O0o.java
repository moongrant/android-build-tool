package p641o0ooOO0o;

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
import p648o0ooOoo.oO000o00;
import p654o0ooo00o.o000O0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O000O f57828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f57829OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0O000 f57830OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0oO0Ooo f57831OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public oo0O f57832OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f57833OooO0o0;

    public o0O00O0o(@NotNull o0O000O url, @NotNull String method, @NotNull o0O000 headers, @Nullable o0oO0Ooo o0oo0ooo2, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f57828OooO00o = url;
        this.f57829OooO0O0 = method;
        this.f57830OooO0OO = headers;
        this.f57831OooO0Oo = o0oo0ooo2;
        this.f57833OooO0o0 = tags;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final oo0O OooO00o() {
        oo0O oo0o = this.f57832OooO0o;
        if (oo0o != null) {
            return oo0o;
        }
        oo0O oo0o2 = oo0O.f57969OooOOO;
        oo0O oo0oOooO0O0 = oo0O.OooO0O0.OooO0O0(this.f57830OooO0OO);
        this.f57832OooO0o = oo0oOooO0O0;
        return oo0oOooO0O0;
    }

    @Nullable
    public final String OooO0O0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f57830OooO0OO.OooO00o(name);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f57829OooO0O0);
        sb.append(", url=");
        sb.append(this.f57828OooO00o);
        o0O000 o0o001 = this.f57830OooO0OO;
        if (o0o001.f57773OooO0Oo.length / 2 != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : o0o001) {
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
        Map<Class<?>, Object> map = this.f57833OooO0o0;
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
        public o0O000O f57834OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f57835OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public o0O000.OooO00o f57836OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o0oO0Ooo f57837OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public Map<Class<?>, Object> f57838OooO0o0;

        public OooO00o() {
            this.f57838OooO0o0 = new LinkedHashMap();
            this.f57835OooO0O0 = "GET";
            this.f57836OooO0OO = new o0O000.OooO00o();
        }

        @NotNull
        public final void OooO(@NotNull Class type, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f57838OooO0o0.remove(type);
                return;
            }
            if (this.f57838OooO0o0.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
                this.f57838OooO0o0 = linkedHashMap;
            }
            Map<Class<?>, Object> map = this.f57838OooO0o0;
            Object objCast = type.cast(obj);
            Intrinsics.checkNotNull(objCast);
            map.put(type, objCast);
        }

        @NotNull
        public final void OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f57836OooO0OO.OooO00o(name, value);
        }

        @NotNull
        public final o0O00O0o OooO0O0() {
            Map mapUnmodifiableMap;
            o0O000O o0o000o = this.f57834OooO00o;
            if (o0o000o == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.f57835OooO0O0;
            o0O000 o0o000OooO0OO = this.f57836OooO0OO.OooO0OO();
            o0oO0Ooo o0oo0ooo2 = this.f57837OooO0Oo;
            Map<Class<?>, Object> map = this.f57838OooO0o0;
            byte[] bArr = oO000o00.f58124OooO00o;
            Intrinsics.checkNotNullParameter(map, "<this>");
            if (map.isEmpty()) {
                mapUnmodifiableMap = MapsKt.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new o0O00O0o(o0o000o, str, o0o000OooO0OO, o0oo0ooo2, mapUnmodifiableMap);
        }

        @NotNull
        public final void OooO0OO(@NotNull oo0O cacheControl) {
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
            o0O000.OooO00o oooO00o = this.f57836OooO0OO;
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            o0O000.OooO0O0.OooO00o(name);
            o0O000.OooO0O0.OooO0O0(value, name);
            oooO00o.OooO0Oo(name);
            oooO00o.OooO0O0(name, value);
        }

        @NotNull
        public final void OooO0o(@NotNull String method, @Nullable o0oO0Ooo o0oo0ooo2) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (o0oo0ooo2 == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (!(!(Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, FirebasePerformance.HttpMethod.PATCH) || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")))) {
                    throw new IllegalArgumentException(o000oOoO.OooO0O0("method ", method, " must have a request body.").toString());
                }
            } else if (!o000O0O0.OooO00o(method)) {
                throw new IllegalArgumentException(o000oOoO.OooO0O0("method ", method, " must not have a request body.").toString());
            }
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            this.f57835OooO0O0 = method;
            this.f57837OooO0Oo = o0oo0ooo2;
        }

        @NotNull
        public final void OooO0o0(@NotNull o0O000 headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            o0O000.OooO00o oooO00oOooO0Oo = headers.OooO0Oo();
            Intrinsics.checkNotNullParameter(oooO00oOooO0Oo, "<set-?>");
            this.f57836OooO0OO = oooO00oOooO0Oo;
        }

        @NotNull
        public final void OooO0oO(@NotNull o0oO0Ooo body) {
            Intrinsics.checkNotNullParameter(body, "body");
            OooO0o("POST", body);
        }

        @NotNull
        public final void OooO0oo(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f57836OooO0OO.OooO0Oo(name);
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
            o0O000O.OooO00o oooO00o = new o0O000O.OooO00o();
            oooO00o.OooO0oO(null, url);
            o0O000O url2 = oooO00o.OooO0OO();
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f57834OooO00o = url2;
        }

        public OooO00o(@NotNull o0O00O0o request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f57838OooO0o0 = new LinkedHashMap();
            this.f57834OooO00o = request.f57828OooO00o;
            this.f57835OooO0O0 = request.f57829OooO0O0;
            this.f57837OooO0Oo = request.f57831OooO0Oo;
            Map<Class<?>, Object> map = request.f57833OooO0o0;
            if (map.isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt.toMutableMap(map);
            }
            this.f57838OooO0o0 = mutableMap;
            this.f57836OooO0OO = request.f57830OooO0OO.OooO0Oo();
        }
    }
}
