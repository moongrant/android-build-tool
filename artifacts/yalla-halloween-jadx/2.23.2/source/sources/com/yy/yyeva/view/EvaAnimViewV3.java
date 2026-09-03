package com.yy.yyeva.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.widget.FrameLayout;
import androidx.camera.core.impl.o0000O00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.yy.yyeva.util.EvaJniUtil;
import com.yy.yyeva.util.ScaleType;
import com.yy.yyeva.view.EvaAnimViewV3;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045Oooooo.o0000O0;
import p612o0oo0OoO.q5;
import p612o0oo0OoO.r5;
import p613o0oo0Ooo.w5;
import p613o0oo0Ooo.x5;
import p615o0oo0o0.o000oOoO;
import p615o0oo0o0.o00O0O;
import p615o0oo0o0.o0OoOo0;
import p616o0oo0o00.OooOo;
import p616o0oo0o00.Oooo0;
import p616o0oo0o00.Oooo000;
import p619o0oo0oO.oO0O0Oo0;
import p619o0oo0oO.oOo0o0oO;
import p620o0oo0oO0.o000O0;
import p620o0oo0oO0.o000O0Oo;
import p620o0oo0oO0.o000OOo0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000å\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001u\b\u0016\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0089\u0001B.\b\u0007\u0012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001\u0012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\t\b\u0002\u0010\u0085\u0001\u001a\u00020\f¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\fH\u0016J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\fJ\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0011H\u0007J\u000e\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\fJ\u0018\u00108\u001a\u00020\u00042\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0011H\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016J\u0018\u0010E\u001a\u00020\u00042\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020\u0004H\u0016J\b\u0010M\u001a\u00020\u0004H\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\b\u0010O\u001a\u00020\u0011H\u0016J\u0014\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0PH\u0016J\u0010\u0010T\u001a\u00020\u00042\u0006\u0010S\u001a\u00020RH\u0016J\b\u0010U\u001a\u00020\u0011H\u0016J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0002J\b\u0010Y\u001a\u00020\u0004H\u0002J\u0016\u0010\\\u001a\u00020\u00042\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040ZH\u0002J\b\u0010]\u001a\u00020\u0011H\u0002J\b\u0010^\u001a\u00020\u0004H\u0002R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010tR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010d\u001a\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010{R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007f¨\u0006\u008a\u0001"}, d2 = {"Lcom/yy/yyeva/view/EvaAnimViewV3;", "Lo0oo0oO/oOo0o0oO;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "", "updateTextureViewLayout", "prepareTextureView", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "Landroid/view/Surface;", "getSurface", "surface", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "", "onSurfaceTextureDestroyed", "onSurfaceTextureAvailable", "w", "h", "oldw", "oldh", "onSizeChanged", "onAttachedToWindow", "onDetachedFromWindow", "Lo0oo0o0/o000oOoO;", "evaAnimListener", "setAnimListener", "Lo0oo0o0/o0OoOo0;", "evaFetchResource", "setFetchResource", "Lo0oo0o0/o00O0O;", "evaResourceClickListener", "setOnResourceClickListener", "enable", "enableAutoTxtColorFill", "playLoop", "setLoop", "defaultMp4Type", "setDefaultMptType", "", "startPoint", "setStartPoint", "isSupport", "isEdgeBlur", "supportMask", "isSetLastFrame", "setLastFrame", "enableVersion1", "mode", "setVideoMode", "fps", "", "speed", "setVideoFps", "setAudioSpeed", "isNormalMp4", "setNormalMp4", "Lcom/yy/yyeva/util/ScaleType;", "type", "setScaleType", "Lo0oo0oO0/o000O0Oo;", "scaleType", "isMute", "setMute", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "startPlay", "Landroid/content/res/AssetManager;", "assetManager", "", "assetsPath", "Lo0oo0o00/Oooo0;", "evaFileContainer", "pause", "resume", "stopPlay", "isRunning", "Lkotlin/Pair;", "getRealSize", "Landroid/graphics/Bitmap;", "bg", "setBgImage", "hasBgImage", "Lo0oo0oO0/o000O0;", "videoInfo", "play", "hide", "Lkotlin/Function0;", "f", "ui", "belowKitKat", "release", "Lo0oo0OoO/r5;", "playerEva", "Lo0oo0OoO/r5;", "Landroid/os/Handler;", "uiHandler$delegate", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "Landroid/graphics/SurfaceTexture;", "s", "Landroid/view/Surface;", "Lo0oo0o0/o000oOoO;", "Lcom/yy/yyeva/view/InnerTextureView;", "innerTextureView", "Lcom/yy/yyeva/view/InnerTextureView;", "lastEvaFile", "Lo0oo0o00/Oooo0;", "Lo0oo0oO0/o000OOo0;", "scaleTypeUtil", "Lo0oo0oO0/o000OOo0;", "Landroid/graphics/Bitmap;", "com/yy/yyeva/view/OooO0O0", "animProxyListener$delegate", "getAnimProxyListener", "()Lcom/yy/yyeva/view/OooO0O0;", "animProxyListener", "onSizeChangedCalled", "Z", "needPrepareTextureView", "Ljava/lang/Runnable;", "prepareTextureViewRunnable", "Ljava/lang/Runnable;", "updateTextureLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OooO00o", "yyevac_release"}, k = 1, mv = {1, 8, 0})
public class EvaAnimViewV3 extends FrameLayout implements oOo0o0oO, TextureView.SurfaceTextureListener {

    @NotNull
    private static final String TAG = "EvaAnimPlayer.AnimViewV3";

    /* JADX INFO: renamed from: animProxyListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animProxyListener;

    @Nullable
    private Bitmap bg;

    @Nullable
    private o000oOoO evaAnimListener;

    @Nullable
    private InnerTextureView innerTextureView;

    @Nullable
    private Oooo0 lastEvaFile;
    private boolean needPrepareTextureView;
    private boolean onSizeChangedCalled;
    private r5 playerEva;

    @NotNull
    private final Runnable prepareTextureViewRunnable;

    @Nullable
    private Surface s;

    @NotNull
    private final o000OOo0 scaleTypeUtil;

    @Nullable
    private SurfaceTexture surface;

    /* JADX INFO: renamed from: uiHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiHandler;

    @NotNull
    private final Runnable updateTextureLayout;

    public static final class OooO extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f32456OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yy.yyeva.view.OooO0O0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yy.yyeva.view.OooO0O0 invoke() {
            return new com.yy.yyeva.view.OooO0O0(EvaAnimViewV3.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EvaAnimViewV3.this.removeAllViews();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo0 f32460OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Oooo0 oooo0) {
            super(0);
            this.f32460OooO0o0 = oooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EvaAnimViewV3 evaAnimViewV3 = EvaAnimViewV3.this;
            if (evaAnimViewV3.getVisibility() != 0) {
                Intrinsics.checkNotNullParameter(EvaAnimViewV3.TAG, ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("AnimView is GONE, can't play", "msg");
            } else {
                r5 r5Var = evaAnimViewV3.playerEva;
                r5 r5Var2 = null;
                if (r5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    r5Var = null;
                }
                if (r5Var.OooO0O0()) {
                    Intrinsics.checkNotNullParameter(EvaAnimViewV3.TAG, ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("is running can not start", "msg");
                } else {
                    Oooo0 oooo0 = this.f32460OooO0o0;
                    evaAnimViewV3.lastEvaFile = oooo0;
                    r5 r5Var3 = evaAnimViewV3.playerEva;
                    if (r5Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    } else {
                        r5Var2 = r5Var3;
                    }
                    r5Var2.OooO0o(oooo0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimViewV3(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean belowKitKat() {
        return false;
    }

    private final com.yy.yyeva.view.OooO0O0 getAnimProxyListener() {
        return (com.yy.yyeva.view.OooO0O0) this.animProxyListener.getValue();
    }

    private final Handler getUiHandler() {
        return (Handler) this.uiHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hide() {
        Oooo0 oooo0 = this.lastEvaFile;
        if (oooo0 != null) {
            oooo0.close();
        }
        ui(new OooO0OO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceTextureAvailable$lambda$6(EvaAnimViewV3 this$0, SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(surface, "$surface");
        this$0.s = new Surface(surface);
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("initRender", "msg");
        r5 r5Var = this$0.playerEva;
        r5 r5Var2 = null;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        EvaJniUtil evaJniUtil = EvaJniUtil.f32437OooO00o;
        r5 r5Var3 = this$0.playerEva;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var3 = null;
        }
        int i = r5Var3.f57461OooO0O0;
        Surface surface2 = this$0.s;
        Intrinsics.checkNotNull(surface2);
        r5 r5Var4 = this$0.playerEva;
        if (r5Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var4 = null;
        }
        r5Var.f57461OooO0O0 = evaJniUtil.initRender(i, surface2, false, r5Var4.f57479OooOo0);
        r5 r5Var5 = this$0.playerEva;
        if (r5Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var5 = null;
        }
        int externalTexture = evaJniUtil.getExternalTexture(r5Var5.f57461OooO0O0);
        if (externalTexture < 0) {
            Log.e(TAG, "surfaceCreated init OpenGL ES failed!");
            return;
        }
        Bitmap bitmap = this$0.bg;
        if (bitmap != null) {
            r5 r5Var6 = this$0.playerEva;
            if (r5Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            } else {
                r5Var2 = r5Var6;
            }
            evaJniUtil.setBgBitmap(r5Var2.f57461OooO0O0, bitmap);
            bitmap.recycle();
        }
        this$0.surface = new SurfaceTexture(externalTexture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSurfaceTextureDestroyed$lambda$4(EvaAnimViewV3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InnerTextureView innerTextureView = this$0.innerTextureView;
        if (innerTextureView != null) {
            innerTextureView.setSurfaceTextureListener(null);
        }
        this$0.innerTextureView = null;
        this$0.removeAllViews();
    }

    private final void play(o000O0 videoInfo) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void prepareTextureViewRunnable$lambda$1(EvaAnimViewV3 this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.removeAllViews();
        r5 r5Var = null;
        InnerTextureView innerTextureView = new InnerTextureView(context, 0 == true ? 1 : 0, 6, 0);
        r5 r5Var2 = this$0.playerEva;
        if (r5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var = r5Var2;
        }
        innerTextureView.setPlayerEva(r5Var);
        innerTextureView.setSurfaceTextureListener(this$0);
        innerTextureView.setLayoutParams(this$0.scaleTypeUtil.OooO0O0(innerTextureView));
        this$0.innerTextureView = innerTextureView;
        this$0.addView(innerTextureView);
    }

    private final void release() {
        try {
            SurfaceTexture surfaceTexture = this.surface;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        } catch (Throwable tr) {
            String msg = "failed to release mSurfaceTexture= " + this.surface + ": " + tr.getMessage();
            Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(tr, "tr");
        }
        this.surface = null;
        this.bg = null;
    }

    private final void ui(final Function0<Unit> f) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            f.invoke();
        } else {
            getUiHandler().post(new Runnable() { // from class: o0oo0oO.oOo0oooO
                @Override // java.lang.Runnable
                public final void run() {
                    EvaAnimViewV3.ui$lambda$8(f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ui$lambda$8(Function0 f) {
        Intrinsics.checkNotNullParameter(f, "$f");
        f.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTextureLayout$lambda$3(EvaAnimViewV3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InnerTextureView innerTextureView = this$0.innerTextureView;
        if (innerTextureView != null) {
            innerTextureView.setLayoutParams(this$0.scaleTypeUtil.OooO0O0(innerTextureView));
        }
    }

    public void enableAutoTxtColorFill(boolean enable) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = r5Var.f57478OooOo.f57550OooO0O0;
    }

    @Deprecated(message = "Compatible older version mp4, default false")
    public final void enableVersion1(boolean enable) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57470OooOO0o = enable;
    }

    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return this.scaleTypeUtil.OooO0OO();
    }

    @Nullable
    /* JADX INFO: renamed from: getSurface, reason: from getter */
    public Surface getS() {
        return this.s;
    }

    @Override // p619o0oo0oO.oOo0o0oO
    @Nullable
    /* JADX INFO: renamed from: getSurfaceTexture, reason: from getter */
    public SurfaceTexture getF32441OooO0o() {
        return this.surface;
    }

    @Override // p619o0oo0oO.oOo0o0oO
    public boolean hasBgImage() {
        return this.bg != null;
    }

    public boolean isRunning() {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        return r5Var.OooO0O0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Oooo0 oooo0;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onAttachedToWindow", "msg");
        super.onAttachedToWindow();
        r5 r5Var = this.playerEva;
        r5 r5Var2 = null;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57471OooOOO = false;
        r5 r5Var3 = this.playerEva;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        if (r5Var2.f57469OooOO0O <= 0 || (oooo0 = this.lastEvaFile) == null) {
            return;
        }
        startPlay(oooo0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onDetachedFromWindow", "msg");
        super.onDetachedFromWindow();
        if (belowKitKat()) {
            release();
        }
        r5 r5Var = this.playerEva;
        r5 r5Var2 = null;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57471OooOOO = true;
        r5 r5Var3 = this.playerEva;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        r5Var2.OooO0OO();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        String msg = androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("onSizeChanged w=", w, ", h=", h);
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        o000OOo0 o000ooo1 = this.scaleTypeUtil;
        o000ooo1.f57596OooO0Oo = w;
        o000ooo1.f57598OooO0o0 = h;
        this.onSizeChangedCalled = true;
        if (this.needPrepareTextureView) {
            this.needPrepareTextureView = false;
            prepareTextureView();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
        x5 x5Var;
        Handler handler;
        Intrinsics.checkNotNullParameter(surface, "surface");
        String msg = "onSurfaceTextureAvailable width=" + width + " height=" + height;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        w5 w5Var = r5Var.f57463OooO0Oo;
        int i = 1;
        if (w5Var != null && (x5Var = w5Var.f57486OooO0o0) != null && (handler = x5Var.f57510OooO0O0) != null) {
            handler.post(new o0000O0(i, this, surface));
        }
        r5 r5Var2 = this.playerEva;
        if (r5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var2 = null;
        }
        r5Var2.f57473OooOOOO = true;
        q5 q5Var = r5Var2.f57474OooOOOo;
        if (q5Var != null) {
            q5Var.run();
        }
        r5Var2.f57474OooOOOo = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSurfaceTextureDestroyed", "msg");
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.OooO0OO();
        getUiHandler().post(new o0000O00(this, 2));
        Bitmap bitmap = this.bg;
        if (bitmap != null) {
            Intrinsics.checkNotNull(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.bg;
                Intrinsics.checkNotNull(bitmap2);
                bitmap2.recycle();
                this.bg = null;
            }
        }
        return !belowKitKat();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        String msg = "onSurfaceTextureSizeChanged " + width + " x " + height;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.OooO0Oo(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    public void pause() {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        oO0O0Oo0 oo0o0oo0 = r5Var.f57465OooO0o0;
        if (oo0o0oo0 != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("pause", "msg");
            oo0o0oo0.f57572OooOO0 = true;
        }
        w5 w5Var = r5Var.f57463OooO0Oo;
        if (w5Var != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("pause", "msg");
            w5Var.f57506OooOOo = true;
        }
    }

    @Override // p619o0oo0oO.oOo0o0oO
    public void prepareTextureView() {
        if (this.onSizeChangedCalled) {
            getUiHandler().post(this.prepareTextureViewRunnable);
            return;
        }
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSizeChanged not called", "msg");
        this.needPrepareTextureView = true;
    }

    public void resume() {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        oO0O0Oo0 oo0o0oo0 = r5Var.f57465OooO0o0;
        if (oo0o0oo0 != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("resume", "msg");
            oo0o0oo0.f57572OooOO0 = false;
        }
        w5 w5Var = r5Var.f57463OooO0Oo;
        if (w5Var != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("resume", "msg");
            w5Var.f57506OooOOo = false;
        }
    }

    public void setAnimListener(@Nullable o000oOoO evaAnimListener) {
        this.evaAnimListener = evaAnimListener;
    }

    public void setAudioSpeed(float speed) {
        String msg = "setAudioSpeed=" + speed;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57468OooOO0 = speed;
    }

    public void setBgImage(@NotNull Bitmap bg) {
        Intrinsics.checkNotNullParameter(bg, "bg");
        this.bg = bg;
    }

    public final void setDefaultMptType(int defaultMp4Type) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57464OooO0o = Integer.valueOf(defaultMp4Type);
    }

    public void setFetchResource(@Nullable o0OoOo0 evaFetchResource) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = r5Var.f57478OooOo.f57550OooO0O0;
        if (oooO00o == null) {
            return;
        }
        oooO00o.f32425OooO0O0 = evaFetchResource;
    }

    public void setLastFrame(boolean isSetLastFrame) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57481OooOo0O = isSetLastFrame;
    }

    public void setLoop(int playLoop) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.OooO0o0(playLoop);
    }

    public void setMute(boolean isMute) {
        String msg = "set mute=" + isMute;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57475OooOOo = isMute;
    }

    public void setNormalMp4(boolean isNormalMp4) {
        String msg = "isNormalMp4=" + isNormalMp4;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57479OooOo0 = isNormalMp4;
    }

    public void setOnResourceClickListener(@Nullable o00O0O evaResourceClickListener) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = r5Var.f57478OooOo.f57550OooO0O0;
    }

    public void setScaleType(@NotNull ScaleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        o000OOo0 o000ooo1 = this.scaleTypeUtil;
        o000ooo1.getClass();
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        o000ooo1.f57600OooO0oo = type;
    }

    public void setStartPoint(long startPoint) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57477OooOOoo = startPoint * ((long) 1000);
    }

    public void setVideoFps(int fps, float speed) {
        String msg = "setVideoFps=" + fps + "， speed=" + speed;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.playerEva;
        r5 r5Var2 = null;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57459OooO = true;
        r5 r5Var3 = this.playerEva;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        r5Var2.f57467OooO0oo = (int) (fps * speed);
    }

    public final void setVideoMode(int mode) {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57472OooOOO0 = mode;
    }

    public void startPlay(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            startPlay(new Oooo000(file));
        } catch (Throwable unused) {
            getAnimProxyListener().onFailed(10007, "0x7 file can't read");
            getAnimProxyListener().onVideoComplete();
        }
    }

    public void stopPlay() {
        r5 r5Var = this.playerEva;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        w5 w5Var = r5Var.f57463OooO0Oo;
        if (w5Var != null) {
            Log.i("EvaAnimPlayer.Decoder", "stop true");
            w5Var.f57483OooO = true;
        }
        oO0O0Oo0 oo0o0oo0 = r5Var.f57465OooO0o0;
        if (oo0o0oo0 != null) {
            oo0o0oo0.f57571OooO0oo = true;
        }
    }

    public void supportMask(boolean isSupport, boolean isEdgeBlur) {
        r5 r5Var = this.playerEva;
        r5 r5Var2 = null;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.getClass();
        r5 r5Var3 = this.playerEva;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        r5Var2.getClass();
    }

    @Override // p619o0oo0oO.oOo0o0oO
    public void updateTextureViewLayout() {
        getUiHandler().post(this.updateTextureLayout);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimViewV3(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ EvaAnimViewV3(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimViewV3(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = LazyKt.lazy(OooO.f32456OooO0Oo);
        this.scaleTypeUtil = new o000OOo0();
        this.animProxyListener = LazyKt.lazy(new OooO0O0());
        this.prepareTextureViewRunnable = new Runnable() { // from class: o0oo0oO.oO0O0O00
            @Override // java.lang.Runnable
            public final void run() {
                EvaAnimViewV3.prepareTextureViewRunnable$lambda$1(this.f57560OooO0Oo, context);
            }
        };
        this.updateTextureLayout = new Runnable() { // from class: o0oo0oO.oO0O0O0o
            @Override // java.lang.Runnable
            public final void run() {
                EvaAnimViewV3.updateTextureLayout$lambda$3(this.f57562OooO0Oo);
            }
        };
        hide();
        r5 r5Var = new r5(this);
        this.playerEva = r5Var;
        r5Var.f57462OooO0OO = getAnimProxyListener();
    }

    public void setScaleType(@NotNull o000O0Oo scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.scaleTypeUtil.f57592OooO = scaleType;
    }

    public void startPlay(@NotNull AssetManager assetManager, @NotNull String assetsPath) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(assetsPath, "assetsPath");
        try {
            startPlay(new OooOo(assetManager, assetsPath));
        } catch (Throwable unused) {
            getAnimProxyListener().onFailed(10007, "0x7 file can't read");
            getAnimProxyListener().onVideoComplete();
        }
    }

    public void startPlay(@NotNull Oooo0 evaFileContainer) {
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        ui(new OooO0o(evaFileContainer));
    }
}
