package o00000O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0000O0.OooO0o f26793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0000O0.OooOO0 f26794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f26795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0000O0.OooOOOO f26796OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o0000O0.OooO0OO f26797OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Oooo0 f26798OooO0o0;

    @ExperimentalTextApi
    public OooOo00(o0000O0.OooO0o oooO0o, o0000O0.OooOO0 oooOO1, long j, o0000O0.OooOOOO oooOOOO, @ExperimentalTextApi Oooo0 oooo0, @ExperimentalTextApi o0000O0.OooO0OO oooO0OO) {
        this.f26793OooO00o = oooO0o;
        this.f26794OooO0O0 = oooOO1;
        this.f26795OooO0OO = j;
        this.f26796OooO0Oo = oooOOOO;
        this.f26798OooO0o0 = oooo0;
        this.f26797OooO0o = oooO0OO;
        o0000O0O.o00O0O.OooO00o oooO00o = o0000O0O.o00O0O.f27323OooO0O0;
        if (o0000O0O.o00O0O.OooO00o(j, o0000O0O.o00O0O.f27325OooO0Oo)) {
            return;
        }
        if (o0000O0O.o00O0O.OooO0OO(j) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("lineHeight can't be negative (");
        sbOooO0o0.append(o0000O0O.o00O0O.OooO0OO(j));
        sbOooO0o0.append(')');
        throw new IllegalStateException(sbOooO0o0.toString().toString());
    }

    @Stable
    @NotNull
    public final OooOo00 OooO00o(@Nullable OooOo00 oooOo00) {
        if (oooOo00 == null) {
            return this;
        }
        long j = o0000O0O.o00Oo0.OooO0Oo(oooOo00.f26795OooO0OO) ? this.f26795OooO0OO : oooOo00.f26795OooO0OO;
        o0000O0.OooOOOO oooOOOO = oooOo00.f26796OooO0Oo;
        if (oooOOOO == null) {
            oooOOOO = this.f26796OooO0Oo;
        }
        o0000O0.OooOOOO oooOOOO2 = oooOOOO;
        o0000O0.OooO0o oooO0o = oooOo00.f26793OooO00o;
        if (oooO0o == null) {
            oooO0o = this.f26793OooO00o;
        }
        o0000O0.OooO0o oooO0o2 = oooO0o;
        o0000O0.OooOO0 oooOO1 = oooOo00.f26794OooO0O0;
        if (oooOO1 == null) {
            oooOO1 = this.f26794OooO0O0;
        }
        o0000O0.OooOO0 oooOO2 = oooOO1;
        Oooo0 oooo0 = oooOo00.f26798OooO0o0;
        Oooo0 oooo1 = this.f26798OooO0o0;
        Oooo0 oooo2 = (oooo1 != null && oooo0 == null) ? oooo1 : oooo0;
        o0000O0.OooO0OO oooO0OO = oooOo00.f26797OooO0o;
        if (oooO0OO == null) {
            oooO0OO = this.f26797OooO0o;
        }
        return new OooOo00(oooO0o2, oooOO2, j, oooOOOO2, oooo2, oooO0OO);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        return Intrinsics.areEqual(this.f26793OooO00o, oooOo00.f26793OooO00o) && Intrinsics.areEqual(this.f26794OooO0O0, oooOo00.f26794OooO0O0) && o0000O0O.o00O0O.OooO00o(this.f26795OooO0OO, oooOo00.f26795OooO0OO) && Intrinsics.areEqual(this.f26796OooO0Oo, oooOo00.f26796OooO0Oo) && Intrinsics.areEqual(this.f26798OooO0o0, oooOo00.f26798OooO0o0) && Intrinsics.areEqual(this.f26797OooO0o, oooOo00.f26797OooO0o);
    }

    public final int hashCode() {
        o0000O0.OooO0o oooO0o = this.f26793OooO00o;
        int i = (oooO0o != null ? oooO0o.f27261OooO00o : 0) * 31;
        o0000O0.OooOO0 oooOO1 = this.f26794OooO0O0;
        int iOooO0Oo = (o0000O0O.o00O0O.OooO0Oo(this.f26795OooO0OO) + ((i + (oooOO1 != null ? oooOO1.f27262OooO00o : 0)) * 31)) * 31;
        o0000O0.OooOOOO oooOOOO = this.f26796OooO0Oo;
        int iHashCode = (iOooO0Oo + (oooOOOO != null ? oooOOOO.hashCode() : 0)) * 31;
        Oooo0 oooo0 = this.f26798OooO0o0;
        int iHashCode2 = (iHashCode + (oooo0 != null ? oooo0.hashCode() : 0)) * 31;
        o0000O0.OooO0OO oooO0OO = this.f26797OooO0o;
        return iHashCode2 + (oooO0OO != null ? oooO0OO.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ParagraphStyle(textAlign=");
        sbOooO0o0.append(this.f26793OooO00o);
        sbOooO0o0.append(", textDirection=");
        sbOooO0o0.append(this.f26794OooO0O0);
        sbOooO0o0.append(", lineHeight=");
        sbOooO0o0.append((Object) o0000O0O.o00O0O.OooO0o0(this.f26795OooO0OO));
        sbOooO0o0.append(", textIndent=");
        sbOooO0o0.append(this.f26796OooO0Oo);
        sbOooO0o0.append(", platformStyle=");
        sbOooO0o0.append(this.f26798OooO0o0);
        sbOooO0o0.append(", lineHeightStyle=");
        sbOooO0o0.append(this.f26797OooO0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
