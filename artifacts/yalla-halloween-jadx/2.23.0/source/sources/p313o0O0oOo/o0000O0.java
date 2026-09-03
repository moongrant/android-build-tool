package p313o0O0oOo;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
@AnyThread
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("ConfigStorageClient.class")
    public static final HashMap f42563OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f42564OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42565OooO0O0;

    public o0000O0(Context context, String str) {
        this.f42564OooO00o = context;
        this.f42565OooO0O0 = str;
    }

    public final synchronized void OooO00o() {
        this.f42564OooO00o.deleteFile(this.f42565OooO0O0);
    }
}
