package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.OooOOO;
import o000O0O0.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalRoomApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f7876OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f7878OooO0o0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f7877OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f7879OooO0oO = new OooO00o();

    public static final class OooO00o extends OooOOOO.OooO00o {
        public OooO00o() {
        }

        @Override // o000O0O0.OooOOOO
        public final int OooO0oO(@NotNull OooOOO callback, @Nullable String str) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f7877OooO0o) {
                int i2 = multiInstanceInvalidationService.f7876OooO0Oo + 1;
                multiInstanceInvalidationService.f7876OooO0Oo = i2;
                if (multiInstanceInvalidationService.f7877OooO0o.register(callback, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.f7878OooO0o0.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f7876OooO0Oo--;
                }
            }
            return i;
        }

        @Override // o000O0O0.OooOOOO
        public final void OooO0oo(int i, @NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f7877OooO0o) {
                String str = (String) multiInstanceInvalidationService.f7878OooO0o0.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f7877OooO0o.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f7877OooO0o.getBroadcastCookie(i2);
                        Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) broadcastCookie).intValue();
                        String str2 = (String) multiInstanceInvalidationService.f7878OooO0o0.get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && Intrinsics.areEqual(str, str2)) {
                            try {
                                multiInstanceInvalidationService.f7877OooO0o.getBroadcastItem(i2).OooO0O0(tables);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f7877OooO0o.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.f7877OooO0o.finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final class OooO0O0 extends RemoteCallbackList<OooOOO> {
        public OooO0O0() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object cookie) {
            OooOOO callback = (OooOOO) iInterface;
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.f7878OooO0o0.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    @NotNull
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f7879OooO0oO;
    }
}
