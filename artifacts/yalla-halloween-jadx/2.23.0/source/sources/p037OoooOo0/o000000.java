package p037OoooOo0;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.ULong;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends o000O000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O000.OooO00o<Void> f1496OooO0OO;

    public o000000(int i, int i2, o00O000.OooO00o<Void> oooO00o) {
        this.f1494OooO00o = i;
        this.f1495OooO0O0 = i2;
        this.f1496OooO0OO = oooO00o;
    }

    @Override // OoooOo0.o000O000.OooO00o
    @NonNull
    public final o00O000.OooO00o<Void> OooO00o() {
        return this.f1496OooO0OO;
    }

    @Override // OoooOo0.o000O000.OooO00o
    @IntRange(from = ULong.MIN_VALUE, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public final int OooO0O0() {
        return this.f1494OooO00o;
    }

    @Override // OoooOo0.o000O000.OooO00o
    @IntRange(from = ULong.MIN_VALUE, to = 359)
    public final int OooO0OO() {
        return this.f1495OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000O000.OooO00o)) {
            return false;
        }
        o000O000.OooO00o oooO00o = (o000O000.OooO00o) obj;
        return this.f1494OooO00o == oooO00o.OooO0O0() && this.f1495OooO0O0 == oooO00o.OooO0OO() && this.f1496OooO0OO.equals(oooO00o.OooO00o());
    }

    public final int hashCode() {
        return ((((this.f1494OooO00o ^ 1000003) * 1000003) ^ this.f1495OooO0O0) * 1000003) ^ this.f1496OooO0OO.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f1494OooO00o + ", rotationDegrees=" + this.f1495OooO0O0 + ", completer=" + this.f1496OooO0OO + "}";
    }
}
