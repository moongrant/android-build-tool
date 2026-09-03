package p416o0Oo0ooo;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.code.android.util.o000O0;
import com.yalla.yalla.download.fs.MediaType;
import com.yalla.yalla.download.fs.StorageVolume;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o0ooOOo;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f45406OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final File f45407OooO00o = com.yalla.yalla.download.fs.OooO0O0.OooO00o(o000O0.OooO00o(), "video_cache");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final File f45408OooO0O0 = com.yalla.yalla.download.fs.OooO0O0.OooO00o(o000O0.OooO00o(), "image_cache");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final File f45409OooO0OO = com.yalla.yalla.download.fs.OooO0O0.OooO00o(o000O0.OooO00o(), "svga_cache");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static final File f45410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f45411OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f45412OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f45413OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f45414OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f45415OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f45416OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f45417OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f45418OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f45419OooOOO0;

    public static final class OooO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f45420OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("gift_video", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("gift_video", "dirName");
            File file2 = new File(parentDir, "gift_video");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f45421OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context contextOooO00o = o000O0.OooO00o();
            String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
            return com.yalla.yalla.download.fs.OooO0O0.OooO0O0(contextOooO00o, DIRECTORY_DOWNLOADS);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f45422OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("apm_log", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("apm_log", "dirName");
            File file2 = new File(parentDir, "apm_log");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f45423OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("audio_cache", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.cacheDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("audio_cache", "dirName");
            File file2 = new File(parentDir, "audio_cache");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f45424OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("enter_room_resource", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("enter_room_resource", "dirName");
            File file2 = new File(parentDir, "enter_room_resource");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f45425OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("log", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.filesDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("log", "dirName");
            File file2 = new File(parentDir, "log");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f45426OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
            return y0.OooO00o(DIRECTORY_PICTURES);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f45427OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("room_theme_video", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.cacheDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("room_theme_video", "dirName");
            File file2 = new File(parentDir, "room_theme_video");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f45428OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            String DIRECTORY_MOVIES = Environment.DIRECTORY_MOVIES;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_MOVIES, "DIRECTORY_MOVIES");
            return y0.OooO00o(DIRECTORY_MOVIES);
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f45429OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = y0.f45407OooO00o;
            Context context = o000O0.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("temp_cache", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "context.cacheDir");
            Intrinsics.checkNotNullParameter(parentDir, "parentDir");
            Intrinsics.checkNotNullParameter("temp_cache", "dirName");
            File file2 = new File(parentDir, "temp_cache");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            return file2;
        }
    }

    static {
        Context contextOooO00o = o000O0.OooO00o();
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
        f45410OooO0Oo = com.yalla.yalla.download.fs.OooO0O0.OooO0O0(contextOooO00o, DIRECTORY_PICTURES);
        f45412OooO0o0 = LazyKt.lazy(OooO0OO.f45423OooO0Oo);
        f45411OooO0o = LazyKt.lazy(OooOO0.f45425OooO0Oo);
        f45413OooO0oO = LazyKt.lazy(OooO0O0.f45422OooO0Oo);
        f45414OooO0oo = LazyKt.lazy(OooO00o.f45421OooO0Oo);
        f45406OooO = LazyKt.lazy(OooOO0O.f45426OooO0Oo);
        f45415OooOO0 = LazyKt.lazy(OooOOO0.f45428OooO0Oo);
        f45416OooOO0O = LazyKt.lazy(OooOOOO.f45429OooO0Oo);
        f45417OooOO0o = LazyKt.lazy(OooOOO.f45427OooO0Oo);
        f45419OooOOO0 = LazyKt.lazy(OooO.f45420OooO0Oo);
        f45418OooOOO = LazyKt.lazy(OooO0o.f45424OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final File OooO00o(String type) {
        File externalStoragePublicDirectory;
        File file;
        ArrayList storageVolumes;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return com.yalla.yalla.download.fs.OooO0O0.OooO0O0(o000O0.OooO00o(), type);
        }
        Context context = o000O0.OooO00o();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        if (i < 29) {
            Intrinsics.checkNotNullParameter(type, "type");
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(type);
            Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(type)");
            if (!Intrinsics.areEqual(o0ooOOo.OooO00o(externalStoragePublicDirectory), "mounted")) {
                if (com.yalla.yalla.download.fs.OooO0O0.f23383OooO00o == null) {
                    com.yalla.yalla.download.fs.OooO0O0.f23383OooO00o = new com.yalla.yalla.download.fs.OooO0OO(context);
                }
                com.yalla.yalla.download.fs.OooO0OO oooO0OO = com.yalla.yalla.download.fs.OooO0O0.f23383OooO00o;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storageImpl");
                    oooO0OO = null;
                }
                oooO0OO.getClass();
                ArrayList arrayList = com.yalla.yalla.download.fs.OooO00o.f23381OooO0OO;
                if (arrayList != null) {
                    arrayList.clear();
                }
                if (arrayList == null || arrayList.size() <= 0) {
                    ArrayList arrayListOooO00o = oooO0OO.OooO00o();
                    com.yalla.yalla.download.fs.OooO00o.f23380OooO0O0 = arrayListOooO00o;
                    if (arrayListOooO00o == null || arrayListOooO00o.size() <= 0) {
                        storageVolumes = null;
                    } else {
                        List<StorageVolume> list = com.yalla.yalla.download.fs.OooO00o.f23380OooO0O0;
                        ArrayList arrayList2 = com.yalla.yalla.download.fs.OooO00o.f23382OooO0Oo;
                        ArrayList arrayList3 = new ArrayList();
                        for (StorageVolume storageVolume : list) {
                            if (storageVolume != null && (str = storageVolume.f23387OooO0O0) != null && !str.isEmpty()) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    if (str.contains((String) it.next())) {
                                        arrayList3.add(storageVolume);
                                        break;
                                    }
                                }
                            }
                        }
                        if (arrayList3.size() > 0) {
                            arrayList.addAll(arrayList3);
                        }
                        storageVolumes = new ArrayList(arrayList);
                    }
                } else {
                    storageVolumes = new ArrayList(arrayList);
                }
                if (!storageVolumes.isEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(storageVolumes, "storageVolumes");
                    Iterator it2 = storageVolumes.iterator();
                    while (it2.hasNext()) {
                        if (((StorageVolume) it2.next()).f23386OooO00o) {
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

    public static void OooO0O0() {
        p390o0Oo.OooO0O0.OooO00o((File) f45416OooOO0O.getValue());
        p390o0Oo.OooO0O0.OooO00o(f45409OooO0OO);
        p390o0Oo.OooO0O0.OooO00o((File) f45412OooO0o0.getValue());
        p390o0Oo.OooO0O0.OooO00o(f45408OooO0O0);
        p390o0Oo.OooO0O0.OooO00o((File) f45414OooO0oo.getValue());
        p390o0Oo.OooO0O0.OooO00o(f45410OooO0Oo);
        p390o0Oo.OooO0O0.OooO00o((File) f45417OooOO0o.getValue());
        p390o0Oo.OooO0O0.OooO00o(f45407OooO00o);
    }

    @NotNull
    public static File OooO0OO() {
        return (File) f45419OooOOO0.getValue();
    }

    @Nullable
    public static String OooO0Oo(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Build.VERSION.SDK_INT >= 29) {
            return z0.OooO00o(o000O0.OooO00o(), file, MediaType.Image);
        }
        p390o0Oo.OooO0OO.OooO00o(o000O0.OooO00o(), file.getAbsolutePath());
        return file.getAbsolutePath();
    }
}
