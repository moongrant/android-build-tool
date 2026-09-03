package o0OO0;

import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends zzu {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int f37193Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient Object[] f37194Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient int f37195OoooO00;

    public OooO0OO(Object[] objArr, int i, int i2) {
        this.f37194Oooo0oo = objArr;
        this.f37193Oooo = i;
        this.f37195OoooO00 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzm.zza(i, this.f37195OoooO00, "index");
        Object obj = this.f37194Oooo0oo[i + i + this.f37193Oooo];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37195OoooO00;
    }
}
