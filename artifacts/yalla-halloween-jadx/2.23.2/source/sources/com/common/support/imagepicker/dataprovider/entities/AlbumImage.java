package com.common.support.imagepicker.dataprovider.entities;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0010\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0011\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\r\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u0006("}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumImage;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "Landroid/os/Parcelable;", "id", "", "contentUri", "Landroid/net/Uri;", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "name", "size", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "mimeType", "date", "bucketId", "bucketName", "(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;JJLjava/lang/String;)V", "getBucketId", "()J", "getBucketName", "()Ljava/lang/String;", "getContentUri", "()Landroid/net/Uri;", "getDate", "getHeight", "()I", "getId", "getMimeType", "getName", "getSize", "getTitle", "getWidth", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AlbumImage extends AlbumItem {
    private final long bucketId;

    @NotNull
    private final String bucketName;

    @NotNull
    private final Uri contentUri;
    private final long date;
    private final int height;
    private final long id;

    @NotNull
    private final String mimeType;

    @NotNull
    private final String name;
    private final long size;

    @NotNull
    private final String title;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AlbumImage> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumImage$Companion;", "", "()V", "createFromCamera", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumImage;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "ext", "", "dataprovider_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlbumImage createFromCamera(@NotNull Uri uri, int width, int height, @NotNull String ext) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(ext, "ext");
            return new AlbumImage(-1L, uri, "", "", 0L, width, height, o00O00OO.OooO00o("image/", ext), System.currentTimeMillis(), 0L, "");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlbumImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumImage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlbumImage(parcel.readLong(), (Uri) parcel.readParcelable(AlbumImage.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumImage[] newArray(int i) {
            return new AlbumImage[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumImage(long j, @NotNull Uri contentUri, @NotNull String title, @NotNull String name, long j2, int i, int i2, @NotNull String mimeType, long j3, long j4, @NotNull String bucketName) {
        super(j, contentUri, title, name, j2, i, i2, mimeType, j3, j4, bucketName, 0L, null, AlbumItemType.IMAGE, 6144, null);
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
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
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    public long getBucketId() {
        return this.bucketId;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    @NotNull
    public String getBucketName() {
        return this.bucketName;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    @NotNull
    public Uri getContentUri() {
        return this.contentUri;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    public long getDate() {
        return this.date;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    public int getHeight() {
        return this.height;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    public long getId() {
        return this.id;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    @NotNull
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    public long getSize() {
        return this.size;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    @NotNull
    public String getTitle() {
        return this.title;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem
    public int getWidth() {
        return this.width;
    }

    @Override // com.common.support.imagepicker.dataprovider.entities.AlbumItem, android.os.Parcelable
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
    }
}
