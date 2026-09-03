package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O implements p030OoooO.OooOOO0<List<Surface>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f3673OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0ooOO0.o000Oo0.OooO00o f3674OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f3675OooO0OO;

    public o0000O0O(boolean z, o0ooOO0.o000Oo0.OooO00o oooO00o, ScheduledFuture scheduledFuture) {
        this.f3673OooO00o = z;
        this.f3674OooO0O0 = oooO00o;
        this.f3675OooO0OO = scheduledFuture;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        this.f3674OooO0O0.OooO0O0(Collections.unmodifiableList(Collections.emptyList()));
        this.f3675OooO0OO.cancel(true);
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable List<Surface> list) {
        ArrayList arrayList = new ArrayList(list);
        if (this.f3673OooO00o) {
            arrayList.removeAll(Collections.singleton(null));
        }
        this.f3674OooO0O0.OooO0O0(arrayList);
        this.f3675OooO0OO.cancel(true);
    }
}
