package p039OoooOoo;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f1717OooO00o;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OoooOoo.o00oOoo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static abstract class AbstractC0007OooO00o<B> {
        }

        @IntRange(from = ULong.MIN_VALUE)
        public abstract long OooO00o();

        @IntRange(from = ULong.MIN_VALUE)
        public abstract long OooO0O0();

        @Nullable
        public abstract Location OooO0OO();
    }

    public o00oOoo(@NonNull OooO00o oooO00o) {
        this.f1717OooO00o = oooO00o;
    }
}
