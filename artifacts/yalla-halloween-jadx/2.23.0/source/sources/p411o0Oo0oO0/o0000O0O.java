package p411o0Oo0oO0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.media.MediaModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000OO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0O extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return oOo00OO0.medalrankingstong_avatar_2;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return oO00OOo0.didi_kit_xbf_test;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) throws IOException {
        Intrinsics.checkNotNull(OooO0O0.OooO0O0());
        String assetsName = new File("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4").getName();
        if (!new File("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4").exists()) {
            Intrinsics.checkNotNullExpressionValue(assetsName, "videoName");
            Intrinsics.checkNotNullParameter(assetsName, "assetsName");
            Intrinsics.checkNotNullParameter("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4", "path");
            AssetFileDescriptor assetFileDescriptorOpenFd = o000O0.OooO00o().getResources().getAssets().openFd(assetsName);
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "Utils.context.resources.assets.openFd(assetsName)");
            new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().transferTo(assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength(), new FileOutputStream("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4").getChannel());
        }
        o00000OO o00000oo2 = o0000OO0.f56185OooO0Oo;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o00000oo2 = null;
        }
        Uri uri = Uri.parse("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(originalPath)");
        o00000oo2.OooO00o(new MediaModel(false, uri, null, 4, null), null);
    }
}
