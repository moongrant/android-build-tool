package p358o0OOOooO;

import android.widget.ImageView;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.common.support.imagepicker.preview.component.image.entities.ImageParamEntity;
import com.common.support.imagepicker.preview.config.Preview;
import com.yalla.album.CropImageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function2<ImageView, MediaEditSource, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f43786OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(CropImageActivity cropImageActivity) {
        super(2);
        this.f43786OooO0Oo = cropImageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ImageView imageView, MediaEditSource mediaEditSource) {
        ImageView imageView2 = imageView;
        MediaEditSource source = mediaEditSource;
        Intrinsics.checkNotNullParameter(imageView2, "imageView");
        Intrinsics.checkNotNullParameter(source, "source");
        Preview preview = this.f43786OooO0Oo.f22533OooO0oO;
        if (preview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreview");
            preview = null;
        }
        preview.getImageEngine().loadResource(imageView2, source.getOriginItem(), new ImageParamEntity(null, null, 0, 0L, 15, null));
        return Unit.INSTANCE;
    }
}
