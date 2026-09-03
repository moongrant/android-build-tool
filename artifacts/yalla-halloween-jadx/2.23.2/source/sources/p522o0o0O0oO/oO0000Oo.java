package p522o0o0O0oO;

import android.content.Context;
import android.text.InputFilter;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.qiniu.android.storage.Configuration;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRichTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichTextField.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,115:1\n67#2,5:116\n72#2:149\n76#2:171\n78#3,11:121\n91#3:170\n456#4,8:132\n464#4,3:146\n25#4:150\n83#4,3:158\n467#4,3:167\n4144#5,6:140\n1097#6,6:151\n1097#6,6:161\n76#7:157\n81#8:172\n107#8,2:173\n*S KotlinDebug\n*F\n+ 1 RichTextField.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldKt\n*L\n49#1:116,5\n49#1:149\n49#1:171\n49#1:121,11\n49#1:170\n49#1:132,8\n49#1:146,3\n55#1:150\n67#1:158,3\n49#1:167,3\n49#1:140,6\n55#1:151,6\n67#1:161,6\n65#1:157\n55#1:172\n55#1:173,2\n*E\n"})
public final class oO0000Oo {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f53080OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<oO00000o, Unit> f53081OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f53082OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53083OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f53084OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f53085OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f53086OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53087OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<RichEditText, Unit> f53088OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Modifier f53089OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f53090OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f53091OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f53092OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f53093OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function1<? super oO00000o, Unit> function1, int i, long j, long j2, String str, long j3, int i2, Function0<Unit> function0, Function1<? super RichEditText, Unit> function2, Function1<? super String, Unit> function3, Modifier modifier, int i3, int i4, int i5) {
            super(2);
            this.f53081OooO0Oo = function1;
            this.f53083OooO0o0 = i;
            this.f53082OooO0o = j;
            this.f53084OooO0oO = j2;
            this.f53085OooO0oo = str;
            this.f53080OooO = j3;
            this.f53086OooOO0 = i2;
            this.f53087OooOO0O = function0;
            this.f53088OooOO0o = function2;
            this.f53090OooOOO0 = function3;
            this.f53089OooOOO = modifier;
            this.f53091OooOOOO = i3;
            this.f53092OooOOOo = i4;
            this.f53093OooOOo0 = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oO0000Oo.OooO00o(this.f53081OooO0Oo, this.f53083OooO0o0, this.f53082OooO0o, this.f53084OooO0oO, this.f53085OooO0oo, this.f53080OooO, this.f53086OooOO0, this.f53087OooOO0O, this.f53088OooOO0o, this.f53090OooOOO0, this.f53089OooOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f53091OooOOOO | 1), RecomposeScopeImplKt.updateChangedFlags(this.f53092OooOOOo), this.f53093OooOOo0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53094OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RichEditText, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53095OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RichEditText richEditText) {
            RichEditText it = richEditText;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f53096OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRichTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichTextField.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldKt$RichTextField$4$1$1\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,115:1\n49#2:116\n65#2,16:117\n93#2,3:133\n*S KotlinDebug\n*F\n+ 1 RichTextField.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldKt$RichTextField$4$1$1\n*L\n103#1:116\n103#1:117,16\n103#1:133,3\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<Context, RichEditText> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f53097OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f53098OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f53099OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f53100OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f53101OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f53102OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<oO00000o, Unit> f53103OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<RichEditText, Unit> f53104OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f53105OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f53106OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f53107OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(long j, long j2, long j3, boolean z, int i, int i2, Function1<? super oO00000o, Unit> function1, Function1<? super RichEditText, Unit> function2, Function0<Unit> function0, Function1<? super String, Unit> function3, MutableState<String> mutableState) {
            super(1);
            this.f53098OooO0Oo = j;
            this.f53100OooO0o0 = j2;
            this.f53099OooO0o = j3;
            this.f53101OooO0oO = z;
            this.f53102OooO0oo = i;
            this.f53097OooO = i2;
            this.f53103OooOO0 = function1;
            this.f53104OooOO0O = function2;
            this.f53105OooOO0o = function0;
            this.f53107OooOOO0 = function3;
            this.f53106OooOOO = mutableState;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
        @Override // kotlin.jvm.functions.Function1
        public final RichEditText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            RichEditText editText = new RichEditText(it);
            editText.setGravity(8388627);
            editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(2000)});
            float fM3956getValueimpl = TextUnit.m3956getValueimpl(this.f53098OooO0Oo);
            Intrinsics.checkNotNullParameter(editText, "<this>");
            int i = 2;
            editText.setTextSize(2, fM3956getValueimpl);
            editText.setBackground(null);
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
            editText.setShowSoftInputOnFocus(true);
            editText.setPadding(0, 0, 0, 0);
            editText.setIncludeFontPadding(false);
            editText.setTextColor(ColorKt.m1735toArgb8_81llA(this.f53100OooO0o0));
            editText.setHintTextColor(ColorKt.m1735toArgb8_81llA(this.f53099OooO0o));
            editText.setTextDirection(this.f53101OooO0oO ? 3 : 4);
            editText.clearFocus();
            editText.setInputType(1);
            editText.setSingleLine(false);
            ImeAction.Companion companion = ImeAction.INSTANCE;
            int iM3477getDefaulteUduSuo = companion.m3477getDefaulteUduSuo();
            int i2 = this.f53102OooO0oo;
            if (ImeAction.m3465equalsimpl0(i2, iM3477getDefaulteUduSuo)) {
                i = 6;
            } else if (ImeAction.m3465equalsimpl0(i2, companion.m3483getSearcheUduSuo())) {
                i = 3;
            } else if (!ImeAction.m3465equalsimpl0(i2, companion.m3479getGoeUduSuo())) {
                if (ImeAction.m3465equalsimpl0(i2, companion.m3478getDoneeUduSuo())) {
                    i = 6;
                } else if (ImeAction.m3465equalsimpl0(i2, companion.m3484getSendeUduSuo())) {
                    i = 4;
                } else if (ImeAction.m3465equalsimpl0(i2, companion.m3480getNexteUduSuo())) {
                    i = 5;
                } else if (ImeAction.m3465equalsimpl0(i2, companion.m3481getNoneeUduSuo())) {
                    i = 1;
                } else {
                    i = 6;
                }
            }
            editText.setImeOptions(i);
            editText.setOnEditorActionListener(new oO0000o0(this.f53105OooOO0o));
            editText.setMaxLines(this.f53097OooO);
            editText.setVerticalScrollBarEnabled(true);
            oO00000o oo00000o = new oO00000o();
            Intrinsics.checkNotNullParameter(editText, "editText");
            oo00000o.f53077OooO0Oo = editText;
            editText.addTextChangedListener(new oO0000O(oo00000o));
            editText.addTextChangedListener(new oO000(this.f53107OooOOO0, editText, this.f53106OooOOO));
            this.f53103OooOO0.invoke(oo00000o);
            this.f53104OooOO0O.invoke(editText);
            return editText;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x012c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x013c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x014d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x0157  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:127:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x01be  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01da  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:157:0x0200  */
    /* JADX WARN: Code duplicated, block: B:158:0x0203  */
    /* JADX WARN: Code duplicated, block: B:160:0x0207  */
    /* JADX WARN: Code duplicated, block: B:161:0x020a  */
    /* JADX WARN: Code duplicated, block: B:163:0x020e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0211  */
    /* JADX WARN: Code duplicated, block: B:166:0x0215  */
    /* JADX WARN: Code duplicated, block: B:167:0x0229  */
    /* JADX WARN: Code duplicated, block: B:171:0x0251  */
    /* JADX WARN: Code duplicated, block: B:174:0x0291  */
    /* JADX WARN: Code duplicated, block: B:177:0x029d  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:186:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:189:0x0304  */
    /* JADX WARN: Code duplicated, block: B:190:0x0306  */
    /* JADX WARN: Code duplicated, block: B:193:0x030a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0316  */
    /* JADX WARN: Code duplicated, block: B:196:0x0318  */
    /* JADX WARN: Code duplicated, block: B:198:0x031b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0368  */
    /* JADX WARN: Code duplicated, block: B:202:0x036a  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b0 A[LOOP:0: B:204:0x03ae->B:205:0x03b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:215:0x0426  */
    /* JADX WARN: Code duplicated, block: B:220:0x0442  */
    /* JADX WARN: Code duplicated, block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull Function1<? super oO00000o, Unit> onControllerCreated, int i, long j, long j2, @NotNull String hintText, long j3, int i2, @Nullable Function0<Unit> function0, @Nullable Function1<? super RichEditText, Unit> function1, @Nullable Function1<? super String, Unit> function2, @Nullable Modifier modifier, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long sp;
        long j4;
        long j5;
        int iM3477getDefaulteUduSuo;
        Function0<Unit> function3;
        Function1<? super RichEditText, Unit> function4;
        Function1<? super String, Unit> function5;
        int i23;
        Function0<Unit> function6;
        int i24;
        Function1<? super String, Unit> function7;
        Function1<? super RichEditText, Unit> function8;
        long j6;
        long j7;
        long j8;
        long j9;
        int i25;
        Function0<Unit> function9;
        int i26;
        Function1<? super String, Unit> function10;
        Function1<? super RichEditText, Unit> function11;
        Modifier modifier2;
        long j10;
        int i27;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        Object objRememberedValue;
        MutableState mutableState;
        boolean z;
        boolean z2;
        Object[] objArr;
        boolean zChanged;
        Object obj;
        Composer composer2;
        Modifier modifier3;
        int i28;
        long j11;
        long j12;
        long j13;
        int i29;
        Function0<Unit> function12;
        Function1<? super RichEditText, Unit> function13;
        Function1<? super String, Unit> function14;
        boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onControllerCreated, "onControllerCreated");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Composer composerStartRestartGroup = composer.startRestartGroup(590903781);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changedInstance(onControllerCreated) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i30 = i5 & 2;
        if (i30 == 0) {
            if ((i3 & 112) == 0) {
                i6 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 != 0) {
                if ((i3 & 896) == 0) {
                    if (composerStartRestartGroup.changed(j)) {
                        i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i8 = 128;
                    }
                    i6 |= i8;
                }
                if ((i3 & 7168) != 0) {
                    i6 |= ((i5 & 8) == 0 || !composerStartRestartGroup.changed(j2)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
                }
                if ((i5 & 16) != 0) {
                    i6 |= 24576;
                } else if ((57344 & i3) == 0) {
                    if (composerStartRestartGroup.changed(hintText)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i6 |= i9;
                }
                if ((458752 & i3) != 0) {
                    i6 |= ((i5 & 32) == 0 || !composerStartRestartGroup.changed(j3)) ? 65536 : 131072;
                }
                i10 = i5 & 64;
                if (i10 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i11 = 524288;
                    }
                    i6 |= i11;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i13 = 8388608;
                    } else {
                        i13 = Configuration.BLOCK_SIZE;
                    }
                    i6 |= i13;
                }
                i14 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i14 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i6 |= i15;
                }
                i16 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i16 != 0) {
                    i6 |= 805306368;
                } else if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    i6 |= i17;
                }
                i18 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i18 != 0) {
                    if ((i4 & 14) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i21 = i4 | i20;
                    } else {
                        i19 = i4;
                    }
                    if ((i6 & 1533916891) != 306783378 && (i19 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        i28 = i;
                        j11 = j;
                        j12 = j2;
                        j13 = j3;
                        i29 = i2;
                        function13 = function1;
                        function14 = function2;
                        modifier3 = modifier;
                        composer2 = composerStartRestartGroup;
                        function12 = function0;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i30 != 0) {
                                i22 = 4;
                            } else {
                                i22 = i;
                            }
                            if (i7 != 0) {
                                sp = TextUnitKt.getSp(14);
                            } else {
                                sp = j;
                            }
                            if ((i5 & 8) != 0) {
                                j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                                i6 &= -7169;
                            } else {
                                j4 = j2;
                            }
                            if ((i5 & 32) != 0) {
                                j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                                i6 &= -458753;
                            } else {
                                j5 = j3;
                            }
                            if (i10 != 0) {
                                iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                            } else {
                                iM3477getDefaulteUduSuo = i2;
                            }
                            if (i12 != 0) {
                                function3 = OooO00o.f53094OooO0Oo;
                            } else {
                                function3 = function0;
                            }
                            if (i14 != 0) {
                                function4 = OooO0O0.f53095OooO0Oo;
                            } else {
                                function4 = function1;
                            }
                            if (i16 != 0) {
                                function5 = OooO0OO.f53096OooO0Oo;
                            } else {
                                function5 = function2;
                            }
                            if (i18 != 0) {
                                j8 = sp;
                                j9 = j4;
                                i25 = i22;
                                function9 = function3;
                                i26 = iM3477getDefaulteUduSuo;
                                function10 = function5;
                                function11 = function4;
                                modifier2 = Modifier.INSTANCE;
                                j10 = j5;
                            } else {
                                i23 = i6;
                                function6 = function3;
                                i24 = iM3477getDefaulteUduSuo;
                                function7 = function5;
                                function8 = function4;
                                j6 = sp;
                                j7 = j4;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                            }
                            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                            Modifier modifierThen = Modifier.INSTANCE.then(modifier2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                            }
                            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-1157712582);
                            if (hintText.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (((String) mutableState.getValue()).length() == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                                }
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            zChanged = false;
                            for (i27 = 0; i27 < 11; i27++) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                            }
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                obj = oooO0o;
                                OooO0o oooO0o = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                                composer2 = composerStartRestartGroup;
                                composer2.updateRememberedValue(obj);
                            } else {
                                obj = objRememberedValue2;
                                composer2 = composerStartRestartGroup;
                            }
                            composer2.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            i28 = i25;
                            j11 = j8;
                            j12 = j9;
                            j13 = j10;
                            i29 = i26;
                            function12 = function9;
                            function13 = function11;
                            function14 = function10;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i5 & 8) != 0) {
                                i6 &= -7169;
                            }
                            if ((i5 & 32) != 0) {
                                i6 &= -458753;
                            }
                            i22 = i;
                            j6 = j;
                            j7 = j2;
                            j5 = j3;
                            function6 = function0;
                            function8 = function1;
                            function7 = function2;
                            i23 = i6;
                            i24 = i2;
                        }
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                        }
                        Alignment centerStart2 = Alignment.INSTANCE.getCenterStart();
                        Modifier modifierThen2 = Modifier.INSTANCE.then(modifier2);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
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
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap2);
                        if (composerM1320constructorimpl.getInserting()) {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        } else {
                            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-1157712582);
                        if (hintText.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (((String) mutableState.getValue()).length() == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                            }
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        zChanged = false;
                        while (i27 < 11) {
                            zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                        }
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            obj = oooO0o;
                            OooO0o oooO0o2 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                            composer2 = composerStartRestartGroup;
                            composer2.updateRememberedValue(obj);
                        } else {
                            obj = oooO0o2;
                            OooO0o oooO0o3 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                            composer2 = composerStartRestartGroup;
                            composer2.updateRememberedValue(obj);
                        }
                        composer2.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        i28 = i25;
                        j11 = j8;
                        j12 = j9;
                        j13 = j10;
                        i29 = i26;
                        function12 = function9;
                        function13 = function11;
                        function14 = function10;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
                }
                i21 = i4 | 6;
                i19 = i21;
                if ((i6 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    } else {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                    }
                    Alignment centerStart3 = Alignment.INSTANCE.getCenterStart();
                    Modifier modifierThen3 = Modifier.INSTANCE.then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart3, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen3);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap3);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-1157712582);
                    if (hintText.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((String) mutableState.getValue()).length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i27 < 11) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                    }
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = oooO0o3;
                        OooO0o oooO0o4 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = oooO0o4;
                        OooO0o oooO0o5 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    i28 = i25;
                    j11 = j8;
                    j12 = j9;
                    j13 = j10;
                    i29 = i26;
                    function12 = function9;
                    function13 = function11;
                    function14 = function10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    } else {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                    }
                    Alignment centerStart4 = Alignment.INSTANCE.getCenterStart();
                    Modifier modifierThen4 = Modifier.INSTANCE.then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(centerStart4, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierThen4);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1320constructorimpl, currentCompositionLocalMap4);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-1157712582);
                    if (hintText.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((String) mutableState.getValue()).length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i27 < 11) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                    }
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = oooO0o5;
                        OooO0o oooO0o6 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = oooO0o6;
                        OooO0o oooO0o7 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    i28 = i25;
                    j11 = j8;
                    j12 = j9;
                    j13 = j10;
                    i29 = i26;
                    function12 = function9;
                    function13 = function11;
                    function14 = function10;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
            }
            i6 |= 384;
            if ((i3 & 7168) != 0) {
                i6 |= ((i5 & 8) == 0 || !composerStartRestartGroup.changed(j2)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((i5 & 16) != 0) {
                i6 |= 24576;
            } else if ((57344 & i3) == 0) {
                if (composerStartRestartGroup.changed(hintText)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i6 |= i9;
            }
            if ((458752 & i3) != 0) {
                i6 |= ((i5 & 32) == 0 || !composerStartRestartGroup.changed(j3)) ? 65536 : 131072;
            }
            i10 = i5 & 64;
            if (i10 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i6 |= i11;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i6 |= i13;
            }
            i14 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i14 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i6 |= i15;
            }
            i16 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i16 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i17;
            }
            i18 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i18 != 0) {
                if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                } else {
                    i19 = i4;
                }
                if ((i6 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    } else {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                    }
                    Alignment centerStart5 = Alignment.INSTANCE.getCenterStart();
                    Modifier modifierThen5 = Modifier.INSTANCE.then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(centerStart5, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierThen5);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1320constructorimpl, currentCompositionLocalMap5);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-1157712582);
                    if (hintText.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((String) mutableState.getValue()).length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i27 < 11) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                    }
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = oooO0o7;
                        OooO0o oooO0o8 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = oooO0o8;
                        OooO0o oooO0o9 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    i28 = i25;
                    j11 = j8;
                    j12 = j9;
                    j13 = j10;
                    i29 = i26;
                    function12 = function9;
                    function13 = function11;
                    function14 = function10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    } else {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                    }
                    Alignment centerStart6 = Alignment.INSTANCE.getCenterStart();
                    Modifier modifierThen6 = Modifier.INSTANCE.then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(centerStart6, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierThen6);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1320constructorimpl, currentCompositionLocalMap6);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-1157712582);
                    if (hintText.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((String) mutableState.getValue()).length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i27 < 11) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                    }
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = oooO0o9;
                        OooO0o oooO0o10 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = oooO0o10;
                        OooO0o oooO0o11 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    i28 = i25;
                    j11 = j8;
                    j12 = j9;
                    j13 = j10;
                    i29 = i26;
                    function12 = function9;
                    function13 = function11;
                    function14 = function10;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
            }
            i21 = i4 | 6;
            i19 = i21;
            if ((i6 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                } else {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                }
                Alignment centerStart7 = Alignment.INSTANCE.getCenterStart();
                Modifier modifierThen7 = Modifier.INSTANCE.then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(centerStart7, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierThen7);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1320constructorimpl, currentCompositionLocalMap7);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-1157712582);
                if (hintText.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((String) mutableState.getValue()).length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i27 < 11) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                }
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = oooO0o11;
                    OooO0o oooO0o12 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = oooO0o12;
                    OooO0o oooO0o13 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                i28 = i25;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                i29 = i26;
                function12 = function9;
                function13 = function11;
                function14 = function10;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                } else {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                }
                Alignment centerStart8 = Alignment.INSTANCE.getCenterStart();
                Modifier modifierThen8 = Modifier.INSTANCE.then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(centerStart8, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierThen8);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM1320constructorimpl, currentCompositionLocalMap8);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-1157712582);
                if (hintText.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((String) mutableState.getValue()).length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i27 < 11) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                }
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = oooO0o13;
                    OooO0o oooO0o14 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = oooO0o14;
                    OooO0o oooO0o15 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                i28 = i25;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                i29 = i26;
                function12 = function9;
                function13 = function11;
                function14 = function10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
        }
        i6 |= 48;
        i7 = i5 & 4;
        if (i7 != 0) {
            if ((i3 & 896) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i8 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i8 = 128;
                }
                i6 |= i8;
            }
            if ((i3 & 7168) != 0) {
                i6 |= ((i5 & 8) == 0 || !composerStartRestartGroup.changed(j2)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
            }
            if ((i5 & 16) != 0) {
                i6 |= 24576;
            } else if ((57344 & i3) == 0) {
                if (composerStartRestartGroup.changed(hintText)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i6 |= i9;
            }
            if ((458752 & i3) != 0) {
                i6 |= ((i5 & 32) == 0 || !composerStartRestartGroup.changed(j3)) ? 65536 : 131072;
            }
            i10 = i5 & 64;
            if (i10 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i11 = 524288;
                }
                i6 |= i11;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                i6 |= 12582912;
            } else if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i13 = 8388608;
                } else {
                    i13 = Configuration.BLOCK_SIZE;
                }
                i6 |= i13;
            }
            i14 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i14 != 0) {
                i6 |= 100663296;
            } else if ((i3 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i6 |= i15;
            }
            i16 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i16 != 0) {
                i6 |= 805306368;
            } else if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
                i6 |= i17;
            }
            i18 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i18 != 0) {
                if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i21 = i4 | i20;
                } else {
                    i19 = i4;
                }
                if ((i6 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    } else {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                    }
                    Alignment centerStart9 = Alignment.INSTANCE.getCenterStart();
                    Modifier modifierThen9 = Modifier.INSTANCE.then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(centerStart9, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierThen9);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM1320constructorimpl, currentCompositionLocalMap9);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-1157712582);
                    if (hintText.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((String) mutableState.getValue()).length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i27 < 11) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                    }
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = oooO0o15;
                        OooO0o oooO0o16 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = oooO0o16;
                        OooO0o oooO0o17 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    i28 = i25;
                    j11 = j8;
                    j12 = j9;
                    j13 = j10;
                    i29 = i26;
                    function12 = function9;
                    function13 = function11;
                    function14 = function10;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    } else {
                        if (i30 != 0) {
                            i22 = 4;
                        } else {
                            i22 = i;
                        }
                        if (i7 != 0) {
                            sp = TextUnitKt.getSp(14);
                        } else {
                            sp = j;
                        }
                        if ((i5 & 8) != 0) {
                            j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                            i6 &= -7169;
                        } else {
                            j4 = j2;
                        }
                        if ((i5 & 32) != 0) {
                            j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                            i6 &= -458753;
                        } else {
                            j5 = j3;
                        }
                        if (i10 != 0) {
                            iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                        } else {
                            iM3477getDefaulteUduSuo = i2;
                        }
                        if (i12 != 0) {
                            function3 = OooO00o.f53094OooO0Oo;
                        } else {
                            function3 = function0;
                        }
                        if (i14 != 0) {
                            function4 = OooO0O0.f53095OooO0Oo;
                        } else {
                            function4 = function1;
                        }
                        if (i16 != 0) {
                            function5 = OooO0OO.f53096OooO0Oo;
                        } else {
                            function5 = function2;
                        }
                        if (i18 != 0) {
                            j8 = sp;
                            j9 = j4;
                            i25 = i22;
                            function9 = function3;
                            i26 = iM3477getDefaulteUduSuo;
                            function10 = function5;
                            function11 = function4;
                            modifier2 = Modifier.INSTANCE;
                            j10 = j5;
                        } else {
                            i23 = i6;
                            function6 = function3;
                            i24 = iM3477getDefaulteUduSuo;
                            function7 = function5;
                            function8 = function4;
                            j6 = sp;
                            j7 = j4;
                            i26 = i24;
                            i25 = i22;
                            j8 = j6;
                            j9 = j7;
                            function9 = function6;
                            j10 = j5;
                            function11 = function8;
                            function10 = function7;
                            i6 = i23;
                            modifier2 = modifier;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                    }
                    Alignment centerStart10 = Alignment.INSTANCE.getCenterStart();
                    Modifier modifierThen10 = Modifier.INSTANCE.then(modifier2);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(centerStart10, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierThen10);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM1320constructorimpl, currentCompositionLocalMap10);
                    if (composerM1320constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    OooOO0.OooO00o(0, function3ModifierMaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-1157712582);
                    if (hintText.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (((String) mutableState.getValue()).length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                    composerStartRestartGroup.startReplaceableGroup(-568225417);
                    zChanged = false;
                    while (i27 < 11) {
                        zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                    }
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        obj = oooO0o17;
                        OooO0o oooO0o18 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    } else {
                        obj = oooO0o18;
                        OooO0o oooO0o19 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                        composer2 = composerStartRestartGroup;
                        composer2.updateRememberedValue(obj);
                    }
                    composer2.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    i28 = i25;
                    j11 = j8;
                    j12 = j9;
                    j13 = j10;
                    i29 = i26;
                    function12 = function9;
                    function13 = function11;
                    function14 = function10;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
            }
            i21 = i4 | 6;
            i19 = i21;
            if ((i6 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                } else {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                }
                Alignment centerStart11 = Alignment.INSTANCE.getCenterStart();
                Modifier modifierThen11 = Modifier.INSTANCE.then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(centerStart11, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierThen11);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM1320constructorimpl, currentCompositionLocalMap11);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-1157712582);
                if (hintText.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((String) mutableState.getValue()).length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i27 < 11) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                }
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = oooO0o19;
                    OooO0o oooO0o110 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = oooO0o110;
                    OooO0o oooO0o111 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                i28 = i25;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                i29 = i26;
                function12 = function9;
                function13 = function11;
                function14 = function10;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                } else {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                }
                Alignment centerStart12 = Alignment.INSTANCE.getCenterStart();
                Modifier modifierThen12 = Modifier.INSTANCE.then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(centerStart12, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierThen12);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM1320constructorimpl, currentCompositionLocalMap12);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-1157712582);
                if (hintText.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((String) mutableState.getValue()).length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i27 < 11) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                }
                Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = oooO0o111;
                    OooO0o oooO0o112 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = oooO0o112;
                    OooO0o oooO0o113 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                i28 = i25;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                i29 = i26;
                function12 = function9;
                function13 = function11;
                function14 = function10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
        }
        i6 |= 384;
        if ((i3 & 7168) != 0) {
            i6 |= ((i5 & 8) == 0 || !composerStartRestartGroup.changed(j2)) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 2048;
        }
        if ((i5 & 16) != 0) {
            i6 |= 24576;
        } else if ((57344 & i3) == 0) {
            if (composerStartRestartGroup.changed(hintText)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i6 |= i9;
        }
        if ((458752 & i3) != 0) {
            i6 |= ((i5 & 32) == 0 || !composerStartRestartGroup.changed(j3)) ? 65536 : 131072;
        }
        i10 = i5 & 64;
        if (i10 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(i2)) {
                i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i11 = 524288;
            }
            i6 |= i11;
        }
        i12 = i5 & 128;
        if (i12 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i13 = 8388608;
            } else {
                i13 = Configuration.BLOCK_SIZE;
            }
            i6 |= i13;
        }
        i14 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i14 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i6 |= i15;
        }
        i16 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i16 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i17 = 536870912;
            } else {
                i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
            }
            i6 |= i17;
        }
        i18 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i18 != 0) {
            if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i21 = i4 | i20;
            } else {
                i19 = i4;
            }
            if ((i6 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                } else {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                }
                Alignment centerStart13 = Alignment.INSTANCE.getCenterStart();
                Modifier modifierThen13 = Modifier.INSTANCE.then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(centerStart13, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierThen13);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM1320constructorimpl, currentCompositionLocalMap13);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-1157712582);
                if (hintText.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((String) mutableState.getValue()).length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i27 < 11) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                }
                Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = oooO0o113;
                    OooO0o oooO0o114 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = oooO0o114;
                    OooO0o oooO0o115 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                i28 = i25;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                i29 = i26;
                function12 = function9;
                function13 = function11;
                function14 = function10;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                } else {
                    if (i30 != 0) {
                        i22 = 4;
                    } else {
                        i22 = i;
                    }
                    if (i7 != 0) {
                        sp = TextUnitKt.getSp(14);
                    } else {
                        sp = j;
                    }
                    if ((i5 & 8) != 0) {
                        j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                        i6 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    if ((i5 & 32) != 0) {
                        j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                        i6 &= -458753;
                    } else {
                        j5 = j3;
                    }
                    if (i10 != 0) {
                        iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                    } else {
                        iM3477getDefaulteUduSuo = i2;
                    }
                    if (i12 != 0) {
                        function3 = OooO00o.f53094OooO0Oo;
                    } else {
                        function3 = function0;
                    }
                    if (i14 != 0) {
                        function4 = OooO0O0.f53095OooO0Oo;
                    } else {
                        function4 = function1;
                    }
                    if (i16 != 0) {
                        function5 = OooO0OO.f53096OooO0Oo;
                    } else {
                        function5 = function2;
                    }
                    if (i18 != 0) {
                        j8 = sp;
                        j9 = j4;
                        i25 = i22;
                        function9 = function3;
                        i26 = iM3477getDefaulteUduSuo;
                        function10 = function5;
                        function11 = function4;
                        modifier2 = Modifier.INSTANCE;
                        j10 = j5;
                    } else {
                        i23 = i6;
                        function6 = function3;
                        i24 = iM3477getDefaulteUduSuo;
                        function7 = function5;
                        function8 = function4;
                        j6 = sp;
                        j7 = j4;
                        i26 = i24;
                        i25 = i22;
                        j8 = j6;
                        j9 = j7;
                        function9 = function6;
                        j10 = j5;
                        function11 = function8;
                        function10 = function7;
                        i6 = i23;
                        modifier2 = modifier;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
                }
                Alignment centerStart14 = Alignment.INSTANCE.getCenterStart();
                Modifier modifierThen14 = Modifier.INSTANCE.then(modifier2);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(centerStart14, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierThen14);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion14, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM1320constructorimpl, currentCompositionLocalMap14);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-1157712582);
                if (hintText.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (((String) mutableState.getValue()).length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                zChanged = false;
                while (i27 < 11) {
                    zChanged |= composerStartRestartGroup.changed(objArr[i27]);
                }
                Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    obj = oooO0o115;
                    OooO0o oooO0o116 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = oooO0o116;
                    OooO0o oooO0o117 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                    composer2 = composerStartRestartGroup;
                    composer2.updateRememberedValue(obj);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                i28 = i25;
                j11 = j8;
                j12 = j9;
                j13 = j10;
                i29 = i26;
                function12 = function9;
                function13 = function11;
                function14 = function10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
        }
        i21 = i4 | 6;
        i19 = i21;
        if ((i6 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i30 != 0) {
                    i22 = 4;
                } else {
                    i22 = i;
                }
                if (i7 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j;
                }
                if ((i5 & 8) != 0) {
                    j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    i6 &= -7169;
                } else {
                    j4 = j2;
                }
                if ((i5 & 32) != 0) {
                    j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                    i6 &= -458753;
                } else {
                    j5 = j3;
                }
                if (i10 != 0) {
                    iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                } else {
                    iM3477getDefaulteUduSuo = i2;
                }
                if (i12 != 0) {
                    function3 = OooO00o.f53094OooO0Oo;
                } else {
                    function3 = function0;
                }
                if (i14 != 0) {
                    function4 = OooO0O0.f53095OooO0Oo;
                } else {
                    function4 = function1;
                }
                if (i16 != 0) {
                    function5 = OooO0OO.f53096OooO0Oo;
                } else {
                    function5 = function2;
                }
                if (i18 != 0) {
                    j8 = sp;
                    j9 = j4;
                    i25 = i22;
                    function9 = function3;
                    i26 = iM3477getDefaulteUduSuo;
                    function10 = function5;
                    function11 = function4;
                    modifier2 = Modifier.INSTANCE;
                    j10 = j5;
                } else {
                    i23 = i6;
                    function6 = function3;
                    i24 = iM3477getDefaulteUduSuo;
                    function7 = function5;
                    function8 = function4;
                    j6 = sp;
                    j7 = j4;
                    i26 = i24;
                    i25 = i22;
                    j8 = j6;
                    j9 = j7;
                    function9 = function6;
                    j10 = j5;
                    function11 = function8;
                    function10 = function7;
                    i6 = i23;
                    modifier2 = modifier;
                }
            } else {
                if (i30 != 0) {
                    i22 = 4;
                } else {
                    i22 = i;
                }
                if (i7 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j;
                }
                if ((i5 & 8) != 0) {
                    j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    i6 &= -7169;
                } else {
                    j4 = j2;
                }
                if ((i5 & 32) != 0) {
                    j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                    i6 &= -458753;
                } else {
                    j5 = j3;
                }
                if (i10 != 0) {
                    iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                } else {
                    iM3477getDefaulteUduSuo = i2;
                }
                if (i12 != 0) {
                    function3 = OooO00o.f53094OooO0Oo;
                } else {
                    function3 = function0;
                }
                if (i14 != 0) {
                    function4 = OooO0O0.f53095OooO0Oo;
                } else {
                    function4 = function1;
                }
                if (i16 != 0) {
                    function5 = OooO0OO.f53096OooO0Oo;
                } else {
                    function5 = function2;
                }
                if (i18 != 0) {
                    j8 = sp;
                    j9 = j4;
                    i25 = i22;
                    function9 = function3;
                    i26 = iM3477getDefaulteUduSuo;
                    function10 = function5;
                    function11 = function4;
                    modifier2 = Modifier.INSTANCE;
                    j10 = j5;
                } else {
                    i23 = i6;
                    function6 = function3;
                    i24 = iM3477getDefaulteUduSuo;
                    function7 = function5;
                    function8 = function4;
                    j6 = sp;
                    j7 = j4;
                    i26 = i24;
                    i25 = i22;
                    j8 = j6;
                    j9 = j7;
                    function9 = function6;
                    j10 = j5;
                    function11 = function8;
                    function10 = function7;
                    i6 = i23;
                    modifier2 = modifier;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
            }
            Alignment centerStart15 = Alignment.INSTANCE.getCenterStart();
            Modifier modifierThen15 = Modifier.INSTANCE.then(modifier2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(centerStart15, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            constructor = companion15.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierThen15);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM1320constructorimpl, currentCompositionLocalMap15);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-1157712582);
            if (hintText.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((String) mutableState.getValue()).length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                z2 = true;
            } else {
                z2 = false;
            }
            objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i27 < 11) {
                zChanged |= composerStartRestartGroup.changed(objArr[i27]);
            }
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                obj = oooO0o117;
                OooO0o oooO0o118 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(obj);
            } else {
                obj = oooO0o118;
                OooO0o oooO0o119 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(obj);
            }
            composer2.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            i28 = i25;
            j11 = j8;
            j12 = j9;
            j13 = j10;
            i29 = i26;
            function12 = function9;
            function13 = function11;
            function14 = function10;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i30 != 0) {
                    i22 = 4;
                } else {
                    i22 = i;
                }
                if (i7 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j;
                }
                if ((i5 & 8) != 0) {
                    j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    i6 &= -7169;
                } else {
                    j4 = j2;
                }
                if ((i5 & 32) != 0) {
                    j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                    i6 &= -458753;
                } else {
                    j5 = j3;
                }
                if (i10 != 0) {
                    iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                } else {
                    iM3477getDefaulteUduSuo = i2;
                }
                if (i12 != 0) {
                    function3 = OooO00o.f53094OooO0Oo;
                } else {
                    function3 = function0;
                }
                if (i14 != 0) {
                    function4 = OooO0O0.f53095OooO0Oo;
                } else {
                    function4 = function1;
                }
                if (i16 != 0) {
                    function5 = OooO0OO.f53096OooO0Oo;
                } else {
                    function5 = function2;
                }
                if (i18 != 0) {
                    j8 = sp;
                    j9 = j4;
                    i25 = i22;
                    function9 = function3;
                    i26 = iM3477getDefaulteUduSuo;
                    function10 = function5;
                    function11 = function4;
                    modifier2 = Modifier.INSTANCE;
                    j10 = j5;
                } else {
                    i23 = i6;
                    function6 = function3;
                    i24 = iM3477getDefaulteUduSuo;
                    function7 = function5;
                    function8 = function4;
                    j6 = sp;
                    j7 = j4;
                    i26 = i24;
                    i25 = i22;
                    j8 = j6;
                    j9 = j7;
                    function9 = function6;
                    j10 = j5;
                    function11 = function8;
                    function10 = function7;
                    i6 = i23;
                    modifier2 = modifier;
                }
            } else {
                if (i30 != 0) {
                    i22 = 4;
                } else {
                    i22 = i;
                }
                if (i7 != 0) {
                    sp = TextUnitKt.getSp(14);
                } else {
                    sp = j;
                }
                if ((i5 & 8) != 0) {
                    j4 = o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO;
                    i6 &= -7169;
                } else {
                    j4 = j2;
                }
                if ((i5 & 32) != 0) {
                    j5 = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
                    i6 &= -458753;
                } else {
                    j5 = j3;
                }
                if (i10 != 0) {
                    iM3477getDefaulteUduSuo = ImeAction.INSTANCE.m3477getDefaulteUduSuo();
                } else {
                    iM3477getDefaulteUduSuo = i2;
                }
                if (i12 != 0) {
                    function3 = OooO00o.f53094OooO0Oo;
                } else {
                    function3 = function0;
                }
                if (i14 != 0) {
                    function4 = OooO0O0.f53095OooO0Oo;
                } else {
                    function4 = function1;
                }
                if (i16 != 0) {
                    function5 = OooO0OO.f53096OooO0Oo;
                } else {
                    function5 = function2;
                }
                if (i18 != 0) {
                    j8 = sp;
                    j9 = j4;
                    i25 = i22;
                    function9 = function3;
                    i26 = iM3477getDefaulteUduSuo;
                    function10 = function5;
                    function11 = function4;
                    modifier2 = Modifier.INSTANCE;
                    j10 = j5;
                } else {
                    i23 = i6;
                    function6 = function3;
                    i24 = iM3477getDefaulteUduSuo;
                    function7 = function5;
                    function8 = function4;
                    j6 = sp;
                    j7 = j4;
                    i26 = i24;
                    i25 = i22;
                    j8 = j6;
                    j9 = j7;
                    function9 = function6;
                    j10 = j5;
                    function11 = function8;
                    function10 = function7;
                    i6 = i23;
                    modifier2 = modifier;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590903781, i6, i19, "com.yalla.yalla.ui.composable.rich_text_filed.RichTextField (RichTextField.kt:47)");
            }
            Alignment centerStart16 = Alignment.INSTANCE.getCenterStart();
            Modifier modifierThen16 = Modifier.INSTANCE.then(modifier2);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(centerStart16, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            constructor = companion16.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierThen16);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion16, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy16, composerM1320constructorimpl, currentCompositionLocalMap16);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-1157712582);
            if (hintText.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (((String) mutableState.getValue()).length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    TextKt.m1261Text4IGK_g(hintText, (Modifier) null, j10, j8, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i6 >> 12) & 14) | ((i6 >> 9) & 896) | ((i6 << 3) & 7168), 3120, 120818);
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Ltr) {
                z2 = true;
            } else {
                z2 = false;
            }
            objArr = new Object[]{TextUnit.m3946boximpl(j8), Color.m1671boximpl(j9), Color.m1671boximpl(j10), Boolean.valueOf(z2), ImeAction.m3462boximpl(i26), function9, Integer.valueOf(i25), mutableState, function10, onControllerCreated, function11};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            zChanged = false;
            while (i27 < 11) {
                zChanged |= composerStartRestartGroup.changed(objArr[i27]);
            }
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                obj = oooO0o119;
                OooO0o oooO0o1110 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(obj);
            } else {
                obj = oooO0o1110;
                OooO0o oooO0o1111 = new OooO0o(j8, j9, j10, z2, i26, i25, onControllerCreated, function11, function9, function10, mutableState);
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(obj);
            }
            composer2.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) obj, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer2, 48, 4);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            i28 = i25;
            j11 = j8;
            j12 = j9;
            j13 = j10;
            i29 = i26;
            function12 = function9;
            function13 = function11;
            function14 = function10;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(onControllerCreated, i28, j11, j12, hintText, j13, i29, function12, function13, function14, modifier3, i3, i4, i5));
    }
}
