package p389o0OOooOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.facebook.share.internal.ShareConstants;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.model.media.MediaModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p138o00OOOo.OooOO0O;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OO00O;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O0 implements OooOO0O {
    @Override // p138o00OOOo.OooOO0O
    public final void OooO00o(@NotNull AlbumActivity activity, @NotNull AlbumItem originItem) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(originItem, "originItem");
        o0000O00.OooO0O0("WRM AppVideoEngine 跳转视频编辑页面 skipVideoEdit originItem = " + originItem);
        o0OO00O o0oo00o2 = o00000OO.f56401OooO0Oo;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o0oo00o2 = null;
        }
        o0oo00o2.OooO0O0(new MediaModel(false, originItem.getContentUri(), null, 4, null), null);
    }
}
