package p020OooOooo;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.o0ooOOo;
import java.util.Set;
import p022Oooo00O.o00O00o0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O0 implements o0ooOOo.OooO00o {
    @Override // androidx.camera.core.impl.o0ooOOo.OooO00o
    public final o00O00o0 OooO00o(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new o00O00o0(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
