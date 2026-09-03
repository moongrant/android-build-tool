package p282o0O0O0oo;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.remoteconfig.RemoteConfigConstants$ExperimentDescriptionFieldKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o0O0OO0O.OooO00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f41967OooO0oO = {RemoteConfigConstants$ExperimentDescriptionFieldKey.EXPERIMENT_ID, "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", RemoteConfigConstants$ExperimentDescriptionFieldKey.VARIANT_ID};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public static final SimpleDateFormat f41968OooO0oo = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41970OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41971OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Date f41972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f41973OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f41974OooO0o0;

    public OooOOOO(String str, String str2, String str3, Date date, long j, long j2) {
        this.f41969OooO00o = str;
        this.f41970OooO0O0 = str2;
        this.f41971OooO0OO = str3;
        this.f41972OooO0Oo = date;
        this.f41974OooO0o0 = j;
        this.f41973OooO0o = j2;
    }

    public final OooO00o.OooO0O0 OooO00o(String str) {
        OooO00o.OooO0O0 oooO0O0 = new OooO00o.OooO0O0();
        oooO0O0.f41990OooO00o = str;
        oooO0O0.f42002OooOOO0 = this.f41972OooO0Oo.getTime();
        oooO0O0.f41991OooO0O0 = this.f41969OooO00o;
        oooO0O0.f41992OooO0OO = this.f41970OooO0O0;
        String str2 = this.f41971OooO0OO;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        oooO0O0.f41993OooO0Oo = str2;
        oooO0O0.f41995OooO0o0 = this.f41974OooO0o0;
        oooO0O0.f41998OooOO0 = this.f41973OooO0o;
        return oooO0O0;
    }
}
