package p029Oooo0oo;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import com.common.support.imagepicker.mediaedit.utils.OffScreenRender;
import com.twitter.sdk.android.core.OooO0O0;
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.models.OooOo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OOO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1299OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1300OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1301OooO0o0;

    public /* synthetic */ o0OOO0OO(int i, Object obj, Object obj2) {
        this.f1299OooO0Oo = i;
        this.f1301OooO0o0 = obj;
        this.f1300OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1299OooO0Oo;
        Object obj = this.f1300OooO0o;
        Object obj2 = this.f1301OooO0o0;
        switch (i) {
            case 0:
                o0OOOO00 o0oooo01 = (o0OOOO00) obj2;
                ImageCaptureException imageCaptureException = (ImageCaptureException) obj;
                boolean z = o0oooo01.OooO0Oo() != null;
                boolean z2 = o0oooo01.OooO0o() != null;
                if (z && !z2) {
                    Objects.requireNonNull(o0oooo01.OooO0Oo());
                    return;
                } else {
                    if (!z2 || z) {
                        throw new IllegalStateException("One and only one callback is allowed.");
                    }
                    ImageCapture.OooOO0 oooOO0OooO0o = o0oooo01.OooO0o();
                    Objects.requireNonNull(oooOO0OooO0o);
                    oooOO0OooO0o.OooO00o(imageCaptureException);
                    return;
                }
            case 1:
                OffScreenRender.decodeBitmap$lambda$1$lambda$0((OffScreenRender.LoadTask) obj2, (Bitmap) obj);
                return;
            default:
                ((OooO0O0) obj2).OooO0Oo(new Oooo0((OooOo) obj, null));
                return;
        }
    }
}
