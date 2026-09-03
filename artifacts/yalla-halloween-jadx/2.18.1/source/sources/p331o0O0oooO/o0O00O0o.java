package p331o0O0oooO;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.zab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O0o extends o0oO0Ooo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayList<Api.Client> f37089Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zaaw f37090Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(zaaw zaawVar, ArrayList<Api.Client> arrayList) {
        super(zaawVar);
        this.f37090Oooo0oo = zaawVar;
        this.f37089Oooo0oO = arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @Override // p331o0O0oooO.o0oO0Ooo
    @WorkerThread
    public final void OooO00o() {
        Set<Scope> setEmptySet;
        zaaw zaawVar = this.f37090Oooo0oo;
        zabe zabeVar = zaawVar.f15319OooO00o.f15378OooOOO;
        ClientSettings clientSettings = zaawVar.f15334OooOOo;
        if (clientSettings == null) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
            Map<Api<?>, zab> mapZad = zaawVar.f15334OooOOo.zad();
            for (Api<?> api : mapZad.keySet()) {
                if (!zaawVar.f15319OooO00o.f15373OooO0oO.containsKey(api.zab())) {
                    hashSet.addAll(mapZad.get(api).zaa);
                }
            }
            setEmptySet = hashSet;
        }
        zabeVar.f15356OooOOOo = setEmptySet;
        ArrayList<Api.Client> arrayList = this.f37089Oooo0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Api.Client client = arrayList.get(i);
            zaaw zaawVar2 = this.f37090Oooo0oo;
            client.getRemoteService(zaawVar2.f15332OooOOOO, zaawVar2.f15319OooO00o.f15378OooOOO.f15356OooOOOo);
        }
    }
}
