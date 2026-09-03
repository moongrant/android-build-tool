package p424o0OoO0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
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
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O implements o00OOO00 {
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        List listListOfNotNull;
        Map mapUnmodifiableMap;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        o00OOOOo request = ncVar.f59720OooO0o0;
        o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(request);
        if (Intrinsics.areEqual(request.OooO0O0("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return o0ooooOooO0O0;
        }
        while (!o0ooooOooO0O0.OooO0oO() && NetworkStateUtil.INSTANCE.isConnected(o000O0.OooO00o())) {
            o00OO o00oo2 = request.f57313OooO00o;
            String str = o00oo2.f57206OooO0Oo;
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
            o00OO.OooO00o oooO00oOooO0o = o00oo2.OooO0o();
            oooO00oOooO0o.OooO0o((String) listListOfNotNull.get(iIndexOf + 1));
            Intrinsics.checkNotNullParameter(request, "request");
            new LinkedHashMap();
            String str2 = request.f57314OooO0O0;
            oo00oO oo00oo = request.f57316OooO0Oo;
            Map<Class<?>, Object> map = request.f57318OooO0o0;
            Map linkedHashMap = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
            oo0O.OooO00o oooO00oOooO0Oo = request.f57315OooO0OO.OooO0Oo();
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
            o0ooooOooO0O0 = ncVar.OooO0O0(new o00OOOOo(url, str2, oo0oOooO0OO, oo00oo, mapUnmodifiableMap));
        }
        return o0ooooOooO0O0;
    }
}
