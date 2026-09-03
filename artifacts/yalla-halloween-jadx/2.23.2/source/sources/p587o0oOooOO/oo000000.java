package p587o0oOooOO;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAutoSizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeText.kt\ncom/yalla/yalla/ui/view/AutoSizeTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,92:1\n76#2:93\n25#3:94\n36#3:101\n36#3:108\n67#3,3:115\n66#3:118\n1097#4,6:95\n1097#4,6:102\n1097#4,6:109\n1097#4,6:119\n81#5:125\n107#5,2:126\n81#5:128\n107#5,2:129\n*S KotlinDebug\n*F\n+ 1 AutoSizeText.kt\ncom/yalla/yalla/ui/view/AutoSizeTextKt\n*L\n38#1:93\n40#1:94\n41#1:101\n75#1:108\n58#1:115,3\n58#1:118\n40#1:95,6\n41#1:102,6\n75#1:109,6\n58#1:119,6\n40#1:125\n40#1:126,2\n41#1:128\n41#1:129,2\n*E\n"})
public final class oo000000 {

    public static final class OooO00o extends Lambda implements Function1<ContentDrawScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f56893OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableState<Boolean> mutableState) {
            super(1);
            this.f56893OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ContentDrawScope contentDrawScope) {
            ContentDrawScope drawWithContent = contentDrawScope;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            if (this.f56893OooO0Oo.getValue().booleanValue()) {
                drawWithContent.drawContent();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ w f56894OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableState<Float> f56895OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f56896OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(w wVar, MutableState<Boolean> mutableState, MutableState<Float> mutableState2) {
            super(1);
            this.f56894OooO0Oo = wVar;
            this.f56896OooO0o0 = mutableState;
            this.f56895OooO0o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult it = textLayoutResult;
            Intrinsics.checkNotNullParameter(it, "it");
            boolean didOverflowHeight = it.getDidOverflowHeight();
            MutableState<Boolean> mutableState = this.f56896OooO0o0;
            if (!didOverflowHeight || mutableState.getValue().booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            } else {
                MutableState<Float> mutableState2 = this.f56895OooO0o;
                float fFloatValue = mutableState2.getValue().floatValue();
                w wVar = this.f56894OooO0Oo;
                float fM3956getValueimpl = fFloatValue - TextUnit.m3956getValueimpl(wVar.f57004OooO0OO);
                long j = wVar.f57002OooO00o;
                if (fM3956getValueimpl <= TextUnit.m3956getValueimpl(j)) {
                    mutableState2.setValue(Float.valueOf(TextUnit.m3956getValueimpl(j)));
                    mutableState.setValue(Boolean.TRUE);
                } else {
                    mutableState2.setValue(Float.valueOf(fM3956getValueimpl));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ FontWeight f56897OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56898OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f56899OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ w f56900OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f56901OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ FontStyle f56902OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ FontFamily f56903OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ long f56904OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ TextDecoration f56905OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ long f56906OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ TextAlign f56907OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f56908OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ boolean f56909OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ TextStyle f56910OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f56911OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public final /* synthetic */ int f56912OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public final /* synthetic */ int f56913OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final /* synthetic */ int f56914OooOo00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, w wVar, Modifier modifier, long j, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j2, TextDecoration textDecoration, TextAlign textAlign, long j3, int i, boolean z, int i2, TextStyle textStyle, int i3, int i4, int i5) {
            super(2);
            this.f56898OooO0Oo = str;
            this.f56900OooO0o0 = wVar;
            this.f56899OooO0o = modifier;
            this.f56901OooO0oO = j;
            this.f56902OooO0oo = fontStyle;
            this.f56897OooO = fontWeight;
            this.f56903OooOO0 = fontFamily;
            this.f56904OooOO0O = j2;
            this.f56905OooOO0o = textDecoration;
            this.f56907OooOOO0 = textAlign;
            this.f56906OooOOO = j3;
            this.f56908OooOOOO = i;
            this.f56909OooOOOo = z;
            this.f56911OooOOo0 = i2;
            this.f56910OooOOo = textStyle;
            this.f56912OooOOoo = i3;
            this.f56914OooOo00 = i4;
            this.f56913OooOo0 = i5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oo000000.OooO00o(this.f56898OooO0Oo, this.f56900OooO0o0, this.f56899OooO0o, this.f56901OooO0oO, this.f56902OooO0oo, this.f56897OooO, this.f56903OooOO0, this.f56904OooOO0O, this.f56905OooOO0o, this.f56907OooOOO0, this.f56906OooOOO, this.f56908OooOOOO, this.f56909OooOOOo, this.f56911OooOOo0, this.f56910OooOOo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f56912OooOOoo | 1), RecomposeScopeImplKt.updateChangedFlags(this.f56914OooOo00), this.f56913OooOo0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:102:0x0146  */
    /* JADX WARN: Code duplicated, block: B:103:0x0149  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:108:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:113:0x0169  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x018f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0196  */
    /* JADX WARN: Code duplicated, block: B:131:0x0199  */
    /* JADX WARN: Code duplicated, block: B:133:0x019d  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x021d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0225  */
    /* JADX WARN: Code duplicated, block: B:176:0x0253 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x0255  */
    /* JADX WARN: Code duplicated, block: B:178:0x0258  */
    /* JADX WARN: Code duplicated, block: B:180:0x025c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0263  */
    /* JADX WARN: Code duplicated, block: B:183:0x0267  */
    /* JADX WARN: Code duplicated, block: B:184:0x0269  */
    /* JADX WARN: Code duplicated, block: B:186:0x026d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0270  */
    /* JADX WARN: Code duplicated, block: B:189:0x0274  */
    /* JADX WARN: Code duplicated, block: B:190:0x0277  */
    /* JADX WARN: Code duplicated, block: B:192:0x027b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0282  */
    /* JADX WARN: Code duplicated, block: B:195:0x0286  */
    /* JADX WARN: Code duplicated, block: B:196:0x0288  */
    /* JADX WARN: Code duplicated, block: B:198:0x028c  */
    /* JADX WARN: Code duplicated, block: B:199:0x028e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0292  */
    /* JADX WARN: Code duplicated, block: B:202:0x0299  */
    /* JADX WARN: Code duplicated, block: B:204:0x029d  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:207:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:208:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:215:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:219:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:222:0x0305  */
    /* JADX WARN: Code duplicated, block: B:225:0x0330  */
    /* JADX WARN: Code duplicated, block: B:227:0x0336  */
    /* JADX WARN: Code duplicated, block: B:230:0x0363  */
    /* JADX WARN: Code duplicated, block: B:232:0x0369  */
    /* JADX WARN: Code duplicated, block: B:235:0x0396  */
    /* JADX WARN: Code duplicated, block: B:237:0x039c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0403  */
    /* JADX WARN: Code duplicated, block: B:245:0x0427  */
    /* JADX WARN: Code duplicated, block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull String text, @NotNull w fontSizeRange, @Nullable Modifier modifier, long j, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j2, @Nullable TextDecoration textDecoration, @Nullable TextAlign textAlign, long j3, int i, boolean z, int i2, @Nullable TextStyle textStyle, @Nullable Composer composer, int i3, int i4, int i5) {
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
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Modifier modifier2;
        long jM1717getUnspecified0d7_KjU;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        long jM3967getUnspecifiedXSAIIZE;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        long jM3967getUnspecifiedXSAIIZE2;
        int iM3728getClipgIe3tQ8;
        boolean z2;
        int i34;
        TextStyle textStyle2;
        TextDecoration textDecoration3;
        TextAlign textAlign3;
        int i35;
        boolean z3;
        int i36;
        TextStyle textStyle3;
        long j4;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j5;
        long j6;
        FontStyle fontStyle3;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        MutableState mutableState2;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChanged3;
        Object objRememberedValue4;
        Composer composer2;
        FontStyle fontStyle4;
        long j7;
        Modifier modifier4;
        FontWeight fontWeight4;
        FontFamily fontFamily4;
        long j8;
        TextDecoration textDecoration4;
        TextAlign textAlign4;
        long j9;
        int i37;
        boolean z4;
        int i38;
        TextStyle textStyle4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontSizeRange, "fontSizeRange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1603295712);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(fontSizeRange) ? 32 : 16;
        }
        int i39 = i5 & 4;
        if (i39 == 0) {
            if ((i3 & 896) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i7 = i5 & 8;
            i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i7 != 0) {
                i6 |= 3072;
            } else if ((i3 & 7168) == 0) {
                if (composerStartRestartGroup.changed(j)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i6 |= i9;
            }
            i10 = i5 & 16;
            i11 = 8192;
            if (i10 != 0) {
                i6 |= 24576;
            } else if ((i3 & 57344) == 0) {
                if (composerStartRestartGroup.changed(fontStyle)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i6 |= i12;
            }
            i13 = i5 & 32;
            if (i13 != 0) {
                i6 |= 196608;
            } else if ((i3 & 458752) == 0) {
                if (composerStartRestartGroup.changed(fontWeight)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i6 |= i14;
            }
            i15 = i5 & 64;
            if (i15 != 0) {
                i6 |= 1572864;
            } else if ((i3 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(fontFamily)) {
                    i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i16 = 524288;
                }
                i6 |= i16;
            }
            i17 = i5 & 128;
            if (i17 != 0) {
                i18 = i6 | 12582912;
            } else {
                i18 = i6;
                if ((i3 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(j2)) {
                        i19 = 8388608;
                    } else {
                        i19 = Configuration.BLOCK_SIZE;
                    }
                    i18 |= i19;
                }
            }
            i20 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i20 != 0) {
                if ((234881024 & i3) == 0) {
                    if (composerStartRestartGroup.changed(textDecoration)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i18 |= i21;
                }
                i22 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
                if (i22 != 0) {
                    if ((i3 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(textAlign)) {
                            i23 = 536870912;
                        } else {
                            i23 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    i24 = i18;
                    i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    if (i25 != 0) {
                        i26 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        if (composerStartRestartGroup.changed(j3)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i4 | i27;
                    } else {
                        i26 = i4;
                    }
                    i28 = i5 & 2048;
                    if (i28 != 0) {
                        i26 |= 48;
                    } else if ((i4 & 112) != 0) {
                        if (composerStartRestartGroup.changed(i)) {
                            i29 = 32;
                        } else {
                            i29 = 16;
                        }
                        i26 |= i29;
                    }
                    i30 = i26;
                    i31 = i5 & 4096;
                    if (i31 != 0) {
                        if ((i4 & 896) == 0) {
                            if (composerStartRestartGroup.changed(z)) {
                                i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            } else {
                                i32 = 128;
                            }
                            i30 |= i32;
                        }
                        i33 = i5 & 8192;
                        if (i33 != 0) {
                            if ((i4 & 7168) == 0) {
                                if (composerStartRestartGroup.changed(i2)) {
                                    i8 = 2048;
                                }
                                i30 |= i8;
                            }
                            if ((i4 & 57344) != 0) {
                                if ((i5 & 16384) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                    i11 = 16384;
                                }
                                i30 |= i11;
                            }
                            if ((i24 & 1533916891) != 306783378 && (46811 & i30) == 9362 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                j7 = j;
                                fontStyle4 = fontStyle;
                                fontWeight4 = fontWeight;
                                fontFamily4 = fontFamily;
                                textDecoration4 = textDecoration;
                                textAlign4 = textAlign;
                                j9 = j3;
                                i37 = i;
                                z4 = z;
                                i38 = i2;
                                textStyle4 = textStyle;
                                composer2 = composerStartRestartGroup;
                                j8 = j2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i39 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i7 != 0) {
                                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                    } else {
                                        jM1717getUnspecified0d7_KjU = j;
                                    }
                                    if (i10 != 0) {
                                        fontStyle2 = null;
                                    } else {
                                        fontStyle2 = fontStyle;
                                    }
                                    if (i13 != 0) {
                                        fontWeight2 = null;
                                    } else {
                                        fontWeight2 = fontWeight;
                                    }
                                    if (i15 != 0) {
                                        fontFamily2 = null;
                                    } else {
                                        fontFamily2 = fontFamily;
                                    }
                                    if (i17 != 0) {
                                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                    } else {
                                        jM3967getUnspecifiedXSAIIZE = j2;
                                    }
                                    if (i20 != 0) {
                                        textDecoration2 = null;
                                    } else {
                                        textDecoration2 = textDecoration;
                                    }
                                    if (i22 != 0) {
                                        textAlign2 = null;
                                    } else {
                                        textAlign2 = textAlign;
                                    }
                                    if (i25 != 0) {
                                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                    } else {
                                        jM3967getUnspecifiedXSAIIZE2 = j3;
                                    }
                                    if (i28 != 0) {
                                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                    } else {
                                        iM3728getClipgIe3tQ8 = i;
                                    }
                                    if (i31 != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = z;
                                    }
                                    if (i33 != 0) {
                                        i34 = Integer.MAX_VALUE;
                                    } else {
                                        i34 = i2;
                                    }
                                    if ((i5 & 16384) != 0) {
                                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                        i30 &= -57345;
                                    } else {
                                        textStyle2 = textStyle;
                                    }
                                    textDecoration3 = textDecoration2;
                                    textAlign3 = textAlign2;
                                    i35 = iM3728getClipgIe3tQ8;
                                    z3 = z2;
                                    i36 = i34;
                                    textStyle3 = textStyle2;
                                    j4 = jM1717getUnspecified0d7_KjU;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j5 = jM3967getUnspecifiedXSAIIZE;
                                    j6 = jM3967getUnspecifiedXSAIIZE2;
                                    fontStyle3 = fontStyle2;
                                    modifier3 = modifier2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i5 & 16384) != 0) {
                                        i30 &= -57345;
                                    }
                                    modifier3 = modifier;
                                    j4 = j;
                                    fontStyle3 = fontStyle;
                                    fontWeight3 = fontWeight;
                                    fontFamily3 = fontFamily;
                                    j5 = j2;
                                    textDecoration3 = textDecoration;
                                    textAlign3 = textAlign;
                                    j6 = j3;
                                    i35 = i;
                                    z3 = z;
                                    i36 = i2;
                                    textStyle3 = textStyle;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) objRememberedValue;
                                int i40 = i24 & 14;
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(text);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableState2 = (MutableState) objRememberedValue2;
                                long sp = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new OooO00o(mutableState2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                                composerStartRestartGroup.startReplaceableGroup(1618982084);
                                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composer2 = composerStartRestartGroup;
                                Modifier modifier5 = modifier3;
                                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent, j4, sp, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i40 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                fontStyle4 = fontStyle3;
                                j7 = j4;
                                modifier4 = modifier5;
                                fontWeight4 = fontWeight3;
                                fontFamily4 = fontFamily3;
                                j8 = j5;
                                textDecoration4 = textDecoration3;
                                textAlign4 = textAlign3;
                                j9 = j6;
                                i37 = i35;
                                z4 = z3;
                                i38 = i36;
                                textStyle4 = textStyle3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                        }
                        i30 |= 3072;
                        if ((i4 & 57344) != 0) {
                            if ((i5 & 16384) == 0) {
                                i11 = 16384;
                            }
                            i30 |= i11;
                        }
                        if ((i24 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i41 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp2 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent2 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier6 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent2, j4, sp2, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier6;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i42 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp3 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent3 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier7 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent3, j4, sp3, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i42 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier7;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                    }
                    i30 |= 384;
                    i33 = i5 & 8192;
                    if (i33 != 0) {
                        if ((i4 & 7168) == 0) {
                            if (composerStartRestartGroup.changed(i2)) {
                                i8 = 2048;
                            }
                            i30 |= i8;
                        }
                        if ((i4 & 57344) != 0) {
                            if ((i5 & 16384) == 0) {
                                i11 = 16384;
                            }
                            i30 |= i11;
                        }
                        if ((i24 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i43 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp4 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent4 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier8 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent4, j4, sp4, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i43 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier8;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i44 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp5 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent5 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier9 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent5, j4, sp5, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i44 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier9;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                    }
                    i30 |= 3072;
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i45 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp6 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent6 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier10 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent6, j4, sp6, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i45 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier10;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i46 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp7 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent7 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier11 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent7, j4, sp7, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i46 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier11;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i23 = 805306368;
                i18 |= i23;
                i24 = i18;
                i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i25 != 0) {
                    i26 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j3)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i4 | i27;
                } else {
                    i26 = i4;
                }
                i28 = i5 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i4 & 112) != 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                i30 = i26;
                i31 = i5 & 4096;
                if (i31 != 0) {
                    if ((i4 & 896) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i33 = i5 & 8192;
                    if (i33 != 0) {
                        if ((i4 & 7168) == 0) {
                            if (composerStartRestartGroup.changed(i2)) {
                                i8 = 2048;
                            }
                            i30 |= i8;
                        }
                        if ((i4 & 57344) != 0) {
                            if ((i5 & 16384) == 0) {
                                i11 = 16384;
                            }
                            i30 |= i11;
                        }
                        if ((i24 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i47 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp8 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent8 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier12 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent8, j4, sp8, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i47 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier12;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i48 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp9 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent9 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier13 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent9, j4, sp9, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i48 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier13;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                    }
                    i30 |= 3072;
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i49 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp10 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent10 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier14 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent10, j4, sp10, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i49 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier14;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i410 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp11 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent11 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier15 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11, j4, sp11, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i410 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier15;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 384;
                i33 = i5 & 8192;
                if (i33 != 0) {
                    if ((i4 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i8 = 2048;
                        }
                        i30 |= i8;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i411 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp12 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent12 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier16 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent12, j4, sp12, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier16;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i412 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp13 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent13 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier17 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent13, j4, sp13, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i412 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier17;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i413 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp14 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent14 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier18 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent14, j4, sp14, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i413 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier18;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i414 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp15 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent15 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier19 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent15, j4, sp15, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i414 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier19;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i18 |= 100663296;
            i22 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i22 != 0) {
                if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(textAlign)) {
                        i23 = 536870912;
                    } else {
                        i23 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                i24 = i18;
                i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i25 != 0) {
                    i26 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j3)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i4 | i27;
                } else {
                    i26 = i4;
                }
                i28 = i5 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i4 & 112) != 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                i30 = i26;
                i31 = i5 & 4096;
                if (i31 != 0) {
                    if ((i4 & 896) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i33 = i5 & 8192;
                    if (i33 != 0) {
                        if ((i4 & 7168) == 0) {
                            if (composerStartRestartGroup.changed(i2)) {
                                i8 = 2048;
                            }
                            i30 |= i8;
                        }
                        if ((i4 & 57344) != 0) {
                            if ((i5 & 16384) == 0) {
                                i11 = 16384;
                            }
                            i30 |= i11;
                        }
                        if ((i24 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i415 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp16 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent16 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier110 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent16, j4, sp16, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i415 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier110;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i416 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp17 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent17 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier111 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent17, j4, sp17, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i416 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier111;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                    }
                    i30 |= 3072;
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i417 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp18 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent18 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier112 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent18, j4, sp18, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i417 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier112;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i418 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp19 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent19 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier113 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent19, j4, sp19, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i418 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier113;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 384;
                i33 = i5 & 8192;
                if (i33 != 0) {
                    if ((i4 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i8 = 2048;
                        }
                        i30 |= i8;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i419 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp110 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent110 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier114 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent110, j4, sp110, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i419 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier114;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i4110 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp111 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent111 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier115 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111, j4, sp111, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4110 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier115;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4111 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp112 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent112 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier116 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent112, j4, sp112, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier116;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4112 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp113 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent113 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier117 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent113, j4, sp113, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4112 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier117;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i23 = 805306368;
            i18 |= i23;
            i24 = i18;
            i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i25 != 0) {
                i26 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(j3)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i4 | i27;
            } else {
                i26 = i4;
            }
            i28 = i5 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i4 & 112) != 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            i30 = i26;
            i31 = i5 & 4096;
            if (i31 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i33 = i5 & 8192;
                if (i33 != 0) {
                    if ((i4 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i8 = 2048;
                        }
                        i30 |= i8;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i4113 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp114 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent114 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier118 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent114, j4, sp114, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4113 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier118;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i4114 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp115 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent115 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier119 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent115, j4, sp115, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4114 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier119;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4115 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp116 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent116 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1110 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent116, j4, sp116, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4115 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier1110;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4116 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp117 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent117 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1111 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent117, j4, sp117, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4116 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier1111;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 384;
            i33 = i5 & 8192;
            if (i33 != 0) {
                if ((i4 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i8 = 2048;
                    }
                    i30 |= i8;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4117 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp118 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent118 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1112 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent118, j4, sp118, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4117 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier1112;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4118 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp119 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent119 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1113 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent119, j4, sp119, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4118 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier1113;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 3072;
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i11 = 16384;
                }
                i30 |= i11;
            }
            if ((i24 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i4119 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp1110 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent1110 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier1114 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1110, j4, sp1110, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4119 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier1114;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i41110 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp1111 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent1111 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier1115 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1111, j4, sp1111, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41110 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier1115;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
        }
        i6 |= 384;
        i7 = i5 & 8;
        i8 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            if (composerStartRestartGroup.changed(j)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i6 |= i9;
        }
        i10 = i5 & 16;
        i11 = 8192;
        if (i10 != 0) {
            i6 |= 24576;
        } else if ((i3 & 57344) == 0) {
            if (composerStartRestartGroup.changed(fontStyle)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i6 |= i12;
        }
        i13 = i5 & 32;
        if (i13 != 0) {
            i6 |= 196608;
        } else if ((i3 & 458752) == 0) {
            if (composerStartRestartGroup.changed(fontWeight)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i6 |= i14;
        }
        i15 = i5 & 64;
        if (i15 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(fontFamily)) {
                i16 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i16 = 524288;
            }
            i6 |= i16;
        }
        i17 = i5 & 128;
        if (i17 != 0) {
            i18 = i6 | 12582912;
        } else {
            i18 = i6;
            if ((i3 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(j2)) {
                    i19 = 8388608;
                } else {
                    i19 = Configuration.BLOCK_SIZE;
                }
                i18 |= i19;
            }
        }
        i20 = i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i20 != 0) {
            if ((234881024 & i3) == 0) {
                if (composerStartRestartGroup.changed(textDecoration)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i18 |= i21;
            }
            i22 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
            if (i22 != 0) {
                if ((i3 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(textAlign)) {
                        i23 = 536870912;
                    } else {
                        i23 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                i24 = i18;
                i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                if (i25 != 0) {
                    i26 = i4 | 6;
                } else if ((i4 & 14) == 0) {
                    if (composerStartRestartGroup.changed(j3)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i4 | i27;
                } else {
                    i26 = i4;
                }
                i28 = i5 & 2048;
                if (i28 != 0) {
                    i26 |= 48;
                } else if ((i4 & 112) != 0) {
                    if (composerStartRestartGroup.changed(i)) {
                        i29 = 32;
                    } else {
                        i29 = 16;
                    }
                    i26 |= i29;
                }
                i30 = i26;
                i31 = i5 & 4096;
                if (i31 != 0) {
                    if ((i4 & 896) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        } else {
                            i32 = 128;
                        }
                        i30 |= i32;
                    }
                    i33 = i5 & 8192;
                    if (i33 != 0) {
                        if ((i4 & 7168) == 0) {
                            if (composerStartRestartGroup.changed(i2)) {
                                i8 = 2048;
                            }
                            i30 |= i8;
                        }
                        if ((i4 & 57344) != 0) {
                            if ((i5 & 16384) == 0) {
                                i11 = 16384;
                            }
                            i30 |= i11;
                        }
                        if ((i24 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i41111 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp1112 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent1112 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier1116 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1112, j4, sp1112, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41111 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier1116;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            } else {
                                if (i39 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i7 != 0) {
                                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                                } else {
                                    jM1717getUnspecified0d7_KjU = j;
                                }
                                if (i10 != 0) {
                                    fontStyle2 = null;
                                } else {
                                    fontStyle2 = fontStyle;
                                }
                                if (i13 != 0) {
                                    fontWeight2 = null;
                                } else {
                                    fontWeight2 = fontWeight;
                                }
                                if (i15 != 0) {
                                    fontFamily2 = null;
                                } else {
                                    fontFamily2 = fontFamily;
                                }
                                if (i17 != 0) {
                                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE = j2;
                                }
                                if (i20 != 0) {
                                    textDecoration2 = null;
                                } else {
                                    textDecoration2 = textDecoration;
                                }
                                if (i22 != 0) {
                                    textAlign2 = null;
                                } else {
                                    textAlign2 = textAlign;
                                }
                                if (i25 != 0) {
                                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                                } else {
                                    jM3967getUnspecifiedXSAIIZE2 = j3;
                                }
                                if (i28 != 0) {
                                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                                } else {
                                    iM3728getClipgIe3tQ8 = i;
                                }
                                if (i31 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = z;
                                }
                                if (i33 != 0) {
                                    i34 = Integer.MAX_VALUE;
                                } else {
                                    i34 = i2;
                                }
                                if ((i5 & 16384) != 0) {
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                    i30 &= -57345;
                                } else {
                                    textStyle2 = textStyle;
                                }
                                textDecoration3 = textDecoration2;
                                textAlign3 = textAlign2;
                                i35 = iM3728getClipgIe3tQ8;
                                z3 = z2;
                                i36 = i34;
                                textStyle3 = textStyle2;
                                j4 = jM1717getUnspecified0d7_KjU;
                                fontWeight3 = fontWeight2;
                                fontFamily3 = fontFamily2;
                                j5 = jM3967getUnspecifiedXSAIIZE;
                                j6 = jM3967getUnspecifiedXSAIIZE2;
                                fontStyle3 = fontStyle2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue;
                            int i41112 = i24 & 14;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(text);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue2;
                            long sp1113 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(mutableState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new OooO00o(mutableState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierDrawWithContent1113 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                            composerStartRestartGroup.startReplaceableGroup(1618982084);
                            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged3) {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            } else {
                                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composer2 = composerStartRestartGroup;
                            Modifier modifier1117 = modifier3;
                            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1113, j4, sp1113, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41112 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            fontStyle4 = fontStyle3;
                            j7 = j4;
                            modifier4 = modifier1117;
                            fontWeight4 = fontWeight3;
                            fontFamily4 = fontFamily3;
                            j8 = j5;
                            textDecoration4 = textDecoration3;
                            textAlign4 = textAlign3;
                            j9 = j6;
                            i37 = i35;
                            z4 = z3;
                            i38 = i36;
                            textStyle4 = textStyle3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                    }
                    i30 |= 3072;
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i41113 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp1114 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent1114 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier1118 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1114, j4, sp1114, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41113 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier1118;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i41114 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp1115 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent1115 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier1119 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1115, j4, sp1115, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41114 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier1119;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 384;
                i33 = i5 & 8192;
                if (i33 != 0) {
                    if ((i4 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i8 = 2048;
                        }
                        i30 |= i8;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i41115 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp1116 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent1116 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier11110 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1116, j4, sp1116, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41115 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier11110;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i41116 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp1117 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent1117 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier11111 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1117, j4, sp1117, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41116 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier11111;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i41117 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp1118 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent1118 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11112 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1118, j4, sp1118, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41117 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier11112;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i41118 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp1119 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent1119 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11113 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1119, j4, sp1119, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41118 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier11113;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i23 = 805306368;
            i18 |= i23;
            i24 = i18;
            i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i25 != 0) {
                i26 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(j3)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i4 | i27;
            } else {
                i26 = i4;
            }
            i28 = i5 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i4 & 112) != 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            i30 = i26;
            i31 = i5 & 4096;
            if (i31 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i33 = i5 & 8192;
                if (i33 != 0) {
                    if ((i4 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i8 = 2048;
                        }
                        i30 |= i8;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i41119 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp11110 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent11110 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier11114 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11110, j4, sp11110, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41119 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier11114;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i411110 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp11111 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent11111 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier11115 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11111, j4, sp11111, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411110 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier11115;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i411111 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp11112 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent11112 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11116 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11112, j4, sp11112, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411111 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier11116;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i411112 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp11113 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent11113 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11117 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11113, j4, sp11113, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411112 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier11117;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 384;
            i33 = i5 & 8192;
            if (i33 != 0) {
                if ((i4 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i8 = 2048;
                    }
                    i30 |= i8;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i411113 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp11114 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent11114 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11118 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11114, j4, sp11114, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411113 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier11118;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i411114 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp11115 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent11115 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11119 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11115, j4, sp11115, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411114 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier11119;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 3072;
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i11 = 16384;
                }
                i30 |= i11;
            }
            if ((i24 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i411115 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp11116 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent11116 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier111110 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11116, j4, sp11116, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411115 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier111110;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i411116 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp11117 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent11117 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier111111 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11117, j4, sp11117, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411116 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier111111;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
        }
        i18 |= 100663296;
        i22 = i5 & ConstantsKt.MINIMUM_BLOCK_SIZE;
        if (i22 != 0) {
            if ((i3 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(textAlign)) {
                    i23 = 536870912;
                } else {
                    i23 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            i24 = i18;
            i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            if (i25 != 0) {
                i26 = i4 | 6;
            } else if ((i4 & 14) == 0) {
                if (composerStartRestartGroup.changed(j3)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i4 | i27;
            } else {
                i26 = i4;
            }
            i28 = i5 & 2048;
            if (i28 != 0) {
                i26 |= 48;
            } else if ((i4 & 112) != 0) {
                if (composerStartRestartGroup.changed(i)) {
                    i29 = 32;
                } else {
                    i29 = 16;
                }
                i26 |= i29;
            }
            i30 = i26;
            i31 = i5 & 4096;
            if (i31 != 0) {
                if ((i4 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i32 = 128;
                    }
                    i30 |= i32;
                }
                i33 = i5 & 8192;
                if (i33 != 0) {
                    if ((i4 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(i2)) {
                            i8 = 2048;
                        }
                        i30 |= i8;
                    }
                    if ((i4 & 57344) != 0) {
                        if ((i5 & 16384) == 0) {
                            i11 = 16384;
                        }
                        i30 |= i11;
                    }
                    if ((i24 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i411117 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp11118 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent11118 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier111112 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11118, j4, sp11118, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411117 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier111112;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        } else {
                            if (i39 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i7 != 0) {
                                jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                            } else {
                                jM1717getUnspecified0d7_KjU = j;
                            }
                            if (i10 != 0) {
                                fontStyle2 = null;
                            } else {
                                fontStyle2 = fontStyle;
                            }
                            if (i13 != 0) {
                                fontWeight2 = null;
                            } else {
                                fontWeight2 = fontWeight;
                            }
                            if (i15 != 0) {
                                fontFamily2 = null;
                            } else {
                                fontFamily2 = fontFamily;
                            }
                            if (i17 != 0) {
                                jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE = j2;
                            }
                            if (i20 != 0) {
                                textDecoration2 = null;
                            } else {
                                textDecoration2 = textDecoration;
                            }
                            if (i22 != 0) {
                                textAlign2 = null;
                            } else {
                                textAlign2 = textAlign;
                            }
                            if (i25 != 0) {
                                jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                            } else {
                                jM3967getUnspecifiedXSAIIZE2 = j3;
                            }
                            if (i28 != 0) {
                                iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                            } else {
                                iM3728getClipgIe3tQ8 = i;
                            }
                            if (i31 != 0) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (i33 != 0) {
                                i34 = Integer.MAX_VALUE;
                            } else {
                                i34 = i2;
                            }
                            if ((i5 & 16384) != 0) {
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                i30 &= -57345;
                            } else {
                                textStyle2 = textStyle;
                            }
                            textDecoration3 = textDecoration2;
                            textAlign3 = textAlign2;
                            i35 = iM3728getClipgIe3tQ8;
                            z3 = z2;
                            i36 = i34;
                            textStyle3 = textStyle2;
                            j4 = jM1717getUnspecified0d7_KjU;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j5 = jM3967getUnspecifiedXSAIIZE;
                            j6 = jM3967getUnspecifiedXSAIIZE2;
                            fontStyle3 = fontStyle2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue;
                        int i411118 = i24 & 14;
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(text);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue2;
                        long sp11119 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(mutableState2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new OooO00o(mutableState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierDrawWithContent11119 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                        composerStartRestartGroup.startReplaceableGroup(1618982084);
                        zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged3) {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        } else {
                            objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composer2 = composerStartRestartGroup;
                        Modifier modifier111113 = modifier3;
                        TextKt.m1261Text4IGK_g(text, modifierDrawWithContent11119, j4, sp11119, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411118 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle4 = fontStyle3;
                        j7 = j4;
                        modifier4 = modifier111113;
                        fontWeight4 = fontWeight3;
                        fontFamily4 = fontFamily3;
                        j8 = j5;
                        textDecoration4 = textDecoration3;
                        textAlign4 = textAlign3;
                        j9 = j6;
                        i37 = i35;
                        z4 = z3;
                        i38 = i36;
                        textStyle4 = textStyle3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
                }
                i30 |= 3072;
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i411119 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp111110 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent111110 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier111114 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111110, j4, sp111110, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i411119 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier111114;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4111110 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp111111 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent111111 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier111115 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111111, j4, sp111111, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111110 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier111115;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 384;
            i33 = i5 & 8192;
            if (i33 != 0) {
                if ((i4 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i8 = 2048;
                    }
                    i30 |= i8;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4111111 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp111112 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent111112 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier111116 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111112, j4, sp111112, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111111 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier111116;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4111112 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp111113 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent111113 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier111117 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111113, j4, sp111113, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111112 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier111117;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 3072;
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i11 = 16384;
                }
                i30 |= i11;
            }
            if ((i24 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i4111113 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp111114 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent111114 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier111118 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111114, j4, sp111114, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111113 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier111118;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i4111114 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp111115 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent111115 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier111119 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111115, j4, sp111115, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111114 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier111119;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
        }
        i23 = 805306368;
        i18 |= i23;
        i24 = i18;
        i25 = i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (i25 != 0) {
            i26 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (composerStartRestartGroup.changed(j3)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i4 | i27;
        } else {
            i26 = i4;
        }
        i28 = i5 & 2048;
        if (i28 != 0) {
            i26 |= 48;
        } else if ((i4 & 112) != 0) {
            if (composerStartRestartGroup.changed(i)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i26 |= i29;
        }
        i30 = i26;
        i31 = i5 & 4096;
        if (i31 != 0) {
            if ((i4 & 896) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i32 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i32 = 128;
                }
                i30 |= i32;
            }
            i33 = i5 & 8192;
            if (i33 != 0) {
                if ((i4 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(i2)) {
                        i8 = 2048;
                    }
                    i30 |= i8;
                }
                if ((i4 & 57344) != 0) {
                    if ((i5 & 16384) == 0) {
                        i11 = 16384;
                    }
                    i30 |= i11;
                }
                if ((i24 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4111115 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp111116 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent111116 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1111110 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111116, j4, sp111116, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111115 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier1111110;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    } else {
                        if (i39 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i7 != 0) {
                            jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                        } else {
                            jM1717getUnspecified0d7_KjU = j;
                        }
                        if (i10 != 0) {
                            fontStyle2 = null;
                        } else {
                            fontStyle2 = fontStyle;
                        }
                        if (i13 != 0) {
                            fontWeight2 = null;
                        } else {
                            fontWeight2 = fontWeight;
                        }
                        if (i15 != 0) {
                            fontFamily2 = null;
                        } else {
                            fontFamily2 = fontFamily;
                        }
                        if (i17 != 0) {
                            jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE = j2;
                        }
                        if (i20 != 0) {
                            textDecoration2 = null;
                        } else {
                            textDecoration2 = textDecoration;
                        }
                        if (i22 != 0) {
                            textAlign2 = null;
                        } else {
                            textAlign2 = textAlign;
                        }
                        if (i25 != 0) {
                            jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                        } else {
                            jM3967getUnspecifiedXSAIIZE2 = j3;
                        }
                        if (i28 != 0) {
                            iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                        } else {
                            iM3728getClipgIe3tQ8 = i;
                        }
                        if (i31 != 0) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (i33 != 0) {
                            i34 = Integer.MAX_VALUE;
                        } else {
                            i34 = i2;
                        }
                        if ((i5 & 16384) != 0) {
                            textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                            i30 &= -57345;
                        } else {
                            textStyle2 = textStyle;
                        }
                        textDecoration3 = textDecoration2;
                        textAlign3 = textAlign2;
                        i35 = iM3728getClipgIe3tQ8;
                        z3 = z2;
                        i36 = i34;
                        textStyle3 = textStyle2;
                        j4 = jM1717getUnspecified0d7_KjU;
                        fontWeight3 = fontWeight2;
                        fontFamily3 = fontFamily2;
                        j5 = jM3967getUnspecifiedXSAIIZE;
                        j6 = jM3967getUnspecifiedXSAIIZE2;
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue;
                    int i4111116 = i24 & 14;
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(text);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue2;
                    long sp111117 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(mutableState2);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new OooO00o(mutableState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierDrawWithContent111117 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                    composerStartRestartGroup.startReplaceableGroup(1618982084);
                    zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1111111 = modifier3;
                    TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111117, j4, sp111117, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111116 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    fontStyle4 = fontStyle3;
                    j7 = j4;
                    modifier4 = modifier1111111;
                    fontWeight4 = fontWeight3;
                    fontFamily4 = fontFamily3;
                    j8 = j5;
                    textDecoration4 = textDecoration3;
                    textAlign4 = textAlign3;
                    j9 = j6;
                    i37 = i35;
                    z4 = z3;
                    i38 = i36;
                    textStyle4 = textStyle3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
            }
            i30 |= 3072;
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i11 = 16384;
                }
                i30 |= i11;
            }
            if ((i24 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i4111117 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp111118 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent111118 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier1111112 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111118, j4, sp111118, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111117 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier1111112;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i4111118 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp111119 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent111119 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier1111113 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent111119, j4, sp111119, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111118 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier1111113;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
        }
        i30 |= 384;
        i33 = i5 & 8192;
        if (i33 != 0) {
            if ((i4 & 7168) == 0) {
                if (composerStartRestartGroup.changed(i2)) {
                    i8 = 2048;
                }
                i30 |= i8;
            }
            if ((i4 & 57344) != 0) {
                if ((i5 & 16384) == 0) {
                    i11 = 16384;
                }
                i30 |= i11;
            }
            if ((i24 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i4111119 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp1111110 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent1111110 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier1111114 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1111110, j4, sp1111110, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i4111119 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier1111114;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                } else {
                    if (i39 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i7 != 0) {
                        jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                    } else {
                        jM1717getUnspecified0d7_KjU = j;
                    }
                    if (i10 != 0) {
                        fontStyle2 = null;
                    } else {
                        fontStyle2 = fontStyle;
                    }
                    if (i13 != 0) {
                        fontWeight2 = null;
                    } else {
                        fontWeight2 = fontWeight;
                    }
                    if (i15 != 0) {
                        fontFamily2 = null;
                    } else {
                        fontFamily2 = fontFamily;
                    }
                    if (i17 != 0) {
                        jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE = j2;
                    }
                    if (i20 != 0) {
                        textDecoration2 = null;
                    } else {
                        textDecoration2 = textDecoration;
                    }
                    if (i22 != 0) {
                        textAlign2 = null;
                    } else {
                        textAlign2 = textAlign;
                    }
                    if (i25 != 0) {
                        jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                    } else {
                        jM3967getUnspecifiedXSAIIZE2 = j3;
                    }
                    if (i28 != 0) {
                        iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                    } else {
                        iM3728getClipgIe3tQ8 = i;
                    }
                    if (i31 != 0) {
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (i33 != 0) {
                        i34 = Integer.MAX_VALUE;
                    } else {
                        i34 = i2;
                    }
                    if ((i5 & 16384) != 0) {
                        textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                        i30 &= -57345;
                    } else {
                        textStyle2 = textStyle;
                    }
                    textDecoration3 = textDecoration2;
                    textAlign3 = textAlign2;
                    i35 = iM3728getClipgIe3tQ8;
                    z3 = z2;
                    i36 = i34;
                    textStyle3 = textStyle2;
                    j4 = jM1717getUnspecified0d7_KjU;
                    fontWeight3 = fontWeight2;
                    fontFamily3 = fontFamily2;
                    j5 = jM3967getUnspecifiedXSAIIZE;
                    j6 = jM3967getUnspecifiedXSAIIZE2;
                    fontStyle3 = fontStyle2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue;
                int i41111110 = i24 & 14;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(text);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue2;
                long sp1111111 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(mutableState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new OooO00o(mutableState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierDrawWithContent1111111 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3) {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier1111115 = modifier3;
                TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1111111, j4, sp1111111, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41111110 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                fontStyle4 = fontStyle3;
                j7 = j4;
                modifier4 = modifier1111115;
                fontWeight4 = fontWeight3;
                fontFamily4 = fontFamily3;
                j8 = j5;
                textDecoration4 = textDecoration3;
                textAlign4 = textAlign3;
                j9 = j6;
                i37 = i35;
                z4 = z3;
                i38 = i36;
                textStyle4 = textStyle3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
        }
        i30 |= 3072;
        if ((i4 & 57344) != 0) {
            if ((i5 & 16384) == 0) {
                i11 = 16384;
            }
            i30 |= i11;
        }
        if ((i24 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i39 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j;
                }
                if (i10 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i13 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if (i17 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j2;
                }
                if (i20 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i22 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if (i25 != 0) {
                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE2 = j3;
                }
                if (i28 != 0) {
                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                } else {
                    iM3728getClipgIe3tQ8 = i;
                }
                if (i31 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i33 != 0) {
                    i34 = Integer.MAX_VALUE;
                } else {
                    i34 = i2;
                }
                if ((i5 & 16384) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    i30 &= -57345;
                } else {
                    textStyle2 = textStyle;
                }
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                i35 = iM3728getClipgIe3tQ8;
                z3 = z2;
                i36 = i34;
                textStyle3 = textStyle2;
                j4 = jM1717getUnspecified0d7_KjU;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3967getUnspecifiedXSAIIZE;
                j6 = jM3967getUnspecifiedXSAIIZE2;
                fontStyle3 = fontStyle2;
                modifier3 = modifier2;
            } else {
                if (i39 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j;
                }
                if (i10 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i13 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if (i17 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j2;
                }
                if (i20 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i22 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if (i25 != 0) {
                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE2 = j3;
                }
                if (i28 != 0) {
                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                } else {
                    iM3728getClipgIe3tQ8 = i;
                }
                if (i31 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i33 != 0) {
                    i34 = Integer.MAX_VALUE;
                } else {
                    i34 = i2;
                }
                if ((i5 & 16384) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    i30 &= -57345;
                } else {
                    textStyle2 = textStyle;
                }
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                i35 = iM3728getClipgIe3tQ8;
                z3 = z2;
                i36 = i34;
                textStyle3 = textStyle2;
                j4 = jM1717getUnspecified0d7_KjU;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3967getUnspecifiedXSAIIZE;
                j6 = jM3967getUnspecifiedXSAIIZE2;
                fontStyle3 = fontStyle2;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            int i41111111 = i24 & 14;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(text);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            long sp1111112 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(mutableState2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new OooO00o(mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new OooO00o(mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierDrawWithContent1111112 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier1111116 = modifier3;
            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1111112, j4, sp1111112, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41111111 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontStyle4 = fontStyle3;
            j7 = j4;
            modifier4 = modifier1111116;
            fontWeight4 = fontWeight3;
            fontFamily4 = fontFamily3;
            j8 = j5;
            textDecoration4 = textDecoration3;
            textAlign4 = textAlign3;
            j9 = j6;
            i37 = i35;
            z4 = z3;
            i38 = i36;
            textStyle4 = textStyle3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
                if (i39 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j;
                }
                if (i10 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i13 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if (i17 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j2;
                }
                if (i20 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i22 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if (i25 != 0) {
                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE2 = j3;
                }
                if (i28 != 0) {
                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                } else {
                    iM3728getClipgIe3tQ8 = i;
                }
                if (i31 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i33 != 0) {
                    i34 = Integer.MAX_VALUE;
                } else {
                    i34 = i2;
                }
                if ((i5 & 16384) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    i30 &= -57345;
                } else {
                    textStyle2 = textStyle;
                }
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                i35 = iM3728getClipgIe3tQ8;
                z3 = z2;
                i36 = i34;
                textStyle3 = textStyle2;
                j4 = jM1717getUnspecified0d7_KjU;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3967getUnspecifiedXSAIIZE;
                j6 = jM3967getUnspecifiedXSAIIZE2;
                fontStyle3 = fontStyle2;
                modifier3 = modifier2;
            } else {
                if (i39 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i7 != 0) {
                    jM1717getUnspecified0d7_KjU = Color.INSTANCE.m1717getUnspecified0d7_KjU();
                } else {
                    jM1717getUnspecified0d7_KjU = j;
                }
                if (i10 != 0) {
                    fontStyle2 = null;
                } else {
                    fontStyle2 = fontStyle;
                }
                if (i13 != 0) {
                    fontWeight2 = null;
                } else {
                    fontWeight2 = fontWeight;
                }
                if (i15 != 0) {
                    fontFamily2 = null;
                } else {
                    fontFamily2 = fontFamily;
                }
                if (i17 != 0) {
                    jM3967getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE = j2;
                }
                if (i20 != 0) {
                    textDecoration2 = null;
                } else {
                    textDecoration2 = textDecoration;
                }
                if (i22 != 0) {
                    textAlign2 = null;
                } else {
                    textAlign2 = textAlign;
                }
                if (i25 != 0) {
                    jM3967getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
                } else {
                    jM3967getUnspecifiedXSAIIZE2 = j3;
                }
                if (i28 != 0) {
                    iM3728getClipgIe3tQ8 = TextOverflow.INSTANCE.m3728getClipgIe3tQ8();
                } else {
                    iM3728getClipgIe3tQ8 = i;
                }
                if (i31 != 0) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (i33 != 0) {
                    i34 = Integer.MAX_VALUE;
                } else {
                    i34 = i2;
                }
                if ((i5 & 16384) != 0) {
                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                    i30 &= -57345;
                } else {
                    textStyle2 = textStyle;
                }
                textDecoration3 = textDecoration2;
                textAlign3 = textAlign2;
                i35 = iM3728getClipgIe3tQ8;
                z3 = z2;
                i36 = i34;
                textStyle3 = textStyle2;
                j4 = jM1717getUnspecified0d7_KjU;
                fontWeight3 = fontWeight2;
                fontFamily3 = fontFamily2;
                j5 = jM3967getUnspecifiedXSAIIZE;
                j6 = jM3967getUnspecifiedXSAIIZE2;
                fontStyle3 = fontStyle2;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1603295712, i24, i30, "com.yalla.yalla.ui.view.AutoResizeText (AutoSizeText.kt:38)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(TextUnit.m3956getValueimpl(fontSizeRange.f57003OooO0O0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue;
            int i41111112 = i24 & 14;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(text);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue2;
            long sp1111113 = TextUnitKt.getSp(((Number) mutableState.getValue()).floatValue());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(mutableState2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new OooO00o(mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new OooO00o(mutableState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierDrawWithContent1111113 = DrawModifierKt.drawWithContent(modifier3, (Function1) objRememberedValue3);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged3 = composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(fontSizeRange);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new OooO0O0(fontSizeRange, mutableState2, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            Modifier modifier1111117 = modifier3;
            TextKt.m1261Text4IGK_g(text, modifierDrawWithContent1111113, j4, sp1111113, fontStyle3, fontWeight3, fontFamily3, j5, textDecoration3, textAlign3, j6, i35, z3, i36, 0, (Function1<? super TextLayoutResult, Unit>) objRememberedValue4, textStyle3, composer2, ((i24 >> 3) & 896) | i41111112 | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016) | (i24 & 29360128) | (234881024 & i24) | (1879048192 & i24), (i30 & 14) | (i30 & 112) | (i30 & 896) | (i30 & 7168) | ((i30 << 6) & 3670016), 16384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontStyle4 = fontStyle3;
            j7 = j4;
            modifier4 = modifier1111117;
            fontWeight4 = fontWeight3;
            fontFamily4 = fontFamily3;
            j8 = j5;
            textDecoration4 = textDecoration3;
            textAlign4 = textAlign3;
            j9 = j6;
            i37 = i35;
            z4 = z3;
            i38 = i36;
            textStyle4 = textStyle3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(text, fontSizeRange, modifier4, j7, fontStyle4, fontWeight4, fontFamily4, j8, textDecoration4, textAlign4, j9, i37, z4, i38, textStyle4, i3, i4, i5));
    }
}
