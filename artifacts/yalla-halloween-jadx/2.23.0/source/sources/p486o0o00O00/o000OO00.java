package p486o0o00O00;

import androidx.fragment.app.FragmentManager;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p401o0Oo0OO0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48289OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MainSearchActivity mainSearchActivity, FragmentManager supportFragmentManager, ArrayList arrayList) {
        super(supportFragmentManager, arrayList);
        this.f48289OooO = mainSearchActivity;
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
    }

    @Override // p082o000OoOo.OooOO0O
    @NotNull
    public final CharSequence OooO0o0(int i) {
        return this.f48289OooO.f25416OooOo.get(i);
    }
}
