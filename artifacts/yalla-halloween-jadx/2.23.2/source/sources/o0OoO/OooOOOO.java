package o0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.common.support.networkstate.NetworkStateUtil;
import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO implements o0OoOoOo {
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        List listListOfNotNull;
        Map mapUnmodifiableMap;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0O00O0o request = o000o.f59401OooO0o0;
        o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(request);
        if (Intrinsics.areEqual(request.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o0o00o00OooO0OO;
        }
        while (!o0o00o00OooO0OO.OooO0oO() && NetworkStateUtil.INSTANCE.isConnected(o000O00O.OooO00o())) {
            o0O000O o0o000o = request.f57828OooO00o;
            String str = o0o000o.f57792OooO0Oo;
            if (CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"}).contains(str)) {
                listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{"https://apiv2.yalla.live", "https://apiv2.ylapi.cc"});
            } else if (CollectionsKt.listOfNotNull((Object[]) new String[]{"https://moment.yalla.live", "https://moment.ylapi.cc"}).contains(str)) {
                listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{"https://moment.yalla.live", "https://moment.ylapi.cc"});
            } else if (CollectionsKt.listOfNotNull((Object[]) new String[]{"https://search.yalla.live", "https://search.ylapi.cc"}).contains(str)) {
                listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{"https://search.yalla.live", "https://search.ylapi.cc"});
            } else if (CollectionsKt.listOfNotNull((Object[]) new String[]{"https://payv2.yalla.live", "https://payv2.ylapi.cc"}).contains(str)) {
                listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{"https://payv2.yalla.live", "https://payv2.ylapi.cc"});
            } else {
                listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new String[]{"https://shop.yalla.live", "https://shop.ylapi.cc"}).contains(str) ? CollectionsKt.listOfNotNull((Object[]) new String[]{"https://shop.yalla.live", "https://shop.ylapi.cc"}) : CollectionsKt.emptyList();
            }
            int iIndexOf = listListOfNotNull.indexOf(str);
            if (iIndexOf < 0 || iIndexOf >= listListOfNotNull.size() - 1) {
                break;
            }
            o0O000O.OooO00o oooO00oOooO0o = o0o000o.OooO0o();
            oooO00oOooO0o.OooO0o((String) listListOfNotNull.get(iIndexOf + 1));
            Intrinsics.checkNotNullParameter(request, "request");
            new LinkedHashMap();
            String str2 = request.f57829OooO0O0;
            o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
            Map<Class<?>, Object> map = request.f57833OooO0o0;
            Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
            o0O000.OooO00o oooO00oOooO0Oo = request.f57830OooO0OO.OooO0Oo();
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
            o0o00o00OooO0OO = o000o.OooO0OO(new o0O00O0o(url, str2, o0o000OooO0OO, o0oo0ooo2, mapUnmodifiableMap));
        }
        return o0o00o00OooO0OO;
    }
}
