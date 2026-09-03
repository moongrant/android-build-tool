package com.common.support.imagepicker.dataprovider.entities;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.common.support.imagepicker.dataprovider.config.AlbumItemType;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0002\u0010\u0013J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\fHÖ\u0001R\u0014\u0010\u0010\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\r\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0014\u0010\u000e\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001d¨\u0006)"}, d2 = {"Lcom/common/support/imagepicker/dataprovider/entities/AlbumVideo;", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItem;", "Landroid/os/Parcelable;", "id", "", "contentUri", "Landroid/net/Uri;", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "name", "size", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "mimeType", "date", "bucketId", "bucketName", "duration", "(JLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;JJLjava/lang/String;J)V", "getBucketId", "()J", "getBucketName", "()Ljava/lang/String;", "getContentUri", "()Landroid/net/Uri;", "getDate", "getDuration", "getHeight", "()I", "getId", "getMimeType", "getName", "getSize", "getTitle", "getWidth", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "dataprovider_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AlbumVideo extends AlbumItem {

    @NotNull
    public static final Parcelable.Creator<AlbumVideo> CREATOR = new Creator();
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
    private final String mimeType;

    @NotNull
    private final String name;
    private final long size;

    @NotNull
    private final String title;
    private final int width;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AlbumVideo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumVideo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlbumVideo(parcel.readLong(), (Uri) parcel.readParcelable(AlbumVideo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AlbumVideo[] newArray(int i) {
            return new AlbumVideo[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumVideo(long j, @NotNull Uri contentUri, @NotNull String title, @NotNull String name, long j2, int i, int i2, @NotNull String mimeType, long j3, long j4, @NotNull String bucketName, long j5) {
        super(j, contentUri, title, name, j2, i, i2, mimeType, j3, j4, bucketName, j5, null, AlbumItemType.VIDEO, 4096, null);
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
        this.duration = j5;
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
    public long getDuration() {
        return this.duration;
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
        parcel.writeLong(this.duration);
    }
}
