package p358o0OOOooO;

import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.yalla.album.CropImageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f43763OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(CropImageActivity cropImageActivity) {
        super(0);
        this.f43763OooO0Oo = cropImageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CropImageActivity cropImageActivity = this.f43763OooO0Oo;
        MediaEdit mediaEdit = cropImageActivity.f22534OooO0oo;
        if (mediaEdit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEdit");
            mediaEdit = null;
        }
        mediaEdit.enterCrop((int) cropImageActivity.f22536OooOO0O, (int) cropImageActivity.f22537OooOO0o);
        return Unit.INSTANCE;
    }
}
