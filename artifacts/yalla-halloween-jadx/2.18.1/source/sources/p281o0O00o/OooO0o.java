package p281o0O00o;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo00.OooO0O0 f35171OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOo00.OooO0O0 f35172OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOo00.OooO0O0 f35173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOo00.OooO0O0 f35174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOo00.OooO0O0 f35175OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f35176OooO0oO;

    public OooO0o() {
        OooOo00.OooO0O0.OooO00o oooO00o = OooOo00.OooO0O0.f35199OooO0O0;
        Objects.requireNonNull(oooO00o);
        OooO displayCutout = OooOo00.OooO0O0.OooO00o.f35201OooO0O0;
        Objects.requireNonNull(oooO00o);
        Objects.requireNonNull(oooO00o);
        Objects.requireNonNull(oooO00o);
        Objects.requireNonNull(oooO00o);
        Intrinsics.checkNotNullParameter(displayCutout, "systemGestures");
        Intrinsics.checkNotNullParameter(displayCutout, "navigationBars");
        Intrinsics.checkNotNullParameter(displayCutout, "statusBars");
        Intrinsics.checkNotNullParameter(displayCutout, "ime");
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        this.f35171OooO0O0 = displayCutout;
        this.f35172OooO0OO = displayCutout;
        this.f35173OooO0Oo = displayCutout;
        this.f35175OooO0o0 = displayCutout;
        this.f35174OooO0o = displayCutout;
        OooOo00.OooO0O0[] types = {displayCutout, displayCutout};
        Intrinsics.checkNotNullParameter(types, "types");
        this.f35176OooO0oO = new OooO0O0((OooOo00.OooO0O0[]) Arrays.copyOf(types, 2));
    }

    @Override // p281o0O00o.OooOo00
    @NotNull
    public final OooOo00.OooO0O0 OooO00o() {
        return this.f35172OooO0OO;
    }

    @Override // p281o0O00o.OooOo00
    @NotNull
    public final OooOo00.OooO0O0 OooO0O0() {
        return this.f35176OooO0oO;
    }

    @Override // p281o0O00o.OooOo00
    @NotNull
    public final OooOo00.OooO0O0 OooO0OO() {
        return this.f35175OooO0o0;
    }

    @Override // p281o0O00o.OooOo00
    @NotNull
    public final OooOo00.OooO0O0 OooO0Oo() {
        return this.f35173OooO0Oo;
    }

    @Override // p281o0O00o.OooOo00
    @NotNull
    public final OooOo00.OooO0O0 OooO0o0() {
        return this.f35174OooO0o;
    }
}
