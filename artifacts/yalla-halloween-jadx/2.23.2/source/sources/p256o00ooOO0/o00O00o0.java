package p256o00ooOO0;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.zab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 extends o00O0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zaaw f40276OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<Api.Client> f40277OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(zaaw zaawVar, ArrayList<Api.Client> arrayList) {
        super(zaawVar);
        this.f40276OooO0o = zaawVar;
        this.f40277OooO0o0 = arrayList;
    }

    @Override // p256o00ooOO0.o00O0O0
    @WorkerThread
    public final void OooO00o() {
        Set<Scope> setEmptySet;
        zaaw zaawVar = this.f40276OooO0o;
        zabe zabeVar = zaawVar.f14342OooO00o.f14402OooOOo0;
        zabi zabiVar = zaawVar.f14342OooO00o;
        ClientSettings clientSettings = zaawVar.f14357OooOOo;
        if (clientSettings == null) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(clientSettings.getRequiredScopes());
            Map<Api<?>, zab> mapZad = clientSettings.zad();
            for (Api<?> api : mapZad.keySet()) {
                if (!zabiVar.f14394OooOO0.containsKey(api.zab())) {
                    hashSet.addAll(mapZad.get(api).zaa);
                }
            }
            setEmptySet = hashSet;
        }
        zabeVar.f14379OooOOOo = setEmptySet;
        ArrayList<Api.Client> arrayList = this.f40277OooO0o0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).getRemoteService(zaawVar.f14355OooOOOO, zabiVar.f14402OooOOo0.f14379OooOOOo);
        }
    }
}
