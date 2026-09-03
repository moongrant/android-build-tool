package p347o0OOOOOo;

import com.google.gson.internal.OooO;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o000oOoO;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p257o00ooOOo.o0OOO0;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO<? extends TwitterAuthToken> f42844OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TwitterAuthConfig f42845OooO0O0;

    public o0OoOo0(o000oOoO<? extends TwitterAuthToken> o000oooo2, TwitterAuthConfig twitterAuthConfig) {
        this.f42844OooO00o = o000oooo2;
        this.f42845OooO0O0 = twitterAuthConfig;
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    public final o0O00o00 intercept(o0OoOoOo.OooO00o oooO00o) throws IOException {
        Map mapUnmodifiableMap;
        o000O o000o = (o000O) oooO00o;
        o0O00O0o request = o000o.f59401OooO0o0;
        request.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        new LinkedHashMap();
        String str = request.f57829OooO0O0;
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        Map<Class<?>, Object> map = request.f57833OooO0o0;
        Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        o0O000.OooO00o oooO00oOooO0Oo = request.f57830OooO0OO.OooO0Oo();
        o0O000O o0o000o = request.f57828OooO00o;
        o0O000O.OooO00o oooO00oOooO0o = o0o000o.OooO0o();
        oooO00oOooO0o.f57804OooO0oO = null;
        List<String> list = o0o000o.f57795OooO0oO;
        int size = list != null ? list.size() / 2 : 0;
        for (int i = 0; i < size; i++) {
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            int i2 = i * 2;
            String str2 = list.get(i2);
            Intrinsics.checkNotNull(str2);
            String strOooO0Oo = OooO.OooO0Oo(str2);
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            oooO00oOooO0o.OooO00o(strOooO0Oo, OooO.OooO0Oo(list.get(i2 + 1)));
        }
        o0O000O url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        o0O000 o0o000OooO0OO = oooO00oOooO0Oo.OooO0OO();
        byte[] bArr = oO000o00.f58124OooO00o;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = MapsKt.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        o0O00O0o o0o00o0o = new o0O00O0o(url, str, o0o000OooO0OO, o0oo0ooo2, mapUnmodifiableMap);
        o0O00O0o.OooO00o oooO00o2 = new o0O00O0o.OooO00o(o0o00o0o);
        TwitterAuthConfig twitterAuthConfig = this.f42845OooO0O0;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) this.f42844OooO00o.OooO00o();
        String str3 = o0o00o0o.f57829OooO0O0;
        String str4 = o0o00o0o.f57828OooO00o.f57788OooO;
        HashMap map2 = new HashMap();
        if ("POST".equals(o0o00o0o.f57829OooO0O0.toUpperCase(Locale.US))) {
            o0oO0Ooo o0oo0ooo3 = o0o00o0o.f57831OooO0Oo;
            if (o0oo0ooo3 instanceof o0O00000) {
                o0O00000 o0o00000 = (o0O00000) o0oo0ooo3;
                for (int i3 = 0; i3 < o0o00000.f57776OooO00o.size(); i3++) {
                    map2.put(o0o00000.f57776OooO00o.get(i3), o0o00000.OooO00o(i3));
                }
            }
        }
        oooO00o2.OooO0Oo("Authorization", o0OOO0.OooO0OO(twitterAuthConfig, twitterAuthToken, null, str3, str4, map2));
        return o000o.OooO0OO(oooO00o2.OooO0O0());
    }
}
