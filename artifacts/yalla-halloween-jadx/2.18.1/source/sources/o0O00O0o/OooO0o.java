package o0O00O0o;

import com.ss.ugc.android.alpha_player.model.ScaleType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public String f35128OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35129OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public ScaleType f35130OooO0OO;

    public OooO0o(String filePath, int i) {
        ScaleType scaleType = ScaleType.ScaleAspectFill;
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f35128OooO00o = filePath;
        this.f35129OooO0O0 = i;
        this.f35130OooO0OO = scaleType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return Intrinsics.areEqual(this.f35128OooO00o, oooO0o.f35128OooO00o) && this.f35129OooO0O0 == oooO0o.f35129OooO0O0 && this.f35130OooO0OO == oooO0o.f35130OooO0OO;
    }

    public final int hashCode() {
        return this.f35130OooO0OO.hashCode() + (((this.f35128OooO00o.hashCode() * 31) + this.f35129OooO0O0) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("VideoItem(filePath=");
        sbOooO0o0.append(this.f35128OooO00o);
        sbOooO0o0.append(", loopCount=");
        sbOooO0o0.append(this.f35129OooO0O0);
        sbOooO0o0.append(", scaleType=");
        sbOooO0o0.append(this.f35130OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
