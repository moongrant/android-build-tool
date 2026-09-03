package o0000O0;

import androidx.compose.runtime.Immutable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27245OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooO f27246OooO0OO = new OooO(0);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO f27247OooO0Oo = new OooO(1);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO f27248OooO0o0 = new OooO(2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27249OooO00o;

    public static final class OooO00o {
    }

    public OooO(int i) {
        this.f27249OooO00o = i;
    }

    public final boolean OooO00o(@NotNull OooO other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.f27249OooO00o;
        return (other.f27249OooO00o | i) == i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && this.f27249OooO00o == ((OooO) obj).f27249OooO00o;
    }

    public final int hashCode() {
        return this.f27249OooO00o;
    }

    @NotNull
    public final String toString() {
        if (this.f27249OooO00o == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f27249OooO00o & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f27249OooO00o & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextDecoration.");
            sbOooO0o0.append((String) arrayList.get(0));
            return sbOooO0o0.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TextDecoration[");
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null ? true : obj instanceof CharSequence) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
