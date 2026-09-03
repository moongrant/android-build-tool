package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.facebook.internal.AnalyticsEvents;
import com.google.accompanist.pager.Pager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedGifFaceManager;
import com.yalla.yalla.model.GifListJson;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import o0O0O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.Oooo000;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0ooO;
import p028Oooo0o0.oo00o;
import p032OoooO0.oo000o;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p086o000OooO.o0O0O00;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p142o00OOooO.o0000O00;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p175o00OooOo.o0O0OO0;
import p175o00OooOo.o0O0OOO0;
import p175o00OooOo.o0O0OOOo;
import p175o00OooOo.o0oO0O0o;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000oo;
import p649o0ooOOoo.r8;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\"#B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J+\u0010\t\u001a\u00020\u00072#\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002J@\u0010\u000e\u001a\u00020\u000728\u0010\b\u001a4\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nR\"\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/app/base/view/FacePanelView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "stickerId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSendStickerMessageListener", "Lkotlin/Function2;", "", "gifUrl", "gifId", "setOnSendGifMessageListener", "", "Oooo0oo", "Z", "isEmojiPanel", "()Z", "setEmojiPanel", "(Z)V", "Lo0ooOOoo/r8;", "binding", "Lo0ooOOoo/r8;", "getBinding", "()Lo0ooOOoo/r8;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO0O0", "OooO0OO", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class FacePanelView extends FrameLayout {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f11954OoooOo0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f11955Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public EditText f11956Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f11957Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    public boolean isEmojiPanel;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public EmojiFaceView f11959OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o0O0O0O.OooOO0 f11960OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f11961OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public EditText f11962OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final HashMap<Integer, OooO0O0> f11963OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final r8 f11964OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<OooO0OO> f11965OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final o00OO0OO<OooO0O0> f11966o000oOoO;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Context f11971Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context) {
            super(2);
            this.f11971Oooo0oO = context;
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(oooO00o);
                FacePanelView facePanelView = FacePanelView.this;
                Context context = this.f11971Oooo0oO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
                if (!(composer.OooOo0o() instanceof o00O000)) {
                    o00O00O.OooO00o();
                    throw null;
                }
                composer.OooOo00();
                if (composer.OooOOO0()) {
                    composer.OooOoO0(function0);
                } else {
                    composer.Oooo00O();
                }
                composer.OooOo0O();
                Intrinsics.checkNotNullParameter(composer, "composer");
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                o0O0O0O.OooOO0 oooOO0OooO00o = OooOOO0.OooO00o(0, composer, 0);
                facePanelView.f11960OoooO0 = oooOO0OooO00o;
                o00Oo00.OooO0o0(oooOO0OooO00o, new com.app.base.view.OooO00o(facePanelView, null), composer);
                float f = (float) 0.5d;
                o0000oo.OooO0OO(f, BackgroundKt.OooO0O0(SizeKt.OooO0o(oooO00o), o00000OO.OooO0O0(520093696), o000O0Oo.f32099OooO00o), composer, 6, 0);
                o0O0O0O.OooOO0 oooOO1 = facePanelView.f11960OoooO0;
                Intrinsics.checkNotNull(oooOO1);
                int size = facePanelView.f11966o000oOoO.size();
                o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(oooO00o, 360);
                Intrinsics.checkNotNullParameter(o00oooo0OooOO0o, "<this>");
                if (!(((double) 1.0f) > 0.0d)) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                }
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                Pager.OooO00o(size, o00oooo0OooOO0o.OooOOoo(new o0O000O(true)), oooOO1, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, null, null, false, o00O0000.OooO00o(composer, -1019604873, new OooO(facePanelView, context)), composer, 0, 6, 1016);
                o0000oo.OooO0OO(f, BackgroundKt.OooO0O0(SizeKt.OooO0o(oooO00o), o00000OO.OooO0O0(520093696), o000O0Oo.f32099OooO00o), composer, 6, 0);
                FacePanelView.OooO00o(facePanelView, composer, 8);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
            return Unit.INSTANCE;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f11972OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final MutableLiveData<GifListJson> f11973OooO0O0;

        public OooO0O0(int i, @Nullable MutableLiveData<GifListJson> mutableLiveData) {
            this.f11972OooO00o = i;
            this.f11973OooO0O0 = mutableLiveData;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f11972OooO00o == oooO0O0.f11972OooO00o && Intrinsics.areEqual(this.f11973OooO0O0, oooO0O0.f11973OooO0O0);
        }

        public final int hashCode() {
            int i = this.f11972OooO00o * 31;
            MutableLiveData<GifListJson> mutableLiveData = this.f11973OooO0O0;
            return i + (mutableLiveData == null ? 0 : mutableLiveData.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PanelData(type=");
            sbOooO0o0.append(this.f11972OooO00o);
            sbOooO0o0.append(", gifFace=");
            sbOooO0o0.append(this.f11973OooO0O0);
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f11974OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final String f11975OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f11976OooO0OO;

        public OooO0OO(int i, @NotNull String img, int i2) {
            Intrinsics.checkNotNullParameter(img, "img");
            this.f11974OooO00o = i;
            this.f11975OooO0O0 = img;
            this.f11976OooO0OO = i2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f11974OooO00o == oooO0OO.f11974OooO00o && Intrinsics.areEqual(this.f11975OooO0O0, oooO0OO.f11975OooO0O0) && this.f11976OooO0OO == oooO0OO.f11976OooO0OO;
        }

        public final int hashCode() {
            return o0O0O00.OooO00o(this.f11975OooO0O0, this.f11974OooO00o * 31, 31) + this.f11976OooO0OO;
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PanelIndicator(type=");
            sbOooO0o0.append(this.f11974OooO00o);
            sbOooO0o0.append(", img=");
            sbOooO0o0.append(this.f11975OooO0O0);
            sbOooO0o0.append(", buyType=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f11976OooO0OO, ')');
        }
    }

    @DebugMetadata(c = "com.app.base.view.FacePanelView$initWebGifFace$1", f = "FacePanelView.kt", i = {}, l = {323}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f11977Oooo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11977Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedGifFaceManager sharedGifFaceManager = SharedGifFaceManager.INSTANCE;
                this.f11977Oooo0o = 1;
                if (sharedGifFaceManager.initAppGifList(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FacePanelView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    public static final void OooO00o(FacePanelView facePanelView, oOO00O ooo00o, int i) {
        Objects.requireNonNull(facePanelView);
        oOO00O composer = ooo00o.OooOOo(-1047394254);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        float f = 40;
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), f);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, o00OO0O0.OooO00o.f4180OooOO0O, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
        oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
        oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o0O000O o0o000o = new o0O000O(true);
        oooO00o.OooOOoo(o0o000o);
        Oooo000.OooO0O0(SizeKt.OooO0oO(o0o000o, f), null, null, false, null, null, null, false, new o0O0OO0(facePanelView), composer, 0, 254);
        o0O0O0O.OooOO0 oooOO1 = facePanelView.f11960OoooO0;
        Intrinsics.checkNotNull(oooOO1);
        if (oooOO1.OooO0o0() == 0) {
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_face_emoji_delete, composer), null, PaddingKt.OooO0o0(ClickableKt.OooO0Oo(SizeKt.OooO0Oo(SizeKt.OooOO0o(oooO00o, 65)), false, new o0O0OOO0(facePanelView), 7), 7), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new o0O0OOOo(facePanelView, i));
    }

    public final void OooO0O0(@NotNull EditText editText, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(editText, "etContent");
        this.f11956Oooo0o = editText;
        this.f11957Oooo0oO = function1;
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f11962OoooO0O = editText;
        EmojiFaceView emojiFaceView = this.f11959OoooO;
        if (emojiFaceView != null) {
            int i = EmojiFaceView.f11948OoooO00;
            emojiFaceView.OooO00o(editText, true);
        }
    }

    public final void OooO0OO() {
        LifecycleCoroutineScope lifecycleScope;
        Context context = getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
            return;
        }
        o0000O0.OooO00o(lifecycleScope, new OooO0o(null));
    }

    @NotNull
    /* JADX INFO: renamed from: getBinding, reason: from getter */
    public final r8 getF11964OoooOOO() {
        return this.f11964OoooOOO;
    }

    public final void setEmojiPanel(boolean z) {
        this.isEmojiPanel = z;
    }

    public final void setOnSendGifMessageListener(@Nullable Function2<? super String, ? super Integer, Unit> listener) {
        this.f11961OoooO00 = listener;
    }

    public final void setOnSendStickerMessageListener(@Nullable Function1<? super Integer, Unit> listener) {
        this.f11955Oooo = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FacePanelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public FacePanelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isEmojiPanel = true;
        this.f11963OoooOO0 = new HashMap<>();
        o00OO0OO<OooO0O0> o00oo0oo = new o00OO0OO<>();
        o00oo0oo.add(new OooO0O0(1, null));
        o00oo0oo.add(new OooO0O0(2, null));
        this.f11966o000oOoO = o00oo0oo;
        r8 r8VarInflate = r8.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r8VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f11964OoooOOO = r8VarInflate;
        o00OO0OO<OooO0OO> o00oo0oo2 = new o00OO0OO<>();
        String string = p522o0o0O0o.o000O0Oo.OooO0OO(context, R.drawable.icon_emoji).toString();
        Intrinsics.checkNotNullExpressionValue(string, "context.resIdToUri(R.dra…le.icon_emoji).toString()");
        o00oo0oo2.add(new OooO0OO(1, string, 0));
        String string2 = p522o0o0O0o.o000O0Oo.OooO0OO(context, R.drawable.icon_face_sticker).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "context.resIdToUri(R.dra…_face_sticker).toString()");
        o00oo0oo2.add(new OooO0OO(2, string2, 0));
        this.f11965OoooOOo = o00oo0oo2;
        r8VarInflate.f50429OooO00o.setContent(o00O0000.OooO0O0(172533650, true, new OooO00o(context)));
        SharedGifFaceManager.INSTANCE.getGifFaceListLiveData().observe((LifecycleOwner) context, new o0000O00(this, 1));
        LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").observe((AppCompatActivity) context, new o0oO0O0o(context, this, 0));
    }
}
