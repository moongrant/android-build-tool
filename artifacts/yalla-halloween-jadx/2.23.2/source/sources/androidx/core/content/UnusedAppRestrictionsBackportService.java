package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import o00000OO.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f5285OooO0Oo = new OooO00o();

    public class OooO00o extends OooO0OO.OooO00o {
        public OooO00o() {
        }
    }

    public abstract void OooO00o();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        return this.f5285OooO0Oo;
    }
}
