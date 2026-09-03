package com.yalla.yalla.mixedroom.roomcenter;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO00o;
import com.code.android.util.o000OO00;
import com.code.android.videoplayer.PlayState;
import com.code.android.videoplayer.view.VideoView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.service.room.OooO0O0;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152o00OoO.OooO;
import p152o00OoO.OooOO0;
import p402o0Oo0OOO.o00O000;
import p439o0OoOo0O.o000000;
import p439o0OoOo0O.o000OOo;
import p439o0OoOo0O.o0O0O00;
import p439o0OoOo0O.o0OO00O;
import p439o0OoOo0O.o0OOO0o;
import p439o0OoOo0O.oo0o0Oo;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomFrameUIController {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f23544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NetImageView f23545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f23546OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public VideoView f23547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final OooOO0 f23548OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final View f23549OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public PlayState f23550OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f23551OooO0oo;

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view, RoomFrameUIController.this.f23549OooO0o0)) {
                Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
                Observable observable = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
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
            return (ViewStub) RoomFrameUIController.this.f23544OooO00o.findViewById(oO00O0oO.activity_mixed_room_video_view_stub);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [o0OoOo0O.o0OOO0o] */
    public RoomFrameUIController(@NotNull MixedRoomActivity activity, @NotNull final com.yalla.yalla.service.room.OooO0O0 liveDataSource) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        this.f23544OooO00o = activity;
        View viewFindViewById = activity.findViewById(oO00O0oO.activity_room_new_room_theme_iv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(R.…y_room_new_room_theme_iv)");
        this.f23545OooO0O0 = (NetImageView) viewFindViewById;
        this.f23546OooO0OO = LazyKt.lazy(new OooO0O0());
        View viewFindViewById2 = activity.findViewById(oO00O0oO.v_room_input_hide_outside);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "activity.findViewById(R.…_room_input_hide_outside)");
        this.f23549OooO0o0 = viewFindViewById2;
        View viewFindViewById3 = activity.findViewById(oO00O0oO.v_room_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "activity.findViewById(R.id.v_room_root)");
        this.f23548OooO0o = new OooOO0();
        activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController$initLiveDataObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO00o.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO00o.OooO0O0(this, owner);
                RoomFrameUIController roomFrameUIController = this.f23555OooO0Oo;
                roomFrameUIController.f23548OooO0o.OooO0O0();
                OooOO0 oooOO1 = roomFrameUIController.f23548OooO0o;
                OooO oooO = oooOO1.f38118OooO00o;
                if (oooO != null) {
                    oooO.release();
                }
                oooOO1.f38118OooO00o = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO00o.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                OooO00o.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStart(@NotNull LifecycleOwner owner) {
                OooO oooO;
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO00o.OooO0o0(this, owner);
                RoomFrameUIController roomFrameUIController = this.f23555OooO0Oo;
                if (roomFrameUIController.f23550OooO0oO != PlayState.Pause || (oooO = roomFrameUIController.f23548OooO0o.f38118OooO00o) == null) {
                    return;
                }
                oooO.OooO0O0();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onStop(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO00o.OooO0o(this, owner);
                OooO oooO = this.f23555OooO0Oo.f23548OooO0o.f38118OooO00o;
                if (oooO != null) {
                    oooO.pause();
                }
            }
        });
        liveDataSource.f25010OooOOO0.observe(activity, new o0OO00O(this));
        liveDataSource.f25009OooOOO.observe(activity, new oo0o0Oo(this));
        liveDataSource.f25016OooOo.observe(activity, new o0O0O00(this));
        liveDataSource.f25025OooOoo0.observe(activity, new o000OOo(this, liveDataSource));
        LiveEventBus.get("LuckyPacket_Detail").observe(activity, new o000000(this));
        viewFindViewById2.setOnClickListener(new OooO00o());
        activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0O0(this, owner);
                Looper.myQueue().removeIdleHandler(RoomFrameUIController.this.f23551OooO0oo);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0o(this, lifecycleOwner);
            }
        });
        this.f23551OooO0oo = new MessageQueue.IdleHandler() { // from class: o0OoOo0O.o0OOO0o
            /* JADX WARN: Code duplicated, block: B:8:0x0025  */
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                boolean z;
                RoomFrameUIController this$0 = this.f46103OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                OooO0O0 liveDataSource2 = liveDataSource;
                Intrinsics.checkNotNullParameter(liveDataSource2, "$liveDataSource");
                String value = liveDataSource2.f25009OooOOO.getValue();
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
                OooOO0 oooOO1 = this$0.f23548OooO0o;
                if (z) {
                    VideoView videoView = this$0.f23547OooO0Oo;
                    if (videoView != null) {
                        Intrinsics.checkNotNull(videoView);
                        o000OO00.OooO0O0(videoView);
                        oooOO1.OooO0O0();
                    }
                } else {
                    VideoView videoView2 = this$0.f23547OooO0Oo;
                    MixedRoomActivity mixedRoomActivity = this$0.f23544OooO00o;
                    if (videoView2 == null) {
                        Object value2 = this$0.f23546OooO0OO.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "<get-mVideoViewStub>(...)");
                        ((ViewStub) value2).inflate();
                        VideoView videoPlayer = (VideoView) mixedRoomActivity.findViewById(oO00O0oO.activity_room_new_room_theme_videoView);
                        this$0.f23547OooO0Oo = videoPlayer;
                        Intrinsics.checkNotNull(videoPlayer);
                        oooOO1.getClass();
                        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
                        oooOO1.f38118OooO00o = videoPlayer;
                        o000000O o000000o2 = new o000000O(this$0);
                        if (videoPlayer != null) {
                            videoPlayer.setStateChangedListener(o000000o2);
                        }
                    }
                    oooOO1.OooO0O0();
                    File file = o00O000.f44470OooO00o;
                    o00O000.OooO00o(value).observe(mixedRoomActivity, new o00000(this$0));
                }
                return false;
            }
        };
    }
}
