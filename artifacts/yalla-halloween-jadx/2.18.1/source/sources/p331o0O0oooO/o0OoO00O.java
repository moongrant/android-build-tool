package p331o0O0oooO;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoO00O extends o0oO0Ooo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Map<Api.Client, o0O000Oo> f37143Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zaaw f37144Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(zaaw zaawVar, Map<Api.Client, o0O000Oo> map) {
        super(zaawVar);
        this.f37144Oooo0oo = zaawVar;
        this.f37143Oooo0oO = map;
    }

    @Override // p331o0O0oooO.o0oO0Ooo
    @GuardedBy("mLock")
    @WorkerThread
    public final void OooO00o() {
        zae zaeVar;
        zal zalVar = new zal(this.f37144Oooo0oo.f15322OooO0Oo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f37143Oooo0oO.keySet()) {
            if (!client.requiresGooglePlayServices() || this.f37143Oooo0oO.get(client).f37084OooO0OO) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int iZab = -1;
        int i = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                iZab = zalVar.zab(this.f37144Oooo0oo.f15321OooO0OO, (Api.Client) arrayList.get(i));
                i++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                iZab = zalVar.zab(this.f37144Oooo0oo.f15321OooO0OO, (Api.Client) arrayList2.get(i));
                i++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        if (iZab != 0) {
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            zaaw zaawVar = this.f37144Oooo0oo;
            zaawVar.f15319OooO00o.OooO0O0(new o0O000o0(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.f37144Oooo0oo;
        if (zaawVar2.f15331OooOOO0 && (zaeVar = zaawVar2.f15328OooOO0O) != null) {
            zaeVar.zab();
        }
        for (Api.Client client2 : this.f37143Oooo0oO.keySet()) {
            o0O000Oo o0o000oo2 = this.f37143Oooo0oO.get(client2);
            if (!client2.requiresGooglePlayServices() || zalVar.zab(this.f37144Oooo0oo.f15321OooO0OO, client2) == 0) {
                client2.connect(o0o000oo2);
            } else {
                zaaw zaawVar3 = this.f37144Oooo0oo;
                zaawVar3.f15319OooO00o.OooO0O0(new o0O00(zaawVar3, o0o000oo2));
            }
        }
    }
}
