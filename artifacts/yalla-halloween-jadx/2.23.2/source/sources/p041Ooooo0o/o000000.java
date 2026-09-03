package p041Ooooo0o;

import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import p045Oooooo.OooOOOO;
import p045Oooooo.o000OOo0;
import p045Oooooo.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000000 implements Function {
    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) throws Throwable {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
        if (videoProfileProxy != null) {
            OooOOOO.OooO00o oooO00oOooO0Oo = o000OOo0.OooO0Oo();
            String strOooO = videoProfileProxy.OooO();
            if (strOooO == null) {
                throw new NullPointerException("Null mimeType");
            }
            oooO00oOooO0Oo.f1834OooO00o = strOooO;
            oooO00oOooO0Oo.f1835OooO0O0 = Integer.valueOf(videoProfileProxy.OooOO0());
            oooO00oOooO0Oo.f1837OooO0Oo = new Size(videoProfileProxy.OooOO0O(), videoProfileProxy.OooO0oo());
            oooO00oOooO0Oo.f1840OooO0oO = Integer.valueOf(videoProfileProxy.OooO0o());
            oooO00oOooO0Oo.f1833OooO = Integer.valueOf(videoProfileProxy.OooO0OO());
            Timebase timebase = o000000O.f1750OooO0o0;
            if (timebase == null) {
                throw new NullPointerException("Null inputTimebase");
            }
            oooO00oOooO0Oo.f1836OooO0OO = timebase;
            OooOOOO oooOOOOOooO00o = oooO00oOooO0Oo.OooO00o();
            try {
                o0O0ooO o0o0oooOooO = o0O0ooO.OooO(oooOOOOOooO00o);
                int i = oooOOOOOooO00o.f1824OooO;
                int iIntValue = ((Integer) o0o0oooOooO.OooO0o0().clamp(Integer.valueOf(i))).intValue();
                return iIntValue == i ? videoProfileProxy : EncoderProfilesProxy.VideoProfileProxy.OooO00o(videoProfileProxy.OooO0o0(), videoProfileProxy.OooO(), iIntValue, videoProfileProxy.OooO0o(), videoProfileProxy.OooOO0O(), videoProfileProxy.OooO0oo(), videoProfileProxy.OooOO0(), videoProfileProxy.OooO0O0(), videoProfileProxy.OooO0Oo(), videoProfileProxy.OooO0oO());
            } catch (InvalidConfigException unused) {
            }
        }
        return null;
    }
}
