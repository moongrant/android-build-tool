package p325o0O0oo0o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f36953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f36954OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f36955OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f36956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<o000O00> f36957OooO0o0;

    public o000O0O0(@NotNull o000Oo0 webContent) {
        Intrinsics.checkNotNullParameter(webContent, "webContent");
        this.f36953OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(webContent);
        this.f36954OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(o000O0o.OooO0O0.f36970OooO00o);
        this.f36955OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f36956OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f36957OooO0o0 = new o00OO0OO<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o000Oo0 OooO00o() {
        return (o000Oo0) this.f36953OooO00o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o000O0o OooO0O0() {
        return (o000O0o) this.f36954OooO0O0.getValue();
    }

    public final void OooO0OO(@NotNull o000O0o o000o0o2) {
        Intrinsics.checkNotNullParameter(o000o0o2, "<set-?>");
        this.f36954OooO0O0.setValue(o000o0o2);
    }
}
