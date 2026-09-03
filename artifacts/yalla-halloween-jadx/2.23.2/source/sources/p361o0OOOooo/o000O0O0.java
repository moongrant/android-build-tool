package p361o0OOOooo;

import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.yalla.album.CropImageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f42980OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(CropImageActivity cropImageActivity) {
        super(0);
        this.f42980OooO0Oo = cropImageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CropImageActivity cropImageActivity = this.f42980OooO0Oo;
        MediaEdit mediaEdit = cropImageActivity.f22061OooO0oo;
        if (mediaEdit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEdit");
            mediaEdit = null;
        }
        mediaEdit.enterCrop((int) cropImageActivity.f22063OooOO0O, (int) cropImageActivity.f22064OooOO0o);
        return Unit.INSTANCE;
    }
}
