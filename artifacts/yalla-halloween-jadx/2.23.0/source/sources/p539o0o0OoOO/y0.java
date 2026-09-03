package p539o0o0OoOO;

import android.widget.EditText;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.view.EmojiFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00o.Oooo000;
import p417o0OoO0.o00oO0o;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFacePanelComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class y0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<w0> f55747OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f55748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f55749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f55750OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f55751OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f55752OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super EmojiFaceView, Unit> f55753OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f55754OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f55755OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public EditText f55756OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public EmojiFaceView f55757OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Oooo000 f55758OooOO0o;

    public y0() {
        this(false, 511);
    }

    public final void OooO00o(@Nullable EditText editText) {
        EmojiFaceView emojiFaceView;
        this.f55756OooOO0 = editText;
        if (editText == null || (emojiFaceView = this.f55757OooOO0O) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(editText, "editText");
        emojiFaceView.editText = editText;
        emojiFaceView.isMomentPage = this.f55755OooO0oo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.areEqual(this.f55748OooO00o, y0Var.f55748OooO00o) && Intrinsics.areEqual(this.f55749OooO0O0, y0Var.f55749OooO0O0) && Intrinsics.areEqual(this.f55750OooO0OO, y0Var.f55750OooO0OO) && Intrinsics.areEqual(this.f55751OooO0Oo, y0Var.f55751OooO0Oo) && Intrinsics.areEqual(this.f55753OooO0o0, y0Var.f55753OooO0o0) && this.f55752OooO0o == y0Var.f55752OooO0o && this.f55754OooO0oO == y0Var.f55754OooO0oO && this.f55755OooO0oo == y0Var.f55755OooO0oo && Intrinsics.areEqual(this.f55747OooO, y0Var.f55747OooO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    public final int hashCode() {
        Function1<? super Boolean, Unit> function1 = this.f55748OooO00o;
        int iHashCode = (this.f55749OooO0O0.hashCode() + ((function1 == null ? 0 : function1.hashCode()) * 31)) * 31;
        Function1<? super Integer, Unit> function2 = this.f55750OooO0OO;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<? super String, ? super Integer, Unit> function3 = this.f55751OooO0Oo;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function1<? super EmojiFaceView, Unit> function4 = this.f55753OooO0o0;
        int iHashCode4 = (iHashCode3 + (function4 != null ? function4.hashCode() : 0)) * 31;
        boolean z = this.f55752OooO0o;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode4 + r1) * 31;
        boolean z2 = this.f55754OooO0oO;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.f55755OooO0oo;
        return this.f55747OooO.hashCode() + ((i2 + (z3 ? 1 : z3)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FacePanelState(onPanelPageChangeListener=" + this.f55748OooO00o + ", isEmojiPanel=" + this.f55749OooO0O0 + ", sendStickerMessageListener=" + this.f55750OooO0OO + ", sendGifMessageListener=" + this.f55751OooO0Oo + ", onEmojiFaceViewInitCallBack=" + this.f55753OooO0o0 + ", showSecondPanel=" + this.f55752OooO0o + ", showPanelFromNet=" + this.f55754OooO0oO + ", isMomentPage=" + this.f55755OooO0oo + ", indicatorAndPanelDataList=" + this.f55747OooO + ")";
    }

    public y0(boolean z, int i) {
        SnapshotStateList<w0> indicatorAndPanelDataList;
        MutableState<Boolean> isEmojiPanel = (i & 2) != 0 ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null) : null;
        boolean z2 = (i & 32) != 0;
        boolean z3 = (i & 64) != 0;
        z = (i & 128) != 0 ? false : z;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            indicatorAndPanelDataList = SnapshotStateKt.mutableStateListOf();
            String string = o00oO0o.OooO0O0(oO00OOO.ic_new_emoji, o000O0.OooO00o()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "Utils.context.resIdToUri….ic_new_emoji).toString()");
            indicatorAndPanelDataList.add(new w0(1, string));
            if (z2) {
                String string2 = o00oO0o.OooO0O0(oO00OOO.ic_new_face_sticker, o000O0.OooO00o()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "Utils.context.resIdToUri…_face_sticker).toString()");
                indicatorAndPanelDataList.add(new w0(2, string2));
            }
        } else {
            indicatorAndPanelDataList = null;
        }
        Intrinsics.checkNotNullParameter(isEmojiPanel, "isEmojiPanel");
        Intrinsics.checkNotNullParameter(indicatorAndPanelDataList, "indicatorAndPanelDataList");
        this.f55748OooO00o = null;
        this.f55749OooO0O0 = isEmojiPanel;
        this.f55750OooO0OO = null;
        this.f55751OooO0Oo = null;
        this.f55753OooO0o0 = null;
        this.f55752OooO0o = z2;
        this.f55754OooO0oO = z3;
        this.f55755OooO0oo = z;
        this.f55747OooO = indicatorAndPanelDataList;
    }
}
