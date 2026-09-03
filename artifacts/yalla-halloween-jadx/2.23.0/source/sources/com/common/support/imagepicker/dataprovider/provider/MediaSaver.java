package com.common.support.imagepicker.dataprovider.provider;

import OooO0O0.OooO0O0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import androidx.appcompat.widget.o0000O0O;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumVideo;
import com.common.support.imagepicker.dataprovider.utils.MediaScannerUtil;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.common.support.imagepicker.dataprovider.utils.StorageUtil;
import com.common.support.imagepicker.dataprovider.utils.StreamUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003%&'B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001d\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00172\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J#\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver;", "", "()V", "TAG", "", "mediaEditedDirName", "createOutputUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "outputUri", "contentType", "fileName", "input", "Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$BaseInput;", "ensureExternalPath", "Ljava/io/File;", "path", "generateOutputFileName", "timestamp", "", "getExternalPathForType", "getFileNameParts", "", "(Ljava/lang/String;)[Ljava/lang/String;", "getMediaStoreContentUriForType", "pathTaken", "", "dataPath", "sanitizeOutputFileName", "saveMedia", "(Landroid/content/Context;Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$BaseInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMediaDb", "", "updateValues", "Landroid/content/ContentValues;", "mediaUri", "BaseInput", "BitmapInput", "MediaItemInput", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MediaSaver {

    @NotNull
    private static final String TAG = "MediaSaver";

    @NotNull
    public static final MediaSaver INSTANCE = new MediaSaver();

    @NotNull
    private static String mediaEditedDirName = "ImagePicker";

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$BitmapInput;", "Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$BaseInput;", "context", "Landroid/content/Context;", "mimeType", "", "bitmap", "Landroid/graphics/Bitmap;", "outputDir", "Landroid/net/Uri;", "(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Landroid/net/Uri;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "writeInto", "", "outputStream", "Ljava/io/OutputStream;", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class BitmapInput extends BaseInput {

        @NotNull
        private final Bitmap bitmap;

        public /* synthetic */ BitmapInput(Context context, String str, Bitmap bitmap, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, bitmap, (i & 8) != 0 ? null : uri);
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @Override // com.common.support.imagepicker.dataprovider.provider.MediaSaver.BaseInput
        public long writeInto(@NotNull final OutputStream outputStream) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            Bitmap.CompressFormat compressFormat = Intrinsics.areEqual(getContentType(), MediaUtils.IMAGE_PNG) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
            final Ref.LongRef longRef = new Ref.LongRef();
            this.bitmap.compress(compressFormat, 95, new OutputStream() { // from class: com.common.support.imagepicker.dataprovider.provider.MediaSaver$BitmapInput$writeInto$outputStreamProxy$1
                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    outputStream.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    outputStream.flush();
                }

                @Override // java.io.OutputStream
                public void write(int b) throws IOException {
                    outputStream.write(b);
                }

                @Override // java.io.OutputStream
                public void write(@Nullable byte[] b) throws IOException {
                    outputStream.write(b);
                }

                @Override // java.io.OutputStream
                public void write(@Nullable byte[] b, int off, int len) throws IOException {
                    outputStream.write(b, off, len);
                    longRef.element += (long) len;
                }
            });
            return longRef.element;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BitmapInput(@NotNull Context context, @NotNull String mimeType, @NotNull Bitmap bitmap, @Nullable Uri uri) {
            super(context, mimeType, System.currentTimeMillis(), uri);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.bitmap = bitmap;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$MediaItemInput;", "Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$BaseInput;", "context", "Landroid/content/Context;", "item", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "outputDir", "Landroid/net/Uri;", "(Landroid/content/Context;Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Landroid/net/Uri;)V", "getItem", "()Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "putContentValues", "", "contentValues", "Landroid/content/ContentValues;", "writeInto", "", "outputStream", "Ljava/io/OutputStream;", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MediaItemInput extends BaseInput {

        @NotNull
        private final AlbumItem item;

        public /* synthetic */ MediaItemInput(Context context, AlbumItem albumItem, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, albumItem, (i & 4) != 0 ? null : uri);
        }

        @NotNull
        public final AlbumItem getItem() {
            return this.item;
        }

        @Override // com.common.support.imagepicker.dataprovider.provider.MediaSaver.BaseInput
        public void putContentValues(@NotNull ContentValues contentValues) {
            Intrinsics.checkNotNullParameter(contentValues, "contentValues");
            super.putContentValues(contentValues);
            contentValues.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, Integer.valueOf(this.item.getWidth()));
            contentValues.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, Integer.valueOf(this.item.getHeight()));
            if (this.item.isVideo()) {
                AlbumItem albumItem = this.item;
                Intrinsics.checkNotNull(albumItem, "null cannot be cast to non-null type com.common.support.imagepicker.dataprovider.entities.AlbumVideo");
                contentValues.put("duration", Long.valueOf(((AlbumVideo) albumItem).getDuration()));
            }
        }

        @Override // com.common.support.imagepicker.dataprovider.provider.MediaSaver.BaseInput
        public long writeInto(@NotNull OutputStream outputStream) throws FileNotFoundException {
            InputStream inputStreamOpenInputStream;
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            if (Intrinsics.areEqual(this.item.getContentUri().getScheme(), ShareInternalUtility.STAGING_PARAM)) {
                Uri contentUri = this.item.getContentUri();
                Intrinsics.checkNotNullParameter(contentUri, "<this>");
                if (!Intrinsics.areEqual(contentUri.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
                    throw new IllegalArgumentException(o0000O0O.OooO00o("Uri lacks 'file' scheme: ", contentUri).toString());
                }
                String path = contentUri.getPath();
                if (path == null) {
                    throw new IllegalArgumentException(o0000O0O.OooO00o("Uri path is null: ", contentUri).toString());
                }
                inputStreamOpenInputStream = new FileInputStream(new File(path));
            } else {
                inputStreamOpenInputStream = getContext().getContentResolver().openInputStream(this.item.getContentUri());
            }
            if (inputStreamOpenInputStream == null) {
                return 0L;
            }
            try {
                long jCopy = StreamUtil.INSTANCE.copy(inputStreamOpenInputStream, outputStream);
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return jCopy;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaItemInput(@NotNull Context context, @NotNull AlbumItem item, @Nullable Uri uri) {
            super(context, item.getMimeType(), System.currentTimeMillis(), uri);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }
    }

    /* JADX INFO: renamed from: com.common.support.imagepicker.dataprovider.provider.MediaSaver$saveMedia$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.common.support.imagepicker.dataprovider.provider.MediaSaver", f = "MediaSaver.kt", i = {0, 0, 0, 0}, l = {146}, m = "saveMedia", n = {"this", "context", "mediaUri", "updateValues"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaSaver.this.saveMedia(null, null, this);
        }
    }

    private MediaSaver() {
    }

    private final Uri createOutputUri(Context context, Uri outputUri, String contentType, String fileName, BaseInput input) throws IOException {
        String[] fileNameParts = getFileNameParts(fileName);
        int i = 0;
        String str = fileNameParts[0];
        int i2 = 1;
        String str2 = fileNameParts[1];
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
        MediaUtils mediaUtils = MediaUtils.INSTANCE;
        if (mediaUtils.isOctetStream(mimeTypeFromExtension) && mediaUtils.isImageVideoOrAudioType(contentType)) {
            ImagePickerLogUtil.d(TAG, "MimeTypeMap returned octet stream for media, changing to provided content type [" + contentType + "] instead.");
            mimeTypeFromExtension = contentType;
        }
        ContentValues contentValues = new ContentValues();
        input.putContentValues(contentValues);
        contentValues.put("_display_name", fileName);
        contentValues.put("mime_type", mimeTypeFromExtension);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        contentValues.put("date_added", Long.valueOf(timeUnit.toSeconds(System.currentTimeMillis())));
        contentValues.put("date_modified", Long.valueOf(timeUnit.toSeconds(System.currentTimeMillis())));
        if (Build.VERSION.SDK_INT > 28) {
            contentValues.put("is_pending", (Integer) 1);
            contentValues.put("relative_path", Environment.DIRECTORY_DCIM + '/' + mediaEditedDirName);
        } else {
            if (Intrinsics.areEqual(outputUri.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
                String path = outputUri.getPath();
                Intrinsics.checkNotNull(path);
                File file = new File(path);
                File file2 = new File(file, str + '.' + str2);
                while (file2.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('-');
                    i++;
                    sb.append(i);
                    sb.append('.');
                    sb.append(str2);
                    file2 = new File(file, sb.toString());
                }
                if (file2.isHidden()) {
                    throw new IOException("Specified name would not be visible");
                }
                return Uri.fromFile(file2);
            }
            String externalPathForType = getExternalPathForType(contentType);
            if (externalPathForType == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new IOException(OooO0O0.OooO00o(new Object[]{contentType}, 1, "Path for type: %s was not available", "format(format, *args)"));
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String strOooO00o = OooO0O0.OooO00o(new Object[]{externalPathForType, fileName}, 2, o0O00o0.OooO0O0(new StringBuilder("%s/"), mediaEditedDirName, "/%s"), "format(format, *args)");
            while (pathTaken(context, outputUri, strOooO00o)) {
                ImagePickerLogUtil.d(TAG, "The content exists. Rename and check again.");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('-');
                i += i2;
                sb2.append(i);
                sb2.append('.');
                sb2.append(str2);
                String string = sb2.toString();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                strOooO00o = OooO0O0.OooO00o(new Object[]{externalPathForType, string}, 2, o0O00o0.OooO0O0(new StringBuilder("%s/"), mediaEditedDirName, "/%s"), "format(format, *args)");
                i2 = 1;
            }
            contentValues.put("_data", strOooO00o);
        }
        return context.getContentResolver().insert(outputUri, contentValues);
    }

    private final File ensureExternalPath(File path) {
        if (path != null && path.exists()) {
            return path;
        }
        if (path != null) {
            if (path.mkdirs()) {
                return path;
            }
            return null;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
            return externalStoragePublicDirectory;
        }
        return null;
    }

    private final String generateOutputFileName(String contentType, long timestamp) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentType);
        String str = "yl-" + new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.getDefault()).format(Long.valueOf(timestamp));
        if (extensionFromMimeType == null) {
            extensionFromMimeType = "attach";
        }
        return str + '.' + extensionFromMimeType;
    }

    private final String getExternalPathForType(String contentType) {
        File externalStoragePublicDirectory;
        if (StringsKt.Oooo00o(contentType, "video/")) {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        } else if (StringsKt.Oooo00o(contentType, "audio/")) {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
        } else {
            externalStoragePublicDirectory = StringsKt.Oooo00o(contentType, "image/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) : null;
        }
        File fileEnsureExternalPath = ensureExternalPath(externalStoragePublicDirectory);
        if (fileEnsureExternalPath != null) {
            return fileEnsureExternalPath.getAbsolutePath();
        }
        return null;
    }

    private final String[] getFileNameParts(String fileName) {
        String[] strArr = new String[2];
        String[] strArr2 = (String[]) new Regex("\\.(?=[^\\.]+$)").split(fileName, 0).toArray(new String[0]);
        strArr[0] = strArr2[0];
        if (strArr2.length > 1) {
            strArr[1] = strArr2[1];
        } else {
            strArr[1] = "";
        }
        return strArr;
    }

    private final Uri getMediaStoreContentUriForType(String contentType) {
        File externalStorageDirectory;
        if (Build.VERSION.SDK_INT >= 29) {
            if (StringsKt.Oooo00o(contentType, "video/")) {
                return StorageUtil.INSTANCE.getVideoUri();
            }
            if (StringsKt.Oooo00o(contentType, "audio/")) {
                return StorageUtil.INSTANCE.getAudioUri();
            }
            return StringsKt.Oooo00o(contentType, "image/") ? StorageUtil.INSTANCE.getImageUri() : StorageUtil.INSTANCE.getDownloadUri();
        }
        if (StringsKt.Oooo00o(contentType, "video/") || StringsKt.Oooo00o(contentType, "image/")) {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
        } else {
            externalStorageDirectory = StringsKt.Oooo00o(contentType, "audio/") ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        File file = new File(externalStorageDirectory, mediaEditedDirName);
        if (!file.exists()) {
            file.mkdir();
        }
        Uri uriFromFile = Uri.fromFile(file);
        Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(this)");
        return uriFromFile;
    }

    private final boolean pathTaken(Context context, Uri outputUri, String dataPath) throws IOException {
        Cursor cursorQuery = context.getContentResolver().query(outputUri, new String[]{"_data"}, "_data = ?", new String[]{dataPath}, null);
        try {
            if (cursorQuery == null) {
                throw new IOException("Something is wrong with the filename to save");
            }
            boolean zMoveToFirst = cursorQuery.moveToFirst();
            CloseableKt.closeFinally(cursorQuery, null);
            return zMoveToFirst;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }

    private final String sanitizeOutputFileName(String fileName) {
        String name = new File(fileName).getName();
        Intrinsics.checkNotNullExpressionValue(name, "File(fileName).name");
        return name;
    }

    private final void updateMediaDb(ContentValues updateValues, Context context, Uri mediaUri) {
        if (Build.VERSION.SDK_INT > 28) {
            updateValues.put("is_pending", (Integer) 0);
        }
        if (updateValues.size() <= 0 || mediaUri == null) {
            return;
        }
        context.getContentResolver().update(mediaUri, updateValues, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    @Nullable
    public final Object saveMedia(@NotNull Context context, @NotNull BaseInput baseInput, @NotNull Continuation<? super Uri> continuation) throws IOException {
        AnonymousClass1 anonymousClass1;
        Uri uriCreateOutputUri;
        ContentValues contentValues;
        Object objScanFile;
        MediaSaver mediaSaver;
        Context context2 = context;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = anonymousClass2.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!StorageUtil.INSTANCE.canWriteToMediaStore(context2)) {
                    ImagePickerLogUtil.d(TAG, "saveMedia: no storage permission.");
                    return null;
                }
                String correctedMimeType = MediaUtils.INSTANCE.getCorrectedMimeType(baseInput.getContentType());
                String strSanitizeOutputFileName = sanitizeOutputFileName(generateOutputFileName(correctedMimeType, baseInput.getDate()));
                Uri outputDir = baseInput.getOutputDir();
                if (outputDir == null) {
                    outputDir = getMediaStoreContentUriForType(correctedMimeType);
                }
                Uri uri = outputDir;
                ImagePickerLogUtil.d(TAG, "saveMedia: outputUri=" + uri);
                uriCreateOutputUri = createOutputUri(context, uri, correctedMimeType, strSanitizeOutputFileName, baseInput);
                ImagePickerLogUtil.d(TAG, "saveMedia: mediaUri=" + uriCreateOutputUri);
                contentValues = new ContentValues();
                if (uriCreateOutputUri == null) {
                    ImagePickerLogUtil.INSTANCE.w(TAG, "Failed to create mediaUri for " + correctedMimeType);
                    return null;
                }
                if (!Intrinsics.areEqual(uri.getScheme(), ShareInternalUtility.STAGING_PARAM)) {
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriCreateOutputUri, "w");
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            long jWriteInto = baseInput.writeInto(outputStreamOpenOutputStream);
                            if (jWriteInto > 0) {
                                contentValues.put("_size", Boxing.boxLong(jWriteInto));
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(outputStreamOpenOutputStream, th);
                                throw th2;
                            }
                        }
                    }
                    updateMediaDb(contentValues, context2, uriCreateOutputUri);
                    return uriCreateOutputUri;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(uriCreateOutputUri.getPath());
                baseInput.writeInto(fileOutputStream);
                MediaScannerUtil mediaScannerUtil = MediaScannerUtil.INSTANCE;
                String path = uriCreateOutputUri.getPath();
                Intrinsics.checkNotNull(path);
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = context2;
                anonymousClass2.L$2 = uriCreateOutputUri;
                anonymousClass2.L$3 = contentValues;
                anonymousClass2.L$4 = fileOutputStream;
                anonymousClass2.label = 1;
                objScanFile = mediaScannerUtil.scanFile(context2, new String[]{path}, new String[]{correctedMimeType}, anonymousClass2);
                if (objScanFile == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mediaSaver = this;
                r2 = fileOutputStream;
            } else {
                if (r2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable = (Closeable) anonymousClass2.L$4;
                ContentValues contentValues2 = (ContentValues) anonymousClass2.L$3;
                uriCreateOutputUri = (Uri) anonymousClass2.L$2;
                Context context3 = (Context) anonymousClass2.L$1;
                mediaSaver = (MediaSaver) anonymousClass2.L$0;
                ResultKt.throwOnFailure(obj);
                contentValues = contentValues2;
                context2 = context3;
                objScanFile = obj;
                r2 = closeable;
            }
            Uri uri2 = (Uri) objScanFile;
            CloseableKt.closeFinally(r2, null);
            mediaSaver.updateMediaDb(contentValues, context2, uriCreateOutputUri);
            return uri2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(r2, th3);
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/provider/MediaSaver$BaseInput;", "", "context", "Landroid/content/Context;", "contentType", "", "date", "", "outputDir", "Landroid/net/Uri;", "(Landroid/content/Context;Ljava/lang/String;JLandroid/net/Uri;)V", "getContentType", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "getDate", "()J", "getOutputDir", "()Landroid/net/Uri;", "putContentValues", "", "contentValues", "Landroid/content/ContentValues;", "save", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeInto", "outputStream", "Ljava/io/OutputStream;", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class BaseInput {

        @NotNull
        private final String contentType;

        @NotNull
        private final Context context;
        private final long date;

        @Nullable
        private final Uri outputDir;

        public BaseInput(@NotNull Context context, @NotNull String contentType, long j, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            this.context = context;
            this.contentType = contentType;
            this.date = j;
            this.outputDir = uri;
        }

        @NotNull
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        public final long getDate() {
            return this.date;
        }

        @Nullable
        public final Uri getOutputDir() {
            return this.outputDir;
        }

        public void putContentValues(@NotNull ContentValues contentValues) {
            Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object save(@NotNull Continuation<? super Uri> continuation) {
            MediaSaver$BaseInput$save$1 mediaSaver$BaseInput$save$1;
            Object objM4213constructorimpl;
            if (continuation instanceof MediaSaver$BaseInput$save$1) {
                mediaSaver$BaseInput$save$1 = (MediaSaver$BaseInput$save$1) continuation;
                int i = mediaSaver$BaseInput$save$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    mediaSaver$BaseInput$save$1.label = i - Integer.MIN_VALUE;
                } else {
                    mediaSaver$BaseInput$save$1 = new MediaSaver$BaseInput$save$1(this, continuation);
                }
            } else {
                mediaSaver$BaseInput$save$1 = new MediaSaver$BaseInput$save$1(this, continuation);
            }
            Object objSaveMedia = mediaSaver$BaseInput$save$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = mediaSaver$BaseInput$save$1.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objSaveMedia);
                    Result.Companion companion = Result.INSTANCE;
                    MediaSaver mediaSaver = MediaSaver.INSTANCE;
                    Context context = this.context;
                    mediaSaver$BaseInput$save$1.label = 1;
                    objSaveMedia = mediaSaver.saveMedia(context, this, mediaSaver$BaseInput$save$1);
                    if (objSaveMedia == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSaveMedia);
                }
                objM4213constructorimpl = Result.m4213constructorimpl((Uri) objSaveMedia);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m4219isFailureimpl(objM4213constructorimpl)) {
                return null;
            }
            return objM4213constructorimpl;
        }

        public abstract long writeInto(@NotNull OutputStream outputStream);

        public /* synthetic */ BaseInput(Context context, String str, long j, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, j, (i & 8) != 0 ? null : uri);
        }
    }
}
