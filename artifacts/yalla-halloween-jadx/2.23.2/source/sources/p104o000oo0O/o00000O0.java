package p104o000oo0O;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
