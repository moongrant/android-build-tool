package p334o0OO00o;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzee;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o000Oo0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ zzee f37343OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ String f37344OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Activity f37345OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ String f37346OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.f37343OoooO = zzeeVar;
        this.f37345OoooO00 = activity;
        this.f37344OoooO0 = str;
        this.f37346OoooO0O = str2;
    }

    @Override // p334o0OO00o.o000Oo0
    public final void OooO00o() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.f37343OoooO.f15923OooO0oo)).setCurrentScreen(ObjectWrapper.wrap(this.f37345OoooO00), this.f37344OoooO0, this.f37346OoooO0O, this.f37305Oooo0o);
    }
}
