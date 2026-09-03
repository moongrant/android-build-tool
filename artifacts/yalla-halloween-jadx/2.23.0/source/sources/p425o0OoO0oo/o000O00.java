package p425o0OoO0oo;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import p004OooO0oO.o000oOoO;
import p421o0OoO0Oo.o00000O0;
import p634o0ooO0oO.o00OO0O0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO0O;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends o000O000 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o00000O0.OooO00o> f45581OooO0o;

    public o000O00(String str, Object obj, Map map, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        super(str, obj, map, linkedHashMap);
        this.f45581OooO0o = arrayList;
    }

    @Override // p425o0OoO0oo.o000O000
    public final o00OOOOo OooO00o(oo00oO oo00oo) {
        o00OOOOo.OooO00o oooO00o = this.f45586OooO0o0;
        oooO00o.OooO0oO(oo00oo);
        return oooO00o.OooO0O0();
    }

    @Override // p425o0OoO0oo.o000O000
    public final oo00oO OooO0O0() {
        String contentTypeFor;
        Map<String, String> map = this.f45583OooO0O0;
        List<o00000O0.OooO00o> list = this.f45581OooO0o;
        if (list == null || list.isEmpty()) {
            o00OO0O0.OooO00o oooO00o = new o00OO0O0.OooO00o();
            if (map != null) {
                for (String str : map.keySet()) {
                    oooO00o.OooO00o(str, map.get(str));
                }
            }
            return new o00OO0O0(oooO00o.f57225OooO0O0, oooO00o.f57226OooO0OO);
        }
        o00OOO0O.OooO00o oooO00o2 = new o00OOO0O.OooO00o();
        oooO00o2.OooO0OO(o00OOO0O.f57240OooO0o);
        if (map != null && !map.isEmpty()) {
            for (String str2 : map.keySet()) {
                oo0O oo0oOooO0OO = oo0O.OooO0O0.OooO0OO("Content-Disposition", o000oOoO.OooO00o("form-data; name=\"", str2, "\""));
                oo00oO body = oo00oO.create((o00OOO0) null, map.get(str2));
                Intrinsics.checkNotNullParameter(body, "body");
                o00OOO0O.OooO0OO part = o00OOO0O.OooO0OO.OooO00o.OooO00o(oo0oOooO0OO, body);
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o2.f57250OooO0OO.add(part);
            }
        }
        if (list.size() <= 0) {
            return oooO00o2.OooO0O0();
        }
        list.get(0).getClass();
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode((String) null, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            contentTypeFor = null;
        }
        if (contentTypeFor == null) {
            contentTypeFor = "application/octet-stream";
        }
        Pattern pattern = o00OOO0.f57234OooO0o0;
        oooO00o2.OooO00o(null, null, oo00oO.create(o00OOO0.OooO00o.OooO0O0(contentTypeFor), (File) null));
        throw null;
    }

    @Override // p425o0OoO0oo.o000O000
    public final oo00oO OooO0OO(oo00oO oo00oo, p423o0OoO0o0.o000oOoO o000oooo2) {
        return new o0000OO0(oo00oo, new o000Oo0(this, o000oooo2));
    }
}
