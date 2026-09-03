package p560o0oOOooO;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.app.base.mixedroom.MixedRoomActivity;
import com.opensource.svgaplayer.SVGAImageView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.SharedSvgaManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserPrettyIdView;
import com.yalla.yalla.common.ui.view.UserRankView;
import com.yalla.yalla.common.ui.view.UserVipView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.RoomMemberBadgeView;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.oOO00O;
import p405o0Oo0OO0.OooOo;
import p545o0o0OoOo.d8;
import p545o0o0OoOo.e8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00OO0O extends e8<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final UserMedalView f44857OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f44858OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final UserVipView f44859OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final UserPremiumView f44860OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f44861OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final UserPrettyIdView f44862OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SVGAView f44863OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ViewGroup f44864OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ViewGroup f44865OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final UserRankView f44866OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LinearLayout f44867OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final RoomMemberBadgeView f44868OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final TextView f44869OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final int[] f44870OooOOo0;

    public static final class OooO<T> implements Observer {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Boolean> f44872OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.f44872OooO0O0 = cancellableContinuation;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            OooOo oooOo = (OooOo) obj;
            oO00OO0O.this.f44863OooOO0.setLoops(1);
            oO00OO0O.this.f44863OooOO0.setVideoItem(oooOo);
            oO00OO0O.this.f44863OooOO0.OooO0OO();
            CancellableContinuation<Boolean> cancellableContinuation = this.f44872OooO0O0;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(Boolean.valueOf(oooOo != null)));
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            iArr[VipLevel.Vip1.ordinal()] = 1;
            iArr[VipLevel.Vip2.ordinal()] = 2;
            iArr[VipLevel.Vip3.ordinal()] = 3;
            iArr[VipLevel.Vip4.ordinal()] = 4;
            iArr[VipLevel.Vip5.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsManager", f = "RoomEnterTipsManager.kt", i = {0}, l = {193}, m = "showAriCarNull", n = {"this"}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f44873Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public oO00OO0O f44874Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f44875Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44875Oooo0oO = obj;
            this.f44873Oooo |= Integer.MIN_VALUE;
            return oO00OO0O.this.OooO0o0(false, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsManager$showAriCarNull$2", f = "RoomEnterTipsManager.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f44877Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f44878Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.LongRef longRef, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f44878Oooo0oO = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f44878Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f44877Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f44878Oooo0oO.element;
                this.f44877Oooo0o = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsManager", f = "RoomEnterTipsManager.kt", i = {0, 0, 1}, l = {265, 218}, m = "showAriCarSVGA", n = {"this", "vehicleSvga", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public oO00OO0O f44880Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public String f44881Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f44882Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f44883OoooO00;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44882Oooo0oo = obj;
            this.f44883OoooO00 |= Integer.MIN_VALUE;
            return oO00OO0O.this.OooO0o(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f44858OooO0Oo = roomActivity;
        this.f44860OooO0o0 = (UserPremiumView) this.f44365OooO00o.findViewById(R.id.userVipView);
        this.f44859OooO0o = (UserVipView) this.f44365OooO00o.findViewById(R.id.userKaVipView);
        this.f44861OooO0oO = (TextView) this.f44365OooO00o.findViewById(R.id.enterNameTip);
        this.f44862OooO0oo = (UserPrettyIdView) this.f44365OooO00o.findViewById(R.id.userPrettyIdView);
        UserMedalView userMedalView = (UserMedalView) this.f44365OooO00o.findViewById(R.id.userMedalView);
        userMedalView.OooO00o();
        this.f44857OooO = userMedalView;
        SVGAView sVGAView = (SVGAView) this.f44365OooO00o.findViewById(R.id.siv_car);
        Intrinsics.checkNotNullExpressionValue(sVGAView, "");
        oOO00O.OooO00o(sVGAView);
        this.f44863OooOO0 = sVGAView;
        this.f44864OooOO0O = (ViewGroup) this.f44365OooO00o.findViewById(R.id.ll_into_tips);
        ViewGroup viewGroup = (ViewGroup) this.f44365OooO00o.findViewById(R.id.ll_into_tips_bg);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        oOO00O.OooO00o(viewGroup);
        this.f44865OooOO0o = viewGroup;
        this.f44867OooOOO0 = (LinearLayout) this.f44365OooO00o.findViewById(R.id.ll_room_middle_special);
        this.f44866OooOOO = (UserRankView) this.f44365OooO00o.findViewById(R.id.userRankView);
        this.f44868OooOOOO = (RoomMemberBadgeView) this.f44365OooO00o.findViewById(R.id.userRoomMemberBadgeView);
        this.f44869OooOOOo = (TextView) this.f44365OooO00o.findViewById(R.id.entered);
        this.f44870OooOOo0 = new int[]{2, 2, 3, 3, 4, 4, 4, 5};
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        OooO0OO().clear();
        this.f44867OooOOO0.setLayoutTransition(null);
    }

    public final void OooO0Oo() {
        this.f44865OooOO0o.setVisibility(8);
        this.f44864OooOO0O.setVisibility(8);
        this.f44857OooO.setVisibility(8);
        this.f44863OooOO0.setImageDrawable(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o(String str, Continuation<? super Unit> continuation) {
        OooO0o oooO0o;
        oO00OO0O oo00oo0o;
        Object result;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f44883OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f44883OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object result2 = oooO0o.f44882Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f44883OoooO00;
        if (i2 != 0) {
            if (i2 == 1) {
                oo00oo0o = oooO0o.f44880Oooo0o;
                ResultKt.throwOnFailure(result2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oo00oo0o = oooO0o.f44880Oooo0o;
                ResultKt.throwOnFailure(result2);
            }
            oo00oo0o.OooO0Oo();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(result2);
        if (oo000o.OooO0o0()) {
            this.f44863OooOO0.setScaleX(-1.0f);
        }
        this.f44863OooOO0.setVisibility(0);
        oooO0o.f44880Oooo0o = this;
        oooO0o.f44881Oooo0oO = str;
        oooO0o.f44883OoooO00 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0o), 1);
        cancellableContinuationImpl.initCancellability();
        SharedSvgaManager.INSTANCE.loadSvga(str).observe(this.f44858OooO0Oo, new OooO(cancellableContinuationImpl));
        result2 = cancellableContinuationImpl.getResult();
        if (result2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(oooO0o);
        }
        if (result2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        oo00oo0o = this;
        boolean zBooleanValue = ((Boolean) result2).booleanValue();
        oooO0o.f44880Oooo0o = oo00oo0o;
        oooO0o.f44881Oooo0oO = null;
        oooO0o.f44883OoooO00 = 2;
        oo00oo0o.f44865OooOO0o.setVisibility(0);
        oo00oo0o.f44864OooOO0O.setVisibility(0);
        if (zBooleanValue) {
            oo00oo0o.f44863OooOO0.setVisibility(0);
            oo00oo0o.f44863OooOO0.setFillMode(SVGAImageView.FillMode.Forward);
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0o), 1);
            cancellableContinuationImpl2.initCancellability();
            oo00oo0o.f44863OooOO0.setCallback(new oO00OOo0(cancellableContinuationImpl2));
            result = cancellableContinuationImpl2.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO0o);
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
        } else {
            oo00oo0o.f44863OooOO0.setVisibility(8);
            result = o0000O0.OooO0OO(new oO00OOOo(5000L, null), oooO0o);
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        oo00oo0o.OooO0Oo();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o0(boolean z, int i, Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        oO00OO0O oo00oo0o;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f44873Oooo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f44873Oooo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f44875Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f44873Oooo;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f44865OooOO0o.setVisibility(0);
            this.f44864OooOO0O.setVisibility(0);
            this.f44863OooOO0.setVisibility(8);
            this.f44863OooOO0.setImageDrawable(null);
            Ref.LongRef longRef = new Ref.LongRef();
            try {
                int[] iArr = this.f44870OooOOo0;
                if (iArr.length > i / 100) {
                    longRef.element = (z ? iArr[i / 100] : 2) * 1000;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            OooO0OO oooO0OO = new OooO0OO(longRef, null);
            oooO0O0.f44874Oooo0o = this;
            oooO0O0.f44873Oooo = 1;
            if (o0000O0.OooO0OO(oooO0OO, oooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oo00oo0o = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oo00oo0o = oooO0O0.f44874Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        oo00oo0o.OooO0Oo();
        return Unit.INSTANCE;
    }

    public final void OooO0oO(@Nullable RoomUserInfoModel roomUserInfoModel) {
        boolean z = !this.f44858OooO0Oo.f11783o00000o0;
        if (roomUserInfoModel != null) {
            OooO0OO().add(roomUserInfoModel);
        }
        if (z && !OooO0OO().isEmpty() && this.f44368OooO0O0 == null) {
            this.f44368OooO0O0 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f44365OooO00o), Dispatchers.getMain(), null, new d8(this, null), 2, null);
        }
    }
}
