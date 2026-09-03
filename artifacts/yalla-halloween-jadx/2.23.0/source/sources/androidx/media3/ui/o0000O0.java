package androidx.media3.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f6742OooO00o = Pattern.compile("(&#13;)?&#10;");

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f6743OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<String, String> f6744OooO0O0;

        public OooO00o(String str, Map map) {
            this.f6743OooO00o = str;
            this.f6744OooO0O0 = map;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f6747OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f6748OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f6749OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f6750OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o0000O0O f6746OooO0o0 = new o0000O0O();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o000OO f6745OooO0o = new o000OO();

        public OooO0O0(int i, int i2, String str, String str2) {
            this.f6747OooO00o = i;
            this.f6748OooO0O0 = i2;
            this.f6749OooO0OO = str;
            this.f6750OooO0Oo = str2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f6751OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f6752OooO0O0 = new ArrayList();
    }

    public static String OooO00o(CharSequence charSequence) {
        return f6742OooO00o.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
