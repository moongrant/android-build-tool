package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0000 extends o00oOoo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f1637OooO0O0;

    @AutoValue
    public static abstract class OooO00o extends o00oOoo.OooO00o {

        /* JADX INFO: renamed from: OoooOoo.o00O0000$OooO00o$OooO00o, reason: collision with other inner class name */
        @AutoValue.Builder
        public static abstract class AbstractC0006OooO00o extends o00oOoo.OooO00o.AbstractC0007OooO00o<AbstractC0006OooO00o> {
        }

        @NonNull
        public abstract File OooO0Oo();
    }

    public o00O0000(@NonNull OooO00o oooO00o) {
        super(oooO00o);
        this.f1637OooO0O0 = oooO00o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0000)) {
            return false;
        }
        return this.f1637OooO0O0.equals(((o00O0000) obj).f1637OooO0O0);
    }

    public final int hashCode() {
        return this.f1637OooO0O0.hashCode();
    }

    @NonNull
    public final String toString() {
        return this.f1637OooO0O0.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
