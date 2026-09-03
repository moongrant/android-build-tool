package p647o0ooOooo;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o0O0o;
import p659o0oooO00.o0000;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes5.dex */
public final class oc extends o0O0o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f59723OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f59724OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0000 f59725OooO0oO;

    public oc(@Nullable String str, long j, @NotNull o00O0000 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f59724OooO0o0 = str;
        this.f59723OooO0o = j;
        this.f59725OooO0oO = source;
    }

    @Override // p634o0ooO0oO.o0O0o
    public final long OooO0OO() {
        return this.f59723OooO0o;
    }

    @Override // p634o0ooO0oO.o0O0o
    @Nullable
    public final o00OOO0 OooO0oO() {
        String str = this.f59724OooO0o0;
        if (str == null) {
            return null;
        }
        Pattern pattern = o00OOO0.f57234OooO0o0;
        return o00OOO0.OooO00o.OooO0O0(str);
    }

    @Override // p634o0ooO0oO.o0O0o
    @NotNull
    public final o0000 OooOOo0() {
        return this.f59725OooO0oO;
    }
}
