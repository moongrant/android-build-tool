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
import com.facebook.appevents.Oooo000;
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
import p022Oooo00O.OooOO0;
import p022Oooo00O.o00Ooo;
import p022Oooo00O.o00oO0o;
import p029Oooo0oo.o0OOo000;
import p045Oooooo.o000O0;
import p607o0oo0OOo.m1;
import p608o0oo0Oo.o0000O00;
import p608o0oo0Oo.o0000oo;
import p609o0oo0OoO.n1;
import p609o0oo0OoO.o1;
import p609o0oo0OoO.p1;
import p610o0oo0Ooo.q1;
import p610o0oo0Ooo.r1;
import p610o0oo0Ooo.s1;
import p614o0oo0o0O.o000O;
import p614o0oo0o0O.o000OO00;
import p614o0oo0o0O.o00oOoo;
import p615o0oo0o0o.o00O00OO;
import p615o0oo0o0o.oOO00O;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000å\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001u\b\u0016\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0089\u0001B.\b\u0007\u0012\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001\u0012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u0001\u0012\t\b\u0002\u0010\u0085\u0001\u001a\u00020\f¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\u0004H\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\fH\u0016J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\fJ\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0011H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0011H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0011H\u0007J\u000e\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\fJ\u0018\u00108\u001a\u00020\u00042\u0006\u00105\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0011H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0011H\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010D\u001a\u00020CH\u0016J\u0018\u0010E\u001a\u00020\u00042\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0016J\u0010\u0010E\u001a\u00020\u00042\u0006\u0010K\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020\u0004H\u0016J\b\u0010M\u001a\u00020\u0004H\u0016J\b\u0010N\u001a\u00020\u0004H\u0016J\b\u0010O\u001a\u00020\u0011H\u0016J\u0014\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0PH\u0016J\u0010\u0010T\u001a\u00020\u00042\u0006\u0010S\u001a\u00020RH\u0016J\b\u0010U\u001a\u00020\u0011H\u0016J\u0010\u0010X\u001a\u00020\u00042\u0006\u0010W\u001a\u00020VH\u0002J\b\u0010Y\u001a\u00020\u0004H\u0002J\u0016\u0010\\\u001a\u00020\u00042\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00040ZH\u0002J\b\u0010]\u001a\u00020\u0011H\u0002J\b\u0010^\u001a\u00020\u0004H\u0002R\u0016\u0010`\u001a\u00020_8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010hR\u0018\u0010i\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010o\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010tR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010d\u001a\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010{R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007f¨\u0006\u008a\u0001"}, d2 = {"Lcom/yy/yyeva/view/EvaAnimViewV3;", "Lo0oo0o0o/o00O00OO;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "", "updateTextureViewLayout", "prepareTextureView", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "Landroid/view/Surface;", "getSurface", "surface", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "", "onSurfaceTextureDestroyed", "onSurfaceTextureAvailable", "w", "h", "oldw", "oldh", "onSizeChanged", "onAttachedToWindow", "onDetachedFromWindow", "Lo0oo0Ooo/q1;", "evaAnimListener", "setAnimListener", "Lo0oo0Ooo/r1;", "evaFetchResource", "setFetchResource", "Lo0oo0Ooo/s1;", "evaResourceClickListener", "setOnResourceClickListener", "enable", "enableAutoTxtColorFill", "playLoop", "setLoop", "defaultMp4Type", "setDefaultMptType", "", "startPoint", "setStartPoint", "isSupport", "isEdgeBlur", "supportMask", "isSetLastFrame", "setLastFrame", "enableVersion1", "mode", "setVideoMode", "fps", "", "speed", "setVideoFps", "setAudioSpeed", "isNormalMp4", "setNormalMp4", "Lcom/yy/yyeva/util/ScaleType;", "type", "setScaleType", "Lo0oo0o0O/o000OO00;", "scaleType", "isMute", "setMute", "Ljava/io/File;", ShareInternalUtility.STAGING_PARAM, "startPlay", "Landroid/content/res/AssetManager;", "assetManager", "", "assetsPath", "Lo0oo0OoO/p1;", "evaFileContainer", "pause", "resume", "stopPlay", "isRunning", "Lkotlin/Pair;", "getRealSize", "Landroid/graphics/Bitmap;", "bg", "setBgImage", "hasBgImage", "Lo0oo0o0O/o000O;", "videoInfo", "play", "hide", "Lkotlin/Function0;", "f", "ui", "belowKitKat", "release", "Lo0oo0OOo/m1;", "playerEva", "Lo0oo0OOo/m1;", "Landroid/os/Handler;", "uiHandler$delegate", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "Landroid/graphics/SurfaceTexture;", "s", "Landroid/view/Surface;", "Lo0oo0Ooo/q1;", "Lcom/yy/yyeva/view/InnerTextureView;", "innerTextureView", "Lcom/yy/yyeva/view/InnerTextureView;", "lastEvaFile", "Lo0oo0OoO/p1;", "Lo0oo0o0O/o00oOoo;", "scaleTypeUtil", "Lo0oo0o0O/o00oOoo;", "Landroid/graphics/Bitmap;", "com/yy/yyeva/view/OooO0O0", "animProxyListener$delegate", "getAnimProxyListener", "()Lcom/yy/yyeva/view/OooO0O0;", "animProxyListener", "onSizeChangedCalled", "Z", "needPrepareTextureView", "Ljava/lang/Runnable;", "prepareTextureViewRunnable", "Ljava/lang/Runnable;", "updateTextureLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OooO00o", "yyevac_release"}, k = 1, mv = {1, 8, 0})
public class EvaAnimViewV3 extends FrameLayout implements o00O00OO, TextureView.SurfaceTextureListener {

    @NotNull
    private static final String TAG = "EvaAnimPlayer.AnimViewV3";

    /* JADX INFO: renamed from: animProxyListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animProxyListener;

    @Nullable
    private Bitmap bg;

    @Nullable
    private q1 evaAnimListener;

    @Nullable
    private InnerTextureView innerTextureView;

    @Nullable
    private p1 lastEvaFile;
    private boolean needPrepareTextureView;
    private boolean onSizeChangedCalled;
    private m1 playerEva;

    @NotNull
    private final Runnable prepareTextureViewRunnable;

    @Nullable
    private Surface s;

    @NotNull
    private final o00oOoo scaleTypeUtil;

    @Nullable
    private SurfaceTexture surface;

    /* JADX INFO: renamed from: uiHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiHandler;

    @NotNull
    private final Runnable updateTextureLayout;

    public static final class OooO extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f32991OooO0Oo = new OooO();

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
        public final /* synthetic */ p1 f32995OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(p1 p1Var) {
            super(0);
            this.f32995OooO0o0 = p1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EvaAnimViewV3 evaAnimViewV3 = EvaAnimViewV3.this;
            if (evaAnimViewV3.getVisibility() != 0) {
                Intrinsics.checkNotNullParameter(EvaAnimViewV3.TAG, ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("AnimView is GONE, can't play", "msg");
            } else {
                m1 m1Var = evaAnimViewV3.playerEva;
                m1 m1Var2 = null;
                if (m1Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    m1Var = null;
                }
                if (m1Var.OooO0O0()) {
                    Intrinsics.checkNotNullParameter(EvaAnimViewV3.TAG, ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("is running can not start", "msg");
                } else {
                    p1 p1Var = this.f32995OooO0o0;
                    evaAnimViewV3.lastEvaFile = p1Var;
                    m1 m1Var3 = evaAnimViewV3.playerEva;
                    if (m1Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    } else {
                        m1Var2 = m1Var3;
                    }
                    m1Var2.OooO0o(p1Var);
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
        p1 p1Var = this.lastEvaFile;
        if (p1Var != null) {
            p1Var.close();
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
        m1 m1Var = this$0.playerEva;
        m1 m1Var2 = null;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
        m1 m1Var3 = this$0.playerEva;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var3 = null;
        }
        int i = m1Var3.f56944OooO0O0;
        Surface surface2 = this$0.s;
        Intrinsics.checkNotNull(surface2);
        m1 m1Var4 = this$0.playerEva;
        if (m1Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var4 = null;
        }
        m1Var.f56944OooO0O0 = evaJniUtil.initRender(i, surface2, false, m1Var4.f56962OooOo0);
        m1 m1Var5 = this$0.playerEva;
        if (m1Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var5 = null;
        }
        int externalTexture = evaJniUtil.getExternalTexture(m1Var5.f56944OooO0O0);
        if (externalTexture < 0) {
            Log.e(TAG, "surfaceCreated init OpenGL ES failed!");
            return;
        }
        Bitmap bitmap = this$0.bg;
        if (bitmap != null) {
            m1 m1Var6 = this$0.playerEva;
            if (m1Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            } else {
                m1Var2 = m1Var6;
            }
            evaJniUtil.setBgBitmap(m1Var2.f56944OooO0O0, bitmap);
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

    private final void play(o000O videoInfo) {
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
        m1 m1Var = null;
        InnerTextureView innerTextureView = new InnerTextureView(context, 0 == true ? 1 : 0, 6, 0);
        m1 m1Var2 = this$0.playerEva;
        if (m1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var = m1Var2;
        }
        innerTextureView.setPlayerEva(m1Var);
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

    private final void ui(Function0<Unit> f) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            f.invoke();
        } else {
            getUiHandler().post(new o00Ooo(f, 2));
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
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = m1Var.f56961OooOo.f57009OooO0O0;
    }

    @Deprecated(message = "Compatible older version mp4, default false")
    public final void enableVersion1(boolean enable) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56953OooOO0o = enable;
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

    @Override // p615o0oo0o0o.o00O00OO
    @Nullable
    /* JADX INFO: renamed from: getSurfaceTexture, reason: from getter */
    public SurfaceTexture getF32976OooO0o() {
        return this.surface;
    }

    @Override // p615o0oo0o0o.o00O00OO
    public boolean hasBgImage() {
        return this.bg != null;
    }

    public boolean isRunning() {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        return m1Var.OooO0O0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        p1 p1Var;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onAttachedToWindow", "msg");
        super.onAttachedToWindow();
        m1 m1Var = this.playerEva;
        m1 m1Var2 = null;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56954OooOOO = false;
        m1 m1Var3 = this.playerEva;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        if (m1Var2.f56952OooOO0O <= 0 || (p1Var = this.lastEvaFile) == null) {
            return;
        }
        startPlay(p1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onDetachedFromWindow", "msg");
        super.onDetachedFromWindow();
        if (belowKitKat()) {
            release();
        }
        m1 m1Var = this.playerEva;
        m1 m1Var2 = null;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56954OooOOO = true;
        m1 m1Var3 = this.playerEva;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        m1Var2.OooO0OO();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        String msg = OooOO0.OooO00o("onSizeChanged w=", w, ", h=", h);
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00oOoo o00oooo2 = this.scaleTypeUtil;
        o00oooo2.f57038OooO0Oo = w;
        o00oooo2.f57040OooO0o0 = h;
        this.onSizeChangedCalled = true;
        if (this.needPrepareTextureView) {
            this.needPrepareTextureView = false;
            prepareTextureView();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
        o0000oo o0000ooVar;
        Handler handler;
        Intrinsics.checkNotNullParameter(surface, "surface");
        String msg = "onSurfaceTextureAvailable width=" + width + " height=" + height;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        o0000O00 o0000o00 = m1Var.f56946OooO0Oo;
        if (o0000o00 != null && (o0000ooVar = o0000o00.f56973OooO0o0) != null && (handler = o0000ooVar.f56994OooO0O0) != null) {
            handler.post(new o00oO0o(2, this, surface));
        }
        m1 m1Var2 = this.playerEva;
        if (m1Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var2 = null;
        }
        m1Var2.f56956OooOOOO = true;
        o0OOo000 o0ooo001 = m1Var2.f56957OooOOOo;
        if (o0ooo001 != null) {
            o0ooo001.run();
        }
        m1Var2.f56957OooOOOo = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSurfaceTextureDestroyed", "msg");
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.OooO0OO();
        getUiHandler().post(new Oooo000(this, 1));
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
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.OooO0Oo(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    public void pause() {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        oOO00O ooo00o = m1Var.f56948OooO0o0;
        if (ooo00o != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("pause", "msg");
            ooo00o.f57062OooOO0 = true;
        }
        o0000O00 o0000o00 = m1Var.f56946OooO0Oo;
        if (o0000o00 != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("pause", "msg");
            o0000o00.f56986OooOOo = true;
        }
    }

    @Override // p615o0oo0o0o.o00O00OO
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
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        oOO00O ooo00o = m1Var.f56948OooO0o0;
        if (ooo00o != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.AudioPlayer", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("resume", "msg");
            ooo00o.f57062OooOO0 = false;
        }
        o0000O00 o0000o00 = m1Var.f56946OooO0Oo;
        if (o0000o00 != null) {
            Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
            Intrinsics.checkNotNullParameter("resume", "msg");
            o0000o00.f56986OooOOo = false;
        }
    }

    public void setAnimListener(@Nullable q1 evaAnimListener) {
        this.evaAnimListener = evaAnimListener;
    }

    public void setAudioSpeed(float speed) {
        String msg = "setAudioSpeed=" + speed;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56951OooOO0 = speed;
    }

    public void setBgImage(@NotNull Bitmap bg) {
        Intrinsics.checkNotNullParameter(bg, "bg");
        this.bg = bg;
    }

    public final void setDefaultMptType(int defaultMp4Type) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56947OooO0o = Integer.valueOf(defaultMp4Type);
    }

    public void setFetchResource(@Nullable r1 evaFetchResource) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = m1Var.f56961OooOo.f57009OooO0O0;
        if (oooO00o == null) {
            return;
        }
        oooO00o.f32960OooO0O0 = evaFetchResource;
    }

    public void setLastFrame(boolean isSetLastFrame) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56964OooOo0O = isSetLastFrame;
    }

    public void setLoop(int playLoop) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.OooO0o0(playLoop);
    }

    public void setMute(boolean isMute) {
        String msg = "set mute=" + isMute;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56958OooOOo = isMute;
    }

    public void setNormalMp4(boolean isNormalMp4) {
        String msg = "isNormalMp4=" + isNormalMp4;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56962OooOo0 = isNormalMp4;
    }

    public void setOnResourceClickListener(@Nullable s1 evaResourceClickListener) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = m1Var.f56961OooOo.f57009OooO0O0;
    }

    public void setScaleType(@NotNull ScaleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        o00oOoo o00oooo2 = this.scaleTypeUtil;
        o00oooo2.getClass();
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        o00oooo2.f57042OooO0oo = type;
    }

    public void setStartPoint(long startPoint) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56960OooOOoo = startPoint * ((long) 1000);
    }

    public void setVideoFps(int fps, float speed) {
        String msg = "setVideoFps=" + fps + "， speed=" + speed;
        Intrinsics.checkNotNullParameter(TAG, ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.playerEva;
        m1 m1Var2 = null;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56942OooO = true;
        m1 m1Var3 = this.playerEva;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        m1Var2.f56950OooO0oo = (int) (fps * speed);
    }

    public final void setVideoMode(int mode) {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56955OooOOO0 = mode;
    }

    public void startPlay(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            startPlay(new o1(file));
        } catch (Throwable unused) {
            getAnimProxyListener().onFailed(10007, "0x7 file can't read");
            getAnimProxyListener().onVideoComplete();
        }
    }

    public void stopPlay() {
        m1 m1Var = this.playerEva;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        o0000O00 o0000o00 = m1Var.f56946OooO0Oo;
        if (o0000o00 != null) {
            Log.i("EvaAnimPlayer.Decoder", "stop true");
            o0000o00.f56970OooO = true;
        }
        oOO00O ooo00o = m1Var.f56948OooO0o0;
        if (ooo00o != null) {
            ooo00o.f57061OooO0oo = true;
        }
    }

    public void supportMask(boolean isSupport, boolean isEdgeBlur) {
        m1 m1Var = this.playerEva;
        m1 m1Var2 = null;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.getClass();
        m1 m1Var3 = this.playerEva;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        m1Var2.getClass();
    }

    @Override // p615o0oo0o0o.o00O00OO
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
    public EvaAnimViewV3(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = LazyKt.lazy(OooO.f32991OooO0Oo);
        this.scaleTypeUtil = new o00oOoo();
        this.animProxyListener = LazyKt.lazy(new OooO0O0());
        this.prepareTextureViewRunnable = new o000O0(2, this, context);
        this.updateTextureLayout = new Runnable() { // from class: o0oo0o0o.o00O00O
            @Override // java.lang.Runnable
            public final void run() {
                EvaAnimViewV3.updateTextureLayout$lambda$3(this.f57052OooO0Oo);
            }
        };
        hide();
        m1 m1Var = new m1(this);
        this.playerEva = m1Var;
        m1Var.f56945OooO0OO = getAnimProxyListener();
    }

    public void setScaleType(@NotNull o000OO00 scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.scaleTypeUtil.f57034OooO = scaleType;
    }

    public void startPlay(@NotNull AssetManager assetManager, @NotNull String assetsPath) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(assetsPath, "assetsPath");
        try {
            startPlay(new n1(assetManager, assetsPath));
        } catch (Throwable unused) {
            getAnimProxyListener().onFailed(10007, "0x7 file can't read");
            getAnimProxyListener().onVideoComplete();
        }
    }

    public void startPlay(@NotNull p1 evaFileContainer) {
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        ui(new OooO0o(evaFileContainer));
    }
}
