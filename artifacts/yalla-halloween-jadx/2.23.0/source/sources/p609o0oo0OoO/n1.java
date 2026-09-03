package p609o0oo0OoO;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaExtractor;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n1 implements p1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f56995OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AssetFileDescriptor f56996OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AssetManager.AssetInputStream f56997OooO0OO;

    public n1(@NotNull AssetManager assetManager, @NotNull String assetsPath) throws IOException {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(assetsPath, "assetsPath");
        this.f56995OooO00o = assetsPath;
        AssetFileDescriptor assetFileDescriptorOpenFd = assetManager.openFd(assetsPath);
        Intrinsics.checkNotNullExpressionValue(assetFileDescriptorOpenFd, "assetManager.openFd(assetsPath)");
        this.f56996OooO0O0 = assetFileDescriptorOpenFd;
        InputStream inputStreamOpen = assetManager.open(assetsPath, 2);
        Intrinsics.checkNotNull(inputStreamOpen, "null cannot be cast to non-null type android.content.res.AssetManager.AssetInputStream");
        this.f56997OooO0OO = (AssetManager.AssetInputStream) inputStreamOpen;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.FileContainer", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("AssetsFileContainer init", "msg");
    }

    @Override // p609o0oo0OoO.p1
    public final void OooO00o() {
    }

    @Override // p609o0oo0OoO.p1
    public final void OooO0O0() throws IOException {
        this.f56997OooO0OO.close();
    }

    @Override // p609o0oo0OoO.p1
    public final void OooO0OO(@NotNull MediaExtractor extractor) throws IOException {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        AssetFileDescriptor assetFileDescriptor = this.f56996OooO0O0;
        if (assetFileDescriptor.getDeclaredLength() < 0) {
            extractor.setDataSource(assetFileDescriptor.getFileDescriptor());
        } else {
            extractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
        }
    }

    @Override // p609o0oo0OoO.p1
    @NotNull
    public final File OooO0Oo() {
        return new File(this.f56995OooO00o);
    }

    @Override // p609o0oo0OoO.p1
    public final void close() throws IOException {
        this.f56996OooO0O0.close();
        this.f56997OooO0OO.close();
    }

    @Override // p609o0oo0OoO.p1
    public final int read(@NotNull byte[] b) {
        Intrinsics.checkNotNullParameter(b, "b");
        return this.f56997OooO0OO.read(b, 0, ConstantsKt.MINIMUM_BLOCK_SIZE);
    }
}
