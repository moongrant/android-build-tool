package com.yy.yyeva.util;

import android.graphics.Bitmap;
import android.view.Surface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086 J)\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086 J\u0019\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0086 J+\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0086 J\u001b\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0086 J+\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u000fH\u0086 J\u0011\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0019\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0086 J\u0011\u0010 \u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0019\u0010\"\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0086 J\u0011\u0010#\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¨\u0006$"}, d2 = {"Lcom/yy/yyeva/util/EvaJniUtil;", "", "", "controllerId", "getExternalTexture", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "", "updateViewPoint", "Landroid/view/Surface;", "surface", "", "isNeedYuv", "isNormalMp4", "initRender", "", "json", "setRenderConfig", "defaultVideoMode", "defaultConfig", "Landroid/graphics/Bitmap;", "bitmap", "setBgBitmap", "srcId", "scaleMode", "setSrcBitmap", "renderFrame", "renderClearFrame", "releaseTexture", "renderSwapBuffers", "destroyRender", "mixConfigCreate", "mixRenderCreate", "frameIndex", "mixRendering", "mixRenderDestroy", "yyevac_release"}, k = 1, mv = {1, 8, 0})
public final class EvaJniUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final EvaJniUtil f32437OooO00o = new EvaJniUtil();

    static {
        System.loadLibrary("yyeva");
    }

    public final native void defaultConfig(int controllerId, int width, int height, int defaultVideoMode);

    public final native void destroyRender(int controllerId);

    public final native int getExternalTexture(int controllerId);

    public final native int initRender(int controllerId, @NotNull Surface surface, boolean isNeedYuv, boolean isNormalMp4);

    public final native int mixConfigCreate(int controllerId, @NotNull String json);

    public final native void mixRenderCreate(int controllerId);

    public final native void mixRenderDestroy(int controllerId);

    public final native void mixRendering(int controllerId, int frameIndex);

    public final native void releaseTexture(int controllerId);

    public final native void renderClearFrame(int controllerId);

    public final native void renderFrame(int controllerId);

    public final native void renderSwapBuffers(int controllerId);

    public final native void setBgBitmap(int controllerId, @Nullable Bitmap bitmap);

    public final native void setRenderConfig(int controllerId, @NotNull String json);

    public final native void setSrcBitmap(int controllerId, @NotNull String srcId, @Nullable Bitmap bitmap, @NotNull String scaleMode);

    public final native void updateViewPoint(int controllerId, int width, int height);
}
