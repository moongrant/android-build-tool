package p039OoooOoo;

import androidx.arch.core.util.Function;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import p028Oooo0oO.o00O0O0;
import p045Oooooo.o000OOo0;
import p045Oooooo.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0oOOo implements Function {
    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        try {
            return o0O0ooO.OooO((o000OOo0) obj);
        } catch (InvalidConfigException e) {
            o00O0O0.OooO("VideoCapture", "Unable to find VideoEncoderInfo", e);
            return null;
        }
    }
}
