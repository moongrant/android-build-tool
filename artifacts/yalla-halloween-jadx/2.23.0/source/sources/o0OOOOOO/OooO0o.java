package o0OOOOOO;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o0OoOo0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<? extends TwitterAuthToken> f43655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TwitterAuthConfig f43656OooO0O0;

    public OooO0o(o0OoOo0<? extends TwitterAuthToken> o0oooo0, TwitterAuthConfig twitterAuthConfig) {
        this.f43655OooO00o = o0oooo0;
        this.f43656OooO0O0 = twitterAuthConfig;
    }

    @Override // p634o0ooO0oO.o00OOO00
    public final o0oOOo intercept(o00OOO00.OooO00o oooO00o) throws IOException {
        Map mapUnmodifiableMap;
        nc ncVar = (nc) oooO00o;
        o00OOOOo request = ncVar.f59720OooO0o0;
        request.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        new LinkedHashMap();
        String str = request.f57314OooO0O0;
        oo00oO oo00oo = request.f57316OooO0Oo;
        Map<Class<?>, Object> map = request.f57318OooO0o0;
        Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        oo0O.OooO00o oooO00oOooO0Oo = request.f57315OooO0OO.OooO0Oo();
        o00OO o00oo2 = request.f57313OooO00o;
        o00OO.OooO00o oooO00oOooO0o = o00oo2.OooO0o();
        oooO00oOooO0o.f57218OooO0oO = null;
        List<String> list = o00oo2.f57209OooO0oO;
        int size = list != null ? list.size() / 2 : 0;
        for (int i = 0; i < size; i++) {
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            int i2 = i * 2;
            String str2 = list.get(i2);
            Intrinsics.checkNotNull(str2);
            String strOooO0O0 = OooOO0.OooO0O0(str2);
            if (list == null) {
                throw new IndexOutOfBoundsException();
            }
            oooO00oOooO0o.OooO00o(strOooO0O0, OooOO0.OooO0O0(list.get(i2 + 1)));
        }
        o00OO url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        oo0O oo0oOooO0OO = oooO00oOooO0Oo.OooO0OO();
        byte[] bArr = o0O000o0.f57386OooO00o;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            mapUnmodifiableMap = MapsKt.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        o00OOOOo o00ooooo2 = new o00OOOOo(url, str, oo0oOooO0OO, oo00oo, mapUnmodifiableMap);
        o00OOOOo.OooO00o oooO00o2 = new o00OOOOo.OooO00o(o00ooooo2);
        TwitterAuthConfig twitterAuthConfig = this.f43656OooO0O0;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) this.f43655OooO00o.OooO00o();
        String str3 = o00ooooo2.f57314OooO0O0;
        String str4 = o00ooooo2.f57313OooO00o.f57202OooO;
        HashMap map2 = new HashMap();
        if ("POST".equals(o00ooooo2.f57314OooO0O0.toUpperCase(Locale.US))) {
            oo00oO oo00oo2 = o00ooooo2.f57316OooO0Oo;
            if (oo00oo2 instanceof o00OO0O0) {
                o00OO0O0 o00oo0o1 = (o00OO0O0) oo00oo2;
                for (int i3 = 0; i3 < o00oo0o1.f57222OooO00o.size(); i3++) {
                    map2.put(o00oo0o1.f57222OooO00o.get(i3), o00oo0o1.OooO00o(i3));
                }
            }
        }
        oooO00o2.OooO0Oo("Authorization", com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(twitterAuthConfig, twitterAuthToken, null, str3, str4, map2));
        return ncVar.OooO0O0(oooO00o2.OooO0O0());
    }
}
