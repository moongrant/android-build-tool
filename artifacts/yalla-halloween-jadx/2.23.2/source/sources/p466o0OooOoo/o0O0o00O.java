package p466o0OooOoo;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import com.code.android.util.o000O00O;
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
import p063o0000oO.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47843OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final File f47844OooO00o = com.yalla.yalla.download.fs.OooO0O0.OooO00o(o000O00O.OooO00o(), "video_cache");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final File f47845OooO0O0 = com.yalla.yalla.download.fs.OooO0O0.OooO00o(o000O00O.OooO00o(), "image_cache");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final File f47846OooO0OO = com.yalla.yalla.download.fs.OooO0O0.OooO00o(o000O00O.OooO00o(), "svga_cache");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static final File f47847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47848OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47849OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47850OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47851OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47852OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f47853OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47854OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47855OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47856OooOOO0;

    public static final class OooO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f47857OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("gift_video", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getFilesDir(...)");
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
        public static final OooO00o f47858OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context contextOooO00o = o000O00O.OooO00o();
            String DIRECTORY_DOWNLOADS = Environment.DIRECTORY_DOWNLOADS;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_DOWNLOADS, "DIRECTORY_DOWNLOADS");
            return com.yalla.yalla.download.fs.OooO0O0.OooO0O0(contextOooO00o, DIRECTORY_DOWNLOADS);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47859OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("apm_log", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getFilesDir(...)");
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
        public static final OooO0OO f47860OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("audio_cache", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getCacheDir(...)");
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
        public static final OooO0o f47861OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("enter_room_resource", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getFilesDir(...)");
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
        public static final OooOO0 f47862OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("log", "dirName");
            File parentDir = context.getFilesDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getFilesDir(...)");
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
        public static final OooOO0O f47863OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
            return o0O0o00O.OooO00o(DIRECTORY_PICTURES);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f47864OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("room_theme_video", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getCacheDir(...)");
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
        public static final OooOOO0 f47865OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            String DIRECTORY_MOVIES = Environment.DIRECTORY_MOVIES;
            Intrinsics.checkNotNullExpressionValue(DIRECTORY_MOVIES, "DIRECTORY_MOVIES");
            return o0O0o00O.OooO00o(DIRECTORY_MOVIES);
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<File> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f47866OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = o0O0o00O.f47844OooO00o;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter("temp_cache", "dirName");
            File parentDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(parentDir, "getCacheDir(...)");
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
        Context contextOooO00o = o000O00O.OooO00o();
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        Intrinsics.checkNotNullExpressionValue(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
        f47847OooO0Oo = com.yalla.yalla.download.fs.OooO0O0.OooO0O0(contextOooO00o, DIRECTORY_PICTURES);
        f47849OooO0o0 = LazyKt.lazy(OooO0OO.f47860OooO0Oo);
        f47848OooO0o = LazyKt.lazy(OooOO0.f47862OooO0Oo);
        f47850OooO0oO = LazyKt.lazy(OooO0O0.f47859OooO0Oo);
        f47851OooO0oo = LazyKt.lazy(OooO00o.f47858OooO0Oo);
        f47843OooO = LazyKt.lazy(OooOO0O.f47863OooO0Oo);
        f47852OooOO0 = LazyKt.lazy(OooOOO0.f47865OooO0Oo);
        f47853OooOO0O = LazyKt.lazy(OooOOOO.f47866OooO0Oo);
        f47854OooOO0o = LazyKt.lazy(OooOOO.f47864OooO0Oo);
        f47856OooOOO0 = LazyKt.lazy(OooO.f47857OooO0Oo);
        f47855OooOOO = LazyKt.lazy(OooO0o.f47861OooO0Oo);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final File OooO00o(String type) {
        File externalStoragePublicDirectory;
        File file;
        ArrayList arrayList;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return com.yalla.yalla.download.fs.OooO0O0.OooO0O0(o000O00O.OooO00o(), type);
        }
        Context context = o000O00O.OooO00o();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        if (i < 29) {
            Intrinsics.checkNotNullParameter(type, "type");
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(type);
            Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
            if (!Intrinsics.areEqual(o00Oo0.OooO00o(externalStoragePublicDirectory), "mounted")) {
                if (com.yalla.yalla.download.fs.OooO0O0.f22914OooO00o == null) {
                    com.yalla.yalla.download.fs.OooO0O0.f22914OooO00o = new com.yalla.yalla.download.fs.OooO0OO(context);
                }
                com.yalla.yalla.download.fs.OooO0OO oooO0OO = com.yalla.yalla.download.fs.OooO0O0.f22914OooO00o;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storageImpl");
                    oooO0OO = null;
                }
                oooO0OO.getClass();
                ArrayList arrayList2 = com.yalla.yalla.download.fs.OooO00o.f22912OooO0OO;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                if (arrayList2 == null || arrayList2.size() <= 0) {
                    ArrayList arrayListOooO00o = oooO0OO.OooO00o();
                    com.yalla.yalla.download.fs.OooO00o.f22911OooO0O0 = arrayListOooO00o;
                    if (arrayListOooO00o == null || arrayListOooO00o.size() <= 0) {
                        arrayList = null;
                    } else {
                        List<StorageVolume> list = com.yalla.yalla.download.fs.OooO00o.f22911OooO0O0;
                        ArrayList arrayList3 = com.yalla.yalla.download.fs.OooO00o.f22913OooO0Oo;
                        ArrayList arrayList4 = new ArrayList();
                        for (StorageVolume storageVolume : list) {
                            if (storageVolume != null && (str = storageVolume.f22918OooO0O0) != null && !str.isEmpty()) {
                                Iterator it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    if (str.contains((String) it.next())) {
                                        arrayList4.add(storageVolume);
                                        break;
                                    }
                                }
                            }
                        }
                        if (arrayList4.size() > 0) {
                            arrayList2.addAll(arrayList4);
                        }
                        arrayList = new ArrayList(arrayList2);
                    }
                } else {
                    arrayList = new ArrayList(arrayList2);
                }
                if (!arrayList.isEmpty()) {
                    Intrinsics.checkNotNull(arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((StorageVolume) it2.next()).f22917OooO00o) {
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
        p421o0OoO000.OooOO0O.OooO00o((File) f47853OooOO0O.getValue());
        p421o0OoO000.OooOO0O.OooO00o(f47846OooO0OO);
        p421o0OoO000.OooOO0O.OooO00o((File) f47849OooO0o0.getValue());
        p421o0OoO000.OooOO0O.OooO00o(f47845OooO0O0);
        p421o0OoO000.OooOO0O.OooO00o((File) f47851OooO0oo.getValue());
        p421o0OoO000.OooOO0O.OooO00o(f47847OooO0Oo);
        p421o0OoO000.OooOO0O.OooO00o((File) f47854OooOO0o.getValue());
        p421o0OoO000.OooOO0O.OooO00o(f47844OooO00o);
    }

    @NotNull
    public static File OooO0OO() {
        return (File) f47856OooOOO0.getValue();
    }

    @Nullable
    public static String OooO0Oo(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Build.VERSION.SDK_INT >= 29) {
            return o0O0o0.OooO00o(o000O00O.OooO00o(), file, MediaType.Image);
        }
        p421o0OoO000.OooOOO0.OooO00o(o000O00O.OooO00o(), file.getAbsolutePath());
        return file.getAbsolutePath();
    }
}
