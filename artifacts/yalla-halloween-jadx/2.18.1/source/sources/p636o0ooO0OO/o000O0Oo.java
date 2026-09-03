package p636o0ooO0OO;

import io.grpc.Internal;
import io.grpc.ManagedChannelProvider;
import io.grpc.internal.GrpcUtil;

/* JADX INFO: loaded from: classes3.dex */
@Internal
public final class o000O0Oo extends ManagedChannelProvider {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f48859OooO0O0 = 0;

    @Override // io.grpc.ManagedChannelProvider
    public final void OooO00o() {
    }

    @Override // io.grpc.ManagedChannelProvider
    public final int OooO0O0() {
        if (!GrpcUtil.f26394OooO00o) {
            boolean z = false;
            try {
                Class.forName("android.app.Application", false, o000O0Oo.class.getClassLoader());
                z = true;
            } catch (Exception unused) {
            }
            if (!z) {
                return 3;
            }
        }
        return 8;
    }
}
