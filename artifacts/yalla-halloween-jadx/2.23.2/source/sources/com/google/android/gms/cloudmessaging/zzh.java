package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import p253o00ooO0O.o0000O0O;
import p253o00ooO0O.o0000OO0;
import p253o00ooO0O.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzh implements Runnable {
    public final /* synthetic */ o0000O0O zza;

    public /* synthetic */ zzh(o0000O0O o0000o0o2) {
        this.zza = o0000o0o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final o0000O0O o0000o0o2 = this.zza;
        while (true) {
            synchronized (o0000o0o2) {
                if (o0000o0o2.f40226OooO00o != 2) {
                    return;
                }
                if (o0000o0o2.f40229OooO0Oo.isEmpty()) {
                    o0000o0o2.OooO0OO();
                    return;
                }
                final o0000OO0<?> o0000oo1 = (o0000OO0) o0000o0o2.f40229OooO0Oo.poll();
                o0000o0o2.f40231OooO0o0.put(o0000oo1.f40232OooO00o, o0000oo1);
                o0000o0o2.f40230OooO0o.f14111OooO0O0.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0000O0O o0000o0o3 = o0000o0o2;
                        int i = o0000oo1.f40232OooO00o;
                        synchronized (o0000o0o3) {
                            o0000OO0<?> o0000oo2 = o0000o0o3.f40231OooO0o0.get(i);
                            if (o0000oo2 != null) {
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("Timing out request: ");
                                sb.append(i);
                                Log.w("MessengerIpcClient", sb.toString());
                                o0000o0o3.f40231OooO0o0.remove(i);
                                o0000oo2.OooO0OO(new zzq(null, "Timed out waiting for response"));
                                o0000o0o3.OooO0OO();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf = String.valueOf(o0000oo1);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                    sb.append("Sending ");
                    sb.append(strValueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                Context context = o0000o0o2.f40230OooO0o.f14110OooO00o;
                Messenger messenger = o0000o0o2.f40227OooO0O0;
                Message messageObtain = Message.obtain();
                messageObtain.what = o0000oo1.f40234OooO0OO;
                messageObtain.arg1 = o0000oo1.f40232OooO00o;
                messageObtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", o0000oo1.OooO0O0());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", o0000oo1.f40235OooO0Oo);
                messageObtain.setData(bundle);
                try {
                    o000OO o000oo2 = o0000o0o2.f40228OooO0OO;
                    Messenger messenger2 = o000oo2.f40237OooO00o;
                    if (messenger2 != null) {
                        messenger2.send(messageObtain);
                    } else {
                        zzd zzdVar = o000oo2.f40238OooO0O0;
                        if (zzdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        zzdVar.zzb(messageObtain);
                    }
                } catch (RemoteException e) {
                    o0000o0o2.OooO00o(2, e.getMessage());
                }
            }
        }
    }
}
