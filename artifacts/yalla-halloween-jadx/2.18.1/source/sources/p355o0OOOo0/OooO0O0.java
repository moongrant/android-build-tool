package p355o0OOOo0;

import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.internal.zzgx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashSet f38304OooO00o = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final List f38305OooO0O0 = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final List f38306OooO0OO = Arrays.asList(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "app", "am");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final List f38307OooO0Oo = Arrays.asList("_r", "_dbg");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List f38309OooO0o0 = Arrays.asList((String[]) ArrayUtils.concat(zzgx.zza, zzgx.zzb));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final List f38308OooO0o = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean OooO00o(String str) {
        return !f38306OooO0OO.contains(str);
    }
}
