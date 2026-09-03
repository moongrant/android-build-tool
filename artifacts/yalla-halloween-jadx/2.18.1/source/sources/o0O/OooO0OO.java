package o0O;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends zag {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Intent f35000Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ LifecycleFragment f35001Oooo0oO;

    public OooO0OO(Intent intent, LifecycleFragment lifecycleFragment) {
        this.f35000Oooo0o = intent;
        this.f35001Oooo0oO = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f35000Oooo0o;
        if (intent != null) {
            this.f35001Oooo0oO.startActivityForResult(intent, 2);
        }
    }
}
