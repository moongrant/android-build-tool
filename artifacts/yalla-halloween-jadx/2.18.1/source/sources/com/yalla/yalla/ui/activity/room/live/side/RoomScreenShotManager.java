package com.yalla.yalla.ui.activity.room.live.side;

import android.os.Environment;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p545o0o0OoOo.c8;
import p558o0oOOoo.o0O000;
import p558o0oOOoo.o0O00000;
import p558o0oOOoo.o0O0000O;
import p558o0oOOoo.o0O000O;
import p617o0oo0o.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class RoomScreenShotManager extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinearLayout f23135OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final NetImageView f23136OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public GestureDetector f23137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f23138OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public o0O00000 f23139OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<o0O0ooO> f23140OooO0oO;

    public static final class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            RoomScreenShotManager.this.OooO0OO();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            RoomScreenShotManager.this.f23135OooO0O0.setEnabled(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomScreenShotManager(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        View viewFindViewById = this.f44365OooO00o.findViewById(R.id.ll_room_screen_shot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(R.id.ll_room_screen_shot)");
        this.f23135OooO0O0 = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = this.f44365OooO00o.findViewById(R.id.niv_room_screen_shot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "activity.findViewById(R.id.niv_room_screen_shot)");
        this.f23136OooO0OO = (NetImageView) viewFindViewById2;
        this.f23139OooO0o0 = new o0O00000(this, 0);
        this.f23140OooO0oO = new ArrayList();
        this.f44365OooO00o.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0O0(this, lifecycleOwner);
            }

            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.ArrayList, java.util.List<o0oo0o.o0O0ooO>] */
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onPause(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0OO(this, owner);
                if (OooO0OO.OooO0O0(RoomScreenShotManager.this.f23140OooO0oO)) {
                    ?? r2 = RoomScreenShotManager.this.f23140OooO0oO;
                    Intrinsics.checkNotNull(r2);
                    Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        ((o0O0ooO) it.next()).stopWatching();
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0oo0o.o0O0ooO>] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o0oo0o.o0O0ooO>] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.List<o0oo0o.o0O0ooO>] */
            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0O0.OooO0Oo(this, owner);
                final RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
                if (roomScreenShotManager.f23140OooO0oO.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStorageDirectory());
                    String str = File.separator;
                    sb.append(str);
                    sb.append("Screenshots");
                    sb.append(str);
                    arrayList.add(sb.toString());
                    arrayList.add(Environment.getExternalStorageDirectory() + str + Environment.DIRECTORY_DCIM + str + "Screenshots" + str);
                    arrayList.add(Environment.getExternalStorageDirectory() + str + Environment.DIRECTORY_PICTURES + str + "Screenshots" + str);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        roomScreenShotManager.f23140OooO0oO.add(new o0O0ooO((String) it.next(), new o0O0000O(roomScreenShotManager)));
                    }
                    roomScreenShotManager.f23137OooO0Oo = new GestureDetector(roomScreenShotManager.f44365OooO00o, new o0O000(roomScreenShotManager));
                    roomScreenShotManager.f23135OooO0O0.setOnClickListener(new o0O000O(roomScreenShotManager));
                    roomScreenShotManager.f23135OooO0O0.setOnTouchListener(new View.OnTouchListener() { // from class: o0oOOoo.o0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            RoomScreenShotManager this$0 = roomScreenShotManager;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            GestureDetector gestureDetector = this$0.f23137OooO0Oo;
                            return gestureDetector != null && gestureDetector.onTouchEvent(motionEvent);
                        }
                    });
                }
                Iterator it2 = roomScreenShotManager.f23140OooO0oO.iterator();
                while (it2.hasNext()) {
                    ((o0O0ooO) it2.next()).startWatching();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                OooO0O0.OooO0o(this, lifecycleOwner);
            }
        });
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        this.f23135OooO0O0.clearAnimation();
        OooO0OO();
    }

    public final void OooO0OO() {
        this.f23135OooO0O0.setVisibility(8);
        this.f23135OooO0O0.setEnabled(true);
        this.f23138OooO0o = null;
        this.f23136OooO0OO.setImageDrawable(null);
    }

    public final void OooO0Oo() {
        TranslateAnimation translateAnimation = new TranslateAnimation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oo000o.OooO0o0() ? (-this.f23135OooO0O0.getWidth()) - OooOo00.OooO00o(10.0f) : this.f23135OooO0O0.getWidth() + OooOo00.OooO00o(10.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setAnimationListener(new OooO00o());
        this.f23135OooO0O0.startAnimation(translateAnimation);
    }
}
