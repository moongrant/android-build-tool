package p026Oooo0o;

import android.view.View;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.yalla.album.CropImageActivity;
import kotlin.jvm.internal.Intrinsics;
import o00O0OOO.OooO0O0;
import p209o00o0oo0.o00O00O;
import p209o00o0oo0.oo0oOO0;
import p245o00oo0o.o0O00;
import p358o0OOOooO.o0000O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements o00O000.OooO0OO, DoubleFunction, o00O00O.OooO0o, OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1079OooO0Oo;

    public /* synthetic */ OooO0o(Object obj) {
        this.f1079OooO0Oo = obj;
    }

    @Override // o00o0oo0.o00O00O.OooO0o
    public final long OooO00o(long j) {
        oo0oOO0 oo0ooo0 = (oo0oOO0) this.f1079OooO0Oo;
        return o0O00.OooOO0((j * ((long) oo0ooo0.f39584OooO0o0)) / AnimationKt.MillisToNanos, 0L, oo0ooo0.f39587OooOO0 - 1);
    }

    @Override // o00O0OOO.OooO0O0
    public final void OooO0O0(View view, Integer num) {
        CropImageActivity this$0 = (CropImageActivity) this.f1079OooO0Oo;
        int i = CropImageActivity.f22529OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num != null && num.intValue() == 1010) {
            this$0.onBackPressed();
            return;
        }
        if (num != null && num.intValue() == 1011) {
            MediaEdit mediaEdit = this$0.f22534OooO0oo;
            if (mediaEdit == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEdit");
                mediaEdit = null;
            }
            mediaEdit.startCrop(new o0000O(this$0));
        }
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        OooOOO0 oooOOO0 = (OooOOO0) this.f1079OooO0Oo;
        oooOOO0.getClass();
        oooOOO0.f1090OooO0Oo.execute(new OooOO0(0, oooOOO0, oooO00o));
        return "addCaptureRequestOptions";
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$8((TransferParameters) this.f1079OooO0Oo, d);
    }
}
