package p519o0o0O0OO;

import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0oo0000.OooO00o;
import p518o0o0O0O0.OooO0OO;
import p522o0o0O0oO.oO00000o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<oO00000o> f52360OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<OooO0OO> f52361OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f52362OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ TempAtVM f52363OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f52364OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, TempAtVM tempAtVM, CoroutineScope coroutineScope) {
        super(0);
        this.f52360OooO0Oo = mutableState;
        this.f52362OooO0o0 = coroutineScope;
        this.f52361OooO0o = mutableState2;
        this.f52363OooO0oO = tempAtVM;
        this.f52364OooO0oo = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("106117");
        oO00000o oo00000oOooO0O0 = o0oO0O0o.OooO0O0(this.f52360OooO0Oo);
        if (oo00000oOooO0O0 != null) {
            CoroutineScope coroutineScope = this.f52362OooO0o0;
            RichEditText richEditText = oo00000oOooO0O0.f53077OooO0Oo;
            if ((richEditText != null ? richEditText.getAtUserCount() : 0) >= 7) {
                o000O00.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(o000000.Mention_a_maximum_of_XXX_people), "7"));
            } else {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new o0O0OOO0(this.f52361OooO0o, this.f52363OooO0oO, this.f52364OooO0oo, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
