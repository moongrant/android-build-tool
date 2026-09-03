package p417o0Oo0oo0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.model.media.MediaModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0 extends AbstractKit {
    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getIcon() {
        return o0Oo0oo.medalrankingstong_avatar_2;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final int getName() {
        return o000000.didi_kit_xbf_test;
    }

    @Override // com.didichuxing.doraemonkit.kit.IKit
    public final void onAppInit(@Nullable Context context) {
    }

    @Override // com.didichuxing.doraemonkit.kit.AbstractKit, com.didichuxing.doraemonkit.kit.IKit
    public final void onClick(@Nullable Context context) throws IOException {
        Intrinsics.checkNotNull(OooO0O0.OooO0O0());
        String assetsName = new File("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4").getName();
        if (!new File("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4").exists()) {
            Intrinsics.checkNotNull(assetsName);
            Intrinsics.checkNotNullParameter(assetsName, "assetsName");
            Intrinsics.checkNotNullParameter("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4", "path");
            AssetFileDescriptor assetFileDescriptorOpenFd = o000O00O.OooO00o().getResources().getAssets().openFd(assetsName);
            Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "openFd(...)");
            new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().transferTo(assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength(), new FileOutputStream("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4").getChannel());
        }
        o0OO00O o0oo00o2 = o00000OO.f56401OooO0Oo;
        if (o0oo00o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o0oo00o2 = null;
        }
        Uri uri = Uri.parse("/storage/emulated/0/Android/data/com.weieyu.yalla/cache/YallaMedia/shuguang_1080_17s.mp4");
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        o0oo00o2.OooO0O0(new MediaModel(false, uri, null, 4, null), null);
    }
}
