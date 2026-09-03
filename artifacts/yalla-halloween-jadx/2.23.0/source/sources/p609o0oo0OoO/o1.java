package p609o0oo0OoO;

import android.media.MediaExtractor;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o1 implements p1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final File f56998OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f56999OooO0O0;

    public o1(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f56998OooO00o = file;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaFileContainer", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("FileContainer init", "msg");
        if (file.exists() && file.isFile() && file.canRead()) {
            return;
        }
        throw new FileNotFoundException("Unable to read " + file);
    }

    @Override // p609o0oo0OoO.p1
    public final void OooO00o() {
        this.f56999OooO0O0 = new RandomAccessFile(this.f56998OooO00o, "r");
    }

    @Override // p609o0oo0OoO.p1
    public final void OooO0O0() throws IOException {
        RandomAccessFile randomAccessFile = this.f56999OooO0O0;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // p609o0oo0OoO.p1
    public final void OooO0OO(@NotNull MediaExtractor extractor) throws IOException {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        extractor.setDataSource(this.f56998OooO00o.toString());
    }

    @Override // p609o0oo0OoO.p1
    @NotNull
    public final File OooO0Oo() {
        return this.f56998OooO00o;
    }

    @Override // p609o0oo0OoO.p1
    public final void close() {
    }

    @Override // p609o0oo0OoO.p1
    public final int read(@NotNull byte[] b) {
        Intrinsics.checkNotNullParameter(b, "b");
        RandomAccessFile randomAccessFile = this.f56999OooO0O0;
        if (randomAccessFile != null) {
            return randomAccessFile.read(b, 0, ConstantsKt.MINIMUM_BLOCK_SIZE);
        }
        return -1;
    }
}
