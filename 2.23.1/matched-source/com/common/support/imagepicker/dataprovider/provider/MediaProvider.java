package com.common.support.imagepicker.dataprovider.provider;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.common.support.imagepicker.dataprovider.config.AlbumQueryMode;
import com.common.support.imagepicker.dataprovider.entities.AlbumImage;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.common.support.imagepicker.dataprovider.entities.AlbumVideo;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J/\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J#\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/provider/MediaProvider;", "", "()V", "EXCLUDE_GIF_SELECTION", "", "TAG", SearchIntents.EXTRA_QUERY, "", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumSource;", "context", "Landroid/content/Context;", "mode", "Lcom/common/support/imagepicker/dataprovider/config/AlbumQueryMode;", "queryAllImages", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumImage;", "isExcludedGif", "", "queryAllVideos", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumVideo;", "saveImage", "Landroid/net/Uri;", "image", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/content/Context;Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToAlbum", "item", "(Landroid/content/Context;Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveVideo", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO, "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaProvider.kt\ncom/common/support/imagepicker/dataprovider/provider/MediaProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1011#2,2:355\n1855#2,2:357\n*S KotlinDebug\n*F\n+ 1 MediaProvider.kt\ncom/common/support/imagepicker/dataprovider/provider/MediaProvider\n*L\n97#1:355,2\n100#1:357,2\n*E\n"})
public final class MediaProvider {

    @NotNull
    private static final String EXCLUDE_GIF_SELECTION = "mime_type NOT IN ('image/gif')";

    @NotNull
    public static final MediaProvider INSTANCE = new MediaProvider();

    @NotNull
    private static final String TAG = "MediaProvider";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AlbumQueryMode.values().length];
            try {
                iArr[AlbumQueryMode.QUERY_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlbumQueryMode.QUERY_IMAGES_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlbumQueryMode.QUERY_STATIC_IMAGES_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlbumQueryMode.QUERY_VIDEO_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AlbumItemType.values().length];
            try {
                iArr2[AlbumItemType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AlbumItemType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.common.support.imagepicker.dataprovider.provider.MediaProvider$saveImage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.common.support.imagepicker.dataprovider.provider.MediaProvider", f = "MediaProvider.kt", i = {}, l = {344, 346}, m = "saveImage", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return MediaProvider.this.saveImage(null, null, null, this);
        }
    }

    private MediaProvider() {
    }

    public static /* synthetic */ List query$default(MediaProvider mediaProvider, Context context, AlbumQueryMode albumQueryMode, int i, Object obj) {
        if ((i & 2) != 0) {
            albumQueryMode = AlbumQueryMode.QUERY_ALL;
        }
        return mediaProvider.query(context, albumQueryMode);
    }

    private final List<AlbumImage> queryAllImages(Context context, boolean isExcludedGif) {
        String string;
        String str;
        int i;
        String string2;
        String str2;
        String string3;
        String str3;
        String string4;
        String str4;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", ShareConstants.WEB_DIALOG_PARAM_TITLE, "_display_name", "_size", "orientation", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "mime_type", "date_modified", "bucket_id", "bucket_display_name"}, isExcludedGif ? "_size > ?AND mime_type NOT IN ('image/gif')" : "_size > ?", new String[]{AppEventsConstants.EVENT_PARAM_VALUE_NO}, "date_modified DESC");
        ImagePickerLogUtil.d(TAG, "all images cursor size is " + (cursorQuery != null ? Integer.valueOf(cursorQuery.getCount()) : null));
        ArrayList arrayList = new ArrayList();
        if (cursorQuery != null) {
            try {
                try {
                    ImagePickerLogUtil.d(TAG, "all images cursor size is " + cursorQuery.getCount());
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    int columnIndex2 = cursorQuery.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                    int columnIndex3 = cursorQuery.getColumnIndex("_display_name");
                    int columnIndex4 = cursorQuery.getColumnIndex("_size");
                    int columnIndex5 = cursorQuery.getColumnIndex("orientation");
                    int columnIndex6 = cursorQuery.getColumnIndex(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                    int columnIndex7 = cursorQuery.getColumnIndex(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                    int columnIndex8 = cursorQuery.getColumnIndex("mime_type");
                    int columnIndex9 = cursorQuery.getColumnIndex("date_modified");
                    int columnIndex10 = cursorQuery.getColumnIndex("bucket_id");
                    int columnIndex11 = cursorQuery.getColumnIndex("bucket_display_name");
                    while (cursorQuery.moveToNext()) {
                        long j = columnIndex == -1 ? 0L : cursorQuery.getLong(columnIndex);
                        if (columnIndex2 == -1 || (string = cursorQuery.getString(columnIndex2)) == null) {
                            i = -1;
                            str = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(titleColumn) ?: \"\"");
                            str = string;
                            i = -1;
                        }
                        if (columnIndex3 == i || (string2 = cursorQuery.getString(columnIndex3)) == null) {
                            str2 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(nameColumn) ?: \"\"");
                            str2 = string2;
                        }
                        long j2 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                        int i2 = columnIndex5 == -1 ? 0 : cursorQuery.getInt(columnIndex5);
                        int i3 = columnIndex6 == -1 ? 0 : cursorQuery.getInt(columnIndex6);
                        int i4 = columnIndex7 == -1 ? 0 : cursorQuery.getInt(columnIndex7);
                        if (columnIndex8 == -1 || (string3 = cursorQuery.getString(columnIndex8)) == null) {
                            str3 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(mimeTypeColumn) ?: \"\"");
                            str3 = string3;
                        }
                        long j3 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                        long j4 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                        if (columnIndex11 == -1 || (string4 = cursorQuery.getString(columnIndex11)) == null) {
                            str4 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(bucketNameColumn) ?: \"\"");
                            str4 = string4;
                        }
                        int i5 = columnIndex2;
                        long j5 = j;
                        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j5);
                        int i6 = columnIndex3;
                        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
                        boolean z = i2 == 90 || i2 == 270;
                        arrayList.add(new AlbumImage(j5, uriWithAppendedId, str, str2, j2, z ? i4 : i3, z ? i3 : i4, str3, j3, j4, str4));
                        columnIndex2 = i5;
                        columnIndex3 = i6;
                        columnIndex = columnIndex;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursorQuery, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    ImagePickerLogUtil.e(TAG, th3);
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public static /* synthetic */ List queryAllImages$default(MediaProvider mediaProvider, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return mediaProvider.queryAllImages(context, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    private final List<AlbumVideo> queryAllVideos(Context context) {
        String str;
        Throwable th;
        String str2;
        String string;
        String str3;
        String string2;
        String str4;
        int i;
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", ShareConstants.WEB_DIALOG_PARAM_TITLE, "_display_name", "_size", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "album", "date_modified", "duration", "bucket_id", "bucket_display_name", "mime_type"}, "_size > ?", new String[]{AppEventsConstants.EVENT_PARAM_VALUE_NO}, "date_modified DESC");
        String str5 = "all video cursor size is " + (cursorQuery != null ? Integer.valueOf(cursorQuery.getCount()) : null);
        String str6 = TAG;
        ImagePickerLogUtil.d(TAG, str5);
        ArrayList arrayList = new ArrayList();
        try {
            if (cursorQuery != null) {
                try {
                    int columnIndex = cursorQuery.getColumnIndex("_id");
                    int columnIndex2 = cursorQuery.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE);
                    int columnIndex3 = cursorQuery.getColumnIndex("_display_name");
                    int columnIndex4 = cursorQuery.getColumnIndex("_size");
                    int columnIndex5 = cursorQuery.getColumnIndex(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
                    int columnIndex6 = cursorQuery.getColumnIndex(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
                    int columnIndex7 = cursorQuery.getColumnIndex("orientation");
                    int columnIndex8 = cursorQuery.getColumnIndex("mime_type");
                    int columnIndex9 = cursorQuery.getColumnIndex("date_modified");
                    int columnIndex10 = cursorQuery.getColumnIndex("duration");
                    int columnIndex11 = cursorQuery.getColumnIndex("bucket_id");
                    int columnIndex12 = cursorQuery.getColumnIndex("bucket_display_name");
                    str6 = str6;
                    while (cursorQuery.moveToNext()) {
                        ArrayList arrayList2 = arrayList;
                        str = str6;
                        try {
                            long j = cursorQuery.getLong(columnIndex);
                            int i2 = -1;
                            if (columnIndex2 == -1) {
                                columnIndex = columnIndex;
                                str2 = "";
                            } else {
                                String string3 = cursorQuery.getString(columnIndex2);
                                if (string3 == null) {
                                    str2 = "";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(titleColumn) ?: \"\"");
                                    str2 = string3;
                                }
                                i2 = -1;
                            }
                            if (columnIndex3 == i2 || (string = cursorQuery.getString(columnIndex3)) == null) {
                                str3 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(nameColumn) ?: \"\"");
                                str3 = string;
                            }
                            long j2 = columnIndex4 == -1 ? 0L : cursorQuery.getLong(columnIndex4);
                            int i3 = columnIndex5 == -1 ? 0 : cursorQuery.getInt(columnIndex5);
                            int i4 = columnIndex6 == -1 ? 0 : cursorQuery.getInt(columnIndex6);
                            if (columnIndex8 == -1 || (string2 = cursorQuery.getString(columnIndex8)) == null) {
                                string2 = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(mimeTypeColumn) ?: \"\"");
                            }
                            long j3 = columnIndex9 == -1 ? 0L : cursorQuery.getLong(columnIndex9);
                            long j4 = columnIndex10 == -1 ? 0L : cursorQuery.getLong(columnIndex10);
                            long j5 = columnIndex11 == -1 ? 0L : cursorQuery.getLong(columnIndex11);
                            if (columnIndex12 == -1) {
                                str4 = "";
                            } else {
                                String string4 = cursorQuery.getString(columnIndex12);
                                if (string4 == null) {
                                    str4 = "UNKNOWN";
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(bucketNameColumn) ?: \"UNKNOWN\"");
                                    str4 = string4;
                                }
                            }
                            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j);
                            Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(MediaStor…EXTERNAL_CONTENT_URI, id)");
                            if (columnIndex7 != -1) {
                                try {
                                    i = cursorQuery.getInt(columnIndex7);
                                } catch (Throwable th2) {
                                    th = th2;
                                    arrayList = arrayList2;
                                    context = str;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(cursorQuery, th);
                                        throw th3;
                                    }
                                }
                            } else {
                                i = 0;
                            }
                            boolean z = i == 90 || i == 270;
                            int i5 = z ? i4 : i3;
                            if (z) {
                                i4 = i3;
                            }
                            AlbumVideo albumVideo = new AlbumVideo(j, uriWithAppendedId, str2, str3, j2, i5, i4, string2, j3, j5, str4, j4);
                            arrayList = arrayList2;
                            try {
                                arrayList.add(albumVideo);
                                str6 = str;
                                columnIndex = columnIndex;
                                columnIndex2 = columnIndex2;
                                columnIndex3 = columnIndex3;
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                context = str;
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            arrayList = arrayList2;
                            th = th;
                            context = str;
                            throw th;
                        }
                    }
                    str = str6;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th6) {
                    th = th6;
                    str = str6;
                }
            }
            if (cursorQuery != null) {
            }
        } catch (Throwable th7) {
            try {
                ImagePickerLogUtil.e((String) context, th7);
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object saveImage(Context context, AlbumItem albumItem, Bitmap bitmap, Continuation<? super Uri> continuation) {
        AnonymousClass1 anonymousClass1;
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
        Object objSave = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objSave);
                return (Uri) objSave;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objSave);
            return (Uri) objSave;
        }
        ResultKt.throwOnFailure(objSave);
        if (bitmap != null) {
            MediaSaver.BitmapInput bitmapInput = new MediaSaver.BitmapInput(context, albumItem.getMimeType(), bitmap, null, 8, null);
            anonymousClass1.label = 1;
            objSave = bitmapInput.save(anonymousClass1);
            if (objSave == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Uri) objSave;
        }
        MediaSaver.MediaItemInput mediaItemInput = new MediaSaver.MediaItemInput(context, albumItem, null, 4, null);
        anonymousClass1.label = 2;
        objSave = mediaItemInput.save(anonymousClass1);
        if (objSave == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Uri) objSave;
    }

    public static /* synthetic */ Object saveImage$default(MediaProvider mediaProvider, Context context, AlbumItem albumItem, Bitmap bitmap, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            bitmap = null;
        }
        return mediaProvider.saveImage(context, albumItem, bitmap, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveVideo(Context context, AlbumItem albumItem, Continuation<? super Uri> continuation) {
        return new MediaSaver.MediaItemInput(context, albumItem, null, 4, null).save(continuation);
    }

    @NotNull
    public final List<AlbumSource> query(@NotNull Context context, @NotNull AlbumQueryMode mode) {
        AlbumSource albumSource;
        AlbumSource albumSource2;
        AlbumSource albumSource3;
        List<AlbumItem> data;
        List<AlbumItem> data2;
        List<AlbumItem> data3;
        List<AlbumItem> data4;
        List<AlbumItem> data5;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        ArrayList<AlbumItem> arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        AlbumSource albumSource4 = null;
        if (i == 1) {
            AlbumSource albumSource5 = new AlbumSource(AlbumQueryMode.QUERY_ALL.getValue(), AlbumQueryMode.INSTANCE.getAllMediaCategoryName$dataprovider_release(), null, 4, null);
            linkedHashMap.put(Long.valueOf(albumSource5.getId()), albumSource5);
            arrayList.addAll(queryAllImages$default(this, context, false, 2, null));
            arrayList.addAll(queryAllVideos(context));
            albumSource = null;
            albumSource2 = null;
            albumSource4 = albumSource5;
            albumSource3 = null;
        } else if (i == 2) {
            albumSource3 = new AlbumSource(AlbumQueryMode.QUERY_IMAGES_ONLY.getValue(), AlbumQueryMode.INSTANCE.getAllImageCategoryName$dataprovider_release(), null, 4, null);
            linkedHashMap.put(Long.valueOf(albumSource3.getId()), albumSource3);
            arrayList.addAll(queryAllImages$default(this, context, false, 2, null));
            albumSource = null;
            albumSource2 = null;
        } else if (i == 3) {
            AlbumSource albumSource6 = new AlbumSource(AlbumQueryMode.QUERY_STATIC_IMAGES_ONLY.getValue(), AlbumQueryMode.INSTANCE.getAllStaticImageCategoryName$dataprovider_release(), null, 4, null);
            linkedHashMap.put(Long.valueOf(albumSource6.getId()), albumSource6);
            arrayList.addAll(queryAllImages(context, true));
            albumSource = albumSource6;
            albumSource3 = null;
            albumSource2 = null;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("QueryMode " + mode + " is unSupport");
            }
            AlbumSource albumSource7 = new AlbumSource(AlbumQueryMode.QUERY_VIDEO_ONLY.getValue(), AlbumQueryMode.INSTANCE.getAllVideoCategoryName$dataprovider_release(), null, 4, null);
            linkedHashMap.put(Long.valueOf(albumSource7.getId()), albumSource7);
            arrayList.addAll(queryAllVideos(context));
            albumSource2 = albumSource7;
            albumSource = null;
            albumSource3 = null;
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.common.support.imagepicker.dataprovider.provider.MediaProvider$query$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((AlbumItem) t2).getDate()), Long.valueOf(((AlbumItem) t).getDate()));
                }
            });
        }
        for (AlbumItem albumItem : arrayList) {
            if (albumItem.getBucketId() != -1) {
                AlbumSource albumSource8 = (AlbumSource) linkedHashMap.get(Long.valueOf(albumItem.getBucketId()));
                if (albumSource8 == null) {
                    albumSource8 = new AlbumSource(albumItem.getBucketId(), albumItem.getBucketName(), null, 4, null);
                    linkedHashMap.put(Long.valueOf(albumItem.getBucketId()), albumSource8);
                }
                albumSource8.getData().add(albumItem);
                int i2 = WhenMappings.$EnumSwitchMapping$1[albumItem.getItemType().ordinal()];
                if (i2 == 1) {
                    if (albumSource4 != null && (data5 = albumSource4.getData()) != null) {
                        data5.add(albumItem);
                    }
                    if (albumSource2 != null && (data4 = albumSource2.getData()) != null) {
                        data4.add(albumItem);
                    }
                } else if (i2 == 2) {
                    if (!albumItem.isGif() && albumSource != null && (data3 = albumSource.getData()) != null) {
                        data3.add(albumItem);
                    }
                    if (albumSource4 != null && (data2 = albumSource4.getData()) != null) {
                        data2.add(albumItem);
                    }
                    if (albumSource3 != null && (data = albumSource3.getData()) != null) {
                        data.add(albumItem);
                    }
                }
            }
        }
        if (albumSource4 != null && albumSource4.getData().isEmpty()) {
            linkedHashMap.remove(Long.valueOf(albumSource4.getId()));
        }
        if (albumSource3 != null && albumSource3.getData().isEmpty()) {
            linkedHashMap.remove(Long.valueOf(albumSource3.getId()));
        }
        if (albumSource != null && albumSource.getData().isEmpty()) {
            linkedHashMap.remove(Long.valueOf(albumSource.getId()));
        }
        if (albumSource2 != null && albumSource2.getData().isEmpty()) {
            linkedHashMap.remove(Long.valueOf(albumSource2.getId()));
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    @Nullable
    public final Object saveToAlbum(@NotNull Context context, @NotNull AlbumItem albumItem, @NotNull Continuation<? super Uri> continuation) {
        return albumItem.isVideo() ? saveVideo(context, albumItem, continuation) : saveImage$default(this, context, albumItem, null, continuation, 4, null);
    }
}
