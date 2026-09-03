package p580o0oOoOo;

import Oooo000.o00oO0o;
import android.app.Activity;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.LiveRoomMemberUserRankModel;
import com.google.accompanist.pager.Pager;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o00000O.o0OoOo0;
import o00000O.oo0o0Oo;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o000O00;
import p027Oooo0o.o000;
import p027Oooo0o.o000O00O;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000O0O0;
import p031OoooO.o000Oo0;
import p031OoooO.o0OOO0o;
import p032OoooO0.oo000o;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0o;
import p257o00ooOO0.o0O0oo0o;
import p257o00ooOO0.o0OoO00O;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p507o0o00oOO.o0000O0;
import p530o0o0OOO.o00O;
import p577o0oOoOO0.o00OOO0O;
import p578o0oOoOOO.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0O00o0 f46571OooO00o = new oO0O00o0();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f46572Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f46574Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f46575Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00O00o0 o00o00o1, Integer num, int i) {
            super(2);
            this.f46574Oooo0oO = o00o00o1;
            this.f46575Oooo0oo = num;
            this.f46572Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO0OO(this.f46574Oooo0oO, this.f46575Oooo0oo, ooo00o, this.f46572Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f46577Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f46578Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, int i) {
            super(2);
            this.f46577Oooo0oO = z;
            this.f46578Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO00o(this.f46577Oooo0oO, ooo00o, this.f46578Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o000, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f46579Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> f46580Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f46581Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f46582Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(androidx.paging.compose.OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> oooO0OO, o0O00OO<Boolean> o0o00oo2, boolean z, int i) {
            super(1);
            this.f46580Oooo0o = oooO0OO;
            this.f46581Oooo0oO = o0o00oo2;
            this.f46582Oooo0oo = z;
            this.f46579Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000 o000Var) {
            o000 LazyColumn = o000Var;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyColumn.OooO0O0(null, null, o00O0000.OooO0O0(-1490560464, true, new oO0O00oO(this.f46581Oooo0oO, this.f46582Oooo0oo, this.f46579Oooo)));
            oO00000o oo00000o = oO00000o.f46464OooO00o;
            LazyColumn.OooO0O0(null, null, oO00000o.f46465OooO0O0);
            androidx.paging.compose.OooOO0.OooO0OO(LazyColumn, this.f46580Oooo0o, oO00000o.f46466OooO0OO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000O00O f46583Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f46585Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ androidx.paging.compose.OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> f46586Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46587OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f46588OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, androidx.paging.compose.OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> oooO0OO, o000O00O o000o00o2, o0O00OO<Boolean> o0o00oo2, int i) {
            super(2);
            this.f46585Oooo0oO = z;
            this.f46586Oooo0oo = oooO0OO;
            this.f46583Oooo = o000o00o2;
            this.f46588OoooO00 = o0o00oo2;
            this.f46587OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO0O0(this.f46585Oooo0oO, this.f46586Oooo0oo, this.f46583Oooo, this.f46588OoooO00, ooo00o, this.f46587OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f46589Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f46591Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f46592Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O00o0 o00o00o1, Integer num, int i) {
            super(2);
            this.f46591Oooo0oO = o00o00o1;
            this.f46592Oooo0oo = num;
            this.f46589Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO0OO(this.f46591Oooo0oO, this.f46592Oooo0oo, ooo00o, this.f46589Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f46593Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O f46595Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f46596Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46597OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f46598OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0O0O0O o0o0o0o, String str, boolean z, o00OOOO0 o00oooo1, int i) {
            super(2);
            this.f46595Oooo0oO = o0o0o0o;
            this.f46596Oooo0oo = str;
            this.f46593Oooo = z;
            this.f46598OoooO00 = o00oooo1;
            this.f46597OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO0Oo(this.f46595Oooo0oO, this.f46596Oooo0oo, this.f46593Oooo, this.f46598OoooO00, ooo00o, this.f46597OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f46599Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f46600Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f46601Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(CoroutineScope coroutineScope, o0O0O0O.OooOO0 oooOO1, int i) {
            super(0);
            this.f46599Oooo0o = coroutineScope;
            this.f46600Oooo0oO = oooOO1;
            this.f46601Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BuildersKt__Builders_commonKt.launch$default(this.f46599Oooo0o, null, null, new oO0O0O0o(this.f46600Oooo0oO, this.f46601Oooo0oo, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Activity f46602Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankModel.RankDataDTO f46603Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Activity activity, LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO) {
            super(0);
            this.f46602Oooo0o = activity;
            this.f46603Oooo0oO = rankDataDTO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Integer userId;
            Activity activity = this.f46602Oooo0o;
            if (activity != null) {
                LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO = this.f46603Oooo0oO;
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
                String strOooO0oo = null;
                if (rankDataDTO != null && (userId = rankDataDTO.getUserId()) != null) {
                    strOooO0oo = com.yalla.support.common.util.OooO.OooO0oo(userId, "");
                }
                UserInfoActivity.OooO00o.OooO0Oo(oooO00o, activity, strOooO0oo, false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ List<String> f46604Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f46606Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f46607Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f46608OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0O0O0O.OooOO0 f46609OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f46610OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o00O0O00 o00o0o01, o00OOOO0 o00oooo1, List<String> list, o0O0O0O.OooOO0 oooOO1, int i, int i2) {
            super(2);
            this.f46606Oooo0oO = o00o0o01;
            this.f46607Oooo0oo = o00oooo1;
            this.f46604Oooo = list;
            this.f46609OoooO00 = oooOO1;
            this.f46608OoooO0 = i;
            this.f46610OoooO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO0o0(this.f46606Oooo0oO, this.f46607Oooo0oo, this.f46604Oooo, this.f46609OoooO00, ooo00o, this.f46608OoooO0 | 1, this.f46610OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankModel.RankDataDTO f46612Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f46613Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO, int i) {
            super(2);
            this.f46612Oooo0oO = rankDataDTO;
            this.f46613Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO0o(this.f46612Oooo0oO, ooo00o, this.f46613Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankVM f46614Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM) {
            super(2);
            this.f46614Oooo0o = liveRoomMemberUserRankVM;
        }

        /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
        /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
        /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
        /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            boolean z;
            oOO00O composer = ooo00o;
            if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
                composer.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o00Oo00.OooO0o0(Unit.INSTANCE, new oOo0oooO(null), composer);
                Configuration configuration = (Configuration) composer.OooOO0o(o0O0O00.f6590OooO00o);
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                float f = 24;
                o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), configuration.screenHeightDp * 0.72f), o00O0O.OooO0o0(f, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12));
                o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
                long j = o00000O0.f32067OooO0o0;
                o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(o00oooo0OooO00o, j, o000O0Oo.f32099OooO00o);
                LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = this.f46614Oooo0o;
                composer.OooO0o0(733328855);
                o00OO0OO alignment = o00OO0O0.OooO00o.f4172OooO0O0;
                o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(alignment, false, composer);
                composer.OooO0o0(-1323940314);
                o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = androidx.compose.ui.platform.o000.f6356OooO0o0;
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                o0O0O0o0<LayoutDirection> o0o0o0o1 = androidx.compose.ui.platform.o000.f6360OooOO0O;
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o0O0O0o0<o00OOOOo> o0o0o0o2 = androidx.compose.ui.platform.o000.f6364OooOOOO;
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
                ?? r9 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
                oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r9);
                ?? r1 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
                oO00000o.OooO0O0(composer, oooO, r1);
                ?? r2 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
                oO00000o.OooO0O0(composer, layoutDirection, r2);
                ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-2137368960);
                composer.OooO0o0(-492369756);
                Object objOooO0o = composer.OooO0o();
                oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
                if (objOooO0o == c0323OooO00o) {
                    objOooO0o = o0OOO00.OooO0Oo(Boolean.TRUE);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
                float f2 = 52;
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.ic_room_dialog_member_user_rank, composer), null, BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), f2), j, o000O0Oo.f32099OooO00o), o00OO0O0.OooO00o.f4173OooO0OO, o0O0O00.OooOO0.OooO00o.f35242OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 27704, 96);
                composer.OooO0o0(-821439505);
                if (((Boolean) o0o00oo2.getValue()).booleanValue()) {
                    z = false;
                } else {
                    oO0O00o0 oo0o00o0 = oO0O00o0.f46571OooO00o;
                    o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13);
                    z = false;
                    oO0O00o0.OooO0oo(oo0o00o0, o00oooo0OooO, composer, 54, 0);
                }
                composer.Oooo0o0();
                o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.drawable.icv_arrow_back, composer);
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                long j2 = o0000O0.f41783o0000oOo;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment, "alignment");
                Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
                Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
                p028Oooo0o0.o00O00O other = new p028Oooo0o0.o00O00O(alignment, z);
                Intrinsics.checkNotNullParameter(other, "other");
                float f3 = 16;
                o0OOO0o.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0OO(o000O0o.OooO0O0(SizeKt.OooOO0(PaddingKt.OooO(other, f3, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12), f), false, false, null, oO0O0Oo0.f46628Oooo0o, 253), composer), j2, composer, 3128, 0);
                composer.OooO0o0(-492369756);
                Object objOooO0o2 = composer.OooO0o();
                if (objOooO0o2 == c0323OooO00o) {
                    objOooO0o2 = o0OOO00.OooO0Oo(Boolean.FALSE);
                    composer.Oooo00o(objOooO0o2);
                }
                composer.Oooo0o0();
                o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
                oO0O00o0 oo0o00o1 = oO0O00o0.f46571OooO00o;
                oO0O00o0.OooO0oO(oo0o00o1, o0o00oo3, composer, 54);
                o000OO0O o000oo0oOooO00o2 = o00000.OooO0O0.OooO00o(R.drawable.icv_doubt, composer);
                long j3 = o0000O0.f41785o0000oo0;
                o00OO0OO alignment2 = o00OO0O0.OooO00o.f4174OooO0Oo;
                Intrinsics.checkNotNullParameter(oooO00o, "<this>");
                Intrinsics.checkNotNullParameter(alignment2, "alignment");
                p028Oooo0o0.o00O00O other2 = new p028Oooo0o0.o00O00O(alignment2, false);
                Intrinsics.checkNotNullParameter(other2, "other");
                o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(PaddingKt.OooO(other2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 18, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 9), 20);
                composer.OooO0o0(1157296644);
                boolean zOooo0oo = composer.Oooo0oo(o0o00oo3);
                Object objOooO0o3 = composer.OooO0o();
                if (zOooo0oo || objOooO0o3 == c0323OooO00o) {
                    objOooO0o3 = new oOo0o0oO(o0o00oo3);
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                o0OOO0o.OooO00o(o000oo0oOooO00o2, null, o000O0o.OooO0O0(o00oooo0OooOO0, false, false, null, (Function0) objOooO0o3, 253), j3, composer, 3128, 0);
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
                o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
                LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
                o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
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
                ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r9, composer, oooO2, r1, composer, layoutDirection2, r2, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
                composer.OooO0o0(2058660585);
                composer.OooO0o0(-1163856341);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5743OooO00o;
                List<String> listListOf = CollectionsKt.listOf((Object[]) new String[]{o00000.OooO0OO.OooO00o(R.string.live_room_member_rank_weekly_title, composer), o00000.OooO0OO.OooO00o(R.string.live_room_member_rank_general_title, composer)});
                o0O0O0O.OooOO0 oooOO0OooO00o = o0O0O0O.OooOOO0.OooO00o(0, composer, 1);
                Integer numValueOf = Integer.valueOf(oooOO0OooO00o.OooO0o0());
                composer.OooO0o0(1157296644);
                boolean zOooo0oo2 = composer.Oooo0oo(oooOO0OooO00o);
                Object objOooO0o4 = composer.OooO0o();
                if (zOooo0oo2 || objOooO0o4 == c0323OooO00o) {
                    objOooO0o4 = new ooOOO0Oo(oooOO0OooO00o, null);
                    composer.Oooo00o(objOooO0o4);
                }
                composer.Oooo0o0();
                o00Oo00.OooO0o0(numValueOf, (Function2) objOooO0o4, composer);
                oo0o00o1.OooO0o0(columnScopeInstance, PaddingKt.OooO(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 8, 5), listListOf, oooOO0OooO00o, composer, 24630, 0);
                Pager.OooO00o(listListOf.size(), SizeKt.OooO0o(columnScopeInstance.OooO00o(oooO00o, true)), oooOO0OooO00o, false, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, null, null, false, o00O0000.OooO00o(composer, 1541210560, new oO0OO0O(liveRoomMemberUserRankVM, o0o00oo2)), composer, 0, 6, 1016);
                o00OO0O.OooOO0O.OooO00o(composer);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ LiveRoomMemberUserRankVM f46615Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(LiveRoomMemberUserRankVM liveRoomMemberUserRankVM) {
            super(0);
            this.f46615Oooo0o = liveRoomMemberUserRankVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f46615Oooo0o.clear();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f46617Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(int i) {
            super(2);
            this.f46617Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO0O00o0.this.OooO(ooo00o, this.f46617Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0oO(oO0O00o0 oo0o00o0, o0O00OO o0o00oo2, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00o2;
        Objects.requireNonNull(oo0o00o0);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-910584448);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o0o00oo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
            ooo00o2 = ooo00oOooOOo;
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00o2 = ooo00oOooOOo;
            o0O0oo0o.OooO0Oo(o0o00oo2, o00000.OooO0OO.OooO00o(R.string.Rules, ooo00oOooOOo), o00000.OooO0OO.OooO00o(R.string.live_room_member_user_rank_rules, ooo00oOooOOo), null, true, false, null, null, null, false, null, false, null, null, false, null, null, null, null, ooo00o2, (i2 & 14) | 24576, 0, 524264);
        }
        oo0ooO oo0oooOooOo = ooo00o2.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO0O0(oo0o00o0, o0o00oo2, i));
    }

    public static final void OooO0oo(oO0O00o0 oo0o00o0, o00OOOO0 other, oOO00O ooo00o, int i, int i2) {
        int i3;
        Objects.requireNonNull(oo0o00o0);
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-924613118);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (ooo00oOooOOo.Oooo0oo(other) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            if (i4 != 0) {
                other = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.ic_room_dialog_member_user_rank, ooo00oOooOOo);
            o0O0O00.OooOO0.OooO00o.OooO0o oooO0o = o0O0O00.OooOO0.OooO00o.f35242OooO0o0;
            o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4170OooO;
            Intrinsics.checkNotNullParameter(other, "other");
            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, SizeKt.OooO0oO(SizeKt.OooO0o(other), (float) 82.2806429572469d), o00oo0oo, oooO0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 27704, 96);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oO0O0O00(oo0o00o0, other, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(@Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1817597327);
        if ((i & 1) == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            ooo00oOooOOo.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(LiveRoomMemberUserRankVM.class, current, null, null, defaultViewModelCreationExtras, ooo00oOooOOo, 36936, 0);
            ooo00oOooOOo.Oooo0o0();
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = (LiveRoomMemberUserRankVM) viewModel;
            o00O o00o2 = o00O.f43140OooO00o;
            o0OoO00O.OooO00o(o00O.f43158OooOo, false, false, null, new OooOo00(liveRoomMemberUserRankVM), 80, R.style.WindowAnimBottomWithAlpha, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00O0000.OooO00o(ooo00oOooOOo, 100612607, new OooOo(liveRoomMemberUserRankVM)), ooo00oOooOOo, 100663296, 142);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new Oooo000(i));
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(boolean z, @Nullable oOO00O ooo00o, int i) {
        int i2;
        int i3;
        oOO00O composer = ooo00o.OooOOo(-1930767137);
        if ((i & 14) == 0) {
            i2 = (composer.OooO0OO(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = androidx.compose.ui.platform.o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = androidx.compose.ui.platform.o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = androidx.compose.ui.platform.o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o);
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
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r4);
            ?? r5 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r5);
            ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(oooO00o);
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
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r3, composer, oooO2, r4, composer, layoutDirection2, r5, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-678309503);
            float f = 24;
            float f2 = 16;
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(z ? R.mipmap.ic_member_rank_weekly_list : R.mipmap.ic_member_rank_general_list, composer), null, SizeKt.OooOO0(PaddingKt.OooO0oo(oooO00o, f, f2, 14, 12), 60), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
            if (z) {
                composer.OooO0o0(918450100);
                i3 = R.string.live_room_member_rank_weekly_description;
            } else {
                composer.OooO0o0(918450171);
                i3 = R.string.live_room_member_rank_general_description;
            }
            String strOooO00o = o00000.OooO0OO.OooO00o(i3, composer);
            composer.Oooo0o0();
            long jOooO0OO = o00000OO.OooO0OO(4287839499L);
            long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(12, composer);
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            o0O000O o0o000o = new o0O000O(true);
            oooO00o.OooOOoo(o0o000o);
            o000O0O0.OooO0OO(strOooO00o, PaddingKt.OooO(o0o000o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), jOooO0OO, jOooO00o, null, null, null, 0L, null, null, 0L, 0, false, 0, null, new oo0o0Oo(0L, new o0OoOo0(), 786431), composer, 384, 0, 32752);
            o0O0OO0.OooO00o(composer);
            o0000oo.OooO0OO((float) 0.5d, BackgroundKt.OooO0O0(PaddingKt.OooO0oO(SizeKt.OooO0o(oooO00o), f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), o00000OO.OooO0OO(4293585642L), o000O0Oo.f32099OooO00o), composer, 6, 0);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(z, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(boolean z, @NotNull androidx.paging.compose.OooO0OO<LiveRoomMemberUserRankModel.RankDataDTO> lazyPagingItems, @NotNull o000O00O lazyListState, @NotNull o0O00OO<Boolean> topBgBottomVisibleInHeadView, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(lazyPagingItems, "lazyPagingItems");
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(topBgBottomVisibleInHeadView, "topBgBottomVisibleInHeadView");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-191834212);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.OooO0OO(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(lazyPagingItems) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(lazyListState) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(topBgBottomVisibleInHeadView) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
        }
        if ((i2 & 5851) == 1170 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            p027Oooo0o.Oooo000.OooO00o(SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o), lazyListState, null, false, null, null, null, false, new OooO0O0(lazyPagingItems, topBgBottomVisibleInHeadView, z, i2), ooo00oOooOOo, ((i2 >> 3) & 112) | 6, 252);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0OO(z, lazyPagingItems, lazyListState, topBgBottomVisibleInHeadView, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(@NotNull o00O00o0 o00o00o1, @Nullable Integer num, @Nullable oOO00O ooo00o, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(o00o00o1, "<this>");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-144786799);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(o00o00o1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.Oooo0oo(num) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if ((num != null ? num.intValue() : -1) < 0) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO0o(o00o00o1, num, i));
                return;
            }
            Intrinsics.checkNotNull(num);
            if (num.intValue() <= 3) {
                ooo00oOooOOo.OooO0o0(-1099618588);
                p577o0oOoOO0.o00OOOOo.OooO00o(o00o00o1, num.intValue(), ooo00oOooOOo, (i2 & 112) | (i2 & 14));
                ooo00oOooOOo.Oooo0o0();
            } else {
                ooo00oOooOOo.OooO0o0(-1099618529);
                p577o0oOoOO0.o00OOOO0.f45752OooO00o.OooO0O0(o00o00o1, num.toString(), ooo00oOooOOo, (i2 & 14) | 384);
                ooo00oOooOOo.Oooo0o0();
            }
        }
        oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooO(o00o00o1, num, i));
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(o0O0O0O o0o0o0o, String str, boolean z, o00OOOO0 o00oooo1, oOO00O ooo00o, int i) {
        int i2;
        oOO00O composer = ooo00o.OooOOo(262594587);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(o0o0o0o) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.Oooo0oo(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composer.OooO0OO(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composer.Oooo0oo(o00oooo1) ? RecyclerView.oo0o0Oo.FLAG_MOVED : 1024;
        }
        if ((i2 & 5851) == 1170 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00OOOO0 o00oooo0OooO00o = o0o0o0o.OooO00o(p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooO0Oo(o00OOOO0.OooO00o.f4198Oooo0o), o00O0O.f3431OooO00o), true);
            o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
            o00OOOO0 o00oooo0OooOOoo = BackgroundKt.OooO0O0(o00oooo0OooO00o, z ? o00000O0.f32067OooO0o0 : o00000O0.f32069OooO0oo, o000O0Oo.f32099OooO00o).OooOOoo(o00oooo1);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            Oooo0o0.o00O000.OooO0O0 oooO0O0 = p028Oooo0o0.o00O000.f2033OooO0o;
            o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4184OooOOOO;
            composer.OooO0o0(-483455358);
            o000000 o000000VarOooO00o = oo00o.OooO00o(oooO0O0, oooO00o2, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooOOoo);
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
            o000O0O0.OooO0OO(str, null, o00000OO.OooO0OO(4287839499L), p617o0oo0o.o00Oo0.OooO00o(14, composer), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, new oo0o0Oo(0L, new o0OoOo0(), 786431), composer, (i2 >> 3) & 14, 0, 32242);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOO0(o0o0o0o, str, z, o00oooo1, i));
    }

    /* JADX WARN: Type inference failed for: r20v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(@Nullable LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO, @Nullable oOO00O ooo00o, int i) {
        String nickName;
        Long friendShip;
        Boolean isTopRank;
        oOO00O composer = ooo00o.OooOOo(330047797);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Object objOooOO0o = composer.OooOO0o(o0O0O00.f6593OooO0Oo);
        Activity activity = objOooOO0o instanceof Activity ? (Activity) objOooOO0o : null;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 60), false, false, null, new OooOOO(activity, rankDataDTO), KotlinVersion.MAX_COMPONENT_VALUE);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = androidx.compose.ui.platform.o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = androidx.compose.ui.platform.o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = androidx.compose.ui.platform.o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0O0);
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
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r2);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r20 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(oooO00o, 56);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Oo0.OooO0O0(o00oooo0OooOO0o);
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
        ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO0Oo, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        f46571OooO00o.OooO0OO(BoxScopeInstance.f5741OooO00o, rankDataDTO != null ? rankDataDTO.getRank() : null, composer, 390);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oO0O000.f45783OooO00o.OooO0Oo(rankDataDTO != null ? rankDataDTO.getHeadUrl() : null, p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(oooO00o, 36), o00O0O.f3431OooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, false, composer, 196608, 28);
        o0000oo.OooO0O0(6, null, composer, 6, 2);
        o00OOOO0 o00oooo0OooO00o = rowScopeInstance.OooO00o(oooO00o, true);
        composer.OooO0o0(693286680);
        o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o00Oo0.OooO0O0(o00oooo0OooO00o);
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
        ((o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO3, r3, composer, layoutDirection3, r4, composer, o00ooooo4, r20, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        if (rankDataDTO == null || (nickName = rankDataDTO.getNickName()) == null) {
            nickName = "";
        }
        o000O0O0.OooO0OO(nickName, rowScopeInstance.OooO00o(oooO00o, false), u.OooO0O0(composer).OooO0oO(), p617o0oo0o.o00Oo0.OooO00o(16, composer), null, null, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 0, 3120, 55280);
        o0000oo.OooO0O0(8, null, composer, 6, 2);
        o00OOO0O.f45713OooO00o.OooO00o(rankDataDTO != null ? rankDataDTO.getMemberLv() : null, rankDataDTO != null ? rankDataDTO.getBadgeUrl() : null, 0L, (rankDataDTO == null || (isTopRank = rankDataDTO.getIsTopRank()) == null) ? false : isTopRank.booleanValue(), SizeKt.OooOO0(oooO00o, 20), composer, 221184, 4);
        o0O0OO0.OooO00o(composer);
        String strOooO0o = p168o00Ooo0.o0O0O00.OooO0o((rankDataDTO == null || (friendShip = rankDataDTO.getFriendShip()) == null) ? 0L : friendShip.longValue());
        long jOooO0oO = u.OooO0O0(composer).OooO0oO();
        long jOooO00o = p617o0oo0o.o00Oo0.OooO00o(16, composer);
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, 26, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatFriendShipNumberTo…t(item?.friendShip ?: 0L)");
        o000O0O0.OooO0OO(strOooO0o, o00oooo0OooO, jOooO0oO, jOooO00o, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 48, 0, 65520);
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooOOOO(rankDataDTO, i));
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(@NotNull o00O0O00 o00o0o01, @Nullable o00OOOO0 o00oooo1, @NotNull List<String> pages, @NotNull o0O0O0O.OooOO0 pagerState, @Nullable oOO00O ooo00o, int i, int i2) {
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        oOO00O composer = ooo00o.OooOOo(-643790358);
        o00OOOO0 other = (i2 & 1) != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        Object objOooO0O0 = o000O00.OooO0O0(composer, 773894976, -492369756);
        if (objOooO0O0 == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0O0 = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.Oooo0o0();
        CoroutineScope coroutineScope = ((p100o000oOoO.o00OO0OO) objOooO0O0).f29498Oooo0o;
        composer.Oooo0o0();
        Intrinsics.checkNotNullParameter(other, "other");
        o00OOOO0 o00oooo0OooO0o0 = PaddingKt.OooO0o0(BackgroundKt.OooO0O0(p442o0OoOo0.Oooo000.OooO00o(o00o0o01.OooO0O0(SizeKt.OooO0oO(SizeKt.OooOO0o(other, 234), 32), o00OO0O0.OooO00o.f4184OooOOOO), o00O0O.f3431OooO00o), o00000OO.OooO0OO(4294960323L), o000O0Oo.f32099OooO00o), 2);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(androidx.compose.ui.platform.o000.f6356OooO0o0);
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(androidx.compose.ui.platform.o000.f6360OooOO0O);
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(androidx.compose.ui.platform.o000.f6364OooOOOO);
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
        composer.OooO0o0(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.f5758OooO00o;
        int i3 = 0;
        for (Object obj : pages) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            f46571OooO00o.OooO0Oo(rowScopeInstance, (String) obj, pagerState.OooO0o0() == i3, o000O0o.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, false, false, null, new OooOO0O(coroutineScope, pagerState, i3), 253), composer, 24582);
            i3 = i4;
        }
        o0O0OO0.OooO00o(composer);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO0(o00o0o01, other, pages, pagerState, i, i2));
    }
}
