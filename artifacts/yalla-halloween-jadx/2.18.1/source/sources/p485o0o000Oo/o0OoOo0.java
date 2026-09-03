package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p487o0o000oO.o0OOO0o;
import p515o0o0O00.o00O00;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import p666o0oooO0o.oOo00o0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f40899OooO00o = Charset.forName(o000O0O0.OooO00o(-12042260160016L));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f40900OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f40901OooO0OO;

    public o0OoOo0() {
        String property = System.getProperty(o000O0O0.OooO00o(-12068029963792L));
        this.f40900OooO0O0 = property == null ? o000O0O0.OooO00o(-12132454473232L) : property;
        this.f40901OooO0OO = o000O0O0.OooO00o(-12141044407824L);
    }

    public final String OooO00o(String str) {
        String string;
        if (StringsKt.isBlank(str)) {
            return o000O0O0.OooO00o(-14683665047056L);
        }
        try {
            if (StringsKt.OooOoOO(str, o000O0O0.OooO00o(-14687960014352L))) {
                string = new JSONObject(str).toString(3);
                Intrinsics.checkNotNullExpressionValue(string, o000O0O0.OooO00o(-14696549948944L));
            } else if (StringsKt.OooOoOO(str, o000O0O0.OooO00o(-14915593281040L))) {
                string = new JSONArray(str).toString(3);
                Intrinsics.checkNotNullExpressionValue(string, o000O0O0.OooO00o(-14924183215632L));
            } else {
                string = str;
            }
            return StringsKt.OooOo00(string, o000O0O0.OooO00o(-15143226547728L), o000O0O0.OooO00o(-15156111449616L));
        } catch (JSONException unused) {
            return str;
        }
    }

    public final String OooO0O0(o00OOOOo o00ooooo2) throws IOException {
        if (o00ooooo2 == null) {
            return o000O0O0.OooO00o(-14486096551440L);
        }
        Intrinsics.checkNotNull(o00ooooo2);
        o0oOOo o0ooooOooO0oo = o00ooooo2.OooO0oo();
        o0ooooOooO0oo.request(Long.MAX_VALUE);
        o0oOO o0oooClone = o0ooooOooO0oo.OooO0o0().clone();
        Charset charset = this.f40899OooO00o;
        Intrinsics.checkNotNullExpressionValue(charset, o000O0O0.OooO00o(-14490391518736L));
        return o0oooClone.OooooO0(charset);
    }

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) throws IOException {
        o00OO0O0 o00oo0o0OooO0o;
        String strOooO00o;
        Map tags;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-12175404146192L));
        if (o0OOO0o.OooO0OO()) {
            oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
            return ooo00o0o.OooO0O0(ooo00o0o.f51883OooO0o);
        }
        oOo00o0o ooo00o0o2 = (oOo00o0o) oooO00o;
        o00OOO00 request = ooo00o0o2.f51883OooO0o;
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(o000O0O0.OooO00o(-12201173949968L));
        sb.append(o000O0O0.OooO00o(-12252713557520L));
        sb.append(o000O0O0.OooO00o(-12613490810384L) + request.f51425OooO0O0 + '\n');
        sb.append(o000O0O0.OooO00o(-12647850548752L) + request.f51426OooO0OO + '\n');
        sb.append(o000O0O0.OooO00o(-12695095189008L));
        int length = request.f51427OooO0Oo.f51230Oooo0o.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(o000O0O0.OooO00o(-12746634796560L) + request.f51427OooO0Oo.OooO0O0(i) + ':' + request.f51427OooO0Oo.OooO0o0(i) + '\n');
        }
        if (request.f51429OooO0o0 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o000O0O0.OooO00o(-12772404600336L));
            try {
                Intrinsics.checkNotNullParameter(request, "request");
                new LinkedHashMap();
                o00OO000 url = request.f51425OooO0O0;
                String method = request.f51426OooO0OO;
                o0o0Oo o0o0oo = request.f51429OooO0o0;
                Map toImmutableMap = request.f51428OooO0o.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(request.f51428OooO0o);
                o00O.OooO00o oooO00oOooO0OO = request.f51427OooO0Oo.OooO0OO();
                if (url == null) {
                    throw new IllegalStateException("url == null".toString());
                }
                o00O headers = oooO00oOooO0OO.OooO0Oo();
                byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
                Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
                if (toImmutableMap.isEmpty()) {
                    tags = MapsKt.emptyMap();
                } else {
                    tags = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                    Intrinsics.checkNotNullExpressionValue(tags, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(tags, "tags");
                o0oOO o0ooo2 = new o0oOO();
                if (o0o0oo == null) {
                    strOooO00o = o000O0O0.OooO00o(-14537636158992L);
                } else {
                    o0o0oo.writeTo(o0ooo2);
                    strOooO00o = OooO00o(o0ooo2.Oooo0o());
                }
                sb2.append(strOooO00o);
                sb2.append('\n');
                sb.append(sb2.toString());
            } catch (IOException e) {
                strOooO00o = o000O0O0.OooO00o(-14541931126288L) + e.getMessage() + o000O0O0.OooO00o(-14584880799248L);
            }
        }
        sb.append(o000O0O0.OooO00o(-12841124077072L));
        o00O00.OooO0OO(this.f40901OooO0OO, sb.toString());
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o2.OooO0O0(request);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sb3 = new StringBuilder(o000O0O0.OooO00o(-13206196297232L));
        sb3.append(o000O0O0.OooO00o(-13257735904784L));
        sb3.append(o000O0O0.OooO00o(-13614218190352L) + request.f51425OooO0O0 + '\n');
        sb3.append(o000O0O0.OooO00o(-13648577928720L) + o00oooo0OooO0O0.OooO0Oo() + o000O0O0.OooO00o(-13717297405456L) + jCurrentTimeMillis2 + o000O0O0.OooO00o(-13790311849488L));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(o000O0O0.OooO00o(-13807491718672L));
        sb4.append(o00oooo0OooO0O0.f51443OoooO00);
        sb4.append('\n');
        sb3.append(sb4.toString());
        if (o00oooo0OooO0O0.OooO0Oo()) {
            sb3.append(o000O0O0.OooO00o(-13914865901072L));
            o00OOOOo o00ooooo2 = o00oooo0OooO0O0.f51441OoooO;
            String str = null;
            if (o00ooooo2 != null && (o00oo0o0OooO0o = o00ooooo2.OooO0o()) != null) {
                str = o00oo0o0OooO0o.f51404OooO0OO;
            }
            if (str != null && (StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-14597765701136L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-14619240537616L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-14636420406800L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-14662190210576L), false, 2, (Object) null))) {
                Iterator<T> it = new Regex(this.f40900OooO0O0).split(OooO00o(OooO0O0(o00oooo0OooO0O0.f51441OoooO)), 0).iterator();
                while (it.hasNext()) {
                    sb3.append(o000O0O0.OooO00o(-13953520606736L) + ((String) it.next()) + '\n');
                }
            } else {
                sb3.append(o000O0O0.OooO00o(-13966405508624L));
            }
        } else {
            sb3.append(o000O0O0.OooO00o(-13876211195408L) + OooO0O0(o00oooo0OooO0O0.f51441OoooO) + '\n');
        }
        sb3.append(o000O0O0.OooO00o(-14030830018064L));
        o00O00.OooO0OO(this.f40901OooO0OO, sb3.toString());
        String logTag = this.f40901OooO0OO;
        String logResult = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(logResult, o000O0O0.OooO00o(-14395902238224L));
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(logResult, "logResult");
        if (logResult.length() > 3900) {
            o00O00.OooO0oo(logTag, "\n超长日志 \n" + logResult);
        }
        return o00oooo0OooO0O0;
    }
}
