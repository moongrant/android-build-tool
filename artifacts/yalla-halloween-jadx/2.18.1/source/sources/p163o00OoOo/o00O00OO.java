package p163o00OoOo;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.view.tips.TipsBubbleView;
import com.common.videoplayer.PlayState;
import com.common.videoplayer.view.VideoView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import o0O00O0o.OooO00o;
import o0O00O0o.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00O0O;
import p143o00OOooo.o00OOOO0;
import p143o00OOooo.o00OOOOo;
import p163o00OoOo.o00O00OO;
import p497o0o00Oo.OooOOO0;
import p530o0o0OOO.o00OO00O;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO00o f32519OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f32520OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NetImageView f32521OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final VideoView f32522OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final View f32523OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final FrameLayout f32524OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final RecyclerView f32525OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0O00O0o.OooO0O0 f32526OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public TipsBubbleView f32527OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public PlayState f32528OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f32529OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f32530OooOO0o;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.areEqual(view, o00O00OO.this.f32523OooO0Oo)) {
                Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
                Observable observable = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
                Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
                observable.post(Boolean.TRUE);
            }
        }
    }

    public static final class OooO0O0 implements OooO0OO {
        public OooO0O0() {
        }

        @Override // o0O00O0o.OooO0OO
        public final void onStateChanged(@NotNull PlayState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            o00O00OO.this.f32528OooOO0 = state;
        }
    }

    public o00O00OO(@NotNull MixedRoomActivity activity, @NotNull o00OO00O liveDataSource) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(liveDataSource, "liveDataSource");
        this.f32520OooO00o = activity;
        View viewFindViewById = activity.findViewById(R.id.activity_room_new_room_theme_iv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(R.…y_room_new_room_theme_iv)");
        this.f32521OooO0O0 = (NetImageView) viewFindViewById;
        View viewFindViewById2 = activity.findViewById(R.id.videoView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "activity.findViewById(R.id.videoView)");
        VideoView videoView = (VideoView) viewFindViewById2;
        this.f32522OooO0OO = videoView;
        View viewFindViewById3 = activity.findViewById(R.id.v_room_input_hide_outside);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "activity.findViewById(R.…_room_input_hide_outside)");
        this.f32523OooO0Oo = viewFindViewById3;
        View viewFindViewById4 = activity.findViewById(R.id.rv_mic);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "activity.findViewById(R.id.rv_mic)");
        this.f32525OooO0o0 = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = activity.findViewById(R.id.v_room_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "activity.findViewById(R.id.v_room_root)");
        this.f32524OooO0o = (FrameLayout) viewFindViewById5;
        o0O00O0o.OooO0O0 oooO0O0 = new o0O00O0o.OooO0O0();
        this.f32526OooO0oO = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        this.f32519OooO = oooO00o;
        activity.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.app.base.mixedroom.roomcenter.RoomFrameUIController$initLiveDataObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0O0(this, owner);
                this.f11855Oooo0o.f32526OooO0oO.OooO0o0();
                this.f11855Oooo0o.f32526OooO0oO.OooO0O0();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0OO(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0Oo(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onStart(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0o0(this, owner);
                o00O00OO o00o00oo2 = this.f11855Oooo0o;
                if (o00o00oo2.f32528OooOO0 == PlayState.Pause) {
                    o00o00oo2.f32526OooO0oO.OooO00o();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onStop(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0o(this, owner);
                OooO00o oooO00o2 = this.f11855Oooo0o.f32526OooO0oO.f35126OooO00o;
                if (oooO00o2 == null) {
                    return;
                }
                oooO00o2.pause();
            }
        });
        int i = 1;
        liveDataSource.f43330OooOOOo.observe(activity, new o00OOOO0(this, i));
        int i2 = 0;
        liveDataSource.f43332OooOOo0.observe(activity, new o00O00O(this, i2));
        liveDataSource.f43344OooOooO.observe(activity, new o00O0O(this, 2));
        liveDataSource.f43350Oooo00o.observe(activity, new oOO00O(this, liveDataSource, i2));
        LiveEventBus.get("LuckyPacket_Detail").observe(activity, new o00OOOOo(this, i));
        viewFindViewById3.setOnClickListener(oooO00o);
        oooO0O0.OooO0Oo(videoView);
        OooO0O0 oooO0O1 = new OooO0O0();
        o0O00O0o.OooO00o oooO00o2 = oooO0O0.f35126OooO00o;
        if (oooO00o2 != null) {
            oooO00o2.setStateChangedListener(oooO0O1);
        }
        this.f32529OooOO0O = 180L;
        this.f32530OooOO0o = -1;
    }

    public final void OooO00o(boolean z) {
        boolean z2;
        View viewFindViewWithTag;
        TipsBubbleView tipsBubbleView = this.f32527OooO0oo;
        if (tipsBubbleView != null) {
            Intrinsics.checkNotNull(tipsBubbleView);
            if (com.yalla.support.common.util.o00O0O.OooO0OO(tipsBubbleView)) {
                FrameLayout frameLayout = this.f32524OooO0o;
                if (frameLayout == null || (viewFindViewWithTag = frameLayout.findViewWithTag("microphone_tips")) == null) {
                    z2 = false;
                } else {
                    frameLayout.removeView(viewFindViewWithTag);
                    z2 = true;
                }
                if (z2) {
                    this.f32527OooO0oo = null;
                    if (z) {
                        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                        OooOOO0.OooO0o0().OooOOo(false);
                    }
                }
            }
        }
    }
}
