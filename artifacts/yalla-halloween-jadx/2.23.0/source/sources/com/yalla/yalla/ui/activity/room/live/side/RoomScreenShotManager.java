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
import p489o0o00OO0.OooO;
import p495o0o00Ooo.o0O0OOOo;
import p495o0o00Ooo.o0O0o000;
import p495o0o00Ooo.o0O0o00O;
import p495o0o00Ooo.oo0OOoo;
import p579o0oOoo.oOOO00Oo;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class RoomScreenShotManager extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinearLayout f26813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final NetImageView f26814OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public GestureDetector f26815OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public String f26816OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0O0OOOo f26817OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList f26818OooO0oO;

    public static final class OooO00o implements Animation.AnimationListener {
        public OooO00o() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
            LinearLayout linearLayout = roomScreenShotManager.f26813OooO0O0;
            linearLayout.setVisibility(8);
            linearLayout.setEnabled(true);
            roomScreenShotManager.f26816OooO0o = null;
            roomScreenShotManager.f26814OooO0OO.setImageDrawable(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@NotNull Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            RoomScreenShotManager.this.f26813OooO0O0.setEnabled(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v7, types: [o0o00Ooo.o0O0OOOo] */
    public RoomScreenShotManager(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        View viewFindViewById = this.f48470OooO00o.findViewById(oO00O0oO.ll_room_screen_shot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(R.id.ll_room_screen_shot)");
        this.f26813OooO0O0 = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = this.f48470OooO00o.findViewById(oO00O0oO.niv_room_screen_shot);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "activity.findViewById(R.id.niv_room_screen_shot)");
        this.f26814OooO0OO = (NetImageView) viewFindViewById2;
        this.f26817OooO0o0 = new Runnable() { // from class: o0o00Ooo.o0O0OOOo
            @Override // java.lang.Runnable
            public final void run() {
                RoomScreenShotManager this$0 = this.f48831OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0OO();
            }
        };
        this.f26818OooO0oO = new ArrayList();
        this.f48470OooO00o.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.yalla.yalla.ui.activity.room.live.side.RoomScreenShotManager.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO00o(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.OooO00o.OooO0O0(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onPause(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0OO(this, owner);
                RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
                if (OooOo00.OooO0O0(roomScreenShotManager.f26818OooO0oO)) {
                    ArrayList arrayList = roomScreenShotManager.f26818OooO0oO;
                    Intrinsics.checkNotNull(arrayList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((oOOO00Oo) it.next()).stopWatching();
                    }
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onResume(@NotNull LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.OooO00o.OooO0Oo(this, owner);
                final RoomScreenShotManager roomScreenShotManager = RoomScreenShotManager.this;
                ArrayList arrayList = roomScreenShotManager.f26818OooO0oO;
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
                    arrayList2.add(androidx.compose.material.OooO00o.OooO0O0(sb2, Environment.DIRECTORY_DCIM, str, "Screenshots", str));
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Environment.getExternalStorageDirectory());
                    sb3.append(str);
                    arrayList2.add(androidx.compose.material.OooO00o.OooO0O0(sb3, Environment.DIRECTORY_PICTURES, str, "Screenshots", str));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new oOOO00Oo((String) it.next(), new oo0OOoo(roomScreenShotManager)));
                    }
                    roomScreenShotManager.f26815OooO0Oo = new GestureDetector(roomScreenShotManager.f48470OooO00o, new o0O0o000(roomScreenShotManager));
                    o0O0o00O o0o0o00o = new o0O0o00O(roomScreenShotManager);
                    LinearLayout linearLayout = roomScreenShotManager.f26813OooO0O0;
                    linearLayout.setOnClickListener(o0o0o00o);
                    linearLayout.setOnTouchListener(new View.OnTouchListener() { // from class: o0o00Ooo.o0O0OOO0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            RoomScreenShotManager this$0 = roomScreenShotManager;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            GestureDetector gestureDetector = this$0.f26815OooO0Oo;
                            return gestureDetector != null && gestureDetector.onTouchEvent(motionEvent);
                        }
                    });
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((oOOO00Oo) it2.next()).startWatching();
                }
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
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
        LinearLayout linearLayout = this.f26813OooO0O0;
        linearLayout.clearAnimation();
        linearLayout.setVisibility(8);
        linearLayout.setEnabled(true);
        this.f26816OooO0o = null;
        this.f26814OooO0OO.setImageDrawable(null);
    }

    public final void OooO0OO() {
        boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
        LinearLayout linearLayout = this.f26813OooO0O0;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, zOooO0o0 ? (-linearLayout.getWidth()) - o0000O0.OooO00o(10) : linearLayout.getWidth() + o0000O0.OooO00o(10), 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(new LinearInterpolator());
        translateAnimation.setAnimationListener(new OooO00o());
        linearLayout.startAnimation(translateAnimation);
    }
}
