package o0OO0;

import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends zzu {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.play_billing.OooO0O0 f37192Oooo0oo;

    public OooO0O0(com.google.android.gms.internal.play_billing.OooO0O0 oooO0O0) {
        this.f37192Oooo0oo = oooO0O0;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzm.zza(i, this.f37192Oooo0oo.f16048OoooO00, "index");
        com.google.android.gms.internal.play_billing.OooO0O0 oooO0O0 = this.f37192Oooo0oo;
        int i2 = i + i;
        Object obj = oooO0O0.f16046Oooo[i2];
        Objects.requireNonNull(obj);
        Object obj2 = oooO0O0.f16046Oooo[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37192Oooo0oo.f16048OoooO00;
    }
}
