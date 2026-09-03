package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import p091o000o00o.o000000;
import p091o000o00o.o000000O;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalRoomApi
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f9261Oooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final HashMap<Integer, String> f9262Oooo0oO = new HashMap<>();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final RemoteCallbackList<o000000> f9263Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0O0 f9260Oooo = new OooO0O0();

    public class OooO00o extends RemoteCallbackList<o000000> {
        public OooO00o() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.f9262Oooo0oO.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class OooO0O0 extends o000000O {
        public OooO0O0() {
        }

        public final void OooOOOo(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f9263Oooo0oo) {
                String str = MultiInstanceInvalidationService.this.f9262Oooo0oO.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f9263Oooo0oo.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f9263Oooo0oo.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f9262Oooo0oO.get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((o000000) MultiInstanceInvalidationService.this.f9263Oooo0oo.getBroadcastItem(i2)).OooO0OO(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f9263Oooo0oo.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f9263Oooo0oo.finishBroadcast();
            }
        }

        public final int OooOOo0(o000000 o000000Var, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f9263Oooo0oo) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f9261Oooo0o + 1;
                multiInstanceInvalidationService.f9261Oooo0o = i;
                if (multiInstanceInvalidationService.f9263Oooo0oo.register(o000000Var, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f9262Oooo0oO.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService.this.f9261Oooo0o--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NonNull Intent intent) {
        return this.f9260Oooo;
    }
}
