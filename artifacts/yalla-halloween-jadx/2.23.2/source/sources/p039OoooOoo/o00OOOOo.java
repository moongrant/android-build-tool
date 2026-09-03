package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.AudioStats;
import com.google.auto.value.AutoValue;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class o00OOOOo {
    @NonNull
    public static o000OO00 OooO0Oo(long j, long j2, @NonNull o000O00O o000o00o2) {
        OooOOO0.OooO0O0(j >= 0, "duration must be positive value.");
        OooOOO0.OooO0O0(j2 >= 0, "bytes must be positive value.");
        return new o000OO00(j, j2, o000o00o2);
    }

    @NonNull
    public abstract AudioStats OooO00o();

    public abstract long OooO0O0();

    public abstract long OooO0OO();
}
