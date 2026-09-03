package p257o00ooOOo;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0oO0 extends zag {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Intent f40353OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f40354OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f40355OooO0o0;

    public o0OO0oO0(Activity activity, Intent intent, int i) {
        this.f40353OooO0Oo = intent;
        this.f40355OooO0o0 = activity;
        this.f40354OooO0o = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f40353OooO0Oo;
        if (intent != null) {
            this.f40355OooO0o0.startActivityForResult(intent, this.f40354OooO0o);
        }
    }
}
