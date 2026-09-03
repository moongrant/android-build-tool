package p289o0O0Oo0;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO0O0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CrashlyticsReport f41463OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41464OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f41465OooO0OO;

    public OooO0OO(OooO0O0 oooO0O0, String str, File file) {
        this.f41463OooO00o = oooO0O0;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f41464OooO0O0 = str;
        this.f41465OooO0OO = file;
    }

    @Override // p289o0O0Oo0.o000000O
    public final CrashlyticsReport OooO00o() {
        return this.f41463OooO00o;
    }

    @Override // p289o0O0Oo0.o000000O
    public final File OooO0O0() {
        return this.f41465OooO0OO;
    }

    @Override // p289o0O0Oo0.o000000O
    public final String OooO0OO() {
        return this.f41464OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000000O)) {
            return false;
        }
        o000000O o000000o2 = (o000000O) obj;
        return this.f41463OooO00o.equals(o000000o2.OooO00o()) && this.f41464OooO0O0.equals(o000000o2.OooO0OO()) && this.f41465OooO0OO.equals(o000000o2.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f41463OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f41464OooO0O0.hashCode()) * 1000003) ^ this.f41465OooO0OO.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f41463OooO00o + ", sessionId=" + this.f41464OooO0O0 + ", reportFile=" + this.f41465OooO0OO + "}";
    }
}
