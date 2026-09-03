package p054o00000oo;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0O0O f27198OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AtomicReference<o00OOO00> f27199OooO0O0;

    public o00OO000(@NotNull o00O0O0O platformTextInputService) {
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f27198OooO00o = platformTextInputService;
        this.f27199OooO0O0 = new AtomicReference<>(null);
    }
}
