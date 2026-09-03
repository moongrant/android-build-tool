package p590o0oOooo0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Lazy;
import p386o0OOooO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000o {
    static {
        new HashMap();
    }

    public static String OooO00o(int i) {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date());
        StringBuilder sb = new StringBuilder();
        Lazy lazy = o0OOO0o.f43500OooO0O0;
        sb.append(o0OOO0o.f43501OooO0OO);
        sb.append("/SkillCard/");
        sb.append(i);
        sb.append(".png?");
        sb.append(str);
        return sb.toString();
    }
}
