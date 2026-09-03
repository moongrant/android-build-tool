package p257o00ooOOo;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO00 extends zag {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Intent f40357OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LifecycleFragment f40358OooO0o0;

    public o0OOO00(LifecycleFragment lifecycleFragment, Intent intent) {
        this.f40357OooO0Oo = intent;
        this.f40358OooO0o0 = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f40357OooO0Oo;
        if (intent != null) {
            this.f40358OooO0o0.startActivityForResult(intent, 2);
        }
    }
}
