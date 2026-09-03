package p175o00OooOo;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.app.base.view.FacePanelView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f32712Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f32713Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(FacePanelView facePanelView, int i) {
        super(0);
        this.f32712Oooo0o = facePanelView;
        this.f32713Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f32712Oooo0o.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((AppCompatActivity) context), null, null, new o0O0O0Oo(this.f32712Oooo0o, this.f32713Oooo0oO, null), 3, null);
        FacePanelView facePanelView = this.f32712Oooo0o;
        boolean z = this.f32713Oooo0oO == 0;
        facePanelView.isEmojiPanel = z;
        Function1<? super Boolean, Unit> function1 = facePanelView.f11957Oooo0oO;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }
}
