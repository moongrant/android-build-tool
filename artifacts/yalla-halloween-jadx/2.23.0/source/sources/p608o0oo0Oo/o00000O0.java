package p608o0oo0Oo;

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
import p607o0oo0OOo.k1;
import p607o0oo0OOo.m1;
import p610o0oo0Ooo.q1;
import p612o0oo0o0.o0000O;
import p614o0oo0o0O.o000OOo0;
import p614o0oo0o0O.o00O000;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o00000O0 implements q1 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f56970OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final m1 f56971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0000oo f56972OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000oo f56973OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f56974OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f56975OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f56976OooOO0;

    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:10:0x001b A[Catch: OutOfMemoryError -> 0x0031, TRY_LEAVE, TryCatch #0 {OutOfMemoryError -> 0x0031, blocks: (B:3:0x000b, B:5:0x0010, B:10:0x001b), top: B:15:0x000b }] */
        public static boolean OooO00o(@NotNull o0000oo handlerHolder, @NotNull String name) {
            Intrinsics.checkNotNullParameter(handlerHolder, "handlerHolder");
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                HandlerThread handlerThread = handlerHolder.f56993OooO00o;
                if (handlerThread == null) {
                    HandlerThread handlerThread2 = new HandlerThread(name);
                    handlerThread2.start();
                    handlerHolder.f56994OooO0O0 = new Handler(handlerThread2.getLooper());
                    handlerHolder.f56993OooO00o = handlerThread2;
                } else {
                    if (!handlerThread.isAlive()) {
                        HandlerThread handlerThread3 = new HandlerThread(name);
                        handlerThread3.start();
                        handlerHolder.f56994OooO0O0 = new Handler(handlerThread3.getLooper());
                        handlerHolder.f56993OooO00o = handlerThread3;
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

    public static final class OooO0O0 extends Lambda implements Function0<o00O000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f56977OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O000 invoke() {
            return new o00O000();
        }
    }

    public o00000O0(@NotNull m1 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f56971OooO0Oo = playerEva;
        this.f56973OooO0o0 = new o0000oo();
        this.f56972OooO0o = new o0000oo();
        this.f56976OooOO0 = LazyKt.lazy(OooO0O0.f56977OooO0Oo);
    }

    public final void OooO0OO(int i, int i2) {
        k1 k1Var = this.f56971OooO0Oo.f56965OooOo0o.f56939OooO0O0;
        if (!((k1Var == null || k1Var.f56910OooO0o) ? false : true) && k1Var != null) {
            int i3 = k1Var.f56913OooO0oo;
            if (i3 == 1) {
                int i4 = i / 2;
                k1Var.f56906OooO00o = i4;
                k1Var.f56907OooO0O0 = i2;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, 0, i4, i2), "<set-?>");
                int i5 = k1Var.f56906OooO00o;
                Intrinsics.checkNotNullParameter(new o000OOo0(i5, 0, i5, k1Var.f56907OooO0O0), "<set-?>");
            } else if (i3 == 2) {
                k1Var.f56906OooO00o = i;
                int i6 = i2 / 2;
                k1Var.f56907OooO0O0 = i6;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, 0, i, i6), "<set-?>");
                int i7 = k1Var.f56907OooO0O0;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, i7, k1Var.f56906OooO00o, i7), "<set-?>");
            } else if (i3 == 3) {
                int i8 = i / 2;
                k1Var.f56906OooO00o = i8;
                k1Var.f56907OooO0O0 = i2;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, 0, i8, i2), "<set-?>");
                int i9 = k1Var.f56906OooO00o;
                Intrinsics.checkNotNullParameter(new o000OOo0(i9, 0, i9, k1Var.f56907OooO0O0), "<set-?>");
            } else if (i3 != 4) {
                int i10 = i / 2;
                k1Var.f56906OooO00o = i10;
                k1Var.f56907OooO0O0 = i2;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, 0, i10, i2), "<set-?>");
                int i11 = k1Var.f56906OooO00o;
                Intrinsics.checkNotNullParameter(new o000OOo0(i11, 0, i11, k1Var.f56907OooO0O0), "<set-?>");
            } else {
                k1Var.f56906OooO00o = i;
                int i12 = i2 / 2;
                k1Var.f56907OooO0O0 = i12;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, 0, i, i12), "<set-?>");
                int i13 = k1Var.f56907OooO0O0;
                Intrinsics.checkNotNullParameter(new o000OOo0(0, i13, k1Var.f56906OooO00o, i13), "<set-?>");
            }
        }
        m1 m1Var = this.f56971OooO0Oo;
        k1 k1Var2 = m1Var.f56965OooOo0o.f56939OooO0O0;
        if (k1Var2 != null) {
            if (k1Var2.f56910OooO0o) {
                if (m1Var.f56962OooOo0) {
                    EvaJniUtil.f32972OooO00o.defaultConfig(m1Var.f56944OooO0O0, i, i2, -1);
                } else {
                    EvaJniUtil.f32972OooO00o.defaultConfig(m1Var.f56944OooO0O0, i, i2, k1Var2.f56913OooO0oo);
                }
                q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
                if (q1Var != null) {
                    q1Var.onVideoConfigReady(k1Var2);
                }
                this.f56971OooO0Oo.f56943OooO00o.updateTextureViewLayout();
            } else if (k1Var2.f56905OooO != null) {
                EvaJniUtil.f32972OooO00o.setRenderConfig(m1Var.f56944OooO0O0, String.valueOf(k1Var2.f56905OooO));
            }
        }
        o0000O o0000o2 = this.f56971OooO0Oo.f56961OooOo;
        o0000o2.getClass();
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.AnimPluginManager", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onRenderCreate", "msg");
        o0000o2.f57011OooO0Oo = 0;
        o0000o2.f57013OooO0o0 = 0;
        for (com.yy.yyeva.mix.OooO00o oooO00o : o0000o2.f57010OooO0OO) {
            k1 k1Var3 = oooO00o.f32959OooO00o.f56965OooOo0o.f56939OooO0O0;
            if (!((k1Var3 == null || k1Var3.f56914OooOO0) ? false : true)) {
                Intrinsics.checkNotNullParameter("EvaAnimPlayer.MixAnimPlugin", ViewHierarchyConstants.TAG_KEY);
                Intrinsics.checkNotNullParameter("mix render init", "msg");
                EvaJniUtil.f32972OooO00o.mixRenderCreate(oooO00o.f32959OooO00o.f56944OooO0O0);
            }
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onFailed(int i, @Nullable String str) {
        String msg = "onFailed errorType=" + i + ", errorMsg=" + str;
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
        if (q1Var != null) {
            q1Var.onFailed(i, str);
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoComplete() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoComplete", "msg");
        q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
        if (q1Var != null) {
            q1Var.onVideoComplete();
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final boolean onVideoConfigReady(@NotNull k1 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return true;
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoDestroy() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoDestroy", "msg");
        q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
        if (q1Var != null) {
            q1Var.onVideoDestroy();
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoRender(int i, @Nullable k1 k1Var) {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoRender", "msg");
        q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
        if (q1Var != null) {
            q1Var.onVideoRender(i, k1Var);
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoRestart() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoRestart", "msg");
        q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
        if (q1Var != null) {
            q1Var.onVideoRestart();
        }
    }

    @Override // p610o0oo0Ooo.q1
    public final void onVideoStart() {
        Intrinsics.checkNotNullParameter("EvaAnimPlayer.Decoder", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("onVideoStart", "msg");
        q1 q1Var = this.f56971OooO0Oo.f56945OooO0OO;
        if (q1Var != null) {
            q1Var.onVideoStart();
        }
    }
}
