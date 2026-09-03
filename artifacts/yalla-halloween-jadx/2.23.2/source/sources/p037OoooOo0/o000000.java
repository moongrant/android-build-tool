package p037OoooOo0;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.ULong;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends o000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1490OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1491OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000Oo0.OooO00o<Void> f1492OooO0OO;

    public o000000(int i, int i2, o000Oo0.OooO00o<Void> oooO00o) {
        this.f1490OooO00o = i;
        this.f1491OooO0O0 = i2;
        this.f1492OooO0OO = oooO00o;
    }

    @Override // OoooOo0.o000.OooO00o
    @NonNull
    public final o000Oo0.OooO00o<Void> OooO00o() {
        return this.f1492OooO0OO;
    }

    @Override // OoooOo0.o000.OooO00o
    @IntRange(from = ULong.MIN_VALUE, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public final int OooO0O0() {
        return this.f1490OooO00o;
    }

    @Override // OoooOo0.o000.OooO00o
    @IntRange(from = ULong.MIN_VALUE, to = 359)
    public final int OooO0OO() {
        return this.f1491OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000.OooO00o)) {
            return false;
        }
        o000.OooO00o oooO00o = (o000.OooO00o) obj;
        return this.f1490OooO00o == oooO00o.OooO0O0() && this.f1491OooO0O0 == oooO00o.OooO0OO() && this.f1492OooO0OO.equals(oooO00o.OooO00o());
    }

    public final int hashCode() {
        return ((((this.f1490OooO00o ^ 1000003) * 1000003) ^ this.f1491OooO0O0) * 1000003) ^ this.f1492OooO0OO.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f1490OooO00o + ", rotationDegrees=" + this.f1491OooO0O0 + ", completer=" + this.f1492OooO0OO + "}";
    }
}
