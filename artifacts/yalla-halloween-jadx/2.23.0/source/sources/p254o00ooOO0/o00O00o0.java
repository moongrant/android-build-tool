package p254o00ooOO0;

import androidx.annotation.BinderThread;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 extends zac {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakReference<zaaw> f40952OooO0Oo;

    public o00O00o0(zaaw zaawVar) {
        this.f40952OooO0Oo = new WeakReference<>(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    @BinderThread
    public final void zab(zak zakVar) {
        zaaw zaawVar = this.f40952OooO0Oo.get();
        if (zaawVar == null) {
            return;
        }
        zaawVar.f14818OooO00o.OooO0O0(new o00O00OO(zaawVar, zaawVar, zakVar));
    }
}
