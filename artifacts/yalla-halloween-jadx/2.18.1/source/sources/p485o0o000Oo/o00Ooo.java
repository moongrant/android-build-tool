package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.NetworkUtil;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0o0Oo;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) throws IOException {
        List listListOfNotNull;
        Map mapUnmodifiableMap;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-17093141700112L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 request = ooo00o0o.f51883OooO0o;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(request);
        if (Intrinsics.areEqual(request.OooO0O0(o000O0O0.OooO00o(-17118911503888L)), o000O0O0.OooO00o(-17148976274960L))) {
            return o00oooo0OooO0O0;
        }
        while (!o00oooo0OooO0O0.OooO0Oo() && NetworkUtil.f20498OooO00o.OooO0O0()) {
            String str = request.f51425OooO0O0.f51387OooO0o0;
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
            o00OO000.OooO00o oooO00oOooO0o = request.f51425OooO0O0.OooO0o();
            oooO00oOooO0o.OooO0o((String) listListOfNotNull.get(iIndexOf + 1));
            Intrinsics.checkNotNullParameter(request, "request");
            new LinkedHashMap();
            String str2 = request.f51426OooO0OO;
            o0o0Oo o0o0oo = request.f51429OooO0o0;
            Map toImmutableMap = request.f51428OooO0o.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(request.f51428OooO0o);
            o00O.OooO00o oooO00oOooO0OO = request.f51427OooO0Oo.OooO0OO();
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
            o00oooo0OooO0O0 = ooo00o0o.OooO0O0(new o00OOO00(url, str2, o00oOooO0Oo, o0o0oo, mapUnmodifiableMap));
        }
        return o00oooo0OooO0O0;
    }
}
