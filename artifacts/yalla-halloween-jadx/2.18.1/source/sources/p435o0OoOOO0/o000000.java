package p435o0OoOOO0;

import com.qiniu.android.http.request.Request;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OooO0O0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p433o0OoOO0o.o0O00OO;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0o0Oo;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O00OO<? extends TwitterAuthToken> f39971OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TwitterAuthConfig f39972OooO0O0;

    public o000000(o0O00OO<? extends TwitterAuthToken> o0o00oo2, TwitterAuthConfig twitterAuthConfig) {
        this.f39971OooO00o = o0o00oo2;
        this.f39972OooO0O0 = twitterAuthConfig;
    }

    @Override // p660o0ooo0o0.o00OO00O
    public final o00OOOO0 intercept(o00OO00O.OooO00o oooO00o) throws IOException {
        Map mapUnmodifiableMap;
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 request = ooo00o0o.f51883OooO0o;
        Intrinsics.checkNotNullParameter(request, "request");
        new LinkedHashMap();
        o00OO000 o00oo001 = request.f51425OooO0O0;
        String str = request.f51426OooO0OO;
        o0o0Oo o0o0oo = request.f51429OooO0o0;
        Map toImmutableMap = request.f51428OooO0o.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(request.f51428OooO0o);
        o00O.OooO00o oooO00oOooO0OO = request.f51427OooO0Oo.OooO0OO();
        o00OO000 o00oo002 = request.f51425OooO0O0;
        o00OO000.OooO00o oooO00oOooO0o = o00oo002.OooO0o();
        oooO00oOooO0o.f51397OooO0oO = null;
        List<String> list = o00oo002.f51389OooO0oo;
        int size = list != null ? list.size() / 2 : 0;
        for (int i = 0; i < size; i++) {
            oooO00oOooO0o.OooO00o(o00000.OooO0O0(o00oo002.OooO(i)), o00000.OooO0O0(o00oo002.OooOO0(i)));
        }
        o00OO000 url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        o00O o00oOooO0Oo = oooO00oOooO0OO.OooO0Oo();
        byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
        Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            mapUnmodifiableMap = MapsKt.emptyMap();
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        }
        o00OOO00 o00ooo01 = new o00OOO00(url, str, o00oOooO0Oo, o0o0oo, mapUnmodifiableMap);
        o00OOO00.OooO00o oooO00o2 = new o00OOO00.OooO00o(o00ooo01);
        TwitterAuthConfig twitterAuthConfig = this.f39972OooO0O0;
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) this.f39971OooO00o.OooO00o();
        String str2 = o00ooo01.f51426OooO0OO;
        String str3 = o00ooo01.f51425OooO0O0.f51390OooOO0;
        HashMap map = new HashMap();
        if (Request.HttpMethodPOST.equals(o00ooo01.f51426OooO0OO.toUpperCase(Locale.US))) {
            o0o0Oo o0o0oo2 = o00ooo01.f51429OooO0o0;
            if (o0o0oo2 instanceof o00O0OO) {
                o00O0OO o00o0oo2 = (o00O0OO) o0o0oo2;
                for (int i2 = 0; i2 < o00o0oo2.size(); i2++) {
                    map.put(o00o0oo2.f51309OooO00o.get(i2), o00o0oo2.OooO0O0(i2));
                }
            }
        }
        oooO00o2.OooO0o0("Authorization", new OooO0O0(twitterAuthConfig, twitterAuthToken, null, str2, str3, map).OooO0O0());
        return ooo00o0o.OooO0O0(oooO00o2.OooO0O0());
    }
}
