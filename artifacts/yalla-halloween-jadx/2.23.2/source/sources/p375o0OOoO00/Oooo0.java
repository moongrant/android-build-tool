package p375o0OOoO00;

import com.facebook.login.widget.ToolTipPopup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p373o0OOoO.OooO0o;
import p374o0OOoO0.OooOOOO;
import p376o0OOoO0O.OooOO0;
import p480o0o000O.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f43208OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f43209OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f43210OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f43211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public OooO0o f43212OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f43213OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooOOOO f43214OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooOO0 f43215OooO0oo;

    public static final class OooO00o implements OooO0o {
        @Override // p373o0OOoO.OooO0o
        public final void OooO00o(@NotNull byte[] msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }
    }

    public Oooo0() {
        OooOO0O protocol = OooOO0O.f48393OooO00o;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.f43215OooO0oo = protocol;
        this.f43208OooO00o = 5;
        this.f43209OooO0O0 = ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        this.f43210OooO0OO = 6000;
        this.f43211OooO0Oo = "LongLink";
        this.f43213OooO0o0 = 10485760L;
        this.f43212OooO0o = new OooO00o();
        this.f43214OooO0oO = new OooOOOO(this);
    }
}
