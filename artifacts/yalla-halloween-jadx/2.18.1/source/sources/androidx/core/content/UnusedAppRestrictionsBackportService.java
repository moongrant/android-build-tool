package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import o000.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO00o f7816Oooo0o = new OooO00o();

    public class OooO00o extends OooO0OO {
        public OooO00o() {
        }
    }

    public abstract void OooO00o();

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@Nullable Intent intent) {
        return this.f7816Oooo0o;
    }
}
