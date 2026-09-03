package p255o00ooOOo;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o0 extends zag {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Intent f41039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleFragment f41040OooO0o0;

    public o0O00o0(LifecycleFragment lifecycleFragment, Intent intent) {
        this.f41039OooO0Oo = intent;
        this.f41040OooO0o0 = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f41039OooO0Oo;
        if (intent != null) {
            this.f41040OooO0o0.startActivityForResult(intent, 2);
        }
    }
}
