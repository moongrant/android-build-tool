package p254o00ooOO0;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O extends o00O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zaaw f40948OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Map<Api.Client, o00O000> f40949OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(zaaw zaawVar, HashMap map) {
        super(zaawVar);
        this.f40948OooO0o = zaawVar;
        this.f40949OooO0o0 = map;
    }

    @Override // p254o00ooOO0.o00O0
    @GuardedBy("mLock")
    @WorkerThread
    public final void OooO00o() {
        zae zaeVar;
        zaaw zaawVar = this.f40948OooO0o;
        zal zalVar = new zal(zaawVar.f14821OooO0Oo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map<Api.Client, o00O000> map = this.f40949OooO0o0;
        for (Api.Client client : map.keySet()) {
            if (!client.requiresGooglePlayServices() || map.get(client).f40943OooO0OO) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Context context = zaawVar.f14820OooO0OO;
        int iZab = -1;
        int i = 0;
        if (!zIsEmpty) {
            int size = arrayList.size();
            while (i < size) {
                iZab = zalVar.zab(context, (Api.Client) arrayList.get(i));
                i++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                iZab = zalVar.zab(context, (Api.Client) arrayList2.get(i));
                i++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        zabi zabiVar = zaawVar.f14818OooO00o;
        if (iZab != 0) {
            zabiVar.OooO0O0(new o00O000o(this, zaawVar, new ConnectionResult(iZab, null)));
            return;
        }
        if (zaawVar.f14830OooOOO0 && (zaeVar = zaawVar.f14827OooOO0O) != null) {
            zaeVar.zab();
        }
        for (Api.Client client2 : map.keySet()) {
            o00O000 o00o001 = map.get(client2);
            if (!client2.requiresGooglePlayServices() || zalVar.zab(context, client2) == 0) {
                client2.connect(o00o001);
            } else {
                zabiVar.OooO0O0(new o00O00(zaawVar, o00o001));
            }
        }
    }
}
