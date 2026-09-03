package p386o0OOoo0O;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O extends o00O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedTreeMap<String, o00O000o> f38885OooO00o = new LinkedTreeMap<>();

    public final void OooO0o0(String str, o00O000o o00o000o2) {
        LinkedTreeMap<String, o00O000o> linkedTreeMap = this.f38885OooO00o;
        if (o00o000o2 == null) {
            o00o000o2 = o00O00.f38884OooO00o;
        }
        linkedTreeMap.put(str, o00o000o2);
    }

    public final void OooO0oO(String str, String str2) {
        OooO0o0(str, str2 == null ? o00O00.f38884OooO00o : new oOO00O(str2));
    }

    public final o00O000o OooO0oo(String str) {
        return this.f38885OooO00o.get(str);
    }

    public final Set<Map.Entry<String, o00O000o>> entrySet() {
        return this.f38885OooO00o.entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o00O00O) && ((o00O00O) obj).f38885OooO00o.equals(this.f38885OooO00o));
    }

    public final int hashCode() {
        return this.f38885OooO00o.hashCode();
    }
}
