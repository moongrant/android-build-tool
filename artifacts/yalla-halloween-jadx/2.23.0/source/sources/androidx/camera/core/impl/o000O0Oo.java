package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o000O0Oo extends o00O0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO0o f3702OooO = Config.OooO00o.OooO00o(Integer.TYPE, "camerax.core.imageInput.inputFormat");

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0o f3703OooOO0 = Config.OooO00o.OooO00o(DynamicRange.class, "camerax.core.imageInput.inputDynamicRange");

    int OooO0o();

    @NonNull
    DynamicRange OooOo0();

    boolean OooOo0o();
}
