package p587o0oOooOO;

import android.widget.EditText;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.code.android.util.o000O00O;
import com.yalla.yalla.ui.view.EmojiFaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230o00oOo0o.o000000;
import p423o0OoO0OO.o000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFacePanelComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelComp.kt\ncom/yalla/yalla/ui/view/FacePanelState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<r> f56975OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f56976OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f56977OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f56978OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function2<? super String, ? super Integer, Unit> f56979OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f56980OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super EmojiFaceView, Unit> f56981OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f56982OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f56983OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public EditText f56984OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public EmojiFaceView f56985OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o000000 f56986OooOO0o;

    public t() {
        this(false, 511);
    }

    public final void OooO00o(@Nullable EditText editText) {
        EmojiFaceView emojiFaceView;
        this.f56984OooOO0 = editText;
        if (editText == null || (emojiFaceView = this.f56985OooOO0O) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(editText, "editText");
        emojiFaceView.editText = editText;
        emojiFaceView.isMomentPage = this.f56983OooO0oo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f56976OooO00o, tVar.f56976OooO00o) && Intrinsics.areEqual(this.f56977OooO0O0, tVar.f56977OooO0O0) && Intrinsics.areEqual(this.f56978OooO0OO, tVar.f56978OooO0OO) && Intrinsics.areEqual(this.f56979OooO0Oo, tVar.f56979OooO0Oo) && Intrinsics.areEqual(this.f56981OooO0o0, tVar.f56981OooO0o0) && this.f56980OooO0o == tVar.f56980OooO0o && this.f56982OooO0oO == tVar.f56982OooO0oO && this.f56983OooO0oo == tVar.f56983OooO0oo && Intrinsics.areEqual(this.f56975OooO, tVar.f56975OooO);
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
        Function1<? super Boolean, Unit> function1 = this.f56976OooO00o;
        int iHashCode = (this.f56977OooO0O0.hashCode() + ((function1 == null ? 0 : function1.hashCode()) * 31)) * 31;
        Function1<? super Integer, Unit> function2 = this.f56978OooO0OO;
        int iHashCode2 = (iHashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function2<? super String, ? super Integer, Unit> function3 = this.f56979OooO0Oo;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function1<? super EmojiFaceView, Unit> function4 = this.f56981OooO0o0;
        int iHashCode4 = (iHashCode3 + (function4 != null ? function4.hashCode() : 0)) * 31;
        boolean z = this.f56980OooO0o;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode4 + r1) * 31;
        boolean z2 = this.f56982OooO0oO;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.f56983OooO0oo;
        return this.f56975OooO.hashCode() + ((i2 + (z3 ? 1 : z3)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FacePanelState(onPanelPageChangeListener=" + this.f56976OooO00o + ", isEmojiPanel=" + this.f56977OooO0O0 + ", sendStickerMessageListener=" + this.f56978OooO0OO + ", sendGifMessageListener=" + this.f56979OooO0Oo + ", onEmojiFaceViewInitCallBack=" + this.f56981OooO0o0 + ", showSecondPanel=" + this.f56980OooO0o + ", showPanelFromNet=" + this.f56982OooO0oO + ", isMomentPage=" + this.f56983OooO0oo + ", indicatorAndPanelDataList=" + this.f56975OooO + ")";
    }

    public t(boolean z, int i) {
        SnapshotStateList<r> indicatorAndPanelDataList;
        MutableState<Boolean> isEmojiPanel = (i & 2) != 0 ? SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null) : null;
        boolean z2 = (i & 32) != 0;
        boolean z3 = (i & 64) != 0;
        z = (i & 128) != 0 ? false : z;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            indicatorAndPanelDataList = SnapshotStateKt.mutableStateListOf();
            String string = o000.OooO0O0(o0O0O00.ic_new_emoji, o000O00O.OooO00o()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            indicatorAndPanelDataList.add(new r(1, string));
            if (z2) {
                String string2 = o000.OooO0O0(o0O0O00.ic_new_face_sticker, o000O00O.OooO00o()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                indicatorAndPanelDataList.add(new r(2, string2));
            }
        } else {
            indicatorAndPanelDataList = null;
        }
        Intrinsics.checkNotNullParameter(isEmojiPanel, "isEmojiPanel");
        Intrinsics.checkNotNullParameter(indicatorAndPanelDataList, "indicatorAndPanelDataList");
        this.f56976OooO00o = null;
        this.f56977OooO0O0 = isEmojiPanel;
        this.f56978OooO0OO = null;
        this.f56979OooO0Oo = null;
        this.f56981OooO0o0 = null;
        this.f56980OooO0o = z2;
        this.f56982OooO0oO = z3;
        this.f56983OooO0oo = z;
        this.f56975OooO = indicatorAndPanelDataList;
    }
}
