package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Pattern f14120OooO00o = Pattern.compile("(&#13;)?&#10;");

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f14121OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<String, String> f14122OooO0O0;

        public OooO00o(String str, Map map) {
            this.f14121OooO00o = str;
            this.f14122OooO0O0 = map;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14125OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14126OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f14127OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f14128OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final o00Oo0 f14124OooO0o0 = new o00Oo0();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final o00Ooo f14123OooO0o = new o00Ooo();

        public OooO0O0(int i, int i2, String str, String str2) {
            this.f14125OooO00o = i;
            this.f14126OooO0O0 = i2;
            this.f14127OooO0OO = str;
            this.f14128OooO0Oo = str2;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f14129OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f14130OooO0O0 = new ArrayList();
    }

    public static String OooO00o(CharSequence charSequence) {
        return f14120OooO00o.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
