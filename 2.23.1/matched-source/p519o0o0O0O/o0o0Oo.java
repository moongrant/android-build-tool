package p519o0o0O0O;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.event.EventState;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentImageModel;
import com.yalla.yalla.model.moment.MomentPoll;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendContentTopicModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendShareModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O000o;
import p211o00o0oo0.o000OOo0;
import p444o0OoOo0O.o000;
import p450o0OoOoo.o00O0OOO;
import p477o0Ooooo0.o0O0o;
import p559o0oOOoo0.o0O000;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.oo0o0Oo;
import p568o0oOo0OO.o0O0O0o0;
import p587o0oOooO.oO0OOo0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendShare.kt\ncom/yalla/yalla/ui/composable/moment/MomentSendShare\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,661:1\n154#2:662\n154#2:663\n154#2:726\n154#2:727\n154#2:763\n154#2:764\n154#2:765\n154#2:801\n154#2:802\n154#2:808\n154#2:853\n154#2:854\n154#2:890\n154#2:891\n154#2:892\n154#2:928\n154#2:929\n154#2:930\n154#2:931\n154#2:967\n154#2:968\n154#2:979\n154#2:1015\n154#2:1016\n154#2:1052\n154#2:1053\n154#2:1059\n154#2:1095\n154#2:1096\n66#3,6:664\n72#3:698\n76#3:703\n66#3,6:766\n72#3:800\n76#3:807\n66#3,6:893\n72#3:927\n76#3:978\n66#3,6:980\n72#3:1014\n76#3:1106\n78#4,11:670\n91#4:702\n78#4,11:734\n78#4,11:772\n91#4:806\n78#4,11:814\n91#4:846\n91#4:851\n78#4,11:861\n78#4,11:899\n78#4,11:938\n91#4:972\n91#4:977\n78#4,11:986\n78#4,11:1023\n91#4:1057\n78#4,11:1066\n91#4:1100\n91#4:1105\n91#4:1110\n456#5,8:681\n464#5,3:695\n467#5,3:699\n25#5:704\n25#5:711\n25#5:718\n456#5,8:745\n464#5,3:759\n456#5,8:783\n464#5,3:797\n467#5,3:803\n456#5,8:825\n464#5,3:839\n467#5,3:843\n467#5,3:848\n456#5,8:872\n464#5,3:886\n456#5,8:910\n464#5,3:924\n456#5,8:949\n464#5,3:963\n467#5,3:969\n467#5,3:974\n456#5,8:997\n464#5,3:1011\n456#5,8:1034\n464#5,3:1048\n467#5,3:1054\n456#5,8:1077\n464#5,3:1091\n467#5,3:1097\n467#5,3:1102\n467#5,3:1107\n4144#6,6:689\n4144#6,6:753\n4144#6,6:791\n4144#6,6:833\n4144#6,6:880\n4144#6,6:918\n4144#6,6:957\n4144#6,6:1005\n4144#6,6:1042\n4144#6,6:1085\n1097#7,6:705\n1097#7,6:712\n1097#7,6:719\n76#8:725\n73#9,6:728\n79#9:762\n83#9:852\n73#9,6:855\n79#9:889\n73#9,6:932\n79#9:966\n83#9:973\n73#9,6:1017\n79#9:1051\n83#9:1058\n73#9,6:1060\n79#9:1094\n83#9:1101\n83#9:1111\n73#10,5:809\n78#10:842\n82#10:847\n81#11:1112\n81#11:1113\n81#11:1114\n*S KotlinDebug\n*F\n+ 1 MomentSendShare.kt\ncom/yalla/yalla/ui/composable/moment/MomentSendShare\n*L\n77#1:662\n79#1:663\n446#1:726\n447#1:727\n453#1:763\n457#1:764\n458#1:765\n466#1:801\n475#1:802\n484#1:808\n532#1:853\n533#1:854\n539#1:890\n543#1:891\n544#1:892\n552#1:928\n560#1:929\n563#1:930\n566#1:931\n573#1:967\n582#1:968\n593#1:979\n605#1:1015\n614#1:1016\n620#1:1052\n629#1:1053\n638#1:1059\n644#1:1095\n653#1:1096\n75#1:664,6\n75#1:698\n75#1:703\n455#1:766,6\n455#1:800\n455#1:807\n541#1:893,6\n541#1:927\n541#1:978\n589#1:980,6\n589#1:1014\n589#1:1106\n75#1:670,11\n75#1:702\n443#1:734,11\n455#1:772,11\n455#1:806\n481#1:814,11\n481#1:846\n443#1:851\n529#1:861,11\n541#1:899,11\n555#1:938,11\n555#1:972\n541#1:977\n589#1:986,11\n609#1:1023,11\n609#1:1057\n633#1:1066,11\n633#1:1100\n589#1:1105\n529#1:1110\n75#1:681,8\n75#1:695,3\n75#1:699,3\n133#1:704\n136#1:711\n145#1:718\n443#1:745,8\n443#1:759,3\n455#1:783,8\n455#1:797,3\n455#1:803,3\n481#1:825,8\n481#1:839,3\n481#1:843,3\n443#1:848,3\n529#1:872,8\n529#1:886,3\n541#1:910,8\n541#1:924,3\n555#1:949,8\n555#1:963,3\n555#1:969,3\n541#1:974,3\n589#1:997,8\n589#1:1011,3\n609#1:1034,8\n609#1:1048,3\n609#1:1054,3\n633#1:1077,8\n633#1:1091,3\n633#1:1097,3\n589#1:1102,3\n529#1:1107,3\n75#1:689,6\n443#1:753,6\n455#1:791,6\n481#1:833,6\n529#1:880,6\n541#1:918,6\n555#1:957,6\n589#1:1005,6\n609#1:1042,6\n633#1:1085,6\n133#1:705,6\n136#1:712,6\n145#1:719,6\n203#1:725\n443#1:728,6\n443#1:762\n443#1:852\n529#1:855,6\n529#1:889\n555#1:932,6\n555#1:966\n555#1:973\n609#1:1017,6\n609#1:1051\n609#1:1058\n633#1:1060,6\n633#1:1094\n633#1:1101\n529#1:1111\n481#1:809,5\n481#1:842\n481#1:847\n133#1:1112\n136#1:1113\n145#1:1114\n*E\n"})
public final class o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0o0Oo f52568OooO00o = new o0o0Oo();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52570OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52571OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52572OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentSendModel momentSendModel, Function0<Unit> function0, int i) {
            super(2);
            this.f52571OooO0o0 = momentSendModel;
            this.f52570OooO0o = function0;
            this.f52572OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52572OooO0oO | 1);
            MomentSendModel momentSendModel = this.f52571OooO0o0;
            Function0<Unit> function0 = this.f52570OooO0o;
            o0o0Oo.this.OooO0Oo(momentSendModel, function0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52573OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52575OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendShareModel f52576OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f52577OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52578OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentSendShareModel momentSendShareModel, MomentSendModel momentSendModel, EditTextSpan editTextSpan, Function0<Unit> function0, int i) {
            super(2);
            this.f52576OooO0o0 = momentSendShareModel;
            this.f52575OooO0o = momentSendModel;
            this.f52577OooO0oO = editTextSpan;
            this.f52578OooO0oo = function0;
            this.f52573OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooO00o(this.f52576OooO0o0, this.f52575OooO0o, this.f52577OooO0oO, this.f52578OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52573OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f52579OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f52580OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f52582OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52583OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f52584OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ List<MomentSendContentAtModel> f52585OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f52586OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f52587OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, String str3, List<MomentSendContentAtModel> list, boolean z, int i, int i2) {
            super(2);
            this.f52583OooO0o0 = str;
            this.f52582OooO0o = str2;
            this.f52584OooO0oO = str3;
            this.f52585OooO0oo = list;
            this.f52580OooO = z;
            this.f52586OooOO0 = i;
            this.f52587OooOO0O = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooO0O0(this.f52583OooO0o0, this.f52582OooO0o, this.f52584OooO0oO, this.f52585OooO0oo, this.f52580OooO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52586OooOO0 | 1), this.f52587OooOO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f52588OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f52590OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f52591OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f52592OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f52593OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ long f52594OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Painter f52595OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f52596OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, String str2, String str3, String str4, String str5, long j, Painter painter, int i) {
            super(2);
            this.f52591OooO0o0 = str;
            this.f52590OooO0o = str2;
            this.f52592OooO0oO = str3;
            this.f52593OooO0oo = str4;
            this.f52588OooO = str5;
            this.f52594OooOO0 = j;
            this.f52595OooOO0O = painter;
            this.f52596OooOO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooO0OO(this.f52591OooO0o0, this.f52590OooO0o, this.f52592OooO0oO, this.f52593OooO0oo, this.f52588OooO, this.f52594OooOO0, this.f52595OooOO0O, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52596OooOO0o | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52598OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentForwardContent f52599OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentForwardContent momentForwardContent, int i) {
            super(2);
            this.f52599OooO0o0 = momentForwardContent;
            this.f52598OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52598OooO0o | 1);
            o0o0Oo.this.OooO0o0(this.f52599OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52601OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52602OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f52602OooO0o0 = momentDetailModel;
            this.f52601OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52601OooO0o | 1);
            o0o0Oo.this.OooO0o(this.f52602OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52604OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52605OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52606OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentDetailModel momentDetailModel, MomentSendModel momentSendModel, int i) {
            super(2);
            this.f52605OooO0o0 = momentDetailModel;
            this.f52604OooO0o = momentSendModel;
            this.f52606OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52606OooO0oO | 1);
            MomentDetailModel momentDetailModel = this.f52605OooO0o0;
            MomentSendModel momentSendModel = this.f52604OooO0o;
            o0o0Oo.this.OooO0oo(momentDetailModel, momentSendModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52608OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentForwardContent f52609OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentForwardContent momentForwardContent, int i) {
            super(2);
            this.f52609OooO0o0 = momentForwardContent;
            this.f52608OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52608OooO0o | 1);
            o0o0Oo.this.OooO0oO(this.f52609OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52611OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52612OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52613OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MomentDetailModel momentDetailModel, MomentSendModel momentSendModel, int i) {
            super(2);
            this.f52612OooO0o0 = momentDetailModel;
            this.f52611OooO0o = momentSendModel;
            this.f52613OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52613OooO0oO | 1);
            MomentDetailModel momentDetailModel = this.f52612OooO0o0;
            MomentSendModel momentSendModel = this.f52611OooO0o;
            o0o0Oo.this.OooO(momentDetailModel, momentSendModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52614OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52616OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendShareModel f52617OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f52618OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52619OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MomentSendShareModel momentSendShareModel, MomentSendModel momentSendModel, EditTextSpan editTextSpan, Function0<Unit> function0, int i) {
            super(2);
            this.f52617OooO0o0 = momentSendShareModel;
            this.f52616OooO0o = momentSendModel;
            this.f52618OooO0oO = editTextSpan;
            this.f52619OooO0oo = function0;
            this.f52614OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooOO0(this.f52617OooO0o0, this.f52616OooO0o, this.f52618OooO0oO, this.f52619OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52614OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52620OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52622OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendShareModel f52623OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f52624OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52625OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MomentSendShareModel momentSendShareModel, MomentSendModel momentSendModel, EditTextSpan editTextSpan, Function0<Unit> function0, int i) {
            super(2);
            this.f52623OooO0o0 = momentSendShareModel;
            this.f52622OooO0o = momentSendModel;
            this.f52624OooO0oO = editTextSpan;
            this.f52625OooO0oo = function0;
            this.f52620OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooOO0(this.f52623OooO0o0, this.f52622OooO0o, this.f52624OooO0oO, this.f52625OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52620OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52626OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52628OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendShareModel f52629OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f52630OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52631OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MomentSendShareModel momentSendShareModel, MomentSendModel momentSendModel, EditTextSpan editTextSpan, Function0<Unit> function0, int i) {
            super(2);
            this.f52629OooO0o0 = momentSendShareModel;
            this.f52628OooO0o = momentSendModel;
            this.f52630OooO0oO = editTextSpan;
            this.f52631OooO0oo = function0;
            this.f52626OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooOO0(this.f52629OooO0o0, this.f52628OooO0o, this.f52630OooO0oO, this.f52631OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52626OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52632OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f52634OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendShareModel f52635OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f52636OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f52637OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MomentSendShareModel momentSendShareModel, MomentSendModel momentSendModel, EditTextSpan editTextSpan, Function0<Unit> function0, int i) {
            super(2);
            this.f52635OooO0o0 = momentSendShareModel;
            this.f52634OooO0o = momentSendModel;
            this.f52636OooO0oO = editTextSpan;
            this.f52637OooO0oo = function0;
            this.f52632OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0o0Oo.this.OooOO0(this.f52635OooO0o0, this.f52634OooO0o, this.f52636OooO0oO, this.f52637OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52632OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52639OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ EventModel f52640OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(EventModel eventModel, int i) {
            super(2);
            this.f52640OooO0o0 = eventModel;
            this.f52639OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52639OooO0o | 1);
            o0o0Oo.this.OooOO0O(this.f52640OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52642OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ShareWebModel f52643OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(ShareWebModel shareWebModel, int i) {
            super(2);
            this.f52643OooO0o0 = shareWebModel;
            this.f52642OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52642OooO0o | 1);
            o0o0Oo.this.OooOOO0(this.f52643OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f52645OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomShareModel f52646OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(RoomShareModel roomShareModel, int i) {
            super(2);
            this.f52646OooO0o0 = roomShareModel;
            this.f52645OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52645OooO0o | 1);
            o0o0Oo.this.OooOO0o(this.f52646OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO(MomentDetailModel momentDetailModel, MomentSendModel momentSendModel, Composer composer, int i) {
        String str;
        boolean z;
        MomentSendContentModel content;
        List<MomentSendContentAtModel> at;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        MomentImageModel momentImageModel;
        Composer composerStartRestartGroup = composer.startRestartGroup(366701051);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(366701051, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetForwardMomentMore (MomentSendShare.kt:376)");
        }
        momentSendModel.setNotifyUserid(String.valueOf(momentDetailModel.getUserId()));
        MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
        String image = forwardContent != null ? forwardContent.getImage() : "";
        MomentPoll value = momentDetailModel.getMomentPollLiveData().getValue();
        if (value != null && value.getExpireTime() > 0) {
            if (image.length() == 0) {
                image = value.getShareDefaultImg();
            }
        }
        ArrayList arrayListOooO00o = o000OOo0.OooO00o(momentDetailModel.getPFName(), momentDetailModel.getPNumber(), momentDetailModel.getSize());
        if (arrayListOooO00o.size() > 0 && (momentImageModel = (MomentImageModel) arrayListOooO00o.get(0)) != null) {
            if (image.length() == 0) {
                image = momentImageModel.getUrl();
            }
        }
        String strOooO00o = momentDetailModel.getNickName().length() > 0 ? o00O00OO.OooO00o("@", momentDetailModel.getNickName()) : "";
        MomentSendContentModel content2 = momentDetailModel.getContent();
        String strOooOOO = com.code.android.util.o0OoOo0.OooOOO(content2 != null ? content2.getContent() : null, "");
        int type = momentDetailModel.getType();
        if (type == MomentType.Image.getValue()) {
            if (StringsKt.isBlank(strOooOOO)) {
                strOooOOO = o0000.OooO0OO(o000OOo._photo_);
            }
        } else {
            if (type != MomentType.Poll.getValue()) {
                if (type == MomentType.Video.getValue()) {
                    image = momentDetailModel.getCoverPic();
                    if (StringsKt.isBlank(strOooOOO)) {
                        strOooOOO = o0000.OooO0OO(o000OOo._Video_);
                    }
                    str = strOooOOO;
                    z = true;
                } else if (StringsKt.isBlank(strOooOOO)) {
                    strOooOOO = p004OooO0oO.o000oOoO.OooO00o("[", o0000.OooO0OO(o000OOo.Other), "]");
                }
                content = momentDetailModel.getContent();
                if (content != null) {
                    at = content.getAt();
                } else {
                    at = null;
                }
                OooO0O0(image, strOooO00o, str, at, z, composerStartRestartGroup, ((i << 9) & 458752) | 4096, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(momentDetailModel, momentSendModel, i));
            }
            if (StringsKt.isBlank(strOooOOO)) {
                strOooOOO = o0000.OooO0OO(o000OOo._Poll_);
            }
        }
        z = false;
        str = strOooOOO;
        content = momentDetailModel.getContent();
        if (content != null) {
            at = content.getAt();
        } else {
            at = null;
        }
        OooO0O0(image, strOooO00o, str, at, z, composerStartRestartGroup, ((i << 9) & 458752) | 4096, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(momentDetailModel, momentSendModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull MomentSendShareModel sharePostModel, @NotNull MomentSendModel sendPostModel, @NotNull EditTextSpan editContent, @NotNull Function0<Unit> imageHideListener, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sharePostModel, "sharePostModel");
        Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
        Intrinsics.checkNotNullParameter(editContent, "editContent");
        Intrinsics.checkNotNullParameter(imageHideListener, "imageHideListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1462401339);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1462401339, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.Content (MomentSendShare.kt:73)");
        }
        Modifier modifierOooO00o = kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(88, SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        boolean zIsInEdit = sendPostModel.isInEdit();
        o0o0Oo o0o0oo = f52568OooO00o;
        if (zIsInEdit) {
            composerStartRestartGroup.startReplaceableGroup(474735127);
            o0o0oo.OooO0Oo(sendPostModel, imageHideListener, composerStartRestartGroup, ((i >> 6) & 112) | 392);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(474735210);
            o0o0oo.OooOO0(sharePostModel, sendPostModel, editContent, imageHideListener, composerStartRestartGroup, (i & 7168) | 25160);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(sharePostModel, sendPostModel, editContent, imageHideListener, i));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0228  */
    /* JADX WARN: Code duplicated, block: B:101:0x0251  */
    /* JADX WARN: Code duplicated, block: B:103:0x0257  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:113:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:115:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:121:0x0300  */
    /* JADX WARN: Code duplicated, block: B:122:0x033f  */
    /* JADX WARN: Code duplicated, block: B:125:0x034f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0351  */
    /* JADX WARN: Code duplicated, block: B:128:0x0354  */
    /* JADX WARN: Code duplicated, block: B:130:0x0375  */
    /* JADX WARN: Code duplicated, block: B:131:0x0378  */
    /* JADX WARN: Code duplicated, block: B:135:0x0401  */
    /* JADX WARN: Code duplicated, block: B:140:0x040f  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x012f  */
    /* JADX WARN: Code duplicated, block: B:79:0x013d  */
    /* JADX WARN: Code duplicated, block: B:82:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0163  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(String str, String str2, String str3, List<MomentSendContentAtModel> list, boolean z, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        List<MomentSendContentAtModel> list2;
        boolean z3;
        Modifier.Companion companion;
        Alignment.Companion companion2;
        Arrangement arrangement;
        int currentCompositeKeyHash;
        ComposeUiNode.Companion companion3;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        boolean z4;
        Arrangement arrangement2;
        Alignment.Companion companion4;
        int i8;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1320constructorimpl2;
        Function2 function2OooO00o2;
        boolean z5;
        List<MomentSendContentAtModel> list3;
        boolean z6;
        TextDirection textDirectionM3687boximpl;
        int currentCompositeKeyHash3;
        Function0<ComposeUiNode> constructor3;
        Composer composerM1320constructorimpl3;
        Function2 function2OooO00o3;
        BoxScopeInstance boxScopeInstance;
        int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(785451235);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 896) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i4 = 128;
                    }
                    i3 |= i4;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((57344 & i) == 0) {
                        z2 = z;
                        if (composerStartRestartGroup.changed(z2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if (i5 != 8 && (46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        list3 = list;
                        z6 = z2;
                    } else {
                        if (i5 != 0) {
                            list2 = null;
                        } else {
                            list2 = list;
                        }
                        if (i6 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                        }
                        companion = Modifier.INSTANCE;
                        float f = 12;
                        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                        companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-1888403868);
                        if (str.length() > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                            float f2 = 76;
                            float f3 = 8;
                            Modifier modifierClip = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f2)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f3)));
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor3);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                            function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o2, composerM1320constructorimpl3, currentCompositionLocalMap2);
                            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                            }
                            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            boxScopeInstance = BoxScopeInstance.INSTANCE;
                            arrangement2 = arrangement;
                            companion4 = companion2;
                            oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f2), str), o000.OooO00o(f3, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                            composerStartRestartGroup.startReplaceableGroup(-1888403288);
                            if (z3) {
                                Painter painterPainterResource = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                                Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                                i9 = 0;
                                ImageKt.Image(painterPainterResource, (String) null, modifierM525size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            } else {
                                i9 = 0;
                            }
                            i8 = i9;
                            o00O000o.OooO0O0(composerStartRestartGroup);
                        } else {
                            arrangement2 = arrangement;
                            companion4 = companion2;
                            i8 = 0;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f), 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_4 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyOooO00o3 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_4, composerStartRestartGroup, 6, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o3, composerM1320constructorimpl2, currentCompositionLocalMap3);
                        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-783769020);
                        if (str2.length() > 0) {
                            i8 = 1;
                        }
                        if (i8 != 0) {
                            TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1888402424);
                        if (str3.length() > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                            int iM3729getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                            PlatformTextStyle platformTextStyle = new PlatformTextStyle(true);
                            long sp = TextUnitKt.getSp(14);
                            long j = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                            if (p596o0oo000O.OooO0o.OooO0o0()) {
                                textDirectionM3687boximpl = null;
                            } else {
                                textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                            }
                            p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default, str3, false, list2, null, null, new TextStyle(j, sp, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ8, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        list3 = list2;
                        z6 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
                }
                i3 |= 24576;
                z2 = z;
                if (i5 != 8) {
                    if (i5 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                    }
                    companion = Modifier.INSTANCE;
                    float f4 = 12;
                    Modifier modifierM171backgroundbw27NRU$default2 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f4, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o4, composerM1320constructorimpl, currentCompositionLocalMap4);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1888403868);
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        float f5 = 76;
                        float f6 = 8;
                        Modifier modifierClip2 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f5)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f6)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o5 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierClip2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o5, composerM1320constructorimpl3, currentCompositionLocalMap5);
                        if (composerM1320constructorimpl3.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f5), str), o000.OooO00o(f6, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                        composerStartRestartGroup.startReplaceableGroup(-1888403288);
                        if (z3) {
                            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                            Modifier modifierM525size3ABfNKs2 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                            i9 = 0;
                            ImageKt.Image(painterPainterResource2, (String) null, modifierM525size3ABfNKs2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i9 = 0;
                        }
                        i8 = i9;
                        o00O000o.OooO0O0(composerStartRestartGroup);
                    } else {
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        i8 = 0;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM480paddingVpY3zN4$default2 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance2, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f4), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_5 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o6 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_5, composerStartRestartGroup, 6, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o6, composerM1320constructorimpl2, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-783769020);
                    if (str2.length() > 0) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1888402424);
                    if (str3.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                        int iM3729getEllipsisgIe3tQ9 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                        PlatformTextStyle platformTextStyle2 = new PlatformTextStyle(true);
                        long sp2 = TextUnitKt.getSp(14);
                        long j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                        if (p596o0oo000O.OooO0o.OooO0o0()) {
                            textDirectionM3687boximpl = null;
                        } else {
                            textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                        }
                        p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default2, str3, false, list2, null, null, new TextStyle(j2, sp2, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle2, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ9, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list2;
                    z6 = z3;
                } else {
                    if (i5 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                    }
                    companion = Modifier.INSTANCE;
                    float f7 = 12;
                    Modifier modifierM171backgroundbw27NRU$default3 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f7, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o7, composerM1320constructorimpl, currentCompositionLocalMap7);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1888403868);
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        float f8 = 76;
                        float f9 = 8;
                        Modifier modifierClip3 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f8)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f9)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o8 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierClip3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o8, composerM1320constructorimpl3, currentCompositionLocalMap8);
                        if (composerM1320constructorimpl3.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f8), str), o000.OooO00o(f9, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                        composerStartRestartGroup.startReplaceableGroup(-1888403288);
                        if (z3) {
                            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                            Modifier modifierM525size3ABfNKs3 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                            i9 = 0;
                            ImageKt.Image(painterPainterResource3, (String) null, modifierM525size3ABfNKs3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i9 = 0;
                        }
                        i8 = i9;
                        o00O000o.OooO0O0(composerStartRestartGroup);
                    } else {
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        i8 = 0;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM480paddingVpY3zN4$default3 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance3, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f7), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_6 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o9 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_6, composerStartRestartGroup, 6, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o9, composerM1320constructorimpl2, currentCompositionLocalMap9);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-783769020);
                    if (str2.length() > 0) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1888402424);
                    if (str3.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                        int iM3729getEllipsisgIe3tQ10 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                        PlatformTextStyle platformTextStyle3 = new PlatformTextStyle(true);
                        long sp3 = TextUnitKt.getSp(14);
                        long j3 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                        if (p596o0oo000O.OooO0o.OooO0o0()) {
                            textDirectionM3687boximpl = null;
                        } else {
                            textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                        }
                        p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default3, str3, false, list2, null, null, new TextStyle(j3, sp3, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle3, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ10, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list2;
                    z6 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
            }
            i3 |= 384;
            i5 = i2 & 8;
            if (i5 != 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if (i5 != 8) {
                    if (i5 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                    }
                    companion = Modifier.INSTANCE;
                    float f10 = 12;
                    Modifier modifierM171backgroundbw27NRU$default4 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f10, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically4 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o10 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically4, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1888403868);
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        float f11 = 76;
                        float f12 = 8;
                        Modifier modifierClip4 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f11)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f12)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o11 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierClip4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o11, composerM1320constructorimpl3, currentCompositionLocalMap11);
                        if (composerM1320constructorimpl3.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f11), str), o000.OooO00o(f12, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                        composerStartRestartGroup.startReplaceableGroup(-1888403288);
                        if (z3) {
                            Painter painterPainterResource4 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                            Modifier modifierM525size3ABfNKs4 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                            i9 = 0;
                            ImageKt.Image(painterPainterResource4, (String) null, modifierM525size3ABfNKs4, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i9 = 0;
                        }
                        i8 = i9;
                        o00O000o.OooO0O0(composerStartRestartGroup);
                    } else {
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        i8 = 0;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM480paddingVpY3zN4$default4 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance4, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f10), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_7 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o12 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_7, composerStartRestartGroup, 6, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                    CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o12, composerM1320constructorimpl2, currentCompositionLocalMap12);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-783769020);
                    if (str2.length() > 0) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1888402424);
                    if (str3.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                        int iM3729getEllipsisgIe3tQ11 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                        PlatformTextStyle platformTextStyle4 = new PlatformTextStyle(true);
                        long sp4 = TextUnitKt.getSp(14);
                        long j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                        if (p596o0oo000O.OooO0o.OooO0o0()) {
                            textDirectionM3687boximpl = null;
                        } else {
                            textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                        }
                        p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default4, str3, false, list2, null, null, new TextStyle(j4, sp4, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle4, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ11, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list2;
                    z6 = z3;
                } else {
                    if (i5 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                    }
                    companion = Modifier.INSTANCE;
                    float f13 = 12;
                    Modifier modifierM171backgroundbw27NRU$default5 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f13, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically5 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o13 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically5, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o13, composerM1320constructorimpl, currentCompositionLocalMap13);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1888403868);
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        float f14 = 76;
                        float f15 = 8;
                        Modifier modifierClip5 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f14)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f15)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o14 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierClip5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o14, composerM1320constructorimpl3, currentCompositionLocalMap14);
                        if (composerM1320constructorimpl3.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f14), str), o000.OooO00o(f15, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                        composerStartRestartGroup.startReplaceableGroup(-1888403288);
                        if (z3) {
                            Painter painterPainterResource5 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                            Modifier modifierM525size3ABfNKs5 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                            i9 = 0;
                            ImageKt.Image(painterPainterResource5, (String) null, modifierM525size3ABfNKs5, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i9 = 0;
                        }
                        i8 = i9;
                        o00O000o.OooO0O0(composerStartRestartGroup);
                    } else {
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        i8 = 0;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM480paddingVpY3zN4$default5 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance5, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f13), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_8 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o15 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_8, composerStartRestartGroup, 6, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                    CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o15, composerM1320constructorimpl2, currentCompositionLocalMap15);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-783769020);
                    if (str2.length() > 0) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1888402424);
                    if (str3.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                        int iM3729getEllipsisgIe3tQ12 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                        PlatformTextStyle platformTextStyle5 = new PlatformTextStyle(true);
                        long sp5 = TextUnitKt.getSp(14);
                        long j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                        if (p596o0oo000O.OooO0o.OooO0o0()) {
                            textDirectionM3687boximpl = null;
                        } else {
                            textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                        }
                        p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default5, str3, false, list2, null, null, new TextStyle(j5, sp5, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle5, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ12, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list2;
                    z6 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if (i5 != 8) {
                if (i5 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                }
                companion = Modifier.INSTANCE;
                float f16 = 12;
                Modifier modifierM171backgroundbw27NRU$default6 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f16, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically6 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o16 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically6, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o16, composerM1320constructorimpl, currentCompositionLocalMap16);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1888403868);
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    float f17 = 76;
                    float f18 = 8;
                    Modifier modifierClip6 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f17)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f18)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o17 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierClip6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o17, composerM1320constructorimpl3, currentCompositionLocalMap17);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f17), str), o000.OooO00o(f18, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                    composerStartRestartGroup.startReplaceableGroup(-1888403288);
                    if (z3) {
                        Painter painterPainterResource6 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs6 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                        i9 = 0;
                        ImageKt.Image(painterPainterResource6, (String) null, modifierM525size3ABfNKs6, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i9 = 0;
                    }
                    i8 = i9;
                    o00O000o.OooO0O0(composerStartRestartGroup);
                } else {
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    i8 = 0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default6 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance6, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f16), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_9 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o18 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_9, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o18, composerM1320constructorimpl2, currentCompositionLocalMap18);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-783769020);
                if (str2.length() > 0) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1888402424);
                if (str3.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                    int iM3729getEllipsisgIe3tQ13 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    PlatformTextStyle platformTextStyle6 = new PlatformTextStyle(true);
                    long sp6 = TextUnitKt.getSp(14);
                    long j6 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default6, str3, false, list2, null, null, new TextStyle(j6, sp6, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle6, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ13, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list2;
                z6 = z3;
            } else {
                if (i5 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                }
                companion = Modifier.INSTANCE;
                float f19 = 12;
                Modifier modifierM171backgroundbw27NRU$default7 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f19, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically7 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o19 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically7, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o19, composerM1320constructorimpl, currentCompositionLocalMap19);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1888403868);
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    float f110 = 76;
                    float f111 = 8;
                    Modifier modifierClip7 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f110)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f111)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o110 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierClip7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o110, composerM1320constructorimpl3, currentCompositionLocalMap110);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f110), str), o000.OooO00o(f111, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                    composerStartRestartGroup.startReplaceableGroup(-1888403288);
                    if (z3) {
                        Painter painterPainterResource7 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs7 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                        i9 = 0;
                        ImageKt.Image(painterPainterResource7, (String) null, modifierM525size3ABfNKs7, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i9 = 0;
                    }
                    i8 = i9;
                    o00O000o.OooO0O0(composerStartRestartGroup);
                } else {
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    i8 = 0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default7 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance7, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f19), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_10 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o111 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_10, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o111, composerM1320constructorimpl2, currentCompositionLocalMap111);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-783769020);
                if (str2.length() > 0) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1888402424);
                if (str3.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                    int iM3729getEllipsisgIe3tQ14 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    PlatformTextStyle platformTextStyle7 = new PlatformTextStyle(true);
                    long sp7 = TextUnitKt.getSp(14);
                    long j7 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default7, str3, false, list2, null, null, new TextStyle(j7, sp7, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle7, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ14, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list2;
                z6 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
        }
        i3 |= 48;
        if ((i2 & 4) != 0) {
            if ((i & 896) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((57344 & i) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if (i5 != 8) {
                    if (i5 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                    }
                    companion = Modifier.INSTANCE;
                    float f112 = 12;
                    Modifier modifierM171backgroundbw27NRU$default8 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f112, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically8 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o112 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically8, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o112, composerM1320constructorimpl, currentCompositionLocalMap112);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1888403868);
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        float f113 = 76;
                        float f114 = 8;
                        Modifier modifierClip8 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f113)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f114)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o113 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierClip8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o113, composerM1320constructorimpl3, currentCompositionLocalMap113);
                        if (composerM1320constructorimpl3.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f113), str), o000.OooO00o(f114, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                        composerStartRestartGroup.startReplaceableGroup(-1888403288);
                        if (z3) {
                            Painter painterPainterResource8 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                            Modifier modifierM525size3ABfNKs8 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                            i9 = 0;
                            ImageKt.Image(painterPainterResource8, (String) null, modifierM525size3ABfNKs8, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i9 = 0;
                        }
                        i8 = i9;
                        o00O000o.OooO0O0(composerStartRestartGroup);
                    } else {
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        i8 = 0;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM480paddingVpY3zN4$default8 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance8, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f112), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_11 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o114 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_11, composerStartRestartGroup, 6, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                    CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o114, composerM1320constructorimpl2, currentCompositionLocalMap114);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-783769020);
                    if (str2.length() > 0) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1888402424);
                    if (str3.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                        int iM3729getEllipsisgIe3tQ15 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                        PlatformTextStyle platformTextStyle8 = new PlatformTextStyle(true);
                        long sp8 = TextUnitKt.getSp(14);
                        long j8 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                        if (p596o0oo000O.OooO0o.OooO0o0()) {
                            textDirectionM3687boximpl = null;
                        } else {
                            textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                        }
                        p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default8, str3, false, list2, null, null, new TextStyle(j8, sp8, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle8, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ15, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list2;
                    z6 = z3;
                } else {
                    if (i5 != 0) {
                        list2 = null;
                    } else {
                        list2 = list;
                    }
                    if (i6 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                    }
                    companion = Modifier.INSTANCE;
                    float f115 = 12;
                    Modifier modifierM171backgroundbw27NRU$default9 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f115, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically9 = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o115 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically9, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o115, composerM1320constructorimpl, currentCompositionLocalMap115);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1888403868);
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                        float f116 = 76;
                        float f117 = 8;
                        Modifier modifierClip9 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f116)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f117)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o116 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierClip9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o116, composerM1320constructorimpl3, currentCompositionLocalMap116);
                        if (composerM1320constructorimpl3.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f116), str), o000.OooO00o(f117, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                        composerStartRestartGroup.startReplaceableGroup(-1888403288);
                        if (z3) {
                            Painter painterPainterResource9 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                            Modifier modifierM525size3ABfNKs9 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                            i9 = 0;
                            ImageKt.Image(painterPainterResource9, (String) null, modifierM525size3ABfNKs9, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        } else {
                            i9 = 0;
                        }
                        i8 = i9;
                        o00O000o.OooO0O0(composerStartRestartGroup);
                    } else {
                        arrangement2 = arrangement;
                        companion4 = companion2;
                        i8 = 0;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM480paddingVpY3zN4$default9 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance9, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f115), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_12 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO00o117 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_12, composerStartRestartGroup, 6, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                    CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o117, composerM1320constructorimpl2, currentCompositionLocalMap117);
                    if (composerM1320constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance9 = ColumnScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-783769020);
                    if (str2.length() > 0) {
                        i8 = 1;
                    }
                    if (i8 != 0) {
                        TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1888402424);
                    if (str3.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        Modifier modifierFillMaxWidth$default9 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                        int iM3729getEllipsisgIe3tQ16 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                        PlatformTextStyle platformTextStyle9 = new PlatformTextStyle(true);
                        long sp9 = TextUnitKt.getSp(14);
                        long j9 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                        if (p596o0oo000O.OooO0o.OooO0o0()) {
                            textDirectionM3687boximpl = null;
                        } else {
                            textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                        }
                        p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default9, str3, false, list2, null, null, new TextStyle(j9, sp9, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle9, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ16, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list2;
                    z6 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
            }
            i3 |= 24576;
            z2 = z;
            if (i5 != 8) {
                if (i5 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                }
                companion = Modifier.INSTANCE;
                float f118 = 12;
                Modifier modifierM171backgroundbw27NRU$default10 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f118, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically10 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o118 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically10, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o118, composerM1320constructorimpl, currentCompositionLocalMap118);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1888403868);
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    float f119 = 76;
                    float f1110 = 8;
                    Modifier modifierClip10 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f119)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f1110)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o119 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierClip10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o119, composerM1320constructorimpl3, currentCompositionLocalMap119);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f119), str), o000.OooO00o(f1110, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                    composerStartRestartGroup.startReplaceableGroup(-1888403288);
                    if (z3) {
                        Painter painterPainterResource10 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs10 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                        i9 = 0;
                        ImageKt.Image(painterPainterResource10, (String) null, modifierM525size3ABfNKs10, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i9 = 0;
                    }
                    i8 = i9;
                    o00O000o.OooO0O0(composerStartRestartGroup);
                } else {
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    i8 = 0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default10 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance10, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f118), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_13 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o1110 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_13, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o1110, composerM1320constructorimpl2, currentCompositionLocalMap1110);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance10 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-783769020);
                if (str2.length() > 0) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1888402424);
                if (str3.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Modifier modifierFillMaxWidth$default10 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                    int iM3729getEllipsisgIe3tQ17 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    PlatformTextStyle platformTextStyle10 = new PlatformTextStyle(true);
                    long sp10 = TextUnitKt.getSp(14);
                    long j10 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default10, str3, false, list2, null, null, new TextStyle(j10, sp10, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle10, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ17, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list2;
                z6 = z3;
            } else {
                if (i5 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                }
                companion = Modifier.INSTANCE;
                float f1111 = 12;
                Modifier modifierM171backgroundbw27NRU$default11 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f1111, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically11 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o1111 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically11, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o1111, composerM1320constructorimpl, currentCompositionLocalMap1111);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1888403868);
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    float f1112 = 76;
                    float f1113 = 8;
                    Modifier modifierClip11 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f1112)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f1113)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o1112 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1112 = LayoutKt.modifierMaterializerOf(modifierClip11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o1112, composerM1320constructorimpl3, currentCompositionLocalMap1112);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f1112), str), o000.OooO00o(f1113, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                    composerStartRestartGroup.startReplaceableGroup(-1888403288);
                    if (z3) {
                        Painter painterPainterResource11 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs11 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                        i9 = 0;
                        ImageKt.Image(painterPainterResource11, (String) null, modifierM525size3ABfNKs11, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i9 = 0;
                    }
                    i8 = i9;
                    o00O000o.OooO0O0(composerStartRestartGroup);
                } else {
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    i8 = 0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default11 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance11, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f1111), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_14 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o1113 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_14, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                CompositionLocalMap currentCompositionLocalMap1113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1113 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o1113, composerM1320constructorimpl2, currentCompositionLocalMap1113);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf1113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance11 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-783769020);
                if (str2.length() > 0) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1888402424);
                if (str3.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Modifier modifierFillMaxWidth$default11 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                    int iM3729getEllipsisgIe3tQ18 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    PlatformTextStyle platformTextStyle11 = new PlatformTextStyle(true);
                    long sp11 = TextUnitKt.getSp(14);
                    long j11 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default11, str3, false, list2, null, null, new TextStyle(j11, sp11, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle11, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ18, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list2;
                z6 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
        }
        i3 |= 384;
        i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((57344 & i) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if (i5 != 8) {
                if (i5 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                }
                companion = Modifier.INSTANCE;
                float f1114 = 12;
                Modifier modifierM171backgroundbw27NRU$default12 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f1114, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically12 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o1114 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically12, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1114 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o1114, composerM1320constructorimpl, currentCompositionLocalMap1114);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1888403868);
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    float f1115 = 76;
                    float f1116 = 8;
                    Modifier modifierClip12 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f1115)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f1116)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o1115 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1115 = LayoutKt.modifierMaterializerOf(modifierClip12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o1115, composerM1320constructorimpl3, currentCompositionLocalMap1115);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f1115), str), o000.OooO00o(f1116, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                    composerStartRestartGroup.startReplaceableGroup(-1888403288);
                    if (z3) {
                        Painter painterPainterResource12 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs12 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                        i9 = 0;
                        ImageKt.Image(painterPainterResource12, (String) null, modifierM525size3ABfNKs12, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i9 = 0;
                    }
                    i8 = i9;
                    o00O000o.OooO0O0(composerStartRestartGroup);
                } else {
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    i8 = 0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default12 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance12, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f1114), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_15 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o1116 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_15, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                CompositionLocalMap currentCompositionLocalMap1116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1116 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o1116, composerM1320constructorimpl2, currentCompositionLocalMap1116);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf1116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance12 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-783769020);
                if (str2.length() > 0) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1888402424);
                if (str3.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Modifier modifierFillMaxWidth$default12 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                    int iM3729getEllipsisgIe3tQ19 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    PlatformTextStyle platformTextStyle12 = new PlatformTextStyle(true);
                    long sp12 = TextUnitKt.getSp(14);
                    long j12 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default12, str3, false, list2, null, null, new TextStyle(j12, sp12, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle12, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ19, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list2;
                z6 = z3;
            } else {
                if (i5 != 0) {
                    list2 = null;
                } else {
                    list2 = list;
                }
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
                }
                companion = Modifier.INSTANCE;
                float f1117 = 12;
                Modifier modifierM171backgroundbw27NRU$default13 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f1117, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically13 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyOooO00o1117 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically13, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap1117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1117 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o1117, composerM1320constructorimpl, currentCompositionLocalMap1117);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-1888403868);
                if (str.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                    float f1118 = 76;
                    float f1119 = 8;
                    Modifier modifierClip13 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f1118)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f1119)));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyOooO00o1118 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap1118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1118 = LayoutKt.modifierMaterializerOf(modifierClip13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o1118, composerM1320constructorimpl3, currentCompositionLocalMap1118);
                    if (composerM1320constructorimpl3.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf1118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f1118), str), o000.OooO00o(f1119, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                    composerStartRestartGroup.startReplaceableGroup(-1888403288);
                    if (z3) {
                        Painter painterPainterResource13 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                        Modifier modifierM525size3ABfNKs13 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                        i9 = 0;
                        ImageKt.Image(painterPainterResource13, (String) null, modifierM525size3ABfNKs13, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    } else {
                        i9 = 0;
                    }
                    i8 = i9;
                    o00O000o.OooO0O0(composerStartRestartGroup);
                } else {
                    arrangement2 = arrangement;
                    companion4 = companion2;
                    i8 = 0;
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM480paddingVpY3zN4$default13 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance13, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f1117), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_16 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO00o1119 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_16, composerStartRestartGroup, 6, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
                CompositionLocalMap currentCompositionLocalMap1119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1119 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o1119, composerM1320constructorimpl2, currentCompositionLocalMap1119);
                if (composerM1320constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf1119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance13 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-783769020);
                if (str2.length() > 0) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1888402424);
                if (str3.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    Modifier modifierFillMaxWidth$default13 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                    int iM3729getEllipsisgIe3tQ110 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                    PlatformTextStyle platformTextStyle13 = new PlatformTextStyle(true);
                    long sp13 = TextUnitKt.getSp(14);
                    long j13 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                    if (p596o0oo000O.OooO0o.OooO0o0()) {
                        textDirectionM3687boximpl = null;
                    } else {
                        textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                    }
                    p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default13, str3, false, list2, null, null, new TextStyle(j13, sp13, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle13, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ110, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                list3 = list2;
                z6 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
        }
        i3 |= 24576;
        z2 = z;
        if (i5 != 8) {
            if (i5 != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
            }
            companion = Modifier.INSTANCE;
            float f11110 = 12;
            Modifier modifierM171backgroundbw27NRU$default14 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f11110, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
            companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically14 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o11110 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically14, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11110 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o11110, composerM1320constructorimpl, currentCompositionLocalMap11110);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1888403868);
            if (str.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                float f11111 = 76;
                float f11112 = 8;
                Modifier modifierClip14 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f11111)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f11112)));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o11111 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11111 = LayoutKt.modifierMaterializerOf(modifierClip14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o11111, composerM1320constructorimpl3, currentCompositionLocalMap11111);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                arrangement2 = arrangement;
                companion4 = companion2;
                oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f11111), str), o000.OooO00o(f11112, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                composerStartRestartGroup.startReplaceableGroup(-1888403288);
                if (z3) {
                    Painter painterPainterResource14 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                    Modifier modifierM525size3ABfNKs14 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                    i9 = 0;
                    ImageKt.Image(painterPainterResource14, (String) null, modifierM525size3ABfNKs14, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i9 = 0;
                }
                i8 = i9;
                o00O000o.OooO0O0(composerStartRestartGroup);
            } else {
                arrangement2 = arrangement;
                companion4 = companion2;
                i8 = 0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM480paddingVpY3zN4$default14 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance14, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f11110), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_17 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o11112 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_17, composerStartRestartGroup, 6, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
            CompositionLocalMap currentCompositionLocalMap11112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11112 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o11112, composerM1320constructorimpl2, currentCompositionLocalMap11112);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf11112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance14 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-783769020);
            if (str2.length() > 0) {
                i8 = 1;
            }
            if (i8 != 0) {
                TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1888402424);
            if (str3.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                Modifier modifierFillMaxWidth$default14 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                int iM3729getEllipsisgIe3tQ111 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                PlatformTextStyle platformTextStyle14 = new PlatformTextStyle(true);
                long sp14 = TextUnitKt.getSp(14);
                long j14 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                if (p596o0oo000O.OooO0o.OooO0o0()) {
                    textDirectionM3687boximpl = null;
                } else {
                    textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                }
                p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default14, str3, false, list2, null, null, new TextStyle(j14, sp14, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle14, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ111, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list3 = list2;
            z6 = z3;
        } else {
            if (i5 != 0) {
                list2 = null;
            } else {
                list2 = list;
            }
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785451235, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemView (MomentSendShare.kt:441)");
            }
            companion = Modifier.INSTANCE;
            float f11113 = 12;
            Modifier modifierM171backgroundbw27NRU$default15 = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f11113, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(88))), o0O0o.f48230o000o0o0, null, 2, null);
            companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically15 = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyOooO00o11113 = androidx.compose.material.OooO0OO.OooO00o(arrangement, centerVertically15, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11113 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o11113, composerM1320constructorimpl, currentCompositionLocalMap11113);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1888403868);
            if (str.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
                float f11114 = 76;
                float f11115 = 8;
                Modifier modifierClip15 = ClipKt.clip(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(f11114)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f11115)));
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o11114 = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11114 = LayoutKt.modifierMaterializerOf(modifierClip15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o11114, composerM1320constructorimpl3, currentCompositionLocalMap11114);
                if (composerM1320constructorimpl3.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                boxScopeInstance = BoxScopeInstance.INSTANCE;
                arrangement2 = arrangement;
                companion4 = companion2;
                oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0O0(o0000O0.OooO00o(f11114), str), o000.OooO00o(f11115, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion, companion2.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
                composerStartRestartGroup.startReplaceableGroup(-1888403288);
                if (z3) {
                    Painter painterPainterResource15 = PainterResources_androidKt.painterResource(oo0o0Oo.icon_moment_type_video, composerStartRestartGroup, 0);
                    Modifier modifierM525size3ABfNKs15 = SizeKt.m525size3ABfNKs(boxScopeInstance.align(companion, companion4.getCenter()), Dp.m3775constructorimpl(20));
                    i9 = 0;
                    ImageKt.Image(painterPainterResource15, (String) null, modifierM525size3ABfNKs15, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                } else {
                    i9 = 0;
                }
                i8 = i9;
                o00O000o.OooO0O0(composerStartRestartGroup);
            } else {
                arrangement2 = arrangement;
                companion4 = companion2;
                i8 = 0;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM480paddingVpY3zN4$default15 = PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance15, companion, 1.0f, false, 2, null), Dp.m3775constructorimpl(f11113), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_18 = arrangement2.m392spacedBy0680j_4(Dp.m3775constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o11115 = o00O0OOO.OooO00o(companion4, horizontalOrVerticalM392spacedBy0680j_18, composerStartRestartGroup, 6, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i8);
            CompositionLocalMap currentCompositionLocalMap11115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11115 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o11115, composerM1320constructorimpl2, currentCompositionLocalMap11115);
            if (composerM1320constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(i8, function3ModifierMaterializerOf11115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance15 = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-783769020);
            if (str2.length() > 0) {
                i8 = 1;
            }
            if (i8 != 0) {
                TextKt.m1261Text4IGK_g(str2, (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38612OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i3 >> 3) & 14) | 3072, 3120, 120818);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1888402424);
            if (str3.length() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                Modifier modifierFillMaxWidth$default15 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r15);
                int iM3729getEllipsisgIe3tQ112 = TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8();
                PlatformTextStyle platformTextStyle15 = new PlatformTextStyle(true);
                long sp15 = TextUnitKt.getSp(14);
                long j15 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
                if (p596o0oo000O.OooO0o.OooO0o0()) {
                    textDirectionM3687boximpl = null;
                } else {
                    textDirectionM3687boximpl = TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco());
                }
                p539o0o0Oo00.OooO0OO.OooO00o(modifierFillMaxWidth$default15, str3, false, list2, null, null, new TextStyle(j15, sp15, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, textDirectionM3687boximpl, 0L, (TextIndent) null, platformTextStyle15, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null), false, iM3729getEllipsisgIe3tQ112, 2, null, null, null, OooO0O0.f52579OooO0Oo, composerStartRestartGroup, ((i3 >> 3) & 112) | 906170758, 3462, 2192);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            list3 = list2;
            z6 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str, str2, str3, list3, z6, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(String str, String str2, String str3, String str4, String str5, long j, Painter painter, Composer composer, int i) {
        boolean z;
        Arrangement arrangement;
        ComposeUiNode.Companion companion;
        int i2;
        int i3;
        int i4;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(1285373931);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1285373931, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.ItemViewEvent (MomentSendShare.kt:527)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 12;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o000.OooO00o(f, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(93))), o0O0o.f48230o000o0o0, null, 2, null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement2 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0OO.OooO00o(arrangement2, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-556131297);
        if (str.length() > 0) {
            float f2 = 6;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            float f3 = 144;
            float f4 = 81;
            float f5 = 8;
            Modifier modifierClip = ClipKt.clip(SizeKt.m527sizeVpY3zN4(companion2, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f4)), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(f5)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.animation.Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierClip);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            oO0OOo0o.OooO00o(p184o00o00O0.OooO0OO.OooO0oo(o0000O0.OooO00o(f3), o0000O0.OooO00o(f4), str), o000.OooO00o(f5, SizeKt.fillMaxSize$default(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, 1, null)), null, 0.0f, 0L, false, composerStartRestartGroup, 0, 60);
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            Modifier modifierOooO0O0 = com.app.base.protobuf.OooO0O0.OooO0O0(f2, o0O0O00.OooO0OO(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion2, companion3.getBottomStart()), 0.0f, 1, null), Dp.m3775constructorimpl(24)), CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0O0o.f48092OooO00o), Color.m1671boximpl(o0O0o.f48118OooOoo)}), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f5), Dp.m3775constructorimpl(f5), 3, null), true), 0.0f, 2, null, composerStartRestartGroup, 693286680);
            MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO0OO.OooO00o(arrangement2, centerVertically2, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO00o3, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            z = false;
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            companion = companion4;
            arrangement = arrangement2;
            ImageKt.Image(painter, (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            TextKt.m1261Text4IGK_g(str5, PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), j, TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 12) & 14) | 3120 | ((i >> 9) & 896), 3120, 120816);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            i2 = -1323940314;
            i3 = 2;
        } else {
            z = false;
            arrangement = arrangement2;
            companion = companion4;
            i2 = -1323940314;
            i3 = 2;
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i5 = i3;
        int i6 = i2;
        boolean z2 = z;
        Arrangement arrangement3 = arrangement;
        ComposeUiNode.Companion companion5 = companion;
        Modifier modifierOooO0O1 = com.app.base.protobuf.OooO0O0.OooO0O0(f, SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null), 0.0f, i5, null, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o4 = androidx.compose.animation.Oooo000.OooO00o(companion3, z2, composerStartRestartGroup, z2 ? 1 : 0, i6);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z2 ? 1 : 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl4, measurePolicyOooO00o4, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        androidx.compose.animation.OooOO0.OooO00o(z2 ? 1 : 0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-348844644);
        if ((str2.length() > 0 ? (char) 1 : z2 ? 1 : 0) != 0) {
            i4 = i5;
            obj = null;
            TextKt.m1261Text4IGK_g(str2, PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(8), 0.0f, 0.0f, 13, null), o0O0o.f48127Oooo0O0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 3) & 14) | 3120, 3120, 120816);
        } else {
            i4 = i5;
            obj = null;
        }
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically3 = companion3.getCenterVertically();
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion2, companion3.getBottomStart()), 0.0f, 1, obj), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(25), 7, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO0OO.OooO00o(arrangement3, centerVertically3, composerStartRestartGroup, 48, i6);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, z2);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl5, measurePolicyOooO00o5, composerM1320constructorimpl5, currentCompositionLocalMap5);
        if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        androidx.compose.animation.OooOO0.OooO00o(z2, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(o0OOO0o.ic_moment_send_event_room, composerStartRestartGroup, z2 ? 1 : 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        long j2 = o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o;
        long sp = TextUnitKt.getSp(11);
        TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
        float f6 = i4;
        TextKt.m1261Text4IGK_g(str3, PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), j2, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 6) & 14) | 3120, 3120, 120816);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically4 = companion3.getCenterVertically();
        Modifier modifierM482paddingqDBjuR0$default2 = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion2, companion3.getBottomStart()), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(8), 7, null);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO0OO.OooO00o(arrangement3, centerVertically4, composerStartRestartGroup, 48, i6);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o6 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl6, measurePolicyOooO00o6, composerM1320constructorimpl6, currentCompositionLocalMap6);
        if (composerM1320constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash6, composerM1320constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(o0OOO0o.ic_moment_send_event_id, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        TextKt.m1261Text4IGK_g(str4, PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f6), 0.0f, 0.0f, 0.0f, 14, null), o0000oo.OooO0OO(composerStartRestartGroup).f38623OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion6.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i >> 9) & 14) | 3120, 3120, 120816);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(str, str2, str3, str4, str5, j, painter, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0Oo(MomentSendModel momentSendModel, Function0<Unit> function0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-888330563);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-888330563, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetEditData (MomentSendShare.kt:90)");
        }
        int type = momentSendModel.getType();
        int value = MomentType.Share.getValue();
        o0o0Oo o0o0oo = f52568OooO00o;
        if (type == value) {
            composerStartRestartGroup.startReplaceableGroup(1930481626);
            MomentForwardContent forwardContent = momentSendModel.getForwardContent();
            if (forwardContent != null) {
                o0o0oo.OooO0oO(forwardContent, composerStartRestartGroup, 56);
                function0.invoke();
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else if (type == MomentType.Forward.getValue()) {
            composerStartRestartGroup.startReplaceableGroup(1930481880);
            MomentDetailModel forward = momentSendModel.getForward();
            if (forward != null) {
                o0o0oo.OooO0o(forward, composerStartRestartGroup, 56);
                function0.invoke();
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else if (type == MomentType.Event.getValue()) {
            composerStartRestartGroup.startReplaceableGroup(1930482132);
            MomentForwardContent forwardContent2 = momentSendModel.getForwardContent();
            if (forwardContent2 != null) {
                o0o0oo.OooO0o0(forwardContent2, composerStartRestartGroup, 56);
                function0.invoke();
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1930482332);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(momentSendModel, function0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(MomentDetailModel momentDetailModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1761472492);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1761472492, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetEditForwardView (MomentSendShare.kt:129)");
        }
        if (momentDetailModel.getType() == MomentType.Image.getValue()) {
            Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, 1261467092, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(momentDetailModel.getNickName(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objOooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objOooO00o;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(momentDetailModel.getImageInfoList().isEmpty() ^ true ? momentDetailModel.getImageInfoList().get(0).getUrl() : "", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                MomentSendContentModel content = momentDetailModel.getContent();
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.code.android.util.o0OoOo0.OooOOO(content != null ? content.getContent() : null, ""), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0((String) mutableState2.getValue(), (String) mutableState.getValue(), (String) ((MutableState) objRememberedValue2).getValue(), null, false, composerStartRestartGroup, (i << 12) & 458752, 24);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1261467792);
            MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
            if (forwardContent != null) {
                String image = forwardContent.getImage();
                String name = forwardContent.getName();
                String content2 = forwardContent.getContent();
                o0o0Oo o0o0oo = f52568OooO00o;
                MomentSendContentModel content3 = momentDetailModel.getContent();
                o0o0oo.OooO0O0(image, name, content2, content3 != null ? content3.getAt() : null, false, composerStartRestartGroup, 200704, 16);
            }
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(momentDetailModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(MomentForwardContent momentForwardContent, Composer composer, int i) {
        String strOooO0o;
        String str;
        Painter painter;
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2014091893);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014091893, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetEditEventView (MomentSendShare.kt:164)");
        }
        int i2 = o0OOO0o.ic_event_time;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0);
        long j2 = o0O0o.f48093OooO0O0;
        if (momentForwardContent.getEventState() == EventState.INSTANCE.getInProgress()) {
            composerStartRestartGroup.startReplaceableGroup(-1226013287);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0OOO0o.ic_event_time_progress, composerStartRestartGroup, 0);
            long j3 = o0O0o.f48126Oooo00o;
            String strOooO0OO = o0000.OooO0OO(o000OOo.Event_Live_Now);
            composerStartRestartGroup.endReplaceableGroup();
            painter = painterPainterResource2;
            j = j3;
            str = strOooO0OO;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1226013064);
            if (p606o0oo0O0.Oooo000.OooO00o(momentForwardContent.getStartTime()) > 0) {
                painterPainterResource = PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0);
                strOooO0o = p606o0oo0O0.OooOOOO.OooO0o(p606o0oo0O0.Oooo000.OooO00o(momentForwardContent.getStartTime()));
            } else {
                strOooO0o = "";
            }
            composerStartRestartGroup.endReplaceableGroup();
            str = strOooO0o;
            painter = painterPainterResource;
            j = j2;
        }
        OooO0OO(momentForwardContent.getImage(), momentForwardContent.getName(), com.code.android.util.o0OoOo0.OooOOO(momentForwardContent.getRoomName(), ""), com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(momentForwardContent.getRoomIdx())), str, j, painter, composerStartRestartGroup, ((i << 18) & 29360128) | 2097152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(momentForwardContent, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oO(MomentForwardContent momentForwardContent, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(98660710);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(98660710, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetEditShareView (MomentSendShare.kt:123)");
        }
        OooO0O0(momentForwardContent.getImage(), momentForwardContent.getName(), momentForwardContent.getContent(), null, false, composerStartRestartGroup, (i << 12) & 458752, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(momentForwardContent, i));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:68:0x0133  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(MomentDetailModel momentDetailModel, MomentSendModel momentSendModel, Composer composer, int i) {
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        MomentImageModel momentImageModel;
        Composer composerStartRestartGroup = composer.startRestartGroup(626622918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626622918, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetForwardMoment (MomentSendShare.kt:316)");
        }
        momentSendModel.setNotifyUserid(String.valueOf(momentDetailModel.getUserId()));
        MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
        String image = forwardContent != null ? forwardContent.getImage() : "";
        MomentPoll value = momentDetailModel.getMomentPollLiveData().getValue();
        if (value != null && value.getExpireTime() > 0) {
            if (image.length() == 0) {
                image = value.getShareDefaultImg();
            }
        }
        ArrayList arrayListOooO00o = o000OOo0.OooO00o(momentDetailModel.getPFName(), momentDetailModel.getPNumber(), momentDetailModel.getSize());
        if (arrayListOooO00o.size() > 0 && (momentImageModel = (MomentImageModel) arrayListOooO00o.get(0)) != null) {
            if (image.length() == 0) {
                image = momentImageModel.getUrl();
            }
        }
        MomentSendContentModel content = momentDetailModel.getContent();
        String strOooOOO = com.code.android.util.o0OoOo0.OooOOO(content != null ? content.getContent() : null, "");
        int type = momentDetailModel.getType();
        if (type == MomentType.Image.getValue()) {
            if (StringsKt.isBlank(strOooOOO)) {
                strOooOOO = o0000.OooO0OO(o000OOo._photo_);
            }
        } else {
            if (type != MomentType.Poll.getValue()) {
                if (type == MomentType.Video.getValue()) {
                    image = momentDetailModel.getCoverPic();
                    if (StringsKt.isBlank(strOooOOO)) {
                        strOooOOO = o0000.OooO0OO(o000OOo._Video_);
                    }
                    z = true;
                } else if (StringsKt.isBlank(strOooOOO)) {
                    strOooOOO = p004OooO0oO.o000oOoO.OooO00o("[", o0000.OooO0OO(o000OOo.Other), "]");
                }
                String str = strOooOOO;
                String str2 = image;
                String strOooO00o = momentDetailModel.getNickName().length() > 0 ? o00O00OO.OooO00o("@", momentDetailModel.getNickName()) : "";
                MomentSendContentModel content2 = momentDetailModel.getContent();
                OooO0O0(str2, strOooO00o, str, content2 != null ? content2.getAt() : null, z, composerStartRestartGroup, ((i << 9) & 458752) | 4096, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(momentDetailModel, momentSendModel, i));
            }
            if (StringsKt.isBlank(strOooOOO)) {
                strOooOOO = o0000.OooO0OO(o000OOo._Poll_);
            }
        }
        z = false;
        String str3 = strOooOOO;
        String str4 = image;
        String strOooO00o2 = momentDetailModel.getNickName().length() > 0 ? o00O00OO.OooO00o("@", momentDetailModel.getNickName()) : "";
        MomentSendContentModel content3 = momentDetailModel.getContent();
        OooO0O0(str4, strOooO00o2, str3, content3 != null ? content3.getAt() : null, z, composerStartRestartGroup, ((i << 9) & 458752) | 4096, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(momentDetailModel, momentSendModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v60 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0(MomentSendShareModel momentSendShareModel, MomentSendModel momentSendModel, EditTextSpan editTextSpan, Function0<Unit> function0, Composer composer, int i) {
        ?? Find;
        MomentSendContentTopicModel momentSendContentTopicModel;
        MomentSendContentAtModel momentSendContentAtModel;
        Composer composerStartRestartGroup = composer.startRestartGroup(84192126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(84192126, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetShareForwardData (MomentSendShare.kt:201)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int type = momentSendShareModel.getType();
        int value = MomentType.Share.getValue();
        o0o0Oo o0o0oo = f52568OooO00o;
        if (type == value) {
            composerStartRestartGroup.startReplaceableGroup(1820405476);
            RoomShareModel roomShareModel = momentSendShareModel.getRoomShareModel();
            composerStartRestartGroup.startReplaceableGroup(1820405565);
            if (roomShareModel != null) {
                o0o0oo.OooOO0o(roomShareModel, composerStartRestartGroup, 56);
                function0.invoke();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(momentSendShareModel, momentSendModel, editTextSpan, function0, i));
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ShareWebModel webModel = momentSendShareModel.getWebModel();
            composerStartRestartGroup.startReplaceableGroup(1820405753);
            if (webModel != null) {
                o0o0oo.OooOOO0(webModel, composerStartRestartGroup, 56);
                function0.invoke();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new OooOo(momentSendShareModel, momentSendModel, editTextSpan, function0, i));
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            EventModel eventModel = momentSendShareModel.getEventModel();
            if (eventModel != null) {
                o0o0oo.OooOO0O(eventModel, composerStartRestartGroup, 56);
                function0.invoke();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup3.updateScope(new Oooo000(momentSendShareModel, momentSendModel, editTextSpan, function0, i));
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else if (type == MomentType.Forward.getValue()) {
            composerStartRestartGroup.startReplaceableGroup(1820406144);
            MomentDetailModel forwardMomentDetailModel = momentSendShareModel.getForwardMomentDetailModel();
            if (forwardMomentDetailModel != null) {
                if (forwardMomentDetailModel.getForward() != null) {
                    composerStartRestartGroup.startReplaceableGroup(-240550670);
                    MomentDetailModel forward = forwardMomentDetailModel.getForward();
                    if (forward != null) {
                        o0o0oo.OooO(forward, momentSendModel, composerStartRestartGroup, 456);
                        editTextSpan.getText().append("//");
                        MomentDetailModel forwardMomentDetailModel2 = momentSendShareModel.getForwardMomentDetailModel();
                        if (forwardMomentDetailModel2 != null) {
                            editTextSpan.OooO00o("@", new o0O000(forwardMomentDetailModel2.getNickName(), forwardMomentDetailModel2.getUserId()));
                            editTextSpan.getText().append(": ");
                            MomentSendContentModel content = forwardMomentDetailModel2.getContent();
                            int i2 = 0;
                            if (content != null) {
                                int i3 = 1;
                                if ((content.getAt() == null || content.getAt().isEmpty()) && (content.getTopic() == null || content.getTopic().isEmpty())) {
                                    o0O0O0o0.OooO0OO(content.getContent(), context, editTextSpan, true);
                                } else {
                                    String content2 = content.getContent();
                                    ArrayList<String> arrayList = new ArrayList();
                                    try {
                                        ArrayList arrayList2 = new ArrayList();
                                        Pattern patternCompile = Pattern.compile("[/@|#{]{2}\\d[/}]{1}");
                                        Matcher matcher = patternCompile.matcher(content2);
                                        while (matcher.find()) {
                                            arrayList2.add(matcher.group());
                                        }
                                        String[] strArrSplit = patternCompile.split(content2);
                                        int size = arrayList2.size() > strArrSplit.length ? arrayList2.size() : strArrSplit.length;
                                        for (int i4 = 0; i4 < size; i4++) {
                                            if (i4 < strArrSplit.length) {
                                                arrayList.add(strArrSplit[i4]);
                                            }
                                            if (i4 < arrayList2.size()) {
                                                arrayList.add((String) arrayList2.get(i4));
                                            }
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    HashMap map = new HashMap();
                                    p597o0oo00O.OooOOOO.OooO0O0("allSplitList = " + arrayList + "\n sendPostModelContent = " + content);
                                    for (String str : arrayList) {
                                        StringBuilder sbOooO0O0 = p004OooO0oO.o0OoOo0.OooO0O0("allSplitList\n item ", str, "\n textView.getText = ");
                                        sbOooO0O0.append((Object) editTextSpan.getText());
                                        p597o0oo00O.OooOOOO.OooO(sbOooO0O0.toString());
                                        try {
                                            Find = Pattern.compile("[/@|#{]{2}\\d[/}]{1}").matcher(str).find();
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                            Find = i2;
                                        }
                                        if (Find == 0 || TextUtils.isEmpty(str)) {
                                            Spanned spannedOooO0O0 = o0O0O0o0.OooO0O0(context, str);
                                            editTextSpan.getEditableText().append((CharSequence) spannedOooO0O0);
                                            p597o0oo00O.OooOOOO.OooO0oO("不是 MaskItem，注意：App自定义Emoji \n item = '" + str + "'\n itemNew = '" + ((Object) spannedOooO0O0) + "'\n textView.getText = '" + ((Object) editTextSpan.getText()) + "'");
                                        } else {
                                            String strSubstring = str.substring(i2, i3);
                                            if (map.containsKey(strSubstring)) {
                                                map.put(strSubstring, Integer.valueOf(((Integer) map.get(strSubstring)).intValue() + i3));
                                            } else {
                                                map.put(strSubstring, Integer.valueOf(i2));
                                            }
                                            if (strSubstring.equals("@") && content.getAt() != null && !content.getAt().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < content.getAt().size() && (momentSendContentAtModel = content.getAt().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                                p597o0oo00O.OooOOOO.OooO0O0("匹配 @User sendPostModelContentAt " + momentSendContentAtModel);
                                                editTextSpan.OooO00o("@", new o0O000(momentSendContentAtModel.getName(), Long.valueOf(momentSendContentAtModel.getUid()).longValue()));
                                            }
                                            if (strSubstring.equals("#") && content.getTopic() != null && !content.getTopic().isEmpty() && ((Integer) map.get(strSubstring)).intValue() < content.getTopic().size() && (momentSendContentTopicModel = content.getTopic().get(((Integer) map.get(strSubstring)).intValue())) != null) {
                                                p597o0oo00O.OooOOOO.OooO0O0("匹配 话题 sendPostModelContentTopic " + momentSendContentTopicModel);
                                                Long l = 0L;
                                                editTextSpan.OooO00o("#", new o0O000(momentSendContentTopicModel.getTx(), l.longValue()));
                                            }
                                        }
                                        i2 = 0;
                                        i3 = 1;
                                    }
                                    p597o0oo00O.OooOOOO.OooO0o("hasAtNum \n text = " + ((Object) editTextSpan.getText()));
                                }
                                i2 = 0;
                            }
                            editTextSpan.setSelection(i2);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-240549510);
                    o0o0oo.OooO0oo(forwardMomentDetailModel, momentSendModel, composerStartRestartGroup, 456);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                function0.invoke();
            }
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1820407740);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup4.updateScope(new Oooo0(momentSendShareModel, momentSendModel, editTextSpan, function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0O(EventModel eventModel, Composer composer, int i) {
        String strOooO0o;
        String str;
        Painter painter;
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(20149314);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(20149314, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetShareForwardEventView (MomentSendShare.kt:282)");
        }
        int i2 = o0OOO0o.ic_event_time;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0);
        long j2 = o0O0o.f48093OooO0O0;
        if (eventModel.getEventState() == EventState.INSTANCE.getInProgress()) {
            composerStartRestartGroup.startReplaceableGroup(-1089926029);
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(o0OOO0o.ic_event_time_progress, composerStartRestartGroup, 0);
            long j3 = o0O0o.f48126Oooo00o;
            String strOooO0OO = o0000.OooO0OO(o000OOo.Event_Live_Now);
            composerStartRestartGroup.endReplaceableGroup();
            painter = painterPainterResource2;
            j = j3;
            str = strOooO0OO;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1089925806);
            if (p606o0oo0O0.Oooo000.OooO00o(eventModel.getEventStartTime()) > 0) {
                painterPainterResource = PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0);
                strOooO0o = p606o0oo0O0.OooOOOO.OooO0o(p606o0oo0O0.Oooo000.OooO00o(eventModel.getEventStartTime()));
            } else {
                strOooO0o = "";
            }
            composerStartRestartGroup.endReplaceableGroup();
            str = strOooO0o;
            painter = painterPainterResource;
            j = j2;
        }
        OooO0OO(eventModel.getEventImage(), eventModel.getEventName(), com.code.android.util.o0OoOo0.OooOOO(eventModel.getRoomName(), ""), com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(eventModel.getRoomIdx())), str, j, painter, composerStartRestartGroup, ((i << 18) & 29360128) | 2097152);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(eventModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOO0o(RoomShareModel roomShareModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1411338493);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1411338493, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetShareForwardRoomView (MomentSendShare.kt:266)");
        }
        String imageUrl = roomShareModel.getImageUrl();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
        String title = roomShareModel.getTitle();
        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
        String content = roomShareModel.getContent();
        Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
        OooO0O0(imageUrl, title, content, null, false, composerStartRestartGroup, (i << 12) & 458752, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(roomShareModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooOOO0(ShareWebModel shareWebModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1399154469);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1399154469, i, -1, "com.yalla.yalla.ui.composable.moment.MomentSendShare.SetShareForwardWebView (MomentSendShare.kt:272)");
        }
        OooO0O0(com.code.android.util.o0OoOo0.OooOOO(shareWebModel.getImagesUrl(), ""), com.code.android.util.o0OoOo0.OooOOO(shareWebModel.getTitle(), ""), com.code.android.util.o0OoOo0.OooOOO(shareWebModel.getContent(), ""), null, false, composerStartRestartGroup, (i << 12) & 458752, 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(shareWebModel, i));
    }
}
