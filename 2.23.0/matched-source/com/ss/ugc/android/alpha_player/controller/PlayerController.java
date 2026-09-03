package com.ss.ugc.android.alpha_player.controller;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.ugc.android.alpha_player.model.AlphaVideoViewType;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.ss.ugc.android.alpha_player.player.PlayerState;
import com.ss.ugc.android.alpha_player.widget.AlphaVideoGLSurfaceView;
import com.ss.ugc.android.alpha_player.widget.AlphaVideoGLTextureView;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/ugc/android/alpha_player/controller/PlayerController;", "Lo0OOO0/OooO00o;", "Landroidx/lifecycle/LifecycleObserver;", "Landroid/os/Handler$Callback;", "", "onPause", "onResume", "onStop", "onDestroy", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lcom/ss/ugc/android/alpha_player/model/AlphaVideoViewType;", "alphaVideoViewType", "Lo0OOO0O/OooO0OO;", "mediaPlayer", "<init>", "(Landroid/content/Context;Landroid/arch/lifecycle/LifecycleOwner;Lcom/ss/ugc/android/alpha_player/model/AlphaVideoViewType;Lo0OOO0O/OooO0OO;)V", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public final class PlayerController implements o0OOO0.OooO00o, LifecycleObserver, Handler.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public View f21855OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0OOO0O0.OooO00o f21856OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f21858OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0OOO00o.OooO0O0 f21859OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public o0OOO0O.OooO0OO f21860OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Handler f21861OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public HandlerThread f21863OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Context f21866OooOOOO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public PlayerState f21857OooO0o = PlayerState.NOT_PREPARED;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Handler f21862OooOO0O = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO0OO f21865OooOOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO0O0 f21864OooOOO = new OooO0O0();

    public static final class OooO implements Runnable {
        public OooO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OOO00o.OooO0O0 oooO0O0 = PlayerController.this.f21859OooO0oO;
            if (oooO0O0 != null) {
                oooO0O0.startAction();
            }
        }
    }

    public static final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OOO00o.OooO0O0 oooO0O0 = PlayerController.this.f21859OooO0oO;
            if (oooO0O0 != null) {
                oooO0O0.endAction();
            }
        }
    }

    public static final class OooO0O0 implements o0OOO0O.OooO0OO.OooO0O0 {
        public OooO0O0() {
        }

        @Override // o0OOO0O.OooO0OO.OooO0O0
        public final void onError() {
            PlayerController playerController = PlayerController.this;
            playerController.getClass();
            playerController.OooO0OO();
        }
    }

    public static final class OooO0OO implements o0OOO0O.OooO0OO.OooO0o {
        public OooO0OO() {
        }

        @Override // o0OOO0O.OooO0OO.OooO0o
        public final void OooO00o() {
            PlayerController playerController = PlayerController.this;
            playerController.getClass();
            playerController.OooO0o(PlayerController.OooO0Oo(3, null));
        }
    }

    public static final class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ScaleType f21872OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OOO0O0.OooO0O0 f21873OooO0o0;

        public OooO0o(o0OOO0O0.OooO0O0 oooO0O0, ScaleType scaleType) {
            this.f21873OooO0o0 = oooO0O0;
            this.f21872OooO0o = scaleType;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OOO00o.OooO0O0 oooO0O0 = PlayerController.this.f21859OooO0oO;
            if (oooO0O0 != null) {
                o0OOO0O0.OooO0O0 oooO0O1 = this.f21873OooO0o0;
                oooO0O0.onVideoSizeChanged(oooO0O1.f43582OooO00o / 2, oooO0O1.f43583OooO0O0, this.f21872OooO0o);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.view.View, o0OOO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public PlayerController(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull AlphaVideoViewType alphaVideoViewType, @NotNull o0OOO0O.OooO0OO oooO0OO) {
        ?? alphaVideoGLSurfaceView;
        this.f21866OooOOOO = context;
        this.f21860OooO0oo = oooO0OO;
        lifecycleOwner.getLifecycle().addObserver(this);
        HandlerThread handlerThread = new HandlerThread("alpha-play-thread", 10);
        this.f21863OooOO0o = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f21863OooOO0o;
        if (handlerThread2 == null) {
            Intrinsics.throwNpe();
        }
        this.f21861OooOO0 = new Handler(handlerThread2.getLooper(), this);
        int i = o0OOO0.OooO0O0.$EnumSwitchMapping$0[alphaVideoViewType.ordinal()];
        if (i == 1) {
            alphaVideoGLSurfaceView = new AlphaVideoGLSurfaceView(context, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alphaVideoGLSurfaceView = new AlphaVideoGLTextureView(context, null);
        }
        this.f21855OooO = alphaVideoGLSurfaceView;
        alphaVideoGLSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        alphaVideoGLSurfaceView.setPlayerController(this);
        alphaVideoGLSurfaceView.setVideoRenderer(new o0OOO0OO.OooO0O0(alphaVideoGLSurfaceView));
        OooO0o(OooO0Oo(1, null));
    }

    public static Message OooO0Oo(int i, Object obj) {
        Message message = Message.obtain();
        message.what = i;
        message.obj = obj;
        Intrinsics.checkExpressionValueIsNotNull(message, "message");
        return message;
    }

    @Override // o0OOO0.OooO00o
    public final void OooO00o(@NotNull Surface surface) {
        OooO0o(OooO0Oo(8, surface));
    }

    @Override // o0OOO0.OooO00o
    public final void OooO0O0() {
        OooO0o(OooO0Oo(5, null));
    }

    public final void OooO0OO() {
        this.f21858OooO0o0 = false;
        this.f21862OooOO0O.post(new OooO00o());
    }

    public final void OooO0o(Message message) {
        HandlerThread handlerThread = this.f21863OooOO0o;
        if (handlerThread == null || !handlerThread.isAlive() || handlerThread.isInterrupted()) {
            return;
        }
        if (this.f21861OooOO0 == null) {
            this.f21861OooOO0 = new Handler(handlerThread.getLooper(), this);
        }
        Handler handler = this.f21861OooOO0;
        if (handler == null) {
            Intrinsics.throwNpe();
        }
        handler.sendMessageDelayed(message, 0L);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, o0OOO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @WorkerThread
    public final void OooO0o0() throws Exception {
        o0OOO0O0.OooO0O0 videoInfo = this.f21860OooO0oo.getVideoInfo();
        ?? r1 = this.f21855OooO;
        if (r1 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r1.OooO0Oo(videoInfo.f43582OooO00o / 2, videoInfo.f43583OooO0O0);
        ?? r2 = this.f21855OooO;
        if (r2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        this.f21862OooOO0O.post(new OooO0o(videoInfo, r2.getF21890OooOOo()));
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.View, o0OOO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @WorkerThread
    public final void OooO0oO(o0OOO0O0.OooO00o oooO00o) throws IOException {
        String str;
        String str2;
        this.f21860OooO0oo.reset();
        PlayerState playerState = PlayerState.NOT_PREPARED;
        this.f21857OooO0o = playerState;
        Resources resources = this.f21866OooOOOO.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        int i = resources.getConfiguration().orientation;
        StringBuilder sb = new StringBuilder();
        String str3 = oooO00o.f43577OooO00o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseDir");
        }
        sb.append(str3);
        if (1 == i) {
            str = oooO00o.f43578OooO0O0;
            if (str == null) {
                str2 = "portPath";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
        } else {
            str = oooO00o.f43579OooO0OO;
            if (str == null) {
                str2 = "landPath";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
        }
        sb.append(str);
        String string = sb.toString();
        ScaleType scaleType = 1 == i ? oooO00o.f43580OooO0Oo : oooO00o.f43581OooO0o0;
        if (TextUtils.isEmpty(string) || !new File(string).exists()) {
            OooO0OO();
            return;
        }
        if (scaleType != null) {
            ?? r4 = this.f21855OooO;
            if (r4 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
            }
            r4.setScaleType(scaleType);
        }
        this.f21860OooO0oo.setLooping(false);
        this.f21860OooO0oo.setDataSource(string);
        ?? r1 = this.f21855OooO;
        if (r1 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        if (!r1.getF21888OooOOOO()) {
            this.f21856OooO0Oo = oooO00o;
            return;
        }
        o0OOO0O.OooO0OO oooO0OO = this.f21860OooO0oo;
        PlayerState playerState2 = this.f21857OooO0o;
        if (playerState2 == playerState || playerState2 == PlayerState.STOPPED) {
            oooO0OO.setOnPreparedListener(this.f21865OooOOO0);
            oooO0OO.setOnErrorListener(this.f21864OooOOO);
            oooO0OO.prepareAsync();
        }
    }

    @WorkerThread
    public final void OooO0oo() {
        int i = o0OOO0.OooO0O0.$EnumSwitchMapping$1[this.f21857OooO0o.ordinal()];
        if (i == 1) {
            this.f21860OooO0oo.start();
            this.f21858OooO0o0 = true;
            this.f21857OooO0o = PlayerState.STARTED;
            this.f21862OooOO0O.post(new OooO());
            return;
        }
        if (i == 2) {
            this.f21860OooO0oo.start();
            this.f21857OooO0o = PlayerState.STARTED;
            return;
        }
        if (i == 3 || i == 4) {
            try {
                o0OOO0O.OooO0OO oooO0OO = this.f21860OooO0oo;
                PlayerState playerState = this.f21857OooO0o;
                if (playerState != PlayerState.NOT_PREPARED && playerState != PlayerState.STOPPED) {
                    return;
                }
                oooO0OO.setOnPreparedListener(this.f21865OooOOO0);
                oooO0OO.setOnErrorListener(this.f21864OooOOO);
                oooO0OO.prepareAsync();
            } catch (Exception e) {
                e.printStackTrace();
                OooO0OO();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r4v26, types: [android.view.View, o0OOO0o0.OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v30, types: [android.view.View, o0OOO0o0.OooO0OO] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@Nullable Message message) throws IOException {
        if (message != null) {
            switch (message.what) {
                case 1:
                    try {
                        this.f21860OooO0oo.initMediaPlayer();
                    } catch (Exception unused) {
                        o0OOO0O.OooO0O0 oooO0O0 = new o0OOO0O.OooO0O0();
                        this.f21860OooO0oo = oooO0O0;
                        oooO0O0.initMediaPlayer();
                    }
                    this.f21860OooO0oo.setScreenOnWhilePlaying(true);
                    this.f21860OooO0oo.setLooping(false);
                    this.f21860OooO0oo.setOnFirstFrameListener(new o0OOO0.OooO0OO(this));
                    this.f21860OooO0oo.setOnCompletionListener(new o0OOO0.OooO0o(this));
                    break;
                case 2:
                    Object obj = message.obj;
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.ugc.android.alpha_player.model.DataSource");
                    }
                    try {
                        OooO0oO((o0OOO0O0.OooO00o) obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.getStackTraceString(e);
                        OooO0OO();
                    }
                    break;
                    break;
                case 3:
                    try {
                        OooO0o0();
                        this.f21857OooO0o = PlayerState.PREPARED;
                        OooO0oo();
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e2) {
                        Log.getStackTraceString(e2);
                        OooO0OO();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    break;
                case 4:
                    if (o0OOO0.OooO0O0.$EnumSwitchMapping$2[this.f21857OooO0o.ordinal()] == 1) {
                        this.f21860OooO0oo.pause();
                        this.f21857OooO0o = PlayerState.PAUSED;
                    }
                    break;
                case 5:
                    if (this.f21858OooO0o0) {
                        OooO0oo();
                    }
                    break;
                case 6:
                    int i = o0OOO0.OooO0O0.$EnumSwitchMapping$3[this.f21857OooO0o.ordinal()];
                    if (i == 1 || i == 2) {
                        this.f21860OooO0oo.pause();
                        this.f21857OooO0o = PlayerState.PAUSED;
                    }
                    break;
                case 7:
                    ?? r4 = this.f21855OooO;
                    if (r4 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                    }
                    r4.onPause();
                    if (this.f21857OooO0o == PlayerState.STARTED) {
                        this.f21860OooO0oo.pause();
                        this.f21857OooO0o = PlayerState.PAUSED;
                    }
                    if (this.f21857OooO0o == PlayerState.PAUSED) {
                        this.f21860OooO0oo.stop();
                        this.f21857OooO0o = PlayerState.STOPPED;
                    }
                    this.f21860OooO0oo.release();
                    ?? r5 = this.f21855OooO;
                    if (r5 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                    }
                    r5.release();
                    this.f21857OooO0o = PlayerState.RELEASE;
                    HandlerThread handlerThread = this.f21863OooOO0o;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        handlerThread.interrupt();
                    }
                    break;
                case 8:
                    Object obj2 = message.obj;
                    if (obj2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.Surface");
                    }
                    this.f21860OooO0oo.setSurface((Surface) obj2);
                    o0OOO0O0.OooO00o oooO00o = this.f21856OooO0Oo;
                    if (oooO00o != null) {
                        OooO0oO(oooO00o);
                    }
                    this.f21856OooO0Oo = null;
                    break;
                    break;
                case 9:
                    this.f21860OooO0oo.reset();
                    this.f21857OooO0o = PlayerState.NOT_PREPARED;
                    this.f21858OooO0o0 = false;
                    break;
            }
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        OooO0o(OooO0Oo(7, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        OooO0o(OooO0Oo(4, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        OooO0O0();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        OooO0o(OooO0Oo(6, null));
    }
}
