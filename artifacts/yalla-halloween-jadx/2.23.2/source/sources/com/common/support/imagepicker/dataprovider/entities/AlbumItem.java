package com.common.support.imagepicker.dataprovider.entities;

import OooO0OO.OooO0O0;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.facebook.appevents.OooOOO0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 52\u00020\u0001:\u00015B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0006\u0010-\u001a\u00020+J\u0006\u0010.\u001a\u00020+J\b\u0010/\u001a\u00020\u0007H\u0016J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u000f\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0010\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0014\u0010\b\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001f¨\u00066"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "Landroid/os/Parcelable;", "id", "", "contentUri", "Landroid/net/Uri;", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "name", "size", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "mimeType", "date", "bucketId", "bucketName", "duration", "thumbnail", "itemType", "Lcom/common/support/imagepicker/dataprovider/config/AlbumItemType;", "(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;JJLjava/lang/String;JLandroid/net/Uri;Lcom/common/support/imagepicker/dataprovider/config/AlbumItemType;)V", "getBucketId", "()J", "getBucketName", "()Ljava/lang/String;", "getContentUri", "()Landroid/net/Uri;", "getDate", "getDuration", "getHeight", "()I", "getId", "getItemType", "()Lcom/common/support/imagepicker/dataprovider/config/AlbumItemType;", "getMimeType", "getName", "getSize", "getThumbnail", "getTitle", "getWidth", "describeContents", "isGif", "", "isImage", "isPng", "isVideo", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AlbumItem implements Parcelable {
    private final long bucketId;

    @NotNull
    private final String bucketName;

    @NotNull
    private final Uri contentUri;
    private final long date;
    private final long duration;
    private final int height;
    private final long id;

    @NotNull
    private final AlbumItemType itemType;

    @NotNull
    private final String mimeType;

    @NotNull
    private final String name;
    private final long size;

    @Nullable
    private final Uri thumbnail;

    @NotNull
    private final String title;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AlbumItem> CREATOR = new Creator();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem$Companion;", "", "()V", "createSimple", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "size", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "mimeType", "", "itemType", "Lcom/common/support/imagepicker/dataprovider/config/AlbumItemType;", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlbumItem createSimple(@NotNull Uri uri, long size, int width, int height, @NotNull String mimeType, @NotNull AlbumItemType itemType) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            return new AlbumItem(0L, uri, "", "", size, width, height, mimeType, System.currentTimeMillis(), 0L, "", 0L, null, itemType);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlbumItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlbumItem(parcel.readLong(), (Uri) parcel.readParcelable(AlbumItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong(), (Uri) parcel.readParcelable(AlbumItem.class.getClassLoader()), AlbumItemType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumItem[] newArray(int i) {
            return new AlbumItem[i];
        }
    }

    public AlbumItem(long j, @NotNull Uri contentUri, @NotNull String title, @NotNull String name, long j2, int i, int i2, @NotNull String mimeType, long j3, long j4, @NotNull String bucketName, long j5, @Nullable Uri uri, @NotNull AlbumItemType itemType) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        this.id = j;
        this.contentUri = contentUri;
        this.title = title;
        this.name = name;
        this.size = j2;
        this.width = i;
        this.height = i2;
        this.mimeType = mimeType;
        this.date = j3;
        this.bucketId = j4;
        this.bucketName = bucketName;
        this.duration = j5;
        this.thumbnail = uri;
        this.itemType = itemType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getBucketId() {
        return this.bucketId;
    }

    @NotNull
    public String getBucketName() {
        return this.bucketName;
    }

    @NotNull
    public Uri getContentUri() {
        return this.contentUri;
    }

    public long getDate() {
        return this.date;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public long getId() {
        return this.id;
    }

    @NotNull
    public final AlbumItemType getItemType() {
        return this.itemType;
    }

    @NotNull
    public String getMimeType() {
        return this.mimeType;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    @Nullable
    public Uri getThumbnail() {
        return this.thumbnail;
    }

    @NotNull
    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public final boolean isGif() {
        String mimeType = getMimeType();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = mimeType.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return StringsKt__StringsKt.contains$default(lowerCase, "gif", false, 2, (Object) null);
    }

    public final boolean isImage() {
        return this.itemType == AlbumItemType.IMAGE;
    }

    public final boolean isPng() {
        String mimeType = getMimeType();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = mimeType.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return StringsKt__StringsKt.contains$default(lowerCase, "png", false, 2, (Object) null);
    }

    public final boolean isVideo() {
        return this.itemType == AlbumItemType.VIDEO;
    }

    @NotNull
    public String toString() {
        long id = getId();
        Uri contentUri = getContentUri();
        String title = getTitle();
        String name = getName();
        long size = getSize();
        int width = getWidth();
        int height = getHeight();
        String mimeType = getMimeType();
        long date = getDate();
        long bucketId = getBucketId();
        String bucketName = getBucketName();
        long duration = getDuration();
        Uri thumbnail = getThumbnail();
        AlbumItemType albumItemType = this.itemType;
        StringBuilder sb = new StringBuilder("AlbumItem(id=");
        sb.append(id);
        sb.append(", contentUri=");
        sb.append(contentUri);
        OooO0O0.OooO00o(sb, ", title='", title, "', name='", name);
        OooOOO0.OooO00o(sb, "', size=", size, ", width=");
        o000O0Oo.OooOOO0.OooO00o(sb, width, ", height=", height, ", mimeType='");
        sb.append(mimeType);
        sb.append("', date=");
        sb.append(date);
        OooOOO0.OooO00o(sb, ", bucketId=", bucketId, ", bucketName='");
        sb.append(bucketName);
        sb.append("', duration=");
        sb.append(duration);
        sb.append(", thumbnail=");
        sb.append(thumbnail);
        sb.append(", itemType=");
        sb.append(albumItemType);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.id);
        parcel.writeParcelable(this.contentUri, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        parcel.writeLong(this.size);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.mimeType);
        parcel.writeLong(this.date);
        parcel.writeLong(this.bucketId);
        parcel.writeString(this.bucketName);
        parcel.writeLong(this.duration);
        parcel.writeParcelable(this.thumbnail, flags);
        parcel.writeString(this.itemType.name());
    }

    public /* synthetic */ AlbumItem(long j, Uri uri, String str, String str2, long j2, int i, int i2, String str3, long j3, long j4, String str4, long j5, Uri uri2, AlbumItemType albumItemType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, uri, str, str2, j2, i, i2, str3, j3, j4, str4, (i3 & 2048) != 0 ? 0L : j5, (i3 & 4096) != 0 ? null : uri2, albumItemType);
    }
}
