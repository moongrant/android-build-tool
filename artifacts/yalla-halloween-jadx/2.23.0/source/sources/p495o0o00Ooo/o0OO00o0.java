package p495o0o00Ooo;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.data.repository.VoteRepo$getVoteRank$1$1;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightLinearLayoutManager;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.Unit;
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
import p377o0OOoOo.o0000OO0;
import p417o0OoO0.o00000O;
import p417o0OoO0.o0ooOOo;
import p507o0o00ooo.a1;
import p519o0o0O0oO.l2;
import p519o0o0O0oO.p2;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.i8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomVoteGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,125:1\n76#2:126\n25#3:127\n36#3:134\n1097#4,6:128\n1097#4,6:135\n*S KotlinDebug\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager\n*L\n35#1:126\n37#1:127\n39#1:134\n37#1:128,6\n39#1:135,6\n*E\n"})
public final class o0OO00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO00o0 f48922OooO00o = new o0OO00o0();

    public static final class OooO implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48923OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48924OooO0o0;

        public OooO(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            this.f48923OooO0Oo = mutableState;
            this.f48924OooO0o0 = mixedRoomActivity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<RoomVoteDialog> mutableState = this.f48923OooO0Oo;
            MixedRoomActivity mixedRoomActivity = this.f48924OooO0o0;
            o0OO00o0.OooO0O0(mutableState, mixedRoomActivity);
            o0OO00o0.OooO0Oo(mutableState, mixedRoomActivity);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomVoteGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,125:1\n63#2,5:126\n*S KotlinDebug\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$1$1\n*L\n40#1:126,5\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48925OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<RoomVoteDialog> mutableState) {
            super(1);
            this.f48925OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0OO00OO(this.f48925OooO0Oo);
        }
    }

    public static final class OooO0O0 implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48926OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48927OooO0o0;

        public OooO0O0(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            this.f48926OooO0Oo = mutableState;
            this.f48927OooO0o0 = mixedRoomActivity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof Room.InitiateVoteReply) {
                MutableState<RoomVoteDialog> mutableState = this.f48926OooO0Oo;
                MixedRoomActivity mixedRoomActivity = this.f48927OooO0o0;
                o0OO00o0.OooO0O0(mutableState, mixedRoomActivity);
                o0OO00o0.OooO0OO(((Room.InitiateVoteReply) it).getVoteId(), mutableState, mixedRoomActivity);
            }
        }
    }

    public static final class OooO0OO implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48928OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48929OooO0o0;

        public OooO0OO(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            this.f48928OooO0Oo = mutableState;
            this.f48929OooO0o0 = mixedRoomActivity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof Room.VoteResultNotify) {
                MutableState<RoomVoteDialog> mutableState = this.f48928OooO0Oo;
                MixedRoomActivity mixedRoomActivity = this.f48929OooO0o0;
                o0OO00o0.OooO0O0(mutableState, mixedRoomActivity);
                o0OO00o0.OooO0OO(((Room.VoteResultNotify) it).getVoteId(), mutableState, mixedRoomActivity);
            }
        }
    }

    public static final class OooO0o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48930OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48931OooO0o0;

        public OooO0o(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            this.f48930OooO0Oo = mutableState;
            this.f48931OooO0o0 = mixedRoomActivity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((it instanceof Long) && Intrinsics.areEqual(it, Long.valueOf(com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0()))) {
                o0OO00o0.OooO0Oo(this.f48930OooO0Oo, this.f48931OooO0o0);
            }
        }
    }

    public static final class OooOO0 implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48932OooO0Oo;

        public OooOO0(MutableState<RoomVoteDialog> mutableState) {
            this.f48932OooO0Oo = mutableState;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<RoomVoteDialog> mutableState = this.f48932OooO0Oo;
            RoomVoteDialog value = mutableState.getValue();
            if (value != null) {
                value.OooOO0();
            }
            mutableState.setValue(null);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomVoteGameManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$7\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,125:1\n154#2:126\n*S KotlinDebug\n*F\n+ 1 RoomVoteGameManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomVoteGameManager$Content$7\n*L\n86#1:126\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48933OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48934OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MutableState<RoomVoteDialog> mutableState, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f48933OooO0Oo = mutableState;
            this.f48934OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(342311323, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomVoteGameManager.Content.<anonymous> (RoomVoteGameManager.kt:81)");
            }
            a1.OooO00o(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0OO0O0(this.f48933OooO0Oo, this.f48934OooO0o0), 253), Integer.valueOf(oOo00OO0.room_side_vote_game), null, o0000.OooO0OO(oO00OOo0.room_vote_game_page_title), null, Dp.m3765constructorimpl(44), null, false, composer2, 196608, 212);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48936OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i) {
            super(2);
            this.f48936OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48936OooO0o0 | 1);
            o0OO00o0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48938OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i) {
            super(2);
            this.f48938OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48938OooO0o0 | 1);
            o0OO00o0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<VoteDetailModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48939OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MutableState<RoomVoteDialog> mutableState) {
            super(1);
            this.f48939OooO0Oo = mutableState;
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
            if (model != null && (value = this.f48939OooO0Oo.getValue()) != null) {
                Intrinsics.checkNotNullParameter(model, "model");
                VoteModel voteActivity = model.getVoteActivity();
                if (voteActivity != null) {
                    VoteModel voteActivity2 = model.getVoteActivity();
                    if (voteActivity2 == null || (strOooO0OO = voteActivity2.getTitle()) == null) {
                        strOooO0OO = "";
                    }
                    i8 i8Var = value.f27957OooOO0o;
                    MarqueeText marqueeText = i8Var.f58139OooOO0O;
                    if (strOooO0OO.length() == 0) {
                        strOooO0OO = o0000.OooO0OO(oO00OOo0.room_vote_game_page_title);
                    }
                    marqueeText.setText(strOooO0OO);
                    MarqueeText marqueeText2 = i8Var.f58139OooOO0O;
                    Intrinsics.checkNotNullExpressionValue(marqueeText2, "binding.tvTitle");
                    MarqueeText.OooOO0o(marqueeText2);
                    int status = voteActivity.getStatus();
                    int value2 = RoomVoteDialog.VoteStatus.Running.getValue();
                    ImageView imageView = i8Var.f58131OooO0O0;
                    ImageView imageView2 = i8Var.f58132OooO0OO;
                    LinearLayoutCompat linearLayoutCompat = i8Var.f58135OooO0o0;
                    LinearLayoutCompat linearLayoutCompat2 = i8Var.f58133OooO0Oo;
                    TextView textView = i8Var.f58137OooO0oo;
                    if (status == value2) {
                        value.f27958OooOOO = true;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.llBottom1");
                        o000OO00.OooOOOO(linearLayoutCompat2);
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.llBottom2");
                        o000OO00.OooO0O0(linearLayoutCompat);
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivVoteRules");
                        o000OO00.OooOOOO(imageView2);
                        value.OooO0o(true);
                        value.OooOO0O(false);
                        boolean isHasStop = model.getIsHasStop();
                        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvEndVote");
                        if (isHasStop) {
                            o000OO00.OooOOOO(textView);
                        } else {
                            o000OO00.OooO0O0(textView);
                        }
                        if (model.getIsHasStop()) {
                            i = o0ooOOo.f45530OooO0O0;
                            i2 = 316;
                        } else {
                            i = o0ooOOo.f45530OooO0O0;
                            i2 = 260;
                        }
                        int iOooO00o = (i - o0000O0.OooO00o(i2)) - o0ooOOo.OooO00o();
                        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager = value.f27961OooOOOo;
                        if (maxHeightLinearLayoutManager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                            maxHeightLinearLayoutManager = null;
                        }
                        float f = 352;
                        if (iOooO00o > o0000O0.OooO00o(f)) {
                            iOooO00o = o0000O0.OooO00o(f);
                        }
                        maxHeightLinearLayoutManager.f31074OooO0Oo = iOooO00o;
                        i8Var.f58138OooOO0.setText(o0000.OooO0OO(oO00OOo0.room_vote_game_my_votes) + ZegoConstants.ZegoVideoDataAuxPublishingStream + model.getCurrentUserVoteCount());
                        imageView.setImageResource(oOo00OO0.room_vote_game_pack_up);
                        if (value.f27963OooOOo0 == null) {
                            boolean isUnLimit = voteActivity.getIsUnLimit();
                            TextView textView2 = i8Var.f58140OooOO0o;
                            if (isUnLimit) {
                                textView2.setText(o0000.OooO0OO(oO00OOo0.room_vote_game_end_ongoing) + ZegoConstants.ZegoVideoDataAuxPublishingStream + RoomVoteDialog.OooOO0o((voteActivity.getCurrentTime() - voteActivity.getStartTime()) * ((long) 1000), true));
                            } else {
                                textView2.setText(o0000.OooO0OO(oO00OOo0.room_vote_game_end_in) + ZegoConstants.ZegoVideoDataAuxPublishingStream + RoomVoteDialog.OooOO0o((voteActivity.getPreEndTime() - voteActivity.getCurrentTime()) * ((long) 1000), false));
                            }
                            value.f27963OooOOo0 = new p2(voteActivity.getIsUnLimit() ? ((long) 86400000) - ((voteActivity.getCurrentTime() - voteActivity.getStartTime()) * ((long) 1000)) : (voteActivity.getPreEndTime() - voteActivity.getCurrentTime()) * ((long) 1000), value, voteActivity).start();
                        }
                    } else {
                        if (value.f27964OooOOoo) {
                            z = false;
                            value.f27964OooOOoo = false;
                            o0OO000.OooO00o("102108");
                        } else {
                            z = false;
                        }
                        value.f27958OooOOO = z;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.llBottom1");
                        o000OO00.OooO0O0(linearLayoutCompat2);
                        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvEndVote");
                        o000OO00.OooO0O0(textView);
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.llBottom2");
                        o000OO00.OooOOOO(linearLayoutCompat);
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivVoteRules");
                        o000OO00.OooO0O0(imageView2);
                        value.OooO0o(z);
                        int iOooO00o2 = (o0ooOOo.f45530OooO0O0 - o0000O0.OooO00o(319)) - o0ooOOo.OooO00o();
                        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager2 = value.f27961OooOOOo;
                        if (maxHeightLinearLayoutManager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                            maxHeightLinearLayoutManager2 = null;
                        }
                        float f2 = 352;
                        if (iOooO00o2 > o0000O0.OooO00o(f2)) {
                            iOooO00o2 = o0000O0.OooO00o(f2);
                        }
                        maxHeightLinearLayoutManager2.f31074OooO0Oo = iOooO00o2;
                        value.OooOO0();
                        imageView.setImageResource(oOo00OO0.btn_header_close);
                        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.room_vote_game_duration);
                        long j = 1000;
                        long endTime = ((voteActivity.getEndTime() - voteActivity.getStartTime()) * j) / j;
                        long j2 = 60;
                        long j3 = endTime / j2;
                        long j4 = j3 / j2;
                        long j5 = j3 % j2;
                        long j6 = endTime % j2;
                        if (j4 > 0) {
                            str = j4 + o0000.OooO0OO(oO00OOo0.room_vote_game_hour) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                        } else {
                            str = "";
                        }
                        if (j5 > 0) {
                            str2 = j5 + o0000.OooO0OO(oO00OOo0.room_vote_game_minute) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                        } else {
                            if (str.length() > 0) {
                                z = true;
                            }
                            if (z) {
                                str2 = j5 + o0000.OooO0OO(oO00OOo0.room_vote_game_minute) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                            } else {
                                str2 = "";
                            }
                        }
                        String strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(str, str2);
                        if (j6 > 0) {
                            str3 = j6 + o0000.OooO0OO(oO00OOo0.room_vote_game_second) + ZegoConstants.ZegoVideoDataAuxPublishingStream;
                        } else {
                            str3 = "";
                        }
                        i8Var.f58129OooO.setText(o0OoOo0.OooO00o(strOooO0OO2, ": ", androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, str3)));
                        value.OooOO0O(true);
                    }
                }
                l2 l2Var = value.f27959OooOOO0;
                if (l2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    l2Var = null;
                }
                l2Var.OooOoO0(model.getRank());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<ApiResult<VoteDetailModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<RoomVoteDialog> f48940OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<RoomVoteDialog> mutableState) {
            super(1);
            this.f48940OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<VoteDetailModel> apiResult) {
            VoteModel voteActivity;
            ApiResult<VoteDetailModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomGameConfig.Vote value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25037Oooo0oO.getValue();
            if (value != null) {
                VoteDetailModel data = it.getData();
                value.setStatus((data == null || (voteActivity = data.getVoteActivity()) == null) ? RoomVoteDialog.VoteStatus.Running.getValue() : voteActivity.getStatus());
            }
            RoomVoteDialog value2 = this.f48940OooO0Oo.getValue();
            if (value2 != null) {
                l2 l2Var = value2.f27959OooOOO0;
                if (l2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    l2Var = null;
                }
                l2Var.Oooo00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        if (mutableState.getValue() == null) {
            mutableState.setValue(new RoomVoteDialog(mixedRoomActivity, o0OOooO0.f48943OooO0Oo));
        }
        com.yalla.yalla.service.room.OooO00o.f24984OooOOO.f47445OooO0O0.setValue(Boolean.TRUE);
        RoomVoteDialog roomVoteDialog = (RoomVoteDialog) mutableState.getValue();
        if (roomVoteDialog != null) {
            roomVoteDialog.OooO();
        }
    }

    public static void OooO0OO(long j, MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        Long value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
        if (value == null) {
            value = 0L;
        }
        long jLongValue = value.longValue();
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new VoteRepo$getVoteRank$1$1(jLongValue, j, mutableLiveData, null), 3, null);
        mutableLiveData.observe(mixedRoomActivity, new o0000OO0(new OooOOOO(mutableState), null, new OooOo00(mutableState), false, 10));
    }

    public static void OooO0Oo(MutableState mutableState, MixedRoomActivity mixedRoomActivity) {
        RoomGameConfig.Vote value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25037Oooo0oO.getValue();
        OooO0OO(value != null ? value.getVoteId() : 0L, mutableState, mixedRoomActivity);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0133  */
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
                ComposerKt.traceEventStart(1226690419, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomVoteGameManager.Content (RoomVoteGameManager.kt:33)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            if (mixedRoomActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i));
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
            MutableState mutableState = (MutableState) objRememberedValue;
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
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.INITIATE_VOTE_REQUEST)");
            o00000O.OooO00o(observable, new OooO0O0(mutableState, mixedRoomActivity), composerStartRestartGroup, 8);
            Observable<Object> observable2 = LiveEventBus.get("END_UP_VOTE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.END_UP_VOTE_GAME)");
            o00000O.OooO00o(observable2, new OooO0OO(mutableState, mixedRoomActivity), composerStartRestartGroup, 8);
            Observable<Object> observable3 = LiveEventBus.get("UPDATE_VOTE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.UPDATE_VOTE_GAME)");
            o00000O.OooO00o(observable3, new OooO0o(mutableState, mixedRoomActivity), composerStartRestartGroup, 8);
            Observable<Object> observable4 = LiveEventBus.get("PARTICIPATE_IN_THE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.PARTICIPATE_IN_THE_GAME)");
            o00000O.OooO00o(observable4, new OooO(mutableState, mixedRoomActivity), composerStartRestartGroup, 8);
            Observable<Object> observable5 = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable5, "get(RoomEventKey.RESET_ROOM)");
            o00000O.OooO00o(observable5, new OooOO0(mutableState), composerStartRestartGroup, 8);
            RoomGameConfig.Vote vote = (RoomGameConfig.Vote) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25037Oooo0oO, composerStartRestartGroup, 8).getValue();
            if (vote == null || vote.getStatus() != RoomVoteDialog.VoteStatus.Running.getValue()) {
                z = false;
            } else {
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24984OooOOO.f47445OooO0O0.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 342311323, true, new OooOO0O(mutableState, mixedRoomActivity)), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO0(i));
    }
}
