package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/ui/view/UserNameView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OoooOOo", "Z", "isFlash", "()Z", "setFlash", "(Z)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserNameView extends AppCompatTextView {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public Matrix f21042OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public LinearGradient f21043OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f21044OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public int[] f21045OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name and from kotlin metadata */
    public boolean isFlash;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public Job f21047o000oOoO;

    @DebugMetadata(c = "com.yalla.yalla.common.ui.view.UserNameView$isFlash$1", f = "UserNameView.kt", i = {}, l = {60, 61}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21048Oooo0o;

        /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.UserNameView$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.common.ui.view.UserNameView$isFlash$1$1", f = "UserNameView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0223OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ UserNameView f21050Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0223OooO00o(UserNameView userNameView, Continuation<? super C0223OooO00o> continuation) {
                super(2, continuation);
                this.f21050Oooo0o = userNameView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0223OooO00o(this.f21050Oooo0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0223OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f21050Oooo0o.invalidate();
                return Unit.INSTANCE;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserNameView.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x003f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003d -> B:11:0x0020). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:4:0x000a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f21048Oooo0o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L1c
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L2b
            L1c:
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
            L20:
                r4 = 70
                r8.f21048Oooo0o = r3
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r4, r8)
                if (r1 != r0) goto L2b
                return r0
            L2b:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.yalla.yalla.common.ui.view.UserNameView$OooO00o$OooO00o r4 = new com.yalla.yalla.common.ui.view.UserNameView$OooO00o$OooO00o
                com.yalla.yalla.common.ui.view.UserNameView r5 = com.yalla.yalla.common.ui.view.UserNameView.this
                r6 = 0
                r4.<init>(r5, r6)
                r8.f21048Oooo0o = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r4, r8)
                if (r1 != r0) goto L20
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.common.ui.view.UserNameView.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserNameView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        TextPaint paint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.isFlash) {
            if (this.f21043OoooO0O == null) {
                this.f21043OoooO0O = new LinearGradient(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o000O0Oo.f42985OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f21045OoooOOO, (float[]) null, Shader.TileMode.MIRROR);
            }
            TextPaint paint2 = getPaint();
            if ((paint2 != null ? paint2.getShader() : null) == null && (paint = getPaint()) != null) {
                paint.setShader(this.f21043OoooO0O);
            }
            float fOooO00o = this.f21044OoooOO0 + OooOo00.OooO00o(6);
            this.f21044OoooOO0 = fOooO00o;
            int i = o000O0Oo.f42985OooO00o;
            if (fOooO00o > i) {
                this.f21044OoooOO0 = -i;
            }
            this.f21042OoooO.setTranslate(this.f21044OoooOO0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            LinearGradient linearGradient = this.f21043OoooO0O;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(this.f21042OoooO);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        TextPaint paint = getPaint();
        if (paint != null) {
            paint.setShader(null);
        }
        this.f21043OoooO0O = null;
        this.f21044OoooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.isFlash) {
                setFlash(true);
            }
        } else {
            Job job = this.f21047o000oOoO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public final void setFlash(boolean z) {
        TextPaint paint;
        this.isFlash = z;
        if (!z) {
            TextPaint paint2 = getPaint();
            if ((paint2 != null ? paint2.getShader() : null) != null && (paint = getPaint()) != null) {
                paint.setShader(null);
            }
        }
        Job job = this.f21047o000oOoO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (this.isFlash) {
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
            this.f21047o000oOoO = jobLaunch$default;
            if (jobLaunch$default != null) {
                jobLaunch$default.start();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserNameView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserNameView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21042OoooO = new Matrix();
        this.f21045OoooOOO = new int[]{o000O0O0.OooO00o(R.color.color_FF4), o000O0O0.OooO00o(R.color.color_FA6), o000O0O0.OooO00o(R.color.color_F58), o000O0O0.OooO00o(R.color.color_D4F), o000O0O0.OooO00o(R.color.color_4FF), o000O0O0.OooO00o(R.color.color_FF4), o000O0O0.OooO00o(R.color.color_FA6), o000O0O0.OooO00o(R.color.color_F58), o000O0O0.OooO00o(R.color.color_D4F), o000O0O0.OooO00o(R.color.color_4FF), o000O0O0.OooO00o(R.color.color_FF4), o000O0O0.OooO00o(R.color.color_FA6), o000O0O0.OooO00o(R.color.color_F58), o000O0O0.OooO00o(R.color.color_D4F), o000O0O0.OooO00o(R.color.color_4FF)};
    }
}
