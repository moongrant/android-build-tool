package p255o00ooOOo;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOO extends zag {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Intent f41041OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f41042OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Fragment f41043OooO0o0;

    public o0oOO(Fragment fragment, Intent intent, int i) {
        this.f41041OooO0Oo = intent;
        this.f41043OooO0o0 = fragment;
        this.f41042OooO0o = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f41041OooO0Oo;
        if (intent != null) {
            this.f41043OooO0o0.startActivityForResult(intent, this.f41042OooO0o);
        }
    }
}
