package p110o000ooo0;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o00O00;
import p634o0ooO0oO.o00O00OO;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o00OOOOo f35898OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o000000O f35899OooO0O0;

    public static final class OooO00o {
        @NotNull
        public static oo0O OooO00o(@NotNull oo0O oo0o, @NotNull oo0O oo0o2) {
            oo0O.OooO00o oooO00o = new oo0O.OooO00o();
            int length = oo0o.f57369OooO0Oo.length / 2;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    break;
                }
                String strOooO0OO = oo0o.OooO0OO(i);
                String strOooO0o0 = oo0o.OooO0o0(i);
                if (!StringsKt.OooOO0o("Warning", strOooO0OO) || !StringsKt.Oooo00o(strOooO0o0, "1")) {
                    if (!StringsKt.OooOO0o("Content-Length", strOooO0OO) && !StringsKt.OooOO0o("Content-Encoding", strOooO0OO) && !StringsKt.OooOO0o("Content-Type", strOooO0OO)) {
                        z = false;
                    }
                    if (z || !OooO0O0(strOooO0OO) || oo0o2.OooO00o(strOooO0OO) == null) {
                        oooO00o.OooO00o(strOooO0OO, strOooO0o0);
                    }
                }
                i++;
            }
            int length2 = oo0o2.f57369OooO0Oo.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                String strOooO0OO2 = oo0o2.OooO0OO(i2);
                if (!(StringsKt.OooOO0o("Content-Length", strOooO0OO2) || StringsKt.OooOO0o("Content-Encoding", strOooO0OO2) || StringsKt.OooOO0o("Content-Type", strOooO0OO2)) && OooO0O0(strOooO0OO2)) {
                    oooO00o.OooO00o(strOooO0OO2, oo0o2.OooO0o0(i2));
                }
            }
            return oooO00o.OooO0OO();
        }

        public static boolean OooO0O0(String str) {
            return (StringsKt.OooOO0o("Connection", str) || StringsKt.OooOO0o("Keep-Alive", str) || StringsKt.OooOO0o("Proxy-Authenticate", str) || StringsKt.OooOO0o("Proxy-Authorization", str) || StringsKt.OooOO0o("TE", str) || StringsKt.OooOO0o("Trailers", str) || StringsKt.OooOO0o("Transfer-Encoding", str) || StringsKt.OooOO0o("Upgrade", str)) ? false : true;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f35900OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o00OOOOo f35901OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o000000O f35902OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Date f35903OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f35904OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f35905OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Date f35906OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final Date f35907OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f35908OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f35909OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f35910OooOO0O;

        public OooO0O0(@NotNull o00OOOOo o00ooooo2, @Nullable o000000O o000000o2) {
            int i;
            this.f35901OooO00o = o00ooooo2;
            this.f35902OooO0O0 = o000000o2;
            this.f35910OooOO0O = -1;
            if (o000000o2 != null) {
                this.f35908OooO0oo = o000000o2.f35914OooO0OO;
                this.f35900OooO = o000000o2.f35915OooO0Oo;
                oo0O oo0o = o000000o2.f35916OooO0o;
                int length = oo0o.f57369OooO0Oo.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    String strOooO0OO = oo0o.OooO0OO(i2);
                    if (StringsKt.OooOO0o(strOooO0OO, "Date")) {
                        this.f35903OooO0OO = oo0o.OooO0O0("Date");
                        this.f35904OooO0Oo = oo0o.OooO0o0(i2);
                    } else if (StringsKt.OooOO0o(strOooO0OO, "Expires")) {
                        this.f35907OooO0oO = oo0o.OooO0O0("Expires");
                    } else if (StringsKt.OooOO0o(strOooO0OO, "Last-Modified")) {
                        this.f35906OooO0o0 = oo0o.OooO0O0("Last-Modified");
                        this.f35905OooO0o = oo0o.OooO0o0(i2);
                    } else if (StringsKt.OooOO0o(strOooO0OO, "ETag")) {
                        this.f35909OooOO0 = oo0o.OooO0o0(i2);
                    } else if (StringsKt.OooOO0o(strOooO0OO, "Age")) {
                        String strOooO0o0 = oo0o.OooO0o0(i2);
                        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
                        Long longOrNull = StringsKt.toLongOrNull(strOooO0o0);
                        if (longOrNull != null) {
                            long jLongValue = longOrNull.longValue();
                            i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i = -1;
                        }
                        this.f35910OooOO0O = i;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0111  */
        @NotNull
        public final o00000 OooO00o() {
            String string;
            long time;
            String str;
            int i;
            o00OOOOo o00ooooo2 = this.f35901OooO00o;
            o000000O o000000o2 = this.f35902OooO0O0;
            if (o000000o2 == null) {
                return new o00000(o00ooooo2, null);
            }
            if (o00ooooo2.f57313OooO00o.f57211OooOO0 && !o000000o2.f35917OooO0o0) {
                return new o00000(o00ooooo2, null);
            }
            Lazy lazy = o000000o2.f35912OooO00o;
            o00O00OO o00o00oo2 = (o00O00OO) lazy.getValue();
            boolean z = true;
            if (!((o00ooooo2.OooO00o().f57159OooO0O0 || ((o00O00OO) lazy.getValue()).f57159OooO0O0 || Intrinsics.areEqual(o000000o2.f35916OooO0o.OooO00o("Vary"), "*")) ? false : true)) {
                return new o00000(o00ooooo2, null);
            }
            o00O00OO o00o00ooOooO00o = o00ooooo2.OooO00o();
            if (!o00o00ooOooO00o.f57158OooO00o) {
                if (o00ooooo2.OooO0O0("If-Modified-Since") == null && o00ooooo2.OooO0O0("If-None-Match") == null) {
                    z = false;
                }
                if (!z) {
                    long time2 = this.f35900OooO;
                    Date date = this.f35903OooO0OO;
                    long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                    int i2 = this.f35910OooOO0O;
                    if (i2 != -1) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
                    }
                    long time3 = this.f35908OooO0oo;
                    long jLongValue = jMax + (time2 - time3) + (((Number) o00O00.f42856OooO00o.invoke()).longValue() - time2);
                    Intrinsics.checkNotNull(o000000o2);
                    int i3 = ((o00O00OO) lazy.getValue()).f57160OooO0OO;
                    Date date2 = this.f35906OooO0o0;
                    if (i3 != -1) {
                        time = TimeUnit.SECONDS.toMillis(i3);
                    } else {
                        Date date3 = this.f35907OooO0oO;
                        if (date3 != null) {
                            if (date != null) {
                                time2 = date.getTime();
                            }
                            time = date3.getTime() - time2;
                            if (time <= 0) {
                                time = 0;
                            }
                        } else if (date2 == null) {
                            time = 0;
                        } else {
                            List<String> list = o00ooooo2.f57313OooO00o.f57209OooO0oO;
                            if (list == null) {
                                string = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                o00OO.OooO0O0.OooO0o(sb, list);
                                string = sb.toString();
                            }
                            if (string != null) {
                                time = 0;
                            } else {
                                if (date != null) {
                                    time3 = date.getTime();
                                }
                                Intrinsics.checkNotNull(date2);
                                long time4 = time3 - date2.getTime();
                                if (time4 > 0) {
                                    time = time4 / ((long) 10);
                                } else {
                                    time = 0;
                                }
                            }
                        }
                    }
                    int i4 = o00o00ooOooO00o.f57160OooO0OO;
                    if (i4 != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(i4));
                    }
                    int i5 = o00o00ooOooO00o.f57157OooO;
                    long millis = i5 != -1 ? TimeUnit.SECONDS.toMillis(i5) : 0L;
                    long millis2 = (o00o00oo2.f57164OooO0oO || (i = o00o00ooOooO00o.f57165OooO0oo) == -1) ? 0L : TimeUnit.SECONDS.toMillis(i);
                    if (!o00o00oo2.f57158OooO00o && jLongValue + millis < time + millis2) {
                        return new o00000(null, o000000o2);
                    }
                    String str2 = this.f35909OooOO0;
                    if (str2 != null) {
                        Intrinsics.checkNotNull(str2);
                        str = "If-None-Match";
                    } else {
                        if (date2 != null) {
                            str2 = this.f35905OooO0o;
                            Intrinsics.checkNotNull(str2);
                        } else {
                            if (date == null) {
                                return new o00000(o00ooooo2, null);
                            }
                            str2 = this.f35904OooO0Oo;
                            Intrinsics.checkNotNull(str2);
                        }
                        str = "If-Modified-Since";
                    }
                    o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
                    oooO00o.OooO00o(str, str2);
                    return new o00000(oooO00o.OooO0O0(), o000000o2);
                }
            }
            return new o00000(o00ooooo2, null);
        }
    }

    public o00000(o00OOOOo o00ooooo2, o000000O o000000o2) {
        this.f35898OooO00o = o00ooooo2;
        this.f35899OooO0O0 = o000000o2;
    }
}
