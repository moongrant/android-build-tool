package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o00O000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final List<o00O000o> f1638OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O f1639OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000O f1640OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000O f1641OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O f1642OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000O f1643OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o000O f1644OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o000O f1645OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final HashSet f1646OooO0oo;

    @AutoValue
    public static abstract class OooO00o extends o00O000o {
        @NonNull
        public abstract String OooO00o();

        public abstract int OooO0O0();
    }

    static {
        o000O o000o = new o000O(4, "SD");
        f1639OooO00o = o000o;
        o000O o000o2 = new o000O(5, "HD");
        f1640OooO0O0 = o000o2;
        o000O o000o3 = new o000O(6, "FHD");
        f1641OooO0OO = o000o3;
        o000O o000o4 = new o000O(8, "UHD");
        f1642OooO0Oo = o000o4;
        o000O o000o5 = new o000O(0, "LOWEST");
        f1644OooO0o0 = o000o5;
        o000O o000o6 = new o000O(1, "HIGHEST");
        f1643OooO0o = o000o6;
        f1645OooO0oO = new o000O(-1, "NONE");
        f1646OooO0oo = new HashSet(Arrays.asList(o000o5, o000o6, o000o, o000o2, o000o3, o000o4));
        f1638OooO = Arrays.asList(o000o4, o000o3, o000o2, o000o);
    }
}
