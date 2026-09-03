package p295o0O0OooO;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p293o0O0Ooo.Oooo0;
import p294o0O0Ooo0.o0000O;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o0000OO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0 implements Oooo0<o00O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f42314OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f42315OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oOO00O f42316OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42317OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final oOO00O f42311OooO0o0 = new oOO00O();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o00O00OO f42310OooO0o = new o00O00OO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o00O00o0 f42312OooO0oO = new o00O00o0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f42313OooO0oo = new OooO00o();

    public static final class OooO00o implements o0000O<Date> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SimpleDateFormat f42318OooO00o;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f42318OooO00o = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // p294o0O0Ooo0.o0000oo
        public final void OooO00o(@NonNull Object obj, @NonNull o0000OO0 o0000oo1) throws IOException {
            o0000oo1.OooO0O0(f42318OooO00o.format((Date) obj));
        }
    }

    public o00O0() {
        HashMap map = new HashMap();
        this.f42314OooO00o = map;
        HashMap map2 = new HashMap();
        this.f42315OooO0O0 = map2;
        this.f42316OooO0OO = f42311OooO0o0;
        this.f42317OooO0Oo = false;
        map2.put(String.class, f42310OooO0o);
        map.remove(String.class);
        map2.put(Boolean.class, f42312OooO0oO);
        map.remove(Boolean.class);
        map2.put(Date.class, f42313OooO0oo);
        map.remove(Date.class);
    }

    @NonNull
    public final Oooo0 OooO00o(@NonNull Class cls, @NonNull o0000O0O o0000o0o2) {
        this.f42314OooO00o.put(cls, o0000o0o2);
        this.f42315OooO0O0.remove(cls);
        return this;
    }
}
