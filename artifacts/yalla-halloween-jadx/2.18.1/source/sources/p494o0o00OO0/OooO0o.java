package p494o0o00OO0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.fs.StorageVolume;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41154OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0o f41155OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final File f41156OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final File f41157OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static final File f41158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41159OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41160OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41161OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41162OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41163OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f41164OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41165OooOO0o;

    public static final class OooO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f41166Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context context = OooO0o.f41155OooO00o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("log", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("log", "dirName");
            File file = new File(parentDir, "log");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f41167Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context contextOooO00o = OooO0o.f41155OooO00o.OooO00o();
            String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
            return p494o0o00OO0.OooO0OO.OooO0OO(contextOooO00o, DIRECTORY_DOWNLOADS);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f41168Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context context = OooO0o.f41155OooO00o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("apm_log", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("apm_log", "dirName");
            File file = new File(parentDir, "apm_log");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f41169Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context context = OooO0o.f41155OooO00o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("audio_cache", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.cacheDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("audio_cache", "dirName");
            File file = new File(parentDir, "audio_cache");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* JADX INFO: renamed from: o0o00OO0.OooO0o$OooO0o, reason: collision with other inner class name */
    public static final class C0392OooO0o extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0392OooO0o f41170Oooo0o = new C0392OooO0o();

        public C0392OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context context = OooO0o.f41155OooO00o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("gift_video", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("gift_video", "dirName");
            File file = new File(parentDir, "gift_video");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f41171Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:64:0x010c  */
        /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File externalStoragePublicDirectory;
            File file;
            ArrayList storageVolumes;
            String str;
            OooO0o oooO0o = OooO0o.f41155OooO00o;
            String type = Environment.DIRECTORY_PICTURES;
            Intrinsics.checkNotNullExpressionValue(type, "DIRECTORY_PICTURES");
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                return p494o0o00OO0.OooO0OO.OooO0OO(oooO0o.OooO00o(), type);
            }
            Context context = oooO0o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            if (i < 29) {
                Intrinsics.checkNotNullParameter(type, "type");
                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(type);
                Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(type)");
                if (!Intrinsics.areEqual(o000O00O.OooOO0.OooO00o(externalStoragePublicDirectory), "mounted")) {
                    if (p494o0o00OO0.OooO0OO.f41153OooO00o == null) {
                        p494o0o00OO0.OooO0OO.f41153OooO00o = new com.yalla.yalla.common.fs.OooO0O0(context);
                    }
                    com.yalla.yalla.common.fs.OooO0O0 oooO0O0 = p494o0o00OO0.OooO0OO.f41153OooO00o;
                    if (oooO0O0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("storageImpl");
                        oooO0O0 = null;
                    }
                    Objects.requireNonNull(oooO0O0);
                    List<StorageVolume> list = com.yalla.yalla.common.fs.OooO00o.f20599OooO0OO;
                    if (list != 0) {
                        list.clear();
                    }
                    List<StorageVolume> list2 = com.yalla.yalla.common.fs.OooO00o.f20599OooO0OO;
                    if (list2 == 0 || list2.size() <= 0) {
                        List<StorageVolume> listOooO00o = oooO0O0.OooO00o();
                        com.yalla.yalla.common.fs.OooO00o.f20598OooO0O0 = listOooO00o;
                        if (listOooO00o == null || ((ArrayList) listOooO00o).size() <= 0) {
                            storageVolumes = null;
                        } else {
                            List<StorageVolume> list3 = com.yalla.yalla.common.fs.OooO00o.f20598OooO0O0;
                            List<String> list4 = com.yalla.yalla.common.fs.OooO00o.f20600OooO0Oo;
                            ArrayList arrayList = new ArrayList();
                            for (StorageVolume storageVolume : list3) {
                                if (storageVolume != null && (str = storageVolume.f20604OooO0O0) != null && !str.isEmpty()) {
                                    Iterator<String> it = list4.iterator();
                                    while (it.hasNext()) {
                                        if (storageVolume.f20604OooO0O0.contains(it.next())) {
                                            arrayList.add(storageVolume);
                                            break;
                                        }
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                com.yalla.yalla.common.fs.OooO00o.f20599OooO0OO.addAll(arrayList);
                            }
                            storageVolumes = new ArrayList(com.yalla.yalla.common.fs.OooO00o.f20599OooO0OO);
                        }
                    } else {
                        storageVolumes = new ArrayList(com.yalla.yalla.common.fs.OooO00o.f20599OooO0OO);
                    }
                    if (!storageVolumes.isEmpty()) {
                        Intrinsics.checkNotNullExpressionValue(storageVolumes, "storageVolumes");
                        Iterator it2 = storageVolumes.iterator();
                        while (it2.hasNext()) {
                            if (((StorageVolume) it2.next()).f20603OooO00o) {
                                throw null;
                            }
                        }
                    }
                } else if (!externalStoragePublicDirectory.exists()) {
                    externalStoragePublicDirectory.mkdirs();
                }
                if (externalStoragePublicDirectory != null) {
                    return null;
                }
                file = new File(externalStoragePublicDirectory, "yalla");
                if (!file.exists()) {
                    return file;
                }
                file.mkdirs();
                return file;
            }
            Log.e("YDirectory", "External share path is no longer accessible to apps above Android Q");
            externalStoragePublicDirectory = null;
            if (externalStoragePublicDirectory != null) {
                return null;
            }
            file = new File(externalStoragePublicDirectory, "yalla");
            if (!file.exists()) {
                return file;
            }
            file.mkdirs();
            return file;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f41172Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context context = OooO0o.f41155OooO00o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("room_theme_video", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.cacheDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("room_theme_video", "dirName");
            File file = new File(parentDir, "room_theme_video");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f41173Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            Context context = OooO0o.f41155OooO00o.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("temp_cache", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.cacheDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("temp_cache", "dirName");
            File file = new File(parentDir, "temp_cache");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    static {
        OooO0o oooO0o = new OooO0o();
        f41155OooO00o = oooO0o;
        f41156OooO0O0 = p494o0o00OO0.OooO0OO.OooO00o(oooO0o.OooO00o(), "image_cache");
        f41157OooO0OO = p494o0o00OO0.OooO0OO.OooO00o(oooO0o.OooO00o(), "svga_cache");
        Context contextOooO00o = oooO0o.OooO00o();
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
        f41158OooO0Oo = p494o0o00OO0.OooO0OO.OooO0OO(contextOooO00o, DIRECTORY_PICTURES);
        f41160OooO0o0 = LazyKt.lazy(OooO0OO.f41169Oooo0o);
        f41159OooO0o = LazyKt.lazy(OooO.f41166Oooo0o);
        f41161OooO0oO = LazyKt.lazy(OooO0O0.f41168Oooo0o);
        f41162OooO0oo = LazyKt.lazy(OooO00o.f41167Oooo0o);
        f41154OooO = LazyKt.lazy(OooOO0.f41171Oooo0o);
        f41163OooOO0 = LazyKt.lazy(OooOOO0.f41173Oooo0o);
        f41164OooOO0O = LazyKt.lazy(OooOO0O.f41172Oooo0o);
        f41165OooOO0o = LazyKt.lazy(C0392OooO0o.f41170Oooo0o);
    }

    public final Context OooO00o() {
        Context context = o0000O.f2657OooO00o;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException(d.R);
        return null;
    }

    @NotNull
    public final File OooO0O0(@NotNull String name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        File file = new File(OooO0o0(), name);
        file.createNewFile();
        return file;
    }

    @NotNull
    public final File OooO0OO() {
        return (File) f41160OooO0o0.getValue();
    }

    @Nullable
    public final File OooO0Oo() {
        return (File) f41154OooO.getValue();
    }

    /* JADX INFO: Removed unreachable split cross block B:30:0x0044 */
    @Nullable
    public final String OooO0o(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Build.VERSION.SDK_INT >= 29) {
            return p494o0o00OO0.OooO.OooO00o(OooO00o(), file);
        }
        Context contextOooO00o = OooO00o();
        String absolutePath = file.getAbsolutePath();
        if (contextOooO00o != null && !TextUtils.isEmpty(absolutePath)) {
            try {
                try {
                    Uri uriFromFile = Uri.fromFile(new File(absolutePath));
                    if (uriFromFile != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                            intent.setData(uriFromFile);
                            contextOooO00o.sendBroadcast(intent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return file.getAbsolutePath();
    }

    @NotNull
    public final File OooO0o0() {
        return (File) f41163OooOO0.getValue();
    }
}
