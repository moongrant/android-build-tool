package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo0oOO0 implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O f3784OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000 f3785OooO0O0;

    public oo0oOO0(@NonNull o0000O o0000o2, @NonNull oo0o0O0 oo0o0o0) {
        this.f3784OooO00o = o0000o2;
        this.f3785OooO0O0 = new o000(oo0o0o0.OooO0OO(p032OoooO00.OooO0OO.class));
    }

    @Override // androidx.camera.core.impl.o0000O
    public final boolean OooO00o(int i) {
        o0000O o0000o2 = this.f3784OooO00o;
        if (!o0000o2.OooO00o(i)) {
            return false;
        }
        o000 o000Var = this.f3785OooO0O0;
        if (!(!o000Var.f3637OooO00o.isEmpty())) {
            return true;
        }
        EncoderProfilesProxy encoderProfilesProxyOooO0O0 = o0000o2.OooO0O0(i);
        if (encoderProfilesProxyOooO0O0 == null) {
            return false;
        }
        if (!(!o000Var.f3637OooO00o.isEmpty())) {
            return !encoderProfilesProxyOooO0O0.OooO0O0().isEmpty();
        }
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyOooO0O0.OooO0O0()) {
            if (o000Var.f3638OooO0O0.contains(new Size(videoProfileProxy.OooOO0O(), videoProfileProxy.OooO0oo()))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.o0000O
    @Nullable
    public final EncoderProfilesProxy OooO0O0(int i) {
        o0000O o0000o2 = this.f3784OooO00o;
        EncoderProfilesProxy encoderProfilesProxyOooO0o0 = null;
        if (!o0000o2.OooO00o(i)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyOooO0O0 = o0000o2.OooO0O0(i);
        o000 o000Var = this.f3785OooO0O0;
        if (!(!o000Var.f3637OooO00o.isEmpty())) {
            return encoderProfilesProxyOooO0O0;
        }
        if (encoderProfilesProxyOooO0O0 != null) {
            if (!o000Var.f3637OooO00o.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyOooO0O0.OooO0O0()) {
                    if (o000Var.f3638OooO0O0.contains(new Size(videoProfileProxy.OooOO0O(), videoProfileProxy.OooO0oo()))) {
                        arrayList.add(videoProfileProxy);
                    }
                }
                if (!arrayList.isEmpty()) {
                    encoderProfilesProxyOooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(encoderProfilesProxyOooO0O0.OooO00o(), encoderProfilesProxyOooO0O0.OooO0OO(), encoderProfilesProxyOooO0O0.OooO0Oo(), arrayList);
                }
            } else {
                encoderProfilesProxyOooO0o0 = encoderProfilesProxyOooO0O0;
            }
        }
        return encoderProfilesProxyOooO0o0;
    }
}
