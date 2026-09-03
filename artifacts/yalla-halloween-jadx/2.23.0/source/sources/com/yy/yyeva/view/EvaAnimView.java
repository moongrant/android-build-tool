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
import com.facebook.appevents.OooOOO0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import com.yy.yyeva.util.ScaleType;
import com.yy.yyeva.view.EvaAnimView;
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
import p022Oooo00O.OooOO0;
import p022Oooo00O.o00O0O;
import p029Oooo0oo.o0OOo000;
import p045Oooooo.o000O00;
import p045Oooooo.o000O0o;
import p607o0oo0OOo.m1;
import p608o0oo0Oo.o0000O00;
import p608o0oo0Oo.o0000oo;
import p609o0oo0OoO.p1;
import p610o0oo0Ooo.q1;
import p610o0oo0Ooo.r1;
import p610o0oo0Ooo.s1;
import p614o0oo0o0O.o000OO00;
import p614o0oo0o0O.o00oOoo;
import p615o0oo0o0o.o00O00;
import p615o0oo0o0o.o00O00OO;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00015\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B'\b\u0007\u0012\u0006\u0010;\u001a\u00020:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010>\u001a\u00020\u0013¢\u0006\u0004\b?\u0010@J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0007J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0019H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130*H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108¨\u0006A"}, d2 = {"Lcom/yy/yyeva/view/EvaAnimView;", "Lo0oo0o0o/o00O00OO;", "Landroid/widget/FrameLayout;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "Landroid/view/Surface;", "getSurface", "Lo0oo0Ooo/q1;", "evaAnimListener", "", "setAnimListener", "Lo0oo0Ooo/r1;", "evaFetchResource", "setFetchResource", "Lo0oo0Ooo/s1;", "evaResourceClickListener", "setOnResourceClickListener", "", "playLoop", "setLoop", "", "startPoint", "setStartPoint", "", "isSetLastFrame", "setLastFrame", "mode", "setVideoMode", "isNormalMp4", "setNormalMp4", "", "speed", "setAudioSpeed", "Lcom/yy/yyeva/util/ScaleType;", "type", "setScaleType", "Lo0oo0o0O/o000OO00;", "scaleType", "isMute", "setMute", "Lkotlin/Pair;", "getRealSize", "Landroid/graphics/Bitmap;", "bg", "setBgImage", "Landroid/os/Handler;", "OooO0o0", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "com/yy/yyeva/view/OooO00o", "OooOOO0", "getAnimProxyListener", "()Lcom/yy/yyeva/view/OooO00o;", "animProxyListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "yyevac_release"}, k = 1, mv = {1, 8, 0})
public class EvaAnimView extends FrameLayout implements o00O00OO, SurfaceHolder.Callback, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f32973OooOOo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public InnerSurfaceView f32974OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final m1 f32975OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f32976OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy uiHandler;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public Surface f32978OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public q1 f32979OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public p1 f32980OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00oOoo f32981OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Bitmap f32982OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f32983OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy animProxyListener;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f32985OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @SuppressLint({"LongLogTag"})
    @NotNull
    public final OooOOO0 f32986OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o000O00 f32987OooOOo0;

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
        public static final OooO0OO f32990OooO0Oo = new OooO0OO();

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
        p1 p1Var = this.f32980OooOO0;
        if (p1Var != null) {
            p1Var.close();
        }
        OooO0o0(new OooO0O0());
    }

    public final void OooO0o0(Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            getUiHandler().post(new o000O0o(function0, 1));
        }
    }

    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return this.f32981OooOO0O.OooO0OO();
    }

    @Nullable
    public Surface getSurface() {
        SurfaceHolder holder;
        Surface surface = this.f32978OooO0oO;
        if (surface != null) {
            return surface;
        }
        InnerSurfaceView innerSurfaceView = this.f32974OooO;
        if (innerSurfaceView == null || (holder = innerSurfaceView.getHolder()) == null) {
            return null;
        }
        return holder.getSurface();
    }

    @Override // p615o0oo0o0o.o00O00OO
    @Nullable
    /* JADX INFO: renamed from: getSurfaceTexture, reason: from getter */
    public SurfaceTexture getF32976OooO0o() {
        return this.f32976OooO0o;
    }

    @Override // p615o0oo0o0o.o00O00OO
    public final boolean hasBgImage() {
        return this.f32982OooOO0o != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        m1 m1Var;
        p1 evaFileContainer;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onAttachedToWindow", "msg");
        super.onAttachedToWindow();
        m1 m1Var2 = null;
        m1 m1Var3 = this.f32975OooO0Oo;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        } else {
            m1Var = m1Var3;
        }
        m1Var.f56954OooOOO = false;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        if (m1Var2.f56952OooOO0O <= 0 || (evaFileContainer = this.f32980OooOO0) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(evaFileContainer, "evaFileContainer");
        OooO0o0(new o00O00(this, evaFileContainer));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m1 m1Var;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onDetachedFromWindow", "msg");
        super.onDetachedFromWindow();
        m1 m1Var2 = null;
        m1 m1Var3 = this.f32975OooO0Oo;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        } else {
            m1Var = m1Var3;
        }
        m1Var.f56954OooOOO = true;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        m1Var2.OooO0OO();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(@Nullable SurfaceTexture surfaceTexture) {
        this.f32976OooO0o = surfaceTexture;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        String msg = OooOO0.OooO00o("onSizeChanged w=", i, ", h=", i2);
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00oOoo o00oooo2 = this.f32981OooOO0O;
        o00oooo2.f57038OooO0Oo = i;
        o00oooo2.f57040OooO0o0 = i2;
        this.f32983OooOOO = true;
        if (this.f32985OooOOOO) {
            this.f32985OooOOOO = false;
            prepareTextureView();
        }
    }

    @Override // p615o0oo0o0o.o00O00OO
    public final void prepareTextureView() {
        if (this.f32983OooOOO) {
            getUiHandler().post(this.f32986OooOOOo);
            return;
        }
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSizeChanged not called", "msg");
        this.f32985OooOOOO = true;
    }

    public void setAnimListener(@Nullable q1 evaAnimListener) {
        this.f32979OooO0oo = evaAnimListener;
    }

    public void setAudioSpeed(float speed) {
        String msg = "setAudioSpeed=" + speed;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56951OooOO0 = speed;
    }

    public void setBgImage(@NotNull Bitmap bg) {
        Intrinsics.checkNotNullParameter(bg, "bg");
        this.f32982OooOO0o = bg;
    }

    public void setFetchResource(@Nullable r1 evaFetchResource) {
        m1 m1Var = this.f32975OooO0Oo;
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
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56964OooOo0O = isSetLastFrame;
    }

    public void setLoop(int playLoop) {
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.OooO0o0(playLoop);
    }

    public void setMute(boolean isMute) {
        String msg = "set mute=" + isMute;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56958OooOOo = isMute;
    }

    public void setNormalMp4(boolean isNormalMp4) {
        String msg = "isNormalMp4=" + isNormalMp4;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56962OooOo0 = isNormalMp4;
    }

    public void setOnResourceClickListener(@Nullable s1 evaResourceClickListener) {
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        com.yy.yyeva.mix.OooO00o oooO00o = m1Var.f56961OooOo.f57009OooO0O0;
    }

    public void setScaleType(@NotNull o000OO00 scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f32981OooOO0O.f57034OooO = scaleType;
    }

    public void setStartPoint(long startPoint) {
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56960OooOOoo = startPoint * ((long) 1000);
    }

    @Deprecated(message = "Compatible older version mp4")
    public final void setVideoMode(int mode) {
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.f56955OooOOO0 = mode;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(@NotNull SurfaceHolder surface, int i, int i2, int i3) {
        m1 m1Var;
        Intrinsics.checkNotNullParameter(surface, "surface");
        String msg = "onSurfaceTextureSizeChanged " + i2 + " x " + i3;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f32978OooO0oO = surface.getSurface();
        m1 m1Var2 = null;
        m1 m1Var3 = this.f32975OooO0Oo;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        } else {
            m1Var = m1Var3;
        }
        m1Var.f56956OooOOOO = true;
        o0OOo000 o0ooo001 = m1Var.f56957OooOOOo;
        if (o0ooo001 != null) {
            o0ooo001.run();
        }
        m1Var.f56957OooOOOo = null;
        if (m1Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
        } else {
            m1Var2 = m1Var3;
        }
        m1Var2.OooO0Oo(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    @SuppressLint({"LongLogTag"})
    public final void surfaceCreated(@NotNull final SurfaceHolder holder) {
        o0000oo o0000ooVar;
        Handler handler;
        Intrinsics.checkNotNullParameter(holder, "holder");
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        o0000O00 o0000o00 = m1Var.f56946OooO0Oo;
        if (o0000o00 == null || (o0000ooVar = o0000o00.f56973OooO0o0) == null || (handler = o0000ooVar.f56994OooO0O0) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: o0oo0o0o.o00O000o
            @Override // java.lang.Runnable
            public final void run() {
                EvaAnimView this$0 = this.f57050OooO0Oo;
                SurfaceHolder holder2 = holder;
                int i = EvaAnimView.f32973OooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder2, "$holder");
                m1 m1Var2 = this$0.f32975OooO0Oo;
                m1 m1Var3 = null;
                if (m1Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    m1Var2 = null;
                }
                EvaJniUtil evaJniUtil = EvaJniUtil.f32972OooO00o;
                m1 m1Var4 = this$0.f32975OooO0Oo;
                if (m1Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    m1Var4 = null;
                }
                int i2 = m1Var4.f56944OooO0O0;
                Surface surface = holder2.getSurface();
                Intrinsics.checkNotNullExpressionValue(surface, "holder.surface");
                m1 m1Var5 = this$0.f32975OooO0Oo;
                if (m1Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    m1Var5 = null;
                }
                m1Var2.f56944OooO0O0 = evaJniUtil.initRender(i2, surface, false, m1Var5.f56962OooOo0);
                m1 m1Var6 = this$0.f32975OooO0Oo;
                if (m1Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    m1Var6 = null;
                }
                int externalTexture = evaJniUtil.getExternalTexture(m1Var6.f56944OooO0O0);
                if (externalTexture < 0) {
                    Log.e("EvaAnimPlayer.AnimView", "surfaceCreated init OpenGL ES failed!");
                    return;
                }
                Bitmap bitmap = this$0.f32982OooOO0o;
                if (bitmap != null) {
                    m1 m1Var7 = this$0.f32975OooO0Oo;
                    if (m1Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    } else {
                        m1Var3 = m1Var7;
                    }
                    evaJniUtil.setBgBitmap(m1Var3.f56944OooO0O0, bitmap);
                    bitmap.recycle();
                }
                SurfaceTexture surfaceTexture = new SurfaceTexture(externalTexture);
                this$0.f32976OooO0o = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this$0);
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(@NotNull SurfaceHolder surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimView", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onSurfaceTextureDestroyed", "msg");
        m1 m1Var = this.f32975OooO0Oo;
        if (m1Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
            m1Var = null;
        }
        m1Var.OooO0OO();
        getUiHandler().post(new o00O0O(this, 4));
    }

    @Override // p615o0oo0o0o.o00O00OO
    public final void updateTextureViewLayout() {
        getUiHandler().post(this.f32987OooOOo0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setScaleType(@NotNull ScaleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        o00oOoo o00oooo2 = this.f32981OooOO0O;
        o00oooo2.getClass();
        Intrinsics.checkNotNullParameter(type, "<set-?>");
        o00oooo2.f57042OooO0oo = type;
    }

    public /* synthetic */ EvaAnimView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EvaAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = LazyKt.lazy(OooO0OO.f32990OooO0Oo);
        this.f32981OooOO0O = new o00oOoo();
        this.animProxyListener = LazyKt.lazy(new OooO00o());
        this.f32986OooOOOo = new OooOOO0(this, context);
        this.f32987OooOOo0 = new o000O00(this, 2);
        OooO0OO();
        m1 m1Var = new m1(this);
        this.f32975OooO0Oo = m1Var;
        m1Var.f56945OooO0OO = getAnimProxyListener();
    }
}
