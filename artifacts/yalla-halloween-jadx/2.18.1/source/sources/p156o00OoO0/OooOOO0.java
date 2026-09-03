package p156o00OoO0;

import OooO0o.OooO0OO;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p144o00Oo.OooO0o;
import p551o0oOO.OooOOOO;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0OO;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OO0OO;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<OooOOOO.OooO00o> f32357OooO0o;

    public class OooO00o implements OooO0o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f32358OooO00o;

        public OooO00o(OooO0o oooO0o) {
            this.f32358OooO00o = oooO0o;
        }
    }

    public OooOOO0(String str, Object obj, Map map, Map map2, List list) {
        super(str, obj, map, map2);
        this.f32357OooO0o = list;
    }

    @Override // p156o00OoO0.OooOO0
    public final o00OOO00 OooO00o(o0o0Oo o0o0oo) {
        o00OOO00.OooO00o oooO00o = this.f32352OooO0o0;
        oooO00o.OooO0oo(o0o0oo);
        return oooO00o.OooO0O0();
    }

    @Override // p156o00OoO0.OooOO0
    public final o0o0Oo OooO0O0() throws CloneNotSupportedException {
        String contentTypeFor;
        List<OooOOOO.OooO00o> list = this.f32357OooO0o;
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Map<String, String> map = this.f32349OooO0O0;
            if (map != null) {
                for (String name : map.keySet()) {
                    String value = this.f32349OooO0O0.get(name);
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(value, "value");
                    arrayList.add(o00OO000.OooO0O0.OooO00o(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
                    arrayList2.add(o00OO000.OooO0O0.OooO00o(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, null, 91));
                }
            }
            return new o00O0OO(arrayList, arrayList2);
        }
        o00OO0OO.OooO00o oooO00o = new o00OO0OO.OooO00o();
        oooO00o.OooO0OO(o00OO0OO.f51407OooO0o);
        Map<String, String> map2 = this.f32349OooO0O0;
        if (map2 != null && !map2.isEmpty()) {
            for (String str : this.f32349OooO0O0.keySet()) {
                o00O o00oOooO0OO = o00O.f51229Oooo0oO.OooO0OO("Content-Disposition", OooO0OO.OooO00o("form-data; name=\"", str, "\""));
                o0o0Oo body = o0o0Oo.create((o00OO0O0) null, this.f32349OooO0O0.get(str));
                Intrinsics.checkNotNullParameter(body, "body");
                oooO00o.OooO00o(o00OO0OO.OooO0OO.f51419OooO0OO.OooO00o(o00oOooO0OO, body));
            }
        }
        for (int i = 0; i < this.f32357OooO0o.size(); i++) {
            OooOOOO.OooO00o oooO00o2 = this.f32357OooO0o.get(i);
            try {
                contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(oooO00o2.f44617OooO0O0, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                contentTypeFor = null;
            }
            if (contentTypeFor == null) {
                contentTypeFor = "application/octet-stream";
            }
            o0o0Oo body2 = o0o0Oo.create(o00OO0O0.f51401OooO0oO.OooO0O0(contentTypeFor), oooO00o2.f44618OooO0OO);
            String name2 = oooO00o2.f44616OooO00o;
            String str2 = oooO00o2.f44617OooO0O0;
            Intrinsics.checkNotNullParameter(name2, "name");
            Intrinsics.checkNotNullParameter(body2, "body");
            oooO00o.OooO00o(o00OO0OO.OooO0OO.f51419OooO0OO.OooO0O0(name2, str2, body2));
        }
        return oooO00o.OooO0O0();
    }

    @Override // p156o00OoO0.OooOO0
    public final o0o0Oo OooO0OO(o0o0Oo o0o0oo, OooO0o oooO0o) {
        return new OooO0o(o0o0oo, new OooO00o(oooO0o));
    }
}
