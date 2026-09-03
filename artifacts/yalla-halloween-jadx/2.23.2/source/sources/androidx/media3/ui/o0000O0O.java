package androidx.media3.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f9795OooO00o = Pattern.compile("(&#13;)?&#10;");

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f9796OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<String, String> f9797OooO0O0;

        public OooO00o(String str, Map map) {
            this.f9796OooO00o = str;
            this.f9797OooO0O0 = map;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f9800OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f9801OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f9802OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f9803OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o000OO f9799OooO0o0 = new o000OO();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o0000O f9798OooO0o = new o0000O();

        public OooO0O0(int i, int i2, String str, String str2) {
            this.f9800OooO00o = i;
            this.f9801OooO0O0 = i2;
            this.f9802OooO0OO = str;
            this.f9803OooO0Oo = str2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f9804OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f9805OooO0O0 = new ArrayList();
    }

    public static String OooO00o(CharSequence charSequence) {
        return f9795OooO00o.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
