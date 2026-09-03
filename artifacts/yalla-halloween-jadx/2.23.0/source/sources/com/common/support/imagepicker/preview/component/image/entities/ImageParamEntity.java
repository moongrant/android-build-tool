package com.common.support.imagepicker.preview.component.image.entities;

import androidx.annotation.DrawableRes;
import androidx.compose.animation.Oooo000;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/common/support/imagepicker/preview/component/image/entities/ImageParamEntity;", "", "error", "", "placeHolder", "radius", "frame", "", "(Ljava/lang/Integer;Ljava/lang/Integer;IJ)V", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFrame", "()J", "getPlaceHolder", "getRadius", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;IJ)Lcom/common/support/imagepicker/preview/component/image/entities/ImageParamEntity;", "equals", "", "other", "hashCode", "toString", "", "preview_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ImageParamEntity {

    @Nullable
    private final Integer error;
    private final long frame;

    @Nullable
    private final Integer placeHolder;
    private final int radius;

    public ImageParamEntity() {
        this(null, null, 0, 0L, 15, null);
    }

    public static /* synthetic */ ImageParamEntity copy$default(ImageParamEntity imageParamEntity, Integer num, Integer num2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = imageParamEntity.error;
        }
        if ((i2 & 2) != 0) {
            num2 = imageParamEntity.placeHolder;
        }
        Integer num3 = num2;
        if ((i2 & 4) != 0) {
            i = imageParamEntity.radius;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = imageParamEntity.frame;
        }
        return imageParamEntity.copy(num, num3, i3, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPlaceHolder() {
        return this.placeHolder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getFrame() {
        return this.frame;
    }

    @NotNull
    public final ImageParamEntity copy(@DrawableRes @Nullable Integer error, @DrawableRes @Nullable Integer placeHolder, int radius, long frame) {
        return new ImageParamEntity(error, placeHolder, radius, frame);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageParamEntity)) {
            return false;
        }
        ImageParamEntity imageParamEntity = (ImageParamEntity) other;
        return Intrinsics.areEqual(this.error, imageParamEntity.error) && Intrinsics.areEqual(this.placeHolder, imageParamEntity.placeHolder) && this.radius == imageParamEntity.radius && this.frame == imageParamEntity.frame;
    }

    @Nullable
    public final Integer getError() {
        return this.error;
    }

    public final long getFrame() {
        return this.frame;
    }

    @Nullable
    public final Integer getPlaceHolder() {
        return this.placeHolder;
    }

    public final int getRadius() {
        return this.radius;
    }

    public int hashCode() {
        Integer num = this.error;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.placeHolder;
        int iHashCode2 = (((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.radius) * 31;
        long j = this.frame;
        return iHashCode2 + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ImageParamEntity(error=");
        sb.append(this.error);
        sb.append(", placeHolder=");
        sb.append(this.placeHolder);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", frame=");
        return Oooo000.OooO0OO(sb, this.frame, ')');
    }

    public ImageParamEntity(@DrawableRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, int i, long j) {
        this.error = num;
        this.placeHolder = num2;
        this.radius = i;
        this.frame = j;
    }

    public /* synthetic */ ImageParamEntity(Integer num, Integer num2, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) == 0 ? num2 : null, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j);
    }
}
