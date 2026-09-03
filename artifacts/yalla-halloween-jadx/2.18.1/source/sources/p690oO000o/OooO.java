package p690oO000o;

import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends ContentObserver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f52687OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f52688OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f52689OooO0OO;

    public OooO(OooO0o oooO0o, int i) {
        super(null);
        this.f52689OooO0OO = oooO0o;
        this.f52688OooO0O0 = i;
        this.f52687OooO00o = null;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        OooO0o oooO0o = this.f52689OooO0OO;
        if (oooO0o != null) {
            oooO0o.OooO0O0(this.f52688OooO0O0, this.f52687OooO00o);
        } else {
            Log.e("VMS_IDLG_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
