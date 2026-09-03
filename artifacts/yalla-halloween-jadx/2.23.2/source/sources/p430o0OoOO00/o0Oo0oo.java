package p430o0OoOO00;

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
import p427o0OoO0oO.o0o0Oo;
import p428o0OoO0oo.o00OOOOo;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O00000;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O000o0;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo extends o00oO0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<o0o0Oo.OooO00o> f46839OooO0o;

    public o0Oo0oo(String str, Object obj, Map map, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        super(str, obj, map, linkedHashMap);
        this.f46839OooO0o = arrayList;
    }

    @Override // p430o0OoOO00.o00oO0o
    public final o0O00O0o OooO00o(o0oO0Ooo o0oo0ooo2) {
        o0O00O0o.OooO00o oooO00o = this.f46836OooO0o0;
        oooO00o.OooO0oO(o0oo0ooo2);
        return oooO00o.OooO0O0();
    }

    @Override // p430o0OoOO00.o00oO0o
    public final o0oO0Ooo OooO0O0() {
        String contentTypeFor;
        Map<String, String> map = this.f46833OooO0O0;
        List<o0o0Oo.OooO00o> list = this.f46839OooO0o;
        if (list == null || list.isEmpty()) {
            o0O00000.OooO00o oooO00o = new o0O00000.OooO00o();
            if (map != null) {
                for (String str : map.keySet()) {
                    oooO00o.OooO00o(str, map.get(str));
                }
            }
            return new o0O00000(oooO00o.f57779OooO0O0, oooO00o.f57780OooO0OO);
        }
        o0O000o0.OooO00o oooO00o2 = new o0O000o0.OooO00o();
        oooO00o2.OooO0OO(o0O000o0.f57813OooO0o);
        if (map != null && !map.isEmpty()) {
            for (String str2 : map.keySet()) {
                o0O000 o0o000OooO0OO = o0O000.OooO0O0.OooO0OO("Content-Disposition", o000oOoO.OooO0O0("form-data; name=\"", str2, "\""));
                o0oO0Ooo body = o0oO0Ooo.create((o0O000Oo) null, map.get(str2));
                Intrinsics.checkNotNullParameter(body, "body");
                o0O000o0.OooO0OO part = o0O000o0.OooO0OO.OooO00o.OooO00o(o0o000OooO0OO, body);
                Intrinsics.checkNotNullParameter(part, "part");
                oooO00o2.f57823OooO0OO.add(part);
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
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        oooO00o2.OooO00o(null, null, o0oO0Ooo.create(o0O000Oo.OooO00o.OooO0O0(contentTypeFor), (File) null));
        throw null;
    }

    @Override // p430o0OoOO00.o00oO0o
    public final o0oO0Ooo OooO0OO(o0oO0Ooo o0oo0ooo2, o00OOOOo o00ooooo2) {
        return new o00Ooo(o0oo0ooo2, new o0OOO0o(this, o00ooooo2));
    }
}
