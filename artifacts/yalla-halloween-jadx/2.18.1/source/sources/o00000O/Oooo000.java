package o00000O;

import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f26800OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f26801OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f26802OooO0OO = 7;

    public Oooo000(long j, long j2) {
        this.f26800OooO00o = j;
        this.f26801OooO0O0 = j2;
        if (!(!o0000O0O.o00Oo0.OooO0Oo(j))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (!(!o0000O0O.o00Oo0.OooO0Oo(j2))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        if (o0000O0O.o00O0O.OooO00o(this.f26800OooO00o, oooo000.f26800OooO00o) && o0000O0O.o00O0O.OooO00o(this.f26801OooO0O0, oooo000.f26801OooO0O0)) {
            return this.f26802OooO0OO == oooo000.f26802OooO0OO;
        }
        return false;
    }

    public final int hashCode() {
        return ((o0000O0O.o00O0O.OooO0Oo(this.f26801OooO0O0) + (o0000O0O.o00O0O.OooO0Oo(this.f26800OooO00o) * 31)) * 31) + this.f26802OooO0OO;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Placeholder(width=");
        sbOooO0o0.append((Object) o0000O0O.o00O0O.OooO0o0(this.f26800OooO00o));
        sbOooO0o0.append(", height=");
        sbOooO0o0.append((Object) o0000O0O.o00O0O.OooO0o0(this.f26801OooO0O0));
        sbOooO0o0.append(", placeholderVerticalAlign=");
        int i = this.f26802OooO0OO;
        if (i == 1) {
            str = "AboveBaseline";
        } else {
            if (i == 2) {
                str = "Top";
            } else {
                if (i == 3) {
                    str = "Bottom";
                } else {
                    if (i == 4) {
                        str = "Center";
                    } else {
                        if (i == 5) {
                            str = "TextTop";
                        } else {
                            if (i == 6) {
                                str = "TextBottom";
                            } else {
                                str = i == 7 ? "TextCenter" : "Invalid";
                            }
                        }
                    }
                }
            }
        }
        sbOooO0o0.append((Object) str);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
