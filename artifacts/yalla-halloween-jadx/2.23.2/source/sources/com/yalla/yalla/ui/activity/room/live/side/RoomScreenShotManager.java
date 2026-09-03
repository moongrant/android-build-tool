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
import androidx.lifecycle.OooO0OO;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000O0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p495o0o00Oo.OooOO0O;
import p499o0o00o.oO00000;
import p499o0o00o.oO00000o;
import p499o0o00o.oO0000O;
import p499o0o00o.oO0000Oo;
import p562o0oOo000.o0OO00O;
import p590o0oOooo0.t0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomScreenShotManager extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinearLayout f26359OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final NetImageView f26360OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public GestureDetector f26361OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f26362OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oO00000 f26363OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList f26364OooO0oO;

    public static final class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
            LinearLayout linearLayout = roomScreenShotManager.f26359OooO0O0;
            linearLayout.setVisibility(8);
            linearLayout.setEnabled(true);
            roomScreenShotManager.f26362OooO0o = null;
            roomScreenShotManager.f26360OooO0OO.setImageDrawable(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            RoomScreenShotManager.this.f26359OooO0O0.setEnabled(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v7, types: [o0o00o.oO00000] */
    public RoomScreenShotManager(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        View viewFindViewById = this.f49626OooO00o.findViewById(o0OO00O.ll_room_screen_shot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f26359OooO0O0 = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = this.f49626OooO00o.findViewById(o0OO00O.niv_room_screen_shot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f26360OooO0OO = (NetImageView) viewFindViewById2;
        this.f26363OooO0o0 = new Runnable() { // from class: o0o00o.oO00000
            @Override // java.lang.Runnable
            public final void run() {
                RoomScreenShotManager this$0 = this.f50017OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
            }
        };
        this.f26364OooO0oO = new ArrayList();
        this.f49626OooO00o.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0O0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onPause(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0OO(this, owner);
                RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
                if (OooOo00.OooO0O0(roomScreenShotManager.f26364OooO0oO)) {
                    ArrayList arrayList = roomScreenShotManager.f26364OooO0oO;
                    Intrinsics.checkNotNull(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((t0) it.next()).stopWatching();
                    }
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                OooO0OO.OooO0Oo(this, owner);
                final RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
                ArrayList arrayList = roomScreenShotManager.f26364OooO0oO;
                if (arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStorageDirectory());
                    String str = File.separator;
                    sb.append(str);
                    sb.append("Screenshots");
                    sb.append(str);
                    arrayList2.add(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Environment.getExternalStorageDirectory());
                    sb2.append(str);
                    arrayList2.add(o0OoOo0.OooO0OO(sb2, Environment.DIRECTORY_DCIM, str, "Screenshots", str));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Environment.getExternalStorageDirectory());
                    sb3.append(str);
                    arrayList2.add(o0OoOo0.OooO0OO(sb3, Environment.DIRECTORY_PICTURES, str, "Screenshots", str));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new t0((String) it.next(), new oO00000o(roomScreenShotManager)));
                    }
                    roomScreenShotManager.f26361OooO0Oo = new GestureDetector(roomScreenShotManager.f49626OooO00o, new oO0000O(roomScreenShotManager));
                    oO0000Oo oo0000oo = new oO0000Oo(roomScreenShotManager);
                    LinearLayout linearLayout = roomScreenShotManager.f26359OooO0O0;
                    linearLayout.setOnClickListener(oo0000oo);
                    linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00o.o
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            RoomScreenShotManager this$0 = roomScreenShotManager;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            GestureDetector gestureDetector = this$0.f26361OooO0Oo;
                            return gestureDetector != null && gestureDetector.onTouchEvent(motionEvent);
                        }
                    });
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((t0) it2.next()).startWatching();
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0o0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                OooO0OO.OooO0o(this, lifecycleOwner);
            }
        });
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
        LinearLayout linearLayout = this.f26359OooO0O0;
        linearLayout.clearAnimation();
        linearLayout.setVisibility(8);
        linearLayout.setEnabled(true);
        this.f26362OooO0o = null;
        this.f26360OooO0OO.setImageDrawable(null);
    }

    public final void OooO0OO() {
        boolean zOooO0o0 = p595o0oo00O.OooOo00.OooO0o0();
        LinearLayout linearLayout = this.f26359OooO0O0;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, zOooO0o0 ? (-linearLayout.getWidth()) - o0000O0.OooO00o(10) : linearLayout.getWidth() + o0000O0.OooO00o(10), 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setAnimationListener(new OooO00o());
        linearLayout.startAnimation(translateAnimation);
    }
}
