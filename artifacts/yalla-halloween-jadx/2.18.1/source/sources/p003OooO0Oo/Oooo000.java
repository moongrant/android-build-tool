package p003OooO0Oo;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Boolean f115OooO00o;

    public final boolean OooO0Oo() {
        return Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
    }

    public abstract void OooO0o0();
}
