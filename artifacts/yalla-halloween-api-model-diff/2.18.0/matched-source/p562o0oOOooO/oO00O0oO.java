package p562o0oOOooO;

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
import p169o00Ooo0.oo000o;
import p255o00ooO0O.o0000O0;
import p255o00ooO0O.oOO00O;
import p408o0Oo0OO0.OooOo;
import p547o0o0OoOo.c8;
import p547o0o0OoOo.d8;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00O0oO extends d8<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final UserMedalView f44873OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f44874OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final UserVipView f44875OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final UserPremiumView f44876OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final TextView f44877OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final UserPrettyIdView f44878OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final SVGAView f44879OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ViewGroup f44880OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ViewGroup f44881OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final UserRankView f44882OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final LinearLayout f44883OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final RoomMemberBadgeView f44884OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final TextView f44885OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final int[] f44886OooOOo0;

    public static final class OooO<T> implements Observer {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Boolean> f44888OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.f44888OooO0O0 = cancellableContinuation;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            OooOo oooOo = (OooOo) obj;
            oO00O0oO.this.f44879OooOO0.setLoops(1);
            oO00O0oO.this.f44879OooOO0.setVideoItem(oooOo);
            oO00O0oO.this.f44879OooOO0.OooO0OO();
            CancellableContinuation<Boolean> cancellableContinuation = this.f44888OooO0O0;
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
        public oO00O0oO f44889Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f44891OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f44892OoooO0O;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44891OoooO00 = obj;
            this.f44892OoooO0O |= Integer.MIN_VALUE;
            return oO00O0oO.this.OooO0o0(false, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.tips.RoomEnterTipsManager$showAriCarNull$2", f = "RoomEnterTipsManager.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f44893Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f44894OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Ref.LongRef longRef, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f44894OoooO00 = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f44894OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f44893Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f44894OoooO00.element;
                this.f44893Oooo = 1;
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

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public oO00O0oO f44895Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f44896OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public /* synthetic */ Object f44897OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public String f44898OoooO00;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44897OoooO0 = obj;
            this.f44896OoooO |= Integer.MIN_VALUE;
            return oO00O0oO.this.OooO0o(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f44874OooO0Oo = roomActivity;
        this.f44876OooO0o0 = (UserPremiumView) this.f44372OooO00o.findViewById(R.id.userVipView);
        this.f44875OooO0o = (UserVipView) this.f44372OooO00o.findViewById(R.id.userKaVipView);
        this.f44877OooO0oO = (TextView) this.f44372OooO00o.findViewById(R.id.enterNameTip);
        this.f44878OooO0oo = (UserPrettyIdView) this.f44372OooO00o.findViewById(R.id.userPrettyIdView);
        UserMedalView userMedalView = (UserMedalView) this.f44372OooO00o.findViewById(R.id.userMedalView);
        userMedalView.OooO00o();
        this.f44873OooO = userMedalView;
        SVGAView sVGAView = (SVGAView) this.f44372OooO00o.findViewById(R.id.siv_car);
        Intrinsics.checkNotNullExpressionValue(sVGAView, "");
        oOO00O.OooO00o(sVGAView);
        this.f44879OooOO0 = sVGAView;
        this.f44880OooOO0O = (ViewGroup) this.f44372OooO00o.findViewById(R.id.ll_into_tips);
        ViewGroup viewGroup = (ViewGroup) this.f44372OooO00o.findViewById(R.id.ll_into_tips_bg);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "");
        oOO00O.OooO00o(viewGroup);
        this.f44881OooOO0o = viewGroup;
        this.f44883OooOOO0 = (LinearLayout) this.f44372OooO00o.findViewById(R.id.ll_room_middle_special);
        this.f44882OooOOO = (UserRankView) this.f44372OooO00o.findViewById(R.id.userRankView);
        this.f44884OooOOOO = (RoomMemberBadgeView) this.f44372OooO00o.findViewById(R.id.userRoomMemberBadgeView);
        this.f44885OooOOOo = (TextView) this.f44372OooO00o.findViewById(R.id.entered);
        this.f44886OooOOo0 = new int[]{2, 2, 3, 3, 4, 4, 4, 5};
    }

    @Override // p547o0o0OoOo.b8
    public final void OooO00o() {
    }

    @Override // p547o0o0OoOo.b8
    public final void OooO0O0() {
        OooO0OO().clear();
        this.f44883OooOOO0.setLayoutTransition(null);
    }

    public final void OooO0Oo() {
        this.f44881OooOO0o.setVisibility(8);
        this.f44880OooOO0O.setVisibility(8);
        this.f44873OooO.setVisibility(8);
        this.f44879OooOO0.setImageDrawable(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o(String str, Continuation<? super Unit> continuation) {
        OooO0o oooO0o;
        oO00O0oO oo00o0oo;
        Object result;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f44896OoooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f44896OoooO = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object result2 = oooO0o.f44897OoooO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f44896OoooO;
        if (i2 != 0) {
            if (i2 == 1) {
                oo00o0oo = oooO0o.f44895Oooo;
                ResultKt.throwOnFailure(result2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oo00o0oo = oooO0o.f44895Oooo;
                ResultKt.throwOnFailure(result2);
            }
            oo00o0oo.OooO0Oo();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(result2);
        if (oo000o.OooO0o0()) {
            this.f44879OooOO0.setScaleX(-1.0f);
        }
        this.f44879OooOO0.setVisibility(0);
        oooO0o.f44895Oooo = this;
        oooO0o.f44898OoooO00 = str;
        oooO0o.f44896OoooO = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0o), 1);
        cancellableContinuationImpl.initCancellability();
        SharedSvgaManager.INSTANCE.loadSvga(str).observe(this.f44874OooO0Oo, new OooO(cancellableContinuationImpl));
        result2 = cancellableContinuationImpl.getResult();
        if (result2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(oooO0o);
        }
        if (result2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        oo00o0oo = this;
        boolean zBooleanValue = ((Boolean) result2).booleanValue();
        oooO0o.f44895Oooo = oo00o0oo;
        oooO0o.f44898OoooO00 = null;
        oooO0o.f44896OoooO = 2;
        oo00o0oo.f44881OooOO0o.setVisibility(0);
        oo00o0oo.f44880OooOO0O.setVisibility(0);
        if (zBooleanValue) {
            oo00o0oo.f44879OooOO0.setVisibility(0);
            oo00o0oo.f44879OooOO0.setFillMode(SVGAImageView.FillMode.Forward);
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0o), 1);
            cancellableContinuationImpl2.initCancellability();
            oo00o0oo.f44879OooOO0.setCallback(new oO00OOOo(cancellableContinuationImpl2));
            result = cancellableContinuationImpl2.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO0o);
            }
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
        } else {
            oo00o0oo.f44879OooOO0.setVisibility(8);
            result = o0000O0.OooO0OO(new oO00OOO(5000L, null), oooO0o);
            if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                result = Unit.INSTANCE;
            }
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        oo00o0oo.OooO0Oo();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o0(boolean z, int i, Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        oO00O0oO oo00o0oo;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f44892OoooO0O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f44892OoooO0O = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f44891OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f44892OoooO0O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f44881OooOO0o.setVisibility(0);
            this.f44880OooOO0O.setVisibility(0);
            this.f44879OooOO0.setVisibility(8);
            this.f44879OooOO0.setImageDrawable(null);
            Ref.LongRef longRef = new Ref.LongRef();
            try {
                int[] iArr = this.f44886OooOOo0;
                if (iArr.length > i / 100) {
                    longRef.element = (z ? iArr[i / 100] : 2) * 1000;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            OooO0OO oooO0OO = new OooO0OO(longRef, null);
            oooO0O0.f44889Oooo = this;
            oooO0O0.f44892OoooO0O = 1;
            if (o0000O0.OooO0OO(oooO0OO, oooO0O0) == coroutine_suspended) {
                return coroutine_suspended;
            }
            oo00o0oo = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oo00o0oo = oooO0O0.f44889Oooo;
            ResultKt.throwOnFailure(obj);
        }
        oo00o0oo.OooO0Oo();
        return Unit.INSTANCE;
    }

    public final void OooO0oO(@Nullable RoomUserInfoModel roomUserInfoModel) {
        boolean z = !this.f44874OooO0Oo.f11798o00000oo;
        if (roomUserInfoModel != null) {
            OooO0OO().add(roomUserInfoModel);
        }
        if (z && !OooO0OO().isEmpty() && this.f44375OooO0O0 == null) {
            this.f44375OooO0O0 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f44372OooO00o), Dispatchers.getMain(), null, new c8(this, null), 2, null);
        }
    }
}
