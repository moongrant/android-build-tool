package p383o0OOooO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.facebook.share.internal.ShareConstants;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.model.media.MediaModel;
import kotlin.jvm.internal.Intrinsics;
import o00O0OOO.OooOO0;
import org.jetbrains.annotations.NotNull;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000OO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0000 implements OooOO0 {
    @Override // o00O0OOO.OooOO0
    public final void OooO00o(@NotNull AlbumActivity activity, @NotNull AlbumItem originItem) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(originItem, "originItem");
        OooOOO0.OooO0O0("WRM AppVideoEngine 跳转视频编辑页面 skipVideoEdit originItem = " + originItem);
        o00000OO o00000oo2 = o0000OO0.f56185OooO0Oo;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o00000oo2 = null;
        }
        o00000oo2.OooO00o(new MediaModel(false, originItem.getContentUri(), null, 4, null), null);
    }
}
