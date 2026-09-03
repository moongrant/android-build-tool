package com.twitter.sdk.android.tweetui;

import android.content.res.Resources;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SimpleDateFormat f21962OooO00o = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f21963OooO0O0 = new OooO00o();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final p190o00o0O.Oooo000<SimpleDateFormat> f21964OooO00o = new p190o00o0O.Oooo000<>();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Locale f21965OooO0O0;

        public final synchronized String OooO00o(Resources resources, Date date) {
            return OooO0O0(resources, o000000.tw__relative_date_format_long).format(date);
        }

        public final synchronized SimpleDateFormat OooO0O0(Resources resources, int i) {
            SimpleDateFormat simpleDateFormat;
            Locale locale = this.f21965OooO0O0;
            if (locale == null || locale != resources.getConfiguration().locale) {
                this.f21965OooO0O0 = resources.getConfiguration().locale;
                p190o00o0O.Oooo000<SimpleDateFormat> oooo000 = this.f21964OooO00o;
                int i2 = oooo000.f38584OooO0oO;
                Object[] objArr = oooo000.f38582OooO0o;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                oooo000.f38584OooO0oO = 0;
                oooo000.f38581OooO0Oo = false;
            }
            simpleDateFormat = (SimpleDateFormat) this.f21964OooO00o.OooO0o(i, null);
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(resources.getString(i), Locale.getDefault());
                this.f21964OooO00o.OooO0oo(i, simpleDateFormat);
            }
            return simpleDateFormat;
        }
    }
}
