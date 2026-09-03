package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import p328o0O0ooOO.o0O00o0;
import p328o0O0ooOO.o0oOO;
import p328o0O0ooOO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzh implements Runnable {
    public final /* synthetic */ o0oOO zza;

    public /* synthetic */ zzh(o0oOO o0ooo2) {
        this.zza = o0ooo2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayDeque, java.util.Queue<o0O0ooOO.o0oOOo<?>>] */
    @Override // java.lang.Runnable
    public final void run() {
        final o0oOO o0ooo2 = this.zza;
        while (true) {
            synchronized (o0ooo2) {
                if (o0ooo2.f37035OooO00o != 2) {
                    return;
                }
                if (o0ooo2.f37038OooO0Oo.isEmpty()) {
                    o0ooo2.OooO0OO();
                    return;
                }
                final o0oOOo<?> o0oooo2 = (o0oOOo) o0ooo2.f37038OooO0Oo.poll();
                o0ooo2.f37040OooO0o0.put(o0oooo2.f37041OooO00o, o0oooo2);
                o0ooo2.f37039OooO0o.f15088OooO0O0.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0oOO o0ooo3 = o0ooo2;
                        int i = o0oooo2.f37041OooO00o;
                        synchronized (o0ooo3) {
                            o0oOOo<?> o0oooo3 = o0ooo3.f37040OooO0o0.get(i);
                            if (o0oooo3 != null) {
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("Timing out request: ");
                                sb.append(i);
                                Log.w("MessengerIpcClient", sb.toString());
                                o0ooo3.f37040OooO0o0.remove(i);
                                o0oooo3.OooO0OO(new zzq("Timed out waiting for response", null));
                                o0ooo3.OooO0OO();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf = String.valueOf(o0oooo2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                    sb.append("Sending ");
                    sb.append(strValueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                Context context = o0ooo2.f37039OooO0o.f15087OooO00o;
                Messenger messenger = o0ooo2.f37036OooO0O0;
                Message messageObtain = Message.obtain();
                messageObtain.what = o0oooo2.f37043OooO0OO;
                messageObtain.arg1 = o0oooo2.f37041OooO00o;
                messageObtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", o0oooo2.OooO0O0());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", o0oooo2.f37044OooO0Oo);
                messageObtain.setData(bundle);
                try {
                    o0O00o0 o0o00o1 = o0ooo2.f37037OooO0OO;
                    Messenger messenger2 = o0o00o1.f37033OooO00o;
                    if (messenger2 != null) {
                        messenger2.send(messageObtain);
                    } else {
                        zzd zzdVar = o0o00o1.f37034OooO0O0;
                        if (zzdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        zzdVar.zzb(messageObtain);
                    }
                } catch (RemoteException e) {
                    o0ooo2.OooO00o(2, e.getMessage());
                }
            }
        }
    }
}
