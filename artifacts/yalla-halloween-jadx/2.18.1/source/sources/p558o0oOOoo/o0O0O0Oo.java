package p558o0oOOoo;

import Oooo000.o000000;
import Oooo000.o00Oo0;
import Oooo000.o00Ooo;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.framework.view.marqueeText.MarqueeText;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteModel;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.dialog.RoomVoteDialog;
import com.yalla.yalla.ui.view.materialdesign.MaxHeightLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p044OooooOO.o00O00O;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p159o00OoOO.o000O00O;
import p175o00OooOo.o0oO0O0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p391o0OOooOo.o0O00000;
import p510o0o00oo0.o0O00o00;
import p522o0o0O0o.o000O0Oo;
import p522o0o0O0o.o00O000o;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.j0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0Oo f44793OooO00o = new o0O0O0Oo();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44795Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f44795Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0O0Oo.this.OooO00o(ooo00o, this.f44795Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<RoomVoteDialog> f44796Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O00OO<RoomVoteDialog> o0o00oo2) {
            super(1);
            this.f44796Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0O0oo0o(this.f44796Oooo0o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<RoomVoteDialog> f44797Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O00OO<RoomVoteDialog> o0o00oo2) {
            super(1);
            this.f44797Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            RoomVoteDialog value = this.f44797Oooo0o.getValue();
            if (value != null) {
                value.OooOO0O();
            }
            this.f44797Oooo0o.setValue(null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o00Ooo, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<RoomVoteDialog> f44798Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44799Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0O00OO<RoomVoteDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f44798Oooo0o = o0o00oo2;
            this.f44799Oooo0oO = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o00Ooo o00ooo2, oOO00O ooo00o, Integer num) {
            o00Ooo AnimatedVisibility = o00ooo2;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O00o00.OooO00o(o000O0o.OooO0O0(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, false, false, null, new o0O0OO0(this.f44798Oooo0o, this.f44799Oooo0oO), 253), Integer.valueOf(R.drawable.room_side_vote_game), null, o000O0O0.OooO0OO(R.string.room_vote_game_page_title), null, 44, null, false, ooo00o, 196608, 212);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44801Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f44801Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0O0Oo.this.OooO00o(ooo00o, this.f44801Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<VoteDetailModel, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<RoomVoteDialog> f44802Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O00OO<RoomVoteDialog> o0o00oo2) {
            super(1);
            this.f44802Oooo0o = o0o00oo2;
        }

        /* JADX WARN: Code duplicated, block: B:69:0x026e  */
        /* JADX WARN: Instruction removed from duplicated block: B:69:0x026e, please report this as an issue */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VoteDetailModel voteDetailModel) {
            RoomVoteDialog value;
            String strOooO0OO;
            String str;
            String str2;
            int i;
            int i2;
            VoteDetailModel model = voteDetailModel;
            if (model != null && (value = this.f44802Oooo0o.getValue()) != null) {
                Intrinsics.checkNotNullParameter(model, "model");
                VoteModel voteActivity = model.getVoteActivity();
                if (voteActivity != null) {
                    VoteModel voteActivity2 = model.getVoteActivity();
                    String str3 = "";
                    if (voteActivity2 == null || (strOooO0OO = voteActivity2.getTitle()) == null) {
                        strOooO0OO = "";
                    }
                    MarqueeText marqueeText = value.f23776OoooOO0.f50616OooOO0O;
                    if (!(strOooO0OO.length() > 0)) {
                        strOooO0OO = o000O0O0.OooO0OO(R.string.room_vote_game_page_title);
                    }
                    marqueeText.setText(strOooO0OO);
                    if (voteActivity.getStatus() == RoomVoteDialog.VoteStatus.Running.getValue()) {
                        value.f23777OoooOOO = true;
                        LinearLayoutCompat linearLayoutCompat = value.f23776OoooOO0.f50610OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.llBottom1");
                        p254o00ooO0O.oOO00O.OooO(linearLayoutCompat);
                        LinearLayoutCompat linearLayoutCompat2 = value.f23776OoooOO0.f50612OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.llBottom2");
                        p254o00ooO0O.oOO00O.OooO00o(linearLayoutCompat2);
                        ImageView imageView = value.f23776OoooOO0.f50609OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivVoteRules");
                        p254o00ooO0O.oOO00O.OooO(imageView);
                        value.OooO0o(true);
                        value.OooOO0o(false);
                        if (model.getIsHasStop()) {
                            TextView textView = value.f23776OoooOO0.f50614OooO0oo;
                            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvEndVote");
                            p254o00ooO0O.oOO00O.OooO(textView);
                        } else {
                            TextView textView2 = value.f23776OoooOO0.f50614OooO0oo;
                            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvEndVote");
                            p254o00ooO0O.oOO00O.OooO00o(textView2);
                        }
                        if (model.getIsHasStop()) {
                            i = o000O0Oo.f42986OooO0O0;
                            i2 = 316;
                        } else {
                            i = o000O0Oo.f42986OooO0O0;
                            i2 = 260;
                        }
                        int iOooO00o = (i - OooOo00.OooO00o(i2)) - o000O0Oo.OooO0O0();
                        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager = value.f23779OoooOo0;
                        if (maxHeightLinearLayoutManager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                            maxHeightLinearLayoutManager = null;
                        }
                        float f = 352;
                        if (iOooO00o > OooOo00.OooO00o(f)) {
                            iOooO00o = OooOo00.OooO00o(f);
                        }
                        maxHeightLinearLayoutManager.f25237Oooo0o = iOooO00o;
                        value.f23776OoooOO0.f50615OooOO0.setText(o000O0O0.OooO0OO(R.string.room_vote_game_my_votes) + ' ' + model.getCurrentUserVoteCount());
                        value.f23776OoooOO0.f50608OooO0O0.setImageResource(R.drawable.room_vote_game_pack_up);
                        if (value.f23780OoooOoO == null) {
                            if (voteActivity.getIsUnLimit()) {
                                value.f23776OoooOO0.f50617OooOO0o.setText(o000O0O0.OooO0OO(R.string.room_vote_game_end_ongoing) + ' ' + value.OooOOO0((voteActivity.getCurrentTime() - voteActivity.getStartTime()) * ((long) 1000), true));
                            } else {
                                value.f23776OoooOO0.f50617OooOO0o.setText(o000O0O0.OooO0OO(R.string.room_vote_game_end_in) + ' ' + value.OooOOO0((voteActivity.getPreEndTime() - voteActivity.getCurrentTime()) * ((long) 1000), false));
                            }
                            value.f23780OoooOoO = new j0(voteActivity.getIsUnLimit() ? ((long) 86400000) - ((voteActivity.getCurrentTime() - voteActivity.getStartTime()) * ((long) 1000)) : (voteActivity.getPreEndTime() - voteActivity.getCurrentTime()) * ((long) 1000), value, voteActivity).start();
                        }
                    } else {
                        if (value.f23782Ooooo00) {
                            value.f23782Ooooo00 = false;
                            o0O00000.OooO0OO("InRoom_poll_end_success");
                        }
                        value.f23777OoooOOO = false;
                        LinearLayoutCompat linearLayoutCompat3 = value.f23776OoooOO0.f50610OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "binding.llBottom1");
                        p254o00ooO0O.oOO00O.OooO00o(linearLayoutCompat3);
                        TextView textView3 = value.f23776OoooOO0.f50614OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvEndVote");
                        p254o00ooO0O.oOO00O.OooO00o(textView3);
                        LinearLayoutCompat linearLayoutCompat4 = value.f23776OoooOO0.f50612OooO0o0;
                        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "binding.llBottom2");
                        p254o00ooO0O.oOO00O.OooO(linearLayoutCompat4);
                        ImageView imageView2 = value.f23776OoooOO0.f50609OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivVoteRules");
                        p254o00ooO0O.oOO00O.OooO00o(imageView2);
                        value.OooO0o(false);
                        int iOooO00o2 = (o000O0Oo.f42986OooO0O0 - OooOo00.OooO00o(319)) - o000O0Oo.OooO0O0();
                        MaxHeightLinearLayoutManager maxHeightLinearLayoutManager2 = value.f23779OoooOo0;
                        if (maxHeightLinearLayoutManager2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                            maxHeightLinearLayoutManager2 = null;
                        }
                        float f2 = 352;
                        if (iOooO00o2 > OooOo00.OooO00o(f2)) {
                            iOooO00o2 = OooOo00.OooO00o(f2);
                        }
                        maxHeightLinearLayoutManager2.f25237Oooo0o = iOooO00o2;
                        value.OooOO0O();
                        value.f23776OoooOO0.f50608OooO0O0.setImageResource(R.drawable.btn_header_close);
                        TextView textView4 = value.f23776OoooOO0.f50606OooO;
                        StringBuilder sb = new StringBuilder();
                        sb.append(o000O0O0.OooO0OO(R.string.room_vote_game_duration));
                        sb.append(": ");
                        long j = 1000;
                        long endTime = ((voteActivity.getEndTime() - voteActivity.getStartTime()) * j) / j;
                        long j2 = 60;
                        long j3 = endTime / j2;
                        long j4 = j3 / j2;
                        long j5 = j3 % j2;
                        long j6 = endTime % j2;
                        if (j4 > 0) {
                            str = j4 + o000O0O0.OooO0OO(R.string.room_vote_game_hour) + ' ';
                        } else {
                            str = "";
                        }
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(str);
                        if (j5 > 0) {
                            str2 = j5 + o000O0O0.OooO0OO(R.string.room_vote_game_minute) + ' ';
                        } else {
                            if (str.length() > 0) {
                                str2 = j5 + o000O0O0.OooO0OO(R.string.room_vote_game_minute) + ' ';
                            } else {
                                str2 = "";
                            }
                        }
                        sbOooO0o0.append(str2);
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(sbOooO0o0.toString());
                        if (j6 > 0) {
                            str3 = j6 + o000O0O0.OooO0OO(R.string.room_vote_game_second) + ' ';
                        }
                        sbOooO0o1.append(str3);
                        sb.append(sbOooO0o1.toString());
                        textView4.setText(sb.toString());
                        value.OooOO0o(true);
                    }
                }
                p188o00o00o0.OooO0OO<VoteRankModel> oooO0OO = value.f23783o000oOoO;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO = null;
                }
                oooO0OO.setNewData(model.getRank());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<VoteDetailModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<RoomVoteDialog> f44803Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0O00OO<RoomVoteDialog> o0o00oo2) {
            super(1);
            this.f44803Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<VoteDetailModel> apiResult) {
            VoteModel voteActivity;
            ApiResult<VoteDetailModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomGameConfig.Vote value = o00OO00O.f43313OooooOo.OooO00o().f43362OoooOOO.getValue();
            if (value != null) {
                VoteDetailModel data = it.getData();
                value.setStatus((data == null || (voteActivity = data.getVoteActivity()) == null) ? RoomVoteDialog.VoteStatus.Running.getValue() : voteActivity.getStatus());
            }
            RoomVoteDialog value2 = this.f44803Oooo0o.getValue();
            if (value2 != null) {
                p188o00o00o0.OooO0OO<VoteRankModel> oooO0OO = value2.f23783o000oOoO;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO = null;
                }
                oooO0OO.setLoadComplete();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f44804Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O o00o2 = o00O.f43140OooO00o;
            o00O.f43186OoooOOO.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static void OooO0OO(o0O00OO o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        o0O0O0Oo o0o0o0oo = f44793OooO00o;
        RoomGameConfig.Vote value = o00OO00O.f43313OooooOo.OooO00o().f43362OoooOOO.getValue();
        o0o0o0oo.OooO0O0(value != null ? value.getVoteId() : 0L, o0o00oo2, mixedRoomActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1226690419);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
            final MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            if (mixedRoomActivity == null) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO(i));
                return;
            }
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            final o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            Unit unit = Unit.INSTANCE;
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new OooO00o(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            boolean z = false;
            o00Oo00.OooO0O0(unit, (Function1) objOooO0o2, ooo00oOooOOo);
            Observable<Object> observable = LiveEventBus.get("INITIATE_VOTE_REQUEST");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.INITIATE_VOTE_REQUEST)");
            o00O000o.OooO00o(observable, new Observer() { // from class: o0oOOoo.o0oO0O0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00OO<RoomVoteDialog> voteDialog = o0o00oo2;
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    if (obj instanceof Room.InitiateVoteReply) {
                        o0O0O0Oo o0o0o0oo = o0O0O0Oo.f44793OooO00o;
                        o0o0o0oo.OooO0Oo(voteDialog, activity);
                        o0o0o0oo.OooO0O0(((Room.InitiateVoteReply) obj).getVoteId(), voteDialog, activity);
                    }
                }
            }, ooo00oOooOOo, 72);
            Observable<Object> observable2 = LiveEventBus.get("END_UP_VOTE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable2, "get(EventKey.END_UP_VOTE_GAME)");
            o00O000o.OooO00o(observable2, new o0O00oO0(o0o00oo2, mixedRoomActivity, 0), ooo00oOooOOo, 72);
            Observable<Object> observable3 = LiveEventBus.get("UPDATE_VOTE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable3, "get(EventKey.UPDATE_VOTE_GAME)");
            o00O000o.OooO00o(observable3, new Observer() { // from class: o0oOOoo.o0O0O0O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    o0O00OO voteDialog = o0o00oo2;
                    MixedRoomActivity activity = mixedRoomActivity;
                    Intrinsics.checkNotNullParameter(voteDialog, "$voteDialog");
                    Intrinsics.checkNotNullParameter(activity, "$activity");
                    if ((obj instanceof Long) && Intrinsics.areEqual(obj, Long.valueOf(o000O00O.OooO().f32429Oooo0oO.getId()))) {
                        o0O0O0Oo.OooO0OO(voteDialog, activity);
                    }
                }
            }, ooo00oOooOOo, 72);
            Observable<Object> observable4 = LiveEventBus.get("PARTICIPATE_IN_THE_GAME");
            Intrinsics.checkNotNullExpressionValue(observable4, "get(EventKey.PARTICIPATE_IN_THE_GAME)");
            o00O000o.OooO00o(observable4, new o0oO0O0o(o0o00oo2, mixedRoomActivity, 1), ooo00oOooOOo, 72);
            Observable<Object> observable5 = LiveEventBus.get("RESET_ROOM");
            Intrinsics.checkNotNullExpressionValue(observable5, "get(RoomEventKey.RESET_ROOM)");
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(o0o00oo2);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = new OooO0O0(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            o00O000o.OooO00o(observable5, new p044OooooOO.o00O000((Function1) objOooO0o3, 5), ooo00oOooOOo, 72);
            RoomGameConfig.Vote vote = (RoomGameConfig.Vote) o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43362OoooOOO, ooo00oOooOOo).getValue();
            if (vote != null && vote.getStatus() == RoomVoteDialog.VoteStatus.Running.getValue()) {
                o00O o00o2 = o00O.f43140OooO00o;
                if (!((Boolean) o00O.f43186OoooOOO.getValue()).booleanValue()) {
                    z = true;
                }
            }
            o00Oo0.OooO0Oo(z, null, o000000.OooO0Oo(null, 3).OooO0O0(o000000.OooO0OO()), o000000.OooO0o0(null, 3).OooO0O0(o000000.OooO0oo()), null, o00O0000.OooO00o(ooo00oOooOOo, 342311323, new OooO0OO(o0o00oo2, mixedRoomActivity)), ooo00oOooOOo, 200064, 18);
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO0o(i));
    }

    public final void OooO0O0(long j, o0O00OO<RoomVoteDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        if (value == null) {
            value = 0L;
        }
        long jLongValue = value.longValue();
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new p520o0o0O0O0.o00Oo00(mutableLiveData, jLongValue, j, null), 3, null);
        mutableLiveData.observe(mixedRoomActivity, new OooOo(new OooOO0(o0o00oo2), null, new OooOO0O(o0o00oo2), false, 10));
    }

    public final void OooO0Oo(o0O00OO<RoomVoteDialog> o0o00oo2, MixedRoomActivity mixedRoomActivity) {
        if (o0o00oo2.getValue() == null) {
            o0o00oo2.setValue(new RoomVoteDialog(mixedRoomActivity, OooOOO0.f44804Oooo0o));
        }
        o00O o00o2 = o00O.f43140OooO00o;
        o00O.f43186OoooOOO.setValue(Boolean.TRUE);
        RoomVoteDialog value = o0o00oo2.getValue();
        if (value != null) {
            value.OooOO0();
        }
    }
}
