package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apollo.Apollo;
import com.common.support.zeus.SV2;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.common.manager.googlepay.GooglePaySignOrMd5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.OooOOOO;
import p424o0OoO00O.o00Oo0;
import p424o0OoO00O.o00Ooo;
import p487o0o000oO.o00oO0o;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000000O;
import p516o0o0O000.o0OoOo0;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0o0Oo;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f40895OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static String f40896OooO0O0;

    public static final class OooO00o {
        @NotNull
        public final o00Ooo OooO00o(@NotNull String data) {
            Intrinsics.checkNotNullParameter(data, o000O0O0.OooO00o(-11294935850512L));
            String securityCheckResult = o000oOoO.f40896OooO0O0;
            if (securityCheckResult == null) {
                Intrinsics.checkNotNullParameter(data, "data");
                byte[] bytes = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                o00Oo0 o00oo1 = new o00Oo0(SV2.INSTANCE);
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strOooOo00 = StringsKt.OooOo00(string, "-", "");
                return new o00Ooo("2.0_2_" + ((String) o00oo1.invoke(bytes, strOooOo00)), strOooOo00, System.currentTimeMillis(), null);
            }
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(securityCheckResult, "securityCheckResult");
            Charset charset = Charsets.UTF_8;
            byte[] data2 = data.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(data2, "this as java.lang.String).getBytes(charset)");
            byte[] securityCheckResult2 = securityCheckResult.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(securityCheckResult2, "this as java.lang.String).getBytes(charset)");
            Intrinsics.checkNotNullParameter(data2, "data");
            Intrinsics.checkNotNullParameter(securityCheckResult2, "securityCheckResult");
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
            String strOooOo01 = StringsKt.OooOo00(string2, "-", "");
            SV2 sv2 = SV2.INSTANCE;
            return new o00Ooo("2.0_3_" + sv2.a3(data2, strOooOo01), strOooOo01, System.currentTimeMillis(), sv2.a4(securityCheckResult2, strOooOo01));
        }
    }

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) {
        String string;
        Set<String> setUnmodifiableSet;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-11325000621584L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        if (Intrinsics.areEqual(o00ooo01.OooO0O0(o000O0O0.OooO00o(-11350770425360L)), o000O0O0.OooO00o(-11380835196432L))) {
            return ooo00o0o.OooO0O0(o00ooo01);
        }
        o00OOO00.OooO00o oooO00o2 = new o00OOO00.OooO00o(o00ooo01);
        HashMap map = new HashMap();
        if (StringsKt.OooO(o00ooo01.f51426OooO0OO, o000O0O0.OooO00o(-11685777874448L))) {
            o00OO000 o00oo001 = o00ooo01.f51425OooO0O0;
            if (o00oo001.f51389OooO0oo == null) {
                setUnmodifiableSet = SetsKt.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o00oo001.f51389OooO0oo.size()), 2);
                int first = intProgressionStep.getFirst();
                int last = intProgressionStep.getLast();
                int step = intProgressionStep.getStep();
                if (step < 0 ? first >= last : first <= last) {
                    while (true) {
                        String str = o00oo001.f51389OooO0oo.get(first);
                        Intrinsics.checkNotNull(str);
                        linkedHashSet.add(str);
                        if (first == last) {
                            break;
                        }
                        first += step;
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "Collections.unmodifiableSet(result)");
            }
            for (String str2 : setUnmodifiableSet) {
                String strOooO0oo = o00ooo01.f51425OooO0O0.OooO0oo(str2);
                if (strOooO0oo == null) {
                    strOooO0oo = o000O0O0.OooO00o(-11702957743632L);
                }
                map.put(str2, strOooO0oo);
            }
        } else if (StringsKt.OooO(o00ooo01.f51426OooO0OO, o000O0O0.OooO00o(-11707252710928L))) {
            o0o0Oo o0o0oo = o00ooo01.f51429OooO0o0;
            Intrinsics.checkNotNull(o0o0oo, o000O0O0.OooO00o(-11728727547408L));
            o00O0OO o00o0oo2 = (o00O0OO) o0o0oo;
            int size = o00o0oo2.size();
            for (int i = 0; i < size; i++) {
                map.put(o00o0oo2.OooO00o(i), o00o0oo2.OooO0O0(i));
            }
        }
        String strOooO0Oo = o0OoOo0.OooO0Oo();
        String strQ = Apollo.f12658OooO00o.q("K1");
        if (StringsKt.isBlank(strQ)) {
            if (!o0OOO0o.OooO0OO()) {
                throw new NullPointerException("Apollo not init");
            }
            System.exit(1);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        String strOooOo00 = StringsKt.OooOo00(o000000O.OooO0OO(strOooO0Oo, strQ), o000O0O0.OooO00o(-11402310032912L), o000O0O0.OooO00o(-11410899967504L));
        String strOooO0Oo2 = o0OoOo0.OooO0Oo();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        o00oO0o o00oo0o2 = o00oO0o.f40931OooO00o;
        long j = jCurrentTimeMillis + o00oO0o.f40932OooO0O0;
        if (OooO0OO.OooO00o(map)) {
            string = o000O0O0.OooO00o(-11960655781392L);
        } else {
            ArrayList arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new Comparator() { // from class: o0o000Oo.Oooo0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
                }
            });
            StringBuilder sb = new StringBuilder();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i2);
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                sb.append(str3);
                sb.append(o000O0O0.OooO00o(-11964950748688L));
                sb.append(str4);
                if (i2 != arrayList.size() - 1) {
                    sb.append(o000O0O0.OooO00o(-11973540683280L));
                }
            }
            string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, o000O0O0.OooO00o(-11982130617872L));
        }
        o00O00.OooO0OO(o000O0O0.OooO00o(-11415194934800L), string);
        String strMd5 = GooglePaySignOrMd5.INSTANCE.md5(string);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strMd5);
        sb2.append('|');
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        sb2.append(o0Oo0oo.OooO00o());
        sb2.append('|');
        sb2.append(j);
        sb2.append('|');
        sb2.append(strOooO0Oo2);
        sb2.append('|');
        o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
        sb2.append(o0OOO0o.OooO00o());
        String string2 = sb2.toString();
        String strOooO0Oo3 = OooOOOO.OooO0Oo(strOooO0Oo, string2);
        o00O.OooO00o oooO00oOooO0OO = o00ooo01.f51427OooO0Oo.OooO0OO();
        oooO00oOooO0OO.OooO00o(o000O0O0.OooO00o(-11458144607760L), o000O0O0.OooO00o(-11505389248016L));
        oooO00oOooO0OO.OooO00o(o000O0O0.OooO00o(-11531159051792L), strOooOo00);
        oooO00oOooO0OO.OooO00o(o000O0O0.OooO00o(-11544043953680L), String.valueOf(j));
        oooO00oOooO0OO.OooO00o(o000O0O0.OooO00o(-11586993626640L), strOooO0Oo2);
        oooO00oOooO0OO.OooO00o(o000O0O0.OooO00o(-11612763430416L), o0Oo0oo.OooO00o());
        String strOooO00o = o000O0O0.OooO00o(-11642828201488L);
        Intrinsics.checkNotNullExpressionValue(strOooO0Oo3, o000O0O0.OooO00o(-11664303037968L));
        oooO00oOooO0OO.OooO00o(strOooO00o, strOooO0Oo3);
        for (Map.Entry<String, String> entry2 : f40895OooO00o.OooO00o(string2).OooO00o().entrySet()) {
            oooO00oOooO0OO.OooO00o(entry2.getKey(), entry2.getValue());
        }
        oooO00o2.OooO0o(oooO00oOooO0OO.OooO0Oo());
        return ooo00o0o.OooO0O0(oooO00o2.OooO0O0());
    }
}
