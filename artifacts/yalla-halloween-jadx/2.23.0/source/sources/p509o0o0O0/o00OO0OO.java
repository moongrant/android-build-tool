package p509o0o0O0;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p510o0o0O00.o0O0O00;
import p534o0o0Oo00.OooOOOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<OooOOOO> f50926OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<o0O0O00> f50927OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f50928OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TempAtVM f50929OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f50930OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, TempAtVM tempAtVM, CoroutineScope coroutineScope) {
        super(0);
        this.f50926OooO0Oo = mutableState;
        this.f50928OooO0o0 = coroutineScope;
        this.f50927OooO0o = mutableState2;
        this.f50929OooO0oO = tempAtVM;
        this.f50930OooO0oo = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("106117");
        OooOOOO oooOOOOOooO0O0 = o00O0OOO.OooO0O0(this.f50926OooO0Oo);
        if (oooOOOOOooO0O0 != null) {
            CoroutineScope coroutineScope = this.f50928OooO0o0;
            RichEditText richEditText = oooOOOOOooO0O0.f54852OooO0Oo;
            if ((richEditText != null ? richEditText.getAtUserCount() : 0) >= 7) {
                o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Mention_a_maximum_of_XXX_people), "7"));
            } else {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o00OO0O0(this.f50927OooO0o, this.f50929OooO0oO, this.f50930OooO0oo, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
