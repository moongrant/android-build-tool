package androidx.compose.ui.platform;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 implements p100o000oOoO.o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f6397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00000 f6398OooO0O0;

    public o000000(Context context, o00000 o00000Var) {
        this.f6397OooO00o = context;
        this.f6398OooO0O0 = o00000Var;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        this.f6397OooO00o.getApplicationContext().unregisterComponentCallbacks(this.f6398OooO0O0);
    }
}
