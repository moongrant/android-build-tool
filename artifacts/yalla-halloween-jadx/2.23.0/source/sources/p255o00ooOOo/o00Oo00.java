package p255o00ooOOo;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.internal.zag;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 extends zag {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Intent f41021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f41022OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f41023OooO0o0;

    public o00Oo00(Activity activity, Intent intent, int i) {
        this.f41021OooO0Oo = intent;
        this.f41023OooO0o0 = activity;
        this.f41022OooO0o = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void OooO00o() {
        Intent intent = this.f41021OooO0Oo;
        if (intent != null) {
            this.f41023OooO0o0.startActivityForResult(intent, this.f41022OooO0o);
        }
    }
}
