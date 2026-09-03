package p038OoooOoO;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O0o;
import androidx.camera.core.processing.SurfaceProcessorNode;
import com.google.common.util.concurrent.OooO00o;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o000OO.OooOOO0;
import p030OoooO.OooOo00;
import p030OoooO.Oooo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o000O00 extends o000O0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O.OooO00o f1631OooO0OO;

    public o000O00(@NonNull CameraControlInternal cameraControlInternal, @NonNull o000OO o000oo2) {
        super(cameraControlInternal);
        this.f1631OooO0OO = o000oo2;
    }

    @Override // androidx.camera.core.impl.o000O0o, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final OooO00o<List<Void>> OooO00o(@NonNull List<o000000O> list, int i, int i2) {
        OooOOO0.OooO0O0(list.size() == 1, "Only support one capture config.");
        Integer num = (Integer) list.get(0).f3648OooO0O0.OooOoO(o000000O.f3646OooOO0, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) list.get(0).f3648OooO0O0.OooOoO(o000000O.f3645OooO, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        SurfaceProcessorNode surfaceProcessorNode = ((o0000O) ((o000OO) this.f1631OooO0OO).f1640OooO0Oo).f1622OooOOOo;
        return OooOo00.OooO00o(Collections.singletonList(surfaceProcessorNode != null ? surfaceProcessorNode.f3838OooO00o.OooO0o0(iIntValue, iIntValue2) : new Oooo0.OooO00o(new Exception("Failed to take picture: pipeline is not ready."))));
    }
}
