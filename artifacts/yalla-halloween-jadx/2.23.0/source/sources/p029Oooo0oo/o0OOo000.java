package p029Oooo0oo;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.video.internal.BufferProvider;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p607o0oo0OOo.m1;
import p609o0oo0OoO.p1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1329OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1330OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1331OooO0o0;

    public /* synthetic */ o0OOo000(int i, Object obj, Object obj2) {
        this.f1329OooO0Oo = i;
        this.f1331OooO0o0 = obj;
        this.f1330OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1329OooO0Oo;
        Object obj = this.f1330OooO0o;
        Object obj2 = this.f1331OooO0o0;
        switch (i) {
            case 0:
                o0oo0000 o0oo0000Var = (o0oo0000) obj2;
                ImageCaptureException imageCaptureException = (ImageCaptureException) obj;
                boolean z = o0oo0000Var.OooO0Oo() != null;
                boolean z2 = o0oo0000Var.OooO0o() != null;
                if (z && !z2) {
                    Objects.requireNonNull(o0oo0000Var.OooO0Oo());
                    return;
                } else {
                    if (!z2 || z) {
                        throw new IllegalStateException("One and only one callback is allowed.");
                    }
                    ImageCapture.OooOO0 oooOO0OooO0o = o0oo0000Var.OooO0o();
                    Objects.requireNonNull(oooOO0OooO0o);
                    oooOO0OooO0o.OooO00o(imageCaptureException);
                    return;
                }
            case 1:
                ((o00O00o0.OooO00o) obj2).OooO00o((BufferProvider.State) obj);
                return;
            default:
                m1 this$0 = (m1) obj2;
                p1 evaFileContainer = (p1) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(evaFileContainer, "$evaFileContainer");
                this$0.OooO00o(evaFileContainer);
                return;
        }
    }
}
