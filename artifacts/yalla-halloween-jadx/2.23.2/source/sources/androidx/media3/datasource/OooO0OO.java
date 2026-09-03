package androidx.media3.datasource;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public final class OooO0OO implements OooO00o.InterfaceC0142OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f6999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o.InterfaceC0142OooO00o f7000OooO0O0;

    public OooO0OO(Context context, @Nullable String str) {
        OooO0o.OooO00o oooO00o = new OooO0o.OooO00o();
        oooO00o.f7016OooO0O0 = str;
        this.f6999OooO00o = context.getApplicationContext();
        this.f7000OooO0O0 = oooO00o;
    }

    @Override // androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o
    public final OooO00o OooO00o() {
        return new OooO0O0(this.f6999OooO00o, this.f7000OooO0O0.OooO00o());
    }
}
