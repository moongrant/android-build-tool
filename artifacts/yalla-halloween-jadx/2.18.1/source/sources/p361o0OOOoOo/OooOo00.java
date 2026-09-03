package p361o0OOOoOo;

import OooO00o.OooO00o;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CrashlyticsReport f38403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final File f38405OooO0OO;

    public OooOo00(CrashlyticsReport crashlyticsReport, String str, File file) {
        this.f38403OooO00o = crashlyticsReport;
        Objects.requireNonNull(str, "Null sessionId");
        this.f38404OooO0O0 = str;
        this.f38405OooO0OO = file;
    }

    @Override // p361o0OOOoOo.o0000Ooo
    public final CrashlyticsReport OooO00o() {
        return this.f38403OooO00o;
    }

    @Override // p361o0OOOoOo.o0000Ooo
    public final File OooO0O0() {
        return this.f38405OooO0OO;
    }

    @Override // p361o0OOOoOo.o0000Ooo
    public final String OooO0OO() {
        return this.f38404OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000Ooo)) {
            return false;
        }
        o0000Ooo o0000ooo = (o0000Ooo) obj;
        return this.f38403OooO00o.equals(o0000ooo.OooO00o()) && this.f38404OooO0O0.equals(o0000ooo.OooO0OO()) && this.f38405OooO0OO.equals(o0000ooo.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f38403OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f38404OooO0O0.hashCode()) * 1000003) ^ this.f38405OooO0OO.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CrashlyticsReportWithSessionId{report=");
        sbOooO0o0.append(this.f38403OooO00o);
        sbOooO0o0.append(", sessionId=");
        sbOooO0o0.append(this.f38404OooO0O0);
        sbOooO0o0.append(", reportFile=");
        sbOooO0o0.append(this.f38405OooO0OO);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
