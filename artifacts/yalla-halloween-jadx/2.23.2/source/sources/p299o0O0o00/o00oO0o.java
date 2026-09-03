package p299o0O0o00;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p297o0O0OooO.o0000O0O;
import p297o0O0OooO.o0000oo;
import p297o0O0OooO.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o implements o0O0o000.OooO00o<o00oO0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f41720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f41721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O0O f41722OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f41723OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00O0O f41717OooO0o0 = new o00O0O();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o00Oo0 f41716OooO0o = new o00Oo0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o00Ooo f41718OooO0oO = new o00Ooo();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f41719OooO0oo = new OooO00o();

    public static final class OooO00o implements o0000O0O<Date> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SimpleDateFormat f41724OooO00o;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f41724OooO00o = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // p297o0O0OooO.o0000
        public final void OooO00o(@NonNull Object obj, @NonNull o000OO o000oo2) throws IOException {
            o000oo2.OooO0o0(f41724OooO00o.format((Date) obj));
        }
    }

    public o00oO0o() {
        HashMap map = new HashMap();
        this.f41720OooO00o = map;
        HashMap map2 = new HashMap();
        this.f41721OooO0O0 = map2;
        this.f41722OooO0OO = f41717OooO0o0;
        this.f41723OooO0Oo = false;
        map2.put(String.class, f41716OooO0o);
        map.remove(String.class);
        map2.put(Boolean.class, f41718OooO0oO);
        map.remove(Boolean.class);
        map2.put(Date.class, f41719OooO0oo);
        map.remove(Date.class);
    }

    @NonNull
    public final o0O0o000.OooO00o OooO00o(@NonNull Class cls, @NonNull o0000oo o0000ooVar) {
        this.f41720OooO00o.put(cls, o0000ooVar);
        this.f41721OooO0O0.remove(cls);
        return this;
    }
}
