package p285o0O0OOoo;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO0O0;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CrashlyticsReport f42101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42102OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f42103OooO0OO;

    public OooOo00(OooO0O0 oooO0O0, String str, File file) {
        this.f42101OooO00o = oooO0O0;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f42102OooO0O0 = str;
        this.f42103OooO0OO = file;
    }

    @Override // p285o0O0OOoo.o0000O0
    public final CrashlyticsReport OooO00o() {
        return this.f42101OooO00o;
    }

    @Override // p285o0O0OOoo.o0000O0
    public final File OooO0O0() {
        return this.f42103OooO0OO;
    }

    @Override // p285o0O0OOoo.o0000O0
    public final String OooO0OO() {
        return this.f42102OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o1 = (o0000O0) obj;
        return this.f42101OooO00o.equals(o0000o1.OooO00o()) && this.f42102OooO0O0.equals(o0000o1.OooO0OO()) && this.f42103OooO0OO.equals(o0000o1.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f42101OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f42102OooO0O0.hashCode()) * 1000003) ^ this.f42103OooO0OO.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f42101OooO00o + ", sessionId=" + this.f42102OooO0O0 + ", reportFile=" + this.f42103OooO0OO + "}";
    }
}
