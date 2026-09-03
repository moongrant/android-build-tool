package p579o0oOoo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Lazy;
import p382o0OOoo0o.o0OoOo0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00000o {
    static {
        new HashMap();
    }

    public static String OooO00o(int i) {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date());
        StringBuilder sb = new StringBuilder();
        Lazy lazy = o0OoOo0.f44301OooO0O0;
        sb.append(o0OoOo0.f44302OooO0OO);
        sb.append("/SkillCard/");
        sb.append(i);
        sb.append(".png?");
        sb.append(str);
        return sb.toString();
    }
}
