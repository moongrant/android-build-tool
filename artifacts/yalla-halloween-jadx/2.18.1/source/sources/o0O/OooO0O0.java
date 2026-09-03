package o0O;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends zag {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Intent f34997Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Fragment f34998Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f34999Oooo0oo;

    public OooO0O0(Intent intent, Fragment fragment, int i) {
        this.f34997Oooo0o = intent;
        this.f34998Oooo0oO = fragment;
        this.f34999Oooo0oo = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f34997Oooo0o;
        if (intent != null) {
            this.f34998Oooo0oO.startActivityForResult(intent, this.f34999Oooo0oo);
        }
    }
}
