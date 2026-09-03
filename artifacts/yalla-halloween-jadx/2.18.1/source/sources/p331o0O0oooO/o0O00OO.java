package p331o0O0oooO;

import androidx.annotation.BinderThread;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00OO extends zac {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<zaaw> f37091OooO00o;

    public o0O00OO(zaaw zaawVar) {
        this.f37091OooO00o = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(zak zakVar) {
        zaaw zaawVar = this.f37091OooO00o.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.f15319OooO00o.OooO0O0(new o0O00O(zaawVar, zaawVar, zakVar));
    }
}
