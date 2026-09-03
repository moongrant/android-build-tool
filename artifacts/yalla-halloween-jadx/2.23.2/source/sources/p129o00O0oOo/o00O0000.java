package p129o00O0oOo;

import android.graphics.Bitmap;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import o00OO00O.OooOo00;
import o00OO00O.o00oO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0O00O0o f36750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00 f36751OooO0O0;

    public static final class OooO00o {
        @NotNull
        public static o0O000 OooO00o(@NotNull o0O000 o0o001, @NotNull o0O000 o0o002) {
            o0O000.OooO00o oooO00o = new o0O000.OooO00o();
            int length = o0o001.f57773OooO0Oo.length / 2;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    break;
                }
                String strOooO0OO = o0o001.OooO0OO(i);
                String strOooO0o0 = o0o001.OooO0o0(i);
                if (!StringsKt__StringsJVMKt.equals("Warning", strOooO0OO, true) || !StringsKt__StringsJVMKt.startsWith$default(strOooO0o0, "1", false, 2, null)) {
                    if (!StringsKt__StringsJVMKt.equals("Content-Length", strOooO0OO, true) && !StringsKt__StringsJVMKt.equals("Content-Encoding", strOooO0OO, true) && !StringsKt__StringsJVMKt.equals("Content-Type", strOooO0OO, true)) {
                        z = false;
                    }
                    if (z || !OooO0O0(strOooO0OO) || o0o002.OooO00o(strOooO0OO) == null) {
                        oooO00o.OooO00o(strOooO0OO, strOooO0o0);
                    }
                }
                i++;
            }
            int length2 = o0o002.f57773OooO0Oo.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                String strOooO0OO2 = o0o002.OooO0OO(i2);
                if (!(StringsKt__StringsJVMKt.equals("Content-Length", strOooO0OO2, true) || StringsKt__StringsJVMKt.equals("Content-Encoding", strOooO0OO2, true) || StringsKt__StringsJVMKt.equals("Content-Type", strOooO0OO2, true)) && OooO0O0(strOooO0OO2)) {
                    oooO00o.OooO00o(strOooO0OO2, o0o002.OooO0o0(i2));
                }
            }
            return oooO00o.OooO0OO();
        }

        public static boolean OooO0O0(String str) {
            return (StringsKt__StringsJVMKt.equals("Connection", str, true) || StringsKt__StringsJVMKt.equals("Keep-Alive", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true) || StringsKt__StringsJVMKt.equals("TE", str, true) || StringsKt__StringsJVMKt.equals("Trailers", str, true) || StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true) || StringsKt__StringsJVMKt.equals("Upgrade", str, true)) ? false : true;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f36752OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o0O00O0o f36753OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final o00 f36754OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final Date f36755OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f36756OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f36757OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Date f36758OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final Date f36759OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f36760OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f36761OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f36762OooOO0O;

        public OooO0O0(@NotNull o0O00O0o o0o00o0o, @Nullable o00 o00Var) {
            int i;
            this.f36753OooO00o = o0o00o0o;
            this.f36754OooO0O0 = o00Var;
            this.f36762OooOO0O = -1;
            if (o00Var != null) {
                this.f36760OooO0oo = o00Var.f36740OooO0OO;
                this.f36752OooO = o00Var.f36741OooO0Oo;
                o0O000 o0o001 = o00Var.f36742OooO0o;
                int length = o0o001.f57773OooO0Oo.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    String strOooO0OO = o0o001.OooO0OO(i2);
                    if (StringsKt__StringsJVMKt.equals(strOooO0OO, "Date", true)) {
                        this.f36755OooO0OO = o0o001.OooO0O0("Date");
                        this.f36756OooO0Oo = o0o001.OooO0o0(i2);
                    } else if (StringsKt__StringsJVMKt.equals(strOooO0OO, "Expires", true)) {
                        this.f36759OooO0oO = o0o001.OooO0O0("Expires");
                    } else if (StringsKt__StringsJVMKt.equals(strOooO0OO, "Last-Modified", true)) {
                        this.f36758OooO0o0 = o0o001.OooO0O0("Last-Modified");
                        this.f36757OooO0o = o0o001.OooO0o0(i2);
                    } else if (StringsKt__StringsJVMKt.equals(strOooO0OO, "ETag", true)) {
                        this.f36761OooOO0 = o0o001.OooO0o0(i2);
                    } else if (StringsKt__StringsJVMKt.equals(strOooO0OO, "Age", true)) {
                        String strOooO0o0 = o0o001.OooO0o0(i2);
                        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
                        Long longOrNull = StringsKt.toLongOrNull(strOooO0o0);
                        if (longOrNull != null) {
                            long jLongValue = longOrNull.longValue();
                            i = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i = -1;
                        }
                        this.f36762OooOO0O = i;
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0111  */
        @NotNull
        public final o00O0000 OooO00o() {
            String string;
            long time;
            String str;
            int i;
            o0O00O0o o0o00o0o = this.f36753OooO00o;
            o00 o00Var = this.f36754OooO0O0;
            if (o00Var == null) {
                return new o00O0000(o0o00o0o, null);
            }
            if (o0o00o0o.f57828OooO00o.f57797OooOO0 && !o00Var.f36743OooO0o0) {
                return new o00O0000(o0o00o0o, null);
            }
            Lazy lazy = o00Var.f36738OooO00o;
            oo0O oo0o = (oo0O) lazy.getValue();
            boolean z = true;
            if (!((o0o00o0o.OooO00o().f57973OooO0O0 || ((oo0O) lazy.getValue()).f57973OooO0O0 || Intrinsics.areEqual(o00Var.f36742OooO0o.OooO00o("Vary"), "*")) ? false : true)) {
                return new o00O0000(o0o00o0o, null);
            }
            oo0O oo0oOooO00o = o0o00o0o.OooO00o();
            if (!oo0oOooO00o.f57972OooO00o) {
                if (o0o00o0o.OooO0O0("If-Modified-Since") == null && o0o00o0o.OooO0O0("If-None-Match") == null) {
                    z = false;
                }
                if (!z) {
                    long time2 = this.f36752OooO;
                    Date date = this.f36755OooO0OO;
                    long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                    int i2 = this.f36762OooOO0O;
                    if (i2 != -1) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
                    }
                    long time3 = this.f36760OooO0oo;
                    long jLongValue = jMax + (time2 - time3) + (((Number) o00oO0o.f37092OooO00o.invoke()).longValue() - time2);
                    Intrinsics.checkNotNull(o00Var);
                    int i3 = ((oo0O) lazy.getValue()).f57974OooO0OO;
                    Date date2 = this.f36758OooO0o0;
                    if (i3 != -1) {
                        time = TimeUnit.SECONDS.toMillis(i3);
                    } else {
                        Date date3 = this.f36759OooO0oO;
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
                            List<String> list = o0o00o0o.f57828OooO00o.f57795OooO0oO;
                            if (list == null) {
                                string = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                o0O000O.OooO0O0.OooO0o(sb, list);
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
                    int i4 = oo0oOooO00o.f57974OooO0OO;
                    if (i4 != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(i4));
                    }
                    int i5 = oo0oOooO00o.f57971OooO;
                    long millis = i5 != -1 ? TimeUnit.SECONDS.toMillis(i5) : 0L;
                    long millis2 = (oo0o.f57978OooO0oO || (i = oo0oOooO00o.f57979OooO0oo) == -1) ? 0L : TimeUnit.SECONDS.toMillis(i);
                    if (!oo0o.f57972OooO00o && jLongValue + millis < time + millis2) {
                        return new o00O0000(null, o00Var);
                    }
                    String str2 = this.f36761OooOO0;
                    if (str2 != null) {
                        Intrinsics.checkNotNull(str2);
                        str = "If-None-Match";
                    } else {
                        if (date2 != null) {
                            str2 = this.f36757OooO0o;
                            Intrinsics.checkNotNull(str2);
                        } else {
                            if (date == null) {
                                return new o00O0000(o0o00o0o, null);
                            }
                            str2 = this.f36756OooO0Oo;
                            Intrinsics.checkNotNull(str2);
                        }
                        str = "If-Modified-Since";
                    }
                    o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0o);
                    oooO00o.OooO00o(str, str2);
                    return new o00O0000(oooO00o.OooO0O0(), o00Var);
                }
            }
            return new o00O0000(o0o00o0o, null);
        }
    }

    public o00O0000(o0O00O0o o0o00o0o, o00 o00Var) {
        this.f36750OooO00o = o0o00o0o;
        this.f36751OooO0O0 = o00Var;
    }
}
