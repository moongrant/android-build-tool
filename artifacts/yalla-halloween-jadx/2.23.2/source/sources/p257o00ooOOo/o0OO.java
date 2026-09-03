package p257o00ooOOo;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO extends zag {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Intent f40350OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f40351OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Fragment f40352OooO0o0;

    public o0OO(Fragment fragment, Intent intent, int i) {
        this.f40350OooO0Oo = intent;
        this.f40352OooO0o0 = fragment;
        this.f40351OooO0o = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f40350OooO0Oo;
        if (intent != null) {
            this.f40352OooO0o0.startActivityForResult(intent, this.f40351OooO0o);
        }
    }
}
