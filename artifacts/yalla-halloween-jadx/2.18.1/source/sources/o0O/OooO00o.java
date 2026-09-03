package o0O;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends zag {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Intent f34994Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Activity f34995Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f34996Oooo0oo;

    public OooO00o(Intent intent, Activity activity, int i) {
        this.f34994Oooo0o = intent;
        this.f34995Oooo0oO = activity;
        this.f34996Oooo0oo = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f34994Oooo0o;
        if (intent != null) {
            this.f34995Oooo0oO.startActivityForResult(intent, this.f34996Oooo0oo);
        }
    }
}
