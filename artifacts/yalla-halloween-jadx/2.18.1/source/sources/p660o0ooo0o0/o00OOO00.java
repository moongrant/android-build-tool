package p660o0ooo0o0;

import OooO0o.OooO0OO;
import com.qiniu.android.http.request.Request;
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
import p666o0oooO0o.oO00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0000 f51424OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO000 f51425OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f51426OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O f51427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Map<Class<?>, Object> f51428OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o0o0Oo f51429OooO0o0;

    public o00OOO00(@NotNull o00OO000 url, @NotNull String method, @NotNull o00O headers, @Nullable o0o0Oo o0o0oo, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f51425OooO0O0 = url;
        this.f51426OooO0OO = method;
        this.f51427OooO0Oo = headers;
        this.f51429OooO0o0 = o0o0oo;
        this.f51428OooO0o = tags;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final o00O0000 OooO00o() {
        o00O0000 o00o0001 = this.f51424OooO00o;
        if (o00o0001 != null) {
            return o00o0001;
        }
        o00O0000 o00o0000OooO0O0 = o00O0000.f51263OooOOOo.OooO0O0(this.f51427OooO0Oo);
        this.f51424OooO00o = o00o0000OooO0O0;
        return o00o0000OooO0O0;
    }

    @Nullable
    public final String OooO0O0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f51427OooO0Oo.OooO00o(name);
    }

    @Nullable
    public final Object OooO0OO() {
        Intrinsics.checkNotNullParameter(Object.class, "type");
        return Object.class.cast(this.f51428OooO0o.get(Object.class));
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Request{method=");
        sbOooO0o0.append(this.f51426OooO0OO);
        sbOooO0o0.append(", url=");
        sbOooO0o0.append(this.f51425OooO0O0);
        if (this.f51427OooO0Oo.f51230Oooo0o.length / 2 != 0) {
            sbOooO0o0.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : this.f51427OooO0Oo) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i > 0) {
                    sbOooO0o0.append(", ");
                }
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, strComponent1, ':', strComponent2);
                i = i2;
            }
            sbOooO0o0.append(']');
        }
        if (!this.f51428OooO0o.isEmpty()) {
            sbOooO0o0.append(", tags=");
            sbOooO0o0.append(this.f51428OooO0o);
        }
        sbOooO0o0.append('}');
        String string = sbOooO0o0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o00OO000 f51430OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public String f51431OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public o00O.OooO00o f51432OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o0o0Oo f51433OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public Map<Class<?>, Object> f51434OooO0o0;

        public OooO00o() {
            this.f51434OooO0o0 = new LinkedHashMap();
            this.f51431OooO0O0 = Request.HttpMethodGet;
            this.f51432OooO0OO = new o00O.OooO00o();
        }

        @NotNull
        public final OooO00o OooO(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f51432OooO0OO.OooO0o(name);
            return this;
        }

        @NotNull
        public final OooO00o OooO00o(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f51432OooO0OO.OooO00o(name, value);
            return this;
        }

        @NotNull
        public final o00OOO00 OooO0O0() {
            Map mapUnmodifiableMap;
            o00OO000 o00oo001 = this.f51430OooO00o;
            if (o00oo001 == null) {
                throw new IllegalStateException("url == null".toString());
            }
            String str = this.f51431OooO0O0;
            o00O o00oOooO0Oo = this.f51432OooO0OO.OooO0Oo();
            o0o0Oo o0o0oo = this.f51433OooO0Oo;
            Map<Class<?>, Object> toImmutableMap = this.f51434OooO0o0;
            byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
            Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
            if (toImmutableMap.isEmpty()) {
                mapUnmodifiableMap = MapsKt.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
            }
            return new o00OOO00(o00oo001, str, o00oOooO0Oo, o0o0oo, mapUnmodifiableMap);
        }

        @NotNull
        public final OooO00o OooO0OO(@NotNull o00O0000 cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                OooO("Cache-Control");
            } else {
                OooO0o0("Cache-Control", string);
            }
            return this;
        }

        @NotNull
        public final OooO00o OooO0Oo() {
            OooO0oO(Request.HttpMethodGet, null);
            return this;
        }

        @NotNull
        public final OooO00o OooO0o(@NotNull o00O headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f51432OooO0OO = headers.OooO0OO();
            return this;
        }

        @NotNull
        public final OooO00o OooO0o0(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f51432OooO0OO.OooO0oO(name, value);
            return this;
        }

        @NotNull
        public final OooO00o OooO0oO(@NotNull String method, @Nullable o0o0Oo o0o0oo) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (o0o0oo == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (!(!(Intrinsics.areEqual(method, Request.HttpMethodPOST) || Intrinsics.areEqual(method, Request.HttpMethodPUT) || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")))) {
                    throw new IllegalArgumentException(OooO0OO.OooO00o("method ", method, " must have a request body.").toString());
                }
            } else if (!oO00o0.OooO00o(method)) {
                throw new IllegalArgumentException(OooO0OO.OooO00o("method ", method, " must not have a request body.").toString());
            }
            this.f51431OooO0O0 = method;
            this.f51433OooO0Oo = o0o0oo;
            return this;
        }

        @NotNull
        public final OooO00o OooO0oo(@NotNull o0o0Oo body) {
            Intrinsics.checkNotNullParameter(body, "body");
            OooO0oO(Request.HttpMethodPOST, body);
            return this;
        }

        @NotNull
        public final <T> OooO00o OooOO0(@NotNull Class<? super T> type, @Nullable T t) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (t == null) {
                this.f51434OooO0o0.remove(type);
            } else {
                if (this.f51434OooO0o0.isEmpty()) {
                    this.f51434OooO0o0 = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f51434OooO0o0;
                T tCast = type.cast(t);
                Intrinsics.checkNotNull(tCast);
                map.put(type, tCast);
            }
            return this;
        }

        @NotNull
        public final OooO00o OooOO0O(@Nullable Object obj) {
            OooOO0(Object.class, obj);
            return this;
        }

        @NotNull
        public final OooO00o OooOO0o(@NotNull String toHttpUrl) {
            Intrinsics.checkNotNullParameter(toHttpUrl, "url");
            if (StringsKt__StringsJVMKt.startsWith(toHttpUrl, "ws:", true)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("http:");
                String strSubstring = toHttpUrl.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sbOooO0o0.append(strSubstring);
                toHttpUrl = sbOooO0o0.toString();
            } else if (StringsKt__StringsJVMKt.startsWith(toHttpUrl, "wss:", true)) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("https:");
                String strSubstring2 = toHttpUrl.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                sbOooO0o1.append(strSubstring2);
                toHttpUrl = sbOooO0o1.toString();
            }
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            o00OO000.OooO00o oooO00o = new o00OO000.OooO00o();
            oooO00o.OooO0oO(null, toHttpUrl);
            o00OO000 url = oooO00o.OooO0OO();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f51430OooO00o = url;
            return this;
        }

        @NotNull
        public final OooO00o OooOOO0(@NotNull o00OO000 url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f51430OooO00o = url;
            return this;
        }

        public OooO00o(@NotNull o00OOO00 request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f51434OooO0o0 = new LinkedHashMap();
            this.f51430OooO00o = request.f51425OooO0O0;
            this.f51431OooO0O0 = request.f51426OooO0OO;
            this.f51433OooO0Oo = request.f51429OooO0o0;
            if (request.f51428OooO0o.isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt.toMutableMap(request.f51428OooO0o);
            }
            this.f51434OooO0o0 = mutableMap;
            this.f51432OooO0OO = request.f51427OooO0Oo.OooO0OO();
        }
    }
}
