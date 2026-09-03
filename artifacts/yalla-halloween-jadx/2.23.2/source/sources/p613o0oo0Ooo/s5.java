package p613o0oo0Ooo;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612o0oo0OoO.o5;
import p612o0oo0OoO.r5;
import p615o0oo0o0.o000oOoO;
import p618o0oo0o0o.o0oOo0O0;
import p620o0oo0oO0.o00;
import p620o0oo0oO0.o000OO0O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s5 implements o000oOoO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f57483OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final r5 f57484OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final x5 f57485OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final x5 f57486OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f57487OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f57488OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f57489OooOO0;

    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:10:0x001b A[Catch: OutOfMemoryError -> 0x0031, TRY_LEAVE, TryCatch #0 {OutOfMemoryError -> 0x0031, blocks: (B:3:0x000b, B:5:0x0010, B:10:0x001b), top: B:15:0x000b }] */
        public static boolean OooO00o(@NotNull x5 handlerHolder, @NotNull String name) {
            Intrinsics.checkNotNullParameter(handlerHolder, "handlerHolder");
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                HandlerThread handlerThread = handlerHolder.f57509OooO00o;
                if (handlerThread == null) {
                    HandlerThread handlerThread2 = new HandlerThread(name);
                    handlerThread2.start();
                    handlerHolder.f57510OooO0O0 = new Handler(handlerThread2.getLooper());
                    handlerHolder.f57509OooO00o = handlerThread2;
                } else {
                    if (!handlerThread.isAlive()) {
                        HandlerThread handlerThread3 = new HandlerThread(name);
                        handlerThread3.start();
                        handlerHolder.f57510OooO0O0 = new Handler(handlerThread3.getLooper());
                        handlerHolder.f57509OooO00o = handlerThread3;
                    }
                }
                return true;
            } catch (OutOfMemoryError tr) {
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("createThread OOM", "msg");
                Intrinsics.checkNotNullParameter(tr, "tr");
                return false;
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f57490OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00 invoke() {
            return new o00();
        }
    }

    public s5(@NotNull r5 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f57484OooO0Oo = playerEva;
        this.f57486OooO0o0 = new x5();
        this.f57485OooO0o = new x5();
        this.f57489OooOO0 = LazyKt.lazy(OooO0O0.f57490OooO0Oo);
    }

    public final void OooO0OO(int i, int i2) {
        o5 o5Var = this.f57484OooO0Oo.f57482OooOo0o.f57454OooO0O0;
        if (!((o5Var == null || o5Var.f57425OooO0o) ? false : true) && o5Var != null) {
            int i3 = o5Var.f57428OooO0oo;
            if (i3 == 1) {
                int i4 = i / 2;
                o5Var.f57421OooO00o = i4;
                o5Var.f57422OooO0O0 = i2;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, 0, i4, i2), "<set-?>");
                int i5 = o5Var.f57421OooO00o;
                Intrinsics.checkNotNullParameter(new o000OO0O(i5, 0, i5, o5Var.f57422OooO0O0), "<set-?>");
            } else if (i3 == 2) {
                o5Var.f57421OooO00o = i;
                int i6 = i2 / 2;
                o5Var.f57422OooO0O0 = i6;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, 0, i, i6), "<set-?>");
                int i7 = o5Var.f57422OooO0O0;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, i7, o5Var.f57421OooO00o, i7), "<set-?>");
            } else if (i3 == 3) {
                int i8 = i / 2;
                o5Var.f57421OooO00o = i8;
                o5Var.f57422OooO0O0 = i2;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, 0, i8, i2), "<set-?>");
                int i9 = o5Var.f57421OooO00o;
                Intrinsics.checkNotNullParameter(new o000OO0O(i9, 0, i9, o5Var.f57422OooO0O0), "<set-?>");
            } else if (i3 != 4) {
                int i10 = i / 2;
                o5Var.f57421OooO00o = i10;
                o5Var.f57422OooO0O0 = i2;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, 0, i10, i2), "<set-?>");
                int i11 = o5Var.f57421OooO00o;
                Intrinsics.checkNotNullParameter(new o000OO0O(i11, 0, i11, o5Var.f57422OooO0O0), "<set-?>");
            } else {
                o5Var.f57421OooO00o = i;
                int i12 = i2 / 2;
                o5Var.f57422OooO0O0 = i12;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, 0, i, i12), "<set-?>");
                int i13 = o5Var.f57422OooO0O0;
                Intrinsics.checkNotNullParameter(new o000OO0O(0, i13, o5Var.f57421OooO00o, i13), "<set-?>");
            }
        }
        r5 r5Var = this.f57484OooO0Oo;
        o5 o5Var2 = r5Var.f57482OooOo0o.f57454OooO0O0;
        if (o5Var2 != null) {
            if (o5Var2.f57425OooO0o) {
                if (r5Var.f57479OooOo0) {
                    EvaJniUtil.f32437OooO00o.defaultConfig(r5Var.f57461OooO0O0, i, i2, -1);
                } else {
                    EvaJniUtil.f32437OooO00o.defaultConfig(r5Var.f57461OooO0O0, i, i2, o5Var2.f57428OooO0oo);
                }
                o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
                if (o000oooo2 != null) {
                    o000oooo2.onVideoConfigReady(o5Var2);
                }
                this.f57484OooO0Oo.f57460OooO00o.updateTextureViewLayout();
            } else if (o5Var2.f57420OooO != null) {
                EvaJniUtil.f32437OooO00o.setRenderConfig(r5Var.f57461OooO0O0, String.valueOf(o5Var2.f57420OooO));
            }
        }
        o0oOo0O0 o0ooo0o1 = this.f57484OooO0Oo.f57478OooOo;
        o0ooo0o1.getClass();
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onRenderCreate", "msg");
        o0ooo0o1.f57552OooO0Oo = 0;
        o0ooo0o1.f57554OooO0o0 = 0;
        for (com.yy.yyeva.mix.OooO00o oooO00o : o0ooo0o1.f57551OooO0OO) {
            o5 o5Var3 = oooO00o.f32424OooO00o.f57482OooOo0o.f57454OooO0O0;
            if (!((o5Var3 == null || o5Var3.f57429OooOO0) ? false : true)) {
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("mix render init", "msg");
                EvaJniUtil.f32437OooO00o.mixRenderCreate(oooO00o.f32424OooO00o.f57461OooO0O0);
            }
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onFailed(int i, @Nullable String str) {
        String msg = "onFailed errorType=" + i + ", errorMsg=" + str;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
        if (o000oooo2 != null) {
            o000oooo2.onFailed(i, str);
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoComplete() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoComplete", "msg");
        o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
        if (o000oooo2 != null) {
            o000oooo2.onVideoComplete();
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final boolean onVideoConfigReady(@NotNull o5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return true;
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoDestroy() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoDestroy", "msg");
        o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
        if (o000oooo2 != null) {
            o000oooo2.onVideoDestroy();
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoRender(int i, @Nullable o5 o5Var) {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoRender", "msg");
        o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
        if (o000oooo2 != null) {
            o000oooo2.onVideoRender(i, o5Var);
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoRestart() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoRestart", "msg");
        o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
        if (o000oooo2 != null) {
            o000oooo2.onVideoRestart();
        }
    }

    @Override // p615o0oo0o0.o000oOoO
    public final void onVideoStart() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoStart", "msg");
        o000oOoO o000oooo2 = this.f57484OooO0Oo.f57462OooO0OO;
        if (o000oooo2 != null) {
            o000oooo2.onVideoStart();
        }
    }
}
