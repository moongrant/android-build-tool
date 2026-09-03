package p616o0oo0o00;

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

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo000 implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final File f57543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public RandomAccessFile f57544OooO0O0;

    public Oooo000(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f57543OooO00o = file;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.EvaFileContainer", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("FileContainer init", "msg");
        if (file.exists() && file.isFile() && file.canRead()) {
            return;
        }
        throw new FileNotFoundException("Unable to read " + file);
    }

    @Override // p616o0oo0o00.Oooo0
    public final void OooO00o() {
        this.f57544OooO0O0 = new RandomAccessFile(this.f57543OooO00o, "r");
    }

    @Override // p616o0oo0o00.Oooo0
    public final void OooO0O0() throws IOException {
        RandomAccessFile randomAccessFile = this.f57544OooO0O0;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // p616o0oo0o00.Oooo0
    public final void OooO0OO(@NotNull MediaExtractor extractor) throws IOException {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        extractor.setDataSource(this.f57543OooO00o.toString());
    }

    @Override // p616o0oo0o00.Oooo0
    @NotNull
    public final File OooO0Oo() {
        return this.f57543OooO00o;
    }

    @Override // p616o0oo0o00.Oooo0
    public final void close() {
    }

    @Override // p616o0oo0o00.Oooo0
    public final int read(@NotNull byte[] b) {
        Intrinsics.checkNotNullParameter(b, "b");
        RandomAccessFile randomAccessFile = this.f57544OooO0O0;
        if (randomAccessFile != null) {
            return randomAccessFile.read(b, 0, ConstantsKt.MINIMUM_BLOCK_SIZE);
        }
        return -1;
    }
}
