package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import p251o00ooO0O.o00000OO;
import p251o00ooO0O.o0000O00;
import p251o00ooO0O.o0000Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzh implements Runnable {
    public final /* synthetic */ o00000OO zza;

    public /* synthetic */ zzh(o00000OO o00000oo2) {
        this.zza = o00000oo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final o00000OO o00000oo2 = this.zza;
        while (true) {
            synchronized (o00000oo2) {
                if (o00000oo2.f40899OooO00o != 2) {
                    return;
                }
                if (o00000oo2.f40902OooO0Oo.isEmpty()) {
                    o00000oo2.OooO0OO();
                    return;
                }
                final o0000O00<?> o0000o00 = (o0000O00) o00000oo2.f40902OooO0Oo.poll();
                o00000oo2.f40904OooO0o0.put(o0000o00.f40905OooO00o, o0000o00);
                o00000oo2.f40903OooO0o.f14587OooO0O0.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    @Override // java.lang.Runnable
                    public final void run() {
                        o00000OO o00000oo3 = o00000oo2;
                        int i = o0000o00.f40905OooO00o;
                        synchronized (o00000oo3) {
                            o0000O00<?> o0000o01 = o00000oo3.f40904OooO0o0.get(i);
                            if (o0000o01 != null) {
                                StringBuilder sb = new StringBuilder(31);
                                sb.append("Timing out request: ");
                                sb.append(i);
                                Log.w("MessengerIpcClient", sb.toString());
                                o00000oo3.f40904OooO0o0.remove(i);
                                o0000o01.OooO0OO(new zzq(null, "Timed out waiting for response"));
                                o00000oo3.OooO0OO();
                            }
                        }
                    }
                }, 30L, TimeUnit.SECONDS);
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String strValueOf = String.valueOf(o0000o00);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                    sb.append("Sending ");
                    sb.append(strValueOf);
                    Log.d("MessengerIpcClient", sb.toString());
                }
                Context context = o00000oo2.f40903OooO0o.f14586OooO00o;
                Messenger messenger = o00000oo2.f40900OooO0O0;
                Message messageObtain = Message.obtain();
                messageObtain.what = o0000o00.f40907OooO0OO;
                messageObtain.arg1 = o0000o00.f40905OooO00o;
                messageObtain.replyTo = messenger;
                Bundle bundle = new Bundle();
                bundle.putBoolean("oneWay", o0000o00.OooO0O0());
                bundle.putString("pkg", context.getPackageName());
                bundle.putBundle("data", o0000o00.f40908OooO0Oo);
                messageObtain.setData(bundle);
                try {
                    o0000Ooo o0000ooo = o00000oo2.f40901OooO0OO;
                    Messenger messenger2 = o0000ooo.f40909OooO00o;
                    if (messenger2 != null) {
                        messenger2.send(messageObtain);
                    } else {
                        zzd zzdVar = o0000ooo.f40910OooO0O0;
                        if (zzdVar == null) {
                            throw new IllegalStateException("Both messengers are null");
                        }
                        zzdVar.zzb(messageObtain);
                    }
                } catch (RemoteException e) {
                    o00000oo2.OooO00o(2, e.getMessage());
                }
            }
        }
    }
}
