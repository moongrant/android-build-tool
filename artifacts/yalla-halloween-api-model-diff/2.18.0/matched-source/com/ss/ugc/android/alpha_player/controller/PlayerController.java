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
import com.umeng.analytics.pro.d;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p397o0Oo.OooOOO;
import p397o0Oo.OooOOOO;
import p397o0Oo.OooOo;
import p424o0Oo0ooo.oO00o0;
import p424o0Oo0ooo.oOo00o0o;
import p426o0OoO000.OooOOO0;
import p470o0OooOoo.oO00000o;
import p470o0OooOoo.oO0000O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/ugc/android/alpha_player/controller/PlayerController;", "Lo0Oo/OooOOO;", "Landroidx/lifecycle/LifecycleObserver;", "Landroid/os/Handler$Callback;", "", "onPause", "onResume", "onStop", "onDestroy", "Landroid/content/Context;", d.R, "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lcom/ss/ugc/android/alpha_player/model/AlphaVideoViewType;", "alphaVideoViewType", "Lo0OoO000/OooOOO;", "mediaPlayer", "<init>", "(Landroid/content/Context;Landroid/arch/lifecycle/LifecycleOwner;Lcom/ss/ugc/android/alpha_player/model/AlphaVideoViewType;Lo0OoO000/OooOOO;)V", "alpha_player_release"}, k = 1, mv = {1, 4, 0})
public final class PlayerController implements OooOOO, LifecycleObserver, Handler.Callback {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f19850Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public oOo00o0o f19851OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Context f19852OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public oO00o0 f19854OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public p426o0OoO000.OooOOO f19855OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public Handler f19856OoooOOO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public HandlerThread f19858OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public View f19861o000oOoO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public PlayerState f19853OoooO00 = PlayerState.NOT_PREPARED;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final Handler f19857OoooOOo = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final OooO0OO f19859OoooOoO = new OooO0OO();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final OooO0O0 f19860OoooOoo = new OooO0O0();

    public static final class OooO implements Runnable {
        public OooO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            oOo00o0o ooo00o0o = PlayerController.this.f19851OoooO;
            if (ooo00o0o != null) {
                ooo00o0o.OooO00o();
            }
        }
    }

    public static final class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            oOo00o0o ooo00o0o = PlayerController.this.f19851OoooO;
            if (ooo00o0o != null) {
                ooo00o0o.OooO0OO();
            }
        }
    }

    public static final class OooO0O0 implements o0OoO000.OooOOO.OooO0O0 {
        public OooO0O0() {
        }

        @Override // o0OoO000.OooOOO.OooO0O0
        public final void OooO00o(int i, int i2, @NotNull String str) {
            PlayerController playerController = PlayerController.this;
            String strOooO00o = OooOo00.OooO00o("mediaPlayer error, info: ", str);
            oO00o0 oo00o0 = playerController.f19854OoooO0O;
            if (oo00o0 != null) {
                oo00o0.OooO00o(playerController.f19855OoooOO0.OooO0o(), strOooO00o);
            }
            PlayerController.this.OooO00o();
        }
    }

    public static final class OooO0OO implements o0OoO000.OooOOO.OooO0o {
        public OooO0OO() {
        }

        @Override // o0OoO000.OooOOO.OooO0o
        public final void OooO00o() {
            PlayerController playerController = PlayerController.this;
            playerController.OooO0oo(playerController.OooO0Oo(3, null));
        }
    }

    public static final class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ ScaleType f19867OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ oO0000O f19868OoooO00;

        public OooO0o(oO0000O oo0000o, ScaleType scaleType) {
            this.f19868OoooO00 = oo0000o;
            this.f19867OoooO0 = scaleType;
        }

        @Override // java.lang.Runnable
        public final void run() {
            oOo00o0o ooo00o0o = PlayerController.this.f19851OoooO;
            if (ooo00o0o != null) {
                int i = this.f19868OoooO00.f40597OooO00o / 2;
                ooo00o0o.OooO0O0(this.f19867OoooO0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public PlayerController(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull AlphaVideoViewType alphaVideoViewType, @NotNull p426o0OoO000.OooOOO oooOOO) {
        ?? alphaVideoGLSurfaceView;
        this.f19852OoooO0 = context;
        this.f19855OoooOO0 = oooOOO;
        lifecycleOwner.getLifecycle().addObserver(this);
        HandlerThread handlerThread = new HandlerThread("alpha-play-thread", 10);
        this.f19858OoooOo0 = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = this.f19858OoooOo0;
        if (handlerThread2 == null) {
            Intrinsics.throwNpe();
        }
        this.f19856OoooOOO = new Handler(handlerThread2.getLooper(), this);
        int i = OooOOOO.$EnumSwitchMapping$0[alphaVideoViewType.ordinal()];
        if (i == 1) {
            alphaVideoGLSurfaceView = new AlphaVideoGLSurfaceView(context, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            alphaVideoGLSurfaceView = new AlphaVideoGLTextureView(context, null);
        }
        this.f19861o000oOoO = alphaVideoGLSurfaceView;
        alphaVideoGLSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        alphaVideoGLSurfaceView.setPlayerController(this);
        alphaVideoGLSurfaceView.setVideoRenderer(new p425o0OoO0.OooO0o(alphaVideoGLSurfaceView));
        OooO0oo(OooO0Oo(1, null));
    }

    public static void OooO0o0(PlayerController playerController, boolean z, String str) {
        oO00o0 oo00o0 = playerController.f19854OoooO0O;
        if (oo00o0 != null) {
            oo00o0.OooO00o(playerController.f19855OoooOO0.OooO0o(), str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    @WorkerThread
    public final void OooO(oO00000o oo00000o) throws IOException {
        String str;
        String str2;
        this.f19855OoooOO0.OooO00o();
        this.f19853OoooO00 = PlayerState.NOT_PREPARED;
        Resources resources = this.f19852OoooO0.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        int i = resources.getConfiguration().orientation;
        StringBuilder sb = new StringBuilder();
        String str3 = oo00000o.f40592OooO00o;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("baseDir");
        }
        sb.append(str3);
        if (1 == i) {
            str = oo00000o.f40593OooO0O0;
            if (str == null) {
                str2 = "portPath";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
        } else {
            str = oo00000o.f40594OooO0OO;
            if (str == null) {
                str2 = "landPath";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
            }
        }
        sb.append(str);
        String string = sb.toString();
        ScaleType scaleType = 1 == i ? oo00000o.f40595OooO0Oo : oo00000o.f40596OooO0o0;
        if (TextUtils.isEmpty(string) || !new File(string).exists()) {
            OooO0o0(this, false, "dataPath is empty or File is not exists. path = " + string);
            OooO00o();
            return;
        }
        if (scaleType != null) {
            ?? r2 = this.f19861o000oOoO;
            if (r2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
            }
            r2.setScaleType(scaleType);
        }
        this.f19855OoooOO0.OooO0oo();
        this.f19855OoooOO0.OooOO0O(string);
        ?? r6 = this.f19861o000oOoO;
        if (r6 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        if (r6.getF19883Ooooo0o()) {
            OooO0oO();
        }
    }

    public final void OooO00o() {
        this.f19850Oooo = false;
        this.f19857OoooOOo.post(new OooO00o());
    }

    @Override // p397o0Oo.OooOOO
    public final void OooO0O0(@NotNull Surface surface) {
        OooO0oo(OooO0Oo(8, surface));
    }

    @Override // p397o0Oo.OooOOO
    public final void OooO0OO() {
        OooO0oo(OooO0Oo(5, null));
    }

    public final Message OooO0Oo(int i, Object obj) {
        Message message = Message.obtain();
        message.what = i;
        message.obj = obj;
        Intrinsics.checkExpressionValueIsNotNull(message, "message");
        return message;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    @WorkerThread
    public final void OooO0o() throws Exception {
        oO0000O oo0000oOooO0OO = this.f19855OoooOO0.OooO0OO();
        ?? r1 = this.f19861o000oOoO;
        if (r1 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        r1.OooO0o0(oo0000oOooO0OO.f40597OooO00o / 2, oo0000oOooO0OO.f40598OooO0O0);
        ?? r2 = this.f19861o000oOoO;
        if (r2 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
        }
        this.f19857OoooOOo.post(new OooO0o(oo0000oOooO0OO, r2.getF19886OooooOo()));
    }

    @WorkerThread
    public final void OooO0oO() {
        p426o0OoO000.OooOOO oooOOO = this.f19855OoooOO0;
        PlayerState playerState = this.f19853OoooO00;
        if (playerState == PlayerState.NOT_PREPARED || playerState == PlayerState.STOPPED) {
            oooOOO.OooO(this.f19859OoooOoO);
            oooOOO.OooO0Oo(this.f19860OoooOoo);
            oooOOO.OooOO0o();
        }
    }

    public final void OooO0oo(Message message) {
        HandlerThread handlerThread = this.f19858OoooOo0;
        if (handlerThread == null || !handlerThread.isAlive() || handlerThread.isInterrupted()) {
            return;
        }
        if (this.f19856OoooOOO == null) {
            this.f19856OoooOOO = new Handler(handlerThread.getLooper(), this);
        }
        Handler handler = this.f19856OoooOOO;
        if (handler == null) {
            Intrinsics.throwNpe();
        }
        handler.sendMessageDelayed(message, 0L);
    }

    @WorkerThread
    public final void OooOO0() {
        int i = OooOOOO.$EnumSwitchMapping$1[this.f19853OoooO00.ordinal()];
        if (i == 1) {
            this.f19855OoooOO0.start();
            this.f19850Oooo = true;
            this.f19853OoooO00 = PlayerState.STARTED;
            this.f19857OoooOOo.post(new OooO());
            return;
        }
        if (i == 2) {
            this.f19855OoooOO0.start();
            this.f19853OoooO00 = PlayerState.STARTED;
        } else if (i == 3 || i == 4) {
            try {
                OooO0oO();
            } catch (Exception e) {
                e.printStackTrace();
                OooO0o0(this, false, "prepare and start MediaPlayer failure!");
                OooO00o();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r5v30, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    /* JADX WARN: Type inference failed for: r5v34, types: [android.view.View, o0OoO0OO.o0Oo0oo] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@Nullable Message message) {
        if (message != null) {
            switch (message.what) {
                case 1:
                    try {
                        this.f19855OoooOO0.OooOO0();
                    } catch (Exception unused) {
                        OooOOO0 oooOOO0 = new OooOOO0();
                        this.f19855OoooOO0 = oooOOO0;
                        oooOOO0.OooOO0();
                    }
                    this.f19855OoooOO0.OooO0oO();
                    this.f19855OoooOO0.OooO0oo();
                    this.f19855OoooOO0.OooO0o0(new p397o0Oo.OooOo00(this));
                    this.f19855OoooOO0.OooOOO0(new OooOo(this));
                    break;
                case 2:
                    Object obj = message.obj;
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.ugc.android.alpha_player.model.DataSource");
                    }
                    try {
                        OooO((oO00000o) obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                        OooO0o0(this, false, "alphaVideoView set dataSource failure: " + Log.getStackTraceString(e));
                        OooO00o();
                    }
                    break;
                    break;
                case 3:
                    try {
                        OooO0o();
                        this.f19853OoooO00 = PlayerState.PREPARED;
                        OooOO0();
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e2) {
                        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("start video failure: ");
                        sbOooO0O0.append(Log.getStackTraceString(e2));
                        OooO0o0(this, false, sbOooO0O0.toString());
                        OooO00o();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    break;
                case 4:
                    if (OooOOOO.$EnumSwitchMapping$2[this.f19853OoooO00.ordinal()] == 1) {
                        this.f19855OoooOO0.pause();
                        this.f19853OoooO00 = PlayerState.PAUSED;
                    }
                    break;
                case 5:
                    if (this.f19850Oooo) {
                        OooOO0();
                    }
                    break;
                case 6:
                    int i = OooOOOO.$EnumSwitchMapping$3[this.f19853OoooO00.ordinal()];
                    if (i == 1 || i == 2) {
                        this.f19855OoooOO0.pause();
                        this.f19853OoooO00 = PlayerState.PAUSED;
                    }
                    break;
                case 7:
                    ?? r5 = this.f19861o000oOoO;
                    if (r5 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                    }
                    r5.onPause();
                    if (this.f19853OoooO00 == PlayerState.STARTED) {
                        this.f19855OoooOO0.pause();
                        this.f19853OoooO00 = PlayerState.PAUSED;
                    }
                    if (this.f19853OoooO00 == PlayerState.PAUSED) {
                        this.f19855OoooOO0.stop();
                        this.f19853OoooO00 = PlayerState.STOPPED;
                    }
                    this.f19855OoooOO0.release();
                    ?? r6 = this.f19861o000oOoO;
                    if (r6 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("alphaVideoView");
                    }
                    r6.release();
                    this.f19853OoooO00 = PlayerState.RELEASE;
                    HandlerThread handlerThread = this.f19858OoooOo0;
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
                    this.f19855OoooOO0.OooO0O0((Surface) obj2);
                    break;
                    break;
                case 9:
                    this.f19855OoooOO0.OooO00o();
                    this.f19853OoooO00 = PlayerState.NOT_PREPARED;
                    this.f19850Oooo = false;
                    break;
            }
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        OooO0oo(OooO0Oo(7, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        OooO0oo(OooO0Oo(4, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        OooO0OO();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        OooO0oo(OooO0Oo(6, null));
    }
}
