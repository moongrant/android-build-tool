package com.yy.yyeva.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.message.o0Oo0oo;
import com.yy.yyeva.util.ScaleType;
import com.yy.yyeva.view.EvaAnimView;
import com.yy.yyeva.view.InnerSurfaceView;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0000O;
import p045Oooooo.o0000;
import p612o0oo0OoO.q5;
import p612o0oo0OoO.r5;
import p613o0oo0Ooo.w5;
import p613o0oo0Ooo.x5;
import p615o0oo0o0.o000oOoO;
import p615o0oo0o0.o00O0O;
import p615o0oo0o0.o0OoOo0;
import p616o0oo0o00.Oooo0;
import p619o0oo0oO.oO0O0;
import p619o0oo0oO.oO0O00o0;
import p619o0oo0oO.oOo0o0oO;
import p620o0oo0oO0.o000O0Oo;
import p620o0oo0oO0.o000OOo0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00015\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010;\u001a\u00020:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u0013¢\u0006\u0004\b?\u0010@J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0019H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130*H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108¨\u0006A"}, d2 = {"Lcom/yy/yyeva/view/EvaAnimView;", "Lo0oo0oO/oOo0o0oO;", "Landroid/widget/FrameLayout;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "Landroid/view/Surface;", "getSurface", "Lo0oo0o0/o000oOoO;", "evaAnimListener", "", "setAnimListener", "Lo0oo0o0/o0OoOo0;", "evaFetchResource", "setFetchResource", "Lo0oo0o0/o00O0O;", "evaResourceClickListener", "setOnResourceClickListener", "", "playLoop", "setLoop", "", "startPoint", "setStartPoint", "", "isSetLastFrame", "setLastFrame", "mode", "setVideoMode", "isNormalMp4", "setNormalMp4", "", "speed", "setAudioSpeed", "Lcom/yy/yyeva/util/ScaleType;", "type", "setScaleType", "Lo0oo0oO0/o000O0Oo;", "scaleType", "isMute", "setMute", "Lkotlin/Pair;", "getRealSize", "Landroid/graphics/Bitmap;", "bg", "setBgImage", "Landroid/os/Handler;", "OooO0o0", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "com/yy/yyeva/view/OooO00o", "OooOOO0", "getAnimProxyListener", "()Lcom/yy/yyeva/view/OooO00o;", "animProxyListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "yyevac_release"}, k = 1, mv = {1, 8, 0})
public class EvaAnimView extends FrameLayout implements oOo0o0oO, SurfaceHolder.Callback, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f32438OooOOo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public InnerSurfaceView f32439OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final r5 f32440OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f32441OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy uiHandler;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Surface f32443OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o000oOoO f32444OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Oooo0 f32445OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o000OOo0 f32446OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Bitmap f32447OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f32448OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy animProxyListener;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f32450OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SuppressLint({"LongLogTag"})
    @NotNull
    public final oO0O00o0 f32451OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o0000O f32452OooOOo0;

    public static final class OooO00o extends Lambda implements Function0<com.yy.yyeva.view.OooO00o> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yy.yyeva.view.OooO00o invoke() {
            return new com.yy.yyeva.view.OooO00o(EvaAnimView.this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            EvaAnimView.this.removeAllViews();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f32455OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.yy.yyeva.view.OooO00o getAnimProxyListener() {
        return (com.yy.yyeva.view.OooO00o) this.animProxyListener.getValue();
    }

    private final Handler getUiHandler() {
        return (Handler) this.uiHandler.getValue();
    }

    public final void OooO0OO() {
        Oooo0 oooo0 = this.f32445OooOO0;
        if (oooo0 != null) {
            oooo0.close();
        }
        OooO0Oo(new OooO0O0());
    }

    public final void OooO0Oo(Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            getUiHandler().post(new o0Oo0oo(function0, 1));
        }
    }

    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return this.f32446OooOO0O.OooO0OO();
    }

    @Nullable
    public Surface getSurface() {
        SurfaceHolder holder;
        Surface surface = this.f32443OooO0oO;
        if (surface != null) {
            return surface;
        }
        InnerSurfaceView innerSurfaceView = this.f32439OooO;
        if (innerSurfaceView == null || (holder = innerSurfaceView.getHolder()) == null) {
            return null;
        }
        return holder.getSurface();
    }

    @Override // p619o0oo0oO.oOo0o0oO
    @Nullable
    /* JADX INFO: renamed from: getSurfaceTexture, reason: from getter */
    public SurfaceTexture getF32441OooO0o() {
        return this.f32441OooO0o;
    }

    @Override // p619o0oo0oO.oOo0o0oO
    public final boolean hasBgImage() {
        return this.f32447OooOO0o != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        r5 r5Var;
        Oooo0 evaFileContainer;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onAttachedToWindow", "msg");
        super.onAttachedToWindow();
        r5 r5Var2 = null;
        r5 r5Var3 = this.f32440OooO0Oo;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        } else {
            r5Var = r5Var3;
        }
        r5Var.f57471OooOOO = false;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        if (r5Var2.f57469OooOO0O <= 0 || (evaFileContainer = this.f32445OooOO0) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        OooO0Oo(new oO0O0(this, evaFileContainer));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        r5 r5Var;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onDetachedFromWindow", "msg");
        super.onDetachedFromWindow();
        r5 r5Var2 = null;
        r5 r5Var3 = this.f32440OooO0Oo;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        } else {
            r5Var = r5Var3;
        }
        r5Var.f57471OooOOO = true;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        r5Var2.OooO0OO();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@Nullable SurfaceTexture surfaceTexture) {
        this.f32441OooO0o = surfaceTexture;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        String msg = androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("onSizeChanged w=", i, ", h=", i2);
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        o000OOo0 o000ooo1 = this.f32446OooOO0O;
        o000ooo1.f57596OooO0Oo = i;
        o000ooo1.f57598OooO0o0 = i2;
        this.f32448OooOOO = true;
        if (this.f32450OooOOOO) {
            this.f32450OooOOOO = false;
            prepareTextureView();
        }
    }

    @Override // p619o0oo0oO.oOo0o0oO
    public final void prepareTextureView() {
        if (this.f32448OooOOO) {
            getUiHandler().post(this.f32451OooOOOo);
            return;
        }
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSizeChanged not called", "msg");
        this.f32450OooOOOO = true;
    }

    public void setAnimListener(@Nullable o000oOoO evaAnimListener) {
        this.f32444OooO0oo = evaAnimListener;
    }

    public void setAudioSpeed(float speed) {
        String msg = "setAudioSpeed=" + speed;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57468OooOO0 = speed;
    }

    public void setBgImage(@NotNull Bitmap bg) {
        Intrinsics.checkNotNullParameter(bg, "bg");
        this.f32447OooOO0o = bg;
    }

    public void setFetchResource(@Nullable o0OoOo0 evaFetchResource) {
        r5 r5Var = this.f32440OooO0Oo;
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
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57481OooOo0O = isSetLastFrame;
    }

    public void setLoop(int playLoop) {
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.OooO0o0(playLoop);
    }

    public void setMute(boolean isMute) {
        String msg = "set mute=" + isMute;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57475OooOOo = isMute;
    }

    public void setNormalMp4(boolean isNormalMp4) {
        String msg = "isNormalMp4=" + isNormalMp4;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57479OooOo0 = isNormalMp4;
    }

    public void setOnResourceClickListener(@Nullable o00O0O evaResourceClickListener) {
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = r5Var.f57478OooOo.f57550OooO0O0;
    }

    public void setScaleType(@NotNull o000O0Oo scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f32446OooOO0O.f57592OooO = scaleType;
    }

    public void setStartPoint(long startPoint) {
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57477OooOOoo = startPoint * ((long) 1000);
    }

    @Deprecated(message = "Compatible older version mp4")
    public final void setVideoMode(int mode) {
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.f57472OooOOO0 = mode;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(@NotNull SurfaceHolder surface, int i, int i2, int i3) {
        r5 r5Var;
        Intrinsics.checkNotNullParameter(surface, "surface");
        String msg = "onSurfaceTextureSizeChanged " + i2 + " x " + i3;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f32443OooO0oO = surface.getSurface();
        r5 r5Var2 = null;
        r5 r5Var3 = this.f32440OooO0Oo;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        } else {
            r5Var = r5Var3;
        }
        r5Var.f57473OooOOOO = true;
        q5 q5Var = r5Var.f57474OooOOOo;
        if (q5Var != null) {
            q5Var.run();
        }
        r5Var.f57474OooOOOo = null;
        if (r5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            r5Var2 = r5Var3;
        }
        r5Var2.OooO0Oo(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    @SuppressLint({"LongLogTag"})
    public final void surfaceCreated(@NotNull SurfaceHolder holder) {
        x5 x5Var;
        Handler handler;
        Intrinsics.checkNotNullParameter(holder, "holder");
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        w5 w5Var = r5Var.f57463OooO0Oo;
        if (w5Var == null || (x5Var = w5Var.f57486OooO0o0) == null || (handler = x5Var.f57510OooO0O0) == null) {
            return;
        }
        handler.post(new o0000(1, this, holder));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(@NotNull SurfaceHolder surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSurfaceTextureDestroyed", "msg");
        r5 r5Var = this.f32440OooO0Oo;
        if (r5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            r5Var = null;
        }
        r5Var.OooO0OO();
        getUiHandler().post(new Runnable() { // from class: o0oo0oO.oO0O00oO
            @Override // java.lang.Runnable
            public final void run() {
                int i = EvaAnimView.f32438OooOOo;
                EvaAnimView this$0 = this.f57559OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SurfaceTexture surfaceTexture = this$0.f32441OooO0o;
                if (surfaceTexture != null) {
                    surfaceTexture.setOnFrameAvailableListener(null);
                }
                this$0.f32439OooO = null;
                this$0.removeAllViews();
            }
        });
    }

    @Override // p619o0oo0oO.oOo0o0oO
    public final void updateTextureViewLayout() {
        getUiHandler().post(this.f32452OooOOo0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setScaleType(@NotNull ScaleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        o000OOo0 o000ooo1 = this.f32446OooOO0O;
        o000ooo1.getClass();
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        o000ooo1.f57600OooO0oo = type;
    }

    public /* synthetic */ EvaAnimView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v6, types: [o0oo0oO.oO0O00o0] */
    @JvmOverloads
    public EvaAnimView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = LazyKt.lazy(OooO0OO.f32455OooO0Oo);
        this.f32446OooOO0O = new o000OOo0();
        this.animProxyListener = LazyKt.lazy(new OooO00o());
        this.f32451OooOOOo = new Runnable() { // from class: o0oo0oO.oO0O00o0
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = EvaAnimView.f32438OooOOo;
                EvaAnimView this$0 = this.f57557OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                Log.i("EvaAnimPlayer.AnimView", "prepareTextureViewRunnable");
                this$0.removeAllViews();
                r5 r5Var = null;
                InnerSurfaceView innerSurfaceView = new InnerSurfaceView(context2, null, 6, 0);
                r5 r5Var2 = this$0.f32440OooO0Oo;
                if (r5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                } else {
                    r5Var = r5Var2;
                }
                innerSurfaceView.setPlayerEva(r5Var);
                innerSurfaceView.setLayoutParams(this$0.f32446OooOO0O.OooO0O0(innerSurfaceView));
                this$0.f32439OooO = innerSurfaceView;
                SurfaceHolder holder = innerSurfaceView.getHolder();
                if (holder != null) {
                    holder.addCallback(this$0);
                }
                this$0.addView(this$0.f32439OooO);
            }
        };
        this.f32452OooOOo0 = new o0000O(this, 3);
        OooO0OO();
        r5 r5Var = new r5(this);
        this.f32440OooO0Oo = r5Var;
        r5Var.f57462OooO0OO = getAnimProxyListener();
    }
}
