package com.app.base.fragment.room;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p563o0oOo0.o00000OO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f11656Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentFragment f11657OoooO00;

    public OooO0O0(o00000OO o00000oo2, RoomInfoMomentFragment roomInfoMomentFragment) {
        this.f11656Oooo = o00000oo2;
        this.f11657OoooO00 = roomInfoMomentFragment;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f11656Oooo.setFirstLoading(true);
        this.f11657OoooO00.refreshLoad();
    }
}
