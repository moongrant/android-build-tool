package p048Ooooooo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Timebase;
import p045Oooooo.o000OO00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO00 f2054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f2055OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Timebase f2056OooO0OO;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f2057OooO00o;

        static {
            int[] iArr = new int[Timebase.values().length];
            f2057OooO00o = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2057OooO00o[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o0OO00OO(@NonNull o000OO00 o000oo01, @Nullable Timebase timebase) {
        this.f2054OooO00o = o000oo01;
        this.f2056OooO0OO = timebase;
    }
}
