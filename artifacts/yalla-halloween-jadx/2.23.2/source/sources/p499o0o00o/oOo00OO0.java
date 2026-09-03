package p499o0o00o;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.repository.VoteRepo$getVoteRank$1$1;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightLinearLayoutManager;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.w;
import p423o0OoO0OO.o000O000;
import p423o0OoO0OO.o00O0000;
import p516o0o0O00o.o0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p650o0ooo.l2;
import p650o0ooo.p2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomVoteGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,135:1\n76#2:136\n25#3:137\n36#3:144\n36#3:151\n1097#4,6:138\n1097#4,6:145\n1097#4,6:152\n*S KotlinDebug\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager\n*L\n44#1:136\n46#1:137\n48#1:144\n80#1:151\n46#1:138,6\n48#1:145,6\n80#1:152,6\n*E\n"})
public final class oOo00OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOo00OO0 f50072OooO00o = new oOo00OO0();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50074OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f50074OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50074OooO0o0 | 1);
            oOo00OO0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomVoteGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,135:1\n63#2,5:136\n*S KotlinDebug\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$1$1\n*L\n49#1:136,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f50075OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<RoomVoteDialog> mutableState) {
            super(1);
            this.f50075OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new oO00O0o(this.f50075OooO0Oo);
        }
    }

    public static final class OooO0O0<T> implements Observer {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f50076OooO0Oo;

        public OooO0O0(MutableState<RoomVoteDialog> mutableState) {
            this.f50076OooO0Oo = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<RoomVoteDialog> mutableState = this.f50076OooO0Oo;
            RoomVoteDialog value = mutableState.getValue();
            if (value != null) {
                value.OooOO0();
            }
            mutableState.setValue(null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f50077OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomVoteGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$8\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,135:1\n154#2:136\n*S KotlinDebug\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$8\n*L\n96#1:136\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f50078OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f50079OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f50078OooO0Oo = mutableState;
            this.f50079OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(342311323, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomVoteGameManager.Content.<anonymous> (RoomVoteGameManager.kt:92)");
            }
            o0.OooO00o(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new oO00OO0O(this.f50078OooO0Oo, this.f50079OooO0o0), 253), Integer.valueOf(o0Oo0oo.room_side_vote_game), null, o0000.OooO0OO(o000000.room_vote_game_page_title), null, Dp.m3775constructorimpl(44), null, false, composer2, 196608, 212);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50081OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f50081OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50081OooO0o0 | 1);
            oOo00OO0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<VoteDetailModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f50082OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<RoomVoteDialog> mutableState) {
            super(1);
            this.f50082OooO0Oo = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:68:0x023d  */
        /* JADX WARN: Instruction removed from duplicated block: B:68:0x023d, please report this as an issue */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VoteDetailModel voteDetailModel) {
            RoomVoteDialog value;
            String strOooO0OO;
            boolean z;
            String str;
            String str2;
            String str3;
            int i;
            int i2;
            VoteDetailModel model = voteDetailModel;
            if (model != null && (value = this.f50082OooO0Oo.getValue()) != null) {
                Intrinsics.checkNotNullParameter(model, "model");
                VoteModel voteActivity = model.getVoteActivity();
                if (voteActivity != null) {
                    VoteModel voteActivity2 = model.getVoteActivity();
                    if (voteActivity2 == null || (strOooO0OO = voteActivity2.getTitle()) == null) {
                        strOooO0OO = "";
                    }
                    w wVar = value.f27494OooOO0o;
                    MarqueeText marqueeText = wVar.f45651OooOO0O;
                    if (strOooO0OO.length() == 0) {
                        strOooO0OO = o0000.OooO0OO(o000000.room_vote_game_page_title);
                    }
                    marqueeText.setText(strOooO0OO);
                    MarqueeText tvTitle = wVar.f45651OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                    MarqueeText.OooOO0o(tvTitle);
                    int status = voteActivity.getStatus();
                    int iOooO00o = RoomVoteDialog.VoteStatus.Running.getValue();
                    ImageView imageView = wVar.f45643OooO0O0;
                    ImageView ivVoteRules = wVar.f45644OooO0OO;
                    LinearLayoutCompat llBottom2 = wVar.f45647OooO0o0;
                    LinearLayoutCompat llBottom1 = wVar.f45645OooO0Oo;
                    TextView tvEndVote = wVar.f45649OooO0oo;
                    if (status == iOooO00o) {
                        value.f27495OooOOO = true;
                        Intrinsics.checkNotNullExpressionValue(llBottom1, "llBottom1");
                        o000O.OooOOOO(llBottom1);
                        Intrinsics.checkNotNullExpressionValue(llBottom2, "llBottom2");
                        o000O.OooO0O0(llBottom2);
                        Intrinsics.checkNotNullExpressionValue(ivVoteRules, "ivVoteRules");
                        o000O.OooOOOO(ivVoteRules);
                        value.OooO0o(true);
                        value.OooOO0O(false);
                        boolean isHasStop = model.getIsHasStop();
                        Intrinsics.checkNotNullExpressionValue(tvEndVote, "tvEndVote");
                        if (isHasStop) {
                            o000O.OooOOOO(tvEndVote);
                        } else {
                            o000O.OooO0O0(tvEndVote);
                        }
                        if (model.getIsHasStop()) {
                            i = o000O000.f46651OooO0O0;
                            i2 = 316;
                        } else {
                            i = o000O000.f46651OooO0O0;
                            i2 = 260;
                        }
                        int iOooO00o2 = (i - o0000O0.OooO00o(i2)) - o000O000.OooO00o();
                        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager = value.f27498OooOOOo;
                        if (maxHeightLinearLayoutManager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                            maxHeightLinearLayoutManager = null;
                        }
                        float f = 352;
                        if (iOooO00o2 > o0000O0.OooO00o(f)) {
                            iOooO00o2 = o0000O0.OooO00o(f);
                        }
                        maxHeightLinearLayoutManager.f30529OooO0Oo = iOooO00o2;
                        wVar.f45650OooOO0.setText(o0000.OooO0OO(o000000.room_vote_game_my_votes) + ZegoConstants.ZegoVideoDataAuxPublishingStream + model.getCurrentUserVoteCount());
                        imageView.setImageResource(o0Oo0oo.room_vote_game_pack_up);
                        if (value.f27500OooOOo0 == null) {
                            boolean isUnLimit = voteActivity.getIsUnLimit();
                            TextView textView = wVar.f45652OooOO0o;
                            if (isUnLimit) {
                                textView.setText(o0000.OooO0OO(o000000.room_vote_game_end_ongoing) + ZegoConstants.ZegoVideoDataAuxPublishingStream + RoomVoteDialog.OooOO0o((voteActivity.getCurrentTime() - voteActivity.getStartTime()) * ((long) 1000), true));
                            } else {
                                textView.setText(o0000.OooO0OO(o000000.room_vote_game_end_in) + ZegoConstants.ZegoVideoDataAuxPublishingStream + RoomVoteDialog.OooOO0o((voteActivity.getPreEndTime() - voteActivity.getCurrentTime()) * ((long) 1000), false));
                            }
                            value.f27500OooOOo0 = new p2(voteActivity.getIsUnLimit() ? ((long) 86400000) - ((voteActivity.getCurrentTime() - voteActivity.getStartTime()) * ((long) 1000)) : (voteActivity.getPreEndTime() - voteActivity.getCurrentTime()) * ((long) 1000), value, voteActivity).start();
                        }
                    } else {
                        if (value.f27501OooOOoo) {
                            z = false;
                            value.f27501OooOOoo = false;
                            o0oo0000.OooO00o.OooO0O0("102108");
                        } else {
                            z = false;
                        }
                        value.f27495OooOOO = z;
                        Intrinsics.checkNotNullExpressionValue(llBottom1, "llBottom1");
                        o000O.OooO0O0(llBottom1);
                        Intrinsics.checkNotNullExpressionValue(tvEndVote, "tvEndVote");
                        o000O.OooO0O0(tvEndVote);
                        Intrinsics.checkNotNullExpressionValue(llBottom2, "llBottom2");
                        o000O.OooOOOO(llBottom2);
                        Intrinsics.checkNotNullExpressionValue(ivVoteRules, "ivVoteRules");
                        o000O.OooO0O0(ivVoteRules);
                        value.OooO0o(z);
                        int iOooO00o3 = (o000O000.f46651OooO0O0 - o0000O0.OooO00o(319)) - o000O000.OooO00o();
                        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager2 = value.f27498OooOOOo;
                        if (maxHeightLinearLayoutManager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                            maxHeightLinearLayoutManager2 = null;
                        }
                        float f2 = 352;
                        if (iOooO00o3 > o0000O0.OooO00o(f2)) {
                            iOooO00o3 = o0000O0.OooO00o(f2);
                        }
                        maxHeightLinearLayoutManager2.f30529OooO0Oo = iOooO00o3;
                        value.OooOO0();
                        imageView.setImageResource(o0Oo0oo.btn_header_close);
                        String strOooO0OO2 = o0000.OooO0OO(o000000.room_vote_game_duration);
                        long j = 1000;
                        long endTime = ((voteActivity.getEndTime() - voteActivity.getStartTime()) * j) / j;
                        long j2 = 60;
                        long j3 = endTime / j2;
                        long j4 = j3 / j2;
                        long j5 = j3 % j2;
                        long j6 = endTime % j2;
                        if (j4 > 0) {
                            str = j4 + o0000.OooO0OO(o000000.room_vote_game_hour) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                        } else {
                            str = "";
                        }
                        if (j5 > 0) {
                            str2 = j5 + o0000.OooO0OO(o000000.room_vote_game_minute) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                        } else {
                            if (str.length() > 0) {
                                z = true;
                            }
                            if (z) {
                                str2 = j5 + o0000.OooO0OO(o000000.room_vote_game_minute) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                            } else {
                                str2 = "";
                            }
                        }
                        String strOooO00o = OooOOOO.OooO00o(str, str2);
                        if (j6 > 0) {
                            str3 = j6 + o0000.OooO0OO(o000000.room_vote_game_second) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                        } else {
                            str3 = "";
                        }
                        wVar.f45641OooO.setText(o0OoOo0.OooO0O0(strOooO0OO2, ": ", OooOOOO.OooO00o(strOooO00o, str3)));
                        value.OooOO0O(true);
                    }
                }
                l2 l2Var = value.f27496OooOOO0;
                if (l2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    l2Var = null;
                }
                l2Var.OooOoO0(model.getRank());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f50083OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24522OooOOO.f48634OooO0O0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<ApiResult<VoteDetailModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f50084OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MutableState<RoomVoteDialog> mutableState) {
            super(1);
            this.f50084OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<VoteDetailModel> apiResult) {
            VoteModel voteActivity;
            ApiResult<VoteDetailModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomGameConfig.Vote value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24575Oooo0oO.getValue();
            if (value != null) {
                VoteDetailModel data = it.getData();
                value.setStatus((data == null || (voteActivity = data.getVoteActivity()) == null) ? RoomVoteDialog.VoteStatus.Running.getValue() : voteActivity.getStatus());
            }
            RoomVoteDialog value2 = this.f50084OooO0Oo.getValue();
            if (value2 != null) {
                l2 l2Var = value2.f27496OooOOO0;
                if (l2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    l2Var = null;
                }
                l2Var.Oooo00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static void OooO0O0(long j, MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
        if (value == null) {
            value = 0L;
        }
        long jLongValue = value.longValue();
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new VoteRepo$getVoteRank$1$1(jLongValue, j, mutableLiveData, null), 3, null);
        mutableLiveData.observe(mixedRoomActivity, new o000oOoO(new OooOO0O(mutableState), null, new OooOOO0(mutableState), false, 10));
    }

    public static void OooO0OO(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        RoomGameConfig.Vote value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24575Oooo0oO.getValue();
        OooO0O0(value != null ? value.getVoteId() : 0L, mutableState, mixedRoomActivity);
    }

    public static void OooO0Oo(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        if (mutableState.getValue() == null) {
            mutableState.setValue(new RoomVoteDialog(mixedRoomActivity, OooOOO.f50083OooO0Oo));
        }
        com.yalla.yalla.service.room.OooO00o.f24522OooOOO.f48634OooO0O0.setValue(Boolean.TRUE);
        RoomVoteDialog roomVoteDialog = (RoomVoteDialog) mutableState.getValue();
        if (roomVoteDialog != null) {
            roomVoteDialog.OooO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(1226690419);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1226690419, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomVoteGameManager.Content (RoomVoteGameManager.kt:42)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            final MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            if (mixedRoomActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(i));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new OooO00o(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
            Observable<Object> observable = LiveEventBus.get("INITIATE_VOTE_REQUEST");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o00o.oO000Oo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object it) {
                    MutableState voteDialog = mutableState;
                    Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it instanceof Room.InitiateVoteReply) {
                        oOo00OO0.OooO0Oo(voteDialog, activity);
                        oOo00OO0.OooO0O0(((Room.InitiateVoteReply) it).getVoteId(), voteDialog, activity);
                    }
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable2 = LiveEventBus.get("END_UP_VOTE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new Observer() { // from class: o0o00o.oO000o00
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object it) {
                    MutableState voteDialog = mutableState;
                    Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (it instanceof Room.VoteResultNotify) {
                        oOo00OO0.OooO0Oo(voteDialog, activity);
                        oOo00OO0.OooO0O0(((Room.VoteResultNotify) it).getVoteId(), voteDialog, activity);
                    }
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable3 = LiveEventBus.get("UPDATE_VOTE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
            o00O0000.OooO00o(observable3, new Observer() { // from class: o0o00o.oO0O0OoO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object it) {
                    MutableState voteDialog = mutableState;
                    Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((it instanceof Long) && Intrinsics.areEqual(it, Long.valueOf(OooO00o.f24516OooO0o0.OooO0o0()))) {
                        oOo00OO0.OooO0OO(voteDialog, activity);
                    }
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable4 = LiveEventBus.get("PARTICIPATE_IN_THE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable4, "get(...)");
            o00O0000.OooO00o(observable4, new Observer() { // from class: o0o00o.oO00O0o0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object it) {
                    MutableState voteDialog = mutableState;
                    Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    Intrinsics.checkNotNullParameter(it, "it");
                    oOo00OO0.OooO0Oo(voteDialog, activity);
                    oOo00OO0.OooO0OO(voteDialog, activity);
                }
            }, composerStartRestartGroup, 72);
            Observable<Object> observable5 = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable5, "get(...)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO0O0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o00O0000.OooO00o(observable5, (Observer) objRememberedValue3, composerStartRestartGroup, 72);
            RoomGameConfig.Vote vote = (RoomGameConfig.Vote) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24575Oooo0oO, composerStartRestartGroup, 8).getValue();
            if (vote == null || vote.getStatus() != RoomVoteDialog.VoteStatus.Running.getValue()) {
                z = false;
            } else {
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24522OooOOO.f48634OooO0O0.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO0OO.f50077OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 342311323, true, new OooO0o(mutableState, mixedRoomActivity)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO(i));
    }
}
