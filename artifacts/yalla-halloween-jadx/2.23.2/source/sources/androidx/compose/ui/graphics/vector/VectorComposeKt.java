package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a©\u0001\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"Group", "", "name", "", "rotation", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/graphics/vector/VectorComposable;", "(Ljava/lang/String;FFFFFFFLjava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Path", "pathData", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "Path-9cdaXJ4", "(Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLandroidx/compose/runtime/Composer;III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
public final class VectorComposeKt {
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0172 A[PHI: r2 r4 r5 r6 r7 r9 r13 r14 r15
      0x0172: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r4v26 int) = (r4v22 int), (r4v27 int) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r5v5 float) = (r5v2 float), (r5v6 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r6v15 float) = (r6v11 float), (r6v17 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r7v10 float) = (r7v6 float), (r7v11 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r9v7 float) = (r9v3 float), (r9v2 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r13v9 float) = (r13v6 float), (r13v10 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r14v6 float) = (r14v3 float), (r14v2 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r15v9 float) = (r15v6 float), (r15v10 float) binds: [B:141:0x01a1, B:115:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0177  */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:131:0x018f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0194  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:137:0x019a  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:152:0x01da  */
    /* JADX WARN: Code duplicated, block: B:155:0x0241  */
    /* JADX WARN: Code duplicated, block: B:160:0x0251  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0111  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @VectorComposable
    @Composable
    public static final void Group(@Nullable String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, @Nullable List<? extends PathNode> list, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f8;
        int i5;
        int i6;
        float f9;
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
        String str2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        List<? extends PathNode> emptyPath;
        AnonymousClass1 anonymousClass1;
        final float f15;
        final float f16;
        final float f17;
        final float f18;
        final float f19;
        final List<? extends PathNode> list2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-213417674);
        int i18 = i2 & 1;
        if (i18 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i19 = i2 & 2;
        if (i19 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    f8 = f2;
                    if (composerStartRestartGroup.changed(f8)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 7168) == 0) {
                        f9 = f3;
                        if (composerStartRestartGroup.changed(f9)) {
                            i7 = 2048;
                        } else {
                            i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        if (composerStartRestartGroup.changed(f4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 32;
                    if (i10 != 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f5)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & 64;
                    if (i12 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f6)) {
                            i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i13 = 524288;
                        }
                        i3 |= i13;
                    }
                    i14 = i2 & 128;
                    if (i14 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(f7)) {
                            i15 = 8388608;
                        } else {
                            i15 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i15;
                    }
                    i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i16 != 0) {
                        i3 |= 33554432;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i17 = 536870912;
                            } else {
                                i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if (i16 != 256 && (1533916891 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            str2 = str;
                            f10 = f;
                            f11 = f4;
                            f16 = f5;
                            f19 = f6;
                            f15 = f7;
                            f17 = f8;
                            f18 = f9;
                            list2 = list;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i18 != 0) {
                                    str2 = "";
                                } else {
                                    str2 = str;
                                }
                                if (i19 != 0) {
                                    f10 = 0.0f;
                                } else {
                                    f10 = f;
                                }
                                if (i4 != 0) {
                                    f8 = 0.0f;
                                }
                                if (i6 != 0) {
                                    f9 = 0.0f;
                                }
                                if (i8 != 0) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = f4;
                                }
                                f12 = i10 == 0 ? f5 : 1.0f;
                                if (i12 != 0) {
                                    f13 = 0.0f;
                                } else {
                                    f13 = f6;
                                }
                                f14 = i14 == 0 ? f7 : 0.0f;
                                if (i16 != 0) {
                                    emptyPath = VectorKt.getEmptyPath();
                                    i3 &= -234881025;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                                }
                                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final GroupComponent invoke() {
                                        return new GroupComponent();
                                    }
                                };
                                composerStartRestartGroup.startReplaceableGroup(-548224868);
                                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composerStartRestartGroup.startNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(anonymousClass1);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                                Updater.m1327setimpl(composerM1320constructorimpl, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                        invoke2(groupComponent, str3);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        set.setName(it);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setRotation(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setPivotX(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setPivotY(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setScaleX(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setScaleY(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setTranslationX(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                        invoke(groupComponent, f20.floatValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull GroupComponent set, float f20) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        set.setTranslationY(f20);
                                    }
                                });
                                Updater.m1327setimpl(composerM1320constructorimpl, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                        invoke2(groupComponent, list3);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                        Intrinsics.checkNotNullParameter(set, "$this$set");
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        set.setClipPathData(it);
                                    }
                                });
                                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f15 = f14;
                                f16 = f12;
                                f17 = f8;
                                f18 = f9;
                                f19 = f13;
                                list2 = emptyPath;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i16 != 0) {
                                    i3 &= -234881025;
                                }
                                str2 = str;
                                f10 = f;
                                f11 = f4;
                                f12 = f5;
                                f13 = f6;
                                f14 = f7;
                            }
                            emptyPath = list;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                            }
                            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final GroupComponent invoke() {
                                    return new GroupComponent();
                                }
                            };
                            composerStartRestartGroup.startReplaceableGroup(-548224868);
                            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(anonymousClass1);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                            Updater.m1327setimpl(composerM1320constructorimpl2, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                                    invoke2(groupComponent, str3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    set.setName(it);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setRotation(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setPivotX(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setPivotY(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setScaleX(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setScaleY(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setTranslationX(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f20) {
                                    invoke(groupComponent, f20.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull GroupComponent set, float f20) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    set.setTranslationY(f20);
                                }
                            });
                            Updater.m1327setimpl(composerM1320constructorimpl2, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                    invoke2(groupComponent, list3);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    set.setClipPathData(it);
                                }
                            });
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f15 = f14;
                            f16 = f12;
                            f17 = f8;
                            f18 = f9;
                            f19 = f13;
                            list2 = emptyPath;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final String str3 = str2;
                        final float f20 = f10;
                        final float f21 = f11;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                VectorComposeKt.Group(str3, f20, f17, f18, f21, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i17 = 805306368;
                    i3 |= i17;
                    if (i16 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl3, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl3, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl4, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str4) {
                                invoke2(groupComponent, str4);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f22) {
                                invoke(groupComponent, f22.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f22) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f22);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl4, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str4 = str2;
                    final float f22 = f10;
                    final float f23 = f11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str4, f22, f17, f18, f23, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 3072;
                f9 = f3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i15;
                }
                i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 536870912;
                        } else {
                            i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i16 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl5, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str5) {
                                invoke2(groupComponent, str5);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl5, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl6, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str5) {
                                invoke2(groupComponent, str5);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f24) {
                                invoke(groupComponent, f24.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f24) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f24);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl6, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str5 = str2;
                    final float f24 = f10;
                    final float f25 = f11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str5, f24, f17, f18, f25, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i17 = 805306368;
                i3 |= i17;
                if (i16 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl7 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl7, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str6) {
                            invoke2(groupComponent, str6);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl7, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl8 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl8, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str6) {
                            invoke2(groupComponent, str6);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f26) {
                            invoke(groupComponent, f26.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f26) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f26);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl8, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str6 = str2;
                final float f26 = f10;
                final float f27 = f11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str6, f26, f17, f18, f27, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 384;
            f8 = f2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    f9 = f3;
                    if (composerStartRestartGroup.changed(f9)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i15;
                }
                i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 536870912;
                        } else {
                            i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i16 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl9 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl9, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str7) {
                                invoke2(groupComponent, str7);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl9, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl10 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl10, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str7) {
                                invoke2(groupComponent, str7);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f28) {
                                invoke(groupComponent, f28.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f28) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f28);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl10, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str7 = str2;
                    final float f28 = f10;
                    final float f29 = f11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str7, f28, f17, f18, f29, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i17 = 805306368;
                i3 |= i17;
                if (i16 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl11 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl11, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str8) {
                            invoke2(groupComponent, str8);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl11, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl12 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl12, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str8) {
                            invoke2(groupComponent, str8);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f210) {
                            invoke(groupComponent, f210.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f210) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f210);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl12, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str8 = str2;
                final float f210 = f10;
                final float f211 = f11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str8, f210, f17, f18, f211, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            f9 = f3;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i3 |= i15;
            }
            i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i16 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl13 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl13, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str9) {
                            invoke2(groupComponent, str9);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl13, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl14 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl14, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str9) {
                            invoke2(groupComponent, str9);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f212) {
                            invoke(groupComponent, f212.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f212) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f212);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl14, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str9 = str2;
                final float f212 = f10;
                final float f213 = f11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str9, f212, f17, f18, f213, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i17 = 805306368;
            i3 |= i17;
            if (i16 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl15 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl15, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str10) {
                        invoke2(groupComponent, str10);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl15, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl16 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl16, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str10) {
                        invoke2(groupComponent, str10);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f214) {
                        invoke(groupComponent, f214.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f214) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f214);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl16, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str10 = str2;
            final float f214 = f10;
            final float f215 = f11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str10, f214, f17, f18, f215, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                f8 = f2;
                if (composerStartRestartGroup.changed(f8)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 7168) == 0) {
                    f9 = f3;
                    if (composerStartRestartGroup.changed(f9)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 32;
                if (i10 != 0) {
                    i3 |= 196608;
                } else if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f5)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i3 |= i11;
                }
                i12 = i2 & 64;
                if (i12 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i13 = 524288;
                    }
                    i3 |= i13;
                }
                i14 = i2 & 128;
                if (i14 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(f7)) {
                        i15 = 8388608;
                    } else {
                        i15 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i15;
                }
                i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i16 != 0) {
                    i3 |= 33554432;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 536870912;
                        } else {
                            i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i16 != 256) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl17 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl17, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str11) {
                                invoke2(groupComponent, str11);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl17, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        } else {
                            if (i18 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i19 != 0) {
                                f10 = 0.0f;
                            } else {
                                f10 = f;
                            }
                            if (i4 != 0) {
                                f8 = 0.0f;
                            }
                            if (i6 != 0) {
                                f9 = 0.0f;
                            }
                            if (i8 != 0) {
                                f11 = 1.0f;
                            } else {
                                f11 = f4;
                            }
                            if (i10 == 0) {
                            }
                            if (i12 != 0) {
                                f13 = 0.0f;
                            } else {
                                f13 = f6;
                            }
                            if (i14 == 0) {
                            }
                            if (i16 != 0) {
                                emptyPath = VectorKt.getEmptyPath();
                                i3 &= -234881025;
                            } else {
                                emptyPath = list;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                        }
                        anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final GroupComponent invoke() {
                                return new GroupComponent();
                            }
                        };
                        composerStartRestartGroup.startReplaceableGroup(-548224868);
                        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(anonymousClass1);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM1320constructorimpl18 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl18, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str11) {
                                invoke2(groupComponent, str11);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setName(it);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setRotation(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotX(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setPivotY(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleX(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setScaleY(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationX(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f216) {
                                invoke(groupComponent, f216.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull GroupComponent set, float f216) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                set.setTranslationY(f216);
                            }
                        });
                        Updater.m1327setimpl(composerM1320constructorimpl18, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                                invoke2(groupComponent, list3);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                                Intrinsics.checkNotNullParameter(set, "$this$set");
                                Intrinsics.checkNotNullParameter(it, "it");
                                set.setClipPathData(it);
                            }
                        });
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f15 = f14;
                        f16 = f12;
                        f17 = f8;
                        f18 = f9;
                        f19 = f13;
                        list2 = emptyPath;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    final String str11 = str2;
                    final float f216 = f10;
                    final float f217 = f11;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            VectorComposeKt.Group(str11, f216, f17, f18, f217, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i17 = 805306368;
                i3 |= i17;
                if (i16 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl19 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl19, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str12) {
                            invoke2(groupComponent, str12);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl19, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl110 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str12) {
                            invoke2(groupComponent, str12);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f218) {
                            invoke(groupComponent, f218.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f218) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f218);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str12 = str2;
                final float f218 = f10;
                final float f219 = f11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str12, f218, f17, f18, f219, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            f9 = f3;
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i3 |= i15;
            }
            i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i16 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl111 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str13) {
                            invoke2(groupComponent, str13);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl112 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str13) {
                            invoke2(groupComponent, str13);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2110) {
                            invoke(groupComponent, f2110.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2110) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f2110);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str13 = str2;
                final float f2110 = f10;
                final float f2111 = f11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str13, f2110, f17, f18, f2111, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i17 = 805306368;
            i3 |= i17;
            if (i16 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl113 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl113, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str14) {
                        invoke2(groupComponent, str14);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl113, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl114 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl114, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str14) {
                        invoke2(groupComponent, str14);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2112) {
                        invoke(groupComponent, f2112.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2112) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f2112);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl114, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str14 = str2;
            final float f2112 = f10;
            final float f2113 = f11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str14, f2112, f17, f18, f2113, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        f8 = f2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 7168) == 0) {
                f9 = f3;
                if (composerStartRestartGroup.changed(f9)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i2 & 32;
            if (i10 != 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f5)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i3 |= i11;
            }
            i12 = i2 & 64;
            if (i12 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i13 = 524288;
                }
                i3 |= i13;
            }
            i14 = i2 & 128;
            if (i14 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(f7)) {
                    i15 = 8388608;
                } else {
                    i15 = Configuration.BLOCK_SIZE;
                }
                i3 |= i15;
            }
            i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i16 != 0) {
                i3 |= 33554432;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 536870912;
                    } else {
                        i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i16 != 256) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl115 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl115, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str15) {
                            invoke2(groupComponent, str15);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl115, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    } else {
                        if (i18 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i19 != 0) {
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if (i4 != 0) {
                            f8 = 0.0f;
                        }
                        if (i6 != 0) {
                            f9 = 0.0f;
                        }
                        if (i8 != 0) {
                            f11 = 1.0f;
                        } else {
                            f11 = f4;
                        }
                        if (i10 == 0) {
                        }
                        if (i12 != 0) {
                            f13 = 0.0f;
                        } else {
                            f13 = f6;
                        }
                        if (i14 == 0) {
                        }
                        if (i16 != 0) {
                            emptyPath = VectorKt.getEmptyPath();
                            i3 &= -234881025;
                        } else {
                            emptyPath = list;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                    }
                    anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final GroupComponent invoke() {
                            return new GroupComponent();
                        }
                    };
                    composerStartRestartGroup.startReplaceableGroup(-548224868);
                    if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(anonymousClass1);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM1320constructorimpl116 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl116, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str15) {
                            invoke2(groupComponent, str15);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setName(it);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setRotation(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotX(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setPivotY(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleX(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setScaleY(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationX(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2114) {
                            invoke(groupComponent, f2114.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull GroupComponent set, float f2114) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            set.setTranslationY(f2114);
                        }
                    });
                    Updater.m1327setimpl(composerM1320constructorimpl116, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                            invoke2(groupComponent, list3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                            Intrinsics.checkNotNullParameter(set, "$this$set");
                            Intrinsics.checkNotNullParameter(it, "it");
                            set.setClipPathData(it);
                        }
                    });
                    content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f15 = f14;
                    f16 = f12;
                    f17 = f8;
                    f18 = f9;
                    f19 = f13;
                    list2 = emptyPath;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final String str15 = str2;
                final float f2114 = f10;
                final float f2115 = f11;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        VectorComposeKt.Group(str15, f2114, f17, f18, f2115, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i17 = 805306368;
            i3 |= i17;
            if (i16 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl117 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl117, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str16) {
                        invoke2(groupComponent, str16);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl117, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl118 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl118, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str16) {
                        invoke2(groupComponent, str16);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2116) {
                        invoke(groupComponent, f2116.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2116) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f2116);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl118, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str16 = str2;
            final float f2116 = f10;
            final float f2117 = f11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str16, f2116, f17, f18, f2117, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        f9 = f3;
        i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            if (composerStartRestartGroup.changed(f4)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        i10 = i2 & 32;
        if (i10 != 0) {
            i3 |= 196608;
        } else if ((i & 458752) == 0) {
            if (composerStartRestartGroup.changed(f5)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f6)) {
                i13 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i13 = 524288;
            }
            i3 |= i13;
        }
        i14 = i2 & 128;
        if (i14 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(f7)) {
                i15 = 8388608;
            } else {
                i15 = Configuration.BLOCK_SIZE;
            }
            i3 |= i15;
        }
        i16 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i16 != 0) {
            i3 |= 33554432;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 536870912;
                } else {
                    i17 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if (i16 != 256) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl119 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl119, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str17) {
                        invoke2(groupComponent, str17);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl119, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                } else {
                    if (i18 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i19 != 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if (i4 != 0) {
                        f8 = 0.0f;
                    }
                    if (i6 != 0) {
                        f9 = 0.0f;
                    }
                    if (i8 != 0) {
                        f11 = 1.0f;
                    } else {
                        f11 = f4;
                    }
                    if (i10 == 0) {
                    }
                    if (i12 != 0) {
                        f13 = 0.0f;
                    } else {
                        f13 = f6;
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                        emptyPath = VectorKt.getEmptyPath();
                        i3 &= -234881025;
                    } else {
                        emptyPath = list;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
                }
                anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final GroupComponent invoke() {
                        return new GroupComponent();
                    }
                };
                composerStartRestartGroup.startReplaceableGroup(-548224868);
                if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(anonymousClass1);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl1110 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl1110, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str17) {
                        invoke2(groupComponent, str17);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setName(it);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setRotation(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotX(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setPivotY(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleX(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setScaleY(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationX(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f2118) {
                        invoke(groupComponent, f2118.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull GroupComponent set, float f2118) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        set.setTranslationY(f2118);
                    }
                });
                Updater.m1327setimpl(composerM1320constructorimpl1110, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                        invoke2(groupComponent, list3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                        Intrinsics.checkNotNullParameter(set, "$this$set");
                        Intrinsics.checkNotNullParameter(it, "it");
                        set.setClipPathData(it);
                    }
                });
                content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f15 = f14;
                f16 = f12;
                f17 = f8;
                f18 = f9;
                f19 = f13;
                list2 = emptyPath;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final String str17 = str2;
            final float f2118 = f10;
            final float f2119 = f11;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i20) {
                    VectorComposeKt.Group(str17, f2118, f17, f18, f2119, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i17 = 805306368;
        i3 |= i17;
        if (i16 != 256) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f8 = 0.0f;
                }
                if (i6 != 0) {
                    f9 = 0.0f;
                }
                if (i8 != 0) {
                    f11 = 1.0f;
                } else {
                    f11 = f4;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
            } else {
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f8 = 0.0f;
                }
                if (i6 != 0) {
                    f9 = 0.0f;
                }
                if (i8 != 0) {
                    f11 = 1.0f;
                } else {
                    f11 = f4;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
            }
            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final GroupComponent invoke() {
                    return new GroupComponent();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-548224868);
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl1111 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl1111, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str18) {
                    invoke2(groupComponent, str18);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    set.setName(it);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setRotation(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setPivotX(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setPivotY(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setScaleX(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setScaleY(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setTranslationX(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setTranslationY(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1111, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                    invoke2(groupComponent, list3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    set.setClipPathData(it);
                }
            });
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f15 = f14;
            f16 = f12;
            f17 = f8;
            f18 = f9;
            f19 = f13;
            list2 = emptyPath;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f8 = 0.0f;
                }
                if (i6 != 0) {
                    f9 = 0.0f;
                }
                if (i8 != 0) {
                    f11 = 1.0f;
                } else {
                    f11 = f4;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
            } else {
                if (i18 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i19 != 0) {
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if (i4 != 0) {
                    f8 = 0.0f;
                }
                if (i6 != 0) {
                    f9 = 0.0f;
                }
                if (i8 != 0) {
                    f11 = 1.0f;
                } else {
                    f11 = f4;
                }
                if (i10 == 0) {
                }
                if (i12 != 0) {
                    f13 = 0.0f;
                } else {
                    f13 = f6;
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i3 &= -234881025;
                } else {
                    emptyPath = list;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213417674, i3, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
            }
            anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final GroupComponent invoke() {
                    return new GroupComponent();
                }
            };
            composerStartRestartGroup.startReplaceableGroup(-548224868);
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl1112 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl1112, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str18) {
                    invoke2(groupComponent, str18);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent set, @NotNull String it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    set.setName(it);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setRotation(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f8), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setPivotX(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setPivotY(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setScaleX(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setScaleY(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setTranslationX(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f21110) {
                    invoke(groupComponent, f21110.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull GroupComponent set, float f21110) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    set.setTranslationY(f21110);
                }
            });
            Updater.m1327setimpl(composerM1320constructorimpl1112, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list3) {
                    invoke2(groupComponent, list3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GroupComponent set, @NotNull List<? extends PathNode> it) {
                    Intrinsics.checkNotNullParameter(set, "$this$set");
                    Intrinsics.checkNotNullParameter(it, "it");
                    set.setClipPathData(it);
                }
            });
            content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 27) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f15 = f14;
            f16 = f12;
            f17 = f8;
            f18 = f9;
            f19 = f13;
            list2 = emptyPath;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final String str18 = str2;
        final float f21110 = f10;
        final float f21111 = f11;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i20) {
                VectorComposeKt.Group(str18, f21110, f17, f18, f21111, f16, f19, f15, list2, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @VectorComposable
    @Composable
    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m2233Path9cdaXJ4(@NotNull final List<? extends PathNode> pathData, int i, @Nullable String str, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, @Nullable Composer composer, final int i4, final int i5, final int i6) {
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        int defaultFillType = (i6 & 2) != 0 ? VectorKt.getDefaultFillType() : i;
        String str2 = (i6 & 4) != 0 ? "" : str;
        Brush brush3 = (i6 & 8) != 0 ? null : brush;
        float f8 = (i6 & 16) != 0 ? 1.0f : f;
        final Brush brush4 = (i6 & 32) == 0 ? brush2 : null;
        float f9 = (i6 & 64) != 0 ? 1.0f : f2;
        float f10 = (i6 & 128) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i6 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i6 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f11 = (i6 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 4.0f : f4;
        float f12 = (i6 & 2048) != 0 ? 0.0f : f5;
        float f13 = (i6 & 4096) != 0 ? 1.0f : f6;
        float f14 = (i6 & 8192) != 0 ? 0.0f : f7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i4, i5, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        }
        final VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PathComponent invoke() {
                return new PathComponent();
            }
        };
        composerStartRestartGroup.startReplaceableGroup(1886828752);
        if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path-9cdaXJ4$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.graphics.vector.PathComponent, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final PathComponent invoke() {
                    return vectorComposeKt$Path$1.invoke();
                }
            });
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Updater.m1327setimpl(composerM1320constructorimpl, str2, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str3) {
                invoke2(pathComponent, str3);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @NotNull String it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setName(it);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, pathData, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list) {
                invoke2(pathComponent, list);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @NotNull List<? extends PathNode> it) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                Intrinsics.checkNotNullParameter(it, "it");
                set.setPathData(it);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, PathFillType.m1928boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                m2235invokepweu1eQ(pathComponent, pathFillType.getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
            public final void m2235invokepweu1eQ(@NotNull PathComponent set, int i7) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2230setPathFillTypeoQ8Xj4U(i7);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @Nullable Brush brush5) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFill(brush5);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f8), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setFillAlpha(f15);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                invoke2(pathComponent, brush5);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull PathComponent set, @Nullable Brush brush5) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStroke(brush5);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f9), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeAlpha(f15);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f10), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineWidth(f15);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, StrokeJoin.m2008boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                m2236invokekLtJ_vA(pathComponent, strokeJoin.getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
            public final void m2236invokekLtJ_vA(@NotNull PathComponent set, int i7) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2232setStrokeLineJoinWw9F2mQ(i7);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, StrokeCap.m1998boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                m2234invokeCSYIeUk(pathComponent, strokeCap.getValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
            public final void m2234invokeCSYIeUk(@NotNull PathComponent set, int i7) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.m2231setStrokeLineCapBeK7IIE(i7);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f11), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setStrokeLineMiter(f15);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f12), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathStart(f15);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f13), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathEnd(f15);
            }
        });
        Updater.m1327setimpl(composerM1320constructorimpl, Float.valueOf(f14), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f15) {
                invoke(pathComponent, f15.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PathComponent set, float f15) {
                Intrinsics.checkNotNullParameter(set, "$this$set");
                set.setTrimPathOffset(f15);
            }
        });
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final int i7 = defaultFillType;
        final String str3 = str2;
        final Brush brush5 = brush3;
        final float f15 = f8;
        final float f16 = f9;
        final float f17 = f10;
        final int i8 = defaultStrokeLineCap;
        final int i9 = defaultStrokeLineJoin;
        final float f18 = f11;
        final float f19 = f12;
        final float f20 = f13;
        final float f21 = f14;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i10) {
                VectorComposeKt.m2233Path9cdaXJ4(pathData, i7, str3, brush5, f15, brush4, f16, f17, i8, i9, f18, f19, f20, f21, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
            }
        });
    }
}
