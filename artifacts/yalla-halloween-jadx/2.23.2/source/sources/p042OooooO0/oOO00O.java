package p042OooooO0;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.OooOOOO;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<Integer> f1797OooO00o = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    @AutoValue.Builder
    public static abstract class OooO00o {
        @NonNull
        public final o00OO00O OooO00o() {
            o00OO00O.OooO00o oooO00o = (o00OO00O.OooO00o) this;
            String strOooO00o = oooO00o.f1784OooO00o == null ? " audioSource" : "";
            if (oooO00o.f1785OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" sampleRate");
            }
            if (oooO00o.f1786OooO0OO == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " channelCount");
            }
            if (oooO00o.f1787OooO0Oo == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " audioFormat");
            }
            if (!strOooO00o.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
            }
            o00OO00O o00oo00o = new o00OO00O(oooO00o.f1784OooO00o.intValue(), oooO00o.f1785OooO0O0.intValue(), oooO00o.f1786OooO0OO.intValue(), oooO00o.f1787OooO0Oo.intValue());
            String strOooO00o2 = o00oo00o.f1780OooO0O0 != -1 ? "" : " audioSource";
            if (o00oo00o.f1781OooO0OO <= 0) {
                strOooO00o2 = strOooO00o2.concat(" sampleRate");
            }
            if (o00oo00o.f1782OooO0Oo <= 0) {
                strOooO00o2 = OooOOOO.OooO00o(strOooO00o2, " channelCount");
            }
            if (o00oo00o.f1783OooO0o0 == -1) {
                strOooO00o2 = OooOOOO.OooO00o(strOooO00o2, " audioFormat");
            }
            if (strOooO00o2.isEmpty()) {
                return o00oo00o;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strOooO00o2));
        }
    }

    public abstract int OooO00o();

    public abstract int OooO0O0();

    public final int OooO0OO() {
        int iOooO00o = OooO00o();
        int iOooO0Oo = OooO0Oo();
        OooOOO0.OooO0O0(iOooO0Oo > 0, "Invalid channel count: " + iOooO0Oo);
        int i = 2;
        if (iOooO00o != 2) {
            i = 3;
            if (iOooO00o == 3) {
                return iOooO0Oo;
            }
            if (iOooO00o != 4) {
                if (iOooO00o != 21) {
                    if (iOooO00o != 22) {
                        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid audio encoding: ", iOooO00o));
                    }
                }
            }
            return iOooO0Oo * 4;
        }
        return iOooO0Oo * i;
    }

    @IntRange(from = 1)
    public abstract int OooO0Oo();

    @IntRange(from = 1)
    public abstract int OooO0o0();
}
