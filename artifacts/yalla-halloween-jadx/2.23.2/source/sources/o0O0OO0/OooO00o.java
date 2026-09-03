package o0O0OO0;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.remoteconfig.RemoteConfigConstants$ExperimentDescriptionFieldKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String[] f41333OooO0oO = {RemoteConfigConstants$ExperimentDescriptionFieldKey.EXPERIMENT_ID, "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", RemoteConfigConstants$ExperimentDescriptionFieldKey.VARIANT_ID};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public static final SimpleDateFormat f41334OooO0oo = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41336OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41337OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Date f41338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f41339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f41340OooO0o0;

    public OooO00o(String str, String str2, String str3, Date date, long j, long j2) {
        this.f41335OooO00o = str;
        this.f41336OooO0O0 = str2;
        this.f41337OooO0OO = str3;
        this.f41338OooO0Oo = date;
        this.f41340OooO0o0 = j;
        this.f41339OooO0o = j2;
    }

    public final o0O0OOO0.OooO00o.OooO0O0 OooO00o(String str) {
        o0O0OOO0.OooO00o.OooO0O0 oooO0O0 = new o0O0OOO0.OooO00o.OooO0O0();
        oooO0O0.f41357OooO00o = str;
        oooO0O0.f41369OooOOO0 = this.f41338OooO0Oo.getTime();
        oooO0O0.f41358OooO0O0 = this.f41335OooO00o;
        oooO0O0.f41359OooO0OO = this.f41336OooO0O0;
        String str2 = this.f41337OooO0OO;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        oooO0O0.f41360OooO0Oo = str2;
        oooO0O0.f41362OooO0o0 = this.f41340OooO0o0;
        oooO0O0.f41365OooOO0 = this.f41339OooO0o;
        return oooO0O0;
    }
}
