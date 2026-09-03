package com.twitter.sdk.android.tweetui;

import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SimpleDateFormat f22436OooO00o = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f22437OooO0O0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final p188o00o0O.Oooo0<SimpleDateFormat> f22438OooO00o = new p188o00o0O.Oooo0<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Locale f22439OooO0O0;

        public final synchronized String OooO00o(Resources resources, Date date) {
            return OooO0O0(resources, o000000.tw__relative_date_format_long).format(date);
        }

        public final synchronized SimpleDateFormat OooO0O0(Resources resources, int i) {
            SimpleDateFormat simpleDateFormat;
            Locale locale = this.f22439OooO0O0;
            if (locale == null || locale != resources.getConfiguration().locale) {
                this.f22439OooO0O0 = resources.getConfiguration().locale;
                p188o00o0O.Oooo0<SimpleDateFormat> oooo0 = this.f22438OooO00o;
                int i2 = oooo0.f38810OooO0oO;
                Object[] objArr = oooo0.f38808OooO0o;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                oooo0.f38810OooO0oO = 0;
                oooo0.f38807OooO0Oo = false;
            }
            simpleDateFormat = (SimpleDateFormat) this.f22438OooO00o.OooO0o(i, null);
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(resources.getString(i), Locale.getDefault());
                this.f22438OooO00o.OooO0oo(i, simpleDateFormat);
            }
            return simpleDateFormat;
        }
    }
}
