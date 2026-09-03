package com.yalla.yalla.mixedroom.roomcenter;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.o0000O0O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OooO0OO;
import com.code.android.util.o000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.android.videoplayer.PlayState;
import com.yalla.android.videoplayer.view.VideoView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import java.io.File;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OOo000.OooO00o;
import o0OOo000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p443o0OoOo0o.o000O0;
import p443o0OoOo0o.o000O00;
import p443o0OoOo0o.o000O000;
import p443o0OoOo0o.o000O0O0;
import p443o0OoOo0o.o000O0o;
import p443o0OoOo0o.o000Oo0;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OO00O;
import p583o0oOoo00.o000000O;
import p583o0oOoo00.o00000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomFrameUIController {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f23084OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NetImageView f23085OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f23086OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public VideoView f23087OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0OOo000.OooO0O0 f23088OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final View f23089OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public PlayState f23090OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o000O000 f23091OooO0oo;

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view, RoomFrameUIController.this.f23089OooO0o0)) {
                Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
                Observable observable = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
                observable.post(Boolean.TRUE);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<ViewStub> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewStub invoke() {
            return (ViewStub) RoomFrameUIController.this.f23084OooO00o.findViewById(o0OO00O.activity_mixed_room_video_view_stub);
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f23095OooO0Oo;

        public OooO0OO(o000O0O0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f23095OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f23095OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f23095OooO0Oo;
        }

        public final int hashCode() {
            return this.f23095OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f23095OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [o0OoOo0o.o000O000] */
    public RoomFrameUIController(@NotNull MixedRoomActivity activity, @NotNull final com.yalla.yalla.service.room.OooO0O0 liveDataSource) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        this.f23084OooO00o = activity;
        View viewFindViewById = activity.findViewById(o0OO00O.activity_room_new_room_theme_iv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f23085OooO0O0 = (NetImageView) viewFindViewById;
        this.f23086OooO0OO = LazyKt.lazy(new OooO0O0());
        View viewFindViewById2 = activity.findViewById(o0OO00O.v_room_input_hide_outside);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f23089OooO0o0 = viewFindViewById2;
        View viewFindViewById3 = activity.findViewById(o0OO00O.v_room_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f23088OooO0o = new o0OOo000.OooO0O0();
        activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController$initLiveDataObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0O0(this, owner);
                RoomFrameUIController roomFrameUIController = this.f23096OooO0Oo;
                roomFrameUIController.f23088OooO0o.OooO0O0();
                OooO0O0 oooO0O0 = roomFrameUIController.f23088OooO0o;
                OooO00o oooO00o = oooO0O0.f43005OooO00o;
                if (oooO00o != null) {
                    oooO00o.release();
                }
                oooO0O0.f43005OooO00o = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(@NotNull LifecycleOwner owner) {
                OooO00o oooO00o;
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0o0(this, owner);
                RoomFrameUIController roomFrameUIController = this.f23096OooO0Oo;
                if (roomFrameUIController.f23090OooO0oO != PlayState.Pause || (oooO00o = roomFrameUIController.f23088OooO0o.f43005OooO00o) == null) {
                    return;
                }
                oooO00o.OooO0Oo();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0o(this, owner);
                OooO00o oooO00o = this.f23096OooO0Oo.f23088OooO0o.f43005OooO00o;
                if (oooO00o != null) {
                    oooO00o.pause();
                }
            }
        });
        int i = 0;
        liveDataSource.f24548OooOOO0.observe(activity, new o000O0o(this, i));
        liveDataSource.f24547OooOOO.observe(activity, new o000Oo0(this, i));
        liveDataSource.f24554OooOo.observe(activity, new o000O00(this, i));
        liveDataSource.f24563OooOoo0.observe(activity, new Observer() { // from class: o0OoOo0o.o000O00O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                RoomFrameUIController this$0 = this.f47283OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.yalla.yalla.service.room.OooO0O0 liveDataSource2 = liveDataSource;
                Intrinsics.checkNotNullParameter(liveDataSource2, "$liveDataSource");
                Activity activityOooO00o = com.code.android.util.OooO0O0.OooO00o(LoginActivity.class);
                if (Intrinsics.areEqual((Boolean) obj, Boolean.TRUE)) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    T value = o0O00oO0.OooOo0O().getValue();
                    Boolean bool = Boolean.FALSE;
                    if (Intrinsics.areEqual(value, bool) && activityOooO00o == null) {
                        o000000O.OooO00o();
                        o000000O.f56642OooO0oO.observe(this$0.f23084OooO00o, new RoomFrameUIController.OooO0OO(new o000O0O0(this$0)));
                        liveDataSource2.f24563OooOoo0.setValue(bool);
                        oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
                        oo0ooo0oOooO0o0.getClass();
                        o0000O0O.OooO0O0("touristLoginRoom", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
                    }
                }
            }
        });
        LiveEventBus.get("LuckyPacket_Detail").observe(activity, new o000O0(this, i));
        viewFindViewById2.setOnClickListener(new OooO00o());
        activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO0OO.OooO0O0(this, owner);
                Looper.myQueue().removeIdleHandler(RoomFrameUIController.this.f23091OooO0oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
        this.f23091OooO0oo = new MessageQueue.IdleHandler() { // from class: o0OoOo0o.o000O000
            /* JADX WARN: Code duplicated, block: B:8:0x0025  */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                boolean z;
                RoomFrameUIController this$0 = this.f47281OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                com.yalla.yalla.service.room.OooO0O0 liveDataSource2 = liveDataSource;
                Intrinsics.checkNotNullParameter(liveDataSource2, "$liveDataSource");
                String value = liveDataSource2.f24547OooOOO.getValue();
                int i2 = 0;
                if (value != null) {
                    this$0.getClass();
                    if (value.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                OooO0O0 oooO0O0 = this$0.f23088OooO0o;
                if (z) {
                    VideoView videoView = this$0.f23087OooO0Oo;
                    if (videoView != null) {
                        Intrinsics.checkNotNull(videoView);
                        o000O.OooO0O0(videoView);
                        oooO0O0.OooO0O0();
                    }
                } else {
                    VideoView videoView2 = this$0.f23087OooO0Oo;
                    MixedRoomActivity mixedRoomActivity = this$0.f23084OooO00o;
                    if (videoView2 == null) {
                        Object value2 = this$0.f23086OooO0OO.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        ((ViewStub) value2).inflate();
                        VideoView videoPlayer = (VideoView) mixedRoomActivity.findViewById(o0OO00O.activity_room_new_room_theme_videoView);
                        this$0.f23087OooO0Oo = videoPlayer;
                        Intrinsics.checkNotNull(videoPlayer);
                        oooO0O0.getClass();
                        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
                        oooO0O0.f43005OooO00o = videoPlayer;
                        o000O o000o = new o000O(this$0);
                        if (videoPlayer != null) {
                            videoPlayer.setStateChangedListener(o000o);
                        }
                    }
                    oooO0O0.OooO0O0();
                    File file = o00000O.f56650OooO00o;
                    o00000O.OooO00o(value).observe(mixedRoomActivity, new o000O0Oo(this$0, i2));
                }
                return false;
            }
        };
    }
}
