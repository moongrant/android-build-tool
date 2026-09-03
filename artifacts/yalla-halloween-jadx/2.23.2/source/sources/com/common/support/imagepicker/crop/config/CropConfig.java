package com.common.support.imagepicker.crop.config;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/common/support/imagepicker/crop/config/CropConfig;", "", "scaleEnabled", "", "showCropFrame", "cropColor", "", "shadowBackgroundColor", "(ZZII)V", "getCropColor", "()I", "setCropColor", "(I)V", "getScaleEnabled", "()Z", "setScaleEnabled", "(Z)V", "getShadowBackgroundColor", "setShadowBackgroundColor", "getShowCropFrame", "setShowCropFrame", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "crop_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CropConfig {
    private int cropColor;
    private boolean scaleEnabled;
    private int shadowBackgroundColor;
    private boolean showCropFrame;

    public CropConfig() {
        this(false, false, 0, 0, 15, null);
    }

    public static /* synthetic */ CropConfig copy$default(CropConfig cropConfig, boolean z, boolean z2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = cropConfig.scaleEnabled;
        }
        if ((i3 & 2) != 0) {
            z2 = cropConfig.showCropFrame;
        }
        if ((i3 & 4) != 0) {
            i = cropConfig.cropColor;
        }
        if ((i3 & 8) != 0) {
            i2 = cropConfig.shadowBackgroundColor;
        }
        return cropConfig.copy(z, z2, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getScaleEnabled() {
        return this.scaleEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowCropFrame() {
        return this.showCropFrame;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCropColor() {
        return this.cropColor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getShadowBackgroundColor() {
        return this.shadowBackgroundColor;
    }

    @NotNull
    public final CropConfig copy(boolean scaleEnabled, boolean showCropFrame, @ColorInt int cropColor, @ColorInt int shadowBackgroundColor) {
        return new CropConfig(scaleEnabled, showCropFrame, cropColor, shadowBackgroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropConfig)) {
            return false;
        }
        CropConfig cropConfig = (CropConfig) other;
        return this.scaleEnabled == cropConfig.scaleEnabled && this.showCropFrame == cropConfig.showCropFrame && this.cropColor == cropConfig.cropColor && this.shadowBackgroundColor == cropConfig.shadowBackgroundColor;
    }

    public final int getCropColor() {
        return this.cropColor;
    }

    public final boolean getScaleEnabled() {
        return this.scaleEnabled;
    }

    public final int getShadowBackgroundColor() {
        return this.shadowBackgroundColor;
    }

    public final boolean getShowCropFrame() {
        return this.showCropFrame;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        boolean z = this.scaleEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.showCropFrame;
        return ((((i + (z2 ? 1 : z2)) * 31) + this.cropColor) * 31) + this.shadowBackgroundColor;
    }

    public final void setCropColor(int i) {
        this.cropColor = i;
    }

    public final void setScaleEnabled(boolean z) {
        this.scaleEnabled = z;
    }

    public final void setShadowBackgroundColor(int i) {
        this.shadowBackgroundColor = i;
    }

    public final void setShowCropFrame(boolean z) {
        this.showCropFrame = z;
    }

    @NotNull
    public String toString() {
        return "CropConfig(scaleEnabled=" + this.scaleEnabled + ", showCropFrame=" + this.showCropFrame + ", cropColor=" + this.cropColor + ", shadowBackgroundColor=" + this.shadowBackgroundColor + ")";
    }

    public CropConfig(boolean z, boolean z2, @ColorInt int i, @ColorInt int i2) {
        this.scaleEnabled = z;
        this.showCropFrame = z2;
        this.cropColor = i;
        this.shadowBackgroundColor = i2;
    }

    public /* synthetic */ CropConfig(boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? -16711936 : i, (i3 & 8) != 0 ? Color.parseColor("#7f000000") : i2);
    }
}
