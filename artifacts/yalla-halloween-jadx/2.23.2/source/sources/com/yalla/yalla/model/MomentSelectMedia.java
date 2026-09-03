package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/MomentSelectMedia;", "Ljava/io/Serializable;", "path", "", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "", "getHeight", "()I", "setHeight", "(I)V", "getPath", "()Ljava/lang/String;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth", "setWidth", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentSelectMedia implements Serializable {
    public static final int $stable = 8;
    private long duration;
    private int height;

    @NotNull
    private final String path;
    private int width;

    public MomentSelectMedia(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        return "MomentSelectMedia(path='" + this.path + "', duration=" + this.duration + ", width=" + this.width + ", height=" + this.height + ")";
    }
}
