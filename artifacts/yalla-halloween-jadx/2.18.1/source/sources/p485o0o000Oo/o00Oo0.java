package p485o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.ApiError;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p516o0o0O000.o0Oo0oo;
import p640o0ooO0oO.o000O0O0;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p666o0oooO0o.oOo00o0o;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 implements o00OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f40897OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f40898OooO00o = Charset.forName(o000O0O0.OooO00o(-16646465101328L));

    public static final class OooO00o {
        @NotNull
        public final String OooO00o(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, o000O0O0.OooO00o(-15903435759120L));
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            if (!jSONObject.has(o000O0O0.OooO00o(-15933500530192L))) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (StringsKt.OooO(next, o000O0O0.OooO00o(-15954975366672L)) || StringsKt.OooO(next, o000O0O0.OooO00o(-15997925039632L)) || StringsKt.OooO(next, o000O0O0.OooO00o(-16023694843408L)) || StringsKt.OooO(next, o000O0O0.OooO00o(-16062349549072L))) {
                        jSONObject2.put(next, jSONObject.get(next));
                        itKeys.remove();
                    }
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put(o000O0O0.OooO00o(-16101004254736L), jSONObject2);
            }
            if (!Intrinsics.areEqual(jSONObject.get(o000O0O0.OooO00o(-16122479091216L)), o000O0O0.OooO00o(-16143953927696L)) && !Intrinsics.areEqual(jSONObject.get(o000O0O0.OooO00o(-16165428764176L)), (Object) 1000)) {
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject.has(o000O0O0.OooO00o(-16285687848464L))) {
                    jSONObject3.put(o000O0O0.OooO00o(-16307162684944L), jSONObject.get(o000O0O0.OooO00o(-16328637521424L)));
                    jSONObject.remove(o000O0O0.OooO00o(-16350112357904L));
                }
                if (jSONObject.has(o000O0O0.OooO00o(-16371587194384L))) {
                    jSONObject3.put(o000O0O0.OooO00o(-16405946932752L), jSONObject.get(o000O0O0.OooO00o(-16440306671120L)));
                }
                Iterator<String> itKeys2 = jSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!Intrinsics.areEqual(next2, o000O0O0.OooO00o(-16474666409488L)) && !Intrinsics.areEqual(next2, o000O0O0.OooO00o(-16496141245968L))) {
                        jSONObject3.put(next2, jSONObject.get(next2));
                        itKeys2.remove();
                    }
                }
                if (jSONObject3.length() > 0) {
                    String strOooO00o = o000O0O0.OooO00o(-16517616082448L);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Typography.quote);
                    sb.append(jSONObject3);
                    sb.append(Typography.quote);
                    jSONObject.put(strOooO00o, sb.toString());
                }
            } else if (z) {
                JSONObject jSONObject4 = new JSONObject();
                Iterator<String> itKeys3 = jSONObject.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    if (!Intrinsics.areEqual(next3, o000O0O0.OooO00o(-16186903600656L)) && !Intrinsics.areEqual(next3, o000O0O0.OooO00o(-16208378437136L)) && !Intrinsics.areEqual(next3, o000O0O0.OooO00o(-16242738175504L))) {
                        jSONObject4.put(next3, jSONObject.get(next3));
                        itKeys3.remove();
                    }
                }
                if (jSONObject4.length() > 0) {
                    jSONObject.put(o000O0O0.OooO00o(-16264213011984L), jSONObject4);
                }
            }
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, o000O0O0.OooO00o(-16551975820816L));
            return string;
        }
    }

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o oooO00o) throws IOException {
        String strOooO0O0;
        o00OO0O0 o00oo0o0OooO0o;
        Intrinsics.checkNotNullParameter(oooO00o, o000O0O0.OooO00o(-16672234905104L));
        oOo00o0o ooo00o0o = (oOo00o0o) oooO00o;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(o00ooo01);
        if (Intrinsics.areEqual(o00ooo01.OooO0O0(o000O0O0.OooO00o(-16698004708880L)), o000O0O0.OooO00o(-16728069479952L))) {
            return o00oooo0OooO0O0;
        }
        o00OOOOo o00ooooo2 = o00oooo0OooO0O0.f51441OoooO;
        String str = null;
        if (o00ooooo2 != null && (o00oo0o0OooO0o = o00ooooo2.OooO0o()) != null) {
            str = o00oo0o0OooO0o.f51404OooO0OO;
        }
        if (!(str != null && (StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-17007242354192L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-17028717190672L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-17045897059856L), false, 2, (Object) null) || StringsKt__StringsKt.contains$default(str, o000O0O0.OooO00o(-17071666863632L), false, 2, (Object) null)))) {
            return o00oooo0OooO0O0;
        }
        String strOooO0O1 = o00ooo01.OooO0O0(o000O0O0.OooO00o(-16749544316432L));
        if (strOooO0O1 != null && Boolean.parseBoolean(strOooO0O1)) {
            return o00oooo0OooO0O0;
        }
        o00OOOOo o00ooooo3 = o00oooo0OooO0O0.f51441OoooO;
        if (o00ooooo3 == null) {
            strOooO0O0 = o000O0O0.OooO00o(-16964292681232L);
        } else {
            Intrinsics.checkNotNull(o00ooooo3);
            o0oOOo o0ooooOooO0oo = o00ooooo3.OooO0oo();
            o0ooooOooO0oo.request(Long.MAX_VALUE);
            try {
                o0oOO o0oooClone = o0ooooOooO0oo.OooO0o0().clone();
                Charset charset = this.f40898OooO00o;
                Intrinsics.checkNotNullExpressionValue(charset, o000O0O0.OooO00o(-16968587648528L));
                strOooO0O0 = o0oooClone.OooooO0(charset);
            } catch (IOException unused) {
                strOooO0O0 = o0Oo0oo.OooO0O0(new ApiError(1, o000O0O0.OooO00o(-17002947386896L)));
            }
        }
        OooO00o oooO00o2 = f40897OooO0O0;
        String strOooO0O2 = o00ooo01.OooO0O0(o000O0O0.OooO00o(-16813968825872L));
        o00OOOOo o00oooooOooO00o = o00OOOOo.f51464Oooo0oO.OooO00o(oooO00o2.OooO00o(strOooO0O0, strOooO0O2 != null ? Boolean.parseBoolean(strOooO0O2) : false), o00OO0O0.f51401OooO0oO.OooO00o(o000O0O0.OooO00o(-16852623531536L)));
        o00OOOO0.OooO00o oooO00o3 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
        oooO00o3.f51458OooO0oO = o00oooooOooO00o;
        return oooO00o3.OooO00o();
    }
}
