package p660o0ooo0o0;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface o000OOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o000OO00 f51228OooO00o = new o000OO00();

    static {
        o00O0O0O defaultDns = o00O0OO0.f51314OooO00o;
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
    }

    @Nullable
    o00OOO00 authenticate(@Nullable o00Oo00 o00oo00, @NotNull o00OOOO0 o00oooo1) throws IOException;
}
